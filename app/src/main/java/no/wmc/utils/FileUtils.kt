package no.wmc.utils

import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.OpenableColumns
import android.webkit.MimeTypeMap
import androidx.core.content.FileProvider
import no.wmc.BuildConfig
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

object FileUtils {
    fun fileFromContentUri(context: Context, contentUri: Uri): File {
        val fileExtension = getFileExtension(context, contentUri)
        val fileName = context.getFileName(contentUri) ?: "unavailable.$fileExtension"
        val tempFile = File(context.cacheDir, fileName)
        tempFile.createNewFile()

        try {
            val fos = FileOutputStream(tempFile)
            val inputStream = context.contentResolver.openInputStream(contentUri)
            inputStream?.let {
                copy(it, fos)
            }
            fos.flush()
            fos.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return tempFile
    }

    private fun getFileExtension(context: Context, uri: Uri): String? {
        val fileType: String? = context.contentResolver.getType(uri)
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(fileType)
    }

    @Throws(IOException::class)
    private fun copy(source: InputStream, target: OutputStream) {
        val buf = ByteArray(8192)
        var length: Int
        while (source.read(buf).also { length = it } > 0) {
            target.write(buf, 0, length)
        }
    }

    private fun Context.getFileName(uri: Uri): String? = when (uri.scheme) {
        ContentResolver.SCHEME_CONTENT -> getContentFileName(uri)
        else -> uri.path?.let(::File)?.name
    }

    private fun Context.getContentFileName(uri: Uri): String? = runCatching {
        contentResolver.query(uri, null, null, null, null)
            ?.use { cursor ->
                cursor.moveToFirst()
                return@use cursor.getColumnIndexOrThrow(OpenableColumns.DISPLAY_NAME)
                    .let(cursor::getString)
            }
    }.getOrNull()

    fun writeToFile(
        context: Context,
        title: String,
        extension: String,
        inputStream: InputStream
    ): File {
        val fileExtension = MimeTypeMap.getSingleton().getExtensionFromMimeType(extension)
        if (!fileExtension.isNullOrBlank()) {
            val fileReader = ByteArray(8192)
            val tempFile = File(context.cacheDir, "$title.$fileExtension")
            tempFile.createNewFile()
            try {
                val fos = FileOutputStream(tempFile)
                do {
                    val read = inputStream.read(fileReader)
                    if (read != -1) {
                        fos.write(fileReader, 0, read)
                    }
                } while (read != -1)
                fos.flush()
                fos.close()
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return tempFile
        }
        throw IllegalArgumentException("Unsupported file extension")
    }

    private fun getUriForFile(context: Context, file: File): Uri {
        return FileProvider.getUriForFile(
            context,
            BuildConfig.APPLICATION_ID + ".provider",
            file
        )
    }

    fun openFile(context: Context, file: File) {
        val intent = Intent(Intent.ACTION_VIEW)
        val fileUri = getUriForFile(context, file)
        val fileMIMEType = getMIMETypeFromFile(context, file)
        intent.setDataAndType(fileUri, fileMIMEType)
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        context.startActivity(intent)
    }

    fun getMIMETypeFromFile(context: Context, file: File): String? {
        val fileUri = getUriForFile(context, file)
        return context.contentResolver.getType(fileUri)
    }
}

package no.wmc.data.remote.model

import android.content.ContentResolver
import android.net.Uri
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okio.Buffer
import okio.BufferedSink
import okio.buffer
import okio.source
import java.io.FileNotFoundException

class OpenableUriRequestBody(
    private val contentResolver: ContentResolver,
    private val uri: Uri
) : RequestBody() {

    private val type = contentResolver.getType(uri)?.toMediaTypeOrNull()

    override fun contentType() = type

    override fun writeTo(sink: BufferedSink) {
        if (sink is Buffer) { // Logging interceptor detected, we don't want to spam in logs
            sink.writeUtf8("[File body]")
            return
        }

        contentResolver.openInputStream(uri)?.use {
            sink.writeAll(it.source().buffer())
        } ?: throw FileNotFoundException()
    }
}

package no.wmc.ui.document

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.activity.result.contract.ActivityResultContracts
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import no.wmc.R
import no.wmc.data.remote.SUCCESS
import no.wmc.databinding.FragmentDocumentMetadataBinding
import no.wmc.domain.enums.MIMEEnum
import no.wmc.domain.model.DocumentType
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.document.DocumentMetadataViewAction.EditDocumentViewAction
import no.wmc.ui.document.DocumentMetadataViewAction.GetDocumentTypeViewAction
import no.wmc.ui.document.DocumentMetadataViewAction.UploadDocumentViewAction
import no.wmc.ui.document.DocumentMetadataViewEvent.EditDocumentViewEvent
import no.wmc.ui.document.DocumentMetadataViewEvent.GetDocumentTypeViewEvent
import no.wmc.ui.document.DocumentMetadataViewEvent.UploadDocumentViewEvent
import no.wmc.ui.main.home.HomeFragment
import no.wmc.utils.FileUtils
import timber.log.Timber
import java.io.File

class DocumentMetadataFragment :
    BaseViewStateFragment<FragmentDocumentMetadataBinding, DocumentMetadataViewModel>(
        R.layout.fragment_document_metadata, DocumentMetadataViewModel::class
    ) {
    private val args: DocumentMetadataFragmentArgs by navArgs()

    private val file by lazy {
        args.fileUri?.let {
            FileUtils.fileFromContentUri(
                requireContext(),
                it
            )
        }
    }

    private val documentTypes by lazy { mutableListOf<DocumentType.DocumentTypeItem>() }

    private var selectedDocument: File? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }

        binding.fileNameCard.setOnClickListener {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.addCategory(Intent.CATEGORY_OPENABLE)
            val supportedMIMEType = arrayOf(
                MIMEEnum.PDF.type,
                MIMEEnum.JPEG.type,
                MIMEEnum.PNG.type,
                MIMEEnum.DOC.type,
                MIMEEnum.DOCX.type
            )
            intent.type = "*/*"
            intent.putExtra(Intent.EXTRA_MIME_TYPES, supportedMIMEType)
            documentFilePicker.launch(intent)
        }

        file?.let { selectedFile ->
            binding.toolbar.title = getString(R.string.add_document_title)
            binding.fileName.text = selectedFile.name

            binding.uploadFileButton.text = getString(R.string.add_document_upload_button)
            binding.uploadFileButton.setOnClickListener {
                uploadDocument(
                    category= documentTypes[binding.documentSpinner.selectedItemPosition].category,
                    title = binding.title.editText?.text.toString(),
                    description = binding.description.editText?.text.toString(),
                    typeId = getSelectedDocumentType(),
                    document = selectedFile
                )
            }
        } ?: run {
            binding.toolbar.title = getString(R.string.edit_document_title)
            binding.fileName.text = args.document?.name
            binding.title.editText?.setText(args.document?.title)
            binding.description.editText?.setText(args.document?.description)

            binding.uploadFileButton.text = getString(R.string.add_document_edit_button)
            binding.uploadFileButton.setOnClickListener {
                    editDocument(
                        fileId = args.document?.id.toString(),
                        title = binding.title.editText?.text.toString(),
                        description = binding.description.editText?.text.toString(),
                        typeId = getSelectedDocumentType(),
                        document = selectedDocument
                    )
            }
        }

        getDocumentType()
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is GetDocumentTypeViewAction -> handleGetDocumentTypeAction(viewAction.viewState)
            is UploadDocumentViewAction -> handleUploadDocumentAction(viewAction.viewState)
            is EditDocumentViewAction -> handleEditDocumentViewAction(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleGetDocumentTypeAction(viewState: ViewState<DocumentType>) {
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.Success -> {
                viewState.data?.items?.let {
                    documentTypes.clear()
                    documentTypes.addAll(it)
                    it.map { documentType -> documentType.category }.also {
                        ArrayAdapter(
                            requireContext(),
                            android.R.layout.simple_spinner_item,
                            it
                        ).also { adapter ->
                            adapter.setDropDownViewResource(
                                android.R.layout.simple_spinner_dropdown_item
                            )
                            binding.documentSpinner.adapter = adapter
                        }
                    }
                    if (args.document != null) {
                        binding.documentSpinner.setSelection(
                            it.indexOfFirst {
                                it.category == args.document?.category
                            }
                        )
                    }
                }
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleUploadDocumentAction(viewState: ViewState<Unit>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.Success -> {
                val savedStateHandle = findNavController().previousBackStackEntry?.savedStateHandle
                savedStateHandle?.set(HomeFragment.ADD_NEW_DOCUMENT_RESULT, SUCCESS)
                findNavController().navigateUp()
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleEditDocumentViewAction(viewState: ViewState<Unit>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.Success -> {
                val savedStateHandle = findNavController().previousBackStackEntry?.savedStateHandle
                savedStateHandle?.set(HomeFragment.EDIT_DOCUMENT_ACTION_RESULT, SUCCESS)
                findNavController().navigateUp()
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun getDocumentType() {
        sendViewEvent(GetDocumentTypeViewEvent)
    }

    private fun uploadDocument(
        category:String,
        title: String,
        description: String,
        typeId: Int,
        document: File
    ) {
        sendViewEvent(UploadDocumentViewEvent(category,title, description, typeId, document))
    }

    private fun editDocument(
        fileId: String,
        title: String,
        description: String,
        typeId: Int,
        document: File?
    ) {
        sendViewEvent(EditDocumentViewEvent(fileId, title, description, typeId, document))
    }

    private fun getSelectedDocumentType(): Int {
        val position = binding.documentSpinner.selectedItemPosition
        return documentTypes[position].id
    }

    override fun onDestroy() {
        super.onDestroy()
        file?.delete()
    }

    private val documentFilePicker =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            result.data?.let {
                val file = FileUtils.fileFromContentUri(requireContext(), it.data as Uri)
                binding.fileName.text = file.name
                selectedDocument = file
            }
        }
}

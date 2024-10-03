package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0019\u001a\u001bBO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fB\u0015\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\rJ!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u00c7\u0001R$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lno/wmc/data/remote/model/DocumentListDtoModel;", "Lno/wmc/data/remote/model/BasePagingDtoModel;", "seen1", "", "page", "take", "total", "documents", "", "Lno/wmc/data/remote/model/DocumentListDtoModel$DocumentDtoModel;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getDocuments$annotations", "()V", "getDocuments", "()Ljava/util/List;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "DocumentDtoModel", "wmc-3.1.40-b11_devDebug"})
@kotlinx.serialization.Serializable
public final class DocumentListDtoModel extends no.wmc.data.remote.model.BasePagingDtoModel {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.remote.model.DocumentListDtoModel.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel> documents = null;
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.model.DocumentListDtoModel self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public DocumentListDtoModel(@org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel> documents) {
        super(0, null, null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel> getDocuments() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "items")
    @java.lang.Deprecated
    public static void getDocuments$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002*+Bk\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fB?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0010J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u00c7\u0001R\u001c\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\u00a8\u0006,"}, d2 = {"Lno/wmc/data/remote/model/DocumentListDtoModel$DocumentDtoModel;", "", "seen1", "", "id", "name", "", "title", "extension", "description", "category", "dateCreated", "Lkotlinx/datetime/Instant;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;)V", "getCategory$annotations", "()V", "getCategory", "()Ljava/lang/String;", "getDateCreated$annotations", "getDateCreated", "()Lkotlinx/datetime/Instant;", "getDescription$annotations", "getDescription", "getExtension$annotations", "getExtension", "getId$annotations", "getId", "()I", "getName$annotations", "getName", "getTitle$annotations", "getTitle", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static final class DocumentDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel.Companion Companion = null;
        private final int id = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String extension = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String category = null;
        @org.jetbrains.annotations.NotNull
        private final kotlinx.datetime.Instant dateCreated = null;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public DocumentDtoModel(int id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String extension, @org.jetbrains.annotations.Nullable
        java.lang.String description, @org.jetbrains.annotations.NotNull
        java.lang.String category, @org.jetbrains.annotations.NotNull
        kotlinx.datetime.Instant dateCreated) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "fileId")
        @java.lang.Deprecated
        public static void getId$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "fileName")
        @java.lang.Deprecated
        public static void getName$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "fileTitle")
        @java.lang.Deprecated
        public static void getTitle$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getExtension() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "fileExtension")
        @java.lang.Deprecated
        public static void getExtension$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDescription() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "fileDescription")
        @java.lang.Deprecated
        public static void getDescription$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCategory() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "fileCatagory")
        @java.lang.Deprecated
        public static void getCategory$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.datetime.Instant getDateCreated() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "dateCreated")
        @java.lang.Deprecated
        public static void getDateCreated$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/DocumentListDtoModel$DocumentDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/DocumentListDtoModel$DocumentDtoModel;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/DocumentListDtoModel.DocumentDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/DocumentListDtoModel$DocumentDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel deserialize(@org.jetbrains.annotations.NotNull
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override
            public void serialize(@org.jetbrains.annotations.NotNull
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
            no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/DocumentListDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/DocumentListDtoModel;", "wmc-3.1.40-b11_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.DocumentListDtoModel> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/DocumentListDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/DocumentListDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.DocumentListDtoModel> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.DocumentListDtoModel.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public no.wmc.data.remote.model.DocumentListDtoModel deserialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override
        public void serialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.DocumentListDtoModel value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
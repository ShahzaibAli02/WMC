package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0005\u001d\u001e\u001f !B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\fJ!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u00c7\u0001R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel;", "", "seen1", "", "validationResult", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel;", "errorCode", "", "message", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode$annotations", "()V", "getErrorCode", "()Ljava/lang/String;", "getMessage$annotations", "getMessage", "getValidationResult$annotations", "getValidationResult", "()Lno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "ValidationErrorDtoModel", "ValidationResultDtoModel", "ValidationStateDtoModel", "wmc-3.1.40-b11_prodRelease"})
@kotlinx.serialization.Serializable
public final class ValidationDtoModel {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.remote.model.ValidationDtoModel.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel validationResult = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String errorCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.model.ValidationDtoModel self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public ValidationDtoModel(@org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel validationResult, @org.jetbrains.annotations.NotNull
    java.lang.String errorCode, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel getValidationResult() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "validationResult")
    @java.lang.Deprecated
    public static void getValidationResult$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorCode() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "errorCode")
    @java.lang.Deprecated
    public static void getErrorCode$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "message")
    @java.lang.Deprecated
    public static void getMessage$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002$%Ba\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rBA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u00c7\u0001R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\u00a8\u0006&"}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel;", "", "seen1", "", "firstName", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;", "lastName", "phone", "birthDate", "gender", "nationality", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;)V", "getBirthDate$annotations", "()V", "getBirthDate", "()Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;", "getFirstName$annotations", "getFirstName", "getGender$annotations", "getGender", "getLastName$annotations", "getLastName", "getNationality$annotations", "getNationality", "getPhone$annotations", "getPhone", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_prodRelease"})
    @kotlinx.serialization.Serializable
    public static final class ValidationResultDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel firstName = null;
        @org.jetbrains.annotations.Nullable
        private final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel lastName = null;
        @org.jetbrains.annotations.Nullable
        private final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel phone = null;
        @org.jetbrains.annotations.Nullable
        private final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel birthDate = null;
        @org.jetbrains.annotations.Nullable
        private final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel gender = null;
        @org.jetbrains.annotations.Nullable
        private final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel nationality = null;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public ValidationResultDtoModel(@org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel firstName, @org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel lastName, @org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel phone, @org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel birthDate, @org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel gender, @org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel nationality) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel getFirstName() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "firstName")
        @java.lang.Deprecated
        public static void getFirstName$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel getLastName() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "lastName")
        @java.lang.Deprecated
        public static void getLastName$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel getPhone() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "phone")
        @java.lang.Deprecated
        public static void getPhone$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel getBirthDate() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "birthDate")
        @java.lang.Deprecated
        public static void getBirthDate$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel getGender() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "gender")
        @java.lang.Deprecated
        public static void getGender$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel getNationality() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "nationality")
        @java.lang.Deprecated
        public static void getNationality$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel;", "wmc-3.1.40-b11_prodRelease"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ValidationDtoModel.ValidationResultDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationResultDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_prodRelease"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ValidationDtoModel.ValidationResultDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u00c7\u0001R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\t\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006!"}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;", "", "seen1", "", "errors", "", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationErrorDtoModel;", "validationState", "", "isContainerNode", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Z)V", "getErrors$annotations", "()V", "getErrors", "()Ljava/util/List;", "isContainerNode$annotations", "()Z", "getValidationState$annotations", "getValidationState", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_prodRelease"})
    @kotlinx.serialization.Serializable
    public static final class ValidationStateDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel> errors = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String validationState = null;
        private final boolean isContainerNode = false;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public ValidationStateDtoModel(@org.jetbrains.annotations.NotNull
        java.util.List<no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel> errors, @org.jetbrains.annotations.NotNull
        java.lang.String validationState, boolean isContainerNode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel> getErrors() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "errors")
        @java.lang.Deprecated
        public static void getErrors$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValidationState() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "validationState")
        @java.lang.Deprecated
        public static void getValidationState$annotations() {
        }
        
        public final boolean isContainerNode() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "isContainerNode")
        @java.lang.Deprecated
        public static void isContainerNode$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;", "wmc-3.1.40-b11_prodRelease"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ValidationDtoModel.ValidationStateDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationStateDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_prodRelease"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ValidationDtoModel.ValidationStateDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u00c7\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel$ValidationErrorDtoModel;", "", "seen1", "", "errorMessage", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getErrorMessage$annotations", "()V", "getErrorMessage", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_prodRelease"})
    @kotlinx.serialization.Serializable
    public static final class ValidationErrorDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String errorMessage = null;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public ValidationErrorDtoModel(@org.jetbrains.annotations.NotNull
        java.lang.String errorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "errorMessage")
        @java.lang.Deprecated
        public static void getErrorMessage$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel$ValidationErrorDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationErrorDtoModel;", "wmc-3.1.40-b11_prodRelease"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ValidationDtoModel.ValidationErrorDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel$ValidationErrorDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_prodRelease"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ValidationDtoModel.ValidationErrorDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ValidationDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel;", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ValidationDtoModel> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ValidationDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ValidationDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_prodRelease"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ValidationDtoModel> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ValidationDtoModel.$serializer INSTANCE = null;
        
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
        public no.wmc.data.remote.model.ValidationDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
        no.wmc.data.remote.model.ValidationDtoModel value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
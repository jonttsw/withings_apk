package com.withings.programs.model.remote.enrolled;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: EnrolledDto.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%B5\b\u0011\u0012\u0006\u0010&\u001a\u00020\u0019\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\rR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006,"}, d2 = {"Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/remote/enrolled/EnrolledDto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;", "component1", "()Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;", "", "Lcom/withings/programs/model/remote/enrolled/IterationDto;", "component2", "()Ljava/util/List;", "enrolledDetailDto", "iterationDtoList", "copy", "(Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;Ljava/util/List;)Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;", "getEnrolledDetailDto", "Ljava/util/List;", "getIterationDtoList", "<init>", "(Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class EnrolledDto {
    private final EnrolledDetailDto enrolledDetailDto;
    private final List<IterationDto> iterationDtoList;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IterationDto$$serializer.INSTANCE)};

    /* compiled from: EnrolledDto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/remote/enrolled/EnrolledDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EnrolledDto> serializer() {
            return EnrolledDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EnrolledDto(int i11, EnrolledDetailDto enrolledDetailDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, EnrolledDto$$serializer.INSTANCE.getDescriptor());
        }
        this.enrolledDetailDto = enrolledDetailDto;
        this.iterationDtoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrolledDto copy$default(EnrolledDto enrolledDto, EnrolledDetailDto enrolledDetailDto, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enrolledDetailDto = enrolledDto.enrolledDetailDto;
        }
        if ((i11 & 2) != 0) {
            list = enrolledDto.iterationDtoList;
        }
        return enrolledDto.copy(enrolledDetailDto, list);
    }

    public static final /* synthetic */ void write$Self$android_release(EnrolledDto enrolledDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, EnrolledDetailDto$$serializer.INSTANCE, enrolledDto.enrolledDetailDto);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], enrolledDto.iterationDtoList);
    }

    public final EnrolledDetailDto component1() {
        return this.enrolledDetailDto;
    }

    public final List<IterationDto> component2() {
        return this.iterationDtoList;
    }

    public final EnrolledDto copy(EnrolledDetailDto enrolledDetailDto, List<IterationDto> list) {
        return new EnrolledDto(enrolledDetailDto, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledDto)) {
            return false;
        }
        EnrolledDto enrolledDto = (EnrolledDto) obj;
        if (u.e(this.enrolledDetailDto, enrolledDto.enrolledDetailDto) && u.e(this.iterationDtoList, enrolledDto.iterationDtoList)) {
            return true;
        }
        return false;
    }

    public final EnrolledDetailDto getEnrolledDetailDto() {
        return this.enrolledDetailDto;
    }

    public final List<IterationDto> getIterationDtoList() {
        return this.iterationDtoList;
    }

    public int hashCode() {
        int hashCode;
        EnrolledDetailDto enrolledDetailDto = this.enrolledDetailDto;
        int i11 = 0;
        if (enrolledDetailDto == null) {
            hashCode = 0;
        } else {
            hashCode = enrolledDetailDto.hashCode();
        }
        int i12 = hashCode * 31;
        List<IterationDto> list = this.iterationDtoList;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        EnrolledDetailDto enrolledDetailDto = this.enrolledDetailDto;
        List<IterationDto> list = this.iterationDtoList;
        return "EnrolledDto(enrolledDetailDto=" + enrolledDetailDto + ", iterationDtoList=" + list + ")";
    }

    public EnrolledDto(EnrolledDetailDto enrolledDetailDto, List<IterationDto> list) {
        this.enrolledDetailDto = enrolledDetailDto;
        this.iterationDtoList = list;
    }
}

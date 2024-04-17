package com.withings.programs.model.remote.enrolled;

import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: EnrolledDetailDto.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"B+\b\u0011\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006)"}, d2 = {"Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()I", "", "component2", "()J", NavigationArguments.PROGRAM_ID, "modified", "copy", "(IJ)Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getProgramId", "J", "getModified", "<init>", "(IJ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class EnrolledDetailDto {
    public static final Companion Companion = new Companion(null);
    @SerializedName("modified")
    private final long modified;
    @SerializedName("programid")
    private final int programId;

    /* compiled from: EnrolledDetailDto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/remote/enrolled/EnrolledDetailDto;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EnrolledDetailDto> serializer() {
            return EnrolledDetailDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EnrolledDetailDto(int i11, int i12, long j5, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, EnrolledDetailDto$$serializer.INSTANCE.getDescriptor());
        }
        this.programId = i12;
        this.modified = j5;
    }

    public static /* synthetic */ EnrolledDetailDto copy$default(EnrolledDetailDto enrolledDetailDto, int i11, long j5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = enrolledDetailDto.programId;
        }
        if ((i12 & 2) != 0) {
            j5 = enrolledDetailDto.modified;
        }
        return enrolledDetailDto.copy(i11, j5);
    }

    public static final /* synthetic */ void write$Self$android_release(EnrolledDetailDto enrolledDetailDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, enrolledDetailDto.programId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, enrolledDetailDto.modified);
    }

    public final int component1() {
        return this.programId;
    }

    public final long component2() {
        return this.modified;
    }

    public final EnrolledDetailDto copy(int i11, long j5) {
        return new EnrolledDetailDto(i11, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledDetailDto)) {
            return false;
        }
        EnrolledDetailDto enrolledDetailDto = (EnrolledDetailDto) obj;
        if (this.programId == enrolledDetailDto.programId && this.modified == enrolledDetailDto.modified) {
            return true;
        }
        return false;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public int hashCode() {
        return Long.hashCode(this.modified) + (Integer.hashCode(this.programId) * 31);
    }

    public String toString() {
        int i11 = this.programId;
        long j5 = this.modified;
        return "EnrolledDetailDto(programId=" + i11 + ", modified=" + j5 + ")";
    }

    public EnrolledDetailDto(int i11, long j5) {
        this.programId = i11;
        this.modified = j5;
    }
}

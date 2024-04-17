package com.withings.programs.model.webservice.enrolledProgram;

import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsEnrolledPrograms.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B1\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b.\u0010/BG\b\u0011\u0012\u0006\u00100\u001a\u00020\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010\u0017¨\u00066"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;", "component1", "()Ljava/util/List;", "", "component2", "()Z", "", "component3", "()Ljava/lang/Integer;", "", "component4", "()Ljava/lang/Long;", "programs", GetHealthAttributeResponse.FIELD_HAS_MORE_NAME, GetHealthAttributeResponse.FIELD_OFFSET_NAME, "modifiedInSeconds", "copy", "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/Long;)Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPrograms", "Z", "getMore", "Ljava/lang/Integer;", "getOffset", "Ljava/lang/Long;", "getModifiedInSeconds", "<init>", "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/Integer;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsEnrolledPrograms {
    @SerializedName("modified")
    private final Long modifiedInSeconds;
    @SerializedName(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME)
    private final boolean more;
    @SerializedName(GetHealthAttributeResponse.FIELD_OFFSET_NAME)
    private final Integer offset;
    @SerializedName("programs")
    private final List<WsEnrolledProgram> programs;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WsEnrolledProgram$$serializer.INSTANCE), null, null, null};

    /* compiled from: WsEnrolledPrograms.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsEnrolledPrograms> serializer() {
            return WsEnrolledPrograms$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsEnrolledPrograms(int i11, List list, boolean z5, Integer num, Long l5, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i11 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 15, WsEnrolledPrograms$$serializer.INSTANCE.getDescriptor());
        }
        this.programs = list;
        this.more = z5;
        this.offset = num;
        this.modifiedInSeconds = l5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsEnrolledPrograms copy$default(WsEnrolledPrograms wsEnrolledPrograms, List list, boolean z5, Integer num, Long l5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wsEnrolledPrograms.programs;
        }
        if ((i11 & 2) != 0) {
            z5 = wsEnrolledPrograms.more;
        }
        if ((i11 & 4) != 0) {
            num = wsEnrolledPrograms.offset;
        }
        if ((i11 & 8) != 0) {
            l5 = wsEnrolledPrograms.modifiedInSeconds;
        }
        return wsEnrolledPrograms.copy(list, z5, num, l5);
    }

    public static final /* synthetic */ void write$Self$android_release(WsEnrolledPrograms wsEnrolledPrograms, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], wsEnrolledPrograms.programs);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, wsEnrolledPrograms.more);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, wsEnrolledPrograms.offset);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, wsEnrolledPrograms.modifiedInSeconds);
    }

    public final List<WsEnrolledProgram> component1() {
        return this.programs;
    }

    public final boolean component2() {
        return this.more;
    }

    public final Integer component3() {
        return this.offset;
    }

    public final Long component4() {
        return this.modifiedInSeconds;
    }

    public final WsEnrolledPrograms copy(List<WsEnrolledProgram> programs, boolean z5, Integer num, Long l5) {
        u.j(programs, "programs");
        return new WsEnrolledPrograms(programs, z5, num, l5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsEnrolledPrograms)) {
            return false;
        }
        WsEnrolledPrograms wsEnrolledPrograms = (WsEnrolledPrograms) obj;
        if (u.e(this.programs, wsEnrolledPrograms.programs) && this.more == wsEnrolledPrograms.more && u.e(this.offset, wsEnrolledPrograms.offset) && u.e(this.modifiedInSeconds, wsEnrolledPrograms.modifiedInSeconds)) {
            return true;
        }
        return false;
    }

    public final Long getModifiedInSeconds() {
        return this.modifiedInSeconds;
    }

    public final boolean getMore() {
        return this.more;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final List<WsEnrolledProgram> getPrograms() {
        return this.programs;
    }

    public int hashCode() {
        int hashCode;
        int a11 = y1.a(this.more, this.programs.hashCode() * 31, 31);
        Integer num = this.offset;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        Long l5 = this.modifiedInSeconds;
        if (l5 != null) {
            i11 = l5.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        List<WsEnrolledProgram> list = this.programs;
        boolean z5 = this.more;
        Integer num = this.offset;
        Long l5 = this.modifiedInSeconds;
        return "WsEnrolledPrograms(programs=" + list + ", more=" + z5 + ", offset=" + num + ", modifiedInSeconds=" + l5 + ")";
    }

    public WsEnrolledPrograms(List<WsEnrolledProgram> programs, boolean z5, Integer num, Long l5) {
        u.j(programs, "programs");
        this.programs = programs;
        this.more = z5;
        this.offset = num;
        this.modifiedInSeconds = l5;
    }
}

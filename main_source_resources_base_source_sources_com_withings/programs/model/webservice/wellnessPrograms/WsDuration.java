package com.withings.programs.model.webservice.wellnessPrograms;

import android.support.v4.media.session.c;
import androidx.camera.core.v;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
/* compiled from: WsDuration.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b \u0010!B+\b\u0011\u0012\u0006\u0010\"\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001f\u0010\r¨\u0006("}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsDuration;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/wellnessPrograms/WsDuration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()J", "component2", ValidateElement.RangeValidateElement.METHOD, "value", "copy", "(JJ)Lcom/withings/programs/model/webservice/wellnessPrograms/WsDuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRange", "getValue", "<init>", "(JJ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsDuration {
    public static final Companion Companion = new Companion(null);
    @SerializedName(ValidateElement.RangeValidateElement.METHOD)
    private final long range;
    @SerializedName("value")
    private final long value;

    /* compiled from: WsDuration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsDuration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsDuration;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsDuration> serializer() {
            return WsDuration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsDuration(int i11, long j5, long j11, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, WsDuration$$serializer.INSTANCE.getDescriptor());
        }
        this.range = j5;
        this.value = j11;
    }

    public static /* synthetic */ WsDuration copy$default(WsDuration wsDuration, long j5, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = wsDuration.range;
        }
        if ((i11 & 2) != 0) {
            j11 = wsDuration.value;
        }
        return wsDuration.copy(j5, j11);
    }

    public static final /* synthetic */ void write$Self$android_release(WsDuration wsDuration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, wsDuration.range);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, wsDuration.value);
    }

    public final long component1() {
        return this.range;
    }

    public final long component2() {
        return this.value;
    }

    public final WsDuration copy(long j5, long j11) {
        return new WsDuration(j5, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDuration)) {
            return false;
        }
        WsDuration wsDuration = (WsDuration) obj;
        if (this.range == wsDuration.range && this.value == wsDuration.value) {
            return true;
        }
        return false;
    }

    public final long getRange() {
        return this.range;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value) + (Long.hashCode(this.range) * 31);
    }

    public String toString() {
        long j5 = this.range;
        return c.c(v.e("WsDuration(range=", j5, ", value="), this.value, ")");
    }

    public WsDuration(long j5, long j11) {
        this.range = j5;
        this.value = j11;
    }
}

package com.withings.programs.model.webservice.wellnessPrograms;

import androidx.activity.result.c;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsDevice.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'B5\b\u0011\u0012\u0006\u0010(\u001a\u00020\u001a\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006."}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsDevice;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/wellnessPrograms/WsDevice;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "component2", "()J", "", "component3", "()Z", HealthUserProfile.USER_PROFILE_KEY_IMAGE, WsVasistasSerie.KEY_MODEL, "required", "copy", "(Ljava/lang/String;JZ)Lcom/withings/programs/model/webservice/wellnessPrograms/WsDevice;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "J", "getModel", "Z", "getRequired", "<init>", "(Ljava/lang/String;JZ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsDevice {
    public static final Companion Companion = new Companion(null);
    @SerializedName(HealthUserProfile.USER_PROFILE_KEY_IMAGE)
    private final String image;
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private final long model;
    @SerializedName("required")
    private final boolean required;

    /* compiled from: WsDevice.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsDevice$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsDevice;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsDevice> serializer() {
            return WsDevice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsDevice(int i11, String str, long j5, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, WsDevice$$serializer.INSTANCE.getDescriptor());
        }
        this.image = str;
        this.model = j5;
        this.required = z5;
    }

    public static /* synthetic */ WsDevice copy$default(WsDevice wsDevice, String str, long j5, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsDevice.image;
        }
        if ((i11 & 2) != 0) {
            j5 = wsDevice.model;
        }
        if ((i11 & 4) != 0) {
            z5 = wsDevice.required;
        }
        return wsDevice.copy(str, j5, z5);
    }

    public static final /* synthetic */ void write$Self$android_release(WsDevice wsDevice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsDevice.image);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, wsDevice.model);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, wsDevice.required);
    }

    public final String component1() {
        return this.image;
    }

    public final long component2() {
        return this.model;
    }

    public final boolean component3() {
        return this.required;
    }

    public final WsDevice copy(String image, long j5, boolean z5) {
        u.j(image, "image");
        return new WsDevice(image, j5, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDevice)) {
            return false;
        }
        WsDevice wsDevice = (WsDevice) obj;
        if (u.e(this.image, wsDevice.image) && this.model == wsDevice.model && this.required == wsDevice.required) {
            return true;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public final long getModel() {
        return this.model;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return Boolean.hashCode(this.required) + c.a(this.model, this.image.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.image;
        long j5 = this.model;
        boolean z5 = this.required;
        return "WsDevice(image=" + str + ", model=" + j5 + ", required=" + z5 + ")";
    }

    public WsDevice(String image, long j5, boolean z5) {
        u.j(image, "image");
        this.image = image;
        this.model = j5;
        this.required = z5;
    }
}

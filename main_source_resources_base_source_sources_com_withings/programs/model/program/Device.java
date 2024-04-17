package com.withings.programs.model.program;

import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
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
/* compiled from: Device.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%B5\b\u0011\u0012\u0006\u0010&\u001a\u00020\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006,"}, d2 = {"Lcom/withings/programs/model/program/Device;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/program/Device;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "", "component3", "()Z", HealthUserProfile.USER_PROFILE_KEY_IMAGE, WsVasistasSerie.KEY_MODEL, "required", "copy", "(Ljava/lang/String;IZ)Lcom/withings/programs/model/program/Device;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "I", "getModel", "Z", "getRequired", "<init>", "(Ljava/lang/String;IZ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class Device {
    public static final Companion Companion = new Companion(null);
    @SerializedName(HealthUserProfile.USER_PROFILE_KEY_IMAGE)
    private final String image;
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private final int model;
    @SerializedName("required")
    private final boolean required;

    /* compiled from: Device.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/program/Device$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/program/Device;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<Device> serializer() {
            return Device$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Device(int i11, String str, int i12, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, Device$$serializer.INSTANCE.getDescriptor());
        }
        this.image = str;
        this.model = i12;
        this.required = z5;
    }

    public static /* synthetic */ Device copy$default(Device device, String str, int i11, boolean z5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = device.image;
        }
        if ((i12 & 2) != 0) {
            i11 = device.model;
        }
        if ((i12 & 4) != 0) {
            z5 = device.required;
        }
        return device.copy(str, i11, z5);
    }

    public static final /* synthetic */ void write$Self$android_release(Device device, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, device.image);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, device.model);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, device.required);
    }

    public final String component1() {
        return this.image;
    }

    public final int component2() {
        return this.model;
    }

    public final boolean component3() {
        return this.required;
    }

    public final Device copy(String image, int i11, boolean z5) {
        u.j(image, "image");
        return new Device(image, i11, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        if (u.e(this.image, device.image) && this.model == device.model && this.required == device.required) {
            return true;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getModel() {
        return this.model;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return Boolean.hashCode(this.required) + h.a(this.model, this.image.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.image;
        int i11 = this.model;
        return h.d(g.b("Device(image=", str, ", model=", i11, ", required="), this.required, ")");
    }

    public Device(String image, int i11, boolean z5) {
        u.j(image, "image");
        this.image = image;
        this.model = i11;
        this.required = z5;
    }
}

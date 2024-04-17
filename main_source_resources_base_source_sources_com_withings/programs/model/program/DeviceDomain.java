package com.withings.programs.model.program;

import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DeviceDomain.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/withings/programs/model/program/DeviceDomain;", "", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "", WsVasistasSerie.KEY_MODEL, "", "required", "", "(Ljava/lang/String;IZ)V", "getImage", "()Ljava/lang/String;", "getModel", "()I", "getRequired", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceDomain {
    private final String image;
    private final int model;
    private final boolean required;

    public DeviceDomain(String image, int i11, boolean z5) {
        u.j(image, "image");
        this.image = image;
        this.model = i11;
        this.required = z5;
    }

    public static /* synthetic */ DeviceDomain copy$default(DeviceDomain deviceDomain, String str, int i11, boolean z5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deviceDomain.image;
        }
        if ((i12 & 2) != 0) {
            i11 = deviceDomain.model;
        }
        if ((i12 & 4) != 0) {
            z5 = deviceDomain.required;
        }
        return deviceDomain.copy(str, i11, z5);
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

    public final DeviceDomain copy(String image, int i11, boolean z5) {
        u.j(image, "image");
        return new DeviceDomain(image, i11, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceDomain)) {
            return false;
        }
        DeviceDomain deviceDomain = (DeviceDomain) obj;
        if (u.e(this.image, deviceDomain.image) && this.model == deviceDomain.model && this.required == deviceDomain.required) {
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
        return h.d(g.b("DeviceDomain(image=", str, ", model=", i11, ", required="), this.required, ")");
    }
}

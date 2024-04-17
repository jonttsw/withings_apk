package com.withings.ecg.webservices;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/ecg/webservices/WsStateCode;", "", "name", "", "iso2", "isPhoneRequired", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getIso2", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WsStateCode {
    public static final int $stable = 0;
    @SerializedName("phone_number")
    private final boolean isPhoneRequired;
    private final String iso2;
    @SerializedName("state")
    private final String name;

    public WsStateCode(String name, String iso2, boolean z5) {
        u.j(name, "name");
        u.j(iso2, "iso2");
        this.name = name;
        this.iso2 = iso2;
        this.isPhoneRequired = z5;
    }

    public static /* synthetic */ WsStateCode copy$default(WsStateCode wsStateCode, String str, String str2, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsStateCode.name;
        }
        if ((i11 & 2) != 0) {
            str2 = wsStateCode.iso2;
        }
        if ((i11 & 4) != 0) {
            z5 = wsStateCode.isPhoneRequired;
        }
        return wsStateCode.copy(str, str2, z5);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.iso2;
    }

    public final boolean component3() {
        return this.isPhoneRequired;
    }

    public final WsStateCode copy(String name, String iso2, boolean z5) {
        u.j(name, "name");
        u.j(iso2, "iso2");
        return new WsStateCode(name, iso2, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsStateCode)) {
            return false;
        }
        WsStateCode wsStateCode = (WsStateCode) obj;
        if (u.e(this.name, wsStateCode.name) && u.e(this.iso2, wsStateCode.iso2) && this.isPhoneRequired == wsStateCode.isPhoneRequired) {
            return true;
        }
        return false;
    }

    public final String getIso2() {
        return this.iso2;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPhoneRequired) + d.c(this.iso2, this.name.hashCode() * 31, 31);
    }

    public final boolean isPhoneRequired() {
        return this.isPhoneRequired;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.iso2;
        return h.d(l0.b("WsStateCode(name=", str, ", iso2=", str2, ", isPhoneRequired="), this.isPhoneRequired, ")");
    }

    public /* synthetic */ WsStateCode(String str, String str2, boolean z5, int i11, m mVar) {
        this(str, str2, (i11 & 4) != 0 ? false : z5);
    }
}

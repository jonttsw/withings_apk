package com.withings.library.authentication.api;

import androidx.appcompat.widget.v0;
import androidx.camera.camera2.internal.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: VirtualDeviceInformation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/withings/library/authentication/api/VirtualDeviceInformation;", "", "modelName", "", "typeName", "os", "appVersion", "appName", "osVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getAppVersion", "getModelName", "getOs", "getOsVersion", "getTypeName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VirtualDeviceInformation {
    private final String appName;
    private final String appVersion;
    private final String modelName;

    /* renamed from: os  reason: collision with root package name */
    private final String f40626os;
    private final String osVersion;
    private final String typeName;

    public VirtualDeviceInformation(String modelName, String typeName, String os2, String appVersion, String appName, String osVersion) {
        u.j(modelName, "modelName");
        u.j(typeName, "typeName");
        u.j(os2, "os");
        u.j(appVersion, "appVersion");
        u.j(appName, "appName");
        u.j(osVersion, "osVersion");
        this.modelName = modelName;
        this.typeName = typeName;
        this.f40626os = os2;
        this.appVersion = appVersion;
        this.appName = appName;
        this.osVersion = osVersion;
    }

    public static /* synthetic */ VirtualDeviceInformation copy$default(VirtualDeviceInformation virtualDeviceInformation, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = virtualDeviceInformation.modelName;
        }
        if ((i11 & 2) != 0) {
            str2 = virtualDeviceInformation.typeName;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = virtualDeviceInformation.f40626os;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            str4 = virtualDeviceInformation.appVersion;
        }
        String str9 = str4;
        if ((i11 & 16) != 0) {
            str5 = virtualDeviceInformation.appName;
        }
        String str10 = str5;
        if ((i11 & 32) != 0) {
            str6 = virtualDeviceInformation.osVersion;
        }
        return virtualDeviceInformation.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.modelName;
    }

    public final String component2() {
        return this.typeName;
    }

    public final String component3() {
        return this.f40626os;
    }

    public final String component4() {
        return this.appVersion;
    }

    public final String component5() {
        return this.appName;
    }

    public final String component6() {
        return this.osVersion;
    }

    public final VirtualDeviceInformation copy(String modelName, String typeName, String os2, String appVersion, String appName, String osVersion) {
        u.j(modelName, "modelName");
        u.j(typeName, "typeName");
        u.j(os2, "os");
        u.j(appVersion, "appVersion");
        u.j(appName, "appName");
        u.j(osVersion, "osVersion");
        return new VirtualDeviceInformation(modelName, typeName, os2, appVersion, appName, osVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualDeviceInformation)) {
            return false;
        }
        VirtualDeviceInformation virtualDeviceInformation = (VirtualDeviceInformation) obj;
        if (u.e(this.modelName, virtualDeviceInformation.modelName) && u.e(this.typeName, virtualDeviceInformation.typeName) && u.e(this.f40626os, virtualDeviceInformation.f40626os) && u.e(this.appVersion, virtualDeviceInformation.appVersion) && u.e(this.appName, virtualDeviceInformation.appName) && u.e(this.osVersion, virtualDeviceInformation.osVersion)) {
            return true;
        }
        return false;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final String getOs() {
        return this.f40626os;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return this.osVersion.hashCode() + d.c(this.appName, d.c(this.appVersion, d.c(this.f40626os, d.c(this.typeName, this.modelName.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.modelName;
        String str2 = this.typeName;
        String str3 = this.f40626os;
        String str4 = this.appVersion;
        String str5 = this.appName;
        String str6 = this.osVersion;
        StringBuilder b10 = l0.b("VirtualDeviceInformation(modelName=", str, ", typeName=", str2, ", os=");
        b.d(b10, str3, ", appVersion=", str4, ", appName=");
        return v0.d(b10, str5, ", osVersion=", str6, ")");
    }
}

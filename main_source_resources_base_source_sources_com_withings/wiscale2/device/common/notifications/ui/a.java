package com.withings.wiscale2.device.common.notifications.ui;

import android.graphics.drawable.Drawable;
import androidx.camera.core.y1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f52826a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52827b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52828c;

    public a(Drawable icon, String packageName, String appName) {
        kotlin.jvm.internal.u.j(icon, "icon");
        kotlin.jvm.internal.u.j(packageName, "packageName");
        kotlin.jvm.internal.u.j(appName, "appName");
        this.f52826a = icon;
        this.f52827b = packageName;
        this.f52828c = appName;
    }

    public final String a() {
        return this.f52828c;
    }

    public final Drawable b() {
        return this.f52826a;
    }

    public final String c() {
        return this.f52827b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.u.e(this.f52826a, aVar.f52826a) && kotlin.jvm.internal.u.e(this.f52827b, aVar.f52827b) && kotlin.jvm.internal.u.e(this.f52828c, aVar.f52828c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52828c.hashCode() + defpackage.d.c(this.f52827b, this.f52826a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidApp(icon=");
        sb2.append(this.f52826a);
        sb2.append(", packageName=");
        sb2.append(this.f52827b);
        sb2.append(", appName=");
        return y1.e(sb2, this.f52828c, ")");
    }
}

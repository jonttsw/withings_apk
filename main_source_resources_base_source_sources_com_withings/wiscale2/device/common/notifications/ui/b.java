package com.withings.wiscale2.device.common.notifications.ui;

import androidx.camera.core.y1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f52834a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52835b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52836c;

    public b(String str, String category, String str2) {
        kotlin.jvm.internal.u.j(category, "category");
        this.f52834a = str;
        this.f52835b = category;
        this.f52836c = str2;
    }

    public final String a() {
        return this.f52835b;
    }

    public final String b() {
        return this.f52834a;
    }

    public final String c() {
        return this.f52836c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.u.e(this.f52834a, bVar.f52834a) && kotlin.jvm.internal.u.e(this.f52835b, bVar.f52835b) && kotlin.jvm.internal.u.e(this.f52836c, bVar.f52836c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c11 = defpackage.d.c(this.f52835b, this.f52834a.hashCode() * 31, 31);
        String str = this.f52836c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c11 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppInfo(name=");
        sb2.append(this.f52834a);
        sb2.append(", category=");
        sb2.append(this.f52835b);
        sb2.append(", packageName=");
        return y1.e(sb2, this.f52836c, ")");
    }
}

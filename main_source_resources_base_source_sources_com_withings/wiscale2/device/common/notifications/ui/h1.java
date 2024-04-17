package com.withings.wiscale2.device.common.notifications.ui;

import androidx.camera.core.y1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f52916a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52917b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f52918c;

    public h1(boolean z5, boolean z11, boolean z12) {
        this.f52916a = z5;
        this.f52917b = z11;
        this.f52918c = z12;
    }

    public final boolean a() {
        return this.f52916a;
    }

    public final boolean b() {
        return this.f52918c;
    }

    public final boolean c() {
        return this.f52917b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f52916a == h1Var.f52916a && this.f52917b == h1Var.f52917b && this.f52918c == h1Var.f52918c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52918c) + y1.a(this.f52917b, Boolean.hashCode(this.f52916a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HealthNotification(isAfibEnabled=");
        sb2.append(this.f52916a);
        sb2.append(", isIrregularHeartBeatEnabled=");
        sb2.append(this.f52917b);
        sb2.append(", isHighAndLowHrEnable=");
        return androidx.appcompat.app.h.d(sb2, this.f52918c, ")");
    }
}

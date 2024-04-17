package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f52936a;

    /* renamed from: b  reason: collision with root package name */
    private final short f52937b;

    public k1(List<String> list, short s11) {
        this.f52936a = list;
        this.f52937b = s11;
    }

    public final short a() {
        return this.f52937b;
    }

    public final List<String> b() {
        return this.f52936a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (kotlin.jvm.internal.u.e(this.f52936a, k1Var.f52936a) && this.f52937b == k1Var.f52937b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f52937b) + (this.f52936a.hashCode() * 31);
    }

    public final String toString() {
        return "PermissionNeededInfo(permissions=" + this.f52936a + ", forType=" + ((int) this.f52937b) + ")";
    }
}

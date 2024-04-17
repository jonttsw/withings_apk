package com.withings.wiscale2.device.common.ui;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
public final class l2 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f54017a;

    /* renamed from: b  reason: collision with root package name */
    private final short f54018b;

    public l2(boolean z5, short s11) {
        this.f54017a = z5;
        this.f54018b = s11;
    }

    public final short a() {
        return this.f54018b;
    }

    public final boolean b() {
        return this.f54017a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (this.f54017a == l2Var.f54017a && this.f54018b == l2Var.f54018b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f54018b) + (Boolean.hashCode(this.f54017a) * 31);
    }

    public final String toString() {
        return "ShortcutState(shortcutActivated=" + this.f54017a + ", lastShortcutValue=" + ((int) this.f54018b) + ")";
    }
}

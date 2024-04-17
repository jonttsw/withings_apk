package com.withings.ecg.heartsound;

import java.util.ArrayList;
import java.util.List;
/* compiled from: HeartSoundListActivity.kt */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0> f38533a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38534b;

    public t0(ArrayList arrayList, int i11) {
        this.f38533a = arrayList;
        this.f38534b = i11;
    }

    public final int a() {
        return this.f38534b;
    }

    public final List<i0> b() {
        return this.f38533a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (kotlin.jvm.internal.u.e(this.f38533a, t0Var.f38533a) && this.f38534b == t0Var.f38534b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38534b) + (this.f38533a.hashCode() * 31);
    }

    public final String toString() {
        return "HeartSoundsList(heartSoundItems=" + this.f38533a + ", currentItem=" + this.f38534b + ")";
    }
}

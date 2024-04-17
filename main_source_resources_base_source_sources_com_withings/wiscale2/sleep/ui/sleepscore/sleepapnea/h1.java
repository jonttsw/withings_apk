package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import java.util.List;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
/* loaded from: classes5.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f61342a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DatedValue> f61343b;

    public h1(String title, List<DatedValue> ahiValues) {
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(ahiValues, "ahiValues");
        this.f61342a = title;
        this.f61343b = ahiValues;
    }

    public final List<DatedValue> a() {
        return this.f61343b;
    }

    public final String b() {
        return this.f61342a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (kotlin.jvm.internal.u.e(this.f61342a, h1Var.f61342a) && kotlin.jvm.internal.u.e(this.f61343b, h1Var.f61343b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f61343b.hashCode() + (this.f61342a.hashCode() * 31);
    }

    public final String toString() {
        return "SleepDisorderGraphPagerInfo(title=" + this.f61342a + ", ahiValues=" + this.f61343b + ")";
    }
}

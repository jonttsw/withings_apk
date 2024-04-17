package com.withings.fever.ui.temperatureList;

import kotlin.jvm.internal.u;
/* compiled from: TemperatureListState.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ky.d f39426a;

    public b(ky.d measuresGroup) {
        u.j(measuresGroup, "measuresGroup");
        this.f39426a = measuresGroup;
    }

    public final ky.d a() {
        return this.f39426a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && u.e(this.f39426a, ((b) obj).f39426a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39426a.hashCode();
    }

    public final String toString() {
        return "DeleteMeasure(measuresGroup=" + this.f39426a + ")";
    }
}

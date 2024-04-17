package com.withings.fever.ui;
/* compiled from: TemperatureState.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ws.f f39219a;

    public b(ws.f viewport) {
        kotlin.jvm.internal.u.j(viewport, "viewport");
        this.f39219a = viewport;
    }

    public final ws.f a() {
        return this.f39219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f39219a, ((b) obj).f39219a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39219a.hashCode();
    }

    public final String toString() {
        return "OnViewPortChange(viewport=" + this.f39219a + ")";
    }
}

package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutPhoto.kt */
/* loaded from: classes4.dex */
public final class w0 extends x0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f49762a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f49763b;

    public w0(Object obj, boolean z5) {
        super(0);
        this.f49762a = obj;
        this.f49763b = z5;
    }

    public final boolean a() {
        return this.f49763b;
    }

    public final Object b() {
        return this.f49762a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (kotlin.jvm.internal.u.e(this.f49762a, w0Var.f49762a) && this.f49763b == w0Var.f49763b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49763b) + (this.f49762a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoItem(source=" + this.f49762a + ", selected=" + this.f49763b + ")";
    }
}

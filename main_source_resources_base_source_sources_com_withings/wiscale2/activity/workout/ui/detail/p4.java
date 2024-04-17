package com.withings.wiscale2.activity.workout.ui.detail;

import org.joda.time.DateTime;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class p4 {

    /* renamed from: a  reason: collision with root package name */
    private final DateTime f49534a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49535b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49536c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49537d;

    public p4(DateTime dateTime, int i11, int i12, int i13) {
        this.f49534a = dateTime;
        this.f49535b = i11;
        this.f49536c = i12;
        this.f49537d = i13;
    }

    public final int a() {
        return this.f49537d;
    }

    public final int b() {
        return this.f49536c;
    }

    public final DateTime c() {
        return this.f49534a;
    }

    public final int d() {
        return this.f49535b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        if (kotlin.jvm.internal.u.e(this.f49534a, p4Var.f49534a) && this.f49535b == p4Var.f49535b && this.f49536c == p4Var.f49536c && this.f49537d == p4Var.f49537d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49537d) + androidx.appcompat.app.h.a(this.f49536c, androidx.appcompat.app.h.a(this.f49535b, this.f49534a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkoutHeartRateDatumData(time=");
        sb2.append(this.f49534a);
        sb2.append(", value=");
        sb2.append(this.f49535b);
        sb2.append(", minValue=");
        sb2.append(this.f49536c);
        sb2.append(", maxValue=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f49537d, ")");
    }
}

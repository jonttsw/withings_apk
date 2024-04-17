package com.withings.ecg.details;

import org.joda.time.DateTime;
/* compiled from: EcgListViewModel.kt */
/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f38257a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38258b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f38259c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38260d;

    /* renamed from: e  reason: collision with root package name */
    private final DateTime f38261e;

    public l1(boolean z5, long j5, Long l5, String title, DateTime timestamp) {
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(timestamp, "timestamp");
        this.f38257a = z5;
        this.f38258b = j5;
        this.f38259c = l5;
        this.f38260d = title;
        this.f38261e = timestamp;
    }

    public final Long a() {
        return this.f38259c;
    }

    public final long b() {
        return this.f38258b;
    }

    public final DateTime c() {
        return this.f38261e;
    }

    public final String d() {
        return this.f38260d;
    }

    public final boolean e() {
        return this.f38257a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f38257a == l1Var.f38257a && this.f38258b == l1Var.f38258b && kotlin.jvm.internal.u.e(this.f38259c, l1Var.f38259c) && kotlin.jvm.internal.u.e(this.f38260d, l1Var.f38260d) && kotlin.jvm.internal.u.e(this.f38261e, l1Var.f38261e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a11 = androidx.activity.result.c.a(this.f38258b, Boolean.hashCode(this.f38257a) * 31, 31);
        Long l5 = this.f38259c;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        return this.f38261e.hashCode() + defpackage.d.c(this.f38260d, (a11 + hashCode) * 31, 31);
    }

    public final String toString() {
        return "EcgItem(isInReview=" + this.f38257a + ", ecgId=" + this.f38258b + ", deviceId=" + this.f38259c + ", title=" + this.f38260d + ", timestamp=" + this.f38261e + ")";
    }
}

package com.withings.ecg.heartsound;

import androidx.camera.core.y1;
import org.joda.time.DateTime;
/* compiled from: HeartSoundListActivity.kt */
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f38476a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f38477b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38478c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38479d;

    public i0(long j5, DateTime date, String title, String str) {
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(title, "title");
        this.f38476a = j5;
        this.f38477b = date;
        this.f38478c = title;
        this.f38479d = str;
    }

    public final DateTime a() {
        return this.f38477b;
    }

    public final long b() {
        return this.f38476a;
    }

    public final String c() {
        return this.f38478c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f38476a == i0Var.f38476a && kotlin.jvm.internal.u.e(this.f38477b, i0Var.f38477b) && kotlin.jvm.internal.u.e(this.f38478c, i0Var.f38478c) && kotlin.jvm.internal.u.e(this.f38479d, i0Var.f38479d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c11 = defpackage.d.c(this.f38478c, com.google.android.gms.internal.mlkit_common.a.b(this.f38477b, Long.hashCode(this.f38476a) * 31, 31), 31);
        String str = this.f38479d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c11 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeartSoundItem(id=");
        sb2.append(this.f38476a);
        sb2.append(", date=");
        sb2.append(this.f38477b);
        sb2.append(", title=");
        sb2.append(this.f38478c);
        sb2.append(", heartSoundPath=");
        return y1.e(sb2, this.f38479d, ")");
    }
}

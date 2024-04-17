package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.SleepStat;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
/* compiled from: SleepAverageHRSectionView.kt */
/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f60936a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f60937b;

    /* renamed from: c  reason: collision with root package name */
    private final SleepStat f60938c;

    /* renamed from: d  reason: collision with root package name */
    private final Track f60939d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Vasistas> f60940e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Vasistas> f60941f;

    public f0(long j5, Long l5, SleepStat sleepStat, Track track, List<Vasistas> heartRateVasistas, List<Vasistas> respiratoryRateVasistas) {
        kotlin.jvm.internal.u.j(heartRateVasistas, "heartRateVasistas");
        kotlin.jvm.internal.u.j(respiratoryRateVasistas, "respiratoryRateVasistas");
        this.f60936a = j5;
        this.f60937b = l5;
        this.f60938c = sleepStat;
        this.f60939d = track;
        this.f60940e = heartRateVasistas;
        this.f60941f = respiratoryRateVasistas;
    }

    public final List<Vasistas> a() {
        return this.f60940e;
    }

    public final List<Vasistas> b() {
        return this.f60941f;
    }

    public final SleepStat c() {
        return this.f60938c;
    }

    public final Track d() {
        return this.f60939d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f60936a == f0Var.f60936a && kotlin.jvm.internal.u.e(this.f60937b, f0Var.f60937b) && kotlin.jvm.internal.u.e(this.f60938c, f0Var.f60938c) && kotlin.jvm.internal.u.e(this.f60939d, f0Var.f60939d) && kotlin.jvm.internal.u.e(this.f60940e, f0Var.f60940e) && kotlin.jvm.internal.u.e(this.f60941f, f0Var.f60941f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Long.hashCode(this.f60936a) * 31;
        int i11 = 0;
        Long l5 = this.f60937b;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        SleepStat sleepStat = this.f60938c;
        if (sleepStat == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = sleepStat.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Track track = this.f60939d;
        if (track != null) {
            i11 = track.hashCode();
        }
        return this.f60941f.hashCode() + defpackage.e.b(this.f60940e, (i13 + i11) * 31, 31);
    }

    public final String toString() {
        return "SleepAverageHRData(userId=" + this.f60936a + ", sleepTrackWsId=" + this.f60937b + ", sleepStat=" + this.f60938c + ", sleepTrack=" + this.f60939d + ", heartRateVasistas=" + this.f60940e + ", respiratoryRateVasistas=" + this.f60941f + ")";
    }
}

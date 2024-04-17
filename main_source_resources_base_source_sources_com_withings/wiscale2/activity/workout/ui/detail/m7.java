package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.track.data.GpsSummary;
import java.util.List;
/* compiled from: WorkoutPreview.kt */
/* loaded from: classes4.dex */
public final class m7 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f49456a;

    /* renamed from: b  reason: collision with root package name */
    private final GpsSummary f49457b;

    /* renamed from: c  reason: collision with root package name */
    private final List<GpsLocation> f49458c;

    public m7(Object obj, GpsSummary gpsSummary, List<GpsLocation> list) {
        this.f49456a = obj;
        this.f49457b = gpsSummary;
        this.f49458c = list;
    }

    public final GpsSummary a() {
        return this.f49457b;
    }

    public final List<GpsLocation> b() {
        return this.f49458c;
    }

    public final Object c() {
        return this.f49456a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        if (kotlin.jvm.internal.u.e(this.f49456a, m7Var.f49456a) && kotlin.jvm.internal.u.e(this.f49457b, m7Var.f49457b) && kotlin.jvm.internal.u.e(this.f49458c, m7Var.f49458c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i11 = 0;
        Object obj = this.f49456a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i12 = hashCode * 31;
        GpsSummary gpsSummary = this.f49457b;
        if (gpsSummary == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gpsSummary.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        List<GpsLocation> list = this.f49458c;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i13 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkoutPreviewMapInfo(mapSnapshot=");
        sb2.append(this.f49456a);
        sb2.append(", gpsSummary=");
        sb2.append(this.f49457b);
        sb2.append(", mapLocations=");
        return defpackage.d.i(sb2, this.f49458c, ")");
    }
}

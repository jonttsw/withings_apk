package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final List<Track> f61178a;

    /* renamed from: b  reason: collision with root package name */
    private final Track f61179b;

    public o(Track track, ArrayList arrayList) {
        this.f61178a = arrayList;
        this.f61179b = track;
    }

    public final List<Track> a() {
        return this.f61178a;
    }

    public final Track b() {
        return this.f61179b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.u.e(this.f61178a, oVar.f61178a) && kotlin.jvm.internal.u.e(this.f61179b, oVar.f61179b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f61178a.hashCode() * 31;
        Track track = this.f61179b;
        if (track == null) {
            hashCode = 0;
        } else {
            hashCode = track.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "NapsAndSecondarySleepTrack(naps=" + this.f61178a + ", secondarySleepData=" + this.f61179b + ")";
    }
}

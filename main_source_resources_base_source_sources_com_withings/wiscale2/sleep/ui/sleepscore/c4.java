package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.Track;
import ii0.a;
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
public final class c4 implements a.InterfaceC1083a {
    @Override // ii0.a.InterfaceC1083a
    public final int a(a.c cVar, Track track) {
        kotlin.jvm.internal.u.j(track, "track");
        if (track.getSleepScore() != null) {
            return SleepScoreColorHelper.INSTANCE.getSleepScoreColorRes(track.getSleepScore());
        }
        return C1987R.color.statusUndefined;
    }
}

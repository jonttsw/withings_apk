package com.withings.wiscale2.manuallogging.ui.addSleep;

import androidx.camera.camera2.internal.q;
import com.withings.wiscale2.track.data.Track;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AddSleepTrackActivity.kt */
/* loaded from: classes5.dex */
final class i extends w implements ym0.l<Track, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddSleepTrackActivity f58069a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddSleepTrackActivity addSleepTrackActivity) {
        super(1);
        this.f58069a = addSleepTrackActivity;
    }

    @Override // ym0.l
    public final y invoke(Track track) {
        r8.n nVar;
        Track it = track;
        u.j(it, "it");
        nVar = this.f58069a.f58020e;
        if (nVar != null) {
            Long id2 = it.getId();
            u.g(id2);
            androidx.navigation.e.L(nVar, q.c("addSleepFeeling/", id2.longValue()), null, 6);
            return y.f85009a;
        }
        u.s("navController");
        throw null;
    }
}

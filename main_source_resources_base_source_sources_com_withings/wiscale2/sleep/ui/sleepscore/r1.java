package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.track.data.Track;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepDayViewModel.kt */
/* loaded from: classes5.dex */
final class r1 extends kotlin.jvm.internal.w implements ym0.l<Track, LiveData<p4>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j1 f61219a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(j1 j1Var) {
        super(1);
        this.f61219a = j1Var;
    }

    @Override // ym0.l
    public final LiveData<p4> invoke(Track track) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new q1(this.f61219a, track, null), 2);
    }
}

package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.track.data.Track;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepDayViewModel.kt */
/* loaded from: classes5.dex */
final class m1 extends kotlin.jvm.internal.w implements ym0.l<Track, LiveData<fx.g>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ hx.e f61151a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(hx.e eVar) {
        super(1);
        this.f61151a = eVar;
    }

    @Override // ym0.l
    public final LiveData<fx.g> invoke(Track track) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new l1(track, this.f61151a, null), 2);
    }
}

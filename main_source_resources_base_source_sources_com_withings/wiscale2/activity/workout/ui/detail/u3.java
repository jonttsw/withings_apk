package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class u3 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Track, WorkoutCategory>, LiveData<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ nj0.a f49680a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(nj0.a aVar) {
        super(1);
        this.f49680a = aVar;
    }

    @Override // ym0.l
    public final LiveData<Boolean> invoke(nm0.j<Track, WorkoutCategory> jVar) {
        nm0.j<Track, WorkoutCategory> jVar2 = jVar;
        kotlin.jvm.internal.u.j(jVar2, "<name for destructuring parameter 0>");
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new t3(this.f49680a, jVar2.a(), jVar2.b(), null), 2);
    }
}

package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListGpsPointActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity$ListGpsPointViewModel$pauseVasistas$1$1", f = "ListGpsPointActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<Vasistas>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.a f49390a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f49391b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ListGpsPointActivity.a aVar, Track track, qm0.d<? super l0> dVar) {
        super(2, dVar);
        this.f49390a = aVar;
        this.f49391b = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l0(this.f49390a, this.f49391b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<Vasistas>> dVar) {
        return ((l0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        lj0.h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        h0Var = this.f49390a.f49049d;
        Track track = this.f49391b;
        return h0Var.o(track.getUserId(), Vasistas.Category.PAUSE, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
    }
}

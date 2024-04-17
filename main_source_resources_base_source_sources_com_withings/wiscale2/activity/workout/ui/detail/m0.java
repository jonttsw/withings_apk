package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity$ListGpsPointViewModel$special$$inlined$flatMapLatest$1", f = "ListGpsPointActivity.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class m0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super List<? extends GpsLocation>>, Track, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49429a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ FlowCollector f49430b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f49431c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.a f49432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ListGpsPointActivity.a aVar, qm0.d dVar) {
        super(3, dVar);
        this.f49432d = aVar;
    }

    @Override // ym0.q
    public final Object invoke(FlowCollector<? super List<? extends GpsLocation>> flowCollector, Track track, qm0.d<? super nm0.y> dVar) {
        m0 m0Var = new m0(this.f49432d, dVar);
        m0Var.f49430b = flowCollector;
        m0Var.f49431c = track;
        return m0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GpsLocationRepository gpsLocationRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49429a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = this.f49430b;
            Track track = (Track) this.f49431c;
            gpsLocationRepository = this.f49432d.f49050e;
            Flow<List<GpsLocation>> flow = gpsLocationRepository.get(track.getUserId(), track.getStartDate(), track.getEndDate());
            this.f49429a = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}

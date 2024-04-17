package com.withings.workout.ui;

import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import com.withings.workout.ui.GpsLocationMapView;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GpsLocationMapView.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.workout.ui.GpsLocationMapView$updateMapPosition$1", f = "GpsLocationMapView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GpsLocationMapView f62977a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GpsLocationMapView gpsLocationMapView, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f62977a = gpsLocationMapView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f62977a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List<GpsLocation> list2;
        GpsLocationMapView.b bVar;
        List<GpsLocation> list3;
        GpsLocationsSummary gpsLocationsSummary;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        GpsLocationMapView gpsLocationMapView = this.f62977a;
        list = gpsLocationMapView.f62952g;
        if (!list.isEmpty()) {
            list2 = gpsLocationMapView.f62952g;
            gpsLocationMapView.o(list2);
            bVar = gpsLocationMapView.f62953h;
            list3 = gpsLocationMapView.f62952g;
            gpsLocationsSummary = gpsLocationMapView.f62954i;
            bVar.c(gpsLocationMapView, list3, gpsLocationsSummary);
        }
        return y.f85009a;
    }
}

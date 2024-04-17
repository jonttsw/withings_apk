package com.withings.wiscale2.activity.workout.gps.model;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GpsTrackingService.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.gps.model.GpsTrackingService$onLocationReceived$1", f = "GpsTrackingService.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_PR_INTERVAL_DURATION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48747a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GpsTrackingService f48748b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GpsLocation f48749c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GpsTrackingService gpsTrackingService, GpsLocation gpsLocation, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f48748b = gpsTrackingService;
        this.f48749c = gpsLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f48748b, this.f48749c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GpsLocationRepository gpsLocationRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48747a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            gpsLocationRepository = this.f48748b.f48735f;
            List<GpsLocation> V = x.V(this.f48749c);
            this.f48747a = 1;
            if (gpsLocationRepository.add(V, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}

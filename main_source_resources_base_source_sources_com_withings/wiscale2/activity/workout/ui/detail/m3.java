package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.model.GpsLocation;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WorkoutDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$createGpsPerformanceGraphData$1$1$1", f = "WorkoutDetailViewModel.kt", l = {ConstantsWs.WS_STATUS_INVALID_PASSWORD_NO_LOWERCASE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class m3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<ab0.i>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49438a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49439b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j3 f49440c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Track f49441d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ WorkoutCategory f49442e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ List<GpsLocation> f49443f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f49444g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(j3 j3Var, Track track, WorkoutCategory workoutCategory, List<GpsLocation> list, List<Vasistas> list2, qm0.d<? super m3> dVar) {
        super(2, dVar);
        this.f49440c = j3Var;
        this.f49441d = track;
        this.f49442e = workoutCategory;
        this.f49443f = list;
        this.f49444g = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        m3 m3Var = new m3(this.f49440c, this.f49441d, this.f49442e, this.f49443f, this.f49444g, dVar);
        m3Var.f49439b = obj;
        return m3Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<ab0.i> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((m3) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ab0.q qVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49438a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            qVar = this.f49440c.f49275y;
            ab0.i d11 = qVar.d(this.f49441d, this.f49442e, this.f49443f, this.f49444g);
            this.f49438a = 1;
            if (((androidx.lifecycle.h0) this.f49439b).emit(d11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}

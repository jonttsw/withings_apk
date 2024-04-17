package com.withings.wiscale2.activity.workout.ui.map;

import androidx.lifecycle.h0;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.ktx.FilterGpsLocationWithPauseKt;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.p;
/* compiled from: WorkoutMapActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.map.WorkoutMapViewModel$locationsPauseFiltered$1$1", f = "WorkoutMapActivity.kt", l = {389}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements p<h0<List<? extends GpsLocation>>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49942a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49943b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f49944c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l f49945d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<GpsLocation> f49946e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List<Vasistas> list, l lVar, List<GpsLocation> list2, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f49944c = list;
        this.f49945d = lVar;
        this.f49946e = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        m mVar = new m(this.f49944c, this.f49945d, this.f49946e, dVar);
        mVar.f49943b = obj;
        return mVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<List<? extends GpsLocation>> h0Var, qm0.d<? super y> dVar) {
        return ((m) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FilterGpsLocationWithPause filterGpsLocationWithPause;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49942a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            h0 h0Var = (h0) this.f49943b;
            List<Vasistas> pauseVasistas = this.f49944c;
            u.i(pauseVasistas, "$pauseVasistas");
            List<Vasistas> list = pauseVasistas;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (Vasistas vasistas : list) {
                arrayList.add(new Pause(vasistas.getStartDate(), vasistas.getEnd()));
            }
            filterGpsLocationWithPause = this.f49945d.f49894l;
            List<GpsLocation> filter = FilterGpsLocationWithPauseKt.filter(filterGpsLocationWithPause, this.f49946e, arrayList);
            this.f49942a = 1;
            if (h0Var.emit(filter, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}

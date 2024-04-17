package com.withings.wiscale2.heart.bloodpressure;

import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import hj0.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: BloodPressureMeasureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity$BloodPressureMeasureListViewModel$sectionLiveData$1$1", f = "BloodPressureMeasureListActivity.kt", l = {216, 221}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends a.C1035a>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57455a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57456b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity.a f57457c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(BloodPressureMeasureListActivity.a aVar, qm0.d<? super v> dVar) {
        super(2, dVar);
        this.f57457c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        v vVar = new v(this.f57457c, dVar);
        vVar.f57456b = obj;
        return vVar;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends a.C1035a>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((v) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        a.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57455a;
        BloodPressureMeasureListActivity.a aVar = this.f57457c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f57456b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f57456b;
            this.f57456b = h0Var;
            this.f57455a = 1;
            obj = BloodPressureMeasureListActivity.a.g0(aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        aVar.getClass();
        List<MeasuresGroup> list = (List) obj;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (MeasuresGroup measuresGroup : list) {
            arrayList.add(new hj0.b(measuresGroup));
        }
        hj0.a aVar2 = new hj0.a();
        bVar = aVar.f57317c;
        ArrayList a11 = aVar2.a(arrayList, bVar);
        a11.add(0, null);
        this.f57456b = null;
        this.f57455a = 2;
        if (h0Var.emit(a11, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}

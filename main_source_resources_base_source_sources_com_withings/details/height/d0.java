package com.withings.details.height;

import com.withings.library.measure.MeasuresGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeightListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.details.height.HeightListActivityMeasurementsViewModel$deleteMeasurementGroup$1", f = "HeightListActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f36593a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f36594b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, MeasuresGroup measuresGroup, qm0.d<? super d0> dVar) {
        super(2, dVar);
        this.f36593a = e0Var;
        this.f36594b = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d0(this.f36593a, this.f36594b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        aVar = this.f36593a.f36598a;
        aVar.b(hy.g.a(this.f36594b));
        return nm0.y.f85009a;
    }
}

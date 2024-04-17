package com.withings.wiscale2.weight.list;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: WeightListActivityMeasurementsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.weight.list.WeightListActivityMeasurementsViewModel$delete$1", f = "WeightListActivityMeasurementsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f62926a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ky.d f62927b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ky.d dVar, qm0.d<? super j> dVar2) {
        super(2, dVar2);
        this.f62926a = kVar;
        this.f62927b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f62926a, this.f62927b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        aVar = this.f62926a.f62928a;
        aVar.b(this.f62927b);
        return y.f85009a;
    }
}

package com.withings.fever.ui.temperatureList;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: TemperatureListViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.temperatureList.TemperatureListViewModel$delete$1", f = "TemperatureListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f39443a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ky.d f39444b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ky.d dVar, qm0.d<? super p> dVar2) {
        super(2, dVar2);
        this.f39443a = qVar;
        this.f39444b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new p(this.f39443a, this.f39444b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        aVar = this.f39443a.f39448d;
        aVar.b(this.f39444b);
        return y.f85009a;
    }
}

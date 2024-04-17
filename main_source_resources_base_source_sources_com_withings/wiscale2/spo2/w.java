package com.withings.wiscale2.spo2;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SpO2MeasuresListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.spo2.Spo2MeasuresViewModel$deleteSpo2Measures$1", f = "SpO2MeasuresListActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y f61700a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<ky.d> f61701b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, List<ky.d> list, qm0.d<? super w> dVar) {
        super(2, dVar);
        this.f61700a = yVar;
        this.f61701b = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w(this.f61700a, this.f61701b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        y yVar = this.f61700a;
        y.f0(yVar).a(this.f61701b);
        y.k0(yVar);
        return nm0.y.f85009a;
    }
}

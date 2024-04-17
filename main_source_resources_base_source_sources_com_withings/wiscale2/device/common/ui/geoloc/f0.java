package com.withings.wiscale2.device.common.ui.geoloc;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
/* compiled from: WeatherAirQualityViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityViewModel$updateDevice$1", f = "WeatherAirQualityViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class f0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f53867a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f53868b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a0 a0Var, qm0.d<? super f0> dVar) {
        super(2, dVar);
        this.f53868b = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f0 f0Var = new f0(this.f53868b, dVar);
        f0Var.f53867a = obj;
        return f0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a0 a0Var = this.f53868b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f53867a;
        try {
            new kn.n(a0Var.r0()).run();
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        boolean z5 = a11 instanceof k.a;
        a0Var.y0().setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.ui.geoloc;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: WeatherAirQualityViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityViewModel$onLocationSelected$1", f = "WeatherAirQualityViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class c0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53857a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f53858b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53859c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, int i11, qm0.d<? super c0> dVar) {
        super(2, dVar);
        this.f53858b = a0Var;
        this.f53859c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c0(this.f53858b, this.f53859c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53857a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            mutableStateFlow = this.f53858b.f53834e;
            Integer num = new Integer(this.f53859c);
            this.f53857a = 1;
            if (mutableStateFlow.emit(num, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}

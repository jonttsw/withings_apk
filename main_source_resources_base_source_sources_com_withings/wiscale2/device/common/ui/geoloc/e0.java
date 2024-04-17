package com.withings.wiscale2.device.common.ui.geoloc;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: WeatherAirQualityViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityViewModel$onValueInputTextChange$1", f = "WeatherAirQualityViewModel.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class e0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53863a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f53864b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f53865c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a0 a0Var, String str, qm0.d<? super e0> dVar) {
        super(2, dVar);
        this.f53864b = a0Var;
        this.f53865c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e0(this.f53864b, this.f53865c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53863a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            mutableStateFlow = this.f53864b.f53836g;
            this.f53863a = 1;
            if (mutableStateFlow.emit(this.f53865c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}

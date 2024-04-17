package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import androidx.compose.material.c5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity$SelectBiomarkersScreen$4$2$1$2$1", f = "Wpa02LaunchMeasurementActivity.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f55533a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f55534b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c5 c5Var, qm0.d<? super d0> dVar) {
        super(2, dVar);
        this.f55534b = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d0(this.f55534b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55533a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f55533a = 1;
            if (this.f55534b.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import com.withings.wiscale2.device.wpa.wpa02.conversation.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: Wpa02CleansingModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeViewModel$onConnectionClosed$1", f = "Wpa02CleansingModeViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class o0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f55312a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wpa02CleansingModeViewModel f55313b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Wpa02CleansingModeViewModel wpa02CleansingModeViewModel, qm0.d<? super o0> dVar) {
        super(2, dVar);
        this.f55313b = wpa02CleansingModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o0(this.f55313b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((o0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55312a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f55313b.f55236i;
            a.C0727a c0727a = new a.C0727a();
            this.f55312a = 1;
            if (mutableSharedFlow.emit(c0727a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import androidx.camera.camera2.internal.v1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02CleansingModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeViewModel$startCleansingMode$1", f = "Wpa02CleansingModeViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f55316a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wpa02CleansingModeViewModel f55317b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Wpa02CleansingModeViewModel wpa02CleansingModeViewModel, qm0.d<? super p0> dVar) {
        super(2, dVar);
        this.f55317b = wpa02CleansingModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p0(this.f55317b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55316a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Wpa02CleansingModeViewModel wpa02CleansingModeViewModel = this.f55317b;
            yi.d y02 = wpa02CleansingModeViewModel.y0();
            if (y02 != null && v1.Z(y02) && !Wpa02CleansingModeViewModel.i0(wpa02CleansingModeViewModel).h()) {
                Wpa02CleansingModeViewModel.i0(wpa02CleansingModeViewModel).g();
            } else {
                yi.d y03 = wpa02CleansingModeViewModel.y0();
                if (y03 == null || !v1.Z(y03)) {
                    mutableSharedFlow = wpa02CleansingModeViewModel.f55238k;
                    Boolean bool = Boolean.TRUE;
                    this.f55316a = 1;
                    if (mutableSharedFlow.emit(bool, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        return nm0.y.f85009a;
    }
}

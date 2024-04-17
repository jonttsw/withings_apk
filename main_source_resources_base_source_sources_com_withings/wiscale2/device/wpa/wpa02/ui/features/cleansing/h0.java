package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import android.content.Intent;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: Wpa02CleansingModeActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeActivity$onCreate$1$1$2", f = "Wpa02CleansingModeActivity.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f55290a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wpa02CleansingModeActivity f55291b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02CleansingModeActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Wpa02CleansingModeActivity f55292a;

        a(Wpa02CleansingModeActivity wpa02CleansingModeActivity) {
            this.f55292a = wpa02CleansingModeActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            androidx.activity.result.b bVar;
            if (((Boolean) obj).booleanValue()) {
                Wpa02CleansingModeActivity wpa02CleansingModeActivity = this.f55292a;
                Setup q02 = Wpa02CleansingModeActivity.B3(wpa02CleansingModeActivity).q0();
                if (q02 != null) {
                    int i11 = EnablePermissionsForScanActivity.f37827j;
                    Intent a11 = EnablePermissionsForScanActivity.a.a(wpa02CleansingModeActivity, new EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup(q02));
                    bVar = wpa02CleansingModeActivity.f55223f;
                    bVar.a(a11);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Wpa02CleansingModeActivity wpa02CleansingModeActivity, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f55291b = wpa02CleansingModeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f55291b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55290a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            Wpa02CleansingModeActivity wpa02CleansingModeActivity = this.f55291b;
            SharedFlow<Boolean> t02 = Wpa02CleansingModeActivity.B3(wpa02CleansingModeActivity).t0();
            a aVar = new a(wpa02CleansingModeActivity);
            this.f55290a = 1;
            if (t02.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}

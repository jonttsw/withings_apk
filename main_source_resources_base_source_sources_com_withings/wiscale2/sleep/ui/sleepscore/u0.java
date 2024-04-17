package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayFragment$showNoteOrManualLog$1", f = "SleepDayFragment.kt", l = {ConstantsWs.HWFAILURE_CALIB100_TIMEOUT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class u0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61526a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0 f61527b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k0 k0Var, qm0.d<? super u0> dVar) {
        super(2, dVar);
        this.f61527b = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new u0(this.f61527b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((u0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61526a;
        k0 k0Var = this.f61527b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            if (wr.b.c(FeatureFlag.f39130s0)) {
                j1 H1 = k0.H1(k0Var);
                this.f61526a = 1;
                H1.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new k1(H1, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            k0.L1(k0Var);
            return nm0.y.f85009a;
        }
        if (((Boolean) obj).booleanValue()) {
            k0.K1(k0Var);
            return nm0.y.f85009a;
        }
        k0.L1(k0Var);
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepDayViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayViewModel$isManualLoggingEnabled$2", f = "SleepDayViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_R250KHZ_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class k1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61112a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j1 f61113b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(j1 j1Var, qm0.d<? super k1> dVar) {
        super(2, dVar);
        this.f61113b = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k1(this.f61113b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((k1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        hx.l lVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61112a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            lVar = this.f61113b.f61029e;
            this.f61112a = 1;
            obj = lVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}

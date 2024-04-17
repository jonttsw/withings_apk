package com.withings.wiscale2.device.common.feature.highlowhr;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HighLowHRActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRActivationActivity$handlePrimaryButtonClicked$1", f = "HighLowHRActivationActivity.kt", l = {ConstantsWs.MEASURE_TYPE_HR_STATE, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52301a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HighLowHRActivationActivity f52302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(HighLowHRActivationActivity highLowHRActivationActivity, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f52302b = highLowHRActivationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f52302b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52301a;
        HighLowHRActivationActivity highLowHRActivationActivity = this.f52302b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    highLowHRActivationActivity.finish();
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> j02 = HighLowHRActivationActivity.F3(highLowHRActivationActivity).j0();
            this.f52301a = 1;
            obj = FlowKt.first(j02, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            i0 F3 = HighLowHRActivationActivity.F3(highLowHRActivationActivity);
            this.f52301a = 2;
            if (F3.f0(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        highLowHRActivationActivity.finish();
        return nm0.y.f85009a;
    }
}

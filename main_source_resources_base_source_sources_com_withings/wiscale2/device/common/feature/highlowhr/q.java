package com.withings.wiscale2.device.common.feature.highlowhr;

import com.google.android.material.button.MaterialButton;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HighLowHRActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRActivationActivity$updatePrimaryButton$1$1", f = "HighLowHRActivationActivity.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class q extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52306a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HighLowHRActivationActivity f52307b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MaterialButton f52308c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(HighLowHRActivationActivity highLowHRActivationActivity, MaterialButton materialButton, qm0.d<? super q> dVar) {
        super(2, dVar);
        this.f52307b = highLowHRActivationActivity;
        this.f52308c = materialButton;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new q(this.f52307b, this.f52308c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((q) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52306a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> j02 = HighLowHRActivationActivity.F3(this.f52307b).j0();
            this.f52306a = 1;
            obj = FlowKt.first(j02, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MaterialButton materialButton = this.f52308c;
        if (booleanValue) {
            materialButton.setText(C1987R.string._DONE_);
        } else {
            materialButton.setText(C1987R.string._ACTIVATE_);
        }
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.feature.highlowhr;

import com.google.android.material.button.MaterialButton;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HighLowHRActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRActivationActivity$updateSecondaryButton$1", f = "HighLowHRActivationActivity.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52309a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HighLowHRActivationActivity f52310b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(HighLowHRActivationActivity highLowHRActivationActivity, qm0.d<? super r> dVar) {
        super(2, dVar);
        this.f52310b = highLowHRActivationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r(this.f52310b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        tb0.n G3;
        tb0.n G32;
        tb0.n G33;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52309a;
        HighLowHRActivationActivity highLowHRActivationActivity = this.f52310b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> j02 = HighLowHRActivationActivity.F3(highLowHRActivationActivity).j0();
            this.f52309a = 1;
            obj = FlowKt.first(j02, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            G33 = highLowHRActivationActivity.G3();
            MaterialButton secondaryButton = G33.f99347d;
            kotlin.jvm.internal.u.i(secondaryButton, "secondaryButton");
            secondaryButton.setVisibility(8);
        } else {
            G3 = highLowHRActivationActivity.G3();
            MaterialButton secondaryButton2 = G3.f99347d;
            kotlin.jvm.internal.u.i(secondaryButton2, "secondaryButton");
            secondaryButton2.setVisibility(0);
            G32 = highLowHRActivationActivity.G3();
            G32.f99347d.setText(C1987R.string.appleHealth_reactivateNotNowButtonTitle);
        }
        return nm0.y.f85009a;
    }
}

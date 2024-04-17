package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class r3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51690b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51689a = ecgActivationActivity;
        this.f51690b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        q3 q3Var = new q3(this.f51690b);
        EcgActivationActivity.H3(this.f51689a, "cantDetectStrokes.json", C1987R.string.hwa09_ecgExplanationTutorial_cannotStroke_title, C1987R.string.hwa09_ecgExplanationTutorial_cannotStroke_description, q3Var, aVar, 32774);
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class o extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51548a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51549b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51548a = ecgActivationActivity;
        this.f51549b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        n nVar = new n(this.f51549b);
        EcgActivationActivity.H3(this.f51548a, "ecg_results.json", C1987R.string.hwa09_ecgExplanationTutorial_end_title, C1987R.string.hwa09_ecgExplanationTutorial_end_description, nVar, aVar, 32774);
        return nm0.y.f85009a;
    }
}

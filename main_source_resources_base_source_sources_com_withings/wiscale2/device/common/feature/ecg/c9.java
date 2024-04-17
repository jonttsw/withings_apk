package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class c9 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51260a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51260a = wBS08EcgActivationActivity;
        this.f51261b = nVar;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [ym0.a, kotlin.jvm.internal.a] */
    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        r8.n nVar = this.f51261b;
        ?? aVar2 = new kotlin.jvm.internal.a(0, nVar, r8.n.class, "popBackStack", "popBackStack()Z", 8);
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51260a;
        WBS08EcgActivationActivity.F3(wBS08EcgActivationActivity, 2131232228, C1987R.string.wbs08Rx_ecgTutorial_thirdPartyActivation_title, C1987R.string.wbs08Rx_ecgTutorial_thirdPartyActivation_paragraph, aVar2, new a(C1987R.string.accept__activate, new b9(nVar, wBS08EcgActivationActivity)), null, aVar, 2097152, 32);
        return nm0.y.f85009a;
    }
}

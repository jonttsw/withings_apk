package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class l9 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51505a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51506b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51505a = wBS08EcgActivationActivity;
        this.f51506b = nVar;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [ym0.a, kotlin.jvm.internal.a] */
    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        ?? aVar2 = new kotlin.jvm.internal.a(0, this.f51506b, r8.n.class, "popBackStack", "popBackStack()Z", 8);
        a aVar3 = new a(C1987R.string._DONE_, new k9(this.f51505a));
        WBS08EcgActivationActivity.F3(this.f51505a, 2131232756, C1987R.string.wbs08Rx_ecgExplanationTutorial_end_ThirdParty_title, C1987R.string.wbs08Rx_ecgExplanationTutorial_end_ThirdParty_paragraph, aVar2, aVar3, null, aVar, 2097152, 32);
        return nm0.y.f85009a;
    }
}

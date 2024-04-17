package com.withings.wiscale2.device.common.feature.ecg;

import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class v2 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52060a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52061b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f52060a = ecgActivationActivity;
        this.f52061b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        u2 u2Var = new u2(this.f52061b);
        EcgActivationActivity.D3(this.f52060a, 2131232756, C1987R.string.hwa09_ecgExplanationTutorial_end_ThirdParty_title, C1987R.string.hwa09_usOnboarding_validationECG_title, u2Var, aVar, Utils.MAX_EVENT_SIZE);
        return nm0.y.f85009a;
    }
}

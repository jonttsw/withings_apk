package com.withings.wiscale2.device.common.feature.ecg;

import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class l2 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51490a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51491b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51490a = ecgActivationActivity;
        this.f51491b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        k2 k2Var = new k2(this.f51491b);
        EcgActivationActivity.D3(this.f51490a, 2131232228, C1987R.string.hwa09_usOnboarding_goECG_title, C1987R.string.hwa09_usOnboarding_goECG_paragraph, k2Var, aVar, Utils.MAX_EVENT_SIZE);
        return nm0.y.f85009a;
    }
}

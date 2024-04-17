package com.withings.wiscale2.device.common.feature.ecg;

import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class i4 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51419a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51419a = ecgActivationActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        EcgActivationActivity ecgActivationActivity = this.f51419a;
        EcgActivationActivity.D3(ecgActivationActivity, 2131232230, C1987R.string.hwa09_usOnboarding_videoCall_title, C1987R.string.hwa09_usOnboarding_videoCall_paragraph, new h4(ecgActivationActivity), aVar, Utils.MAX_EVENT_SIZE);
        return nm0.y.f85009a;
    }
}

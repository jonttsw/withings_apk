package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class n3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51533a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51533a = ecgActivationActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        EcgActivationActivity ecgActivationActivity = this.f51533a;
        EcgActivationActivity.H3(ecgActivationActivity, "ecg.json", C1987R.string.hwa09_ecgExplanationTutorialTitle, C1987R.string.hwa09_ecgExplanationTutorialMessage, new m3(ecgActivationActivity), aVar, 32774);
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class x3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52103a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(EcgActivationActivity ecgActivationActivity) {
        super(0);
        this.f52103a = ecgActivationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        EcgActivationActivity ecgActivationActivity = this.f52103a;
        String string = ecgActivationActivity.getString(C1987R.string.hwa09_usOnboarding_conditions_link);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        ecgActivationActivity.startActivity(aVar.c(ecgActivationActivity, null, string));
        return nm0.y.f85009a;
    }
}

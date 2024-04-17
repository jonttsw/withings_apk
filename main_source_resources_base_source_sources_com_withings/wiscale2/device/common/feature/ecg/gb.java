package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class gb extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51379b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(0);
        this.f51378a = wBS08EcgActivationActivity;
        this.f51379b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = WBS08EcgActivationActivity.f51104f;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51378a;
        wBS08EcgActivationActivity.getClass();
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(wBS08EcgActivationActivity), Dispatchers.getMain(), null, new ra(this.f51379b, C1987R.string.wbs08Rx_usOnboarding_error_phone_title, C1987R.string.wbs08Rx_usOnboarding_error_phone_paragraph, "error_connection", null), 2, null);
        return nm0.y.f85009a;
    }
}

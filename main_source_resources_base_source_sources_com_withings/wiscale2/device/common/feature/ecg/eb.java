package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class eb extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51318a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51319b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51318a = wBS08EcgActivationActivity;
        this.f51319b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        cb cbVar = new cb(this.f51318a);
        a aVar2 = new a(C1987R.string._NEXT_, new db(this.f51319b));
        WBS08EcgActivationActivity.F3(this.f51318a, 2131232230, C1987R.string.wbs08Rx_usOnboarding_videoCall_title, C1987R.string.wbs08Rx_usOnboarding_videoCall_paragraph, cbVar, aVar2, null, aVar, 2097152, 32);
        return nm0.y.f85009a;
    }
}

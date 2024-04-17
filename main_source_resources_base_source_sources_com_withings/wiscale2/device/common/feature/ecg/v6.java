package com.withings.wiscale2.device.common.feature.ecg;

import com.samsung.android.sdk.healthdata.HealthConstants;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class v6 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52068a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52069b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f52068a = wBS08EcgActivationActivity;
        this.f52069b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f52068a;
        androidx.navigation.compose.n.b(NavHost, "Loading", null, null, null, null, null, null, new s1.a(true, -119656316, new l6(wBS08EcgActivationActivity)), 126);
        int i11 = WBS08EcgActivationActivity.f51104f;
        wBS08EcgActivationActivity.getClass();
        r8.n nVar = this.f52069b;
        androidx.navigation.compose.n.c(NavHost, "EcgReviewStatusScreen", "EcgReviewStatus", new z9(nVar, wBS08EcgActivationActivity));
        androidx.navigation.compose.n.c(NavHost, "DiscoverECG6Lead", "Intro", new la(nVar, wBS08EcgActivationActivity));
        androidx.navigation.compose.n.c(NavHost, "StateSelection", "UsStateSelection", new bb(nVar, wBS08EcgActivationActivity));
        androidx.navigation.compose.n.b(NavHost, "AcceptationTerms", null, null, null, null, null, null, new s1.a(true, 1089717293, new n6(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.c(NavHost, "VideoCallIntro", "VideoCall", new lb(nVar, wBS08EcgActivationActivity));
        androidx.navigation.compose.n.c(NavHost, "FirstECGNeedsReview", "EcgMeasurement", new m9(nVar, wBS08EcgActivationActivity));
        androidx.navigation.compose.n.b(NavHost, "Support/{title}/{description}/{screenLog}", kotlin.collections.x.W(androidx.camera.camera2.internal.v1.d0("title", o6.f51604a), androidx.camera.camera2.internal.v1.d0(HealthConstants.FoodInfo.DESCRIPTION, p6.f51642a), androidx.camera.camera2.internal.v1.d0("screenLog", q6.f51667a)), null, null, null, null, null, new s1.a(true, 1239858636, new u6(wBS08EcgActivationActivity)), 124);
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.feature.ecg;

import com.samsung.android.sdk.healthdata.HealthConstants;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52054a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52055b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f52054a = ecgActivationActivity;
        this.f52055b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        EcgActivationActivity ecgActivationActivity = this.f52054a;
        androidx.navigation.compose.n.b(NavHost, "Loading", null, null, null, null, null, null, new s1.a(true, 1174926748, new k(ecgActivationActivity)), 126);
        fn0.k<Object>[] kVarArr = EcgActivationActivity.f51062k;
        ecgActivationActivity.getClass();
        r8.n nVar = this.f52055b;
        androidx.navigation.compose.n.c(NavHost, "EcgReviewStatusScreen", "EcgReviewStatus", new g3(nVar, ecgActivationActivity));
        androidx.navigation.compose.n.c(NavHost, "Step1", "Intro", new s3(nVar, ecgActivationActivity));
        androidx.navigation.compose.n.b(NavHost, "ActivationDocumentEu", null, null, null, null, null, null, new s1.a(true, -1161209723, new m(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.c(NavHost, "Instructions", "EcgMeasurement", new w2(nVar, ecgActivationActivity));
        androidx.navigation.compose.n.b(NavHost, "Done", null, null, null, null, null, null, new s1.a(true, -1852113692, new o(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.b(NavHost, "Support/{title}/{description}/{screenLog}", kotlin.collections.x.W(androidx.camera.camera2.internal.v1.d0("title", p.f51620a), androidx.camera.camera2.internal.v1.d0(HealthConstants.FoodInfo.DESCRIPTION, q.f51655a), androidx.camera.camera2.internal.v1.d0("screenLog", r.f51684a)), null, null, null, null, null, new s1.a(true, 1751949635, new t(ecgActivationActivity)), 124);
        androidx.navigation.compose.n.c(NavHost, "StateSelection", "UsStateSelection", new g4(nVar, ecgActivationActivity));
        androidx.navigation.compose.n.b(NavHost, "AcceptationTerms", null, null, null, null, null, null, new s1.a(true, 1061045666, new u(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.c(NavHost, "VideoCallIntro", "VideoCall", new l4(nVar, ecgActivationActivity));
        return nm0.y.f85009a;
    }
}

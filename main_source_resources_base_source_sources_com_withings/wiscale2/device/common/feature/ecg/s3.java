package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class s3 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51720a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51721b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51720a = ecgActivationActivity;
        this.f51721b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        EcgActivationActivity ecgActivationActivity = this.f51720a;
        androidx.navigation.compose.n.b(navigation, "Step1", null, null, null, null, null, null, new s1.a(true, -971154119, new n3(ecgActivationActivity)), 126);
        r8.n nVar = this.f51721b;
        androidx.navigation.compose.n.b(navigation, "Step2", null, null, null, null, null, null, new s1.a(true, 542776802, new p3(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "Step3", null, null, null, null, null, null, new s1.a(true, 1443844737, new r3(nVar, ecgActivationActivity)), 126);
        return nm0.y.f85009a;
    }
}

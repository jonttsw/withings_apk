package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class w2 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52079a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52080b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f52079a = ecgActivationActivity;
        this.f52080b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        r8.n nVar = this.f52080b;
        EcgActivationActivity ecgActivationActivity = this.f52079a;
        androidx.navigation.compose.n.b(navigation, "IntroForUs", null, null, null, null, null, null, new s1.a(true, 222975742, new l2(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "Instructions", null, null, null, null, null, null, new s1.a(true, -807320459, new m2(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "Video", null, null, null, null, null, null, new s1.a(true, -630992202, new r2(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "HeartbeatExplanations", null, null, null, null, null, null, new s1.a(true, -454663945, new t2(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "ReviewExplanations", null, null, null, null, null, null, new s1.a(true, -278335688, new v2(nVar, ecgActivationActivity)), 126);
        return nm0.y.f85009a;
    }
}

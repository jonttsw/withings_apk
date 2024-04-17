package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class g4 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51363a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51363a = ecgActivationActivity;
        this.f51364b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        r8.n nVar = this.f51364b;
        EcgActivationActivity ecgActivationActivity = this.f51363a;
        androidx.navigation.compose.n.b(navigation, "StateSelection", null, null, null, null, null, null, new s1.a(true, -180940170, new a4(nVar, ecgActivationActivity)), 126);
        xb.i.a(navigation, "StatesListBottomSheet", null, new s1.a(true, -1004497357, new f4(nVar, ecgActivationActivity)), 6);
        return nm0.y.f85009a;
    }
}

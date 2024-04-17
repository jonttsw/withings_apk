package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class bb extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51226b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f51225a = wBS08EcgActivationActivity;
        this.f51226b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        r8.n nVar = this.f51226b;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51225a;
        androidx.navigation.compose.n.b(navigation, "StateSelection", null, null, null, null, null, null, new s1.a(true, -2019916578, new va(nVar, wBS08EcgActivationActivity)), 126);
        xb.i.a(navigation, "StatesListBottomSheet", null, new s1.a(true, 2073313371, new ab(nVar, wBS08EcgActivationActivity)), 6);
        return nm0.y.f85009a;
    }
}

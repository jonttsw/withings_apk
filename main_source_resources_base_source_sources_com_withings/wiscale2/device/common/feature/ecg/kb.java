package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class kb extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51478a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51479b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51478a = wBS08EcgActivationActivity;
        this.f51479b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        WBS08EcgActivationViewModel R32;
        WBS08EcgActivationViewModel R33;
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51478a;
        R3 = wBS08EcgActivationActivity.R3();
        ib ibVar = new ib(R3);
        R32 = wBS08EcgActivationActivity.R3();
        jb jbVar = new jb(R32);
        R33 = wBS08EcgActivationActivity.R3();
        boolean booleanValue = ((Boolean) R33.Z0().getValue()).booleanValue();
        WBS08EcgActivationActivity.J3(this.f51478a, this.f51479b, booleanValue, ibVar, jbVar, aVar, 32776);
        return nm0.y.f85009a;
    }
}

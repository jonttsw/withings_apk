package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class hb extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51406b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51405a = wBS08EcgActivationActivity;
        this.f51406b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        WBS08EcgActivationViewModel R32;
        WBS08EcgActivationViewModel R33;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51405a;
        R3 = wBS08EcgActivationActivity.R3();
        boolean booleanValue = ((Boolean) R3.i1().getValue()).booleanValue();
        R32 = wBS08EcgActivationActivity.R3();
        fb fbVar = new fb(R32);
        R33 = wBS08EcgActivationActivity.R3();
        boolean booleanValue2 = ((Boolean) R33.Z0().getValue()).booleanValue();
        r8.n nVar = this.f51406b;
        WBS08EcgActivationActivity wBS08EcgActivationActivity2 = this.f51405a;
        WBS08EcgActivationActivity.H3(wBS08EcgActivationActivity2, nVar, booleanValue, booleanValue2, fbVar, new gb(nVar, wBS08EcgActivationActivity2), aVar, 262152);
        return nm0.y.f85009a;
    }
}

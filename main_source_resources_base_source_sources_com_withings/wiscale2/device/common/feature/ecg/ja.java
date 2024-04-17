package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class ja extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51453a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51454b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(0);
        this.f51453a = wBS08EcgActivationActivity;
        this.f51454b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationViewModel R3;
        String str;
        R3 = this.f51453a.R3();
        rq.b bVar = (rq.b) R3.G0().getValue();
        if (bVar != null) {
            str = bVar.c();
        } else {
            str = null;
        }
        r8.n nVar = this.f51454b;
        if (str != null) {
            androidx.navigation.e.L(nVar, "AcceptationTerms", null, 6);
        } else {
            androidx.navigation.e.L(nVar, "UsStateSelection", null, 6);
        }
        return nm0.y.f85009a;
    }
}

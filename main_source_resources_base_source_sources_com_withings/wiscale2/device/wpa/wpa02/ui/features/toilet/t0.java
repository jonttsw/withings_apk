package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;
/* compiled from: Wpa02ToiletInstallationActivity.kt */
/* loaded from: classes5.dex */
final class t0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02ToiletInstallationActivity f55458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity) {
        super(0);
        this.f55458a = wpa02ToiletInstallationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity = this.f55458a;
        ch.d dVar = wpa02ToiletInstallationActivity.f55339h;
        if (dVar != null) {
            wpa02ToiletInstallationActivity.startActivity(ch.m.b(dVar.c(), wpa02ToiletInstallationActivity, Wpa02ToiletInstallationActivity.C3(wpa02ToiletInstallationActivity)));
            wpa02ToiletInstallationActivity.finish();
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}

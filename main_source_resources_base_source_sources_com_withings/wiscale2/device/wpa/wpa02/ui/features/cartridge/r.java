package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.lifecycle.h1;
import com.withings.device.Device;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import zg.c;
/* compiled from: Wpa02CartridgeActivationActivity.kt */
/* loaded from: classes5.dex */
final class r extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02CartridgeActivationActivity f55212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity) {
        super(0);
        this.f55212a = wpa02CartridgeActivationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity = this.f55212a;
        b0 D3 = Wpa02CartridgeActivationActivity.D3(wpa02CartridgeActivationActivity);
        D3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(D3), Dispatchers.getIO(), null, new j0(D3, null), 2, null);
        Wpa02CartridgeActivationActivity.D3(wpa02CartridgeActivationActivity).F0();
        ch.d dVar = wpa02CartridgeActivationActivity.f55111f;
        if (dVar != null) {
            ch.m c11 = dVar.c();
            Device device = Wpa02CartridgeActivationActivity.C3(wpa02CartridgeActivationActivity);
            ((ah.e0) c11).getClass();
            kotlin.jvm.internal.u.j(device, "device");
            wpa02CartridgeActivationActivity.startActivity(c.a.f110626a.h(wpa02CartridgeActivationActivity, device, false));
            wpa02CartridgeActivationActivity.finish();
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}

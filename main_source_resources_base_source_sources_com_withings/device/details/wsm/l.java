package com.withings.device.details.wsm;

import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class l extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37349a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ao.k f37350b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, ao.k kVar) {
        super(0);
        this.f37349a = iVar;
        this.f37350b = kVar;
    }

    @Override // ym0.a
    public final y invoke() {
        int i11 = i.f37323r;
        i iVar = this.f37349a;
        iVar.getClass();
        ao.k kVar = this.f37350b;
        Device value = kVar.k0().getValue();
        if (value != null && value.isExtraSensitivityEnabled()) {
            Device value2 = kVar.k0().getValue();
            if (value2 != null) {
                value2.setExtraSensitivityEnabled(false);
                kVar.O0(value2);
            }
        } else {
            qc.b bVar = new qc.b(iVar.requireContext());
            bVar.C(C1987R.string.wsm02Sensivity_popupTitle);
            bVar.g(C1987R.string.wsm02Sensivity_popupMessage);
            bVar.w(C1987R.string.wsm02Sensivity_popupSecondaryButton, new ao.h(0)).z(C1987R.string.wsm02Sensivity_popupMainButton, new ao.i(kVar, 0)).s();
        }
        return y.f85009a;
    }
}

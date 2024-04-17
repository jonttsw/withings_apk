package com.withings.device.details.scale;

import android.widget.Toast;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class o extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Device f37004a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w f37005b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f37006c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Device device, w wVar, k kVar) {
        super(1);
        this.f37004a = device;
        this.f37005b = wVar;
        this.f37006c = kVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Device device = this.f37004a;
        device.setImpedanceEnabled(booleanValue);
        this.f37005b.O0(device);
        Toast.makeText(this.f37006c.requireContext(), (int) C1987R.string._WAM_MODIF_ALERT_, 1).show();
        return nm0.y.f85009a;
    }
}

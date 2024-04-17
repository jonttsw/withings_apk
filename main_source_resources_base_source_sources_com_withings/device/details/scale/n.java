package com.withings.device.details.scale;

import android.widget.Toast;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class n extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Device f37001a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w f37002b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f37003c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Device device, w wVar, k kVar) {
        super(1);
        this.f37001a = device;
        this.f37002b = wVar;
        this.f37003c = kVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Device device = this.f37001a;
        device.setDebugEnabled(booleanValue);
        this.f37002b.O0(device);
        Toast.makeText(this.f37003c.requireContext(), (int) C1987R.string._WAM_MODIF_ALERT_, 1).show();
        return nm0.y.f85009a;
    }
}

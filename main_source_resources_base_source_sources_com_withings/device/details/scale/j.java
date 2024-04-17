package com.withings.device.details.scale;

import android.content.Context;
import com.withings.device.Device;
import com.withings.device.details.elabel.ElabelDeviceActivity;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class j extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f36946a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Device f36947b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Device device) {
        super(0);
        this.f36946a = kVar;
        this.f36947b = device;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ElabelDeviceActivity.a aVar = ElabelDeviceActivity.f36793b;
        k kVar = this.f36946a;
        Context requireContext = kVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        aVar.getClass();
        kVar.startActivity(ElabelDeviceActivity.a.a(requireContext, this.f36947b));
        return nm0.y.f85009a;
    }
}

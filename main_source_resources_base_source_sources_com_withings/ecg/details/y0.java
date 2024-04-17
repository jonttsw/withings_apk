package com.withings.ecg.details;

import android.content.Context;
import com.withings.device.Device;
/* compiled from: EcgInReviewFragment.kt */
/* loaded from: classes3.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.p<Long, Device, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a1 f38363a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var) {
        super(2);
        this.f38363a = a1Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(Long l5, Device device) {
        long longValue = l5.longValue();
        Device device2 = device;
        kotlin.jvm.internal.u.j(device2, "device");
        a1 a1Var = this.f38363a;
        Context requireContext = a1Var.requireContext();
        ch.d dVar = a1Var.f38090h;
        if (dVar != null) {
            ch.c v11 = dVar.v();
            Context requireContext2 = a1Var.requireContext();
            long id2 = device2.getId();
            kotlin.jvm.internal.u.g(requireContext2);
            requireContext.startActivity(((ah.l) v11).h(requireContext2, longValue, id2));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}

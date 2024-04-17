package com.withings.measurements.ui;

import android.content.Context;
/* compiled from: MeasurementsFragment.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class c2 extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c2(i2 i2Var) {
        super(0, i2Var, i2.class, "onDeviceClicked", "onDeviceClicked()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        i2 i2Var = (i2) this.receiver;
        int i11 = i2.f42049k;
        ch.m c11 = i2Var.A1().c();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        i2Var.startActivity(((ah.e0) c11).d(requireContext));
        return nm0.y.f85009a;
    }
}

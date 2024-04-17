package com.withings.measurements.ui;

import android.content.Context;
/* compiled from: MeasurementsFragment.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class w1 extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w1(i2 i2Var) {
        super(0, i2Var, i2.class, "onAdClick", "onAdClick()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        i2 i2Var = (i2) this.receiver;
        int i11 = i2.f42049k;
        ah.c o11 = i2Var.A1().o();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        o11.getClass();
        i2Var.startActivity(ah.c.a(requireContext));
        return nm0.y.f85009a;
    }
}

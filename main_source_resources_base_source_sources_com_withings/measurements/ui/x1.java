package com.withings.measurements.ui;

import android.content.Context;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.wiscale2.C1987R;
/* compiled from: MeasurementsFragment.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class x1 extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x1(i2 i2Var) {
        super(0, i2Var, i2.class, "onHealthScoreInfoClicked", "onHealthScoreInfoClicked()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        i2 i2Var = (i2) this.receiver;
        int i11 = i2.f42049k;
        i2Var.getClass();
        int i12 = v70.a.f103433b;
        v70.a.d("learn_more_about_his", "learn_more_about_his", kotlin.collections.s0.i(new nm0.j("health_vertical", null)), true);
        ch.l t11 = i2Var.A1().t();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        String string = i2Var.requireContext().getString(C1987R.string.healthImprovementScore_help_url);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        i2Var.startActivity(ch.l.a(t11, requireContext, null, null, string, new HMWebViewDelegate(), 6));
        return nm0.y.f85009a;
    }
}

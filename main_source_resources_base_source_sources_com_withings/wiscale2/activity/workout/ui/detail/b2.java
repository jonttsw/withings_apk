package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class b2 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49122a;

    public b2(x1 x1Var) {
        this.f49122a = x1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Integer value;
        view.removeOnLayoutChangeListener(this);
        x1 x1Var = this.f49122a;
        androidx.lifecycle.k0<Integer> Z1 = x1Var.Z1();
        if (Z1 != null && (value = Z1.getValue()) != null) {
            x1Var.Y1().f99144c.setScrollY(value.intValue());
        }
    }
}

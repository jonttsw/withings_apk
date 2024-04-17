package com.withings.wiscale2.device.common.ui;

import com.withings.views.view.ToggleCellView;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y0 f54133a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(y0 y0Var) {
        super(1);
        this.f54133a = y0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        tb0.p2 w12;
        tb0.p2 w13;
        tb0.p2 w14;
        Boolean bool2 = bool;
        y0 y0Var = this.f54133a;
        w12 = y0Var.w1();
        w12.f99419b.y();
        w13 = y0Var.w1();
        ToggleCellView toggleCellView = w13.f99419b;
        kotlin.jvm.internal.u.g(bool2);
        toggleCellView.setChecked(bool2.booleanValue());
        w14 = y0Var.w1();
        w14.f99422e.setEnabled(bool2.booleanValue());
        return nm0.y.f85009a;
    }
}

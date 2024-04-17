package com.withings.wiscale2.device.common.ui;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
final class a1 extends kotlin.jvm.internal.w implements ym0.l<k2, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y0 f53774a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var) {
        super(1);
        this.f53774a = y0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(k2 k2Var) {
        tb0.p2 w12;
        k2 k2Var2 = k2Var;
        y0 y0Var = this.f53774a;
        w12 = y0Var.w1();
        w12.f99422e.setValue((k2Var2 == null || (r3 = y0Var.getString(k2Var2.c())) == null) ? "" : "");
        return nm0.y.f85009a;
    }
}

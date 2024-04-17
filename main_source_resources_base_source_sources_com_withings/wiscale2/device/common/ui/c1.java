package com.withings.wiscale2.device.common.ui;

import android.view.View;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
final class c1 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y0 f53786a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(y0 y0Var) {
        super(1);
        this.f53786a = y0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        tb0.p2 w12;
        tb0.p2 w13;
        tb0.p2 w14;
        boolean booleanValue = bool.booleanValue();
        final y0 y0Var = this.f53786a;
        w12 = y0Var.w1();
        w12.f99422e.setShowRightValueIcon(booleanValue);
        if (booleanValue) {
            w14 = y0Var.w1();
            w14.f99422e.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.device.common.ui.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y0 this$0 = y0.this;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    y0.v1(this$0);
                }
            });
        } else {
            w13 = y0Var.w1();
            w13.f99422e.setOnClickListener(null);
        }
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.wpm.ui;

import com.withings.measure.detail.ui.views.AddDetailsView;
/* compiled from: Wpm02ResultScreenFragment.kt */
/* loaded from: classes5.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0 f55731a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var) {
        super(1);
        this.f55731a = c0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        AddDetailsView addDetailsView;
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        c0 c0Var = this.f55731a;
        addDetailsView = c0Var.f55716n;
        if (addDetailsView != null) {
            addDetailsView.setText(it);
            c0.B1(c0Var, it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("commentView");
        throw null;
    }
}

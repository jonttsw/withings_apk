package com.withings.wiscale2.device.common.ui;

import com.withings.views.view.ToggleCellView;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
public final class d1 implements com.withings.views.view.m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y0 f53790a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(y0 y0Var) {
        this.f53790a = y0Var;
    }

    @Override // com.withings.views.view.m
    public final void onCellSwitched(ToggleCellView toggleView, boolean z5) {
        kotlin.jvm.internal.u.j(toggleView, "toggleView");
        y0.u1(this.f53790a).i0(z5);
    }
}

package com.withings.wiscale2.device.common.screen.ui;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class r implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity f53413a;

    public r(ScreenSelectionActivity screenSelectionActivity) {
        this.f53413a = screenSelectionActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        ScreenSelectionActivity screenSelectionActivity = this.f53413a;
        c2 c2Var = screenSelectionActivity.f53128h;
        if (c2Var != null) {
            return c2Var.a(ScreenSelectionActivity.C3(screenSelectionActivity), ScreenSelectionActivity.A3(screenSelectionActivity), ScreenSelectionActivity.E3(screenSelectionActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}

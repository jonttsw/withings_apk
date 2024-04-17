package com.withings.ecg.heartsound;

import android.view.View;
/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class f0 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f38468a;

    public f0(d0 d0Var) {
        this.f38468a = d0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        view.removeOnLayoutChangeListener(this);
        d0 d0Var = this.f38468a;
        d0Var.f38454a.animate().alpha(1.0f).setDuration(250L).setListener(new g0(d0Var));
    }
}

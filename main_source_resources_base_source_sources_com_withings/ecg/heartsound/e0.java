package com.withings.ecg.heartsound;

import android.view.View;
/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class e0 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f38465a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f38466b;

    public e0(d0 d0Var, long j5) {
        this.f38465a = d0Var;
        this.f38466b = j5;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        view.removeOnLayoutChangeListener(this);
        long j5 = this.f38466b;
        d0.g(this.f38465a, view.getMeasuredWidth(), j5);
    }
}

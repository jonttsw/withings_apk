package com.withings.ecg.heartsound;

import android.view.View;
/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class c0 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f38425a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f38426b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f38427c = 5000.0f;

    public c0(d0 d0Var) {
        this.f38425a = d0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        view.removeOnLayoutChangeListener(this);
        this.f38425a.f38454a.M(this.f38426b, this.f38427c);
    }
}

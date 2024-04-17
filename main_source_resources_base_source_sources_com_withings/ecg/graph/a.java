package com.withings.ecg.graph;

import android.view.View;
/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgLineChart f38395a;

    public a(EcgLineChart ecgLineChart) {
        this.f38395a = ecgLineChart;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        view.removeOnLayoutChangeListener(this);
        EcgLineChart ecgLineChart = this.f38395a;
        ecgLineChart.animate().alpha(1.0f).setDuration(250L).setListener(new b(ecgLineChart));
    }
}

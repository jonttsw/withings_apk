package com.withings.ecg.fullscreen;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.withings.ecg.graph.EcgLineChart;
/* compiled from: FullScreenEcgActivity.kt */
/* loaded from: classes3.dex */
public final class a implements EcgLineChart.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FullScreenEcgActivity f38382a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FullScreenEcgActivity fullScreenEcgActivity) {
        this.f38382a = fullScreenEcgActivity;
    }

    @Override // com.withings.ecg.graph.EcgLineChart.c
    public final void a(boolean z5) {
        int i11;
        FloatingActionButton D3 = FullScreenEcgActivity.D3(this.f38382a);
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        D3.setVisibility(i11);
    }
}

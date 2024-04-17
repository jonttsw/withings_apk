package com.withings.measure.detail.ui.screen;

import android.content.Context;
/* compiled from: Hilt_MeasureDetailActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_MeasureDetailActivity f41759a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_MeasureDetailActivity hilt_MeasureDetailActivity) {
        this.f41759a = hilt_MeasureDetailActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f41759a.inject();
    }
}

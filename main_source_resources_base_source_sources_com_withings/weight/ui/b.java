package com.withings.weight.ui;

import android.content.Context;
/* compiled from: Hilt_SegmentalBodyCompositionActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SegmentalBodyCompositionActivity f47613a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_SegmentalBodyCompositionActivity hilt_SegmentalBodyCompositionActivity) {
        this.f47613a = hilt_SegmentalBodyCompositionActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f47613a.inject();
    }
}

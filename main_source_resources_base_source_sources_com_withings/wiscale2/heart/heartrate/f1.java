package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
/* compiled from: Hilt_HRMeasuresListActivity.java */
/* loaded from: classes5.dex */
final class f1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HRMeasuresListActivity f57647a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(Hilt_HRMeasuresListActivity hilt_HRMeasuresListActivity) {
        this.f57647a = hilt_HRMeasuresListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57647a.inject();
    }
}

package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.content.Context;
/* compiled from: Hilt_AddMeasureActivity.java */
/* loaded from: classes5.dex */
final class i1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AddMeasureActivity f58197a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(Hilt_AddMeasureActivity hilt_AddMeasureActivity) {
        this.f58197a = hilt_AddMeasureActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f58197a.inject();
    }
}

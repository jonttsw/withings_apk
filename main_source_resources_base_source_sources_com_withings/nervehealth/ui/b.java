package com.withings.nervehealth.ui;

import android.content.Context;
/* compiled from: Hilt_NerveHealthMeasureListActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_NerveHealthMeasureListActivity f42488a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_NerveHealthMeasureListActivity hilt_NerveHealthMeasureListActivity) {
        this.f42488a = hilt_NerveHealthMeasureListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f42488a.inject();
    }
}

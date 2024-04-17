package com.withings.wiscale2.heart.bloodpressure;

import android.content.Context;
/* compiled from: Hilt_BloodPressureMeasureListActivity.java */
/* loaded from: classes5.dex */
final class m0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_BloodPressureMeasureListActivity f57439a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(Hilt_BloodPressureMeasureListActivity hilt_BloodPressureMeasureListActivity) {
        this.f57439a = hilt_BloodPressureMeasureListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57439a.inject();
    }
}

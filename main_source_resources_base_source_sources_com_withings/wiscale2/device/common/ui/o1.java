package com.withings.wiscale2.device.common.ui;

import android.content.Context;
/* compiled from: Hilt_MedicalFeatureListActivity.java */
/* loaded from: classes5.dex */
final class o1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_MedicalFeatureListActivity f54035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(Hilt_MedicalFeatureListActivity hilt_MedicalFeatureListActivity) {
        this.f54035a = hilt_MedicalFeatureListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54035a.inject();
    }
}

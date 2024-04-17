package com.withings.medicalreport.ui;

import android.content.Context;
/* compiled from: Hilt_MedicalReportActivity.java */
/* loaded from: classes4.dex */
final class o implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_MedicalReportActivity f42263a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Hilt_MedicalReportActivity hilt_MedicalReportActivity) {
        this.f42263a = hilt_MedicalReportActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f42263a.inject();
    }
}

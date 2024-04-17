package com.withings.ecg.pdf;

import android.content.Context;
/* compiled from: Hilt_PDFGenerationActivity.java */
/* loaded from: classes3.dex */
final class e implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_PDFGenerationActivity f38765a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Hilt_PDFGenerationActivity hilt_PDFGenerationActivity) {
        this.f38765a = hilt_PDFGenerationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f38765a.inject();
    }
}

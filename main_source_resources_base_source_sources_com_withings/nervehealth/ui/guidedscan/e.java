package com.withings.nervehealth.ui.guidedscan;

import android.content.Context;
/* compiled from: Hilt_NerveHealthGuidedScanActivity.java */
/* loaded from: classes4.dex */
final class e implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_NerveHealthGuidedScanActivity f42606a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Hilt_NerveHealthGuidedScanActivity hilt_NerveHealthGuidedScanActivity) {
        this.f42606a = hilt_NerveHealthGuidedScanActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f42606a.inject();
    }
}

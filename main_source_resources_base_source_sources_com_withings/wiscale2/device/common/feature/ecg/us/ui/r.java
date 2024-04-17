package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import android.content.Context;
/* compiled from: Hilt_EcgReviewActivity.java */
/* loaded from: classes5.dex */
final class r implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EcgReviewActivity f52053a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Hilt_EcgReviewActivity hilt_EcgReviewActivity) {
        this.f52053a = hilt_EcgReviewActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52053a.inject();
    }
}

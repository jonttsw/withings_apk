package com.withings.ecg.details;

import android.content.Context;
/* compiled from: Hilt_EcgResultActivity.java */
/* loaded from: classes3.dex */
final class s2 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EcgResultActivity f38307a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(Hilt_EcgResultActivity hilt_EcgResultActivity) {
        this.f38307a = hilt_EcgResultActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f38307a.inject();
    }
}

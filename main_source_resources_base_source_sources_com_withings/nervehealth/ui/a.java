package com.withings.nervehealth.ui;

import android.content.Context;
/* compiled from: Hilt_NerveHealthActivity.java */
/* loaded from: classes4.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_NerveHealthActivity f42486a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_NerveHealthActivity hilt_NerveHealthActivity) {
        this.f42486a = hilt_NerveHealthActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f42486a.inject();
    }
}

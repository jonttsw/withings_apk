package com.withings.overview.ui;

import android.content.Context;
/* compiled from: Hilt_StartTrackingActivity.java */
/* loaded from: classes4.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_StartTrackingActivity f43352a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_StartTrackingActivity hilt_StartTrackingActivity) {
        this.f43352a = hilt_StartTrackingActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f43352a.inject();
    }
}

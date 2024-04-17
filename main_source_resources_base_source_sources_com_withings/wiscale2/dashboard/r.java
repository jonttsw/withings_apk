package com.withings.wiscale2.dashboard;

import android.content.Context;
/* compiled from: Hilt_DashboardActivity.java */
/* loaded from: classes4.dex */
final class r implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_DashboardActivity f50602a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Hilt_DashboardActivity hilt_DashboardActivity) {
        this.f50602a = hilt_DashboardActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f50602a.inject();
    }
}

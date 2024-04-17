package com.withings.wiscale2.accountV2.ui;

import android.content.Context;
/* compiled from: Hilt_LoggedOutActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_LoggedOutActivity f48207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_LoggedOutActivity hilt_LoggedOutActivity) {
        this.f48207a = hilt_LoggedOutActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48207a.inject();
    }
}

package com.withings.wiscale2.settings;

import android.content.Context;
/* compiled from: Hilt_TracesLogsActivity.java */
/* loaded from: classes5.dex */
final class h0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_TracesLogsActivity f60025a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Hilt_TracesLogsActivity hilt_TracesLogsActivity) {
        this.f60025a = hilt_TracesLogsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60025a.inject();
    }
}

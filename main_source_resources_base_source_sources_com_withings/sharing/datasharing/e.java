package com.withings.sharing.datasharing;

import android.content.Context;
/* compiled from: Hilt_DataSharingActivity.java */
/* loaded from: classes4.dex */
final class e implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_DataSharingActivity f44086a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Hilt_DataSharingActivity hilt_DataSharingActivity) {
        this.f44086a = hilt_DataSharingActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f44086a.inject();
    }
}

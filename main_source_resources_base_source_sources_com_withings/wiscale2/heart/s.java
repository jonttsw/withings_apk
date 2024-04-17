package com.withings.wiscale2.heart;

import android.content.Context;
/* compiled from: Hilt_HeartHistoryActivity.java */
/* loaded from: classes5.dex */
final class s implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HeartHistoryActivity f57789a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Hilt_HeartHistoryActivity hilt_HeartHistoryActivity) {
        this.f57789a = hilt_HeartHistoryActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57789a.inject();
    }
}

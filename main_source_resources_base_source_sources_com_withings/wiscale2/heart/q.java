package com.withings.wiscale2.heart;

import android.content.Context;
/* compiled from: Hilt_HeartDetailActivity.java */
/* loaded from: classes5.dex */
final class q implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f57784a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar) {
        this.f57784a = rVar;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57784a.inject();
    }
}

package com.withings.wiscale2.heart.afib;

import android.content.Context;
/* compiled from: Hilt_AFibMeasuresListActivity.java */
/* loaded from: classes5.dex */
final class r0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AFibMeasuresListActivity f57234a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(Hilt_AFibMeasuresListActivity hilt_AFibMeasuresListActivity) {
        this.f57234a = hilt_AFibMeasuresListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57234a.inject();
    }
}

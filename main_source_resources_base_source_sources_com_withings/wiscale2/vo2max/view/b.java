package com.withings.wiscale2.vo2max.view;

import android.content.Context;
/* compiled from: Hilt_Vo2maxActivity.java */
/* loaded from: classes5.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Vo2maxActivity f62690a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_Vo2maxActivity hilt_Vo2maxActivity) {
        this.f62690a = hilt_Vo2maxActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62690a.inject();
    }
}

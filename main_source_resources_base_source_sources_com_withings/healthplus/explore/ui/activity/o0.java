package com.withings.healthplus.explore.ui.activity;

import android.content.Context;
/* compiled from: Hilt_ExploreTabActivity.java */
/* loaded from: classes3.dex */
final class o0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ExploreTabActivity f40332a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(Hilt_ExploreTabActivity hilt_ExploreTabActivity) {
        this.f40332a = hilt_ExploreTabActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f40332a.inject();
    }
}

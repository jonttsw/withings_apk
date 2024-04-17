package com.withings.weight.ui.limbExplore;

import android.content.Context;
/* compiled from: Hilt_SegmentalLimbExploreActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SegmentalLimbExploreActivity f47681a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_SegmentalLimbExploreActivity hilt_SegmentalLimbExploreActivity) {
        this.f47681a = hilt_SegmentalLimbExploreActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f47681a.inject();
    }
}

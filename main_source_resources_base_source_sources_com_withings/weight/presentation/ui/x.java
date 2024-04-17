package com.withings.weight.presentation.ui;

import android.content.Context;
/* compiled from: Hilt_WeightExploreDataActivity.java */
/* loaded from: classes4.dex */
final class x implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WeightExploreDataActivity f47307a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(Hilt_WeightExploreDataActivity hilt_WeightExploreDataActivity) {
        this.f47307a = hilt_WeightExploreDataActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f47307a.inject();
    }
}

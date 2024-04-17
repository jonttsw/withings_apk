package com.withings.healthscore.ui.exploredata;

import android.content.Context;
/* compiled from: Hilt_HealthScoreExploreDataActivity.java */
/* loaded from: classes3.dex */
final class j implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HealthScoreExploreDataActivity f40581a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Hilt_HealthScoreExploreDataActivity hilt_HealthScoreExploreDataActivity) {
        this.f40581a = hilt_HealthScoreExploreDataActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f40581a.inject();
    }
}

package com.withings.wiscale2.activity.workout.category.ui;

import android.content.Context;
/* compiled from: Hilt_ChooseWorkoutCategoryActivity.java */
/* loaded from: classes4.dex */
final class q implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ChooseWorkoutCategoryActivity f48709a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Hilt_ChooseWorkoutCategoryActivity hilt_ChooseWorkoutCategoryActivity) {
        this.f48709a = hilt_ChooseWorkoutCategoryActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48709a.inject();
    }
}

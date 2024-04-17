package com.withings.wiscale2.measure.goal.ui;

import android.view.View;
import android.view.animation.Animation;
import com.withings.wiscale2.measure.goal.ui.WeightGoalTargetFragment;
/* compiled from: WeightGoalTargetFragment.java */
/* loaded from: classes5.dex */
final class l implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightGoalTargetFragment.CustomSetValueView f58437a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(WeightGoalTargetFragment.CustomSetValueView customSetValueView) {
        this.f58437a = customSetValueView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        View view;
        view = this.f58437a.f58415r;
        view.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

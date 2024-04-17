package com.withings.alarm.ui;

import android.view.View;
import android.view.animation.Animation;
/* compiled from: SetAlarmFragment.java */
/* loaded from: classes3.dex */
final class o implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetAlarmFragment f31201a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(SetAlarmFragment setAlarmFragment) {
        this.f31201a = setAlarmFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view;
        view = this.f31201a.f31117g;
        view.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

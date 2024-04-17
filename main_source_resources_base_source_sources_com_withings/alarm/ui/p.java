package com.withings.alarm.ui;

import android.view.View;
import android.view.animation.Animation;
/* compiled from: SetAlarmFragment.java */
/* loaded from: classes3.dex */
final class p implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetAlarmFragment f31202a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(SetAlarmFragment setAlarmFragment) {
        this.f31202a = setAlarmFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view;
        AlarmRepeatView alarmRepeatView;
        SetAlarmFragment setAlarmFragment = this.f31202a;
        view = setAlarmFragment.f31118h;
        view.setVisibility(8);
        alarmRepeatView = setAlarmFragment.f31119i;
        alarmRepeatView.d();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

package com.withings.alarm.ui;

import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
/* compiled from: AlarmRepeatView.java */
/* loaded from: classes3.dex */
final class b implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f31146a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(TextView textView) {
        this.f31146a = textView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f31146a.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

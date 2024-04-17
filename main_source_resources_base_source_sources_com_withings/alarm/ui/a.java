package com.withings.alarm.ui;

import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
/* compiled from: AlarmRepeatView.java */
/* loaded from: classes3.dex */
final class a implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f31145a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(TextView textView) {
        this.f31145a = textView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f31145a.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

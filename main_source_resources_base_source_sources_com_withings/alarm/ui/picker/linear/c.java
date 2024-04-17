package com.withings.alarm.ui.picker.linear;

import android.view.animation.Animation;
/* compiled from: LinearAlarmPicker.java */
/* loaded from: classes3.dex */
final class c implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LinearAlarmPicker f31267a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(LinearAlarmPicker linearAlarmPicker) {
        this.f31267a = linearAlarmPicker;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f31267a.f31240f = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        LinearAlarmPicker linearAlarmPicker = this.f31267a;
        linearAlarmPicker.f31241g = true;
        linearAlarmPicker.f31242h.setVisibility(0);
        linearAlarmPicker.requestLayout();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

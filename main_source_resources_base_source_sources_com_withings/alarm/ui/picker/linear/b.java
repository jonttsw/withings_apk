package com.withings.alarm.ui.picker.linear;

import android.view.animation.Animation;
/* compiled from: LinearAlarmPicker.java */
/* loaded from: classes3.dex */
final class b implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LinearAlarmPicker f31266a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LinearAlarmPicker linearAlarmPicker) {
        this.f31266a = linearAlarmPicker;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        LinearAlarmPicker linearAlarmPicker = this.f31266a;
        linearAlarmPicker.f31243i.p();
        linearAlarmPicker.o();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

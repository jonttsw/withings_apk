package com.withings.views.view;

import android.view.View;
import android.view.animation.Animation;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetValueBackground.java */
/* loaded from: classes4.dex */
public final class i implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetValueBackground f46762a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(SetValueBackground setValueBackground) {
        this.f46762a = setValueBackground;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        List<View> list;
        list = this.f46762a.f46682b;
        for (View view : list) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

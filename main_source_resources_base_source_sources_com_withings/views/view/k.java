package com.withings.views.view;

import android.view.View;
import android.view.animation.Animation;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetValueView.java */
/* loaded from: classes4.dex */
public final class k implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetValueView f46764a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(SetValueView setValueView) {
        this.f46764a = setValueView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Map map;
        map = this.f46764a.f46698e;
        for (View view : map.keySet()) {
            view.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

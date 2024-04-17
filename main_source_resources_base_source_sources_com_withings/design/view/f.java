package com.withings.design.view;

import android.view.View;
import android.view.animation.Animation;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetValueBackground.java */
/* loaded from: classes3.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetValueBackground f36463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(SetValueBackground setValueBackground) {
        this.f36463a = setValueBackground;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        List<View> list;
        list = this.f36463a.f36368b;
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

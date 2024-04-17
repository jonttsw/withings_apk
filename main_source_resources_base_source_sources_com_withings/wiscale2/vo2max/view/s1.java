package com.withings.wiscale2.vo2max.view;

import android.animation.Animator;
/* compiled from: Animator.kt */
/* loaded from: classes5.dex */
public final class s1 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2maxHeaderView f62830a;

    public s1(Vo2maxHeaderView vo2maxHeaderView) {
        this.f62830a = vo2maxHeaderView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Vo2maxHeaderView.c(this.f62830a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

package com.withings.wiscale2.sections;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* loaded from: classes5.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FastScroller f59613a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(FastScroller fastScroller) {
        this.f59613a = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        FastScroller fastScroller = this.f59613a;
        fastScroller.f59590k.setVisibility(8);
        fastScroller.f59585f = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FastScroller fastScroller = this.f59613a;
        fastScroller.f59590k.setVisibility(8);
        fastScroller.f59585f = null;
    }
}

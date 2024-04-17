package com.withings.design.sections;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FastScroller f36129a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(FastScroller fastScroller) {
        this.f36129a = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        FastScroller fastScroller = this.f36129a;
        fastScroller.f36110k.setVisibility(8);
        fastScroller.f36105f = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FastScroller fastScroller = this.f36129a;
        fastScroller.f36110k.setVisibility(8);
        fastScroller.f36105f = null;
    }
}

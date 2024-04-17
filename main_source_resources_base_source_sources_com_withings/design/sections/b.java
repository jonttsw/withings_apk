package com.withings.design.sections;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* compiled from: FastScroller.java */
/* loaded from: classes3.dex */
final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FastScroller f36128a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FastScroller fastScroller) {
        this.f36128a = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        TextView textView;
        super.onAnimationCancel(animator);
        FastScroller fastScroller = this.f36128a;
        textView = fastScroller.f36107h;
        textView.setVisibility(8);
        fastScroller.f36106g = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        super.onAnimationEnd(animator);
        FastScroller fastScroller = this.f36128a;
        textView = fastScroller.f36107h;
        textView.setVisibility(8);
        fastScroller.f36106g = null;
    }
}

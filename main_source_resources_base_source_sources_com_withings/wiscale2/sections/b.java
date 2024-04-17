package com.withings.wiscale2.sections;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* compiled from: FastScroller.java */
/* loaded from: classes5.dex */
final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FastScroller f59612a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FastScroller fastScroller) {
        this.f59612a = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        TextView textView;
        super.onAnimationCancel(animator);
        FastScroller fastScroller = this.f59612a;
        textView = fastScroller.f59587h;
        textView.setVisibility(8);
        fastScroller.f59586g = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        super.onAnimationEnd(animator);
        FastScroller fastScroller = this.f59612a;
        textView = fastScroller.f59587h;
        textView.setVisibility(8);
        fastScroller.f59586g = null;
    }
}

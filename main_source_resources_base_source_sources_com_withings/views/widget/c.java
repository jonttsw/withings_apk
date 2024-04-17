package com.withings.views.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InkPageIndicator.java */
/* loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InkPageIndicator f46831a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(InkPageIndicator inkPageIndicator) {
        this.f46831a = inkPageIndicator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f46831a.f46792q = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f46831a.f46792q = false;
    }
}

package com.withings.views.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InkPageIndicator.java */
/* loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InkPageIndicator f46759a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(InkPageIndicator inkPageIndicator) {
        this.f46759a = inkPageIndicator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InkPageIndicator inkPageIndicator = this.f46759a;
        inkPageIndicator.u();
        inkPageIndicator.f46660x = false;
    }
}

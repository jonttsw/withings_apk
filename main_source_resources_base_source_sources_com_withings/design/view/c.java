package com.withings.design.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InkPageIndicator.java */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InkPageIndicator f36460a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(InkPageIndicator inkPageIndicator) {
        this.f36460a = inkPageIndicator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InkPageIndicator inkPageIndicator = this.f36460a;
        inkPageIndicator.u();
        inkPageIndicator.f36334x = false;
    }
}

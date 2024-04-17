package com.withings.views.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InkPageIndicator.java */
/* loaded from: classes4.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InkPageIndicator f46829a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InkPageIndicator inkPageIndicator) {
        this.f46829a = inkPageIndicator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InkPageIndicator inkPageIndicator = this.f46829a;
        inkPageIndicator.u();
        inkPageIndicator.f46799x = false;
    }
}

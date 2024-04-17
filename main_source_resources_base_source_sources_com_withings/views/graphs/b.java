package com.withings.views.graphs;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphPopupView.java */
/* loaded from: classes4.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GraphPopupView f46459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(GraphPopupView graphPopupView) {
        this.f46459a = graphPopupView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        GraphPopupView graphPopupView = this.f46459a;
        graphPopupView.L0 = 0;
        graphPopupView.M0 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        GraphPopupView graphPopupView = this.f46459a;
        graphPopupView.L0 = 56;
        graphPopupView.M0 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

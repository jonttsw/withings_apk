package com.withings.views.graphs;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphPopupView.java */
/* loaded from: classes4.dex */
public final class a implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GraphPopupView f46458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(GraphPopupView graphPopupView) {
        this.f46458a = graphPopupView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        GraphPopupView graphPopupView = this.f46458a;
        graphPopupView.I0 = 0;
        graphPopupView.K0 = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i11;
        int i12;
        GraphPopupView graphPopupView = this.f46458a;
        i11 = graphPopupView.H0;
        graphPopupView.I0 = i11;
        i12 = graphPopupView.J0;
        graphPopupView.K0 = i12;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

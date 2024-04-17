package com.withings.wiscale2.heart.bloodpressure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import tb0.x1;
/* compiled from: BloodPressureHistoryFragment.kt */
/* loaded from: classes5.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f57429a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(k kVar) {
        this.f57429a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        x1 C1;
        kotlin.jvm.internal.u.j(animation, "animation");
        k kVar = this.f57429a;
        if (kVar.isVisible()) {
            C1 = kVar.C1();
            C1.f99624o.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        x1 C1;
        kotlin.jvm.internal.u.j(animation, "animation");
        k kVar = this.f57429a;
        if (kVar.isVisible()) {
            C1 = kVar.C1();
            C1.f99624o.setAlpha(1.0f);
        }
    }
}

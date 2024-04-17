package com.withings.ecg.heartsound;

import android.animation.Animator;
/* compiled from: HeartSoundGraph.kt */
/* loaded from: classes3.dex */
public final class g0 extends qq.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f38471a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(d0 d0Var) {
        this.f38471a = d0Var;
    }

    @Override // qq.a, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.u.j(animation, "animation");
        this.f38471a.f38454a.I(0.0f);
    }
}

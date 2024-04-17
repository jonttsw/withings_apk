package com.withings.ecg.heartsound;

import android.animation.Animator;
/* compiled from: HeartSoundGraph.kt */
/* loaded from: classes3.dex */
public final class h0 extends qq.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f38474a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(d0 d0Var) {
        this.f38474a = d0Var;
    }

    @Override // qq.a, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.u.j(animation, "animation");
        d0.h(this.f38474a);
    }
}

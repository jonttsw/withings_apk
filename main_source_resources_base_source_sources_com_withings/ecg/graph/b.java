package com.withings.ecg.graph;

import android.animation.Animator;
import kotlin.jvm.internal.u;
/* compiled from: EcgLineChart.kt */
/* loaded from: classes3.dex */
public final class b extends qq.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgLineChart f38396a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(EcgLineChart ecgLineChart) {
        this.f38396a = ecgLineChart;
    }

    @Override // qq.a, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        u.j(animation, "animation");
        this.f38396a.I(0.0f);
    }
}

package com.withings.ecg.graph;

import android.animation.Animator;
import androidx.core.view.u0;
import kotlin.jvm.internal.u;
/* compiled from: EcgLineChart.kt */
/* loaded from: classes3.dex */
public final class d extends qq.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgLineChart f38398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(EcgLineChart ecgLineChart) {
        this.f38398a = ecgLineChart;
    }

    @Override // qq.a, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        u.j(animation, "animation");
        int i11 = EcgLineChart.f38387b1;
        EcgLineChart ecgLineChart = this.f38398a;
        ecgLineChart.getClass();
        if (u0.L(ecgLineChart) && !ecgLineChart.isLayoutRequested()) {
            ecgLineChart.animate().alpha(1.0f).setDuration(250L).setListener(new b(ecgLineChart));
        } else {
            ecgLineChart.addOnLayoutChangeListener(new a(ecgLineChart));
        }
    }
}

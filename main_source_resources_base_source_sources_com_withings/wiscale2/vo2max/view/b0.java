package com.withings.wiscale2.vo2max.view;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.a<Animation> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62691a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(0);
        this.f62691a = vo2MaxComparisonView;
    }

    @Override // ym0.a
    public final Animation invoke() {
        Context k11;
        k11 = this.f62691a.k();
        return AnimationUtils.loadAnimation(k11, C1987R.anim.vo2max_comparison_animation_out_from_right);
    }
}

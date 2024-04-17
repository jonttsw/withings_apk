package com.withings.wiscale2.vo2max.view;

import android.view.View;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.a<View> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62744a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(0);
        this.f62744a = vo2MaxComparisonView;
    }

    @Override // ym0.a
    public final View invoke() {
        View view;
        view = this.f62744a.f62632b;
        return view.findViewById(C1987R.id.vo2max_comparison_view_self_bar);
    }
}

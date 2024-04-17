package com.withings.wiscale2.vo2max.view;

import android.view.View;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.a<TextView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62735a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(0);
        this.f62735a = vo2MaxComparisonView;
    }

    @Override // ym0.a
    public final TextView invoke() {
        View view;
        view = this.f62735a.f62632b;
        return (TextView) view.findViewById(C1987R.id.vo2max_comparison_view_other_value);
    }
}

package com.withings.wiscale2.vo2max.view;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62745a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(0);
        this.f62745a = vo2MaxComparisonView;
    }

    @Override // ym0.a
    public final ComposeView invoke() {
        View view;
        view = this.f62745a.f62632b;
        return (ComposeView) view.findViewById(C1987R.id.vo2max_comparison_view_age_selector);
    }
}

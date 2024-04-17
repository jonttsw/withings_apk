package com.withings.wiscale2.vo2max.view;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.a<NestedScrollView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62805a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(0);
        this.f62805a = vo2MaxComparisonView;
    }

    @Override // ym0.a
    public final NestedScrollView invoke() {
        View view;
        view = this.f62805a.f62632b;
        return (NestedScrollView) view.findViewById(C1987R.id.scroll_view);
    }
}

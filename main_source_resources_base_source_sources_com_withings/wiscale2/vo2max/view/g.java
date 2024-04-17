package com.withings.wiscale2.vo2max.view;

import android.view.View;
import android.widget.ImageSwitcher;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.a<ImageSwitcher> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62743a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(0);
        this.f62743a = vo2MaxComparisonView;
    }

    @Override // ym0.a
    public final ImageSwitcher invoke() {
        View view;
        view = this.f62743a.f62632b;
        return (ImageSwitcher) view.findViewById(C1987R.id.vo2max_comparison_view_other_image);
    }
}

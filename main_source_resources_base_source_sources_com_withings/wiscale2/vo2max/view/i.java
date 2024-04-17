package com.withings.wiscale2.vo2max.view;

import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.a<Context> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62748a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(0);
        this.f62748a = vo2MaxComparisonView;
    }

    @Override // ym0.a
    public final Context invoke() {
        View view;
        view = this.f62748a.f62632b;
        return view.getContext();
    }
}

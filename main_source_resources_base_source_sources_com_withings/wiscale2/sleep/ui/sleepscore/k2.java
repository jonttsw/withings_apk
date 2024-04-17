package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.graph.GraphView;
import com.withings.views.view.CustomNestedScrollView;
/* compiled from: SleepMonthFragment.kt */
/* loaded from: classes5.dex */
public final class k2 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h2 f61114a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(h2 h2Var) {
        this.f61114a = h2Var;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        CustomNestedScrollView customNestedScrollView;
        h2 h2Var = this.f61114a;
        customNestedScrollView = h2Var.f60995k;
        if (customNestedScrollView != null) {
            customNestedScrollView.setScrollingEnabled(true);
            h2.w1(h2Var).Q1(true);
            return;
        }
        kotlin.jvm.internal.u.s("customNestedScrollView");
        throw null;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        CustomNestedScrollView customNestedScrollView;
        h2 h2Var = this.f61114a;
        customNestedScrollView = h2Var.f60995k;
        if (customNestedScrollView != null) {
            customNestedScrollView.setScrollingEnabled(false);
            h2.w1(h2Var).Q1(false);
            return;
        }
        kotlin.jvm.internal.u.s("customNestedScrollView");
        throw null;
    }
}

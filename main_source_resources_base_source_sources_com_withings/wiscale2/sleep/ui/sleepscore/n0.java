package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.graph.GraphView;
import com.withings.views.view.CustomNestedScrollView;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class n0 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f61155a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(k0 k0Var) {
        this.f61155a = k0Var;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        CustomNestedScrollView customNestedScrollView;
        k0 k0Var = this.f61155a;
        k0.C1(k0Var).Q1(true);
        customNestedScrollView = k0Var.f61078p;
        if (customNestedScrollView != null) {
            customNestedScrollView.setScrollingEnabled(true);
        } else {
            kotlin.jvm.internal.u.s("customNestedScrollView");
            throw null;
        }
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        CustomNestedScrollView customNestedScrollView;
        k0 k0Var = this.f61155a;
        k0.C1(k0Var).Q1(false);
        customNestedScrollView = k0Var.f61078p;
        if (customNestedScrollView != null) {
            customNestedScrollView.setScrollingEnabled(false);
        } else {
            kotlin.jvm.internal.u.s("customNestedScrollView");
            throw null;
        }
    }
}

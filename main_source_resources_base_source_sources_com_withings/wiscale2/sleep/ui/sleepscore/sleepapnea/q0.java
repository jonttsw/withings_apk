package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.core.widget.NestedScrollView;
import com.withings.graph.GraphView;
import com.withings.views.view.BlockableViewPager;
/* compiled from: SleepDisorderGraphFragment.kt */
/* loaded from: classes5.dex */
public final class q0 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f61441a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(o0 o0Var) {
        this.f61441a = o0Var;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        BlockableViewPager.b bVar;
        o0 o0Var = this.f61441a;
        bVar = o0Var.f61408d;
        if (bVar != null) {
            bVar.Q1(true);
        }
        NestedScrollView nestedScrollView = o0Var.f61409e;
        if (nestedScrollView != null) {
            nestedScrollView.setNestedScrollingEnabled(true);
        } else {
            kotlin.jvm.internal.u.s("scrollView");
            throw null;
        }
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        BlockableViewPager.b bVar;
        o0 o0Var = this.f61441a;
        bVar = o0Var.f61408d;
        if (bVar != null) {
            bVar.Q1(false);
        }
        NestedScrollView nestedScrollView = o0Var.f61409e;
        if (nestedScrollView != null) {
            nestedScrollView.setNestedScrollingEnabled(true);
        } else {
            kotlin.jvm.internal.u.s("scrollView");
            throw null;
        }
    }
}

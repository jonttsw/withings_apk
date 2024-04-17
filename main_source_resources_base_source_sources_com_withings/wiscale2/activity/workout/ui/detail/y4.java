package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.graph.GraphView;
import com.withings.views.view.LockableScrollView;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class y4 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a5 f49828a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y4(a5 a5Var) {
        this.f49828a = a5Var;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        LockableScrollView lockableScrollView;
        a5 a5Var = this.f49828a;
        lockableScrollView = a5Var.f49112i;
        lockableScrollView.setScrollingEnabled(true);
        a5Var.d().Q1(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        LockableScrollView lockableScrollView;
        a5 a5Var = this.f49828a;
        lockableScrollView = a5Var.f49112i;
        lockableScrollView.setScrollingEnabled(false);
        a5Var.d().Q1(false);
    }
}

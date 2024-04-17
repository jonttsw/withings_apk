package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.graph.GraphView;
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
public final class h4 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y3 f61015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ tb0.c3 f61016b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h4(y3 y3Var, tb0.c3 c3Var) {
        this.f61015a = y3Var;
        this.f61016b = c3Var;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        y3.v1(this.f61015a).Q1(true);
        this.f61016b.f98906c.setScrollingEnabled(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        y3.v1(this.f61015a).Q1(false);
        this.f61016b.f98906c.setScrollingEnabled(false);
    }
}

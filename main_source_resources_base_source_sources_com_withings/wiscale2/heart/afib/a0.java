package com.withings.wiscale2.heart.afib;

import com.withings.graph.GraphView;
/* compiled from: AFibMonthFragment.kt */
/* loaded from: classes5.dex */
public final class a0 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y f57127a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(y yVar) {
        this.f57127a = yVar;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        y yVar = this.f57127a;
        yVar.D1().f99502b.setScrollingEnabled(true);
        y.u1(yVar).Q1(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        y yVar = this.f57127a;
        yVar.D1().f99502b.setScrollingEnabled(false);
        y.u1(yVar).Q1(false);
    }
}

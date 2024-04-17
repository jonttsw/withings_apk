package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.graph.GraphView;
/* compiled from: SleepScoreInterruptionsActivity.kt */
/* loaded from: classes5.dex */
public final class z2 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreInterruptionsActivity f61585a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z2(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity) {
        this.f61585a = sleepScoreInterruptionsActivity;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        this.f61585a.A3().f99413d.setEnabled(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        this.f61585a.A3().f99413d.setEnabled(false);
    }
}

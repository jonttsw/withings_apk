package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.graph.GraphView;
/* compiled from: SleepScoreRegularityActivity.kt */
/* loaded from: classes5.dex */
public final class i3 implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreRegularityActivity f61020a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i3(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        this.f61020a = sleepScoreRegularityActivity;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        this.f61020a.A3().f99413d.setEnabled(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        this.f61020a.A3().f99413d.setEnabled(false);
    }
}

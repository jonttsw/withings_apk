package com.withings.wiscale2.heart;

import com.withings.graph.GraphView;
/* compiled from: HeartHistoryActivity.kt */
/* loaded from: classes5.dex */
public final class k implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartHistoryActivity f57780a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(HeartHistoryActivity heartHistoryActivity) {
        this.f57780a = heartHistoryActivity;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        HeartHistoryActivity heartHistoryActivity = this.f57780a;
        if (heartHistoryActivity.R3().f99491g.q()) {
            heartHistoryActivity.R3().f99491g.k();
        }
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
    }
}

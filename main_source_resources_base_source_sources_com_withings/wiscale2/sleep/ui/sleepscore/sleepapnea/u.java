package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.graph.GraphView;
import com.withings.views.view.BlockableViewPager;
/* compiled from: SleepDisorderDetailsFragment.kt */
/* loaded from: classes5.dex */
public final class u implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f61468a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(s sVar) {
        this.f61468a = sVar;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        BlockableViewPager.b bVar;
        s sVar = this.f61468a;
        bVar = sVar.f61451l;
        if (bVar != null) {
            bVar.Q1(true);
        }
        sVar.G1().f99644b.setNestedScrollingEnabled(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        BlockableViewPager.b bVar;
        s sVar = this.f61468a;
        bVar = sVar.f61451l;
        if (bVar != null) {
            bVar.Q1(false);
        }
        sVar.G1().f99644b.setNestedScrollingEnabled(false);
    }
}

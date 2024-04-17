package com.withings.environment.ui;

import com.withings.graph.GraphView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomNestedScrollView;
/* compiled from: WsdGraphFragment.java */
/* loaded from: classes3.dex */
final class g implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f39009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j jVar) {
        this.f39009a = jVar;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        BlockableViewPager.b bVar;
        CustomNestedScrollView customNestedScrollView;
        j jVar = this.f39009a;
        bVar = jVar.f39018g;
        bVar.Q1(true);
        customNestedScrollView = jVar.f39020i;
        customNestedScrollView.setScrollingEnabled(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        BlockableViewPager.b bVar;
        CustomNestedScrollView customNestedScrollView;
        j jVar = this.f39009a;
        bVar = jVar.f39018g;
        bVar.Q1(false);
        customNestedScrollView = jVar.f39020i;
        customNestedScrollView.setScrollingEnabled(false);
    }
}

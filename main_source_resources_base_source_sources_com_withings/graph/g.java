package com.withings.graph;

import com.withings.graph.GraphView;
import k1.r0;
/* compiled from: GraphViewCompose.kt */
/* loaded from: classes3.dex */
public final class g implements GraphView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f39923a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(r0<Boolean> r0Var) {
        this.f39923a = r0Var;
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        r0<Boolean> r0Var = this.f39923a;
        if (r0Var != null) {
            r0Var.setValue(Boolean.FALSE);
        }
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        r0<Boolean> r0Var = this.f39923a;
        if (r0Var != null) {
            r0Var.setValue(Boolean.TRUE);
        }
    }
}

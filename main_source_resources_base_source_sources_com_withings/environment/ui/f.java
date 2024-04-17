package com.withings.environment.ui;

import com.withings.library.measure.Measure;
import com.withings.views.graphs.GraphPopupView;
import jm.a;
import org.joda.time.DateTime;
/* compiled from: WsdGraphFragment.java */
/* loaded from: classes3.dex */
final class f extends com.withings.views.graphs.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f39008a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(j jVar) {
        this.f39008a = jVar;
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupText(rs.e eVar) {
        GraphPopupView graphPopupView;
        graphPopupView = this.f39008a.f39027p;
        return a.d.a(graphPopupView.getContext()).f(((Measure) eVar.f95625j).f95794y, 12);
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupTitleText(rs.e eVar) {
        return b50.b.t(this.f39008a.getContext(), new DateTime((int) ((Measure) eVar.f95625j).f95793x));
    }
}

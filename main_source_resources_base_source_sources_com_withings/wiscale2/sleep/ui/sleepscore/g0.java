package com.withings.wiscale2.sleep.ui.sleepscore;

import android.view.View;
import com.withings.graph.GraphView;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
/* compiled from: View.kt */
/* loaded from: classes5.dex */
public final class g0 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f0 f60974a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SleepAverageHRSectionView f60975b;

    public g0(f0 f0Var, SleepAverageHRSectionView sleepAverageHRSectionView) {
        this.f60974a = f0Var;
        this.f60975b = sleepAverageHRSectionView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        nm0.j jVar;
        GraphPopupView graphPopupView;
        view.removeOnLayoutChangeListener(this);
        f0 f0Var = this.f60974a;
        long millis = f0Var.a().get(0).getStartDate().getMillis();
        List<Vasistas> b10 = f0Var.b();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(b10, 10));
        for (Vasistas vasistas : b10) {
            arrayList.add(new nm0.j(Long.valueOf(vasistas.getStartDate().getMillis()), Integer.valueOf(vasistas.getRespiratoryRate())));
        }
        jVar = ha0.k.f70401l;
        ha0.h hVar = new ha0.h(millis, arrayList, jVar);
        Track d11 = f0Var.d();
        kotlin.jvm.internal.u.g(d11);
        SleepAverageHRSectionView sleepAverageHRSectionView = this.f60975b;
        GraphView respiratoryRateGraph$HealthMate_prodRelease = sleepAverageHRSectionView.getRespiratoryRateGraph$HealthMate_prodRelease();
        graphPopupView = sleepAverageHRSectionView.f60608y;
        SleepAverageHRSectionView.u(sleepAverageHRSectionView, d11, hVar, respiratoryRateGraph$HealthMate_prodRelease, graphPopupView);
    }
}

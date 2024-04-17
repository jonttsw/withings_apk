package com.withings.nervehealth.ui;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.wiscale2.C1987R;
import j00.d;
import java.util.List;
import k1.r0;
import ys.e;
/* compiled from: NerveHealthScrubber.kt */
/* loaded from: classes4.dex */
public final class p0 implements ys.c {

    /* renamed from: a  reason: collision with root package name */
    private final r0<ys.e> f42759a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f42760b;

    public p0(NerveHealthActivity context, ParcelableSnapshotMutableState parcelableSnapshotMutableState) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f42759a = parcelableSnapshotMutableState;
        this.f42760b = context;
    }

    @Override // ys.g
    public final void a() {
        this.f42759a.setValue(null);
    }

    @Override // ys.g
    public final void b(GraphView graphView, List<? extends rs.e> datums, PointF pointF) {
        j00.d dVar;
        int i11;
        String valueOf;
        kotlin.jvm.internal.u.j(graphView, "graphView");
        kotlin.jvm.internal.u.j(datums, "datums");
        if (graphView instanceof TimeGraphView) {
            rs.e eVar = (rs.e) kotlin.collections.x.K(datums);
            if (eVar == null) {
                return;
            }
            Object obj = eVar.f95625j;
            if (obj instanceof j00.d) {
                dVar = (j00.d) obj;
            } else {
                dVar = null;
            }
            if (dVar == null || !dVar.b()) {
                dVar = null;
            }
            if (dVar == null) {
                return;
            }
            Context context = this.f42760b;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            TimeGraphView timeGraphView = (TimeGraphView) graphView;
            int height = timeGraphView.getHeight() - ((int) (displayMetrics.density * 32));
            int height2 = timeGraphView.getHeight() - ((int) (displayMetrics.density * 64));
            boolean z5 = dVar instanceof d.a;
            if (!z5 && hn.a.d(dVar.a())) {
                i11 = C1987R.string.nerveHealth_predictedScore;
            } else {
                i11 = C1987R.string.nerveHealth_confirmedScore;
            }
            if (z5) {
                valueOf = context.getString(C1987R.string.nerveHealth_status_inconclusive);
            } else {
                valueOf = String.valueOf(dVar.c());
            }
            kotlin.jvm.internal.u.g(valueOf);
            this.f42759a.setValue(new ys.e((int) graphView.q(eVar.f95616a), height, height2, context.getString(i11), kotlin.collections.x.V(new ns.g(valueOf, null)), b50.b.n(context, dVar.a()), timeGraphView.getCurrentZoomGranularity(), eVar, true, kotlin.collections.x.V(new e.a((int) graphView.r(eVar.f95617b), eVar.f()))));
            return;
        }
        throw new IllegalArgumentException("WeightGraphScrubber should be used with a TimeGraphView".toString());
    }

    @Override // ys.c
    public final r0<ys.e> c() {
        return this.f42759a;
    }

    @Override // ys.g
    public final boolean isVisible() {
        if (this.f42759a.getValue() != null) {
            return true;
        }
        return false;
    }
}

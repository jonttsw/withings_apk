package com.withings.healthscore.ui.exploredata;

import android.app.Application;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.wiscale2.C1987R;
import java.util.List;
import k1.r0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import ys.e;
/* compiled from: HealthScoreExploreDataGraphScrubber.kt */
/* loaded from: classes3.dex */
public final class h implements ys.c {

    /* renamed from: a  reason: collision with root package name */
    private final r0<ys.e> f40575a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f40576b;

    public h(Application context, ParcelableSnapshotMutableState parcelableSnapshotMutableState) {
        u.j(context, "context");
        this.f40575a = parcelableSnapshotMutableState;
        this.f40576b = context;
    }

    @Override // ys.g
    public final void a() {
        this.f40575a.setValue(null);
    }

    @Override // ys.g
    public final void b(GraphView graphView, List<? extends rs.e> datums, PointF pointF) {
        nm0.j jVar;
        rs.b bVar;
        u.j(graphView, "graphView");
        u.j(datums, "datums");
        if (graphView instanceof TimeGraphView) {
            rs.e eVar = (rs.e) x.K(datums);
            if (eVar == null) {
                return;
            }
            Object obj = eVar.f95625j;
            String str = null;
            if (obj instanceof nm0.j) {
                jVar = (nm0.j) obj;
            } else {
                jVar = null;
            }
            if (eVar instanceof rs.b) {
                bVar = (rs.b) eVar;
            } else {
                bVar = null;
            }
            if (bVar != null && jVar != null) {
                Context context = this.f40576b;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                TimeGraphView timeGraphView = (TimeGraphView) graphView;
                int height = timeGraphView.getHeight() - ((int) (displayMetrics.density * 32));
                int height2 = timeGraphView.getHeight() - ((int) (displayMetrics.density * 64));
                String valueOf = String.valueOf(((Number) jVar.d()).intValue());
                int q11 = (int) graphView.q(eVar.f95616a);
                List V = x.V(new ns.g(valueOf, null));
                rs.b bVar2 = (rs.b) eVar;
                if (bVar2.g()) {
                    str = context.getString(C1987R.string._AVERAGE_);
                }
                this.f40575a.setValue(new ys.e(q11, height, height2, str, V, b50.b.r((DateTime) jVar.c(), timeGraphView.getCurrentViewport().width(), context), timeGraphView.getCurrentZoomGranularity(), eVar, true, x.V(new e.a((int) graphView.r(eVar.f95617b), bVar2.f()))));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("WeightGraphScrubber should be used with a TimeGraphView".toString());
    }

    @Override // ys.c
    public final r0<ys.e> c() {
        return this.f40575a;
    }

    @Override // ys.g
    public final boolean isVisible() {
        if (this.f40575a.getValue() != null) {
            return true;
        }
        return false;
    }
}

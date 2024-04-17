package com.withings.weight.ui.limbExplore;

import android.app.Application;
import android.content.Context;
import android.graphics.PointF;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import jm.a;
import k1.r0;
import ys.e;
/* compiled from: SegmentalLimbExploreGraphScrubber.kt */
/* loaded from: classes4.dex */
public final class p implements ys.c {

    /* renamed from: a  reason: collision with root package name */
    private final r0<ys.e> f47703a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f47704b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f47705c;

    /* renamed from: d  reason: collision with root package name */
    private final jm.a f47706d;

    /* renamed from: e  reason: collision with root package name */
    private final String f47707e;

    /* renamed from: f  reason: collision with root package name */
    private final String f47708f;

    public p(ParcelableSnapshotMutableState parcelableSnapshotMutableState, Application context, boolean z5) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f47703a = parcelableSnapshotMutableState;
        this.f47704b = context;
        this.f47705c = z5;
        this.f47706d = a.d.a(context);
        String string = context.getString(C1987R.string.fat_legend_name);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        this.f47707e = string;
        String string2 = context.getString(C1987R.string.muscle_legend_name);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        this.f47708f = string2;
    }

    @Override // ys.g
    public final void a() {
        this.f47703a.setValue(null);
    }

    @Override // ys.g
    public final void b(GraphView graphView, List<? extends rs.e> datums, PointF pointF) {
        c cVar;
        Object obj;
        c cVar2;
        Object obj2;
        c cVar3;
        String str;
        SpannableStringBuilder c11;
        SpannableStringBuilder c12;
        kotlin.jvm.internal.u.j(graphView, "graphView");
        kotlin.jvm.internal.u.j(datums, "datums");
        if (graphView instanceof TimeGraphView) {
            rs.e eVar = (rs.e) kotlin.collections.x.K(datums);
            if (eVar == null) {
                return;
            }
            Object obj3 = eVar.f95625j;
            if (obj3 instanceof c) {
                cVar = (c) obj3;
            } else {
                cVar = null;
            }
            r0<ys.e> r0Var = this.f47703a;
            if (cVar == null) {
                r0Var.setValue(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            rs.e eVar2 = (rs.e) kotlin.collections.x.K(datums);
            if (eVar2 != null) {
                obj = eVar2.f95625j;
            } else {
                obj = null;
            }
            if (obj instanceof c) {
                cVar2 = (c) obj;
            } else {
                cVar2 = null;
            }
            rs.e eVar3 = (rs.e) kotlin.collections.x.U(datums);
            if (eVar3 != null) {
                obj2 = eVar3.f95625j;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof c) {
                cVar3 = (c) obj2;
            } else {
                cVar3 = null;
            }
            jm.a aVar = this.f47706d;
            boolean z5 = this.f47705c;
            if (cVar3 != null) {
                if (z5) {
                    c12 = jm.a.d(aVar, cVar3.c());
                } else {
                    c12 = jm.a.c(this.f47706d, 8, cVar3.b(), 0, 0, 60);
                }
                arrayList.add(new ns.g(c12.toString(), this.f47708f));
            }
            if (cVar2 != null) {
                if (z5) {
                    c11 = jm.a.d(aVar, cVar2.c());
                } else {
                    c11 = jm.a.c(this.f47706d, 76, cVar2.b(), 0, 0, 60);
                }
                arrayList.add(new ns.g(c11.toString(), this.f47707e));
            }
            Context context = this.f47704b;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            TimeGraphView timeGraphView = (TimeGraphView) graphView;
            int height = timeGraphView.getHeight() - ((int) (displayMetrics.density * 32));
            int height2 = timeGraphView.getHeight() - ((int) (displayMetrics.density * 64));
            List<? extends rs.e> list = datums;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(list, 10));
            for (rs.e eVar4 : list) {
                arrayList2.add(new e.a((int) graphView.r(eVar4.f95617b), eVar4.f()));
            }
            int q11 = (int) graphView.q(eVar.f95616a);
            if (eVar.g()) {
                str = context.getString(C1987R.string._AVERAGE_);
            } else {
                str = null;
            }
            r0Var.setValue(new ys.e(q11, height, height2, str, arrayList, b50.b.r(cVar.a(), timeGraphView.getCurrentViewport().width(), context), timeGraphView.getCurrentZoomGranularity(), eVar, true, arrayList2));
            return;
        }
        throw new IllegalArgumentException("SegmentalLimbExploreGraphScrubber should be used with a TimeGraphView".toString());
    }

    @Override // ys.c
    public final r0<ys.e> c() {
        return this.f47703a;
    }

    @Override // ys.g
    public final boolean isVisible() {
        if (this.f47703a.getValue() != null) {
            return true;
        }
        return false;
    }
}

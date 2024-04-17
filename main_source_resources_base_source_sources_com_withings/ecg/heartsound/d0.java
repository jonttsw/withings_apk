package com.withings.ecg.heartsound;

import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.withings.wiscale2.C1987R;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: HeartSoundGraph.kt */
/* loaded from: classes3.dex */
public final class d0 implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    private final LineChart f38454a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38455b;

    /* renamed from: c  reason: collision with root package name */
    private final Choreographer f38456c;

    /* renamed from: d  reason: collision with root package name */
    private Long f38457d;

    /* renamed from: e  reason: collision with root package name */
    private float f38458e;

    /* renamed from: f  reason: collision with root package name */
    private float f38459f;

    /* renamed from: g  reason: collision with root package name */
    private float f38460g;

    /* renamed from: h  reason: collision with root package name */
    private long f38461h;

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f38463b;

        public a(long j5) {
            this.f38463b = j5;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            d0 d0Var = d0.this;
            d0Var.f38459f = (((((lb.i) d0Var.f38454a.getData()).j() - d0Var.f38458e) / ((float) d0Var.f38461h)) / 1000) * ((float) this.f38463b);
            d0Var.f38454a.I(d0Var.f38460g + d0Var.f38459f);
        }
    }

    public d0(LineChart chartView) {
        kotlin.jvm.internal.u.j(chartView, "chartView");
        this.f38454a = chartView;
        this.f38455b = false;
        this.f38456c = Choreographer.getInstance();
        chartView.getDescription().g(false);
        chartView.L();
        chartView.setData(new lb.i());
        chartView.setTouchEnabled(false);
        chartView.getLegend().D();
        chartView.getAxisRight().g(false);
        XAxis xAxis = chartView.getXAxis();
        xAxis.F();
        xAxis.G();
        xAxis.H(false);
        xAxis.P();
        YAxis axisLeft = chartView.getAxisLeft();
        axisLeft.F();
        axisLeft.G();
        axisLeft.H(false);
        axisLeft.X();
        axisLeft.W();
    }

    public static final void g(d0 d0Var, float f11, long j5) {
        LineChart lineChart = d0Var.f38454a;
        Context context = lineChart.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        lineChart.getViewPortHandler().P(((float) j5) / (wq.a.n(f11, context) / 25.0f));
    }

    public static final void h(d0 d0Var) {
        LineChart lineChart = d0Var.f38454a;
        if (androidx.core.view.u0.L(lineChart) && !lineChart.isLayoutRequested()) {
            lineChart.animate().alpha(1.0f).setDuration(250L).setListener(new g0(d0Var));
        } else {
            lineChart.addOnLayoutChangeListener(new f0(d0Var));
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        Long l5 = this.f38457d;
        if (l5 != null) {
            long millis = DateTime.now().getMillis() - l5.longValue();
            LineChart lineChart = this.f38454a;
            if (androidx.core.view.u0.L(lineChart) && !lineChart.isLayoutRequested()) {
                float j11 = (((((lb.i) lineChart.getData()).j() - this.f38458e) / ((float) this.f38461h)) / 1000) * ((float) millis);
                this.f38459f = j11;
                lineChart.I(j11 + this.f38460g);
            } else {
                lineChart.addOnLayoutChangeListener(new a(millis));
            }
            this.f38456c.postFrameCallback(this);
        }
    }

    public final void i(long j5, List data) {
        Object next;
        float f11;
        Object next2;
        kotlin.jvm.internal.u.j(data, "data");
        LineChart lineChart = this.f38454a;
        YAxis axisLeft = lineChart.getAxisLeft();
        List<Entry> list = data;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float b10 = ((Entry) next).b();
                do {
                    Object next3 = it.next();
                    float b11 = ((Entry) next3).b();
                    if (Float.compare(b10, b11) > 0) {
                        next = next3;
                        b10 = b11;
                    }
                } while (it.hasNext());
            }
        }
        Entry entry = (Entry) next;
        float f12 = 0.0f;
        if (entry != null) {
            f11 = entry.b();
        } else {
            f11 = 0.0f;
        }
        axisLeft.E(f11);
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            next2 = null;
        } else {
            next2 = it2.next();
            if (it2.hasNext()) {
                float b12 = ((Entry) next2).b();
                do {
                    Object next4 = it2.next();
                    float b13 = ((Entry) next4).b();
                    if (Float.compare(b12, b13) < 0) {
                        next2 = next4;
                        b12 = b13;
                    }
                } while (it2.hasNext());
            }
        }
        Entry entry2 = (Entry) next2;
        if (entry2 != null) {
            f12 = entry2.b();
        }
        axisLeft.D(f12);
        this.f38461h = j5;
        if (this.f38455b) {
            if (androidx.core.view.u0.L(lineChart) && !lineChart.isLayoutRequested()) {
                g(this, lineChart.getMeasuredWidth(), j5);
            } else {
                lineChart.addOnLayoutChangeListener(new e0(this, j5));
            }
        }
        lb.i iVar = (lb.i) lineChart.getData();
        if (iVar != null) {
            if (iVar.g(0) == 0) {
                LineDataSet lineDataSet = new LineDataSet(null, null);
                lineDataSet.I0();
                lineDataSet.T0(LineDataSet.Mode.f24364c);
                lineDataSet.S0(false);
                lineDataSet.H0();
                lineDataSet.F0();
                Context context = lineChart.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                lineDataSet.G0(ah.u.w(C1987R.attr.statusInfo, context, -65281));
                lineDataSet.N0(2.0f);
                iVar.a(lineDataSet);
            }
            for (Entry entry3 : list) {
                iVar.b(entry3, 0);
            }
            iVar.s();
            lineChart.p();
            lineChart.invalidate();
        }
    }

    public final void j() {
        this.f38458e = 5000.0f;
        LineChart lineChart = this.f38454a;
        if (androidx.core.view.u0.L(lineChart) && !lineChart.isLayoutRequested()) {
            lineChart.M(0.0f, 5000.0f);
        } else {
            lineChart.addOnLayoutChangeListener(new c0(this));
        }
    }

    public final void k() {
        this.f38456c.removeFrameCallback(this);
        this.f38460g = this.f38459f;
    }

    public final void l() {
        this.f38457d = Long.valueOf(DateTime.now().getMillis());
        this.f38456c.postFrameCallback(this);
    }

    public final void m() {
        this.f38454a.animate().alpha(0.0f).setDuration(250L).setListener(new h0(this));
        this.f38460g = 0.0f;
        this.f38459f = 0.0f;
        this.f38456c.removeFrameCallback(this);
    }
}

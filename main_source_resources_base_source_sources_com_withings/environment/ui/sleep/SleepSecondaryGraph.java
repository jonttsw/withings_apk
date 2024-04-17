package com.withings.environment.ui.sleep;

import ah.g;
import ah.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.withings.environment.ui.sleep.TemperatureSleepGraph;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.j;
import com.withings.library.measure.Measure;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import f80.i;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import rs.e;
import ts.a;
/* loaded from: classes3.dex */
public abstract class SleepSecondaryGraph extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private SectionView f39039a;

    /* renamed from: b  reason: collision with root package name */
    protected GraphView f39040b;

    /* renamed from: c  reason: collision with root package name */
    private int f39041c;

    /* renamed from: d  reason: collision with root package name */
    private GraphPopupView f39042d;

    /* renamed from: e  reason: collision with root package name */
    private GraphPopupView.c f39043e;

    /* loaded from: classes3.dex */
    abstract class a extends i {

        /* renamed from: n  reason: collision with root package name */
        private final List<Measure> f39044n;

        public a(GraphView graphView, ArrayList arrayList) {
            super(graphView);
            this.f39044n = arrayList;
        }

        @Override // f80.i
        protected final void D(GraphView graphView) {
            SleepSecondaryGraph sleepSecondaryGraph = SleepSecondaryGraph.this;
            if (sleepSecondaryGraph.f39042d == null) {
                return;
            }
            sleepSecondaryGraph.f39042d.setPopupContentProvider(sleepSecondaryGraph.f39043e);
            sleepSecondaryGraph.f39042d.setShouldAlignToTopOfGraphView(true);
            this.f66427a.setScrubbingEnabled(true);
            this.f66427a.setPopup(sleepSecondaryGraph.f39042d);
        }

        @Override // f80.i
        protected final boolean E() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final j F(GraphView graphView, float f11) {
            Context context = graphView.getContext();
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(1);
            int v11 = u.v(16842809, context);
            j.a aVar = new j.a(context);
            Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
            aVar.o(drawOrder);
            aVar.Z(numberFormat.format(f11));
            aVar.d0(f11);
            aVar.a0(wq.a.k(C1987R.style.detail1, context, 10));
            aVar.M(2);
            aVar.o(drawOrder);
            aVar.Q(12);
            aVar.K(u.j(0.6f, v11));
            aVar.X(32);
            return aVar.L();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5, types: [os.a, java.lang.Object] */
        @Override // f80.i
        protected final void c(GraphView graphView) {
            a.C1685a c1685a = new a.C1685a();
            c1685a.l(p());
            c1685a.u(androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.statusInfo));
            c1685a.w(g.k(2, graphView.getContext()));
            c1685a.i(new Object());
            graphView.d(c1685a.s());
        }

        @Override // f80.i
        protected final i.a g(DateTime dateTime, DateTime dateTime2) {
            i.a aVar = new i.a();
            Duration duration = new Duration(0L, t().getMillis());
            List<Measure> list = this.f39044n;
            for (Measure measure : list) {
                measure.f95793x -= duration.getMillis();
            }
            ArrayList arrayList = new ArrayList();
            for (Measure measure2 : list) {
                e eVar = new e(new e.a((float) (new DateTime((int) measure2.f95793x).getMillis() / 60000), (float) measure2.f95794y));
                eVar.f95625j = measure2;
                arrayList.add(eVar);
            }
            aVar.f66439a = arrayList;
            return aVar;
        }

        @Override // f80.i
        protected final i.b n(float f11) {
            return j();
        }

        @Override // f80.i
        protected final i.d v(float f11, float f12) {
            double q11 = ((q() - r()) / 4.0f) / 2.0d;
            return new i.d((float) (r() - q11), (float) (q() + q11));
        }
    }

    public SleepSecondaryGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private void d() {
        View.inflate(getContext(), C1987R.layout.view_sleep_secondary_graph, this);
        this.f39039a = (SectionView) findViewById(C1987R.id.section_view);
        GraphView graphView = (GraphView) findViewById(C1987R.id.graph_view);
        this.f39040b = graphView;
        graphView.setTouchEnabled(false);
        int i11 = this.f39041c;
        if (i11 > 0) {
            setGraphHeightPx(i11);
        }
        this.f39039a.setTitle(getTitleResId());
    }

    abstract TemperatureSleepGraph.a c(ArrayList arrayList);

    public final void e(ArrayList arrayList, DateTime dateTime, DateTime dateTime2) {
        c(arrayList).x(dateTime, dateTime2);
    }

    public final void f(GraphPopupView graphPopupView, GraphPopupView.c cVar) {
        this.f39042d = graphPopupView;
        this.f39043e = cVar;
        this.f39040b.setTouchEnabled(true);
    }

    public GraphView getGraphView() {
        return this.f39040b;
    }

    protected abstract int getTitleResId();

    public void setGraphHeightPx(int i11) {
        GraphView graphView;
        this.f39041c = i11;
        if (i11 > 0 && (graphView = this.f39040b) != null) {
            graphView.getLayoutParams().height = i11;
            this.f39040b.requestLayout();
        }
    }

    public void setTitleVisible(boolean z5) {
        int i11;
        SectionView sectionView = this.f39039a;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        sectionView.setVisibility(i11);
    }

    public SleepSecondaryGraph(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        d();
    }
}

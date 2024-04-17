package com.withings.environment.ui.sleep;

import ah.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.withings.graph.GraphView;
import com.withings.library.measure.Measure;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import f80.i;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import rs.e;
import ts.a;
/* loaded from: classes3.dex */
public abstract class SleepSecondaryGraphCard extends RelativeLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f39046d = 0;

    /* renamed from: a  reason: collision with root package name */
    private SectionView f39047a;

    /* renamed from: b  reason: collision with root package name */
    protected GraphView f39048b;

    /* renamed from: c  reason: collision with root package name */
    private int f39049c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public abstract class a extends i {

        /* renamed from: n  reason: collision with root package name */
        private final List<Measure> f39050n;

        public a(GraphView graphView, List<Measure> list) {
            super(graphView);
            this.f39050n = list;
        }

        @Override // f80.i
        protected final void D(GraphView graphView) {
            int i11 = SleepSecondaryGraphCard.f39046d;
            SleepSecondaryGraphCard.this.getClass();
        }

        @Override // f80.i
        protected final boolean E() {
            return false;
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
            List<Measure> list = this.f39050n;
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

    public SleepSecondaryGraphCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private void b() {
        View.inflate(getContext(), C1987R.layout.view_sleep_secondary_graph_card, this);
        this.f39047a = (SectionView) findViewById(C1987R.id.section_view);
        GraphView graphView = (GraphView) findViewById(C1987R.id.graph_view);
        this.f39048b = graphView;
        graphView.setTouchEnabled(false);
        int i11 = this.f39049c;
        if (i11 > 0) {
            setGraphHeightPx(i11);
        }
        this.f39047a.setTitle(getTitleResId());
    }

    abstract a a(List<Measure> list);

    public final void c(List<Measure> list, DateTime dateTime, DateTime dateTime2) {
        a(list).x(dateTime, dateTime2);
    }

    public GraphView getGraphView() {
        return this.f39048b;
    }

    protected abstract int getTitleResId();

    public void setGraphHeightPx(int i11) {
        GraphView graphView;
        this.f39049c = i11;
        if (i11 > 0 && (graphView = this.f39048b) != null) {
            graphView.getLayoutParams().height = i11;
            this.f39048b.requestLayout();
        }
    }

    public SleepSecondaryGraphCard(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        b();
    }
}

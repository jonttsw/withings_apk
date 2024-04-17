package com.withings.environment.ui.sleep;

import ah.g;
import ah.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.TextPaint;
import android.view.Display;
import android.view.WindowManager;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.h;
import com.withings.graph.decorator.j;
import com.withings.graph.decorator.k;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.graphs.c;
import com.withings.wiscale2.C1987R;
import f80.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.w0;
import m6.q;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.format.DateTimeFormat;
import pm.e;
import rs.a;
import rs.e;
import ts.b;
import u70.m;
/* compiled from: SleepDayGraphFactory.java */
/* loaded from: classes3.dex */
public final class a extends i {
    private final boolean A;
    private final long B;
    private final boolean C;
    private final boolean D;
    private final ArrayList E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;

    /* renamed from: n  reason: collision with root package name */
    private final GraphView f39055n;

    /* renamed from: o  reason: collision with root package name */
    private final GraphPopupView f39056o;

    /* renamed from: p  reason: collision with root package name */
    private final DateTimeZone f39057p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f39058q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f39059r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f39060s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f39061t;

    /* renamed from: u  reason: collision with root package name */
    private final List<Vasistas> f39062u;

    /* renamed from: v  reason: collision with root package name */
    private final float f39063v;

    /* renamed from: w  reason: collision with root package name */
    private final float f39064w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f39065x;

    /* renamed from: y  reason: collision with root package name */
    private i.d f39066y;

    /* renamed from: z  reason: collision with root package name */
    private final float f39067z;

    /* compiled from: SleepDayGraphFactory.java */
    /* renamed from: com.withings.environment.ui.sleep.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    final class C0508a extends c {
        C0508a() {
        }

        @Override // com.withings.views.graphs.GraphPopupView.c
        public final String getPopupText(e eVar) {
            return m.a(a.this.f39055n.getContext().getString(SleepLevel.fromVasistasType(((Vasistas) eVar.f95625j).getSleepLevel()).getStringResID()));
        }

        @Override // com.withings.views.graphs.GraphPopupView.c
        public final String getPopupTitleText(e eVar) {
            Vasistas vasistas = (Vasistas) eVar.f95625j;
            StringBuilder sb2 = new StringBuilder();
            DateTime startDate = vasistas.getStartDate();
            a aVar = a.this;
            sb2.append(startDate.withZone(aVar.f39057p).toString(DateTimeFormat.shortTime()));
            sb2.append(" - ");
            sb2.append(vasistas.getEnd().withZone(aVar.f39057p).toString(DateTimeFormat.shortTime()));
            return sb2.toString();
        }
    }

    /* compiled from: SleepDayGraphFactory.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final GraphView f39069a;

        /* renamed from: b  reason: collision with root package name */
        private GraphPopupView f39070b;

        /* renamed from: c  reason: collision with root package name */
        private DateTimeZone f39071c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f39072d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f39073e;

        /* renamed from: g  reason: collision with root package name */
        private boolean f39075g;

        /* renamed from: h  reason: collision with root package name */
        private final List<Vasistas> f39076h;

        /* renamed from: k  reason: collision with root package name */
        private boolean f39079k;

        /* renamed from: f  reason: collision with root package name */
        private boolean f39074f = true;

        /* renamed from: i  reason: collision with root package name */
        private float f39077i = 3.0f;

        /* renamed from: j  reason: collision with root package name */
        private float f39078j = 3.0f;

        /* renamed from: l  reason: collision with root package name */
        private float f39080l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        private int f39081m = -1;

        /* renamed from: n  reason: collision with root package name */
        private int f39082n = -1;

        /* renamed from: o  reason: collision with root package name */
        private int f39083o = -1;

        /* renamed from: p  reason: collision with root package name */
        private int f39084p = -1;

        /* renamed from: q  reason: collision with root package name */
        private int f39085q = -1;

        /* renamed from: r  reason: collision with root package name */
        private long f39086r = 0;

        /* renamed from: s  reason: collision with root package name */
        private boolean f39087s = false;

        /* renamed from: t  reason: collision with root package name */
        private boolean f39088t = false;

        public b(GraphView graphView, List<Vasistas> list) {
            this.f39069a = graphView;
            this.f39076h = list;
        }

        public final void A(boolean z5) {
            this.f39079k = z5;
        }

        public final void B() {
            this.f39075g = true;
        }

        public final void C(float f11) {
            this.f39080l = f11;
        }

        public final void D() {
            this.f39072d = true;
        }

        public final void E() {
            this.f39073e = true;
        }

        public final void F() {
            this.f39077i = 2.5f;
        }

        public final void G(int i11, int i12, int i13, int i14, int i15) {
            this.f39081m = i11;
            this.f39082n = i12;
            this.f39083o = i13;
            this.f39084p = i14;
            this.f39085q = i15;
        }

        public final void H(DateTimeZone dateTimeZone) {
            this.f39071c = dateTimeZone;
        }

        public final void I(long j5) {
            this.f39086r = j5;
        }

        public final a u() {
            return new a(this);
        }

        public final void v() {
            this.f39074f = true;
        }

        public final void w() {
            this.f39087s = true;
        }

        public final void x() {
            this.f39088t = true;
        }

        public final void y() {
            this.f39078j = 1.75f;
        }

        public final void z(GraphPopupView graphPopupView) {
            this.f39070b = graphPopupView;
        }
    }

    a(b bVar) {
        super(bVar.f39069a);
        this.E = new ArrayList();
        this.f39055n = bVar.f39069a;
        this.f39056o = bVar.f39070b;
        this.f39057p = bVar.f39071c;
        this.f39058q = bVar.f39072d;
        this.f39061t = bVar.f39075g;
        this.f39062u = bVar.f39076h;
        this.f39065x = bVar.f39079k;
        this.f39060s = bVar.f39073e;
        this.f39059r = bVar.f39074f;
        this.f39067z = bVar.f39080l;
        this.F = bVar.f39081m;
        this.G = bVar.f39082n;
        this.H = bVar.f39083o;
        this.I = bVar.f39084p;
        this.J = bVar.f39085q;
        this.A = true;
        this.B = bVar.f39086r;
        this.f39063v = bVar.f39077i;
        this.f39064w = bVar.f39078j;
        this.C = bVar.f39087s;
        this.D = bVar.f39088t;
    }

    private rs.a H(Vasistas vasistas, DateTime dateTime) {
        int i11;
        float durationMillis = vasistas.getDurationMillis() / DateTimeConstants.MILLIS_PER_MINUTE;
        int millis = ((int) (vasistas.getStartDate().getMillis() - dateTime.getMillis())) / DateTimeConstants.MILLIS_PER_MINUTE;
        SleepLevel fromVasistasType = SleepLevel.fromVasistasType(vasistas.getSleepLevel());
        boolean equals = fromVasistasType.equals(SleepLevel.Manual);
        boolean z5 = this.f39065x;
        if (!equals) {
            a.C1589a c1589a = new a.C1589a(millis, fromVasistasType.getBarHeight(z5), vasistas);
            c1589a.w(durationMillis);
            c1589a.r(0);
            Context context = this.f39055n.getContext();
            int vasistasType = fromVasistasType.getVasistasType();
            int colorRes = fromVasistasType.getColorRes();
            if (vasistasType != SleepLevel.Awake.getVasistasType() ? vasistasType != SleepLevel.Rem.getVasistasType() ? vasistasType == SleepLevel.Light.getVasistasType() || vasistasType == SleepLevel.Unspecified.getVasistasType() ? (i11 = this.H) != -1 : vasistasType == SleepLevel.Deep.getVasistasType() && (i11 = this.I) != -1 : (i11 = this.G) != -1 : (i11 = this.F) != -1) {
                colorRes = i11;
            }
            c1589a.t(androidx.core.content.a.getColor(context, colorRes));
            c1589a.y();
            c1589a.f95628c = vasistas;
            return new rs.a(c1589a);
        }
        int i12 = this.J;
        if (i12 == -1) {
            i12 = C1987R.color.datavizMonochromaticNeutral5;
        }
        Paint a11 = y70.b.a(16, 16, androidx.core.content.a.getColor(h(), i12));
        a.C1589a c1589a2 = new a.C1589a(millis, 0.0f, vasistas);
        c1589a2.w(durationMillis);
        c1589a2.r(0);
        c1589a2.F(fromVasistasType.getBarHeight(z5));
        c1589a2.s(a11);
        c1589a2.y();
        c1589a2.f95628c = vasistas;
        return new rs.a(c1589a2);
    }

    private j I(GraphView graphView, DateTime dateTime) {
        Context context = graphView.getContext();
        j.a aVar = new j.a(context);
        Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
        aVar.o(drawOrder);
        aVar.Z(b50.b.t(context, dateTime));
        aVar.c0((float) (dateTime.minus(t().getMillis()).getMillis() / 60000));
        aVar.d0(-0.5f);
        aVar.o(drawOrder);
        aVar.a0(wq.a.k(C1987R.style.detail1, context, 10));
        aVar.K(0);
        aVar.S(g.k(4, graphView.getContext()));
        return aVar.L();
    }

    private j J(GraphView graphView, DateTime dateTime) {
        float barHeight;
        GraphView graphView2;
        int i11;
        Context context = graphView.getContext();
        graphView.setLayerType(1, null);
        int k11 = g.k(1, context);
        int k12 = g.k(1, context);
        int j5 = u.j(0.1f, u.v(16842806, context));
        TextPaint k13 = wq.a.k(C1987R.style.detail1, context, 10);
        String t11 = b50.b.t(context, dateTime);
        int k14 = g.k(8, context);
        float measureText = k13.measureText(t11) + (k14 * 2);
        j.a aVar = new j.a(context);
        Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
        aVar.o(drawOrder);
        aVar.Z(t11);
        float millis = (float) (dateTime.minus(t().getMillis()).getMillis() / 60000);
        aVar.c0(millis);
        if (this.f39059r) {
            barHeight = this.f39066y.f66446b - 0.5f;
        } else {
            barHeight = SleepLevel.Awake.getBarHeight(this.f39065x) + 1;
        }
        aVar.d0(barHeight);
        aVar.R(12);
        float q11 = this.f39055n.q(millis);
        float f11 = measureText / 2.0f;
        float f12 = q11 - f11;
        if (f12 < graphView2.getLeft()) {
            i11 = (int) (graphView2.getLeft() - f12);
        } else {
            float f13 = q11 + f11;
            if (f13 > graphView2.getRight()) {
                i11 = -((int) (f13 - graphView2.getRight()));
            } else {
                i11 = 0;
            }
        }
        aVar.P(i11, 0);
        aVar.a0(k13);
        aVar.o(drawOrder);
        aVar.K(u.v(16842809, context));
        aVar.N();
        aVar.Y(Paint.Style.FILL);
        aVar.S(k14);
        aVar.b0(k11, k12, j5);
        return aVar.L();
    }

    private k K(GraphView graphView, DateTime dateTime) {
        float barHeight;
        k.a aVar = new k.a();
        aVar.T((float) (dateTime.minus(t().getMillis()).getMillis() / 60000));
        aVar.J(0.0f);
        if (this.f39059r) {
            barHeight = this.f39066y.f66446b;
        } else {
            barHeight = SleepLevel.Awake.getBarHeight(this.f39065x) + 1;
        }
        aVar.R(barHeight);
        aVar.S();
        aVar.L(true);
        aVar.O(u.v(C1987R.attr.grid, graphView.getContext()));
        aVar.Q(g.k(1, graphView.getContext()));
        aVar.o(Decorator.DrawOrder.f39677a);
        return aVar.I();
    }

    @Override // f80.i
    protected final void D(GraphView graphView) {
        GraphPopupView graphPopupView = this.f39056o;
        if (graphPopupView == null) {
            return;
        }
        graphPopupView.setPopupContentProvider(new C0508a());
        graphPopupView.setShouldAlignToTopOfGraphView(true);
        graphPopupView.setPopupOffsetXProvider(new q(4));
        GraphView graphView2 = this.f39055n;
        graphView2.setScrubbingEnabled(true);
        graphView2.setPopup(graphPopupView);
    }

    @Override // f80.i
    protected final boolean E() {
        return false;
    }

    @Override // f80.i
    protected final void b(float f11, float f12, GraphView graphView) {
        DateTime startDate;
        DateTime end;
        Decorator.DrawOrder drawOrder;
        float barHeight;
        if (!this.f39058q) {
            return;
        }
        graphView.h();
        this.f39066y = v(f11, f12);
        List<Vasistas> list = this.f39062u;
        if (list.isEmpty()) {
            return;
        }
        int sleepLevel = list.get(0).getSleepLevel();
        SleepLevel sleepLevel2 = SleepLevel.Awake;
        if (sleepLevel == sleepLevel2.getVasistasType()) {
            startDate = list.get(0).getEnd();
        } else {
            startDate = list.get(0).getStartDate();
        }
        if (((Vasistas) w0.a(list, 1)).getSleepLevel() == sleepLevel2.getVasistasType()) {
            end = ((Vasistas) w0.a(list, 1)).getStartDate();
        } else {
            end = ((Vasistas) w0.a(list, 1)).getEnd();
        }
        DateTimeZone dateTimeZone = this.f39057p;
        DateTime withZone = startDate.withZone(dateTimeZone);
        DateTime withZone2 = end.withZone(dateTimeZone);
        graphView.b(K(graphView, withZone));
        graphView.b(K(graphView, withZone2));
        graphView.b(J(graphView, withZone));
        graphView.b(J(graphView, withZone2));
        boolean z5 = this.A;
        if (!z5) {
            DateTime startDate2 = list.get(0).getStartDate();
            DateTime end2 = ((Vasistas) w0.a(list, 1)).getEnd();
            graphView.b(I(graphView, startDate2));
            graphView.b(I(graphView, end2));
        }
        Iterator it = this.E.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            drawOrder = Decorator.DrawOrder.f39677a;
            if (!hasNext) {
                break;
            }
            DateTime dateTime = (DateTime) it.next();
            int v11 = u.v(C1987R.attr.colorOnPrimarySurface, h());
            float millis = ((float) dateTime.minus(t().getMillis()).getMillis()) / 60000.0f;
            float f13 = this.f39066y.f66446b - this.f39064w;
            String abstractInstant = dateTime.toString(DateTimeFormat.shortTime());
            kotlin.jvm.internal.u.i(abstractInstant, "toString(...)");
            Context context = graphView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            int w11 = u.w(16842809, context, -65281);
            k.a aVar = new k.a();
            aVar.T(millis);
            aVar.R(f13);
            aVar.S();
            aVar.O(v11);
            aVar.L(true);
            aVar.U();
            aVar.N(abstractInstant);
            aVar.P();
            aVar.M(u.j(0.6f, w11));
            graphView.b(aVar.I());
            Bitmap a11 = com.withings.views.view.a.a(androidx.core.content.a.getDrawable(graphView.getContext(), C1987R.drawable.ic_walk_small));
            h.a aVar2 = new h.a();
            aVar2.B(millis);
            aVar2.C(f13);
            aVar2.z(10);
            aVar2.w(a11);
            aVar2.o(drawOrder);
            aVar2.A(v11);
            graphView.b(aVar2.v());
        }
        boolean z11 = this.f39061t;
        boolean z12 = this.f39065x;
        if (!z11 && z5) {
            DateTime plus = startDate.plus((end.getMillis() - startDate.getMillis()) / 2);
            long j5 = this.B;
            if (j5 != 0) {
                Context context2 = graphView.getContext();
                TextPaint k11 = wq.a.k(C1987R.style.body1, context2, 15);
                k11.setColor(u.v(16843282, context2));
                j.a aVar3 = new j.a(graphView.getContext());
                aVar3.o(drawOrder);
                e.a aVar4 = new e.a(h());
                aVar4.a(true);
                aVar4.w(true);
                aVar4.t(true);
                aVar3.Z(new pm.e(aVar4).a(j5));
                aVar3.c0((float) (plus.minus(t().getMillis()).getMillis() / 60000));
                if (this.f39059r) {
                    barHeight = this.f39066y.f66446b - 0.5f;
                } else {
                    barHeight = SleepLevel.Awake.getBarHeight(z12) + 1;
                }
                aVar3.d0(barHeight);
                aVar3.R(12);
                aVar3.o(drawOrder);
                aVar3.a0(k11);
                aVar3.K(0);
                graphView.b(aVar3.L());
            }
        }
        if (this.f39060s) {
            GraphView graphView2 = this.f39055n;
            graphView2.b(km.a.d(graphView2, SleepLevel.Deep.getBarHeight(z12)));
            graphView2.b(km.a.d(graphView2, SleepLevel.Light.getBarHeight(z12)));
            graphView2.b(km.a.d(graphView2, SleepLevel.Rem.getBarHeight(z12)));
            SleepLevel sleepLevel3 = SleepLevel.Awake;
            graphView2.b(km.a.d(graphView2, sleepLevel3.getBarHeight(z12)));
            graphView2.b(km.a.d(graphView2, sleepLevel3.getBarHeight(z12) + 1));
        }
    }

    @Override // f80.i
    protected final void c(GraphView graphView) {
        graphView.i();
        b.a aVar = new b.a();
        aVar.l(p());
        graphView.setMainGraph(aVar.o());
    }

    @Override // f80.i
    protected final i.a g(DateTime dateTime, DateTime dateTime2) {
        Vasistas vasistas;
        i.a aVar = new i.a();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            List<Vasistas> list = this.f39062u;
            if (i11 < list.size()) {
                Vasistas vasistas2 = list.get(i11);
                int i12 = i11 + 1;
                if (i12 < list.size()) {
                    vasistas = list.get(i12);
                } else {
                    vasistas = null;
                }
                ArrayList arrayList2 = this.E;
                if (vasistas != null && this.C) {
                    int sleepLevel = vasistas2.getSleepLevel();
                    SleepLevel sleepLevel2 = SleepLevel.Awake;
                    if (sleepLevel == sleepLevel2.getVasistasType() && vasistas.getSleepLevel() == sleepLevel2.getVasistasType() && vasistas2.getEnd().isBefore(vasistas.getStartDate())) {
                        long millis = new Duration(vasistas2.getStartDate(), vasistas.getEnd()).getMillis();
                        Vasistas m34clone = vasistas2.m34clone();
                        m34clone.setDurationMillis((int) millis);
                        if (m34clone.getSleepLevel() == sleepLevel2.getVasistasType()) {
                            arrayList2.add(m34clone.getStartDate().plusMillis(m34clone.getDurationMillis() / 2));
                        }
                        arrayList.add(H(m34clone, dateTime));
                        i11 = i12;
                        i11++;
                    }
                }
                if (vasistas != null && this.D && vasistas2.getEnd().isBefore(vasistas.getStartDate())) {
                    long millis2 = new Duration(vasistas2.getEnd(), vasistas.getStartDate()).getMillis();
                    Vasistas m34clone2 = vasistas2.m34clone();
                    SleepLevel sleepLevel3 = SleepLevel.Awake;
                    m34clone2.setSleepLevel(sleepLevel3.getVasistasType());
                    m34clone2.setStartDate(vasistas2.getEnd());
                    m34clone2.setDurationMillis((int) millis2);
                    if (m34clone2.getSleepLevel() == sleepLevel3.getVasistasType()) {
                        arrayList2.add(m34clone2.getStartDate().plusMillis(m34clone2.getDurationMillis() / 2));
                    }
                    arrayList.add(H(m34clone2, dateTime));
                }
                arrayList.add(H(vasistas2, dateTime));
                i11++;
            } else {
                aVar.f66439a = arrayList;
                return aVar;
            }
        }
    }

    @Override // f80.i
    protected final i.b n(float f11) {
        float millis = ((float) new Duration(t(), k()).getMillis()) / 60000.0f;
        Display defaultDisplay = ((WindowManager) h().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        float f12 = (millis / point.x) * this.f39067z;
        return new i.b(0.0f - f12, millis + f12);
    }

    @Override // f80.i
    protected final i.d v(float f11, float f12) {
        return new i.d(-0.75f, SleepLevel.Awake.getBarHeight(this.f39065x) + this.f39063v);
    }
}

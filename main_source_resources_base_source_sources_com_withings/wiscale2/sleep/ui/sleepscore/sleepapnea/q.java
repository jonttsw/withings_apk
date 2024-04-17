package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.j;
import com.withings.graph.decorator.k;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.graph.DataPopUpView;
import f80.i;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import rs.b;
import rs.e;
import rs.h;
import ts.a;
import ts.c;
/* compiled from: SleepDisorderDayGraphFactory.kt */
/* loaded from: classes5.dex */
public final class q extends f80.i {

    /* renamed from: n  reason: collision with root package name */
    private final DataPopUpView f61428n;

    /* renamed from: o  reason: collision with root package name */
    private final List<DatedValue> f61429o;

    /* renamed from: p  reason: collision with root package name */
    private final com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a f61430p;

    /* renamed from: q  reason: collision with root package name */
    private final List<Integer> f61431q;

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f61432r;

    /* renamed from: s  reason: collision with root package name */
    private final nm0.g f61433s;

    /* renamed from: t  reason: collision with root package name */
    private DateTime f61434t;

    /* renamed from: u  reason: collision with root package name */
    private DateTime f61435u;

    /* compiled from: SleepDisorderDayGraphFactory.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<LinearGradient> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TimeGraphView f61437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TimeGraphView timeGraphView) {
            super(0);
            this.f61437b = timeGraphView;
        }

        @Override // ym0.a
        public final LinearGradient invoke() {
            TimeGraphView timeGraphView = this.f61437b;
            Context context = timeGraphView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            return q.this.G(context, timeGraphView.getHeight(), 1.0f);
        }
    }

    /* compiled from: SleepDisorderDayGraphFactory.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<LinearGradient> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TimeGraphView f61439b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TimeGraphView timeGraphView) {
            super(0);
            this.f61439b = timeGraphView;
        }

        @Override // ym0.a
        public final LinearGradient invoke() {
            TimeGraphView timeGraphView = this.f61439b;
            Context context = timeGraphView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            return q.this.G(context, timeGraphView.getHeight(), 0.1f);
        }
    }

    /* compiled from: SleepDisorderDayGraphFactory.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<rs.e, List<? extends qf0.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataPopUpView f61440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DataPopUpView dataPopUpView) {
            super(1);
            this.f61440a = dataPopUpView;
        }

        @Override // ym0.l
        public final List<? extends qf0.b> invoke(rs.e eVar) {
            rs.e datum = eVar;
            kotlin.jvm.internal.u.j(datum, "datum");
            Object obj = datum.f95625j;
            kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type org.joda.time.DateTime");
            Context context = this.f61440a.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            return kotlin.collections.x.V(new qf0.b(b50.b.t(context, (DateTime) obj), null));
        }
    }

    public q(TimeGraphView timeGraphView, DataPopUpView dataPopUpView, List<DatedValue> list, com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar, List<Integer> list2) {
        super(timeGraphView);
        DateTime now;
        DateTime now2;
        this.f61428n = dataPopUpView;
        this.f61429o = list;
        this.f61430p = aVar;
        this.f61431q = list2;
        this.f61432r = nm0.h.b(new a(timeGraphView));
        this.f61433s = nm0.h.b(new b(timeGraphView));
        DatedValue datedValue = (DatedValue) kotlin.collections.x.K(list);
        this.f61434t = (datedValue == null || (now = datedValue.a()) == null) ? DateTime.now() : now;
        DatedValue datedValue2 = (DatedValue) kotlin.collections.x.U(list);
        this.f61435u = (datedValue2 == null || (now2 = datedValue2.a()) == null) ? DateTime.now() : now2;
        timeGraphView.i();
        timeGraphView.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearGradient G(Context context, int i11, float f11) {
        List<Integer> list = this.f61431q;
        int j5 = ah.u.j(f11, androidx.core.content.a.getColor(context, list.get(2).intValue()));
        int j11 = ah.u.j(f11, androidx.core.content.a.getColor(context, list.get(1).intValue()));
        int j12 = ah.u.j(f11, androidx.core.content.a.getColor(context, list.get(0).intValue()));
        int[] iArr = {j5, j5, j11, j11, j12, j12};
        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar = this.f61430p;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f - (aVar.c().c().n() / 120.00001f), 1.0f - (aVar.c().c().n() / 120.00001f), 1.0f - (aVar.b().c().n() / 120.00001f), 1.0f - (aVar.b().c().n() / 120.00001f), 1.0f}, Shader.TileMode.CLAMP);
    }

    private final com.withings.graph.decorator.j I(GraphView graphView, DateTime dateTime) {
        Context context = graphView.getContext();
        graphView.setLayerType(1, null);
        kotlin.jvm.internal.u.g(context);
        int k11 = ah.g.k(1, context);
        int k12 = ah.g.k(1, context);
        int j5 = ah.u.j(0.1f, ah.u.w(16842806, context, -65281));
        j.a aVar = new j.a(context);
        Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
        aVar.o(drawOrder);
        aVar.Z(b50.b.t(context, dateTime));
        aVar.c0(K(dateTime));
        aVar.d0(120.00001f);
        aVar.R(12);
        aVar.a0(wq.a.k(C1987R.style.detail1, context, 10));
        aVar.o(drawOrder);
        aVar.K(ah.u.w(16842809, context, -65281));
        aVar.N();
        aVar.Y(Paint.Style.FILL);
        aVar.S(ah.g.k(8, context));
        aVar.b0(k11, k12, j5);
        return aVar.L();
    }

    private final com.withings.graph.decorator.k J(GraphView graphView, DateTime dateTime) {
        k.a aVar = new k.a();
        aVar.T(K(dateTime));
        aVar.J(0.0f);
        aVar.R(100.0f);
        aVar.L(true);
        Context h11 = h();
        kotlin.jvm.internal.u.i(h11, "getContext(...)");
        aVar.O(ah.u.w(C1987R.attr.grid, h11, -65281));
        Context context = graphView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        aVar.Q(ah.g.k(1, context));
        aVar.o(Decorator.DrawOrder.f39677a);
        return aVar.I();
    }

    private final float K(DateTime dateTime) {
        return (float) new Duration(this.f61434t, dateTime).getStandardMinutes();
    }

    @Override // f80.i
    protected final void D(GraphView timeGraphView) {
        kotlin.jvm.internal.u.j(timeGraphView, "timeGraphView");
        DataPopUpView dataPopUpView = this.f61428n;
        dataPopUpView.setPositionMode(2);
        dataPopUpView.setContentProvider(new c(dataPopUpView));
        dataPopUpView.setShouldShowLine(true);
        dataPopUpView.setShouldLineMatchContentRectBottom(false);
        timeGraphView.setScrubbingEnabled(true);
        timeGraphView.setPopup(dataPopUpView);
    }

    @Override // f80.i
    protected final boolean E() {
        return false;
    }

    @Override // f80.i
    protected final void b(float f11, float f12, GraphView graphView) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        DateTime firstAHIDate = this.f61434t;
        kotlin.jvm.internal.u.i(firstAHIDate, "firstAHIDate");
        graphView.b(J(graphView, firstAHIDate));
        DateTime lastAHIDate = this.f61435u;
        kotlin.jvm.internal.u.i(lastAHIDate, "lastAHIDate");
        graphView.b(J(graphView, lastAHIDate));
        graphView.b(I(graphView, firstAHIDate));
        graphView.b(I(graphView, lastAHIDate));
        float K = K(lastAHIDate) + 15.0f;
        Float valueOf = Float.valueOf(-15.0f);
        graphView.b(km.a.g(graphView, 0.0f, false, 0, valueOf, Float.valueOf(K), null, null, 204));
        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar = this.f61430p;
        graphView.b(km.a.g(graphView, aVar.b().c().n(), false, 0, valueOf, Float.valueOf(K), null, null, 204));
        graphView.b(km.a.g(graphView, aVar.c().c().n(), false, 0, valueOf, Float.valueOf(K), null, null, 204));
        graphView.b(km.a.g(graphView, aVar.a().c().n(), false, 0, valueOf, Float.valueOf(K), null, null, 204));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [os.a, java.lang.Object] */
    @Override // f80.i
    protected final void c(GraphView graphView) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        a.C1685a c1685a = new a.C1685a();
        c1685a.l(p());
        c1685a.t((LinearGradient) this.f61432r.getValue());
        Context h11 = h();
        kotlin.jvm.internal.u.i(h11, "getContext(...)");
        c1685a.w(ah.g.k(2, h11));
        c1685a.v(true);
        graphView.d(c1685a.s());
        List<rs.h> l5 = l();
        kotlin.jvm.internal.u.i(l5, "getEnvelopDatumList(...)");
        List<rs.h> list = l5;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (rs.h hVar : list) {
            hVar.n(false);
            arrayList.add(hVar);
        }
        c.a aVar = new c.a();
        aVar.l(arrayList);
        Paint paint = new Paint();
        paint.setShader((LinearGradient) this.f61433s.getValue());
        aVar.z(paint);
        aVar.i(new Object());
        aVar.D();
        aVar.C(false);
        aVar.A(0);
        graphView.d(aVar.x());
        graphView.invalidate();
    }

    @Override // f80.i
    protected final i.a g(DateTime dateTime, DateTime dateTime2) {
        i.a aVar = new i.a();
        List<DatedValue> list = this.f61429o;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (DatedValue datedValue : list) {
            b.a aVar2 = new b.a(K(datedValue.a()), datedValue.b(), datedValue.a());
            aVar2.d(0.0f, 0.0f, 0.0f);
            aVar2.h(0.0f, 0.0f, 0.0f);
            arrayList.add(new rs.b(aVar2));
        }
        aVar.f66439a = arrayList;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(list, 10));
        for (DatedValue datedValue2 : list) {
            float K = K(datedValue2.a());
            rs.e eVar = new rs.e(new e.a(K, 0.0f));
            rs.e eVar2 = new rs.e(new e.a(K, datedValue2.b()));
            h.a aVar3 = new h.a(K, 0.0f);
            aVar3.h(eVar, eVar2);
            arrayList2.add(new rs.h(aVar3));
        }
        aVar.f66442d = arrayList2;
        return aVar;
    }

    @Override // f80.i
    protected final i.b n(float f11) {
        long standardMinutes = new Duration(t(), k()).getStandardMinutes();
        return new i.b(((float) (-standardMinutes)) * 0.08f, ((float) standardMinutes) * 1.08f);
    }

    @Override // f80.i
    protected final i.d v(float f11, float f12) {
        return new i.d(0.0f, 120.00001f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f80.i
    public final void z(GraphView graphView) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        super.z(graphView);
        graphView.setDoubleTapToZoomEnabled(false);
        graphView.setScaleGestureEnabled(false);
        graphView.setScrollXEnabled(false);
        graphView.setScrollYEnabled(false);
        graphView.requestLayout();
    }
}

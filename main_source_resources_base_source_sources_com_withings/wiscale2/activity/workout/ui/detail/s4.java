package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.axis.HorizontalAxis;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.j;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import f80.i;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import ts.a;
/* compiled from: WorkoutHeartRateGraphFactory.kt */
/* loaded from: classes4.dex */
public final class s4 extends f80.i {

    /* renamed from: n  reason: collision with root package name */
    private final GraphPopupView f49609n;

    /* renamed from: o  reason: collision with root package name */
    private final a f49610o;

    /* renamed from: p  reason: collision with root package name */
    private final com.withings.views.graphs.c f49611p;

    /* renamed from: q  reason: collision with root package name */
    private final kj0.c f49612q;

    /* renamed from: r  reason: collision with root package name */
    private final long f49613r;

    /* renamed from: s  reason: collision with root package name */
    private final long f49614s;

    /* renamed from: t  reason: collision with root package name */
    private final float f49615t;

    /* renamed from: u  reason: collision with root package name */
    private final int f49616u;

    /* renamed from: v  reason: collision with root package name */
    private final int f49617v;

    /* renamed from: w  reason: collision with root package name */
    private final int f49618w;

    /* renamed from: x  reason: collision with root package name */
    private final int f49619x;

    /* compiled from: WorkoutHeartRateGraphFactory.kt */
    /* loaded from: classes4.dex */
    public static final class a extends i.a {

        /* renamed from: e  reason: collision with root package name */
        private List<rs.e> f49620e;

        /* renamed from: f  reason: collision with root package name */
        private final List<DateTime> f49621f;

        /* renamed from: g  reason: collision with root package name */
        private final DateTime f49622g;

        public a() {
            throw null;
        }

        public a(ArrayList pausesDateTime, DateTime dateTime, int i11) {
            ArrayList arrayList = new ArrayList();
            pausesDateTime = (i11 & 2) != 0 ? new ArrayList() : pausesDateTime;
            kotlin.jvm.internal.u.j(pausesDateTime, "pausesDateTime");
            this.f49620e = arrayList;
            this.f49621f = pausesDateTime;
            this.f49622g = dateTime;
        }

        public final DateTime a() {
            return this.f49622g;
        }

        public final List<DateTime> b() {
            return this.f49621f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f49620e, aVar.f49620e) && kotlin.jvm.internal.u.e(this.f49621f, aVar.f49621f) && kotlin.jvm.internal.u.e(this.f49622g, aVar.f49622g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f49622g.hashCode() + defpackage.e.b(this.f49621f, this.f49620e.hashCode() * 31, 31);
        }

        public final String toString() {
            return "HeartRateDataHolder(dataDatums=" + this.f49620e + ", pausesDateTime=" + this.f49621f + ", lastDate=" + this.f49622g + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(GraphView graphView, Track track, User user, GraphPopupView graphPopupView, a aVar, z4 popupContentProvider) {
        super(graphView);
        int i11;
        kotlin.jvm.internal.u.j(track, "track");
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(popupContentProvider, "popupContentProvider");
        this.f49609n = graphPopupView;
        this.f49610o = aVar;
        this.f49611p = popupContentProvider;
        this.f49612q = new kj0.c(user);
        this.f49613r = 31000L;
        this.f49614s = 120000L;
        if (user.p() == 0) {
            i11 = 220;
        } else {
            i11 = 200;
        }
        this.f49615t = i11;
        this.f49616u = h().getColor(C1987R.color.datavizMonochromaticNeutral2);
        this.f49617v = h().getColor(C1987R.color.datavizMonochromaticNeutral3);
        this.f49618w = h().getColor(C1987R.color.datavizMonochromaticNeutral4);
        this.f49619x = h().getColor(C1987R.color.datavizMonochromaticNeutral5);
        graphView.i();
        graphView.h();
    }

    private static com.withings.graph.decorator.j F(GraphView graphView, float f11) {
        Context context = graphView.getContext();
        kotlin.jvm.internal.u.g(context);
        int w11 = ah.u.w(16842809, context, -65281);
        j.a aVar = new j.a(context);
        Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
        aVar.o(drawOrder);
        aVar.Z(NumberFormat.getIntegerInstance().format(f11));
        aVar.d0(f11);
        aVar.M(2);
        aVar.o(drawOrder);
        aVar.K(androidx.core.graphics.c.k(w11, 229));
        aVar.a0(wq.a.k(C1987R.style.detail1, context, 14));
        aVar.S(12);
        aVar.X(32);
        return aVar.L();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.withings.graph.axis.a$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.withings.graph.axis.a$a, com.withings.graph.axis.HorizontalAxis$a, com.withings.graph.axis.HorizontalAxis$b] */
    @Override // f80.i
    protected final void A() {
        Context h11 = h();
        kotlin.jvm.internal.u.i(h11, "getContext(...)");
        TextPaint k11 = wq.a.k(C1987R.style.detail1, h11, 10);
        k11.setColor(h().getColor(C1987R.color.textPrimary));
        Context h12 = h();
        kotlin.jvm.internal.u.i(h12, "getContext(...)");
        ?? aVar = new HorizontalAxis.a(ah.g.k(32, h12));
        aVar.J(HorizontalAxis.HorizontalAxisPosition.f39591c);
        Context h13 = h();
        kotlin.jvm.internal.u.i(h13, "getContext(...)");
        aVar.r(ah.u.w(C1987R.attr.grid, h13, -65281));
        aVar.B(false);
        aVar.x(k11);
        aVar.A(2.0f);
        aVar.y(new Object());
        aVar.z(9);
        aVar.L(m());
        this.f66427a.setXAxis(aVar.M());
    }

    @Override // f80.i
    protected final void D(GraphView graphView) {
        GraphView graphView2 = this.f66427a;
        kotlin.jvm.internal.u.i(graphView2, "graphView");
        GraphPopupView graphPopupView = this.f49609n;
        graphPopupView.setShouldAlignToTopOfGraphView(true);
        graphPopupView.setPopupContentProvider(this.f49611p);
        graphView2.setScrubbingEnabled(true);
        graphView2.setPopup(graphPopupView);
    }

    @Override // f80.i
    protected final boolean E() {
        return true;
    }

    public final void G(List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 < list.size() - 1) {
                rs.e eVar = (rs.e) list.get(i11);
                float f11 = (((rs.e) list.get(i11 + 1)).f95616a - eVar.f95616a) * ((float) DateTimeConstants.MILLIS_PER_MINUTE);
                float f12 = (float) this.f49613r;
                if (f11 <= f12) {
                    eVar.l(0);
                } else if (f11 > f12 && f11 < ((float) this.f49614s)) {
                    eVar.l(1);
                } else {
                    eVar.l(2);
                    eVar.f95618c = 0;
                }
            }
        }
    }

    @Override // f80.i
    protected final void b(float f11, float f12, GraphView graphView) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        kj0.c cVar = this.f49612q;
        graphView.b(km.a.g(graphView, cVar.e(), false, 0, null, null, null, null, ConstantsWs.WS_STATUS_WRONGBATTERYLVL));
        graphView.b(F(graphView, cVar.e()));
        graphView.b(km.a.g(graphView, cVar.f(), false, 0, null, null, null, null, ConstantsWs.WS_STATUS_WRONGBATTERYLVL));
        graphView.b(F(graphView, cVar.f()));
        graphView.b(km.a.g(graphView, cVar.d(), false, 0, null, null, null, null, ConstantsWs.WS_STATUS_WRONGBATTERYLVL));
        graphView.b(F(graphView, cVar.d()));
        graphView.b(km.a.g(graphView, 50.0f, false, 0, null, null, null, null, ConstantsWs.WS_STATUS_WRONGBATTERYLVL));
        graphView.b(F(graphView, 50.0f));
        for (DateTime dateTime : this.f49610o.b()) {
            d(dateTime, C1987R.drawable.icon_medium_navigation_playerpause, graphView, this.f66433g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [os.a, java.lang.Object] */
    @Override // f80.i
    protected final void c(GraphView graphView) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        List<rs.e> p11 = p();
        kotlin.jvm.internal.u.i(p11, "getMainDatumList(...)");
        a.C1685a c1685a = new a.C1685a();
        c1685a.l(p11);
        float r7 = graphView.r(0.0f);
        float r11 = graphView.r(this.f49615t);
        int i11 = this.f49616u;
        int i12 = this.f49617v;
        int i13 = this.f49618w;
        int i14 = this.f49619x;
        c1685a.t(new LinearGradient(0.0f, r7, 0.0f, r11, new int[]{i11, i11, i12, i12, i13, i14, i14}, (float[]) null, Shader.TileMode.CLAMP));
        c1685a.u(graphView.getContext().getColor(C1987R.color.datavizMonochromaticNeutral3));
        Context context = graphView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        c1685a.w(ah.g.k(2, context));
        c1685a.i(new Object());
        c1685a.v(false);
        graphView.d(c1685a.s());
    }

    @Override // f80.i
    protected final i.a g(DateTime start, DateTime end) {
        kotlin.jvm.internal.u.j(start, "start");
        kotlin.jvm.internal.u.j(end, "end");
        return this.f49610o;
    }

    @Override // f80.i
    protected final i.b n(float f11) {
        i.b j5 = j();
        float f12 = j5.f66444b;
        j5.f66444b = (0.1f * f12) + f12;
        return j5;
    }

    @Override // f80.i
    protected final i.d v(float f11, float f12) {
        return new i.d(30.0f, this.f49612q.b());
    }
}

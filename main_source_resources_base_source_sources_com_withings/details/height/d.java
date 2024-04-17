package com.withings.details.height;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.graph.TimeGraphView;
import com.withings.graph.axis.VerticalAxis;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.wiscale2.C1987R;
import f80.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l70.u;
import org.joda.time.DateTime;
import rs.e;
import rs.h;
import s80.j;
import ts.b;
import ts.c;
/* compiled from: HeightGraphFactory.kt */
/* loaded from: classes3.dex */
public final class d extends f80.j {

    /* renamed from: h  reason: collision with root package name */
    private final User f36582h;

    /* renamed from: i  reason: collision with root package name */
    private final List<ky.d> f36583i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f36584j;

    /* renamed from: k  reason: collision with root package name */
    private final GraphPopupView f36585k;

    /* renamed from: l  reason: collision with root package name */
    private final int f36586l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f36587m;

    /* renamed from: n  reason: collision with root package name */
    private List<? extends List<b90.a>> f36588n;

    /* renamed from: o  reason: collision with root package name */
    private final int f36589o;

    /* renamed from: p  reason: collision with root package name */
    private final int f36590p;

    /* compiled from: HeightGraphFactory.kt */
    /* loaded from: classes3.dex */
    public static final class a extends j.a {
        a(b bVar) {
            super(d.this, bVar);
        }

        @Override // com.withings.views.graphs.GraphPopupView.c
        public final String getPopupText(rs.e datum) {
            Double d11;
            double d12;
            kotlin.jvm.internal.u.j(datum, "datum");
            Object obj = datum.f95625j;
            kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.measure.core.models.MeasuresGroup");
            ky.a e11 = ly.a.e(4, (ky.d) obj);
            if (e11 != null) {
                d11 = Double.valueOf(e11.f());
            } else {
                d11 = null;
            }
            jm.a v11 = d.v(d.this);
            if (d11 != null) {
                d12 = d11.doubleValue();
            } else {
                d12 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            return v11.f(d12, 4);
        }
    }

    /* compiled from: HeightGraphFactory.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<Context, DateTime, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36592a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final String invoke(Context context, DateTime dateTime) {
            Context context2 = context;
            DateTime dateTime2 = dateTime;
            kotlin.jvm.internal.u.j(context2, "context");
            kotlin.jvm.internal.u.j(dateTime2, "dateTime");
            return b50.b.i(context2, dateTime2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(User user, List userHeights, Context context, GraphPopupView graphPopupView, int i11, TimeGraphView timeGraphView, f80.a aVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        super(timeGraphView, aVar, lifecycleCoroutineScopeImpl);
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(userHeights, "userHeights");
        kotlin.jvm.internal.u.j(context, "context");
        this.f36582h = user;
        this.f36583i = userHeights;
        this.f36584j = context;
        this.f36585k = graphPopupView;
        this.f36586l = i11;
        this.f36587m = nm0.h.b(new c(this));
        int color = context.getColor(C1987R.color.statusInfo);
        this.f36589o = color;
        this.f36590p = ah.u.j(0.15f, color);
    }

    public static String u(d this$0, float f11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        return ((jm.a) this$0.f36587m.getValue()).b(f11, 4);
    }

    public static final jm.a v(d dVar) {
        return (jm.a) dVar.f36587m.getValue();
    }

    @Override // f80.j
    public final void b(TimeGraphView graphView, List<? extends rs.e> list) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        List<? extends List<b90.a>> list2 = this.f36588n;
        if (list2 != null) {
            l70.u.f78815b.getClass();
            l70.u c11 = u.a.c(this.f36586l);
            List<? extends List<b90.a>> list3 = list2;
            int i11 = 10;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                List list4 = (List) it.next();
                ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(list4, i11));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    b90.a aVar = (b90.a) it2.next();
                    float i12 = bt.a.i(aVar.a());
                    double d11 = aVar.d();
                    boolean z5 = c11 instanceof l70.l;
                    if (z5) {
                        d11 /= 0.3048d;
                    }
                    float f11 = (float) d11;
                    Iterator it3 = it2;
                    double b10 = aVar.b();
                    if (z5) {
                        b10 /= 0.3048d;
                    }
                    float f12 = (float) b10;
                    h.a aVar2 = new h.a(i12, (f11 + f12) / 2);
                    aVar2.h(new rs.e(new e.a(i12, f11)), new rs.e(new e.a(i12, f12)));
                    aVar2.f95629d = false;
                    arrayList2.add(new rs.h(aVar2));
                    it2 = it3;
                }
                c.a aVar3 = new c.a();
                aVar3.l(arrayList2);
                int i13 = this.f36590p;
                aVar3.y(i13);
                aVar3.A(i13);
                aVar3.E();
                aVar3.D();
                ts.c x11 = aVar3.x();
                x11.l("normalityZone");
                arrayList.add(x11);
                i11 = 10;
            }
            Context context = graphView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            boolean z11 = wq.a.l(context).getBoolean("showWeightNormality", false);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ts.d dVar = (ts.d) it4.next();
                dVar.k(z11);
                graphView.d(dVar);
            }
            List<? extends rs.e> list5 = list;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(list5, 10));
            for (rs.e eVar : list5) {
                e.a aVar4 = new e.a(eVar.f95616a, eVar.f95617b, eVar.f95625j);
                aVar4.f95629d = false;
                arrayList3.add(new rs.e(aVar4));
            }
            ts.a d12 = d(this.f36589o, arrayList3);
            b.a aVar5 = new b.a();
            aVar5.l(list);
            aVar5.i(new ps.a());
            ts.b o11 = aVar5.o();
            graphView.setMainGraph(d12);
            graphView.d(o11);
            return;
        }
        kotlin.jvm.internal.u.s("normalityZones");
        throw null;
    }

    @Override // f80.j
    public final Object e(qm0.d<? super List<? extends rs.e>> dVar) {
        Double d11;
        rs.b bVar;
        User user = this.f36582h;
        s80.j a11 = j.C1609j.a(4, user);
        DateTime plusYears = user.f().plusYears(19);
        DateTime f11 = user.f();
        kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
        kotlin.jvm.internal.u.g(plusYears);
        List<ky.d> list = this.f36583i;
        this.f36588n = a11.a(f11, plusYears, null, list);
        ArrayList arrayList = new ArrayList();
        for (ky.d dVar2 : list) {
            ky.a e11 = ly.a.e(4, dVar2);
            if (e11 != null) {
                d11 = new Double(e11.f());
            } else {
                d11 = null;
            }
            if (d11 != null) {
                bVar = c(dVar2, (float) d11.doubleValue(), this.f36589o);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // f80.j
    protected final void q(TimeGraphView timeGraphView) {
        kotlin.jvm.internal.u.j(timeGraphView, "timeGraphView");
        a aVar = new a(b.f36592a);
        Context context = this.f36584j;
        kotlin.jvm.internal.u.j(context, "context");
        GraphPopupView popup = this.f36585k;
        kotlin.jvm.internal.u.j(popup, "popup");
        popup.setShouldAlignToTopOfGraphView(true);
        popup.setPopupContentProvider(aVar);
        timeGraphView.setPopup(popup);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.withings.graph.axis.a$a, com.withings.graph.axis.VerticalAxis$a, com.withings.graph.axis.VerticalAxis$b] */
    @Override // f80.j
    public final void r() {
        Context context = this.f36584j;
        int c11 = wq.a.c(40, context);
        int w11 = ah.u.w(16842809, context, -65281);
        ?? aVar = new VerticalAxis.a(c11);
        aVar.K(VerticalAxis.VerticalAxisPosition.f39599a);
        aVar.r(ah.u.w(C1987R.attr.grid, context, -65281));
        aVar.u(wq.a.c(1, context));
        aVar.J(true);
        aVar.w(ah.u.j(0.6f, w11));
        aVar.x(wq.a.k(C1987R.style.detail1, context, 14));
        aVar.y(new com.withings.details.height.b(this, 0));
        aVar.B(true);
        aVar.D();
        aVar.z(4);
        i().setYAxis(new VerticalAxis(aVar));
    }

    @Override // f80.j
    protected final boolean s() {
        return true;
    }

    public final Context w() {
        return this.f36584j;
    }
}

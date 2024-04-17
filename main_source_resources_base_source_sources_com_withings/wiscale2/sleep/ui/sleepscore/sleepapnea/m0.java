package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.withings.graph.TimeGraphView;
import com.withings.graph.axis.HorizontalAxis;
import com.withings.graph.axis.VerticalAxis;
import com.withings.graph.axis.a;
import com.withings.graph.axis.b;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.b;
import com.withings.graph.decorator.j;
import com.withings.sleepapnea.core.BreathingDisturbanceStatus;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.graph.DataPopUpView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import rs.b;
import ts.a;
/* compiled from: SleepDisorderGraphFactory.kt */
/* loaded from: classes5.dex */
public final class m0 extends f80.j {

    /* renamed from: h  reason: collision with root package name */
    private final Context f61384h;

    /* renamed from: i  reason: collision with root package name */
    private final List<DatedValue> f61385i;

    /* renamed from: j  reason: collision with root package name */
    private final DateTime f61386j;

    /* renamed from: k  reason: collision with root package name */
    private final int f61387k;

    /* renamed from: l  reason: collision with root package name */
    private final com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a f61388l;

    /* renamed from: m  reason: collision with root package name */
    private DataPopUpView f61389m;

    /* renamed from: n  reason: collision with root package name */
    private final int f61390n;

    /* renamed from: o  reason: collision with root package name */
    private final int f61391o;

    /* compiled from: SleepDisorderGraphFactory.kt */
    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TimeGraphView f61392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m0 f61393b;

        a(TimeGraphView timeGraphView, m0 m0Var) {
            this.f61392a = timeGraphView;
            this.f61393b = m0Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            TimeGraphView timeGraphView = this.f61392a;
            timeGraphView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f61393b.y(timeGraphView);
        }
    }

    /* compiled from: SleepDisorderGraphFactory.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<rs.e, List<? extends qf0.b>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataPopUpView f61395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DataPopUpView dataPopUpView) {
            super(1);
            this.f61395b = dataPopUpView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ym0.l
        public final List<? extends qf0.b> invoke(rs.e eVar) {
            Object obj;
            String str;
            en0.k kVar;
            en0.k kVar2;
            rs.e datum = eVar;
            kotlin.jvm.internal.u.j(datum, "datum");
            boolean d11 = m0.this.f61388l.d();
            DataPopUpView dataPopUpView = this.f61395b;
            if (d11) {
                str = dataPopUpView.getContext().getString(C1987R.string.sleepApnea_details_graphLabel_formatted, Integer.valueOf((int) datum.f95617b));
            } else {
                int i11 = (int) datum.f95617b;
                Iterator it = kotlin.collections.x.W(BreathingDisturbanceStatus.f44273a, BreathingDisturbanceStatus.f44274b, BreathingDisturbanceStatus.f44275c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        BreathingDisturbanceStatus breathingDisturbanceStatus = (BreathingDisturbanceStatus) obj;
                        kotlin.jvm.internal.u.j(breathingDisturbanceStatus, "<this>");
                        int ordinal = breathingDisturbanceStatus.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        int i12 = en0.k.f65798e;
                                        kVar2 = en0.k.f65797d;
                                        kVar = kVar2;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    kVar = en0.r.w(0, 30);
                                }
                            } else {
                                kVar = en0.r.w(30, 60);
                            }
                        } else {
                            kVar = new en0.i(60, 100, 1);
                        }
                        if (kVar.s(i11)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BreathingDisturbanceStatus breathingDisturbanceStatus2 = (BreathingDisturbanceStatus) obj;
                if (breathingDisturbanceStatus2 == null) {
                    breathingDisturbanceStatus2 = BreathingDisturbanceStatus.f44276d;
                }
                int c11 = c50.b.c(breathingDisturbanceStatus2);
                Integer valueOf = Integer.valueOf(c11);
                if (c11 <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    str = dataPopUpView.getContext().getString(valueOf.intValue());
                } else {
                    str = null;
                }
            }
            DateTime e11 = bt.a.e(datum.f95616a);
            kotlin.jvm.internal.u.i(e11, "getDayFromUnitAbs(...)");
            Context context = dataPopUpView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            String i13 = b50.b.i(context, e11);
            if (str != null) {
                return kotlin.collections.x.V(new qf0.b(str, i13));
            }
            return kotlin.collections.i0.f76187a;
        }
    }

    public m0(Context context, TimeGraphView timeGraphView, f80.a aVar, ArrayList arrayList, DateTime dateTime, int i11, com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar2, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        super(timeGraphView, aVar, lifecycleCoroutineScopeImpl);
        this.f61384h = context;
        this.f61385i = arrayList;
        this.f61386j = dateTime;
        this.f61387k = i11;
        this.f61388l = aVar2;
        this.f61390n = (int) aVar.a();
        Context context2 = timeGraphView.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        this.f61391o = ah.g.k(48, context2);
    }

    public static String u(m0 this$0, float f11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        DateTime e11 = bt.a.e(f11);
        int i11 = this$0.f61387k;
        if (i11 != 92) {
            if (i11 != 365) {
                return "";
            }
            String print = DateTimeFormat.forPattern("MMM").print(e11);
            kotlin.jvm.internal.u.i(print, "print(...)");
            String upperCase = print.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
            String substring = upperCase.substring(0, 1);
            kotlin.jvm.internal.u.i(substring, "substring(...)");
            return substring;
        }
        String print2 = DateTimeFormat.forPattern("MMMM").print(e11);
        kotlin.jvm.internal.u.g(print2);
        return print2;
    }

    private final void w(float f11, float f12, int i11, String str) {
        b.a aVar = new b.a();
        aVar.H(f11);
        aVar.E(f12);
        aVar.J();
        aVar.I(false);
        Paint paint = new Paint();
        paint.setColor(ah.u.j(0.1f, i11));
        aVar.B(paint);
        aVar.o(Decorator.DrawOrder.f39677a);
        com.withings.graph.decorator.b z5 = aVar.z();
        i().c(z5, str);
        z5.k(true);
    }

    private final void x(float f11, int i11, String str, String str2) {
        Context context = this.f61384h;
        int w11 = ah.u.w(16842809, context, -65281);
        j.a aVar = new j.a(context);
        Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
        aVar.o(drawOrder);
        aVar.Z(str);
        aVar.d0(f11);
        aVar.M(i11);
        aVar.X(5);
        aVar.o(drawOrder);
        aVar.a0(wq.a.k(C1987R.style.detail1, context, 14));
        aVar.K(ah.u.j(0.5f, w11));
        aVar.N();
        aVar.S(ah.g.k(4, context));
        aVar.Y(Paint.Style.FILL);
        aVar.R(15);
        if (i11 != 1) {
            if (i11 == 2) {
                aVar.Q(10);
            }
        } else {
            aVar.P(10, 1);
        }
        com.withings.graph.decorator.j L = aVar.L();
        i().c(L, str2);
        L.k(true);
    }

    @Override // f80.j
    protected final void b(TimeGraphView graphView, List<? extends rs.e> list) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        graphView.getViewTreeObserver().addOnGlobalLayoutListener(new a(graphView, this));
        a.C1685a c1685a = new a.C1685a();
        c1685a.l(list);
        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar = this.f61388l;
        int a11 = aVar.a().a();
        Context context = this.f61384h;
        int color = androidx.core.content.a.getColor(context, a11);
        int color2 = androidx.core.content.a.getColor(context, aVar.c().a());
        int color3 = androidx.core.content.a.getColor(context, aVar.b().a());
        float f11 = this.f61390n;
        c1685a.t(new LinearGradient(0.0f, 0.0f, 0.0f, i().getHeight() - this.f61391o, new int[]{color, color, color2, color2, color3, color3}, new float[]{0.0f, 1.0f - (aVar.c().c().n() / f11), 1.0f - (aVar.c().c().n() / f11), 1.0f - (aVar.b().c().n() / f11), 1.0f - (aVar.b().c().n() / f11), 1.0f}, Shader.TileMode.CLAMP));
        c1685a.w(ah.g.k(2, context));
        c1685a.v(true);
        graphView.setMainGraph(c1685a.s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f80.j
    public final Object e(qm0.d<? super List<? extends rs.e>> dVar) {
        Object obj;
        c50.c e11;
        en0.k kVar;
        en0.k kVar2;
        List<DatedValue> list = this.f61385i;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (DatedValue datedValue : list) {
            float i11 = bt.a.i(datedValue.a());
            Context context = i().getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            float b10 = datedValue.b();
            int b11 = datedValue.b();
            if (this.f61388l.d()) {
                e11 = c50.a.e(b50.a.a(b11));
            } else {
                Iterator it = kotlin.collections.x.W(BreathingDisturbanceStatus.f44273a, BreathingDisturbanceStatus.f44274b, BreathingDisturbanceStatus.f44275c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        BreathingDisturbanceStatus breathingDisturbanceStatus = (BreathingDisturbanceStatus) obj;
                        kotlin.jvm.internal.u.j(breathingDisturbanceStatus, "<this>");
                        int ordinal = breathingDisturbanceStatus.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        kVar2 = en0.k.f65797d;
                                        kVar = kVar2;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    kVar = en0.r.w(0, 30);
                                }
                            } else {
                                kVar = en0.r.w(30, 60);
                            }
                        } else {
                            kVar = new en0.i(60, 100, 1);
                        }
                        if (kVar.s(b11)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BreathingDisturbanceStatus breathingDisturbanceStatus2 = (BreathingDisturbanceStatus) obj;
                if (breathingDisturbanceStatus2 == null) {
                    breathingDisturbanceStatus2 = BreathingDisturbanceStatus.f44276d;
                }
                e11 = c50.b.e(breathingDisturbanceStatus2);
            }
            int color = androidx.core.content.a.getColor(context, e11.a());
            b.a aVar = new b.a(i11, b10, datedValue.a());
            aVar.c(color, color, color);
            int w11 = ah.u.w(C1987R.attr.colorSurface, context, -65281);
            aVar.g(w11, w11, w11);
            aVar.d(0.0f, ah.g.k(2, context), 0.0f);
            aVar.h(0.0f, ah.g.k(3, context), 0.0f);
            arrayList.add(new rs.b(aVar));
        }
        return kotlin.collections.x.S0(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == null) goto L19;
     */
    @Override // f80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.util.List<? extends rs.e> r6) {
        /*
            r5 = this;
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L16
            java.lang.Object r0 = kotlin.collections.x.T(r6)
            rs.e r0 = (rs.e) r0
            org.joda.time.DateTime r0 = f80.j.g(r0)
            goto L1a
        L16:
            org.joda.time.DateTime r0 = org.joda.time.DateTime.now()
        L1a:
            com.withings.graph.TimeGraphView r1 = r5.i()
            f80.a r2 = r5.h()
            int r2 = r2.d()
            r1.j0(r0, r2)
            org.joda.time.DateTime r0 = r5.f61386j
            if (r0 == 0) goto L56
            r1 = r6
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            r3 = r2
            rs.e r3 = (rs.e) r3
            java.lang.Object r3 = r3.f95625j
            java.lang.String r4 = "null cannot be cast to non-null type org.joda.time.DateTime"
            kotlin.jvm.internal.u.h(r3, r4)
            org.joda.time.DateTime r3 = (org.joda.time.DateTime) r3
            boolean r3 = kotlin.jvm.internal.u.e(r3, r0)
            if (r3 == 0) goto L34
            goto L52
        L51:
            r2 = 0
        L52:
            rs.e r2 = (rs.e) r2
            if (r2 != 0) goto L5d
        L56:
            java.lang.Object r6 = kotlin.collections.x.T(r6)
            r2 = r6
            rs.e r2 = (rs.e) r2
        L5d:
            r5.t(r2)
            com.withings.graph.TimeGraphView r6 = r5.i()
            r0 = 0
            r6.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.m0.m(java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.graph.axis.a$a, com.withings.graph.axis.b$c, com.withings.graph.axis.b$a, com.withings.graph.axis.HorizontalAxis$a] */
    @Override // f80.j
    protected final void o() {
        int a11 = this.f61388l.b().a();
        Context context = this.f61384h;
        int j5 = ah.u.j(0.1f, androidx.core.content.a.getColor(context, a11));
        ?? aVar = new b.a(this.f61391o);
        aVar.J(HorizontalAxis.HorizontalAxisPosition.f39591c);
        aVar.r(ah.u.w(C1987R.attr.grid, context, -65281));
        aVar.q(j5);
        aVar.N();
        aVar.I();
        aVar.x(wq.a.k(C1987R.style.detail1, context, 10));
        aVar.B(false);
        aVar.y(new a.b() { // from class: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.l0
            @Override // com.withings.graph.axis.a.b
            public final String c(float f11, float f12) {
                return m0.u(m0.this, f11);
            }
        });
        i().setXAxis(aVar.O());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f80.j
    public final void p(List<? extends rs.e> list) {
        Object obj;
        Object obj2;
        nm0.y yVar = null;
        int i11 = this.f61387k;
        if (i11 != 92) {
            if (i11 != 365) {
                super.p(list);
                return;
            }
            ArrayList S0 = kotlin.collections.x.S0(list);
            rs.e eVar = (rs.e) kotlin.collections.x.K(S0);
            if (eVar != null) {
                obj2 = eVar.f95625j;
            } else {
                obj2 = null;
            }
            DateTime dateTime = (DateTime) obj2;
            if (dateTime != null) {
                int year = dateTime.getYear();
                DateTime withMonthOfYear = new DateTime().withYear(year).withMonthOfYear(1);
                kotlin.jvm.internal.u.i(withMonthOfYear, "withMonthOfYear(...)");
                DateTime q11 = hn.a.q(withMonthOfYear);
                DateTime plusMonths = new DateTime().withYear(year).withMonthOfYear(12).plusMonths(1);
                kotlin.jvm.internal.u.i(plusMonths, "plusMonths(...)");
                i().k0(q11, h().b(), hn.a.q(plusMonths).minusMinutes(1), h().a());
                yVar = nm0.y.f85009a;
            }
            if (yVar == null) {
                super.p(S0);
                return;
            }
            return;
        }
        ArrayList S02 = kotlin.collections.x.S0(list);
        rs.e eVar2 = (rs.e) kotlin.collections.x.K(S02);
        if (eVar2 != null) {
            obj = eVar2.f95625j;
        } else {
            obj = null;
        }
        DateTime dateTime2 = (DateTime) obj;
        if (dateTime2 != null) {
            com.withings.date.android.a aVar = new com.withings.date.android.a(dateTime2.getYear(), ((dateTime2.getMonthOfYear() - 1) / 3) + 1);
            DateTime withMonthOfYear2 = new DateTime().withYear(aVar.e()).withMonthOfYear(aVar.a());
            kotlin.jvm.internal.u.i(withMonthOfYear2, "withMonthOfYear(...)");
            DateTime q12 = hn.a.q(withMonthOfYear2);
            DateTime plusMonths2 = new DateTime().withYear(aVar.e()).withMonthOfYear(aVar.c()).plusMonths(1);
            kotlin.jvm.internal.u.i(plusMonths2, "plusMonths(...)");
            i().k0(q12, h().b(), hn.a.q(plusMonths2).minusMinutes(1), h().a());
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            super.p(S02);
        }
    }

    @Override // f80.j
    protected final void q(TimeGraphView timeGraphView) {
        kotlin.jvm.internal.u.j(timeGraphView, "timeGraphView");
        DataPopUpView dataPopUpView = this.f61389m;
        if (dataPopUpView != null) {
            dataPopUpView.setPositionMode(2);
            dataPopUpView.setContentProvider(new b(dataPopUpView));
            dataPopUpView.setShouldShowLine(true);
            dataPopUpView.setBottomPadding(this.f61391o);
            dataPopUpView.setShouldLineMatchContentRectBottom(false);
        }
        i().setScrubbingEnabled(true);
        i().setPopup(this.f61389m);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.withings.graph.axis.a$a, com.withings.graph.axis.VerticalAxis$a, com.withings.graph.axis.VerticalAxis$b] */
    @Override // f80.j
    protected final void r() {
        Context context = this.f61384h;
        ?? aVar = new VerticalAxis.a(ah.g.k(1, context));
        aVar.K(VerticalAxis.VerticalAxisPosition.f39599a);
        aVar.r(ah.u.w(16843049, context, -65281));
        aVar.u(ah.g.k(1, context));
        aVar.J(false);
        aVar.C();
        aVar.A(h().a() / 6.0f);
        aVar.z(6);
        i().setYAxis(new VerticalAxis(aVar));
    }

    @Override // f80.j
    protected final boolean s() {
        return false;
    }

    public final void y(TimeGraphView graphView) {
        kotlin.jvm.internal.u.j(graphView, "graphView");
        graphView.h();
        graphView.setGraphTagsToAdjustVerticalBounds(kotlin.collections.x.V("TAG_MAIN_GRAPH"));
        graphView.getVisibleThresholds().clear();
        Context context = graphView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar = this.f61388l;
        w(aVar.b().c().n(), h().b(), androidx.core.content.a.getColor(context, aVar.b().a()), "LowToMildZoneDecorator");
        w(aVar.c().c().n(), aVar.b().c().n(), androidx.core.content.a.getColor(context, aVar.c().a()), "ModerateZoneDecorator");
        float f11 = this.f61390n;
        w(f11, aVar.c().c().n(), androidx.core.content.a.getColor(context, aVar.a().a()), "HighZoneDecorator");
        String string = context.getString(aVar.b().b());
        kotlin.jvm.internal.u.i(string, "getString(...)");
        x(aVar.b().c().n(), 1, string, "LowToMildNameLabel");
        String string2 = context.getString(aVar.c().b());
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        x(aVar.c().c().n(), 1, string2, "ModerateNameLabel");
        String string3 = context.getString(aVar.a().b());
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        x(f11, 1, string3, "HighNameLabel");
        if (aVar.d()) {
            Context context2 = this.f61384h;
            String string4 = context2.getString(C1987R.string.sleepApnea_details_graphLabel_formatted, 15);
            kotlin.jvm.internal.u.i(string4, "getString(...)");
            String string5 = context2.getString(C1987R.string.sleepApnea_details_graphLabel_formatted, 30);
            kotlin.jvm.internal.u.i(string5, "getString(...)");
            x(aVar.b().c().n(), 2, string4, "LowToMildLegendLabel");
            x(aVar.c().c().n(), 2, string5, "ModerateLegendLabel");
        }
        androidx.core.view.u0.T(graphView);
    }

    public final void z(DataPopUpView dataPopUpView) {
        this.f61389m = dataPopUpView;
    }
}

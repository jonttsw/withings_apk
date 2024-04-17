package com.withings.wiscale2.heart.afib;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z0;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.model.SignalMeta;
import com.withings.ecg.webservices.GetSignalDataSyncFactory;
import com.withings.library.measure.Measure;
import com.withings.views.view.CustomFrameLayout;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import nm0.k;
import tb0.s1;
/* compiled from: AFibDetailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/heart/afib/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class e extends q0 {

    /* renamed from: h  reason: collision with root package name */
    private s1 f57134h;

    /* renamed from: i  reason: collision with root package name */
    private final d f57135i = new d(this);
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public HeartSignalRepository f57136j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public GetSignalDataSyncFactory f57137k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public t00.d f57138l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.lifecycle.k0<Integer> f57139m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57133o = {androidx.camera.core.v.c(e.class, "measure", "getMeasure()Lcom/withings/library/measure/Measure;", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f57132n = new Object();

    /* compiled from: AFibDetailFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: AFibDetailFragment.kt */
    /* loaded from: classes5.dex */
    static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57140a;

        b(ym0.l lVar) {
            this.f57140a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57140a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57140a;
        }

        public final int hashCode() {
            return this.f57140a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57140a.invoke(obj);
        }
    }

    /* compiled from: AFibDetailFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null) {
                s1 s1Var = e.this.f57134h;
                if (s1Var != null) {
                    CustomNestedScrollView customNestedScrollView = s1Var.f99463b;
                    kotlin.jvm.internal.u.i(customNestedScrollView, "customNestedScrollView");
                    customNestedScrollView.setScrollY(num2.intValue());
                } else {
                    kotlin.jvm.internal.u.s("binding");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Fragment, Measure> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57142a = nm0.h.b(new h(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57143b;

        public d(Fragment fragment) {
            this.f57143b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.library.measure.Measure] */
        @Override // bn0.d
        public final Measure getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57142a.getValue();
        }
    }

    public static void s1(e this$0) {
        Integer value;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f57139m;
        if (k0Var != null && (value = k0Var.getValue()) != null) {
            s1 s1Var = this$0.f57134h;
            if (s1Var != null) {
                s1Var.f99463b.setScrollY(value.intValue());
            } else {
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
        }
    }

    public static void t1(e this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f57139m;
        if (k0Var != null) {
            k0Var.setValue(Integer.valueOf(i11));
        }
    }

    public static final Measure v1(e eVar) {
        eVar.getClass();
        return (Measure) eVar.f57135i.getValue(eVar, f57133o[0]);
    }

    public static final void w1(e eVar, List list) {
        eVar.getClass();
        List<nm0.j> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (nm0.j jVar : list2) {
            arrayList.add(new Entry(((Number) jVar.a()).intValue(), ((Number) jVar.b()).floatValue()));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, eVar.getString(C1987R.string._BPM_));
        lineDataSet.I0();
        lineDataSet.H0();
        lineDataSet.S0(false);
        lineDataSet.R0();
        lineDataSet.N0(3.0f);
        s1 s1Var = eVar.f57134h;
        if (s1Var != null) {
            lineDataSet.G0(androidx.core.content.a.getColor(s1Var.f99465d.getContext(), C1987R.color.statusBad));
            lineDataSet.T0(LineDataSet.Mode.f24364c);
            lb.i iVar = new lb.i(lineDataSet);
            s1 s1Var2 = eVar.f57134h;
            if (s1Var2 != null) {
                s1Var2.f99465d.setData(iVar);
                s1 s1Var3 = eVar.f57134h;
                if (s1Var3 != null) {
                    s1Var3.f99465d.getDescription().g(false);
                    s1 s1Var4 = eVar.f57134h;
                    if (s1Var4 != null) {
                        s1Var4.f99465d.setTouchEnabled(false);
                        s1 s1Var5 = eVar.f57134h;
                        if (s1Var5 != null) {
                            s1Var5.f99465d.setScaleEnabled(false);
                            s1 s1Var6 = eVar.f57134h;
                            if (s1Var6 != null) {
                                s1Var6.f99465d.getLegend().g(false);
                                s1 s1Var7 = eVar.f57134h;
                                if (s1Var7 != null) {
                                    XAxis xAxis = s1Var7.f99465d.getXAxis();
                                    xAxis.Q(XAxis.XAxisPosition.f24333b);
                                    xAxis.I();
                                    xAxis.F();
                                    xAxis.G();
                                    xAxis.H(false);
                                    xAxis.E(0.0f);
                                    xAxis.D(((Entry) kotlin.collections.x.T(arrayList)).e());
                                    s1 s1Var8 = eVar.f57134h;
                                    if (s1Var8 != null) {
                                        Context context = s1Var8.f99465d.getContext();
                                        kotlin.jvm.internal.u.i(context, "getContext(...)");
                                        int w11 = ah.u.w(C1987R.attr.grid, context, -65281);
                                        LimitLine limitLine = new LimitLine(0.0f);
                                        limitLine.s(w11);
                                        xAxis.m(limitLine);
                                        LimitLine limitLine2 = new LimitLine(((Entry) kotlin.collections.x.T(arrayList)).e() / 2.0f);
                                        limitLine2.s(w11);
                                        xAxis.m(limitLine2);
                                        LimitLine limitLine3 = new LimitLine(((Entry) kotlin.collections.x.T(arrayList)).e());
                                        limitLine3.s(w11);
                                        xAxis.m(limitLine3);
                                        s1 s1Var9 = eVar.f57134h;
                                        if (s1Var9 != null) {
                                            YAxis axisLeft = s1Var9.f99465d.getAxisLeft();
                                            axisLeft.I();
                                            axisLeft.U();
                                            axisLeft.g(false);
                                            axisLeft.k(0.0f);
                                            axisLeft.V();
                                            s1 s1Var10 = eVar.f57134h;
                                            if (s1Var10 != null) {
                                                YAxis axisRight = s1Var10.f99465d.getAxisRight();
                                                axisRight.I();
                                                axisRight.J();
                                                axisRight.i(10.0f);
                                                s1 s1Var11 = eVar.f57134h;
                                                if (s1Var11 != null) {
                                                    Context context2 = s1Var11.f99465d.getContext();
                                                    kotlin.jvm.internal.u.i(context2, "getContext(...)");
                                                    s1 s1Var12 = eVar.f57134h;
                                                    if (s1Var12 != null) {
                                                        axisRight.k(wq.a.m(s1Var12.f99465d.getResources().getDimension(C1987R.dimen.basic3), context2));
                                                        s1 s1Var13 = eVar.f57134h;
                                                        if (s1Var13 != null) {
                                                            axisRight.j(androidx.core.content.res.g.e(C1987R.font.aeonik_regular, s1Var13.f99465d.getContext()));
                                                            s1 s1Var14 = eVar.f57134h;
                                                            if (s1Var14 != null) {
                                                                Context context3 = s1Var14.f99465d.getContext();
                                                                kotlin.jvm.internal.u.i(context3, "getContext(...)");
                                                                axisRight.h(ah.u.w(16843282, context3, -65281));
                                                                s1 s1Var15 = eVar.f57134h;
                                                                if (s1Var15 != null) {
                                                                    s1Var15.f99465d.invalidate();
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.u.s("binding");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.u.s("binding");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.u.s("binding");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.u.s("binding");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.u.s("binding");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.u.s("binding");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.u.s("binding");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.u.s("binding");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("binding");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("binding");
                    throw null;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [nm0.k$a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final List x1(e eVar, HeartSignalMeasurement heartSignalMeasurement) {
        ?? a11;
        kotlin.collections.i0 i0Var;
        ?? arrayList;
        s1 s1Var = eVar.f57134h;
        if (s1Var != null) {
            Context context = s1Var.f99465d.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            mq.g gVar = new mq.g(context);
            long millis = heartSignalMeasurement.getTimestamp().getMillis();
            SignalMeta meta = heartSignalMeasurement.getSignal().getMeta();
            kotlin.collections.i0 i0Var2 = kotlin.collections.i0.f76187a;
            kotlin.jvm.internal.u.j(meta, "meta");
            try {
                byte[] b10 = gVar.b(meta.getType(), millis);
                if (b10.length == 0) {
                    b10 = null;
                }
                if (b10 != null) {
                    i0Var = new ArrayList(b10.length);
                    for (byte b11 : b10) {
                        i0Var.add(Integer.valueOf(b11 & 255));
                    }
                } else {
                    i0Var = 0;
                }
                if (i0Var == 0) {
                    i0Var = i0Var2;
                }
                Iterable iterable = i0Var;
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    arrayList = i0Var2;
                } else {
                    Object next = it.next();
                    arrayList = new ArrayList(kotlin.collections.x.y(iterable, 10));
                    arrayList.add(next);
                    while (it.hasNext()) {
                        next = Integer.valueOf(((Number) next).intValue() + ((Number) it.next()).intValue());
                        arrayList.add(next);
                    }
                }
                Iterable iterable2 = (Iterable) arrayList;
                a11 = new ArrayList(kotlin.collections.x.y(iterable2, 10));
                int i11 = 0;
                for (Object obj : iterable2) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        a11.add(new nm0.j(Integer.valueOf(((Number) obj).intValue()), Float.valueOf(60.0f / (((Number) i0Var.get(i11)).intValue() / meta.getSamplingFreq()))));
                        i11 = i12;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            if (nm0.k.b(a11) != null) {
                x70.b.d(gVar, "Failed to read file for measure signal...", new Object[0]);
            }
            if (!(a11 instanceof k.a)) {
                i0Var2 = a11;
            }
            return i0Var2;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        Integer value;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f57134h = s1.a(view);
        float f11 = i70.b.a(getActivity()).x;
        int i12 = (int) (0.42857143f * f11);
        int i13 = (int) (f11 * 0.75f);
        s1 s1Var = this.f57134h;
        if (s1Var != null) {
            s1Var.f99467f.getLayoutParams().height = i13;
            s1 s1Var2 = this.f57134h;
            if (s1Var2 != null) {
                s1Var2.f99467f.requestLayout();
                s1 s1Var3 = this.f57134h;
                if (s1Var3 != null) {
                    CustomFrameLayout customFrameLayout = s1Var3.f99462a;
                    CustomNestedScrollView customNestedScrollView = s1Var3.f99463b;
                    customNestedScrollView.E(s1Var3.f99467f, s1Var3.f99468g, customFrameLayout, i12, i13);
                    customNestedScrollView.F(0);
                    androidx.lifecycle.k0<Integer> k0Var = this.f57139m;
                    if (k0Var != null && (value = k0Var.getValue()) != null) {
                        s1 s1Var4 = this.f57134h;
                        if (s1Var4 != null) {
                            s1Var4.f99463b.setScrollY(value.intValue());
                        } else {
                            kotlin.jvm.internal.u.s("binding");
                            throw null;
                        }
                    }
                    s1 s1Var5 = this.f57134h;
                    if (s1Var5 != null) {
                        s1Var5.f99463b.setOnScrollChangeListener(new z0(this, 3));
                        s1 s1Var6 = this.f57134h;
                        if (s1Var6 != null) {
                            s1Var6.f99463b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.withings.wiscale2.heart.afib.d
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                    e.s1(e.this);
                                }
                            });
                            s1 s1Var7 = this.f57134h;
                            if (s1Var7 != null) {
                                s1Var7.f99465d.setNoDataText(getString(C1987R.string._NO_DATA_YET_));
                                s1 s1Var8 = this.f57134h;
                                if (s1Var8 != null) {
                                    LineChart lineChart = s1Var8.f99465d;
                                    Context context = lineChart.getContext();
                                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                                    lineChart.setNoDataTextColor(ah.u.w(16842808, context, -65281));
                                    BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new g(this, null), 3, null);
                                    s1 s1Var9 = this.f57134h;
                                    if (s1Var9 != null) {
                                        if (((Measure) this.f57135i.getValue(this, f57133o[0])).getType() == 130) {
                                            i11 = C1987R.string.heartEvents_aFib_signal_description;
                                        } else {
                                            i11 = C1987R.string.heartEvents_signalNonMedical_description;
                                        }
                                        s1Var9.f99464c.setMessage(i11);
                                        s1 s1Var10 = this.f57134h;
                                        if (s1Var10 != null) {
                                            s1Var10.f99464c.setButtonClickListener(new f(this));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.u.s("binding");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.u.s("binding");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("binding");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("binding");
                    throw null;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    public final void y1(androidx.lifecycle.k0<Integer> k0Var) {
        androidx.lifecycle.k0<Integer> k0Var2 = this.f57139m;
        if (k0Var2 != null) {
            k0Var2.removeObservers(this);
        }
        this.f57139m = k0Var;
        if (k0Var != null) {
            k0Var.observe(this, new b(new c()));
        }
    }
}

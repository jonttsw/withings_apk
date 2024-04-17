package com.withings.environment.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.l0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.withings.device.Device;
import com.withings.environment.ui.j;
import com.withings.environment.ui.sleep.LuminositySleepGraph;
import com.withings.environment.ui.sleep.NoiseSleepGraph;
import com.withings.environment.ui.sleep.SleepSecondaryGraphCard;
import com.withings.environment.ui.sleep.TemperatureSleepGraph;
import com.withings.environment.ui.sleep.TemperatureStatsView;
import com.withings.library.measure.Measure;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomFrameLayout;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import vh.m;
import vh.o;
/* compiled from: WsdGraphFragment.java */
/* loaded from: classes3.dex */
public class j extends Fragment implements CustomNestedScrollView.c {

    /* renamed from: x */
    public static final /* synthetic */ int f39013x = 0;

    /* renamed from: c */
    private DateTime f39014c;

    /* renamed from: d */
    private Device f39015d;

    /* renamed from: e */
    private DateTime f39016e;

    /* renamed from: f */
    private DateTime f39017f;

    /* renamed from: g */
    private BlockableViewPager.b f39018g;

    /* renamed from: h */
    private a f39019h;

    /* renamed from: i */
    private CustomNestedScrollView f39020i;

    /* renamed from: j */
    private View f39021j;

    /* renamed from: k */
    private CustomFrameLayout f39022k;

    /* renamed from: l */
    private ViewGroup f39023l;

    /* renamed from: m */
    private LinearLayout f39024m;

    /* renamed from: n */
    private View f39025n;

    /* renamed from: o */
    private ProgressBar f39026o;

    /* renamed from: p */
    private GraphPopupView f39027p;

    /* renamed from: q */
    private TemperatureSleepGraph f39028q;

    /* renamed from: r */
    private LuminositySleepGraph f39029r;

    /* renamed from: s */
    private NoiseSleepGraph f39030s;

    /* renamed from: t */
    private TemperatureStatsView f39031t;

    /* renamed from: u */
    private int f39032u;

    /* renamed from: v */
    private boolean f39033v;

    /* renamed from: w */
    private b f39034w = null;

    /* compiled from: WsdGraphFragment.java */
    /* loaded from: classes3.dex */
    public interface a {
        void c2(j jVar, DateTime dateTime);

        void j2(int i11);
    }

    /* compiled from: WsdGraphFragment.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        double f39035a;

        /* renamed from: b */
        double f39036b;

        /* renamed from: c */
        double f39037c;

        /* renamed from: d */
        ArrayList f39038d;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.ToDoubleFunction, java.lang.Object] */
    public static b s1(j jVar) {
        jVar.getClass();
        uw.d a11 = uw.d.a();
        long id2 = jVar.f39015d.getId();
        DateTime dateTime = jVar.f39016e;
        DateTime dateTime2 = jVar.f39017f;
        a11.getClass();
        ArrayList b10 = uw.d.b(id2, dateTime, dateTime2, 12);
        Comparator comparingDouble = Comparator.comparingDouble(new Object());
        b bVar = new b();
        bVar.f39038d = b10;
        if (!b10.isEmpty()) {
            bVar.f39035a = ((Measure) Collections.max(b10, comparingDouble)).f95794y;
            bVar.f39036b = ((Measure) Collections.min(b10, comparingDouble)).f95794y;
            float f11 = 0.0f;
            if (!b10.isEmpty()) {
                Iterator it = b10.iterator();
                while (it.hasNext()) {
                    f11 += (float) ((Measure) it.next()).f95794y;
                }
                f11 /= b10.size();
            }
            bVar.f39037c = f11;
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.function.ToDoubleFunction, java.lang.Object] */
    public static ArrayList t1(j jVar, int i11) {
        jVar.getClass();
        uw.d a11 = uw.d.a();
        long id2 = jVar.f39015d.getId();
        DateTime dateTime = jVar.f39016e;
        DateTime dateTime2 = jVar.f39017f;
        a11.getClass();
        ArrayList b10 = uw.d.b(id2, dateTime, dateTime2, i11);
        b10.sort(Comparator.comparingDouble(new Object()));
        return b10;
    }

    public final void A1(boolean z5) {
        int i11;
        ProgressBar progressBar = this.f39026o;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        progressBar.setVisibility(i11);
    }

    public final void B1(List<Measure> list, SleepSecondaryGraphCard sleepSecondaryGraphCard) {
        if (list.isEmpty()) {
            sleepSecondaryGraphCard.setVisibility(8);
            return;
        }
        sleepSecondaryGraphCard.c(list, this.f39016e, this.f39017f);
        sleepSecondaryGraphCard.setVisibility(0);
    }

    public final void C1(b bVar) {
        if (bVar.f39038d.isEmpty()) {
            this.f39028q.setVisibility(8);
            this.f39019h.c2(this, this.f39014c);
        } else {
            this.f39028q.e(bVar.f39038d, this.f39016e, this.f39017f);
            this.f39028q.setVisibility(0);
            this.f39034w = bVar;
            this.f39026o.setVisibility(8);
            this.f39031t.b(bVar.f39037c, bVar.f39035a, bVar.f39036b);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new n(this, 2), 200L);
    }

    public final void D1() {
        if (this.f39034w == null) {
            this.f39020i.setVisibility(8);
            this.f39023l.setVisibility(0);
        }
    }

    public final void customScrollTo(int i11) {
        this.f39020i.C(i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f39019h = (a) getActivity();
        this.f39018g = (BlockableViewPager.b) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39014c = (DateTime) getArguments().getSerializable(FoodDayFragment.ARG_DAY);
        this.f39015d = (Device) getArguments().getSerializable("EXTRA_DEVICE");
        this.f39032u = getArguments().getInt("extra_current_scroll");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_wsd_graph, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f39019h = null;
        this.f39018g = null;
        vh.h.b(this);
        super.onDetach();
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public final void onScrolled(CustomNestedScrollView customNestedScrollView, int i11) {
        if (!this.f39033v) {
            return;
        }
        StringBuilder b10 = l0.b("ScrolledBy =  ", i11, " for fragment ");
        b10.append(this.f39014c.toString());
        int i12 = 0;
        x70.b.r(this, b10.toString(), new Object[0]);
        this.f39032u = i11;
        View view = this.f39025n;
        if (i11 <= this.f39021j.getMeasuredHeight()) {
            i12 = 4;
        }
        view.setVisibility(i12);
        this.f39019h.j2(i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        super.onViewCreated(view, bundle);
        this.f39020i = (CustomNestedScrollView) view.findViewById(C1987R.id.custom_nested_scroll_view);
        this.f39021j = view.findViewById(C1987R.id.resizable_view);
        this.f39022k = (CustomFrameLayout) view.findViewById(C1987R.id.content_container);
        this.f39023l = (ViewGroup) view.findViewById(C1987R.id.full_empty_state);
        this.f39024m = (LinearLayout) view.findViewById(C1987R.id.scroll_content);
        this.f39025n = view.findViewById(C1987R.id.collapsed_graph_separator);
        this.f39026o = (ProgressBar) view.findViewById(C1987R.id.loading);
        this.f39027p = (GraphPopupView) view.findViewById(C1987R.id.view_popup);
        this.f39028q = (TemperatureSleepGraph) view.findViewById(C1987R.id.temperatureGraph);
        this.f39029r = (LuminositySleepGraph) view.findViewById(C1987R.id.luminosityGraph);
        this.f39030s = (NoiseSleepGraph) view.findViewById(C1987R.id.noiseGraph);
        this.f39031t = (TemperatureStatsView) view.findViewById(C1987R.id.temperature_stats);
        this.f39016e = this.f39014c.withTimeAtStartOfDay();
        this.f39017f = this.f39014c.withTimeAtStartOfDay().plusDays(1);
        float f11 = i70.b.a(getActivity()).x;
        int i12 = (int) (f11 * 0.75f);
        this.f39021j.getLayoutParams().height = i12;
        this.f39021j.requestLayout();
        this.f39020i.E(this.f39021j, this.f39024m, this.f39022k, (int) (0.42857143f * f11), i12);
        this.f39020i.setDelegate(this);
        this.f39020i.F(this.f39032u);
        View view2 = this.f39025n;
        if (this.f39032u > this.f39021j.getMeasuredHeight()) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        view2.setVisibility(i11);
        int i13 = (int) (i70.b.a(getActivity()).x * 0.39130434f);
        this.f39029r.setGraphHeightPx(i13);
        this.f39030s.setGraphHeightPx(i13);
        this.f39028q.setTitleVisible(false);
        this.f39028q.f(this.f39027p, new f(this));
        this.f39028q.getGraphView().setOnScrubbingListener(new g(this));
        y1();
    }

    public final void y1() {
        o c11 = vh.h.h().c(new vq.c(this, 0));
        c11.q(new h(this));
        c11.p(this);
        LuminositySleepGraph luminositySleepGraph = this.f39029r;
        luminositySleepGraph.setVisibility(8);
        o c12 = vh.h.h().c(new m() { // from class: vq.d
            @Override // vh.m
            public final Object call() {
                return j.t1(j.this, r2);
            }
        });
        c12.q(new i(this, luminositySleepGraph));
        c12.p(this);
        NoiseSleepGraph noiseSleepGraph = this.f39030s;
        noiseSleepGraph.setVisibility(8);
        o c13 = vh.h.h().c(new m() { // from class: vq.d
            @Override // vh.m
            public final Object call() {
                return j.t1(j.this, r2);
            }
        });
        c13.q(new i(this, noiseSleepGraph));
        c13.p(this);
    }

    public final void z1(boolean z5) {
        this.f39033v = z5;
    }
}

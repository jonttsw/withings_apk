package com.withings.ecg.heartsound;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.github.mikephil.charting.charts.LineChart;
import com.withings.ecg.details.o2;
import com.withings.ecg.heartsound.p0;
import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.ecg.model.SignalMeta;
import com.withings.ecg.player.TimeProgressView;
import com.withings.features.FeatureFlag;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import qq.d;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class d extends v0 implements d.b, p0.a, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: h  reason: collision with root package name */
    private final f f38430h;

    /* renamed from: i  reason: collision with root package name */
    private final g f38431i;

    /* renamed from: j  reason: collision with root package name */
    private androidx.lifecycle.k0<Integer> f38432j;

    /* renamed from: k  reason: collision with root package name */
    private final LifecycleViewBindingProperty f38433k;

    /* renamed from: l  reason: collision with root package name */
    private p0 f38434l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public a0 f38435m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public jq.b f38436n;

    /* renamed from: o  reason: collision with root package name */
    private r f38437o;

    /* renamed from: p  reason: collision with root package name */
    private androidx.constraintlayout.widget.b f38438p;

    /* renamed from: q  reason: collision with root package name */
    private androidx.constraintlayout.widget.b f38439q;

    /* renamed from: r  reason: collision with root package name */
    private b f38440r;

    /* renamed from: s  reason: collision with root package name */
    private c f38441s;

    /* renamed from: t  reason: collision with root package name */
    private qq.d f38442t;

    /* renamed from: u  reason: collision with root package name */
    private d0 f38443u;

    /* renamed from: w  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38429w = {androidx.camera.core.v.c(d.class, "signalId", "getSignalId()J", 0), androidx.camera.core.v.c(d.class, "isFirstMeasurement", "isFirstMeasurement()Z", 0), androidx.camera.core.v.c(d.class, "binding", "getBinding()Lcom/withings/ecg/databinding/FragmentSoundDetailsBinding;", 0)};

    /* renamed from: v  reason: collision with root package name */
    public static final a f38428v = new Object();

    /* compiled from: HeartSoundDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: HeartSoundDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends androidx.transition.v {

        /* renamed from: a  reason: collision with root package name */
        private d0 f38444a = null;

        @Override // androidx.transition.v, androidx.transition.Transition.d
        public final void b(Transition transition) {
            kotlin.jvm.internal.u.j(transition, "transition");
            d0 d0Var = this.f38444a;
            if (d0Var != null) {
                d0Var.m();
            }
        }

        public final void f(d0 d0Var) {
            this.f38444a = d0Var;
        }
    }

    /* compiled from: HeartSoundDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c extends androidx.transition.v {

        /* renamed from: a  reason: collision with root package name */
        private final TimeProgressView f38445a;

        /* renamed from: b  reason: collision with root package name */
        private d0 f38446b = null;

        /* renamed from: c  reason: collision with root package name */
        private qq.d f38447c = null;

        public c(TimeProgressView timeProgressView) {
            this.f38445a = timeProgressView;
        }

        @Override // androidx.transition.v, androidx.transition.Transition.d
        public final void b(Transition transition) {
            kotlin.jvm.internal.u.j(transition, "transition");
            d0 d0Var = this.f38446b;
            if (d0Var != null) {
                d0Var.k();
            }
            qq.d dVar = this.f38447c;
            if (dVar != null) {
                dVar.g();
            }
            this.f38445a.z();
        }

        public final void f(qq.d dVar) {
            this.f38447c = dVar;
        }

        public final void g(d0 d0Var) {
            this.f38446b = d0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeartSoundDetailsFragment.kt */
    /* renamed from: com.withings.ecg.heartsound.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0505d implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f38448a;

        C0505d(ym0.l lVar) {
            this.f38448a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f38448a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f38448a;
        }

        public final int hashCode() {
            return this.f38448a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38448a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeartSoundDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null) {
                NestedScrollView scrollView = d.this.D1().f78078j;
                kotlin.jvm.internal.u.i(scrollView, "scrollView");
                scrollView.setScrollY(num2.intValue());
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class f implements bn0.d<Fragment, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38450a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f38451b;

        public f(Fragment fragment) {
            this.f38451b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38450a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class g implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38452a = nm0.h.b(new o(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f38453b;

        public g(Fragment fragment) {
            this.f38453b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38452a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.l<d, kq.c> {
        @Override // ym0.l
        public final kq.c invoke(d dVar) {
            d fragment = dVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return kq.c.a(fragment.requireView());
        }
    }

    public /* synthetic */ d(int i11) {
        this();
    }

    public static final void C1(final d dVar, final o2 o2Var) {
        LineChart heartSoundDetailsGraph = dVar.D1().f78072d;
        kotlin.jvm.internal.u.i(heartSoundDetailsGraph, "heartSoundDetailsGraph");
        dVar.f38443u = new d0(heartSoundDetailsGraph);
        long durationSeconds = HeartSignalMeasurementKt.getDurationSeconds(o2Var.c().getSignal().getMeta());
        b bVar = dVar.f38440r;
        if (bVar != null) {
            bVar.f(dVar.f38443u);
            c cVar = dVar.f38441s;
            if (cVar != null) {
                cVar.g(dVar.f38443u);
                d0 d0Var = dVar.f38443u;
                if (d0Var != null) {
                    d0Var.i(durationSeconds, o2Var.b());
                }
                d0 d0Var2 = dVar.f38443u;
                if (d0Var2 != null) {
                    d0Var2.j();
                }
                dVar.D1().f78076h.setDuration(durationSeconds * 1000);
                final boolean c11 = wr.b.c(FeatureFlag.f39122o0);
                dVar.D1().f78073e.setOnClickListener(new View.OnClickListener() { // from class: com.withings.ecg.heartsound.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.s1(d.this, o2Var, c11);
                    }
                });
                return;
            }
            kotlin.jvm.internal.u.s("pauseAnimationListener");
            throw null;
        }
        kotlin.jvm.internal.u.s("endPlayAnimationListener");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kq.c D1() {
        return (kq.c) this.f38433k.getValue(this, f38429w[2]);
    }

    private final void E1() {
        d0 d0Var = this.f38443u;
        if (d0Var != null) {
            d0Var.m();
        }
        D1().f78076h.B();
        F1(true);
        qq.d dVar = this.f38442t;
        if (dVar != null) {
            dVar.i();
        }
    }

    private final void F1(boolean z5) {
        androidx.transition.v vVar;
        D1().f78073e.setImageResource(C1987R.drawable.icon_medium_navigation_playerplay);
        ImageButton imageButton = D1().f78073e;
        Context context = D1().f78073e.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        imageButton.setImageTintList(ColorStateList.valueOf(ah.u.w(16842809, context, -65281)));
        ImageView imageView = D1().f78074f;
        Context context2 = D1().f78074f.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        imageView.setBackgroundTintList(ColorStateList.valueOf(ah.u.w(C1987R.attr.colorOnSurface, context2, -65281)));
        if (z5) {
            vVar = this.f38440r;
            if (vVar == null) {
                kotlin.jvm.internal.u.s("endPlayAnimationListener");
                throw null;
            }
        } else {
            vVar = this.f38441s;
            if (vVar == null) {
                kotlin.jvm.internal.u.s("pauseAnimationListener");
                throw null;
            }
        }
        androidx.constraintlayout.widget.b bVar = this.f38438p;
        if (bVar != null) {
            H1(vVar, bVar);
        } else {
            kotlin.jvm.internal.u.s("playButtonConstraintSet");
            throw null;
        }
    }

    private final void H1(androidx.transition.v vVar, androidx.constraintlayout.widget.b bVar) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.E(250L);
        autoTransition.M(vVar);
        androidx.transition.w.a(D1().f78077i, autoTransition);
        bVar.e(D1().f78077i);
    }

    public static void s1(d this$0, o2 ecgWithGraphData, boolean z5) {
        boolean z11;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(ecgWithGraphData, "$ecgWithGraphData");
        if (this$0.f38442t == null) {
            Context context = this$0.D1().f78072d.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            long millis = ecgWithGraphData.c().getTimestamp().getMillis();
            SignalMeta meta = ecgWithGraphData.c().getSignal().getMeta();
            if (ecgWithGraphData.c().getDeviceModel() == 71 && z5) {
                z11 = true;
            } else {
                z11 = false;
            }
            qq.d dVar = new qq.d(context, millis, meta, this$0, z11);
            this$0.f38442t = dVar;
            c cVar = this$0.f38441s;
            if (cVar != null) {
                cVar.f(dVar);
            } else {
                kotlin.jvm.internal.u.s("pauseAnimationListener");
                throw null;
            }
        }
        qq.d dVar2 = this$0.f38442t;
        if (dVar2 != null) {
            if (!dVar2.f()) {
                this$0.D1().f78073e.setImageResource(C1987R.drawable.icon_medium_navigation_playerpause);
                ImageButton imageButton = this$0.D1().f78073e;
                Context context2 = this$0.D1().f78074f.getContext();
                kotlin.jvm.internal.u.i(context2, "getContext(...)");
                imageButton.setImageTintList(ColorStateList.valueOf(ah.u.w(C1987R.attr.colorOnSurface, context2, -65281)));
                ImageView imageView = this$0.D1().f78074f;
                Context context3 = this$0.D1().f78073e.getContext();
                kotlin.jvm.internal.u.i(context3, "getContext(...)");
                imageView.setBackgroundTintList(ColorStateList.valueOf(ah.u.w(16842809, context3, -65281)));
                m mVar = new m(this$0);
                androidx.constraintlayout.widget.b bVar = this$0.f38439q;
                if (bVar != null) {
                    this$0.H1(mVar, bVar);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("pauseButtonConstraintSet");
                    throw null;
                }
            }
            this$0.F1(false);
        }
    }

    public static void t1(d this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        r rVar = this$0.f38437o;
        if (rVar != null) {
            rVar.r0();
            p0 p0Var = this$0.f38434l;
            if (p0Var != null) {
                p0Var.dismiss();
                return;
            } else {
                kotlin.jvm.internal.u.s("bottomSheetFragment");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static void u1(d this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f38432j;
        if (k0Var != null) {
            k0Var.setValue(Integer.valueOf(i11));
        }
    }

    public static void v1(d this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        p0 p0Var = this$0.f38434l;
        if (p0Var != null) {
            p0Var.dismiss();
        } else {
            kotlin.jvm.internal.u.s("bottomSheetFragment");
            throw null;
        }
    }

    public static final jq.d x1(d dVar, HeartDiagnosticUI heartDiagnosticUI, Integer num, int i11, Integer num2) {
        jq.b bVar = dVar.f38436n;
        if (bVar != null) {
            jq.d a11 = bVar.a(i11).a(2, heartDiagnosticUI.getValue(), num, num2);
            if (heartDiagnosticUI.getValue() == -6) {
                if (!((Boolean) dVar.f38431i.getValue(dVar, f38429w[1])).booleanValue()) {
                    return jq.d.a(a11, C1987R.string.heartSounds_detail_resultRestartCalibration_description, 0, 23);
                }
                return a11;
            }
            return a11;
        }
        kotlin.jvm.internal.u.s("deviceDiagnosticStringResourcesProvider");
        throw null;
    }

    public static final long z1(d dVar) {
        return ((Number) dVar.f38430h.getValue(dVar, f38429w[0])).longValue();
    }

    @Override // com.withings.ecg.heartsound.p0.a
    public final void B(p0 workoutSheet) {
        kotlin.jvm.internal.u.j(workoutSheet, "workoutSheet");
        qc.b B = new qc.b(requireContext()).B(getString(C1987R.string.ecg_detail_settingsDeleteConfirmation));
        B.A(getString(C1987R.string._YES_), new com.withings.ecg.details.f(this, 1));
        B.w(C1987R.string._CANCEL_, new com.withings.ecg.heartsound.c(this, 0)).s();
    }

    @Override // qq.d.b
    public final void D() {
        E1();
    }

    public final void G1(androidx.lifecycle.k0<Integer> k0Var) {
        androidx.lifecycle.k0<Integer> k0Var2 = this.f38432j;
        if (k0Var2 != null) {
            k0Var2.removeObservers(this);
        }
        this.f38432j = k0Var;
        if (k0Var != null) {
            k0Var.observe(this, new C0505d(new e()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.menu_fragment_heart_sound_details, menu);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Integer value;
        androidx.lifecycle.k0<Integer> k0Var = this.f38432j;
        if (k0Var != null && (value = k0Var.getValue()) != null) {
            D1().f78078j.setScrollY(value.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_display_bottom_sheet) {
            p0 p0Var = new p0();
            this.f38434l = p0Var;
            p0Var.x1(this);
            p0 p0Var2 = this.f38434l;
            if (p0Var2 != null) {
                p0Var2.show(getParentFragmentManager(), com.withings.ecg.details.g.class.getSimpleName());
                return true;
            }
            kotlin.jvm.internal.u.s("bottomSheetFragment");
            throw null;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        E1();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        D1().f78078j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer value;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        D1().f78074f.setClipToOutline(true);
        D1().f78069a.setListener(new l(this));
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.k(D1().f78077i);
        this.f38438p = bVar;
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        androidx.constraintlayout.widget.b bVar3 = this.f38438p;
        if (bVar3 != null) {
            bVar2.l(bVar3);
            bVar2.j(C1987R.id.heart_sound_details_play_sound_background, 1);
            bVar2.j(C1987R.id.heart_sound_details_play_sound_background, 3);
            bVar2.o(C1987R.id.heart_sound_details_play_sound_background, 2, C1987R.id.heart_sound_details_graph, 2, (int) getResources().getDimension(C1987R.dimen.keyline_1));
            bVar2.o(C1987R.id.heart_sound_details_play_sound_background, 4, C1987R.id.heart_sound_details_graph, 4, (int) getResources().getDimension(C1987R.dimen.keyline_1));
            bVar2.r(C1987R.id.heart_sound_details_play_sound_background);
            this.f38439q = bVar2;
            this.f38440r = new b();
            TimeProgressView heartSoundTimeProgressView = D1().f78076h;
            kotlin.jvm.internal.u.i(heartSoundTimeProgressView, "heartSoundTimeProgressView");
            this.f38441s = new c(heartSoundTimeProgressView);
            F1(true);
            r rVar = (r) new k1(this, new com.withings.ecg.heartsound.e(this)).a(r.class);
            xw.d.c(this, rVar.B0(), new com.withings.ecg.heartsound.f(this));
            xw.d.c(this, rVar.z0(), new i(this));
            xw.d.c(this, rVar.A0(), new j(this));
            xw.d.c(this, rVar.y0(), new k(this));
            this.f38437o = rVar;
            AddDetailsView addDetailsView = D1().f78069a;
            r rVar2 = this.f38437o;
            if (rVar2 != null) {
                addDetailsView.setDetailsItems(rVar2.t0());
                androidx.lifecycle.k0<Integer> k0Var = this.f38432j;
                if (k0Var != null && (value = k0Var.getValue()) != null) {
                    D1().f78078j.setScrollY(value.intValue());
                }
                D1().f78078j.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.withings.ecg.heartsound.b
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view2, int i11, int i12, int i13, int i14) {
                        d.u1(d.this, i12);
                    }
                });
                D1().f78078j.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("playButtonConstraintSet");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z5) {
        super.setUserVisibleHint(z5);
        if (!z5) {
            E1();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    private d() {
        this.f38430h = new f(this);
        this.f38431i = new g(this);
        this.f38433k = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }
}

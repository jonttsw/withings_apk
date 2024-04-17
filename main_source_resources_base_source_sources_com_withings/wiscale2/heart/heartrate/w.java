package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.measure.detail.ui.views.OtherMeasuresSection;
import com.withings.views.measure.detail.ui.views.StatCellCardView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.VerticalScrollView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.heartrate.HeartRateAwakeAverageActivity;
import com.withings.wiscale2.heart.heartrate.e0;
import com.withings.wiscale2.heart.heartrate.events.HeartRateEventsActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepAverageHRStatus;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.wiscale2.vasistas.body.HRZonesAggregate;
import java.util.List;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import ng0.f;
import org.joda.time.DateTime;
import tb0.v2;
/* compiled from: HeartRateDayFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/w;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class w extends h1 {

    /* renamed from: h  reason: collision with root package name */
    private ea0.m f57731h;

    /* renamed from: i  reason: collision with root package name */
    private BlockableViewPager.b f57732i;

    /* renamed from: o  reason: collision with root package name */
    private e0 f57738o;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f57740q;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    public r0 f57741r;

    /* renamed from: t  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57730t = {androidx.camera.core.v.c(w.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/FragmentHeartRateDayBinding;", 0), androidx.camera.core.v.c(w.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(w.class, "date", "getDate()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: s  reason: collision with root package name */
    public static final a f57729s = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final LifecycleViewBindingProperty f57733j = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: k  reason: collision with root package name */
    private final n f57734k = new n(this);

    /* renamed from: l  reason: collision with root package name */
    private final o f57735l = new o(this);

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f57736m = nm0.h.b(new c());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f57737n = nm0.h.b(new q());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f57739p = nm0.h.b(new b());

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<d0> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final d0 invoke() {
            FragmentActivity activity = w.this.getActivity();
            if (activity != null) {
                return (d0) new androidx.lifecycle.k1(activity).a(d0.class);
            }
            return null;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            Context context = w.this.G1().b().getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            return a.d.a(context);
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class d implements k1.b {
        public d() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            w wVar = w.this;
            r0 r0Var = wVar.f57741r;
            if (r0Var != null) {
                return r0Var.a(wVar.getUser(), w.w1(wVar));
            }
            kotlin.jvm.internal.u.s("viewModelFactory");
            throw null;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements GraphView.e {
        e() {
        }

        @Override // com.withings.graph.GraphView.e
        public final void onScrubbingEnded() {
            BlockableViewPager.b bVar = w.this.f57732i;
            if (bVar != null) {
                bVar.Q1(true);
            }
        }

        @Override // com.withings.graph.GraphView.e
        public final void onScrubbingStarted() {
            BlockableViewPager.b bVar = w.this.f57732i;
            if (bVar != null) {
                bVar.Q1(false);
            }
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<LoadingState, nm0.y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(LoadingState loadingState) {
            LoadingState loadingState2 = loadingState;
            kotlin.jvm.internal.u.g(loadingState2);
            w.F1(w.this, loadingState2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<List<? extends Vasistas>, nm0.y> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends Vasistas> list) {
            List<? extends Vasistas> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            w.C1(w.this, list2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<e0.a, nm0.y> {
        h() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(e0.a aVar) {
            w.D1(w.this, aVar.b());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.l<HRZonesAggregate, nm0.y> {
        i() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(HRZonesAggregate hRZonesAggregate) {
            HRZonesAggregate hRZonesAggregate2 = hRZonesAggregate;
            kotlin.jvm.internal.u.g(hRZonesAggregate2);
            w.E1(w.this, hRZonesAggregate2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.l<List<? extends ky.d>, nm0.y> {
        j() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends ky.d> list) {
            int i11;
            List<? extends ky.d> list2 = list;
            final w wVar = w.this;
            StatCellCardView statCellCardView = wVar.G1().f99560h;
            kotlin.jvm.internal.u.g(statCellCardView);
            statCellCardView.setVisibility(0);
            int size = list2.size();
            Context requireContext = wVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            statCellCardView.setValue(wq.a.b(requireContext, C1987R.plurals.events_plural, size, Integer.valueOf(size)));
            if (list2.size() == 0) {
                i11 = C1987R.color.statusGood;
            } else {
                i11 = C1987R.color.statusModerate;
            }
            statCellCardView.setColorRes(i11);
            statCellCardView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.heart.heartrate.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w this$0 = w.this;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    HeartRateEventsActivity.a aVar = HeartRateEventsActivity.f57621j;
                    Context requireContext2 = this$0.requireContext();
                    kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
                    User user = this$0.getUser();
                    DateTime A1 = w.A1(this$0);
                    kotlin.jvm.internal.u.i(A1, "access$getStartOfDay(...)");
                    f.b bVar = f.b.f84180e;
                    aVar.getClass();
                    this$0.startActivity(HeartRateEventsActivity.a.a(requireContext2, user, A1, bVar));
                }
            });
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.l<List<? extends ky.d>, nm0.y> {
        k() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends ky.d> list) {
            int i11;
            List<? extends ky.d> list2 = list;
            final w wVar = w.this;
            StatCellCardView statCellCardView = wVar.G1().f99556d;
            kotlin.jvm.internal.u.g(statCellCardView);
            statCellCardView.setVisibility(0);
            int size = list2.size();
            Context requireContext = wVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            statCellCardView.setValue(wq.a.b(requireContext, C1987R.plurals.events_plural, size, Integer.valueOf(size)));
            if (list2.size() == 0) {
                i11 = C1987R.color.statusGood;
            } else {
                i11 = C1987R.color.statusModerate;
            }
            statCellCardView.setColorRes(i11);
            statCellCardView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.heart.heartrate.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w this$0 = w.this;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    HeartRateEventsActivity.a aVar = HeartRateEventsActivity.f57621j;
                    Context requireContext2 = this$0.requireContext();
                    kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
                    User user = this$0.getUser();
                    DateTime A1 = w.A1(this$0);
                    kotlin.jvm.internal.u.i(A1, "access$getStartOfDay(...)");
                    f.a aVar2 = f.a.f84179e;
                    aVar.getClass();
                    this$0.startActivity(HeartRateEventsActivity.a.a(requireContext2, user, A1, aVar2));
                }
            });
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.l<List<? extends MeasuresGroup>, nm0.y> {
        l() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends MeasuresGroup> list) {
            List<? extends MeasuresGroup> list2 = list;
            w wVar = w.this;
            OtherMeasuresSection otherMeasuresSection = wVar.G1().f99564l;
            kotlin.jvm.internal.u.g(list2);
            otherMeasuresSection.a(list2, new k1());
            wVar.G1().f99564l.setOnClickOnOther(new z(wVar));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class m implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57753a;

        m(ym0.l lVar) {
            this.f57753a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57753a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57753a;
        }

        public final int hashCode() {
            return this.f57753a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57753a.invoke(obj);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class n implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57754a = nm0.h.b(new a0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57755b;

        public n(Fragment fragment) {
            this.f57755b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57754a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class o implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57756a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57757b;

        public o(Fragment fragment) {
            this.f57757b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57756a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.l<w, v2> {
        @Override // ym0.l
        public final v2 invoke(w wVar) {
            w fragment = wVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return v2.a(fragment.requireView());
        }
    }

    /* compiled from: HeartRateDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class q extends kotlin.jvm.internal.w implements ym0.a<DateTime> {
        q() {
            super(0);
        }

        @Override // ym0.a
        public final DateTime invoke() {
            return w.w1(w.this).withTimeAtStartOfDay();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public w() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.wiscale2.heart.h(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f57740q = registerForActivityResult;
    }

    public static final DateTime A1(w wVar) {
        return (DateTime) wVar.f57737n.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ha0.i$c, java.lang.Object] */
    public static final void C1(w wVar, List list) {
        ea0.m mVar = new ea0.m(wVar.G1().f99557e, list, wVar.getUser(), new Object());
        mVar.T(wVar.G1().f99558f);
        nm0.g gVar = wVar.f57737n;
        DateTime dateTime = (DateTime) gVar.getValue();
        kotlin.jvm.internal.u.i(dateTime, "<get-startOfDay>(...)");
        mVar.x((DateTime) gVar.getValue(), hn.a.m(dateTime));
        wVar.f57731h = mVar;
    }

    public static final void D1(w wVar, Track track) {
        int i11;
        StatCellCardView statCellCardView = wVar.G1().f99561i;
        if (track != null && TrackKt.averageHr(track) >= 1) {
            statCellCardView.setValue(((jm.a) wVar.f57736m.getValue()).f(TrackKt.averageHr(track), 11));
        } else {
            statCellCardView.setValue("-");
        }
        SleepAverageHRStatus.a aVar = SleepAverageHRStatus.f60613d;
        if (track != null) {
            i11 = TrackKt.averageHr(track);
        } else {
            i11 = Integer.MIN_VALUE;
        }
        aVar.getClass();
        statCellCardView.setColorRes(SleepAverageHRStatus.a.a(i11).a());
        statCellCardView.setOnClickListener(new com.withings.webradio.ui.a(3, wVar, track));
    }

    public static final void E1(w wVar, HRZonesAggregate hRZonesAggregate) {
        StatCellCardView statCellCardView = wVar.G1().f99554b;
        if (hRZonesAggregate.b() < 1) {
            statCellCardView.setValue("-");
        } else {
            statCellCardView.setValue(((jm.a) wVar.f57736m.getValue()).f(hRZonesAggregate.b(), 11));
        }
        statCellCardView.g();
        if (hRZonesAggregate.b() > 0) {
            statCellCardView.setOnClickListener(new fa0.c(4, wVar, hRZonesAggregate));
        }
    }

    public static final void F1(w wVar, LoadingState loadingState) {
        wVar.getClass();
        int ordinal = loadingState.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 3) {
                    wVar.H1(false);
                    return;
                }
                return;
            }
            wVar.H1(true);
            return;
        }
        ProgressBar loading = wVar.G1().f99559g;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v2 G1() {
        return (v2) this.f57733j.getValue(this, f57730t[0]);
    }

    private final void H1(boolean z5) {
        int i11;
        ProgressBar loading = G1().f99559g;
        kotlin.jvm.internal.u.i(loading, "loading");
        int i12 = 8;
        loading.setVisibility(8);
        TextView noHrDataText = G1().f99562j;
        kotlin.jvm.internal.u.i(noHrDataText, "noHrDataText");
        if (z5) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        noHrDataText.setVisibility(i11);
        GraphView hrDayGraph = G1().f99557e;
        kotlin.jvm.internal.u.i(hrDayGraph, "hrDayGraph");
        if (z5) {
            i12 = 0;
        }
        hrDayGraph.setVisibility(i12);
        if (!z5) {
            G1().f99554b.setValue("-");
            G1().f99561i.setValue("-");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.f57734k.getValue(this, f57730t[1]);
    }

    public static void s1(w this$0, HRZonesAggregate hrZonesAggregate) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(hrZonesAggregate, "$hrZonesAggregate");
        HeartRateAwakeAverageActivity.a aVar = HeartRateAwakeAverageActivity.f57484h;
        Context requireContext = this$0.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        DateTime date = (DateTime) this$0.f57735l.getValue(this$0, f57730t[2]);
        aVar.getClass();
        kotlin.jvm.internal.u.j(date, "date");
        Intent putExtra = new Intent(requireContext, HeartRateAwakeAverageActivity.class).putExtra("EXTRA_HR_AGGREGATE", hrZonesAggregate).putExtra("EXTRA_HR_AGGREGATE_DATE", date);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        this$0.startActivity(putExtra);
    }

    public static void t1(w this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == 12) {
            e0 e0Var = this$0.f57738o;
            if (e0Var != null) {
                e0Var.V0();
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
    }

    public static void u1(w this$0, Track track) {
        xw.n<Track> nVar;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        d0 d0Var = (d0) this$0.f57739p.getValue();
        if (d0Var != null) {
            nVar = d0Var.i0();
        } else {
            nVar = null;
        }
        if (nVar != null) {
            if (track == null) {
                e0 e0Var = this$0.f57738o;
                if (e0Var != null) {
                    e0.a aVar = (e0.a) e0Var.U0().getValue();
                    if (aVar != null) {
                        track = aVar.a();
                    } else {
                        track = null;
                    }
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            nVar.setValue(track);
        }
    }

    public static void v1(w this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        MedicalReportActivity.a aVar = MedicalReportActivity.f42172p;
        Context context2 = view.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        String l5 = this$0.getUser().l();
        kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
        String s11 = this$0.getUser().s();
        kotlin.jvm.internal.u.i(s11, "getLastName(...)");
        aVar.getClass();
        context.startActivity(MedicalReportActivity.a.a(context2, l5, s11));
    }

    public static final DateTime w1(w wVar) {
        wVar.getClass();
        return (DateTime) wVar.f57735l.getValue(wVar, f57730t[2]);
    }

    @Override // com.withings.wiscale2.heart.heartrate.h1, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f57732i = (BlockableViewPager.b) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ea0.m mVar = this.f57731h;
        if (mVar != null) {
            mVar.y();
        }
        this.f57731h = null;
        this.f57732i = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        VerticalScrollView scrollView = G1().f99563k;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        ay.b.n(scrollView, false, true, 23);
        G1().f99555c.f96031a.setOnClickListener(new com.withings.alarm.ui.f(this, 11));
        G1().f99557e.setZoomEnabled(false);
        G1().f99557e.setOnScrubbingListener(new e());
        e0 e0Var = (e0) new androidx.lifecycle.k1(this, new d()).a(e0.class);
        e0Var.O0().observe(getViewLifecycleOwner(), new m(new f()));
        e0Var.T0().observe(getViewLifecycleOwner(), new m(new g()));
        e0Var.U0().observe(getViewLifecycleOwner(), new m(new h()));
        e0Var.M0().observe(getViewLifecycleOwner(), new m(new i()));
        e0Var.R0().observe(getViewLifecycleOwner(), new m(new j()));
        e0Var.G0().observe(getViewLifecycleOwner(), new m(new k()));
        e0Var.K0().observe(getViewLifecycleOwner(), new m(new l()));
        this.f57738o = e0Var;
    }
}

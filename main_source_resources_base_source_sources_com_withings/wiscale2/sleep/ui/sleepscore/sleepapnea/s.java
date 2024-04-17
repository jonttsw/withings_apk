package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.graph.TimeGraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.views.ArticlesView;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.sleepapnea.core.AhiStatus;
import com.withings.sleepapnea.core.BreathingDisturbanceStatus;
import com.withings.user.core.models.User;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.SectionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.graph.DataPopUpView;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import tb0.q3;
import tb0.y1;
/* compiled from: SleepDisorderDetailsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/sleepapnea/s;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class s extends com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.c {

    /* renamed from: h  reason: collision with root package name */
    private androidx.lifecycle.k0<Integer> f61447h;

    /* renamed from: l  reason: collision with root package name */
    private BlockableViewPager.b f61451l;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public k0 f61454o;

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61446r = {androidx.camera.core.v.c(s.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(s.class, "trackId", "getTrackId()J", 0), androidx.camera.core.v.c(s.class, "isSleepApnea", "isSleepApnea()Z", 0), androidx.camera.core.v.c(s.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDetailsSleepDisorderBinding;", 0)};

    /* renamed from: q  reason: collision with root package name */
    public static final a f61445q = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final e f61448i = new e(this);

    /* renamed from: j  reason: collision with root package name */
    private final f f61449j = new f(this);

    /* renamed from: k  reason: collision with root package name */
    private final g f61450k = new g(this);

    /* renamed from: m  reason: collision with root package name */
    private final LifecycleViewBindingProperty f61452m = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f61453n = nm0.h.b(new d());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f61455p = nm0.h.b(new i());

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f61456a;

        b(ym0.l lVar) {
            this.f61456a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f61456a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f61456a;
        }

        public final int hashCode() {
            return this.f61456a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61456a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            NestedScrollView nestedScrollView = s.this.G1().f99644b;
            kotlin.jvm.internal.u.g(num2);
            nestedScrollView.setScrollY(num2.intValue());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<i1> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final i1 invoke() {
            s sVar = s.this;
            q3 sectionHeader = sVar.G1().f99646d;
            kotlin.jvm.internal.u.i(sectionHeader, "sectionHeader");
            Context requireContext = sVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            return new i1(sectionHeader, requireContext);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61459a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61460b;

        public e(Fragment fragment) {
            this.f61460b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61459a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61461a = nm0.h.b(new c0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61462b;

        public f(Fragment fragment) {
            this.f61462b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61461a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61463a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61464b;

        public g(Fragment fragment) {
            this.f61464b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61463a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.l<s, y1> {
        @Override // ym0.l
        public final y1 invoke(s sVar) {
            s fragment = sVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return y1.a(fragment.requireView());
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<g0> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final g0 invoke() {
            s sVar = s.this;
            return (g0) new androidx.lifecycle.k1(sVar, new e0(sVar)).a(g0.class);
        }
    }

    public static final long A1(s sVar) {
        return ((Number) sVar.f61449j.getValue(sVar, f61446r[1])).longValue();
    }

    public static final User B1(s sVar) {
        sVar.getClass();
        return (User) sVar.f61448i.getValue(sVar, f61446r[0]);
    }

    public static final g0 C1(s sVar) {
        return (g0) sVar.f61455p.getValue();
    }

    public static final void D1(s sVar, g0.a aVar) {
        int i11;
        int i12;
        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar2;
        Object obj;
        List W;
        LinearLayout b10 = sVar.G1().f99645c.b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        if (aVar.b().isEmpty()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        b10.setVisibility(i11);
        if (!aVar.b().isEmpty()) {
            List<DatedValue> b11 = aVar.b();
            sVar.G1().f99645c.f99426c.t(((DatedValue) kotlin.collections.x.I(b11)).a(), ((DatedValue) kotlin.collections.x.T(b11)).a());
            TimeGraphView timeGraphView = sVar.G1().f99645c.f99425b;
            kotlin.jvm.internal.u.g(timeGraphView);
            DataPopUpView graphPopup = sVar.G1().f99645c.f99427d;
            kotlin.jvm.internal.u.i(graphPopup, "graphPopup");
            int a11 = aVar.a();
            boolean H1 = sVar.H1();
            if (H1) {
                i12 = 45;
            } else {
                i12 = 100;
            }
            List<DatedValue> list = b11;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            for (DatedValue datedValue : list) {
                arrayList.add(Integer.valueOf(datedValue.b()));
            }
            Integer num = (Integer) kotlin.collections.x.Y(arrayList);
            Object obj2 = null;
            if (num != null) {
                if (num.intValue() <= i12) {
                    num = null;
                }
                if (num != null) {
                    i12 = num.intValue();
                }
            }
            if (H1) {
                aVar2 = new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a(H1, c50.a.e(AhiStatus.f44270c), c50.a.e(AhiStatus.f44269b), c50.a.e(b50.a.a(i12)));
            } else {
                BreathingDisturbanceStatus breathingDisturbanceStatus = BreathingDisturbanceStatus.f44275c;
                c50.c e11 = c50.b.e(breathingDisturbanceStatus);
                BreathingDisturbanceStatus breathingDisturbanceStatus2 = BreathingDisturbanceStatus.f44274b;
                c50.c e12 = c50.b.e(breathingDisturbanceStatus2);
                Iterator it = kotlin.collections.x.W(BreathingDisturbanceStatus.f44273a, breathingDisturbanceStatus2, breathingDisturbanceStatus).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (b50.b.A((BreathingDisturbanceStatus) obj).s(i12)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BreathingDisturbanceStatus breathingDisturbanceStatus3 = (BreathingDisturbanceStatus) obj;
                if (breathingDisturbanceStatus3 == null) {
                    breathingDisturbanceStatus3 = BreathingDisturbanceStatus.f44276d;
                }
                aVar2 = new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a(H1, e11, e12, c50.b.e(breathingDisturbanceStatus3));
            }
            com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.a aVar3 = aVar2;
            if (H1) {
                int ordinal = b50.a.a(a11).ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        W = kotlin.collections.x.W(Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusModerate), Integer.valueOf((int) C1987R.color.statusBad));
                    } else {
                        W = kotlin.collections.x.W(Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusGood));
                    }
                } else {
                    W = kotlin.collections.x.W(Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusModerate), Integer.valueOf((int) C1987R.color.statusModerate));
                }
            } else {
                Iterator it2 = kotlin.collections.x.W(BreathingDisturbanceStatus.f44273a, BreathingDisturbanceStatus.f44274b, BreathingDisturbanceStatus.f44275c).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (b50.b.A((BreathingDisturbanceStatus) next).s(a11)) {
                        obj2 = next;
                        break;
                    }
                }
                BreathingDisturbanceStatus breathingDisturbanceStatus4 = (BreathingDisturbanceStatus) obj2;
                if (breathingDisturbanceStatus4 == null) {
                    breathingDisturbanceStatus4 = BreathingDisturbanceStatus.f44276d;
                }
                int ordinal2 = breathingDisturbanceStatus4.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        W = kotlin.collections.x.W(Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusModerate), Integer.valueOf((int) C1987R.color.statusBad));
                    } else {
                        W = kotlin.collections.x.W(Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusGood));
                    }
                } else {
                    W = kotlin.collections.x.W(Integer.valueOf((int) C1987R.color.statusGood), Integer.valueOf((int) C1987R.color.statusModerate), Integer.valueOf((int) C1987R.color.statusModerate));
                }
            }
            new q(timeGraphView, graphPopup, b11, aVar3, W).x(((DatedValue) kotlin.collections.x.I(b11)).a(), ((DatedValue) kotlin.collections.x.T(b11)).a());
            timeGraphView.setOnScrubbingListener(new u(sVar));
        }
    }

    public static final void F1(s sVar, Context context) {
        int i11;
        if (sVar.H1()) {
            i11 = C1987R.string.sleepApnea_ahiDetailViewHelpUrl;
        } else {
            i11 = C1987R.string.sleepApnea_breathingDisorderDetailViewHelpUrl;
        }
        String string = context.getString(i11);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        sVar.startActivity(HMWebActivity.f35395c.c(context, "", string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y1 G1() {
        return (y1) this.f61452m.getValue(this, f61446r[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H1() {
        return ((Boolean) this.f61450k.getValue(this, f61446r[2])).booleanValue();
    }

    public static void s1(s this$0, NestedScrollView this_with) {
        Integer value;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f61447h;
        if (k0Var != null && (value = k0Var.getValue()) != null) {
            this_with.setScrollY(value.intValue());
        }
    }

    public static void t1(s this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((g0) this$0.f61455p.getValue()).B0();
    }

    public static void u1(s this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        MedicalReportActivity.a aVar = MedicalReportActivity.f42172p;
        Context context2 = view.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        fn0.k<Object>[] kVarArr = f61446r;
        fn0.k<Object> kVar = kVarArr[0];
        e eVar = this$0.f61448i;
        String first = ((User) eVar.getValue(this$0, kVar)).getNames().getFirst();
        String last = ((User) eVar.getValue(this$0, kVarArr[0])).getNames().getLast();
        aVar.getClass();
        context.startActivity(MedicalReportActivity.a.a(context2, first, last));
    }

    public static void v1(s this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((g0) this$0.f61455p.getValue()).F0();
    }

    public static void w1(s this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f61447h;
        if (k0Var != null) {
            k0Var.setValue(Integer.valueOf(i11));
        }
    }

    public static final i1 z1(s sVar) {
        return (i1) sVar.f61453n.getValue();
    }

    public final void I1(androidx.lifecycle.k0<Integer> k0Var) {
        androidx.lifecycle.k0<Integer> k0Var2 = this.f61447h;
        if (k0Var2 != null) {
            k0Var2.removeObservers(this);
        }
        this.f61447h = k0Var;
        if (k0Var != null) {
            k0Var.observe(this, new b(new c()));
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.c, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f61451l = (BlockableViewPager.b) getParentFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        Integer value;
        int i12;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        G1().f99648f.f90096a.setListener(new t(this));
        DefinitionView definitionView = G1().f99647e;
        definitionView.setMessage(C1987R.string.sleepApnea_detail_description);
        definitionView.setButtonVisible(H1());
        definitionView.setButtonClickListener(new v(this));
        if (H1()) {
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new w(this, null), 3, null);
        }
        ArticlesView articles = G1().f99643a;
        kotlin.jvm.internal.u.i(articles, "articles");
        int i13 = 8;
        if (H1()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        articles.setVisibility(i11);
        if (H1()) {
            SectionView sectionView = G1().f99650h.f99484e;
            if (H1()) {
                i12 = C1987R.string.questionnaires_and_symptoms;
            } else {
                i12 = C1987R.string.questionnaires;
            }
            sectionView.setTitle(i12);
            LineCellView lineCellView = G1().f99650h.f99481b;
            lineCellView.setRightValueIcon(y70.a.a(C1987R.drawable.ic_arrow_right_30dp, lineCellView.getContext(), C1987R.color.textSecondary));
            lineCellView.setOnClickListener(new com.google.android.material.search.j(this, 18));
            LineCellView lineCellView2 = G1().f99650h.f99483d;
            lineCellView2.setRightValueIcon(y70.a.a(C1987R.drawable.ic_arrow_right_30dp, lineCellView2.getContext(), C1987R.color.textSecondary));
            lineCellView2.setOnClickListener(new dq.a(this, 11));
            LineCellView lineCellView3 = G1().f99650h.f99482c;
            lineCellView3.setRightValueIcon(y70.a.a(C1987R.drawable.ic_arrow_right_30dp, lineCellView3.getContext(), C1987R.color.textSecondary));
            lineCellView3.setOnClickListener(new fa0.c(6, this, lineCellView3));
        }
        LinearLayout b10 = G1().f99650h.b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        if (H1()) {
            i13 = 0;
        }
        b10.setVisibility(i13);
        G1().f99649g.f96031a.setOnClickListener(new sg.g(this, 19));
        final NestedScrollView nestedScrollView = G1().f99644b;
        androidx.lifecycle.k0<Integer> k0Var = this.f61447h;
        if (k0Var != null && (value = k0Var.getValue()) != null) {
            nestedScrollView.setScrollY(value.intValue());
        }
        nestedScrollView.setOnScrollChangeListener(new androidx.fragment.app.z0(this, 5));
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.r
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                s.s1(s.this, nestedScrollView);
            }
        });
        g0 g0Var = (g0) this.f61455p.getValue();
        xw.d.c(this, g0Var.z0(), new x(this));
        xw.d.c(this, g0Var.t0(), new y(this));
        xw.d.c(this, g0Var.A0(), new z(this));
        xw.d.c(this, g0Var.y0(), new a0(this));
    }
}

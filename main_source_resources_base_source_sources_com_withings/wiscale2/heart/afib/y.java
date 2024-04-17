package com.withings.wiscale2.heart.afib;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.user.User;
import com.withings.views.measure.detail.ui.views.OtherMeasuresSection;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.heart.afib.h0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
import rs.f;
import tb0.t1;
import ts.b;
/* compiled from: AFibMonthFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/heart/afib/y;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/CustomNestedScrollView$c;", "Lcom/withings/wiscale2/heart/afib/h0$b;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class y extends s0 implements CustomNestedScrollView.c, h0.b {

    /* renamed from: o  reason: collision with root package name */
    private int f57283o;
    @Inject

    /* renamed from: q  reason: collision with root package name */
    public fy.o f57285q;

    /* renamed from: s  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57275s = {androidx.camera.core.v.c(y.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(y.class, FoodDayFragment.ARG_DAY, "getDay()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(y.class, "isMedical", "isMedical()Z", 0), androidx.camera.core.v.c(y.class, "viewBinding", "getViewBinding()Lcom/withings/wiscale2/databinding/FragmentAfibMonthBinding;", 0)};

    /* renamed from: r  reason: collision with root package name */
    public static final a f57274r = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final j f57276h = new j(this);

    /* renamed from: i  reason: collision with root package name */
    private final k f57277i = new k(this);

    /* renamed from: j  reason: collision with root package name */
    private final l f57278j = new l(this);

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f57279k = nm0.h.b(new e());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f57280l = nm0.h.b(new i());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f57281m = nm0.h.b(new c());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f57282n = nm0.h.b(new d());

    /* renamed from: p  reason: collision with root package name */
    private final LifecycleViewBindingProperty f57284p = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void T0(y yVar, int i11);
    }

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.getColor(y.this.requireContext(), C1987R.color.statusBad));
        }
    }

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            Context requireContext = y.this.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            return Integer.valueOf(ah.u.w(C1987R.attr.colorSurface, requireContext, -65281));
        }
    }

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<b> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            Fragment parentFragment = y.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.wiscale2.heart.afib.AFibMonthFragment.Delegate");
            return (b) parentFragment;
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class f implements k1.b {
        public f() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            y yVar = y.this;
            User user = yVar.getUser();
            DateTime t12 = y.t1(yVar);
            boolean E1 = yVar.E1();
            fy.o oVar = yVar.f57285q;
            if (oVar != null) {
                return new h0(user, t12, E1, yVar, oVar);
            }
            kotlin.jvm.internal.u.s("getMeasuresGroupList");
            throw null;
        }
    }

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<h0.a, nm0.y> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(h0.a aVar) {
            h0.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            y yVar = y.this;
            yVar.D1().f99508h.setVisibility(8);
            y.z1(yVar, it.a(), it.b());
            y.A1(yVar, it.c());
            yVar.D1().f99512l.setOnClickOnOther(new z(yVar));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<List<? extends rs.e>, nm0.y> {
        h() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends rs.e> list) {
            List<? extends rs.e> it = list;
            kotlin.jvm.internal.u.j(it, "it");
            boolean z5 = !it.isEmpty();
            y yVar = y.this;
            if (z5) {
                y.x1(yVar);
                y.B1(yVar, it);
            } else {
                y.C1(yVar);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AFibMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<BlockableViewPager.b> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final BlockableViewPager.b invoke() {
            Fragment parentFragment = y.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.views.view.BlockableViewPager.PagerCallback");
            return (BlockableViewPager.b) parentFragment;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class j implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57293a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57294b;

        public j(Fragment fragment) {
            this.f57294b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57293a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class k implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57295a = nm0.h.b(new c0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57296b;

        public k(Fragment fragment) {
            this.f57296b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57295a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class l implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57297a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57298b;

        public l(Fragment fragment) {
            this.f57298b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57297a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.l<y, t1> {
        @Override // ym0.l
        public final t1 invoke(y yVar) {
            y fragment = yVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return t1.a(fragment.requireView());
        }
    }

    public static final void A1(y yVar, List list) {
        OtherMeasuresSection otherMeasuresSection = yVar.D1().f99512l;
        Context requireContext = yVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        otherMeasuresSection.a(list, new m0(requireContext, yVar.getUser(), false, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [os.a, java.lang.Object] */
    public static final void B1(y yVar, List list) {
        GraphView graphView = yVar.D1().f99509i;
        p0.d.l(graphView);
        graphView.i();
        b.a aVar = new b.a();
        aVar.l(list);
        aVar.i(new Object());
        graphView.d(aVar.o());
        graphView.invalidate();
        graphView.setOnScrubbingListener(new a0(yVar));
    }

    public static final void C1(y yVar) {
        yVar.D1().f99502b.setVisibility(8);
        yVar.D1().f99507g.setVisibility(0);
        ImageView imageView = yVar.D1().f99505e;
        Context context = imageView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        int w11 = ah.u.w(C1987R.attr.colorOnBackground, context, -65281);
        Context context2 = imageView.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        imageView.setImageDrawable(y70.a.c(C1987R.drawable.ic_stock_trend_36dp, context2, w11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t1 D1() {
        return (t1) this.f57284p.getValue(this, f57275s[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E1() {
        return ((Boolean) this.f57278j.getValue(this, f57275s[2])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.f57276h.getValue(this, f57275s[0]);
    }

    public static void s1(y this$0, View view) {
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

    public static final DateTime t1(y yVar) {
        return (DateTime) yVar.f57277i.getValue(yVar, f57275s[1]);
    }

    public static final BlockableViewPager.b u1(y yVar) {
        return (BlockableViewPager.b) yVar.f57280l.getValue();
    }

    public static final void x1(y yVar) {
        yVar.D1().f99513m.f96031a.setOnClickListener(new androidx.viewpager.widget.d(yVar, 10));
    }

    public static final void z1(y yVar, int i11, int i12) {
        int i13;
        LineCellView lineCellView = yVar.D1().f99503c;
        if (yVar.E1()) {
            i13 = C1987R.string.heartEvents_afibECG_monthly_days;
        } else {
            i13 = C1987R.string.heartEvents_nonMedical_monthly_days;
        }
        lineCellView.setLabel(yVar.getString(i13));
        yVar.D1().f99503c.x(C1987R.drawable.circle_shape_12dp, C1987R.color.statusBad);
        yVar.D1().f99503c.setValue(String.valueOf(i11));
        yVar.D1().f99506f.setValue(String.valueOf(i12));
    }

    @Override // com.withings.wiscale2.heart.afib.h0.b
    public final rs.f d1(DateTime dateTime, ky.a aVar) {
        f.a aVar2 = new f.a(aVar);
        aVar2.f95649h = 0.7f;
        aVar2.f95629d = false;
        aVar2.f95654m = true;
        aVar2.f95653l = C1987R.style.detail2;
        aVar2.f95648g = ((Number) this.f57282n.getValue()).intValue();
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        int k11 = ah.g.k(18, requireContext);
        aVar2.f95655n = true;
        aVar2.f95657p = k11;
        Context requireContext2 = requireContext();
        kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
        aVar2.f95656o = ah.g.k(24, requireContext2);
        aVar2.f95650i = String.valueOf(dateTime.getDayOfMonth());
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        if (hn.a.b(dateTime, now)) {
            if (aVar != null) {
                aVar2.f95648g = ((Number) this.f57281m.getValue()).intValue();
                aVar2.f95653l = C1987R.style.detailWhite;
            }
        } else {
            aVar2.f95653l = C1987R.style.detailUndefined;
        }
        rs.f fVar = new rs.f(aVar2);
        p0.d.q(fVar, dateTime);
        return fVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i11;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i11 = arguments.getInt("extra_current_scroll");
        } else {
            i11 = 0;
        }
        this.f57283o = i11;
        setHasOptionsMenu(true);
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public final void onScrolled(CustomNestedScrollView scrollView, int i11) {
        kotlin.jvm.internal.u.j(scrollView, "scrollView");
        this.f57283o = i11;
        ((b) this.f57279k.getValue()).T0(this, i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        CustomNestedScrollView customNestedScrollView = D1().f99502b;
        kotlin.jvm.internal.u.i(customNestedScrollView, "customNestedScrollView");
        ay.b.n(customNestedScrollView, false, true, 23);
        float f11 = i70.b.a(getActivity()).x;
        int i12 = (int) (0.42857143f * f11);
        int i13 = (int) (f11 * 0.75f);
        D1().f99510j.getLayoutParams().height = i13;
        D1().f99510j.requestLayout();
        CustomNestedScrollView customNestedScrollView2 = D1().f99502b;
        customNestedScrollView2.E(D1().f99510j, D1().f99511k, D1().f99501a, i12, i13);
        customNestedScrollView2.F(this.f57283o);
        customNestedScrollView2.setDelegate(this);
        TextView textView = D1().f99504d;
        if (E1()) {
            i11 = C1987R.string.heartEvents_afibNoECG_description;
        } else {
            i11 = C1987R.string.heartEvents_nonMedical_description;
        }
        textView.setText(i11);
        D1().f99508h.setVisibility(0);
        h0 h0Var = (h0) new k1(this, new f()).a(h0.class);
        xw.d.c(this, h0Var.p0(), new g());
        xw.d.c(this, h0Var.m0(), new h());
    }
}

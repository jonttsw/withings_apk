package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.util.ui.CustomTextAppearanceSpan;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomFrameLayout;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.sleep.ui.sleepscore.q2;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.Track;
import fi0.c;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import pm.e;
import rs.f;
import ts.b;
/* compiled from: SleepMonthFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/h2;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/CustomNestedScrollView$c;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/q2$a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class h2 extends Fragment implements CustomNestedScrollView.c, q2.a {

    /* renamed from: c  reason: collision with root package name */
    private final e f60987c = new e(this);

    /* renamed from: d  reason: collision with root package name */
    private final f f60988d = new f(this);

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f60989e = nm0.h.b(new c());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f60990f = nm0.h.b(new d());

    /* renamed from: g  reason: collision with root package name */
    private int f60991g;

    /* renamed from: h  reason: collision with root package name */
    private GraphView f60992h;

    /* renamed from: i  reason: collision with root package name */
    private GraphPopupView f60993i;

    /* renamed from: j  reason: collision with root package name */
    private ProgressBar f60994j;

    /* renamed from: k  reason: collision with root package name */
    private CustomNestedScrollView f60995k;

    /* renamed from: l  reason: collision with root package name */
    private View f60996l;

    /* renamed from: m  reason: collision with root package name */
    private CustomFrameLayout f60997m;

    /* renamed from: n  reason: collision with root package name */
    private ViewGroup f60998n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f60999o;

    /* renamed from: p  reason: collision with root package name */
    private ViewGroup f61000p;

    /* renamed from: q  reason: collision with root package name */
    private LineCellView f61001q;

    /* renamed from: r  reason: collision with root package name */
    private LineCellView f61002r;

    /* renamed from: s  reason: collision with root package name */
    private LineCellView f61003s;

    /* renamed from: t  reason: collision with root package name */
    private SleepScoreRecalculator f61004t;

    /* renamed from: v  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60986v = {androidx.camera.core.v.c(h2.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(h2.class, FoodDayFragment.ARG_DAY, "getDay()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: u  reason: collision with root package name */
    public static final a f60985u = new Object();

    /* compiled from: SleepMonthFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepMonthFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void S0(h2 h2Var, DateTime dateTime);

        void m1(h2 h2Var, int i11);
    }

    /* compiled from: SleepMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<b> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            Fragment parentFragment = h2.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.wiscale2.sleep.ui.sleepscore.SleepMonthFragment.Delegate");
            return (b) parentFragment;
        }
    }

    /* compiled from: SleepMonthFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<BlockableViewPager.b> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final BlockableViewPager.b invoke() {
            Fragment parentFragment = h2.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.views.view.BlockableViewPager.PagerCallback");
            return (BlockableViewPager.b) parentFragment;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61007a = nm0.h.b(new l2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61008b;

        public e(Fragment fragment) {
            this.f61008b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61007a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61009a = nm0.h.b(new m2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61010b;

        public f(Fragment fragment) {
            this.f61010b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61009a.getValue();
        }
    }

    public static final void A1(h2 h2Var) {
        CustomNestedScrollView customNestedScrollView = h2Var.f60995k;
        if (customNestedScrollView != null) {
            customNestedScrollView.setVisibility(8);
            ViewGroup viewGroup = h2Var.f60998n;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ImageView imageView = h2Var.f60999o;
                if (imageView != null) {
                    Context context = imageView.getContext();
                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                    int w11 = ah.u.w(C1987R.attr.colorOnBackground, context, -65281);
                    ImageView imageView2 = h2Var.f60999o;
                    if (imageView2 != null) {
                        Context context2 = imageView2.getContext();
                        kotlin.jvm.internal.u.i(context2, "getContext(...)");
                        imageView2.setImageDrawable(y70.a.c(C1987R.drawable.ic_stock_trend_36dp, context2, w11));
                        return;
                    }
                    kotlin.jvm.internal.u.s("emptyStateGlyph");
                    throw null;
                }
                kotlin.jvm.internal.u.s("emptyStateGlyph");
                throw null;
            }
            kotlin.jvm.internal.u.s("fullEmptyState");
            throw null;
        }
        kotlin.jvm.internal.u.s("customNestedScrollView");
        throw null;
    }

    private final SpannedString B1(int i11, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CustomNestedScrollView customNestedScrollView = this.f60995k;
        if (customNestedScrollView != null) {
            Context context = customNestedScrollView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            CustomTextAppearanceSpan customTextAppearanceSpan = new CustomTextAppearanceSpan(context, i11);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(customTextAppearanceSpan, length, spannableStringBuilder.length(), 17);
            return new SpannedString(spannableStringBuilder);
        }
        kotlin.jvm.internal.u.s("customNestedScrollView");
        throw null;
    }

    public static void s1(h2 this$0, rs.e eVar) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Object obj = eVar.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.track.data.Track");
        ((b) this$0.f60989e.getValue()).S0(this$0, ((Track) obj).getEndDate());
    }

    public static final DateTime u1(h2 h2Var) {
        return (DateTime) h2Var.f60988d.getValue(h2Var, f60986v[1]);
    }

    public static final BlockableViewPager.b w1(h2 h2Var) {
        return (BlockableViewPager.b) h2Var.f60990f.getValue();
    }

    public static final User y1(h2 h2Var) {
        h2Var.getClass();
        return (User) h2Var.f60987c.getValue(h2Var, f60986v[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [os.a, java.lang.Object] */
    public static final void z1(h2 h2Var, q2 q2Var) {
        h2Var.getClass();
        Integer a11 = q2Var.a();
        if (a11 != null) {
            int intValue = a11.intValue();
            LineCellView lineCellView = h2Var.f61001q;
            if (lineCellView != null) {
                lineCellView.setValue(h2Var.B1(C1987R.style.data3, String.valueOf(intValue)));
                int sleepScoreColorRes = SleepScoreColorHelper.INSTANCE.getSleepScoreColorRes(intValue);
                LineCellView lineCellView2 = h2Var.f61001q;
                if (lineCellView2 != null) {
                    Context requireContext = h2Var.requireContext();
                    kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                    lineCellView2.setLeftValueIcon(y70.a.a(C1987R.drawable.circle_shape_12dp, requireContext, sleepScoreColorRes));
                } else {
                    kotlin.jvm.internal.u.s("averageScoreView");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("averageScoreView");
                throw null;
            }
        }
        Integer c11 = q2Var.c();
        if (c11 != null) {
            int intValue2 = c11.intValue();
            LineCellView lineCellView3 = h2Var.f61002r;
            if (lineCellView3 != null) {
                Context context = lineCellView3.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                e.a aVar = new e.a(context, 0);
                aVar.a(true);
                aVar.w(true);
                aVar.t(true);
                aVar.v();
                SpannableStringBuilder b10 = new pm.e(aVar).b(intValue2);
                LineCellView lineCellView4 = h2Var.f61002r;
                if (lineCellView4 != null) {
                    lineCellView4.setValue(h2Var.B1(C1987R.style.data7, b10.toString()));
                } else {
                    kotlin.jvm.internal.u.s("weekDayAverageSleepDurationView");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("weekDayAverageSleepDurationView");
                throw null;
            }
        }
        Integer d11 = q2Var.d();
        if (d11 != null) {
            int intValue3 = d11.intValue();
            LineCellView lineCellView5 = h2Var.f61003s;
            if (lineCellView5 != null) {
                Context context2 = lineCellView5.getContext();
                kotlin.jvm.internal.u.i(context2, "getContext(...)");
                e.a aVar2 = new e.a(context2, 0);
                aVar2.a(true);
                aVar2.w(true);
                aVar2.t(true);
                aVar2.v();
                SpannableStringBuilder b11 = new pm.e(aVar2).b(intValue3);
                LineCellView lineCellView6 = h2Var.f61003s;
                if (lineCellView6 != null) {
                    lineCellView6.setValue(h2Var.B1(C1987R.style.data7, b11.toString()));
                } else {
                    kotlin.jvm.internal.u.s("weekEndAverageSleepDurationView");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("weekEndAverageSleepDurationView");
                throw null;
            }
        }
        GraphView graphView = h2Var.f60992h;
        if (graphView != null) {
            p0.d.l(graphView);
            GraphView graphView2 = h2Var.f60992h;
            if (graphView2 != null) {
                graphView2.i();
                GraphView graphView3 = h2Var.f60992h;
                if (graphView3 != null) {
                    b.a aVar3 = new b.a();
                    aVar3.l(q2Var.b());
                    aVar3.i(new Object());
                    graphView3.d(aVar3.o());
                    GraphView graphView4 = h2Var.f60992h;
                    if (graphView4 != null) {
                        GraphPopupView graphPopupView = h2Var.f60993i;
                        if (graphPopupView != null) {
                            graphView4.setPopup(graphPopupView);
                            GraphView graphView5 = h2Var.f60992h;
                            if (graphView5 != null) {
                                graphView5.invalidate();
                                GraphView graphView6 = h2Var.f60992h;
                                if (graphView6 != null) {
                                    graphView6.setOnScrubbingListener(new k2(h2Var));
                                    return;
                                } else {
                                    kotlin.jvm.internal.u.s("monthSleepGraph");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.u.s("monthSleepGraph");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("monthGraphPopup");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("monthSleepGraph");
                    throw null;
                }
                kotlin.jvm.internal.u.s("monthSleepGraph");
                throw null;
            }
            kotlin.jvm.internal.u.s("monthSleepGraph");
            throw null;
        }
        kotlin.jvm.internal.u.s("monthSleepGraph");
        throw null;
    }

    public final void customScrollTo(int i11) {
        CustomNestedScrollView customNestedScrollView = this.f60995k;
        if (customNestedScrollView != null) {
            customNestedScrollView.C(i11);
        } else {
            kotlin.jvm.internal.u.s("customNestedScrollView");
            throw null;
        }
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
        this.f60991g = i11;
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.menu_detail_sleep, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_sleep_month, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_display_bottom_sheet) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            kotlin.jvm.internal.u.i(parentFragmentManager, "getParentFragmentManager(...)");
            fi0.c.f67295k.getClass();
            c.a.a(null, false).show(parentFragmentManager, fi0.c.class.getSimpleName());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public final void onScrolled(CustomNestedScrollView scrollView, int i11) {
        kotlin.jvm.internal.u.j(scrollView, "scrollView");
        this.f60991g = i11;
        ((b) this.f60989e.getValue()).m1(this, i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        vh.h.b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.month_sleep_graph);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f60992h = (GraphView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.view_popup);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f60993i = (GraphPopupView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.graph_loading);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f60994j = (ProgressBar) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.custom_nested_scroll_view);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f60995k = (CustomNestedScrollView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.resizable_view);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f60996l = findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.content_container);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f60997m = (CustomFrameLayout) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.full_empty_state);
        kotlin.jvm.internal.u.i(findViewById7, "findViewById(...)");
        this.f60998n = (ViewGroup) findViewById7;
        View findViewById8 = view.findViewById(C1987R.id.empty_state_glyph);
        kotlin.jvm.internal.u.i(findViewById8, "findViewById(...)");
        this.f60999o = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(C1987R.id.scroll_content);
        kotlin.jvm.internal.u.i(findViewById9, "findViewById(...)");
        this.f61000p = (ViewGroup) findViewById9;
        View findViewById10 = view.findViewById(C1987R.id.average_sleep_score);
        kotlin.jvm.internal.u.i(findViewById10, "findViewById(...)");
        this.f61001q = (LineCellView) findViewById10;
        View findViewById11 = view.findViewById(C1987R.id.week_day_average_sleep_duration);
        kotlin.jvm.internal.u.i(findViewById11, "findViewById(...)");
        this.f61002r = (LineCellView) findViewById11;
        View findViewById12 = view.findViewById(C1987R.id.week_end_average_sleep_duration);
        kotlin.jvm.internal.u.i(findViewById12, "findViewById(...)");
        this.f61003s = (LineCellView) findViewById12;
        this.f61004t = SleepScoreRecalculator.Companion.get$default(SleepScoreRecalculator.Companion, ((User) this.f60987c.getValue(this, f60986v[0])).getId(), null, 2, null);
        float f11 = i70.b.a(getActivity()).x;
        int i11 = (int) (0.42857143f * f11);
        int i12 = (int) (f11 * 0.75f);
        View view2 = this.f60996l;
        if (view2 != null) {
            view2.getLayoutParams().height = i12;
            View view3 = this.f60996l;
            if (view3 != null) {
                view3.requestLayout();
                CustomNestedScrollView customNestedScrollView = this.f60995k;
                if (customNestedScrollView != null) {
                    View view4 = this.f60996l;
                    if (view4 != null) {
                        ViewGroup viewGroup = this.f61000p;
                        if (viewGroup != null) {
                            CustomFrameLayout customFrameLayout = this.f60997m;
                            if (customFrameLayout != null) {
                                customNestedScrollView.E(view4, viewGroup, customFrameLayout, i11, i12);
                                CustomNestedScrollView customNestedScrollView2 = this.f60995k;
                                if (customNestedScrollView2 != null) {
                                    customNestedScrollView2.F(this.f60991g);
                                    CustomNestedScrollView customNestedScrollView3 = this.f60995k;
                                    if (customNestedScrollView3 != null) {
                                        customNestedScrollView3.setDelegate(this);
                                        GraphView graphView = this.f60992h;
                                        if (graphView != null) {
                                            Context context = graphView.getContext();
                                            i2 i2Var = new i2(context);
                                            androidx.fragment.app.z0 z0Var = new androidx.fragment.app.z0(this, 4);
                                            GraphPopupView graphPopupView = this.f60993i;
                                            if (graphPopupView != null) {
                                                graphPopupView.setOnPopupClickListener(z0Var);
                                                GraphPopupView graphPopupView2 = this.f60993i;
                                                if (graphPopupView2 != null) {
                                                    graphPopupView2.setShouldShowTriangle(true);
                                                    GraphPopupView graphPopupView3 = this.f60993i;
                                                    if (graphPopupView3 != null) {
                                                        graphPopupView3.setShouldAlignToTopOfGraphView(false);
                                                        GraphPopupView graphPopupView4 = this.f60993i;
                                                        if (graphPopupView4 != null) {
                                                            graphPopupView4.setShouldShowVerticalLine(false);
                                                            GraphPopupView graphPopupView5 = this.f60993i;
                                                            if (graphPopupView5 != null) {
                                                                kotlin.jvm.internal.u.g(context);
                                                                graphPopupView5.setPopupMarginFromDatumYPx(ah.g.k(20, context));
                                                                GraphPopupView graphPopupView6 = this.f60993i;
                                                                if (graphPopupView6 != null) {
                                                                    graphPopupView6.setPopupContentProvider(i2Var);
                                                                    GraphPopupView graphPopupView7 = this.f60993i;
                                                                    if (graphPopupView7 != null) {
                                                                        graphPopupView7.n(context.getResources(), ah.g.k(24, context), ah.g.k(24, context));
                                                                        LineCellView lineCellView = this.f61001q;
                                                                        if (lineCellView != null) {
                                                                            lineCellView.setValue(B1(C1987R.style.data3, "-"));
                                                                            LineCellView lineCellView2 = this.f61002r;
                                                                            if (lineCellView2 != null) {
                                                                                lineCellView2.setValue(B1(C1987R.style.data7, "-"));
                                                                                LineCellView lineCellView3 = this.f61003s;
                                                                                if (lineCellView3 != null) {
                                                                                    lineCellView3.setValue(B1(C1987R.style.data7, "-"));
                                                                                    ProgressBar progressBar = this.f60994j;
                                                                                    if (progressBar != null) {
                                                                                        progressBar.setVisibility(0);
                                                                                        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new j2(this, null), 2, null);
                                                                                        return;
                                                                                    }
                                                                                    kotlin.jvm.internal.u.s("monthLoading");
                                                                                    throw null;
                                                                                }
                                                                                kotlin.jvm.internal.u.s("weekEndAverageSleepDurationView");
                                                                                throw null;
                                                                            }
                                                                            kotlin.jvm.internal.u.s("weekDayAverageSleepDurationView");
                                                                            throw null;
                                                                        }
                                                                        kotlin.jvm.internal.u.s("averageScoreView");
                                                                        throw null;
                                                                    }
                                                                    kotlin.jvm.internal.u.s("monthGraphPopup");
                                                                    throw null;
                                                                }
                                                                kotlin.jvm.internal.u.s("monthGraphPopup");
                                                                throw null;
                                                            }
                                                            kotlin.jvm.internal.u.s("monthGraphPopup");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.u.s("monthGraphPopup");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.u.s("monthGraphPopup");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.u.s("monthGraphPopup");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.u.s("monthGraphPopup");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.u.s("monthSleepGraph");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.u.s("customNestedScrollView");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("customNestedScrollView");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("customFrameLayout");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("scrollContent");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("resizableView");
                    throw null;
                }
                kotlin.jvm.internal.u.s("customNestedScrollView");
                throw null;
            }
            kotlin.jvm.internal.u.s("resizableView");
            throw null;
        }
        kotlin.jvm.internal.u.s("resizableView");
        throw null;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.q2.a
    public final rs.f p0(Track track, DateTime dateTime) {
        boolean z5;
        SleepScore sleepScore;
        GraphView graphView = this.f60992h;
        Integer num = null;
        if (graphView != null) {
            Context context = graphView.getContext();
            f.a aVar = new f.a(track);
            int color = androidx.core.content.a.getColor(context, C1987R.color.backgroundSecondary);
            aVar.f95649h = 0.7f;
            if (track != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            aVar.f95629d = z5;
            aVar.f95654m = true;
            aVar.f95648g = color;
            aVar.f95653l = C1987R.style.detailWhite;
            kotlin.jvm.internal.u.g(context);
            int k11 = ah.g.k(18, context);
            aVar.f95655n = true;
            aVar.f95657p = k11;
            aVar.f95656o = ah.g.k(24, context);
            aVar.f95650i = String.valueOf(dateTime.getDayOfMonth());
            if (dateTime.isBeforeNow()) {
                if (track != null && (sleepScore = track.getSleepScore()) != null) {
                    num = Integer.valueOf(sleepScore.getSleepScoreValue());
                }
                if (num != null) {
                    aVar.f95648g = androidx.core.content.a.getColor(context, SleepScoreColorHelper.INSTANCE.getSleepScoreColorRes(track.getSleepScore()));
                    aVar.f95653l = C1987R.style.detailWhite;
                } else if (track != null) {
                    aVar.f95648g = color;
                    aVar.f95653l = C1987R.style.detail1;
                } else {
                    aVar.f95653l = C1987R.style.detail1;
                }
            } else {
                aVar.f95653l = C1987R.style.detail1;
            }
            rs.f fVar = new rs.f(aVar);
            p0.d.q(fVar, dateTime);
            return fVar;
        }
        kotlin.jvm.internal.u.s("monthSleepGraph");
        throw null;
    }
}

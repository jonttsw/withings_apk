package com.withings.wiscale2.vo2max.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: Vo2maxFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/vo2max/view/i1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class i1 extends com.withings.wiscale2.vo2max.view.c {
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public fy.l f62763h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public fy.c0 f62764i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public zx.r f62765j;

    /* renamed from: k  reason: collision with root package name */
    private final d f62766k = new d(this);

    /* renamed from: l  reason: collision with root package name */
    private final e f62767l = new e(this);

    /* renamed from: m  reason: collision with root package name */
    private NestedScrollView f62768m;

    /* renamed from: n  reason: collision with root package name */
    private androidx.lifecycle.k0<Integer> f62769n;

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f62762p = {androidx.camera.core.v.c(i1.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(i1.class, "vo2maxMeasureGroup", "getVo2maxMeasureGroup()Lcom/withings/library/measure/MeasuresGroup;", 0)};

    /* renamed from: o  reason: collision with root package name */
    public static final a f62761o = new Object();

    /* compiled from: Vo2maxFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Vo2maxFragment.kt */
    /* loaded from: classes5.dex */
    static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f62770a;

        b(ym0.l lVar) {
            this.f62770a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f62770a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f62770a;
        }

        public final int hashCode() {
            return this.f62770a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f62770a.invoke(obj);
        }
    }

    /* compiled from: Vo2maxFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null) {
                NestedScrollView nestedScrollView = i1.this.f62768m;
                if (nestedScrollView != null) {
                    nestedScrollView.setScrollY(num2.intValue());
                } else {
                    kotlin.jvm.internal.u.s("scrollView");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62772a = nm0.h.b(new o1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f62773b;

        public d(Fragment fragment) {
            this.f62773b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62772a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Fragment, MeasuresGroup> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62774a = nm0.h.b(new p1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f62775b;

        public e(Fragment fragment) {
            this.f62775b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.library.measure.MeasuresGroup, java.lang.Object] */
        @Override // bn0.d
        public final MeasuresGroup getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62774a.getValue();
        }
    }

    public static void s1(i1 this$0) {
        Integer value;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f62769n;
        if (k0Var != null && (value = k0Var.getValue()) != null) {
            NestedScrollView nestedScrollView = this$0.f62768m;
            if (nestedScrollView != null) {
                nestedScrollView.setScrollY(value.intValue());
            } else {
                kotlin.jvm.internal.u.s("scrollView");
                throw null;
            }
        }
    }

    public static void t1(i1 this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f62769n;
        if (k0Var != null) {
            k0Var.setValue(Integer.valueOf(i11));
        }
    }

    public static final User v1(i1 i1Var) {
        return (User) i1Var.f62766k.getValue(i1Var, f62762p[0]);
    }

    public static final MeasuresGroup w1(i1 i1Var) {
        return (MeasuresGroup) i1Var.f62767l.getValue(i1Var, f62762p[1]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_vo2max, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer value;
        DefinitionView definitionView;
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.scroll_view);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        ay.b.n(findViewById, false, true, 23);
        new Vo2maxHeaderView(view, this).f((w1) new androidx.lifecycle.k1(this, new k1(this)).a(w1.class));
        View view2 = getView();
        if (view2 != null && (definitionView = (DefinitionView) view2.findViewById(C1987R.id.section_learn_more)) != null) {
            definitionView.setMessage(C1987R.string.vo2maxDetail_learnMoreDescription);
            definitionView.setButtonText(C1987R.string._LEARN_MORE_);
            definitionView.setButtonClickListener(new m1(this));
        }
        new Vo2MaxComparisonView(view, this).l((i0) new androidx.lifecycle.k1(this, new j1(this)).a(i0.class));
        new q0(view, this).f((r0) new androidx.lifecycle.k1(this, new l1(view, this)).a(r0.class));
        new y1(view, this).c((a2) new androidx.lifecycle.k1(this, new n1(view, this)).a(a2.class));
        View findViewById2 = view.findViewById(C1987R.id.scroll_view);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f62768m = (NestedScrollView) findViewById2;
        androidx.lifecycle.k0<Integer> k0Var = this.f62769n;
        if (k0Var != null && (value = k0Var.getValue()) != null) {
            NestedScrollView nestedScrollView = this.f62768m;
            if (nestedScrollView != null) {
                nestedScrollView.setScrollY(value.intValue());
            } else {
                kotlin.jvm.internal.u.s("scrollView");
                throw null;
            }
        }
        NestedScrollView nestedScrollView2 = this.f62768m;
        if (nestedScrollView2 != null) {
            nestedScrollView2.setOnScrollChangeListener(new com.google.firebase.crashlytics.a(this));
            NestedScrollView nestedScrollView3 = this.f62768m;
            if (nestedScrollView3 != null) {
                nestedScrollView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.withings.wiscale2.vo2max.view.h1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        i1.s1(i1.this);
                    }
                });
                return;
            } else {
                kotlin.jvm.internal.u.s("scrollView");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("scrollView");
        throw null;
    }

    public final void x1(androidx.lifecycle.k0<Integer> k0Var) {
        androidx.lifecycle.k0<Integer> k0Var2 = this.f62769n;
        if (k0Var2 != null) {
            k0Var2.removeObservers(this);
        }
        this.f62769n = k0Var;
        if (k0Var != null) {
            k0Var.observe(this, new b(new c()));
        }
    }
}

package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.DatePagerTabStrip;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.core.models.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/sleepapnea/w0;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/BlockableViewPager$b;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class w0 extends Fragment implements BlockableViewPager.b {

    /* renamed from: c  reason: collision with root package name */
    private final e f61476c;

    /* renamed from: d  reason: collision with root package name */
    private final f f61477d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f61478e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61479f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f61480g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61481h;

    /* renamed from: i  reason: collision with root package name */
    private BlockableViewPager f61482i;

    /* renamed from: j  reason: collision with root package name */
    private DatePagerTabStrip f61483j;

    /* renamed from: k  reason: collision with root package name */
    private View f61484k;

    /* renamed from: l  reason: collision with root package name */
    private n1 f61485l;

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61475n = {androidx.camera.core.v.c(w0.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(w0.class, "isSleepApnea", "isSleepApnea()Z", 0)};

    /* renamed from: m  reason: collision with root package name */
    public static final a f61474m = new Object();

    /* compiled from: SleepDisorderGraphPagerFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepDisorderGraphPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<SleepDisorderActivity.b> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final SleepDisorderActivity.b invoke() {
            FragmentActivity activity = w0.this.getActivity();
            if (activity != null) {
                return (SleepDisorderActivity.b) new androidx.lifecycle.k1(activity).a(SleepDisorderActivity.b.class);
            }
            return null;
        }
    }

    /* compiled from: SleepDisorderGraphPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Period> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Period invoke() {
            SleepDisorderActivity.b s12 = w0.s1(w0.this);
            if (s12 != null) {
                return s12.j0();
            }
            return Period.f43721f;
        }
    }

    /* compiled from: SleepDisorderGraphPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<DateTime> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final DateTime invoke() {
            SleepDisorderActivity.b s12 = w0.s1(w0.this);
            if (s12 != null) {
                return s12.m0();
            }
            return null;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61489a = nm0.h.b(new e1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61490b;

        public e(Fragment fragment) {
            this.f61490b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61489a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61491a = nm0.h.b(new f1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61492b;

        public f(Fragment fragment) {
            this.f61492b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61491a.getValue();
        }
    }

    /* compiled from: SleepDisorderGraphPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<j1> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final j1 invoke() {
            w0 w0Var = w0.this;
            return (j1) new androidx.lifecycle.k1(w0Var, new g1(w0Var)).a(j1.class);
        }
    }

    public w0() {
        super(C1987R.layout.fragment_sleepdisorder_pager);
        this.f61476c = new e(this);
        this.f61477d = new f(this);
        this.f61478e = nm0.h.b(new b());
        this.f61479f = nm0.h.b(new c());
        this.f61480g = nm0.h.b(new d());
        this.f61481h = nm0.h.b(new g());
    }

    public static final void A1(w0 w0Var, boolean z5) {
        int i11;
        View view = w0Var.f61484k;
        if (view != null) {
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            return;
        }
        kotlin.jvm.internal.u.s("progress");
        throw null;
    }

    public static final SleepDisorderActivity.b s1(w0 w0Var) {
        return (SleepDisorderActivity.b) w0Var.f61478e.getValue();
    }

    public static final Period t1(w0 w0Var) {
        return (Period) w0Var.f61479f.getValue();
    }

    public static final DateTime u1(w0 w0Var) {
        return (DateTime) w0Var.f61480g.getValue();
    }

    public static final User w1(w0 w0Var) {
        return (User) w0Var.f61476c.getValue(w0Var, f61475n[0]);
    }

    public static final j1 x1(w0 w0Var) {
        return (j1) w0Var.f61481h.getValue();
    }

    public static final boolean z1(w0 w0Var) {
        w0Var.getClass();
        return ((Boolean) w0Var.f61477d.getValue(w0Var, f61475n[1])).booleanValue();
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        BlockableViewPager blockableViewPager = this.f61482i;
        if (blockableViewPager != null) {
            blockableViewPager.setPagingEnabled(z5);
        } else {
            kotlin.jvm.internal.u.s("viewPager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.view_pager);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f61482i = (BlockableViewPager) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.date_pager);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f61483j = (DatePagerTabStrip) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.progress);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f61484k = findViewById3;
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.u.i(childFragmentManager, "getChildFragmentManager(...)");
        Period period = (Period) this.f61479f.getValue();
        nm0.g gVar = this.f61481h;
        n1 n1Var = new n1(childFragmentManager, period, ((j1) gVar.getValue()).t0(), (DateTime) this.f61480g.getValue(), ((Boolean) this.f61477d.getValue(this, f61475n[1])).booleanValue());
        this.f61485l = n1Var;
        BlockableViewPager blockableViewPager = this.f61482i;
        if (blockableViewPager != null) {
            blockableViewPager.setAdapter(n1Var);
            BlockableViewPager blockableViewPager2 = this.f61482i;
            if (blockableViewPager2 != null) {
                blockableViewPager2.c(new d1(this));
                DatePagerTabStrip datePagerTabStrip = this.f61483j;
                if (datePagerTabStrip != null) {
                    BlockableViewPager blockableViewPager3 = this.f61482i;
                    if (blockableViewPager3 != null) {
                        datePagerTabStrip.setPager(blockableViewPager3);
                        Context context = view.getContext();
                        kotlin.jvm.internal.u.i(context, "getContext(...)");
                        j1 j1Var = (j1) gVar.getValue();
                        xw.d.c(this, j1Var.q0(), new x0(this));
                        xw.d.c(this, ((j1) gVar.getValue()).z0(), new y0(this, context));
                        xw.d.c(this, ((j1) gVar.getValue()).A0(), new z0(this, context));
                        xw.d.c(this, j1Var.p0(), new a1(this));
                        xw.d.c(this, j1Var.r0(), new b1(this));
                        xw.d.c(this, j1Var.m0(), new c1(this));
                        View view2 = this.f61484k;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            return;
                        } else {
                            kotlin.jvm.internal.u.s("progress");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.u.s("viewPager");
                    throw null;
                }
                kotlin.jvm.internal.u.s("tabView");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewPager");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewPager");
        throw null;
    }
}

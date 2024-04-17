package com.withings.wiscale2.sleep.ui.sleepscore;

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
/* compiled from: SleepDisorderDayPagerFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/t1;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/BlockableViewPager$b;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class t1 extends com.withings.wiscale2.sleep.ui.sleepscore.f implements BlockableViewPager.b {

    /* renamed from: h  reason: collision with root package name */
    private final e f61506h = new e(this);

    /* renamed from: i  reason: collision with root package name */
    private final f f61507i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f61508j = nm0.h.b(new b());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f61509k = nm0.h.b(new c());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f61510l = nm0.h.b(new d());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f61511m = nm0.h.b(new g());

    /* renamed from: n  reason: collision with root package name */
    private BlockableViewPager f61512n;

    /* renamed from: o  reason: collision with root package name */
    private DatePagerTabStrip f61513o;

    /* renamed from: p  reason: collision with root package name */
    private View f61514p;

    /* renamed from: q  reason: collision with root package name */
    private e2 f61515q;

    /* renamed from: s  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61505s = {androidx.camera.core.v.c(t1.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(t1.class, "isSleepApnea", "isSleepApnea()Z", 0)};

    /* renamed from: r  reason: collision with root package name */
    public static final a f61504r = new Object();

    /* compiled from: SleepDisorderDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepDisorderDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<SleepDisorderActivity.b> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final SleepDisorderActivity.b invoke() {
            FragmentActivity activity = t1.this.getActivity();
            if (activity != null) {
                return (SleepDisorderActivity.b) new androidx.lifecycle.k1(activity).a(SleepDisorderActivity.b.class);
            }
            return null;
        }
    }

    /* compiled from: SleepDisorderDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Period> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Period invoke() {
            SleepDisorderActivity.b s12 = t1.s1(t1.this);
            if (s12 != null) {
                return s12.j0();
            }
            return Period.f43721f;
        }
    }

    /* compiled from: SleepDisorderDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<DateTime> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final DateTime invoke() {
            SleepDisorderActivity.b s12 = t1.s1(t1.this);
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
        private final nm0.g f61519a = nm0.h.b(new a2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61520b;

        public e(Fragment fragment) {
            this.f61520b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61519a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61521a = nm0.h.b(new b2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61522b;

        public f(Fragment fragment) {
            this.f61522b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61521a.getValue();
        }
    }

    /* compiled from: SleepDisorderDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1 invoke() {
            t1 t1Var = t1.this;
            return (com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1) new androidx.lifecycle.k1(t1Var, new c2(t1Var)).a(com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1.class);
        }
    }

    public static final void A1(t1 t1Var, boolean z5) {
        int i11;
        View view = t1Var.f61514p;
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

    public static final SleepDisorderActivity.b s1(t1 t1Var) {
        return (SleepDisorderActivity.b) t1Var.f61508j.getValue();
    }

    public static final Period t1(t1 t1Var) {
        return (Period) t1Var.f61509k.getValue();
    }

    public static final DateTime u1(t1 t1Var) {
        return (DateTime) t1Var.f61510l.getValue();
    }

    public static final User w1(t1 t1Var) {
        t1Var.getClass();
        return (User) t1Var.f61506h.getValue(t1Var, f61505s[0]);
    }

    public static final com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1 x1(t1 t1Var) {
        return (com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1) t1Var.f61511m.getValue();
    }

    public static final boolean z1(t1 t1Var) {
        t1Var.getClass();
        return ((Boolean) t1Var.f61507i.getValue(t1Var, f61505s[1])).booleanValue();
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        BlockableViewPager blockableViewPager = this.f61512n;
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
        this.f61512n = (BlockableViewPager) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.date_pager);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f61513o = (DatePagerTabStrip) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.progress);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f61514p = findViewById3;
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.u.i(childFragmentManager, "getChildFragmentManager(...)");
        fn0.k<Object>[] kVarArr = f61505s;
        fn0.k<Object> kVar = kVarArr[0];
        boolean booleanValue = ((Boolean) this.f61507i.getValue(this, kVarArr[1])).booleanValue();
        nm0.g gVar = this.f61511m;
        e2 e2Var = new e2(childFragmentManager, (User) this.f61506h.getValue(this, kVar), booleanValue, ((com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1) gVar.getValue()).t0());
        this.f61515q = e2Var;
        BlockableViewPager blockableViewPager = this.f61512n;
        if (blockableViewPager != null) {
            blockableViewPager.setAdapter(e2Var);
            BlockableViewPager blockableViewPager2 = this.f61512n;
            if (blockableViewPager2 != null) {
                blockableViewPager2.c(new z1(this));
                DatePagerTabStrip datePagerTabStrip = this.f61513o;
                if (datePagerTabStrip != null) {
                    BlockableViewPager blockableViewPager3 = this.f61512n;
                    if (blockableViewPager3 != null) {
                        datePagerTabStrip.setPager(blockableViewPager3);
                        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1 j1Var = (com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1) gVar.getValue();
                        xw.d.c(this, j1Var.q0(), new u1(this));
                        xw.d.c(this, j1Var.y0(), new v1(this));
                        xw.d.c(this, j1Var.p0(), new w1(this));
                        xw.d.c(this, j1Var.r0(), new x1(this));
                        xw.d.c(this, j1Var.m0(), new y1(this));
                        View view2 = this.f61514p;
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

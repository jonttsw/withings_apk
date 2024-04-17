package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.DatePagerTitleStrip;
import androidx.viewpager.widget.ViewPager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.y3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.joda.time.DateTime;
import qw.a;
/* compiled from: SleepWeekPagerFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/k4;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/y3$b;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k4 extends Fragment implements BlockableViewPager.b, y3.b {

    /* renamed from: c  reason: collision with root package name */
    private BlockableViewPager f61118c;

    /* renamed from: e  reason: collision with root package name */
    private int f61120e;

    /* renamed from: i  reason: collision with root package name */
    private d f61124i;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61117l = {androidx.camera.core.v.c(k4.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(k4.class, "firstTrackDateEver", "getFirstTrackDateEver()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f61116k = new Object();

    /* renamed from: d  reason: collision with root package name */
    private DateTime f61119d = DateTime.now();

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61121f = nm0.h.b(new f());

    /* renamed from: g  reason: collision with root package name */
    private final g f61122g = new g(this);

    /* renamed from: h  reason: collision with root package name */
    private final h f61123h = new h(this);

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f61125j = nm0.h.b(new e());

    /* compiled from: SleepWeekPagerFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static k4 a(User user, DateTime dateTime, DateTime dateTime2) {
            kotlin.jvm.internal.u.j(user, "user");
            k4 k4Var = new k4();
            Bundle bundle = new Bundle();
            bundle.putSerializable(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
            bundle.putSerializable("extra_date", dateTime);
            bundle.putSerializable("EXTRA_FIRST_TRACK_EVER", dateTime2);
            k4Var.setArguments(bundle);
            return k4Var;
        }
    }

    /* compiled from: SleepWeekPagerFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void O(k4 k4Var, DateTime dateTime);

        void c3(k4 k4Var, DateTime dateTime);
    }

    /* compiled from: SleepWeekPagerFragment.kt */
    /* loaded from: classes5.dex */
    private static final class c extends ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        private final k4 f61126a;

        public c(k4 fragment) {
            kotlin.jvm.internal.u.j(fragment, "fragment");
            this.f61126a = fragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void onPageSelected(int i11) {
            k4.u1(this.f61126a, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SleepWeekPagerFragment.kt */
    /* loaded from: classes5.dex */
    public final class d extends ty.a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f61127a;

        /* renamed from: b  reason: collision with root package name */
        private final User f61128b;

        /* renamed from: c  reason: collision with root package name */
        private int f61129c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k4 f61130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k4 k4Var, Context context, FragmentManager fragmentManager, User user) {
            super(fragmentManager, k4.t1(k4Var), DateTime.now());
            kotlin.jvm.internal.u.j(user, "user");
            this.f61130d = k4Var;
            this.f61127a = context;
            this.f61128b = user;
        }

        @Override // ty.a
        public final Fragment getFragment(DateTime day) {
            kotlin.jvm.internal.u.j(day, "day");
            y3.a aVar = y3.f61564j;
            int i11 = this.f61129c;
            aVar.getClass();
            User user = this.f61128b;
            kotlin.jvm.internal.u.j(user, "user");
            y3 y3Var = new y3();
            y3Var.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_USER", user), new nm0.j("EXTRA_DAY", day), new nm0.j("EXTRA_CURRENT_SCROLL", Integer.valueOf(i11))));
            return y3Var;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            DateTime week = getWeek(i11);
            kotlin.jvm.internal.u.i(week, "getWeek(...)");
            return b50.b.p(this.f61127a, week);
        }

        @Override // qw.a.b
        public final void onLoaded(DateTime start, DateTime end) {
            kotlin.jvm.internal.u.j(start, "start");
            kotlin.jvm.internal.u.j(end, "end");
        }

        @Override // com.withings.measure.detail.paged.g
        public final void setCurrentScroll(int i11) {
            this.f61129c = i11;
            en0.i iVar = new en0.i(-2, 2, 1);
            ArrayList arrayList = new ArrayList();
            en0.j it = iVar.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((Number) next).intValue() != 0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getInstance(this.f61130d.f61120e + ((Number) it2.next()).intValue()));
            }
            Iterator it3 = kotlin.collections.x.F(arrayList2, y3.class).iterator();
            while (it3.hasNext()) {
                ((y3) it3.next()).customScrollTo(i11);
            }
        }
    }

    /* compiled from: SleepWeekPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<b> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            FragmentActivity activity = k4.this.getActivity();
            kotlin.jvm.internal.u.h(activity, "null cannot be cast to non-null type com.withings.wiscale2.sleep.ui.sleepscore.SleepWeekPagerFragment.Listener");
            return (b) activity;
        }
    }

    /* compiled from: SleepWeekPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<c> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final c invoke() {
            return new c(k4.this);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61133a = nm0.h.b(new l4(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61134b;

        public g(Fragment fragment) {
            this.f61134b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61133a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61135a = nm0.h.b(new m4(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61136b;

        public h(Fragment fragment) {
            this.f61136b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61135a.getValue();
        }
    }

    public static final DateTime t1(k4 k4Var) {
        return (DateTime) k4Var.f61123h.getValue(k4Var, f61117l[1]);
    }

    public static final void u1(k4 k4Var, int i11) {
        k4Var.f61120e = i11;
        b bVar = (b) k4Var.f61125j.getValue();
        d dVar = k4Var.f61124i;
        if (dVar != null) {
            DateTime date = dVar.getDate(i11);
            kotlin.jvm.internal.u.i(date, "getDate(...)");
            bVar.c3(k4Var, date);
            return;
        }
        kotlin.jvm.internal.u.s("weekPagerAdapter");
        throw null;
    }

    private final int v1() {
        DateTime currentDate = this.f61119d;
        kotlin.jvm.internal.u.i(currentDate, "currentDate");
        DateTime b10 = pm.d.b(currentDate);
        d dVar = this.f61124i;
        if (dVar != null) {
            DateTime theMostRecentWeek = dVar.getTheMostRecentWeek();
            kotlin.jvm.internal.u.i(theMostRecentWeek, "getTheMostRecentWeek(...)");
            int a11 = pm.d.a(b10, theMostRecentWeek) / 7;
            d dVar2 = this.f61124i;
            if (dVar2 != null) {
                return (dVar2.getCount() - 1) - a11;
            }
            kotlin.jvm.internal.u.s("weekPagerAdapter");
            throw null;
        }
        kotlin.jvm.internal.u.s("weekPagerAdapter");
        throw null;
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        BlockableViewPager blockableViewPager = this.f61118c;
        if (blockableViewPager != null) {
            blockableViewPager.setPagingEnabled(z5);
        } else {
            kotlin.jvm.internal.u.s("viewPager");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.y3.b
    public final void b1(y3 fragment, int i11) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        d dVar = this.f61124i;
        if (dVar != null) {
            dVar.setCurrentScroll(i11);
        } else {
            kotlin.jvm.internal.u.s("weekPagerAdapter");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.y3.b
    public final void l1(y3 fragment, DateTime day) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        kotlin.jvm.internal.u.j(day, "day");
        ((b) this.f61125j.getValue()).O(this, day);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        BlockableViewPager blockableViewPager = this.f61118c;
        if (blockableViewPager != null) {
            Context context = blockableViewPager.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.u.i(childFragmentManager, "getChildFragmentManager(...)");
            this.f61124i = new d(this, context, childFragmentManager, (User) this.f61122g.getValue(this, f61117l[0]));
            BlockableViewPager blockableViewPager2 = this.f61118c;
            if (blockableViewPager2 != null) {
                blockableViewPager2.setOffscreenPageLimit(2);
                BlockableViewPager blockableViewPager3 = this.f61118c;
                if (blockableViewPager3 != null) {
                    blockableViewPager3.setNestedScrollingEnabled(true);
                    this.f61120e = v1();
                    BlockableViewPager blockableViewPager4 = this.f61118c;
                    if (blockableViewPager4 != null) {
                        blockableViewPager4.c((c) this.f61121f.getValue());
                        BlockableViewPager blockableViewPager5 = this.f61118c;
                        if (blockableViewPager5 != null) {
                            d dVar = this.f61124i;
                            if (dVar != null) {
                                blockableViewPager5.setAdapter(dVar);
                                BlockableViewPager blockableViewPager6 = this.f61118c;
                                if (blockableViewPager6 != null) {
                                    blockableViewPager6.D(v1(), false);
                                    return;
                                } else {
                                    kotlin.jvm.internal.u.s("viewPager");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.u.s("weekPagerAdapter");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("viewPager");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("viewPager");
                    throw null;
                }
                kotlin.jvm.internal.u.s("viewPager");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewPager");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewPager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        Bundle a11 = yq.b.a(this);
        if (Build.VERSION.SDK_INT >= 33) {
            obj = a11.getSerializable("extra_date", DateTime.class);
        } else {
            Object serializable = a11.getSerializable("extra_date");
            if (!(serializable instanceof DateTime)) {
                serializable = null;
            }
            obj = (DateTime) serializable;
        }
        this.f61119d = (DateTime) obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_sleep_pager, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.view_pager);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f61118c = (BlockableViewPager) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.date_pager);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        DatePagerTitleStrip datePagerTitleStrip = (DatePagerTitleStrip) findViewById2;
    }
}

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
import com.withings.wiscale2.sleep.ui.sleepscore.h2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.joda.time.DateTime;
import qw.a;
/* compiled from: SleepMonthPagerFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/n2;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/h2$b;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class n2 extends Fragment implements BlockableViewPager.b, h2.b {

    /* renamed from: c  reason: collision with root package name */
    private BlockableViewPager f61159c;

    /* renamed from: e  reason: collision with root package name */
    private int f61161e;

    /* renamed from: i  reason: collision with root package name */
    private d f61165i;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61158l = {androidx.camera.core.v.c(n2.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f61157k = new Object();

    /* renamed from: d  reason: collision with root package name */
    private DateTime f61160d = DateTime.now();

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61162f = nm0.h.b(new g());

    /* renamed from: g  reason: collision with root package name */
    private final h f61163g = new h(this);

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61164h = nm0.h.b(new e());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f61166j = nm0.h.b(new f());

    /* compiled from: SleepMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void f0(n2 n2Var, DateTime dateTime);

        void y2(n2 n2Var, DateTime dateTime);
    }

    /* compiled from: SleepMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    private static final class c extends ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        private final n2 f61167a;

        public c(n2 fragment) {
            kotlin.jvm.internal.u.j(fragment, "fragment");
            this.f61167a = fragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void onPageSelected(int i11) {
            n2.u1(this.f61167a, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SleepMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    public final class d extends ry.o implements a.b {

        /* renamed from: c  reason: collision with root package name */
        private final Context f61168c;

        /* renamed from: d  reason: collision with root package name */
        private final User f61169d;

        /* renamed from: e  reason: collision with root package name */
        private int f61170e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n2 f61171f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(com.withings.wiscale2.sleep.ui.sleepscore.n2 r3, android.content.Context r4, androidx.fragment.app.FragmentManager r5, com.withings.user.core.models.User r6) {
            /*
                r2 = this;
                java.lang.String r0 = "user"
                kotlin.jvm.internal.u.j(r6, r0)
                r2.f61171f = r3
                org.joda.time.DateTime r3 = com.withings.wiscale2.sleep.ui.sleepscore.n2.t1(r3)
                org.joda.time.DateTime r0 = org.joda.time.DateTime.now()
                java.lang.String r1 = "now(...)"
                kotlin.jvm.internal.u.i(r0, r1)
                r2.<init>(r5, r3, r0)
                r2.f61168c = r4
                r2.f61169d = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.n2.d.<init>(com.withings.wiscale2.sleep.ui.sleepscore.n2, android.content.Context, androidx.fragment.app.FragmentManager, com.withings.user.core.models.User):void");
        }

        @Override // ry.o
        public final Fragment getFragment(DateTime dateTime) {
            h2.a aVar = h2.f60985u;
            int i11 = this.f61170e;
            aVar.getClass();
            User user = this.f61169d;
            kotlin.jvm.internal.u.j(user, "user");
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_user", user);
            bundle.putSerializable("extra_day", dateTime);
            bundle.putInt("extra_current_scroll", i11);
            h2 h2Var = new h2();
            h2Var.setArguments(bundle);
            return h2Var;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            return b50.b.n(this.f61168c, a(i11));
        }

        @Override // qw.a.b
        public final void onLoaded(DateTime start, DateTime end) {
            kotlin.jvm.internal.u.j(start, "start");
            kotlin.jvm.internal.u.j(end, "end");
        }

        @Override // com.withings.measure.detail.paged.g
        public final void setCurrentScroll(int i11) {
            this.f61170e = i11;
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
                arrayList2.add(getInstance(this.f61171f.f61161e + ((Number) it2.next()).intValue()));
            }
            Iterator it3 = kotlin.collections.x.F(arrayList2, h2.class).iterator();
            while (it3.hasNext()) {
                ((h2) it3.next()).customScrollTo(i11);
            }
        }
    }

    /* compiled from: SleepMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<DateTime> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final DateTime invoke() {
            Object obj;
            Bundle a11 = yq.b.a(n2.this);
            if (Build.VERSION.SDK_INT >= 33) {
                obj = a11.getSerializable("EXTRA_FIRST_TRACK_EVER", DateTime.class);
            } else {
                Serializable serializable = a11.getSerializable("EXTRA_FIRST_TRACK_EVER");
                if (!(serializable instanceof DateTime)) {
                    serializable = null;
                }
                obj = (DateTime) serializable;
            }
            kotlin.jvm.internal.u.g(obj);
            return (DateTime) obj;
        }
    }

    /* compiled from: SleepMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<b> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            FragmentActivity activity = n2.this.getActivity();
            kotlin.jvm.internal.u.h(activity, "null cannot be cast to non-null type com.withings.wiscale2.sleep.ui.sleepscore.SleepMonthPagerFragment.Listener");
            return (b) activity;
        }
    }

    /* compiled from: SleepMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<c> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final c invoke() {
            return new c(n2.this);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61175a = nm0.h.b(new p2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61176b;

        public h(Fragment fragment) {
            this.f61176b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61175a.getValue();
        }
    }

    public static final DateTime t1(n2 n2Var) {
        return (DateTime) n2Var.f61164h.getValue();
    }

    public static final void u1(n2 n2Var, int i11) {
        n2Var.f61161e = i11;
        b bVar = (b) n2Var.f61166j.getValue();
        d dVar = n2Var.f61165i;
        if (dVar != null) {
            bVar.f0(n2Var, dVar.a(i11));
        } else {
            kotlin.jvm.internal.u.s("monthPagerAdapter");
            throw null;
        }
    }

    private final int v1() {
        DateTime currentDate = this.f61160d;
        kotlin.jvm.internal.u.i(currentDate, "currentDate");
        d dVar = this.f61165i;
        if (dVar != null) {
            int i11 = hn.a.i(currentDate, dVar.b());
            d dVar2 = this.f61165i;
            if (dVar2 != null) {
                return (dVar2.getCount() - 1) - i11;
            }
            kotlin.jvm.internal.u.s("monthPagerAdapter");
            throw null;
        }
        kotlin.jvm.internal.u.s("monthPagerAdapter");
        throw null;
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        BlockableViewPager blockableViewPager = this.f61159c;
        if (blockableViewPager != null) {
            blockableViewPager.setPagingEnabled(z5);
        } else {
            kotlin.jvm.internal.u.s("viewPager");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.h2.b
    public final void S0(h2 fragment, DateTime day) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        kotlin.jvm.internal.u.j(day, "day");
        ((b) this.f61166j.getValue()).y2(this, day);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.h2.b
    public final void m1(h2 fragment, int i11) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        d dVar = this.f61165i;
        if (dVar != null) {
            dVar.setCurrentScroll(i11);
        } else {
            kotlin.jvm.internal.u.s("monthPagerAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        BlockableViewPager blockableViewPager = this.f61159c;
        if (blockableViewPager != null) {
            Context context = blockableViewPager.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.u.i(childFragmentManager, "getChildFragmentManager(...)");
            this.f61165i = new d(this, context, childFragmentManager, (User) this.f61163g.getValue(this, f61158l[0]));
            BlockableViewPager blockableViewPager2 = this.f61159c;
            if (blockableViewPager2 != null) {
                blockableViewPager2.setOffscreenPageLimit(2);
                BlockableViewPager blockableViewPager3 = this.f61159c;
                if (blockableViewPager3 != null) {
                    blockableViewPager3.setNestedScrollingEnabled(true);
                    this.f61161e = v1();
                    BlockableViewPager blockableViewPager4 = this.f61159c;
                    if (blockableViewPager4 != null) {
                        blockableViewPager4.c((c) this.f61162f.getValue());
                        BlockableViewPager blockableViewPager5 = this.f61159c;
                        if (blockableViewPager5 != null) {
                            d dVar = this.f61165i;
                            if (dVar != null) {
                                blockableViewPager5.setAdapter(dVar);
                                BlockableViewPager blockableViewPager6 = this.f61159c;
                                if (blockableViewPager6 != null) {
                                    blockableViewPager6.D(v1(), false);
                                    return;
                                } else {
                                    kotlin.jvm.internal.u.s("viewPager");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.u.s("monthPagerAdapter");
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
            obj = a11.getSerializable("EXTRA_DATE", DateTime.class);
        } else {
            Serializable serializable = a11.getSerializable("EXTRA_DATE");
            if (!(serializable instanceof DateTime)) {
                serializable = null;
            }
            obj = (DateTime) serializable;
        }
        kotlin.jvm.internal.u.g(obj);
        this.f61160d = (DateTime) obj;
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
        this.f61159c = (BlockableViewPager) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.date_pager);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        DatePagerTitleStrip datePagerTitleStrip = (DatePagerTitleStrip) findViewById2;
    }
}

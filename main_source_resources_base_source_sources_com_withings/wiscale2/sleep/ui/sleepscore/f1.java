package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.util.log.Fail;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.k0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
import qw.a;
/* compiled from: SleepDayPagerFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/f1;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/k0$b;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class f1 extends com.withings.wiscale2.sleep.ui.sleepscore.e implements BlockableViewPager.b, k0.b {
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ei0.d0 f60944h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public ei0.b0 f60945i;

    /* renamed from: l  reason: collision with root package name */
    private int f60948l;

    /* renamed from: n  reason: collision with root package name */
    private qw.a f60950n;

    /* renamed from: q  reason: collision with root package name */
    private b f60953q;

    /* renamed from: s  reason: collision with root package name */
    private k0 f60955s;

    /* renamed from: u  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60943u = {androidx.camera.core.v.c(f1.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentSleepPagerBinding;", 0), androidx.camera.core.v.c(f1.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(f1.class, "firstTrackDateEver", "getFirstTrackDateEver()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: t  reason: collision with root package name */
    public static final a f60942t = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final LifecycleViewBindingProperty f60946j = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: k  reason: collision with root package name */
    private DateTime f60947k = DateTime.now();

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f60949m = nm0.h.b(new f());

    /* renamed from: o  reason: collision with root package name */
    private final g f60951o = new g(this);

    /* renamed from: p  reason: collision with root package name */
    private final h f60952p = new h(this);

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f60954r = nm0.h.b(new e());

    /* compiled from: SleepDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SleepDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    public final class b extends qy.a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f60956a;

        /* renamed from: b  reason: collision with root package name */
        private final User f60957b;

        /* renamed from: c  reason: collision with root package name */
        private int f60958c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f1 f60959d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f1 f1Var, Context context, FragmentManager fragmentManager, User user) {
            super(fragmentManager, f1.u1(f1Var), DateTime.now());
            kotlin.jvm.internal.u.j(user, "user");
            this.f60959d = f1Var;
            this.f60956a = context;
            this.f60957b = user;
        }

        @Override // qy.a
        public final Fragment getFragment(DateTime day) {
            kotlin.jvm.internal.u.j(day, "day");
            k0.a aVar = k0.f61064w0;
            int i11 = this.f60958c;
            aVar.getClass();
            User user = this.f60957b;
            kotlin.jvm.internal.u.j(user, "user");
            k0 k0Var = new k0();
            k0Var.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_USER", user), new nm0.j("EXTRA_DAY", day), new nm0.j("EXTRA_CURRENT_SCROLL", Integer.valueOf(i11))));
            DateTime dateTime = this.f60959d.f60947k;
            kotlin.jvm.internal.u.i(dateTime, "access$getCurrentDate$p(...)");
            if (hn.a.e(day, dateTime)) {
                k0Var.V1(true);
            }
            return k0Var;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            DateTime date = getDate(i11);
            kotlin.jvm.internal.u.i(date, "getDate(...)");
            Context context = this.f60956a;
            kotlin.jvm.internal.u.j(context, "context");
            DateTime withTimeAtStartOfDay = date.withTimeAtStartOfDay();
            if (date.isAfterNow()) {
                Fail.j("Date parameter is after now !: " + date);
                String abstractDateTime = date.toString(context.getString(C1987R.string._DATE_MMM_D_YYYY_));
                kotlin.jvm.internal.u.g(abstractDateTime);
                return abstractDateTime;
            } else if (kotlin.jvm.internal.u.e(DateTime.now().withTimeAtStartOfDay(), withTimeAtStartOfDay)) {
                String string = context.getString(C1987R.string._LAST_NIGHT_);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                return string;
            } else if (date.getYear() == DateTime.now().withTimeAtStartOfDay().getYear()) {
                String abstractDateTime2 = date.toString(context.getString(C1987R.string._DATE_EEE_MMM_D_));
                kotlin.jvm.internal.u.i(abstractDateTime2, "toString(...)");
                if (abstractDateTime2.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) dp0.a.d(abstractDateTime2.charAt(0)));
                    String substring = abstractDateTime2.substring(1);
                    kotlin.jvm.internal.u.i(substring, "substring(...)");
                    sb2.append(substring);
                    return sb2.toString();
                }
                return abstractDateTime2;
            } else {
                String string2 = context.getString(C1987R.string._DATE_EEE_MMM_D_);
                String abstractDateTime3 = date.toString(string2 + " yyyy");
                kotlin.jvm.internal.u.i(abstractDateTime3, "toString(...)");
                if (abstractDateTime3.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((Object) dp0.a.d(abstractDateTime3.charAt(0)));
                    String substring2 = abstractDateTime3.substring(1);
                    kotlin.jvm.internal.u.i(substring2, "substring(...)");
                    sb3.append(substring2);
                    return sb3.toString();
                }
                return abstractDateTime3;
            }
        }

        @Override // qw.a.b
        public final void onLoaded(DateTime start, DateTime end) {
            en0.n nVar;
            kotlin.jvm.internal.u.j(start, "start");
            kotlin.jvm.internal.u.j(end, "end");
            f1 f1Var = this.f60959d;
            if (f1Var.getActivity() != null && f1Var.isAdded()) {
                long millis = start.getMillis();
                long g11 = en0.r.g(getTheMaxDateTime().getMillis(), end.getMillis());
                if (g11 <= Long.MIN_VALUE) {
                    nVar = en0.n.f65806d;
                } else {
                    nVar = new en0.n(millis, g11 - 1);
                }
                Iterator<Long> it = en0.r.v(nVar, 86400000L).iterator();
                while (((en0.m) it).hasNext()) {
                    k0 z12 = f1Var.z1(new DateTime(((kotlin.collections.q0) it).a()));
                    if (z12 != null) {
                        z12.T1();
                    }
                }
            }
        }

        @Override // com.withings.measure.detail.paged.g
        public final void setCurrentScroll(int i11) {
            Object obj;
            this.f60958c = i11;
            f1 f1Var = this.f60959d;
            List<Fragment> f02 = f1Var.getChildFragmentManager().f0();
            kotlin.jvm.internal.u.i(f02, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : f02) {
                if (obj2 instanceof k0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((k0) next).isVisible()) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Bundle a11 = yq.b.a((k0) next2);
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = a11.getSerializable("EXTRA_DAY", DateTime.class);
                } else {
                    Serializable serializable = a11.getSerializable("EXTRA_DAY");
                    if (!(serializable instanceof DateTime)) {
                        serializable = null;
                    }
                    obj = (DateTime) serializable;
                }
                kotlin.jvm.internal.u.g(obj);
                if (getPosition((DateTime) obj) != f1Var.f60948l) {
                    arrayList3.add(next2);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((k0) it3.next()).customScrollTo(i11);
            }
        }
    }

    /* compiled from: SleepDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    public interface c {
        void F1(f1 f1Var, DateTime dateTime);

        void K2(f1 f1Var);

        void V1(f1 f1Var, DateTime dateTime);

        void i1(f1 f1Var);
    }

    /* compiled from: SleepDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<c> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final c invoke() {
            FragmentActivity activity = f1.this.getActivity();
            kotlin.jvm.internal.u.h(activity, "null cannot be cast to non-null type com.withings.wiscale2.sleep.ui.sleepscore.SleepDayPagerFragment.Listener");
            return (c) activity;
        }
    }

    /* compiled from: SleepDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<d> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final d invoke() {
            return new d(f1.this);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60963a = nm0.h.b(new g1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f60964b;

        public g(Fragment fragment) {
            this.f60964b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60963a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60965a = nm0.h.b(new h1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f60966b;

        public h(Fragment fragment) {
            this.f60966b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60965a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.l<f1, tb0.b3> {
        @Override // ym0.l
        public final tb0.b3 invoke(f1 f1Var) {
            f1 fragment = f1Var;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return tb0.b3.a(fragment.requireView());
        }
    }

    public static final DateTime u1(f1 f1Var) {
        return (DateTime) f1Var.f60952p.getValue(f1Var, f60943u[2]);
    }

    public static final void v1(f1 f1Var, int i11) {
        f1Var.f60948l = i11;
        qw.a aVar = f1Var.f60950n;
        if (aVar != null) {
            aVar.k(i11);
        }
        b bVar = f1Var.f60953q;
        if (bVar != null) {
            f1Var.f60947k = bVar.getDate(i11);
            DateTime currentDate = f1Var.f60947k;
            kotlin.jvm.internal.u.i(currentDate, "currentDate");
            ((c) f1Var.f60954r.getValue()).V1(f1Var, currentDate);
            b bVar2 = f1Var.f60953q;
            if (bVar2 != null) {
                DateTime date = bVar2.getDate(i11);
                kotlin.jvm.internal.u.i(date, "getDate(...)");
                k0 z12 = f1Var.z1(date);
                if (z12 != null) {
                    z12.V1(true);
                }
                k0 k0Var = f1Var.f60955s;
                if (k0Var != null) {
                    k0Var.V1(false);
                }
                f1Var.f60955s = z12;
                return;
            }
            kotlin.jvm.internal.u.s("dayPagerAdapter");
            throw null;
        }
        kotlin.jvm.internal.u.s("dayPagerAdapter");
        throw null;
    }

    private final tb0.b3 x1() {
        return (tb0.b3) this.f60946j.getValue(this, f60943u[0]);
    }

    private final int y1() {
        DateTime currentDate = this.f60947k;
        kotlin.jvm.internal.u.i(currentDate, "currentDate");
        b bVar = this.f60953q;
        if (bVar != null) {
            DateTime theMaxDateTime = bVar.getTheMaxDateTime();
            kotlin.jvm.internal.u.i(theMaxDateTime, "getTheMaxDateTime(...)");
            int a11 = pm.d.a(currentDate, theMaxDateTime);
            b bVar2 = this.f60953q;
            if (bVar2 != null) {
                return (bVar2.getCount() - 1) - a11;
            }
            kotlin.jvm.internal.u.s("dayPagerAdapter");
            throw null;
        }
        kotlin.jvm.internal.u.s("dayPagerAdapter");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 z1(DateTime dateTime) {
        f1 f1Var;
        Object obj;
        Object obj2 = null;
        if (isVisible()) {
            f1Var = this;
        } else {
            f1Var = null;
        }
        if (f1Var == null) {
            return null;
        }
        List<Fragment> f02 = getChildFragmentManager().f0();
        kotlin.jvm.internal.u.i(f02, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : f02) {
            if (obj3 instanceof k0) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k0) next).isVisible()) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            Bundle a11 = yq.b.a((k0) next2);
            if (Build.VERSION.SDK_INT >= 33) {
                obj = a11.getSerializable("EXTRA_DAY", DateTime.class);
            } else {
                Serializable serializable = a11.getSerializable("EXTRA_DAY");
                if (!(serializable instanceof DateTime)) {
                    serializable = null;
                }
                obj = (DateTime) serializable;
            }
            if (kotlin.jvm.internal.u.e(obj, dateTime)) {
                obj2 = next2;
                break;
            }
        }
        return (k0) obj2;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.k0.b
    public final void A0(k0 fragment) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        ((c) this.f60954r.getValue()).i1(this);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.k0.b
    public final void F(k0 fragment, DateTime dateTime) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        ((c) this.f60954r.getValue()).F1(this, dateTime);
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        x1().f98881a.setPagingEnabled(z5);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.k0.b
    public final void W(k0 fragment) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        ((c) this.f60954r.getValue()).K2(this);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.k0.b
    public final void g1(k0 fragment, DateTime trackDate) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        kotlin.jvm.internal.u.j(trackDate, "trackDate");
        qw.a aVar = this.f60950n;
        if (aVar != null) {
            boolean l5 = aVar.l(trackDate);
            fragment.W1(l5);
            if (!l5) {
                fragment.a2();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        Bundle a11 = yq.b.a(this);
        if (Build.VERSION.SDK_INT >= 33) {
            obj = a11.getSerializable("extra_date", DateTime.class);
        } else {
            Serializable serializable = a11.getSerializable("extra_date");
            if (!(serializable instanceof DateTime)) {
                serializable = null;
            }
            obj = (DateTime) serializable;
        }
        kotlin.jvm.internal.u.g(obj);
        this.f60947k = (DateTime) obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        qw.a aVar = this.f60950n;
        if (aVar != null) {
            aVar.q();
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        qw.a aVar = this.f60950n;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.u.i(childFragmentManager, "getChildFragmentManager(...)");
        fn0.k<Object>[] kVarArr = f60943u;
        fn0.k<Object> kVar = kVarArr[1];
        g gVar = this.f60951o;
        this.f60953q = new b(this, requireContext, childFragmentManager, (User) gVar.getValue(this, kVar));
        x1().f98881a.setOffscreenPageLimit(2);
        x1().f98881a.setNestedScrollingEnabled(true);
        ui.b bVar = new ui.b(requireContext());
        ei0.b0 b0Var = this.f60945i;
        if (b0Var != null) {
            ei0.a0 a11 = b0Var.a((User) gVar.getValue(this, kVarArr[1]));
            ei0.d0 d0Var = this.f60944h;
            if (d0Var != null) {
                ei0.c0 a12 = d0Var.a((User) gVar.getValue(this, kVarArr[1]));
                b bVar2 = this.f60953q;
                if (bVar2 != null) {
                    qw.a aVar = new qw.a(bVar, new ei0.g(a11, a12, bVar2), 1, DateTime.now(), 7);
                    b bVar3 = this.f60953q;
                    if (bVar3 != null) {
                        aVar.o(bVar3);
                        aVar.p();
                        this.f60950n = aVar;
                        this.f60948l = y1();
                        BlockableViewPager blockableViewPager = x1().f98881a;
                        nm0.g gVar2 = this.f60949m;
                        blockableViewPager.A((d) gVar2.getValue());
                        blockableViewPager.c((d) gVar2.getValue());
                        b bVar4 = this.f60953q;
                        if (bVar4 != null) {
                            blockableViewPager.setAdapter(bVar4);
                            blockableViewPager.D(this.f60948l, false);
                            qw.a aVar2 = this.f60950n;
                            if (aVar2 != null) {
                                aVar2.k(y1());
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.u.s("dayPagerAdapter");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("dayPagerAdapter");
                    throw null;
                }
                kotlin.jvm.internal.u.s("dayPagerAdapter");
                throw null;
            }
            kotlin.jvm.internal.u.s("wsdSleepDayDownloadDelegateFactory");
            throw null;
        }
        kotlin.jvm.internal.u.s("trackerSleepDayDownloadDelegateFactory");
        throw null;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.k0.b
    public final void t0(k0 fragment, int i11) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        b bVar = this.f60953q;
        if (bVar != null) {
            bVar.setCurrentScroll(i11);
        } else {
            kotlin.jvm.internal.u.s("dayPagerAdapter");
            throw null;
        }
    }

    /* compiled from: SleepDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    private final class d implements ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        private final f1 f60960a;

        public d(f1 sleepDayPagerFragment) {
            kotlin.jvm.internal.u.j(sleepDayPagerFragment, "sleepDayPagerFragment");
            this.f60960a = sleepDayPagerFragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void onPageSelected(int i11) {
            f1.v1(this.f60960a, i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void onPageScrolled(int i11, float f11, int i12) {
        }
    }
}

package com.withings.wiscale2.heart.afib;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.user.User;
import com.withings.wiscale2.heart.afib.y;
import com.withings.wiscale2.sleep.ui.sleepscore.h2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Months;
/* compiled from: AFibMonthPagerFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/heart/afib/f0;", "Lcom/withings/measure/detail/paged/d;", "Lcom/withings/wiscale2/heart/afib/y$b;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class f0 extends com.withings.measure.detail.paged.d implements y.b {

    /* renamed from: l  reason: collision with root package name */
    private final d f57147l = new d(this);

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f57148m = nm0.h.b(new c());

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57146o = {androidx.camera.core.v.c(f0.class, "isMedical", "isMedical()Z", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f57145n = new Object();

    /* compiled from: AFibMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: AFibMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    private final class b extends ry.o {

        /* renamed from: c  reason: collision with root package name */
        private final User f57149c;

        /* renamed from: d  reason: collision with root package name */
        private int f57150d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f0 f57151e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(com.withings.wiscale2.heart.afib.f0 r3, com.withings.user.User r4, androidx.fragment.app.FragmentManager r5) {
            /*
                r2 = this;
                java.lang.String r0 = "user"
                kotlin.jvm.internal.u.j(r4, r0)
                r2.f57151e = r3
                org.joda.time.DateTime r3 = com.withings.wiscale2.heart.afib.f0.y1(r3)
                org.joda.time.DateTime r0 = org.joda.time.DateTime.now()
                java.lang.String r1 = "now(...)"
                kotlin.jvm.internal.u.i(r0, r1)
                r2.<init>(r5, r3, r0)
                r2.f57149c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.f0.b.<init>(com.withings.wiscale2.heart.afib.f0, com.withings.user.User, androidx.fragment.app.FragmentManager):void");
        }

        @Override // ry.o
        public final Fragment getFragment(DateTime dateTime) {
            y.a aVar = y.f57274r;
            int i11 = this.f57150d;
            boolean A1 = f0.A1(this.f57151e);
            aVar.getClass();
            User user = this.f57149c;
            kotlin.jvm.internal.u.j(user, "user");
            y yVar = new y();
            yVar.setArguments(androidx.core.os.e.a(new nm0.j("extra_user", user), new nm0.j("extra_day", dateTime), new nm0.j("extra_current_scroll", Integer.valueOf(i11)), new nm0.j("extra_isMedical", Boolean.valueOf(A1))));
            return yVar;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            DateTime a11 = a(i11);
            Context requireContext = this.f57151e.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            return b50.b.n(requireContext, a11);
        }

        @Override // com.withings.measure.detail.paged.g
        public final void setCurrentScroll(int i11) {
            this.f57150d = i11;
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
                arrayList2.add(getInstance(this.f57151e.v1() + ((Number) it2.next()).intValue()));
            }
            Iterator it3 = kotlin.collections.x.F(arrayList2, h2.class).iterator();
            while (it3.hasNext()) {
                ((h2) it3.next()).customScrollTo(i11);
            }
        }
    }

    /* compiled from: AFibMonthPagerFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<b> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            f0 f0Var = f0.this;
            User user = f0Var.getUser();
            FragmentManager childFragmentManager = f0Var.getChildFragmentManager();
            kotlin.jvm.internal.u.i(childFragmentManager, "getChildFragmentManager(...)");
            return new b(f0Var, user, childFragmentManager);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57153a = nm0.h.b(new g0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57154b;

        public d(Fragment fragment) {
            this.f57154b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57153a.getValue();
        }
    }

    public static final boolean A1(f0 f0Var) {
        return ((Boolean) f0Var.f57147l.getValue(f0Var, f57146o[0])).booleanValue();
    }

    @Override // com.withings.wiscale2.heart.afib.y.b
    public final void T0(y fragment, int i11) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        x1().setCurrentScroll(i11);
    }

    @Override // com.withings.measure.detail.paged.d
    public final int u1() {
        LocalDate localDate = t1().withDayOfMonth(1).toLocalDate();
        com.withings.measure.detail.paged.g x12 = x1();
        kotlin.jvm.internal.u.h(x12, "null cannot be cast to non-null type com.withings.wiscale2.heart.afib.AFibMonthPagerFragment.MonthPagerAdapter");
        return (x1().getCount() - 1) - Months.monthsBetween(localDate, ((b) x12).b().toLocalDate()).getMonths();
    }

    @Override // com.withings.measure.detail.paged.d
    public final com.withings.measure.detail.paged.g x1() {
        return (com.withings.measure.detail.paged.g) this.f57148m.getValue();
    }
}

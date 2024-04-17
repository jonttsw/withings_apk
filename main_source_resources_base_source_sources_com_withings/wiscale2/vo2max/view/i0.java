package com.withings.wiscale2.vo2max.view;

import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import java.util.ArrayList;
import m80.a;
import org.joda.time.DateTime;
import org.joda.time.Years;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class i0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MeasuresGroup f62749a;

    /* renamed from: b  reason: collision with root package name */
    private final User f62750b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62751c;

    /* renamed from: d  reason: collision with root package name */
    private int f62752d;

    /* renamed from: e  reason: collision with root package name */
    private int f62753e;

    /* renamed from: f  reason: collision with root package name */
    private int f62754f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.m<User> f62755g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f62756h;

    /* renamed from: i  reason: collision with root package name */
    private final xw.m<com.withings.wiscale2.vo2max.view.a> f62757i;

    /* renamed from: j  reason: collision with root package name */
    private final xw.m<Integer> f62758j;

    /* renamed from: k  reason: collision with root package name */
    private final xw.m<d> f62759k;

    /* compiled from: Vo2MaxComparison.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            int years;
            i0 i0Var = i0.this;
            DateTime f11 = i0Var.getUser().f();
            kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
            DateTime dateTime = new DateTime(i0Var.i0().getDate());
            if (f11.isAfter(dateTime)) {
                years = 0;
            } else {
                years = Years.yearsBetween(f11, dateTime).getYears();
            }
            return Integer.valueOf(years);
        }
    }

    public i0(MeasuresGroup measureGroup, User user) {
        boolean z5;
        kotlin.jvm.internal.u.j(measureGroup, "measureGroup");
        kotlin.jvm.internal.u.j(user, "user");
        this.f62749a = measureGroup;
        this.f62750b = user;
        this.f62753e = -1;
        xw.m<User> mVar = new xw.m<>();
        mVar.setValue(user);
        this.f62755g = mVar;
        nm0.g b10 = nm0.h.b(new a());
        this.f62756h = b10;
        xw.m<com.withings.wiscale2.vo2max.view.a> mVar2 = new xw.m<>();
        this.f62757i = mVar2;
        this.f62758j = new xw.m<>();
        this.f62759k = new xw.m<>();
        int a11 = an0.a.a(measureGroup.getMeasureForType(123).f95794y);
        this.f62752d = a11;
        if (user.p() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i11 = m80.a.f81744h;
        mVar2.setValue(new com.withings.wiscale2.vo2max.view.a(a.C1293a.e(((Number) b10.getValue()).intValue(), a11, z5), z5));
    }

    public final xw.m<d> f0() {
        return this.f62759k;
    }

    public final xw.m<com.withings.wiscale2.vo2max.view.a> g0() {
        return this.f62757i;
    }

    public final User getUser() {
        return this.f62750b;
    }

    public final MeasuresGroup i0() {
        return this.f62749a;
    }

    public final xw.m<User> j0() {
        return this.f62755g;
    }

    public final xw.m<Integer> k0() {
        return this.f62758j;
    }

    public final void m0(int i11) {
        boolean z5;
        String str;
        boolean z11;
        ArrayList arrayList;
        if (this.f62750b.p() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i12 = m80.a.f81744h;
        String[] c11 = a.C1293a.c(z5);
        if (i11 >= c11.length) {
            arrayList = m80.a.f81743g;
            str = ((a.c[]) arrayList.toArray(new a.c[0]))[i11 - c11.length].c();
        } else {
            str = c11[i11];
        }
        int parseInt = Integer.parseInt(str);
        int a11 = an0.a.a(this.f62749a.getMeasureForType(123).f95794y);
        int i13 = this.f62754f;
        boolean z12 = this.f62751c;
        if (this.f62753e > i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f62759k.setValue(new d(a11, parseInt, i13, z5, i11, z12, z11));
        this.f62753e = i11;
        this.f62754f = parseInt;
    }

    public final void p0(boolean z5) {
        if (z5 && !this.f62751c) {
            this.f62751c = z5;
            this.f62758j.setValue(Integer.valueOf(this.f62752d));
            int i11 = m80.a.f81744h;
            m0(a.C1293a.a(((Number) this.f62756h.getValue()).intValue()));
        }
    }
}

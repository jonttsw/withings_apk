package com.withings.medicalreport.ui;

import android.app.Application;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.wiscale2.C1987R;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.ReadableInstant;
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
public final class u extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f42273a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f42274b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f42275c;

    /* renamed from: d  reason: collision with root package name */
    private final k0<Integer> f42276d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.f f42277e;

    /* renamed from: f  reason: collision with root package name */
    private final xw.f f42278f;

    /* renamed from: g  reason: collision with root package name */
    private final j0 f42279g;

    /* renamed from: h  reason: collision with root package name */
    private final xw.n<nm0.y> f42280h;

    /* renamed from: i  reason: collision with root package name */
    private final j0 f42281i;

    /* renamed from: j  reason: collision with root package name */
    private final j0 f42282j;

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f42283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Application application) {
            super(0);
            this.f42283a = application;
        }

        @Override // ym0.a
        public final String invoke() {
            return this.f42283a.getApplicationContext().getString(C1987R.string._DATE_MMM_D_);
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f42284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Application application) {
            super(0);
            this.f42284a = application;
        }

        @Override // ym0.a
        public final String invoke() {
            return this.f42284a.getApplicationContext().getString(C1987R.string._DATE_MMM_D_YYYY_);
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Integer, List<com.withings.common.compose.component.e0>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f42286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Application application) {
            super(1);
            this.f42286b = application;
        }

        @Override // ym0.l
        public final List<com.withings.common.compose.component.e0> invoke(Integer num) {
            u uVar = u.this;
            com.withings.common.compose.component.e0 i02 = u.i0(uVar);
            com.withings.common.compose.component.e0 f02 = u.f0(uVar);
            Application application = this.f42286b;
            String string = application.getApplicationContext().getString(C1987R.string.profile_medicalReport_timeFrame_custom);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            return kotlin.collections.x.W(i02, f02, new com.withings.common.compose.component.e0(string, application.getApplicationContext().getString(C1987R.string.profile_medicalReport_timeFrame_custom_description), 2, null, null, 24));
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Integer, DateTime> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final DateTime invoke(Integer num) {
            Integer num2 = num;
            if (num2 == null || num2.intValue() != 2) {
                return u.this.m0();
            }
            return null;
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f42288a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(Integer num) {
            boolean z5;
            Integer num2 = num;
            if (num2 != null && num2.intValue() == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f42289a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final DateTime invoke() {
            return DateTime.now().withTimeAtStartOfDay();
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<nm0.j<DateTime, DateTime>, nm0.j<DateTime, DateTime>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f42290a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.j<DateTime, DateTime> invoke(nm0.j<DateTime, DateTime> jVar) {
            return jVar;
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<nm0.j<DateTime, DateTime>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f42291a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(nm0.j<DateTime, DateTime> jVar) {
            nm0.j<DateTime, DateTime> jVar2 = jVar;
            DateTime a11 = jVar2.a();
            DateTime b10 = jVar2.b();
            if (a11 == null || b10 == null) {
                return null;
            }
            boolean z5 = false;
            if (!hn.a.f(a11, b10)) {
                if (new Duration(a11, b10).getStandardDays() > a11.dayOfMonth().getMaximumValue()) {
                    z5 = true;
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.l<Integer, DateTime> {
        i() {
            super(1);
        }

        @Override // ym0.l
        public final DateTime invoke(Integer num) {
            Integer num2 = num;
            u uVar = u.this;
            if (num2 != null && num2.intValue() == 0) {
                return uVar.m0().minusMonths(1);
            }
            if (num2 != null && num2.intValue() == 1) {
                return uVar.m0().minusMonths(3);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Application app) {
        super(app);
        kotlin.jvm.internal.u.j(app, "app");
        this.f42273a = nm0.h.b(new a(app));
        this.f42274b = nm0.h.b(new b(app));
        this.f42275c = nm0.h.b(f.f42289a);
        k0<Integer> b10 = xw.d.b(0);
        this.f42276d = b10;
        xw.f f11 = xw.d.f(e1.b(b10, new i()));
        this.f42277e = f11;
        xw.f f12 = xw.d.f(e1.b(b10, new d()));
        this.f42278f = f12;
        this.f42279g = e1.b(xw.a.d(new nm0.j(f11, f12)), h.f42291a);
        this.f42280h = new xw.n<>();
        this.f42281i = e1.b(b10, new c(app));
        this.f42282j = e1.b(xw.a.b(new nm0.j(f11, f12)), g.f42290a);
        e1.b(b10, e.f42288a);
    }

    public static final com.withings.common.compose.component.e0 f0(u uVar) {
        String str;
        DateTime minusMonths = uVar.m0().minusMonths(3);
        nm0.g gVar = uVar.f42274b;
        if (minusMonths != null && minusMonths.getYear() == uVar.m0().getYear()) {
            str = (String) uVar.f42273a.getValue();
        } else {
            str = (String) gVar.getValue();
        }
        String abstractDateTime = minusMonths.toString(str);
        String abstractDateTime2 = uVar.m0().toString((String) gVar.getValue());
        String string = uVar.getApplication().getString(C1987R.string.profile_medicalReport_timeFrame_lastQuarter);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return new com.withings.common.compose.component.e0(string, w6.o.a(abstractDateTime, " - ", abstractDateTime2), 1, null, null, 24);
    }

    public static final com.withings.common.compose.component.e0 i0(u uVar) {
        String str;
        DateTime minusMonths = uVar.m0().minusMonths(1);
        nm0.g gVar = uVar.f42274b;
        if (minusMonths != null && minusMonths.getYear() == uVar.m0().getYear()) {
            str = (String) uVar.f42273a.getValue();
        } else {
            str = (String) gVar.getValue();
        }
        String abstractDateTime = minusMonths.toString(str);
        String abstractDateTime2 = uVar.m0().toString((String) gVar.getValue());
        String string = uVar.getApplication().getString(C1987R.string.profile_medicalReport_timeFrame_lastMonth);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return new com.withings.common.compose.component.e0(string, w6.o.a(abstractDateTime, " - ", abstractDateTime2), 0, null, null, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DateTime m0() {
        return (DateTime) this.f42275c.getValue();
    }

    public final void A0(DateTime dateTime) {
        DateTime dateTime2;
        this.f42278f.setValue(dateTime);
        xw.f fVar = this.f42277e;
        if (fVar.getValue() != null) {
            DateTime dateTime3 = (DateTime) fVar.getValue();
            if (dateTime3 != null) {
                dateTime2 = dateTime3.plusDays(92);
            } else {
                dateTime2 = null;
            }
            if (dateTime.isAfter(dateTime2) || dateTime.isBefore((ReadableInstant) fVar.getValue())) {
                fVar.setValue(dateTime.minusDays(92));
                this.f42280h.setValue(null);
            }
        }
    }

    public final void B0(DateTime dateTime) {
        DateTime dateTime2;
        this.f42277e.setValue(dateTime);
        xw.f fVar = this.f42278f;
        if (fVar.getValue() != null) {
            DateTime dateTime3 = (DateTime) fVar.getValue();
            if (dateTime3 != null) {
                dateTime2 = dateTime3.minusDays(92);
            } else {
                dateTime2 = null;
            }
            boolean isBefore = dateTime.isBefore(dateTime2);
            xw.n<nm0.y> nVar = this.f42280h;
            if (!isBefore && (!dateTime.isAfter((ReadableInstant) fVar.getValue()) || !dateTime.plusDays(92).isBefore(m0()))) {
                if (dateTime.isAfter((ReadableInstant) fVar.getValue()) && dateTime.plusDays(92).isAfter(m0())) {
                    fVar.setValue(m0());
                    nVar.setValue(null);
                    return;
                }
                return;
            }
            fVar.setValue(dateTime.plusDays(92));
            nVar.setValue(null);
        }
    }

    public final j0 j0() {
        return this.f42281i;
    }

    public final xw.f k0() {
        return this.f42278f;
    }

    public final k0<Integer> p0() {
        return this.f42276d;
    }

    public final j0 q0() {
        return this.f42282j;
    }

    public final j0 r0() {
        return this.f42279g;
    }

    public final xw.n<nm0.y> t0() {
        return this.f42280h;
    }

    public final xw.f y0() {
        return this.f42277e;
    }

    public final void z0(int i11) {
        this.f42276d.setValue(Integer.valueOf(i11));
    }
}

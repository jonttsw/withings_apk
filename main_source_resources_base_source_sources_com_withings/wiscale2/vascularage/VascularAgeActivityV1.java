package com.withings.wiscale2.vascularage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.vascularage.y;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: VascularAgeActivityV1.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/vascularage/VascularAgeActivityV1;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/vascularage/y$b;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lpy/a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class VascularAgeActivityV1 extends Hilt_VascularAgeActivityV1 implements y.b, BlockableViewPager.b, py.a {

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f62202p = {androidx.camera.core.v.c(VascularAgeActivityV1.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(VascularAgeActivityV1.class, "date", "getDate()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(VascularAgeActivityV1.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityVascularAgeBinding;", 0)};

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f62203q = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public fy.n f62204e;

    /* renamed from: f  reason: collision with root package name */
    private final i f62205f;

    /* renamed from: g  reason: collision with root package name */
    private final j f62206g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f62207h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f62208i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f62209j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f62210k;

    /* renamed from: l  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f62211l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f62212m;

    /* renamed from: n  reason: collision with root package name */
    private final String f62213n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f62214o;

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    public final class a extends sy.a {

        /* renamed from: c  reason: collision with root package name */
        private final User f62215c;

        /* renamed from: d  reason: collision with root package name */
        private final DateTime f62216d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VascularAgeActivityV1 f62217e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(com.withings.wiscale2.vascularage.VascularAgeActivityV1 r2, com.withings.user.User r3, androidx.fragment.app.FragmentManager r4, org.joda.time.DateTime r5, org.joda.time.DateTime r6) {
            /*
                r1 = this;
                java.lang.String r0 = "user"
                kotlin.jvm.internal.u.j(r3, r0)
                java.lang.String r0 = "firstDataDate"
                kotlin.jvm.internal.u.j(r5, r0)
                r1.f62217e = r2
                org.joda.time.DateTime r2 = org.joda.time.DateTime.now()
                java.lang.String r0 = "now(...)"
                kotlin.jvm.internal.u.i(r2, r0)
                r1.<init>(r4, r5, r2)
                r1.f62215c = r3
                r1.f62216d = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vascularage.VascularAgeActivityV1.a.<init>(com.withings.wiscale2.vascularage.VascularAgeActivityV1, com.withings.user.User, androidx.fragment.app.FragmentManager, org.joda.time.DateTime, org.joda.time.DateTime):void");
        }

        @Override // sy.a
        public final Fragment getFragment(DateTime dateTime) {
            y.f62508r.getClass();
            User user = this.f62215c;
            kotlin.jvm.internal.u.j(user, "user");
            DateTime selectedDate = this.f62216d;
            kotlin.jvm.internal.u.j(selectedDate, "selectedDate");
            y yVar = new y();
            yVar.setArguments(androidx.core.os.e.a(new nm0.j(FoodDayFragment.ARG_DAY, dateTime), new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user), new nm0.j("selectedDate", selectedDate)));
            return yVar;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            return b50.b.o(this.f62217e, getDate(i11));
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    public static final class b extends androidx.lifecycle.g1 implements py.a {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.lifecycle.k0<DateTime> f62218a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.lifecycle.k0<Period> f62219b;

        /* renamed from: c  reason: collision with root package name */
        private final xw.o<Period, DateTime, DateTime, nm0.o<Period, DateTime, DateTime>> f62220c;

        /* renamed from: d  reason: collision with root package name */
        private final androidx.lifecycle.k0<Boolean> f62221d;

        /* renamed from: e  reason: collision with root package name */
        private final String f62222e;

        /* compiled from: VascularAgeActivityV1.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeActivityV1$VascularAgeViewModel$firstDataDate$1", f = "VascularAgeActivityV1.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<DateTime>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62223a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f62224b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ fy.n f62225c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ User f62226d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(fy.n nVar, User user, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f62225c = nVar;
                this.f62226d = user;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f62225c, this.f62226d, dVar);
                aVar.f62224b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(androidx.lifecycle.h0<DateTime> h0Var, qm0.d<? super nm0.y> dVar) {
                return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                androidx.lifecycle.h0 h0Var;
                DateTime now;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62223a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            nm0.l.b(obj);
                            return nm0.y.f85009a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0Var = (androidx.lifecycle.h0) this.f62224b;
                    nm0.l.b(obj);
                } else {
                    nm0.l.b(obj);
                    h0Var = (androidx.lifecycle.h0) this.f62224b;
                    User user = this.f62226d;
                    long q11 = user.q();
                    Long l5 = new Long(user.h().getMillis());
                    int[] iArr = {ConstantsWs.MEASURE_TYPE_VASCULAR_AGE};
                    this.f62224b = h0Var;
                    this.f62223a = 1;
                    obj = this.f62225c.a(q11, l5, true, null, iArr, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                ky.d dVar = (ky.d) kotlin.collections.x.K((List) obj);
                if (dVar != null) {
                    now = new DateTime(dVar.c());
                } else {
                    now = DateTime.now();
                }
                kotlin.jvm.internal.u.g(now);
                this.f62224b = null;
                this.f62223a = 2;
                if (h0Var.emit(now, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return nm0.y.f85009a;
            }
        }

        public b(User user, DateTime initialDate, Period initialPeriod, hi0.e tutorialPrefs, fy.n nVar) {
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(initialDate, "initialDate");
            kotlin.jvm.internal.u.j(initialPeriod, "initialPeriod");
            kotlin.jvm.internal.u.j(tutorialPrefs, "tutorialPrefs");
            androidx.lifecycle.k0<DateTime> b10 = xw.d.b(initialDate);
            this.f62218a = b10;
            androidx.lifecycle.k0<Period> b11 = xw.d.b(initialPeriod);
            this.f62219b = b11;
            this.f62220c = xw.a.c(new nm0.o(b11, androidx.lifecycle.h.a(Dispatchers.getIO(), new a(nVar, user, null), 2), b10));
            this.f62221d = xw.d.b(Boolean.valueOf(tutorialPrefs.c(Long.valueOf(user.q()))));
            this.f62222e = "vascular_age";
        }

        public final xw.o<Period, DateTime, DateTime, nm0.o<Period, DateTime, DateTime>> f0() {
            return this.f62220c;
        }

        public final androidx.lifecycle.k0<Boolean> g0() {
            return this.f62221d;
        }

        @Override // py.a
        public final String getAnalyticsDetailsViewIdentifier() {
            return this.f62222e;
        }

        public final void i0(Period period) {
            kotlin.jvm.internal.u.j(period, "period");
            DateTime value = this.f62218a.getValue();
            if (value != null) {
                com.withings.wiscale2.device.hwa08.postinstall.b0.V(this, period, value);
            }
            this.f62219b.postValue(period);
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62227a;

        static {
            int[] iArr = new int[Period.values().length];
            try {
                Period.a aVar = Period.f43718c;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f62227a = iArr;
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Period> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Period invoke() {
            Object obj;
            Intent intent = VascularAgeActivityV1.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("period", Period.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("period");
                if (!(serializableExtra instanceof Period)) {
                    serializableExtra = null;
                }
                obj = (Period) serializableExtra;
            }
            Period period = (Period) obj;
            if (period == null) {
                return Period.f43724i;
            }
            return period;
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Period, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Period period) {
            Period it = period;
            kotlin.jvm.internal.u.j(it, "it");
            VascularAgeActivityV1.E3(VascularAgeActivityV1.this).i0(it);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<k1.r0<Period>> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final k1.r0<Period> invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = androidx.compose.runtime.l0.f(VascularAgeActivityV1.A3(VascularAgeActivityV1.this), androidx.compose.runtime.v0.f8878a);
            return f11;
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<List<? extends Period>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f62231a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends Period> invoke() {
            return kotlin.collections.x.V(Period.f43724i);
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    static final class h implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f62232a;

        h(ym0.l lVar) {
            this.f62232a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f62232a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f62232a;
        }

        public final int hashCode() {
            return this.f62232a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f62232a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class i implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62233a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f62234b;

        public i(Activity activity) {
            this.f62234b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62233a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class j implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62235a = nm0.h.b(new t(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f62236b;

        public j(Activity activity) {
            this.f62236b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62235a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.x0> {
        @Override // ym0.l
        public final tb0.x0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.x0.a(e11);
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<hi0.e> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final hi0.e invoke() {
            return new hi0.e(VascularAgeActivityV1.this);
        }
    }

    /* compiled from: VascularAgeActivityV1.kt */
    /* loaded from: classes5.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.a<b> {
        m() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            VascularAgeActivityV1 vascularAgeActivityV1 = VascularAgeActivityV1.this;
            User D3 = VascularAgeActivityV1.D3(vascularAgeActivityV1);
            DateTime z32 = VascularAgeActivityV1.z3(vascularAgeActivityV1);
            Period A3 = VascularAgeActivityV1.A3(vascularAgeActivityV1);
            hi0.e C3 = VascularAgeActivityV1.C3(vascularAgeActivityV1);
            fy.n nVar = vascularAgeActivityV1.f62204e;
            if (nVar != null) {
                return new b(D3, z32, A3, C3, nVar);
            }
            kotlin.jvm.internal.u.s("getMeasuresGroupsWithAllTypesUseCase");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public VascularAgeActivityV1() {
        super(0);
        this.f62205f = new i(this);
        this.f62206g = new j(this);
        this.f62207h = nm0.h.b(new d());
        this.f62208i = nm0.h.b(new f());
        this.f62209j = nm0.h.b(g.f62231a);
        this.f62210k = nm0.h.b(new l());
        this.f62211l = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f62212m = nm0.h.b(new m());
        this.f62213n = "vascular_age";
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.b(this, 2));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f62214o = registerForActivityResult;
    }

    public static final Period A3(VascularAgeActivityV1 vascularAgeActivityV1) {
        return (Period) vascularAgeActivityV1.f62207h.getValue();
    }

    public static final hi0.e C3(VascularAgeActivityV1 vascularAgeActivityV1) {
        return (hi0.e) vascularAgeActivityV1.f62210k.getValue();
    }

    public static final User D3(VascularAgeActivityV1 vascularAgeActivityV1) {
        vascularAgeActivityV1.getClass();
        return (User) vascularAgeActivityV1.f62205f.getValue(vascularAgeActivityV1, f62202p[0]);
    }

    public static final b E3(VascularAgeActivityV1 vascularAgeActivityV1) {
        return (b) vascularAgeActivityV1.f62212m.getValue();
    }

    public static final void F3(VascularAgeActivityV1 vascularAgeActivityV1, Period period, DateTime dateTime, DateTime dateTime2) {
        a aVar;
        vascularAgeActivityV1.getClass();
        int i11 = c.f62227a[period.ordinal()];
        fn0.k<Object>[] kVarArr = f62202p;
        i iVar = vascularAgeActivityV1.f62205f;
        if (i11 == 1) {
            FragmentManager supportFragmentManager = vascularAgeActivityV1.getSupportFragmentManager();
            kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            aVar = new a(vascularAgeActivityV1, (User) iVar.getValue(vascularAgeActivityV1, kVarArr[0]), supportFragmentManager, dateTime, dateTime2);
        } else {
            Fail.j("What is this tab ? : " + period);
            FragmentManager supportFragmentManager2 = vascularAgeActivityV1.getSupportFragmentManager();
            kotlin.jvm.internal.u.i(supportFragmentManager2, "getSupportFragmentManager(...)");
            aVar = new a(vascularAgeActivityV1, (User) iVar.getValue(vascularAgeActivityV1, kVarArr[0]), supportFragmentManager2, dateTime, dateTime2);
        }
        tb0.x0 H3 = vascularAgeActivityV1.H3();
        H3.f99607a.c(new p(vascularAgeActivityV1, period, aVar));
        BlockableViewPager blockableViewPager = vascularAgeActivityV1.H3().f99607a;
        blockableViewPager.setAdapter(aVar);
        blockableViewPager.setCurrentItem(aVar.getPosition(dateTime2));
    }

    public static final void G3(VascularAgeActivityV1 vascularAgeActivityV1, Period period) {
        ((k1.r0) vascularAgeActivityV1.f62208i.getValue()).setValue(period);
    }

    private final tb0.x0 H3() {
        Object value = ((LifecycleViewBindingProperty) this.f62211l).getValue(this, f62202p[2]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.x0) value;
    }

    public static final DateTime z3(VascularAgeActivityV1 vascularAgeActivityV1) {
        return (DateTime) vascularAgeActivityV1.f62206g.getValue(vascularAgeActivityV1, f62202p[1]);
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        H3().f99607a.setPagingEnabled(z5);
    }

    @Override // com.withings.wiscale2.vascularage.y.b
    public final void b(int i11) {
        androidx.viewpager.widget.e adapter = H3().f99607a.getAdapter();
        kotlin.jvm.internal.u.h(adapter, "null cannot be cast to non-null type com.withings.measure.detail.paged.DatePagedPagerAdapter");
        ((com.withings.measure.detail.paged.g) adapter).setCurrentScroll(i11);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f62213n;
    }

    @Override // com.withings.wiscale2.vascularage.Hilt_VascularAgeActivityV1, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(H3().f99608b);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.v(C1987R.string.vascular_age_title);
        }
        nm0.g gVar = this.f62209j;
        if (((List) gVar.getValue()).size() > 1) {
            ComposeView topPeriodBar = H3().f99609c;
            kotlin.jvm.internal.u.i(topPeriodBar, "topPeriodBar");
            g20.g.f((List) gVar.getValue(), (k1.r0) this.f62208i.getValue(), topPeriodBar, new e());
        }
        nm0.g gVar2 = this.f62212m;
        ((b) gVar2.getValue()).f0().observe(this, new h(new q(this)));
        ((b) gVar2.getValue()).g0().observe(this, new h(new r(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return true;
    }
}

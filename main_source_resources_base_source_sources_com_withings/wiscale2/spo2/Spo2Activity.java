package com.withings.wiscale2.spo2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.List;
import javax.inject.Inject;
import k1.r0;
import ki0.a;
import kotlin.Metadata;
import lj0.h0;
import org.joda.time.DateTime;
import tb0.s0;
/* compiled from: Spo2Activity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/spo2/Spo2Activity;", "Lcom/withings/android/activity/WithingsActivity;", "Lki0/a$b;", "Lpy/a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Spo2Activity extends Hilt_Spo2Activity implements a.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final i f61617e;

    /* renamed from: f  reason: collision with root package name */
    private final j f61618f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f61619g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61620h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f61621i;

    /* renamed from: j  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f61622j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public fy.n f61623k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public ActivityAggregateManager f61624l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public h0 f61625m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public ei0.q f61626n;

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f61627o;

    /* renamed from: p  reason: collision with root package name */
    private final String f61628p;

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61616r = {androidx.camera.core.v.c(Spo2Activity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(Spo2Activity.class, "date", "getDate()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(Spo2Activity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivitySpo2Binding;", 0)};

    /* renamed from: q  reason: collision with root package name */
    public static final a f61615q = new Object();

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(a aVar, Context context, User user, DateTime dateTime) {
            Period period = Period.f43721f;
            aVar.getClass();
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, Spo2Activity.class).putExtra("EXTRA_PERIOD", period).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", dateTime);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    public final class b extends qy.a {

        /* renamed from: a  reason: collision with root package name */
        private final User f61629a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f61630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(User user, Context context, FragmentManager fragmentManager, DateTime firstDataDate) {
            super(fragmentManager, firstDataDate, DateTime.now());
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(firstDataDate, "firstDataDate");
            this.f61629a = user;
            this.f61630b = context;
        }

        @Override // qy.a
        public final Fragment getFragment(DateTime day) {
            kotlin.jvm.internal.u.j(day, "day");
            ji0.g.f74466n.getClass();
            User user = this.f61629a;
            kotlin.jvm.internal.u.j(user, "user");
            ji0.g gVar = new ji0.g();
            gVar.setArguments(androidx.core.os.e.a(new nm0.j(FoodDayFragment.ARG_DAY, day), new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user)));
            return gVar;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            DateTime date = getDate(i11);
            kotlin.jvm.internal.u.i(date, "getDate(...)");
            return b50.b.i(this.f61630b, date);
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    public final class c extends ry.o {

        /* renamed from: c  reason: collision with root package name */
        private final User f61631c;

        /* renamed from: d  reason: collision with root package name */
        private final Context f61632d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(com.withings.user.User r3, android.content.Context r4, androidx.fragment.app.FragmentManager r5, org.joda.time.DateTime r6) {
            /*
                r2 = this;
                java.lang.String r0 = "user"
                kotlin.jvm.internal.u.j(r3, r0)
                java.lang.String r0 = "firstDataDate"
                kotlin.jvm.internal.u.j(r6, r0)
                org.joda.time.DateTime r0 = org.joda.time.DateTime.now()
                java.lang.String r1 = "now(...)"
                kotlin.jvm.internal.u.i(r0, r1)
                r2.<init>(r5, r6, r0)
                r2.f61631c = r3
                r2.f61632d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.spo2.Spo2Activity.c.<init>(com.withings.user.User, android.content.Context, androidx.fragment.app.FragmentManager, org.joda.time.DateTime):void");
        }

        @Override // ry.o
        public final Fragment getFragment(DateTime dateTime) {
            ki0.a.f76000j.getClass();
            User user = this.f61631c;
            kotlin.jvm.internal.u.j(user, "user");
            ki0.a aVar = new ki0.a();
            aVar.setArguments(androidx.core.os.e.a(new nm0.j(FoodDayFragment.ARG_DAY, dateTime), new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user)));
            return aVar;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            return b50.b.n(this.f61632d, a(i11));
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Period> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Period invoke() {
            Object obj;
            Intent intent = Spo2Activity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("EXTRA_PERIOD", Period.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("EXTRA_PERIOD");
                if (!(serializableExtra instanceof Period)) {
                    serializableExtra = null;
                }
                obj = (Period) serializableExtra;
            }
            Period period = (Period) obj;
            if (period == null) {
                return Period.f43721f;
            }
            return period;
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Period, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Period period) {
            Period it = period;
            kotlin.jvm.internal.u.j(it, "it");
            Spo2Activity.E3(Spo2Activity.this).i0(it);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<r0<Period>> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final r0<Period> invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = l0.f(Spo2Activity.B3(Spo2Activity.this), v0.f8878a);
            return f11;
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<List<? extends Period>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f61636a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends Period> invoke() {
            return kotlin.collections.x.W(Period.f43721f, Period.f43723h);
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    static final class h implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f61637a;

        h(ym0.l lVar) {
            this.f61637a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f61637a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f61637a;
        }

        public final int hashCode() {
            return this.f61637a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61637a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class i implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61638a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61639b;

        public i(Activity activity) {
            this.f61639b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61638a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class j implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61640a = nm0.h.b(new t(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61641b;

        public j(Activity activity) {
            this.f61641b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61640a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, s0> {
        @Override // ym0.l
        public final s0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return s0.a(e11);
        }
    }

    /* compiled from: Spo2Activity.kt */
    /* loaded from: classes5.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<com.withings.wiscale2.spo2.e> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.spo2.e invoke() {
            Spo2Activity spo2Activity = Spo2Activity.this;
            User user = spo2Activity.getUser();
            DateTime A3 = Spo2Activity.A3(spo2Activity);
            Period B3 = Spo2Activity.B3(spo2Activity);
            fy.n nVar = spo2Activity.f61623k;
            if (nVar != null) {
                h0 h0Var = spo2Activity.f61625m;
                if (h0Var != null) {
                    ei0.q qVar = spo2Activity.f61626n;
                    if (qVar != null) {
                        ActivityAggregateManager activityAggregateManager = spo2Activity.f61624l;
                        if (activityAggregateManager != null) {
                            return new com.withings.wiscale2.spo2.e(user, A3, B3, nVar, h0Var, qVar, activityAggregateManager);
                        }
                        kotlin.jvm.internal.u.s("activityAggregateManager");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("sleepTrackManager");
                    throw null;
                }
                kotlin.jvm.internal.u.s("vasistasManager");
                throw null;
            }
            kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypesUseCase");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public Spo2Activity() {
        super(0);
        this.f61617e = new i(this);
        this.f61618f = new j(this);
        this.f61619g = nm0.h.b(new d());
        this.f61620h = nm0.h.b(new f());
        this.f61621i = nm0.h.b(g.f61636a);
        this.f61622j = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f61627o = nm0.h.b(new l());
        this.f61628p = "spo2";
    }

    public static final DateTime A3(Spo2Activity spo2Activity) {
        return (DateTime) spo2Activity.f61618f.getValue(spo2Activity, f61616r[1]);
    }

    public static final Period B3(Spo2Activity spo2Activity) {
        return (Period) spo2Activity.f61619g.getValue();
    }

    public static final r0 C3(Spo2Activity spo2Activity) {
        return (r0) spo2Activity.f61620h.getValue();
    }

    public static final com.withings.wiscale2.spo2.e E3(Spo2Activity spo2Activity) {
        return (com.withings.wiscale2.spo2.e) spo2Activity.f61627o.getValue();
    }

    public static final void F3(Spo2Activity spo2Activity, Period period, DateTime dateTime, DateTime dateTime2) {
        androidx.viewpager.widget.e bVar;
        s0 G3 = spo2Activity.G3();
        int ordinal = period.ordinal();
        BlockableViewPager blockableViewPager = G3.f99459a;
        if (ordinal != 2) {
            if (ordinal != 4) {
                Fail.j("What is this tab ? : " + period);
                User user = spo2Activity.getUser();
                FragmentManager supportFragmentManager = spo2Activity.getSupportFragmentManager();
                kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
                bVar = new b(user, spo2Activity, supportFragmentManager, dateTime);
            } else {
                User user2 = spo2Activity.getUser();
                Context context = blockableViewPager.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                FragmentManager supportFragmentManager2 = spo2Activity.getSupportFragmentManager();
                kotlin.jvm.internal.u.i(supportFragmentManager2, "getSupportFragmentManager(...)");
                bVar = new c(user2, context, supportFragmentManager2, dateTime);
            }
        } else {
            User user3 = spo2Activity.getUser();
            FragmentManager supportFragmentManager3 = spo2Activity.getSupportFragmentManager();
            kotlin.jvm.internal.u.i(supportFragmentManager3, "getSupportFragmentManager(...)");
            bVar = new b(user3, spo2Activity, supportFragmentManager3, dateTime);
        }
        blockableViewPager.setAdapter(bVar);
        androidx.viewpager.widget.e adapter = blockableViewPager.getAdapter();
        kotlin.jvm.internal.u.h(adapter, "null cannot be cast to non-null type com.withings.measure.detail.paged.DatePagedPagerAdapter");
        blockableViewPager.setCurrentItem(((com.withings.measure.detail.paged.g) adapter).getPosition(dateTime2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 G3() {
        Object value = ((LifecycleViewBindingProperty) this.f61622j).getValue(this, f61616r[2]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (s0) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.f61617e.getValue(this, f61616r[0]);
    }

    @Override // ki0.a.b
    public final void b(int i11) {
        androidx.viewpager.widget.e adapter = G3().f99459a.getAdapter();
        kotlin.jvm.internal.u.h(adapter, "null cannot be cast to non-null type com.withings.measure.detail.paged.DatePagedPagerAdapter");
        ((com.withings.measure.detail.paged.g) adapter).setCurrentScroll(i11);
    }

    @Override // ki0.a.b
    public final void e(DateTime dateTime) {
        ((com.withings.wiscale2.spo2.e) this.f61627o.getValue()).g0(dateTime);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f61628p;
    }

    @Override // com.withings.wiscale2.spo2.Hilt_Spo2Activity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(G3().f99460b);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.v(C1987R.string.spo2_detail_title);
        }
        ComposeView topPeriodBar = G3().f99461c;
        kotlin.jvm.internal.u.i(topPeriodBar, "topPeriodBar");
        g20.g.f((List) this.f61621i.getValue(), (r0) this.f61620h.getValue(), topPeriodBar, new e());
        s0 G3 = G3();
        G3.f99459a.c(new r(this));
        ((com.withings.wiscale2.spo2.e) this.f61627o.getValue()).f0().observe(this, new h(new q(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return true;
    }
}

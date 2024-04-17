package com.withings.wiscale2.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.q;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.l1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import ea0.n;
import fa0.f0;
import ha0.r;
import ia0.a;
import ia0.k;
import ja0.h;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m0.t;
import nm0.y;
import org.joda.time.DateTime;
import ym0.l;
import ym0.p;
/* compiled from: ActivityActivity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/activity/ActivityActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lha0/r$b;", "Lia0/a$a;", "Lea0/n;", "Lpy/a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ActivityActivity extends Hilt_ActivityActivity implements r.b, a.InterfaceC1061a, n, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f48220e;

    /* renamed from: f  reason: collision with root package name */
    private final i f48221f;

    /* renamed from: g  reason: collision with root package name */
    private final j f48222g;

    /* renamed from: h  reason: collision with root package name */
    private DateTime f48223h;

    /* renamed from: i  reason: collision with root package name */
    private final Period f48224i;

    /* renamed from: j  reason: collision with root package name */
    private ParcelableSnapshotMutableState f48225j;

    /* renamed from: k  reason: collision with root package name */
    private Period f48226k;

    /* renamed from: l  reason: collision with root package name */
    private final List<Period> f48227l;

    /* renamed from: m  reason: collision with root package name */
    private DateTime f48228m;

    /* renamed from: n  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f48229n;

    /* renamed from: o  reason: collision with root package name */
    private com.withings.wiscale2.activity.f f48230o;

    /* renamed from: p  reason: collision with root package name */
    private int f48231p;

    /* renamed from: q  reason: collision with root package name */
    private final String f48232q;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    public com.withings.wiscale2.activity.g f48233r;

    /* renamed from: s  reason: collision with root package name */
    private final b f48234s;

    /* renamed from: u  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f48219u = {v.c(ActivityActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), v.c(ActivityActivity.class, "initialDate", "getInitialDate()Lorg/joda/time/DateTime;", 0), v.c(ActivityActivity.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/ActivityActivityBinding;", 0)};

    /* renamed from: t  reason: collision with root package name */
    public static final a f48218t = new Object();

    /* compiled from: ActivityActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(a aVar, Context context, User user, DateTime dateTime, Period period) {
            aVar.getClass();
            u.j(context, "context");
            u.j(dateTime, "dateTime");
            Intent putExtra = new Intent(context, ActivityActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", dateTime);
            if (period == null) {
                period = Period.f43721f;
            }
            Intent putExtra2 = putExtra.putExtra("period", period).putExtra("extra_should_scroll_temperature", false);
            u.i(putExtra2, "putExtra(...)");
            return putExtra2;
        }
    }

    /* compiled from: ActivityActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends q {
        b() {
            super(true);
        }

        @Override // androidx.activity.q
        public final void c() {
            ActivityActivity activityActivity = ActivityActivity.this;
            if (activityActivity.f48226k != Period.f43719d) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = activityActivity.f48225j;
                if (parcelableSnapshotMutableState != null) {
                    parcelableSnapshotMutableState.setValue(activityActivity.f48226k);
                    ActivityActivity.E3(activityActivity);
                    activityActivity.I3();
                    return;
                }
                u.s("period");
                throw null;
            }
            activityActivity.finish();
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes4.dex */
    public static final class c implements k1.b {
        public c() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            u.j(modelClass, "modelClass");
            ActivityActivity activityActivity = ActivityActivity.this;
            com.withings.wiscale2.activity.g gVar = activityActivity.f48233r;
            if (gVar != null) {
                return gVar.create(activityActivity.getUser());
            }
            u.s("activityViewModelFactory");
            throw null;
        }
    }

    /* compiled from: ActivityActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements l<Period, y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Period period) {
            Period it = period;
            u.j(it, "it");
            ActivityActivity activityActivity = ActivityActivity.this;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = activityActivity.f48225j;
            if (parcelableSnapshotMutableState != null) {
                parcelableSnapshotMutableState.setValue(it);
                Period.a aVar = Period.f43718c;
                ActivityActivity.E3(activityActivity);
                activityActivity.I3();
                return y.f85009a;
            }
            u.s("period");
            throw null;
        }
    }

    /* compiled from: ActivityActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements l<DateTime, y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(DateTime dateTime) {
            DateTime dateTime2 = dateTime;
            u.g(dateTime2);
            ActivityActivity activityActivity = ActivityActivity.this;
            activityActivity.f48228m = dateTime2;
            activityActivity.I3();
            return y.f85009a;
        }
    }

    /* compiled from: ActivityActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.ActivityActivity$onCreate$4", f = "ActivityActivity.kt", l = {122}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48239a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ActivityActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.ActivityActivity$onCreate$4$1", f = "ActivityActivity.kt", l = {123}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f48241a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ActivityActivity f48242b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ActivityActivity.kt */
            /* renamed from: com.withings.wiscale2.activity.ActivityActivity$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0665a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ActivityActivity f48243a;

                C0665a(ActivityActivity activityActivity) {
                    this.f48243a = activityActivity;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, qm0.d dVar) {
                    this.f48243a.f48231p = ((Number) obj).intValue();
                    return y.f85009a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ActivityActivity activityActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f48242b = activityActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f48242b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f48241a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    ActivityActivity activityActivity = this.f48242b;
                    com.withings.wiscale2.activity.f fVar = activityActivity.f48230o;
                    if (fVar != null) {
                        Flow<Integer> j02 = fVar.j0();
                        C0665a c0665a = new C0665a(activityActivity);
                        this.f48241a = 1;
                        if (j02.collect(c0665a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        u.s("viewModel");
                        throw null;
                    }
                }
                return y.f85009a;
            }
        }

        f(qm0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new f(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48239a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ActivityActivity activityActivity = ActivityActivity.this;
                Lifecycle lifecycle = activityActivity.getLifecycle();
                u.i(lifecycle, "<get-lifecycle>(...)");
                Lifecycle.State state = Lifecycle.State.f14374c;
                a aVar = new a(activityActivity, null);
                this.f48239a = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, state, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityActivity.kt */
    /* loaded from: classes4.dex */
    static final class g implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f48244a;

        g(l lVar) {
            this.f48244a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(this.f48244a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f48244a;
        }

        public final int hashCode() {
            return this.f48244a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48244a.invoke(obj);
        }
    }

    /* compiled from: ActivityActivity.kt */
    /* loaded from: classes4.dex */
    static final class h extends w implements ym0.a<Boolean> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(ActivityActivity.this.getIntent().getBooleanExtra("extra_should_scroll_temperature", false));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class i implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48246a = nm0.h.b(new com.withings.wiscale2.activity.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48247b;

        public i(Activity activity) {
            this.f48247b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f48246a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class j implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48248a = nm0.h.b(new com.withings.wiscale2.activity.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48249b;

        public j(Activity activity) {
            this.f48249b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f48248a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements l<ComponentActivity, tb0.a> {
        @Override // ym0.l
        public final tb0.a invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return tb0.a.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ym0.l, kotlin.jvm.internal.w] */
    public ActivityActivity() {
        super(0);
        this.f48220e = nm0.h.b(new h());
        this.f48221f = new i(this);
        this.f48222g = new j(this);
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        this.f48223h = now;
        Period period = Period.f43721f;
        this.f48224i = period;
        this.f48226k = Period.f43719d;
        this.f48227l = x.W(period, Period.f43722g, Period.f43723h);
        DateTime now2 = DateTime.now();
        u.i(now2, "now(...)");
        this.f48228m = now2;
        this.f48229n = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f48231p = 10000;
        this.f48232q = "activity";
        this.f48234s = new b();
    }

    public static final /* synthetic */ void E3(ActivityActivity activityActivity) {
        activityActivity.f48226k = Period.f43719d;
    }

    private final tb0.a H3() {
        Object value = ((LifecycleViewBindingProperty) this.f48229n).getValue(this, f48219u[2]);
        u.i(value, "getValue(...)");
        return (tb0.a) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3() {
        Fragment a11;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f48225j;
        if (parcelableSnapshotMutableState != null) {
            b0.V(this, (Period) parcelableSnapshotMutableState.getValue(), this.f48223h);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f48225j;
            if (parcelableSnapshotMutableState2 != null) {
                int ordinal = ((Period) parcelableSnapshotMutableState2.getValue()).ordinal();
                nm0.g gVar = this.f48220e;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.f48225j;
                            if (parcelableSnapshotMutableState3 != null) {
                                if (parcelableSnapshotMutableState3.getValue() != Period.f43721f) {
                                    ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = this.f48225j;
                                    if (parcelableSnapshotMutableState4 != null) {
                                        Fail.j("What is this tab(" + parcelableSnapshotMutableState4 + ")?");
                                    } else {
                                        u.s("period");
                                        throw null;
                                    }
                                }
                                f0.a aVar = f0.f66584j;
                                User user = getUser();
                                DateTime dateTime = this.f48223h;
                                boolean booleanValue = ((Boolean) gVar.getValue()).booleanValue();
                                aVar.getClass();
                                a11 = f0.a.a(user, dateTime, booleanValue);
                            } else {
                                u.s("period");
                                throw null;
                            }
                        } else {
                            k.a aVar2 = ia0.k.f71641k;
                            User user2 = getUser();
                            DateTime dateTime2 = this.f48223h;
                            DateTime firstAggregateEver = this.f48228m;
                            aVar2.getClass();
                            u.j(user2, "user");
                            u.j(dateTime2, "dateTime");
                            u.j(firstAggregateEver, "firstAggregateEver");
                            a11 = new ia0.k();
                            a11.setArguments(androidx.core.os.e.a(new nm0.j("ARG_USER", user2), new nm0.j("ARG_DATE", dateTime2), new nm0.j("ARG_FIRST_AGGREGATE_EVER", firstAggregateEver)));
                        }
                    } else {
                        h.a aVar3 = ja0.h.f73982k;
                        User user3 = getUser();
                        DateTime dateTime3 = this.f48223h;
                        DateTime firstAggregateEver2 = this.f48228m;
                        aVar3.getClass();
                        u.j(user3, "user");
                        u.j(dateTime3, "dateTime");
                        u.j(firstAggregateEver2, "firstAggregateEver");
                        a11 = new ja0.h();
                        a11.setArguments(androidx.core.os.e.a(new nm0.j("ARG_USER", user3), new nm0.j("ARG_DATE", dateTime3), new nm0.j("ARG_FIRST_AGGREGATE_EVER", firstAggregateEver2)));
                    }
                } else {
                    f0.a aVar4 = f0.f66584j;
                    User user4 = getUser();
                    DateTime dateTime4 = this.f48223h;
                    boolean booleanValue2 = ((Boolean) gVar.getValue()).booleanValue();
                    aVar4.getClass();
                    a11 = f0.a.a(user4, dateTime4, booleanValue2);
                }
                m0 m11 = getSupportFragmentManager().m();
                m11.l(H3().f98841b.getId(), a11, null);
                m11.g();
                return;
            }
            u.s("period");
            throw null;
        }
        u.s("period");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.f48221f.getValue(this, f48219u[0]);
    }

    @Override // ea0.n
    public final void K0(DateTime dateTime) {
        this.f48223h = dateTime;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f48225j;
        if (parcelableSnapshotMutableState != null) {
            b0.V(this, (Period) parcelableSnapshotMutableState.getValue(), this.f48223h);
        } else {
            u.s("period");
            throw null;
        }
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f48232q;
    }

    @Override // ha0.r.b
    public final void h(DateTime day) {
        u.j(day, "day");
        this.f48226k = Period.f43722g;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f48225j;
        if (parcelableSnapshotMutableState != null) {
            parcelableSnapshotMutableState.setValue(Period.f43721f);
            this.f48223h = day;
            I3();
            return;
        }
        u.s("period");
        throw null;
    }

    @Override // ia0.a.InterfaceC1061a
    public final void n3(ia0.a fragment, DateTime dateTime) {
        u.j(fragment, "fragment");
        this.f48226k = Period.f43723h;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f48225j;
        if (parcelableSnapshotMutableState != null) {
            parcelableSnapshotMutableState.setValue(Period.f43721f);
            this.f48223h = dateTime;
            I3();
            return;
        }
        u.s("period");
        throw null;
    }

    @Override // com.withings.wiscale2.activity.Hilt_ActivityActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Object obj;
        ParcelableSnapshotMutableState f11;
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        this.f48223h = (DateTime) this.f48222g.getValue(this, f48219u[1]);
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
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
            period = this.f48224i;
        }
        f11 = androidx.compose.runtime.l0.f(period, v0.f8878a);
        this.f48225j = f11;
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        b onBackPressedCallback = this.f48234s;
        u.j(onBackPressedCallback, "onBackPressedCallback");
        onBackPressedDispatcher.i(onBackPressedCallback);
        setSupportActionBar(H3().f98842c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        AppBarLayout appBar = H3().f98840a;
        u.i(appBar, "appBar");
        ay.b.n(appBar, true, false, 29);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f48225j;
        if (parcelableSnapshotMutableState != null) {
            ComposeView topPeriodBar = H3().f98843d;
            u.i(topPeriodBar, "topPeriodBar");
            g20.g.f(this.f48227l, parcelableSnapshotMutableState, topPeriodBar, new d());
            com.withings.wiscale2.activity.f fVar = (com.withings.wiscale2.activity.f) new k1(this, new c()).a(com.withings.wiscale2.activity.f.class);
            fVar.i0().observe(this, new g(new e()));
            this.f48230o = fVar;
            BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new f(null), 3, null);
            return;
        }
        u.s("period");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.menu_detail_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == C1987R.id.action_display_bottom_sheet) {
            ea0.j.a(this.f48231p, this, getUser());
            return true;
        } else if (itemId == 16908332) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}

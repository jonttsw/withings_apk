package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.tutorials.core.model.ExplanationsType;
import com.withings.tutorials.ui.screens.explanations.ExplanationsActivity;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.w0;
import com.withings.wiscale2.sleep.ui.sleepscore.t1;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/sleepapnea/SleepDisorderActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepDisorderActivity extends Hilt_SleepDisorderActivity {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f61235e = nm0.h.b(new j());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61236f = nm0.h.b(new i());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f61237g = nm0.h.b(new k());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61238h = nm0.h.b(new c());

    /* renamed from: i  reason: collision with root package name */
    private final f f61239i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    private final g f61240j = new g(this);

    /* renamed from: k  reason: collision with root package name */
    private final h f61241k = new h(this);

    /* renamed from: l  reason: collision with root package name */
    private final List<Period> f61242l = kotlin.collections.x.W(Period.f43721f, Period.f43724i, Period.f43725j);

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f61243m = nm0.h.b(new e());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f61244n = nm0.h.b(new l());

    /* renamed from: o  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f61245o;

    /* renamed from: q  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61234q = {androidx.camera.core.v.c(SleepDisorderActivity.class, "isSleepApnea", "isSleepApnea()Z", 0), androidx.camera.core.v.c(SleepDisorderActivity.class, "trackStartDate", "getTrackStartDate()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(SleepDisorderActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0)};

    /* renamed from: p  reason: collision with root package name */
    public static final a f61233p = new Object();

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, User user, DateTime trackStartDate, boolean z5) {
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(trackStartDate, "trackStartDate");
            Bundle a11 = androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user), new nm0.j("date", trackStartDate), new nm0.j("is_sleep_apnea", Boolean.valueOf(z5)));
            a11.setClassLoader(SleepDisorderActivity.class.getClassLoader());
            Intent putExtras = new Intent(context, SleepDisorderActivity.class).putExtras(a11);
            kotlin.jvm.internal.u.i(putExtras, "putExtras(...)");
            return putExtras;
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends androidx.lifecycle.b {

        /* renamed from: a  reason: collision with root package name */
        private final Application f61246a;

        /* renamed from: b  reason: collision with root package name */
        private final User f61247b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f61248c;

        /* renamed from: d  reason: collision with root package name */
        private DateTime f61249d;

        /* renamed from: e  reason: collision with root package name */
        private Period f61250e;

        /* renamed from: f  reason: collision with root package name */
        private final androidx.lifecycle.f f61251f;

        /* renamed from: g  reason: collision with root package name */
        private final xw.f f61252g;

        /* renamed from: h  reason: collision with root package name */
        private final androidx.lifecycle.k0<nm0.j<Integer, Intent>> f61253h;

        /* compiled from: SleepDisorderActivity.kt */
        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.w implements ym0.l<Integer, Period> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f61254a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final Period invoke(Integer num) {
                if (num != null) {
                    return Period.f43719d;
                }
                return Period.f43721f;
            }
        }

        /* compiled from: SleepDisorderActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity$SleepDisorderViewModel$showTutorialId$1", f = "SleepDisorderActivity.kt", l = {ConstantsWs.MEASURE_TYPE_R50KHZ_SEGMENT, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY, 180}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0780b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f61255a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f61256b;

            C0780b(qm0.d<? super C0780b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0780b c0780b = new C0780b(dVar);
                c0780b.f61256b = obj;
                return c0780b;
            }

            @Override // ym0.p
            public final Object invoke(androidx.lifecycle.h0<Integer> h0Var, qm0.d<? super nm0.y> dVar) {
                return ((C0780b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f61255a;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2 && i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nm0.l.b(obj);
                } else {
                    nm0.l.b(obj);
                    androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f61256b;
                    b bVar = b.this;
                    if (bVar.f61248c) {
                        Context applicationContext = bVar.g0().getApplicationContext();
                        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                        if (!new hi0.a(applicationContext).c(Long.valueOf(bVar.q0().getId()))) {
                            Integer num = new Integer(5);
                            this.f61255a = 1;
                            if (h0Var.emit(num, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    if (!bVar.f61248c) {
                        Context applicationContext2 = bVar.g0().getApplicationContext();
                        kotlin.jvm.internal.u.i(applicationContext2, "getApplicationContext(...)");
                        if (new gi0.a(applicationContext2, bVar.q0()).a()) {
                            Integer num2 = new Integer(3);
                            this.f61255a = 2;
                            if (h0Var.emit(num2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    this.f61255a = 3;
                    if (h0Var.emit(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Application application, User user, DateTime trackStartDate, boolean z5) {
            super(application);
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(trackStartDate, "trackStartDate");
            this.f61246a = application;
            this.f61247b = user;
            this.f61248c = z5;
            this.f61249d = trackStartDate;
            this.f61250e = Period.f43719d;
            androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new C0780b(null), 2);
            this.f61251f = a11;
            this.f61252g = xw.d.f(androidx.lifecycle.e1.b(a11, a.f61254a));
            this.f61253h = xw.d.b(null);
        }

        public final void A0(DateTime dateTime) {
            this.f61249d = dateTime;
        }

        public final Application g0() {
            return this.f61246a;
        }

        public final androidx.lifecycle.k0<nm0.j<Integer, Intent>> i0() {
            return this.f61253h;
        }

        public final Period j0() {
            Period period = (Period) this.f61252g.getValue();
            if (period == null) {
                return Period.f43721f;
            }
            return period;
        }

        public final xw.f k0() {
            return this.f61252g;
        }

        public final DateTime m0() {
            return this.f61249d;
        }

        public final androidx.lifecycle.f p0() {
            return this.f61251f;
        }

        public final User q0() {
            return this.f61247b;
        }

        public final void r0() {
            Intent intent = new Intent();
            intent.putExtra("extra_sleep_apnea_current_date", this.f61249d);
            this.f61253h.setValue(new nm0.j<>(-1, intent));
        }

        public final void t0() {
            Period period = this.f61250e;
            Period period2 = Period.f43719d;
            if (period != period2) {
                z0(period);
                this.f61250e = period2;
                return;
            }
            r0();
        }

        public final void y0(Period period, DateTime dateTime) {
            kotlin.jvm.internal.u.j(period, "period");
            this.f61250e = period;
            this.f61249d = dateTime;
            z0(Period.f43721f);
        }

        public final void z0(Period destinationPeriod) {
            kotlin.jvm.internal.u.j(destinationPeriod, "destinationPeriod");
            xw.f fVar = this.f61252g;
            if (fVar.getValue() != destinationPeriod) {
                this.f61250e = Period.f43719d;
                fVar.setValue(destinationPeriod);
            }
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<FrameLayout> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final FrameLayout invoke() {
            return (FrameLayout) SleepDisorderActivity.this.findViewById(C1987R.id.fragment_container);
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Period, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Period period) {
            Period it = period;
            kotlin.jvm.internal.u.j(it, "it");
            SleepDisorderActivity.this.K3().z0(it);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<k1.r0<Period>> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final k1.r0<Period> invoke() {
            ParcelableSnapshotMutableState f11;
            Period period = (Period) kotlin.collections.x.K(SleepDisorderActivity.this.f61242l);
            if (period == null) {
                period = Period.f43721f;
            }
            f11 = androidx.compose.runtime.l0.f(period, androidx.compose.runtime.v0.f8878a);
            return f11;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61261a = nm0.h.b(new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61262b;

        public f(Activity activity) {
            this.f61262b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61261a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61263a = nm0.h.b(new m(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61264b;

        public g(Activity activity) {
            this.f61264b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61263a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61265a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61266b;

        public h(Activity activity) {
            this.f61266b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61265a.getValue();
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepDisorderActivity.this.findViewById(C1987R.id.web_toolbar_title);
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) SleepDisorderActivity.this.findViewById(C1987R.id.web_toolbar);
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            return (ComposeView) SleepDisorderActivity.this.findViewById(C1987R.id.top_period_bar);
        }
    }

    /* compiled from: SleepDisorderActivity.kt */
    /* loaded from: classes5.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<b> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            SleepDisorderActivity sleepDisorderActivity = SleepDisorderActivity.this;
            return (b) new androidx.lifecycle.k1(sleepDisorderActivity, new o(sleepDisorderActivity)).a(b.class);
        }
    }

    public SleepDisorderActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new g40.b(this, 3));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f61245o = registerForActivityResult;
    }

    public static final Fragment A3(SleepDisorderActivity sleepDisorderActivity, Period period) {
        Fragment t1Var;
        sleepDisorderActivity.getClass();
        int ordinal = period.ordinal();
        if (ordinal != 2) {
            if (ordinal != 5 && ordinal != 6) {
                return null;
            }
            w0.a aVar = w0.f61474m;
            User user = sleepDisorderActivity.J3();
            boolean L3 = sleepDisorderActivity.L3();
            aVar.getClass();
            kotlin.jvm.internal.u.j(user, "user");
            t1Var = new w0();
            t1Var.setArguments(androidx.core.os.e.a(new nm0.j("key_user", user), new nm0.j("key_is_sleep_apnea", Boolean.valueOf(L3))));
        } else {
            t1.a aVar2 = t1.f61504r;
            User user2 = sleepDisorderActivity.J3();
            boolean L32 = sleepDisorderActivity.L3();
            aVar2.getClass();
            kotlin.jvm.internal.u.j(user2, "user");
            t1Var = new t1();
            t1Var.setArguments(androidx.core.os.e.a(new nm0.j("key_user", user2), new nm0.j("key_isSleepApnea", Boolean.valueOf(L32))));
        }
        return t1Var;
    }

    public static final k1.r0 B3(SleepDisorderActivity sleepDisorderActivity) {
        return (k1.r0) sleepDisorderActivity.f61243m.getValue();
    }

    public static final DateTime D3(SleepDisorderActivity sleepDisorderActivity) {
        return (DateTime) sleepDisorderActivity.f61240j.getValue(sleepDisorderActivity, f61234q[1]);
    }

    public static final void H3(SleepDisorderActivity sleepDisorderActivity, int i11) {
        Intent a11;
        ExplanationsType explanationsType;
        sleepDisorderActivity.getClass();
        if (wr.b.c(FeatureFlag.T)) {
            ExplanationsActivity.a aVar = ExplanationsActivity.f45078i;
            switch (i11) {
                case 0:
                    explanationsType = ExplanationsType.f44586g;
                    break;
                case 1:
                    explanationsType = ExplanationsType.f44580a;
                    break;
                case 2:
                    explanationsType = ExplanationsType.f44581b;
                    break;
                case 3:
                    explanationsType = ExplanationsType.f44582c;
                    break;
                case 4:
                    explanationsType = ExplanationsType.f44583d;
                    break;
                case 5:
                    explanationsType = ExplanationsType.f44584e;
                    break;
                case 6:
                    explanationsType = ExplanationsType.f44585f;
                    break;
                default:
                    throw new IllegalArgumentException("Unhandled case");
            }
            long id2 = sleepDisorderActivity.J3().getId();
            aVar.getClass();
            a11 = ExplanationsActivity.a.a(sleepDisorderActivity, explanationsType, id2);
        } else {
            LegacyTutorialActivity.a aVar2 = LegacyTutorialActivity.f53518k;
            Long valueOf = Long.valueOf(sleepDisorderActivity.J3().getId());
            aVar2.getClass();
            a11 = LegacyTutorialActivity.a.a(sleepDisorderActivity, i11, true, valueOf);
        }
        sleepDisorderActivity.f61245o.a(a11);
    }

    public static final void I3(SleepDisorderActivity sleepDisorderActivity, Fragment fragment) {
        androidx.fragment.app.m0 m11 = sleepDisorderActivity.getSupportFragmentManager().m();
        m11.l(((FrameLayout) sleepDisorderActivity.f61238h.getValue()).getId(), fragment, null);
        m11.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User J3() {
        return (User) this.f61241k.getValue(this, f61234q[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b K3() {
        return (b) this.f61244n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L3() {
        return ((Boolean) this.f61239i.getValue(this, f61234q[0])).booleanValue();
    }

    public static void z3(SleepDisorderActivity this$0) {
        boolean c11;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Integer num = (Integer) this$0.K3().p0().getValue();
        if (num != null && num.intValue() == 5) {
            c11 = new hi0.a(this$0).c(Long.valueOf(this$0.J3().getId()));
        } else {
            if (num != null && num.intValue() == 3) {
                c11 = new gi0.c(this$0, this$0.J3().getId()).c(Long.valueOf(this$0.J3().getId()));
            }
            this$0.finish();
        }
        if (c11) {
            this$0.K3().z0(Period.f43721f);
            return;
        }
        this$0.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        K3().t0();
        super.onBackPressed();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.Hilt_SleepDisorderActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_sleep_disorder);
        setSupportActionBar((Toolbar) this.f61235e.getValue());
        TextView textView = (TextView) this.f61236f.getValue();
        if (L3()) {
            i11 = C1987R.string.sleepApnea_title;
        } else {
            i11 = C1987R.string.sleepApnea_breathingDisorderTitle;
        }
        textView.setText(i11);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        ComposeView composeView = (ComposeView) this.f61237g.getValue();
        kotlin.jvm.internal.u.i(composeView, "<get-topPeriodBar>(...)");
        d dVar = new d();
        g20.g.f(this.f61242l, (k1.r0) this.f61243m.getValue(), composeView, dVar);
        b K3 = K3();
        xw.d.c(this, K3.k0(), new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.h(this));
        xw.d.c(this, K3.p0(), new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.i(this));
        xw.d.c(this, K3.i0(), new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.k(this));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            K3().r0();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

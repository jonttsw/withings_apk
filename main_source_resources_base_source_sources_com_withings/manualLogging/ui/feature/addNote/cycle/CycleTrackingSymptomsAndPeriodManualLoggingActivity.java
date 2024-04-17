package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.k1;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import nm0.k;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
/* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/CycleTrackingSymptomsAndPeriodManualLoggingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleTrackingSymptomsAndPeriodManualLoggingActivity extends Hilt_CycleTrackingSymptomsAndPeriodManualLoggingActivity {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f40811j = {androidx.camera.core.v.c(CycleTrackingSymptomsAndPeriodManualLoggingActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(CycleTrackingSymptomsAndPeriodManualLoggingActivity.class, "dateAsLong", "getDateAsLong()J", 0), androidx.camera.core.v.c(CycleTrackingSymptomsAndPeriodManualLoggingActivity.class, "origin", "getOrigin()Ljava/lang/String;", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final c f40812e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final d f40813f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private final e f40814g = new e(this);

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f40815h = nm0.h.b(new a());

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.i1 f40816i = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(CycleDataStorageViewModel.class), new g(this), new f(this), new h(this));

    /* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<List<? extends r8.d>> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final List<? extends r8.d> invoke() {
            CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity = CycleTrackingSymptomsAndPeriodManualLoggingActivity.this;
            return kotlin.collections.x.W(androidx.camera.camera2.internal.v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new q3(cycleTrackingSymptomsAndPeriodManualLoggingActivity)), androidx.camera.camera2.internal.v1.d0("date", new r3(cycleTrackingSymptomsAndPeriodManualLoggingActivity)));
        }
    }

    /* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1930266558, new d4(CycleTrackingSymptomsAndPeriodManualLoggingActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f40819a = nm0.h.b(new e4(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f40820b;

        public c(Activity activity) {
            this.f40820b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f40819a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f40821a = nm0.h.b(new f4(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f40822b;

        public d(Activity activity) {
            this.f40822b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f40821a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f40823a = nm0.h.b(new g4(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f40824b;

        public e(Activity activity) {
            this.f40824b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f40823a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f40825a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f40825a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40826a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f40826a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f40826a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40827a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f40827a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f40827a.getDefaultViewModelCreationExtras();
        }
    }

    public static final void A3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity, r8.m mVar, CycleDataStorageViewModel cycleDataStorageViewModel, String str, ym0.a aVar) {
        androidx.navigation.compose.n.b(mVar, Cycle2ManualLoggingNavigation$Destinations.f40747f.a(), cycleTrackingSymptomsAndPeriodManualLoggingActivity.K3(), null, null, null, null, null, new s1.a(true, 1787751205, new k3(cycleDataStorageViewModel, str, aVar)), 124);
    }

    public static final void B3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity, r8.m mVar, CycleDataStorageViewModel cycleDataStorageViewModel, String str, ym0.a aVar) {
        cycleTrackingSymptomsAndPeriodManualLoggingActivity.getClass();
        androidx.navigation.compose.n.b(mVar, Cycle2ManualLoggingNavigation$Destinations.f40745d.a(), cycleTrackingSymptomsAndPeriodManualLoggingActivity.K3(), null, null, null, null, null, new s1.a(true, 516115695, new l3(cycleDataStorageViewModel, str, aVar)), 124);
    }

    public static final void C3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity, r8.m mVar, CycleDataStorageViewModel cycleDataStorageViewModel, String str, ym0.a aVar) {
        androidx.navigation.compose.n.b(mVar, Cycle2ManualLoggingNavigation$Destinations.f40748g.a(), cycleTrackingSymptomsAndPeriodManualLoggingActivity.K3(), null, null, null, null, null, new s1.a(true, -857795177, new m3(cycleDataStorageViewModel, str, aVar)), 124);
    }

    public static final void D3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity, r8.m mVar, CycleDataStorageViewModel cycleDataStorageViewModel, String str, ym0.a aVar) {
        cycleTrackingSymptomsAndPeriodManualLoggingActivity.getClass();
        androidx.navigation.compose.n.b(mVar, Cycle2ManualLoggingNavigation$Destinations.f40749h.a(), cycleTrackingSymptomsAndPeriodManualLoggingActivity.K3(), null, null, null, null, null, new s1.a(true, 270002712, new n3(cycleDataStorageViewModel, str, aVar)), 124);
    }

    public static final void E3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity, r8.m mVar, String str, ym0.l lVar) {
        cycleTrackingSymptomsAndPeriodManualLoggingActivity.getClass();
        androidx.navigation.compose.n.b(mVar, Cycle2ManualLoggingNavigation$Destinations.f40744c.a(), cycleTrackingSymptomsAndPeriodManualLoggingActivity.K3(), null, null, null, null, null, new s1.a(true, 245353713, new p3(cycleTrackingSymptomsAndPeriodManualLoggingActivity, str, lVar)), 124);
    }

    public static final CycleDataStorageViewModel F3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        return (CycleDataStorageViewModel) cycleTrackingSymptomsAndPeriodManualLoggingActivity.f40816i.getValue();
    }

    public static final long G3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        cycleTrackingSymptomsAndPeriodManualLoggingActivity.getClass();
        return ((Number) cycleTrackingSymptomsAndPeriodManualLoggingActivity.f40813f.getValue(cycleTrackingSymptomsAndPeriodManualLoggingActivity, f40811j[1])).longValue();
    }

    public static final String H3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        Object a11;
        cycleTrackingSymptomsAndPeriodManualLoggingActivity.getClass();
        DateTime dateTimeAtStartOfDay = new LocalDate(((Number) cycleTrackingSymptomsAndPeriodManualLoggingActivity.f40813f.getValue(cycleTrackingSymptomsAndPeriodManualLoggingActivity, f40811j[1])).longValue()).toDateTimeAtStartOfDay(DateTimeZone.UTC);
        try {
            a11 = dateTimeAtStartOfDay.toString(DateTimeFormat.fullDate());
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            x70.b.n(b10);
        }
        Object abstractInstant = dateTimeAtStartOfDay.toString(DateTimeFormat.forPattern(cycleTrackingSymptomsAndPeriodManualLoggingActivity.getString(C1987R.string._DATE_EEEE_MMMM_D_YYYY_)));
        if (a11 instanceof k.a) {
            a11 = abstractInstant;
        }
        return (String) a11;
    }

    public static final String I3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        return (String) cycleTrackingSymptomsAndPeriodManualLoggingActivity.f40814g.getValue(cycleTrackingSymptomsAndPeriodManualLoggingActivity, f40811j[2]);
    }

    public static final long J3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        return ((Number) cycleTrackingSymptomsAndPeriodManualLoggingActivity.f40812e.getValue(cycleTrackingSymptomsAndPeriodManualLoggingActivity, f40811j[0])).longValue();
    }

    private final List<r8.d> K3() {
        return (List) this.f40815h.getValue();
    }

    public static final void z3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity, r8.m mVar, CycleDataStorageViewModel cycleDataStorageViewModel, String str, ym0.a aVar) {
        cycleTrackingSymptomsAndPeriodManualLoggingActivity.getClass();
        androidx.navigation.compose.n.b(mVar, Cycle2ManualLoggingNavigation$Destinations.f40746e.a(), cycleTrackingSymptomsAndPeriodManualLoggingActivity.K3(), null, null, null, null, null, new s1.a(true, 1330263740, new j3(cycleDataStorageViewModel, str, aVar)), 124);
    }

    @Override // com.withings.manualLogging.ui.feature.addNote.cycle.Hilt_CycleTrackingSymptomsAndPeriodManualLoggingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1693204260, new b()));
    }
}

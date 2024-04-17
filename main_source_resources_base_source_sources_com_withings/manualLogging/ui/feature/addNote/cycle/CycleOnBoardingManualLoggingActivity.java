package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.k1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import retrofit.RetrofitError;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/CycleOnBoardingManualLoggingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "hasFactors", "Lcom/withings/manualLogging/ui/feature/addNote/cycle/g3;", "cycleSurveyFormState", "", "deviceId", "hasInitialisation", "Lcom/withings/manualLogging/ui/feature/addNote/cycle/u0;", "buttonClickNavigation", "", "deviceWithCycleTrackingModelId", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleOnBoardingManualLoggingActivity extends Hilt_CycleOnBoardingManualLoggingActivity {

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f40790n = {androidx.camera.core.v.c(CycleOnBoardingManualLoggingActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(CycleOnBoardingManualLoggingActivity.class, "shouldRenewOnBoarding", "getShouldRenewOnBoarding()Z", 0), androidx.camera.core.v.c(CycleOnBoardingManualLoggingActivity.class, "initialDestination", "getInitialDestination()Ljava/lang/String;", 0)};

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f40791o = 0;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ch.d f40795h;

    /* renamed from: j  reason: collision with root package name */
    private androidx.appcompat.app.c f40797j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f40798k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f40799l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f40800m;

    /* renamed from: e  reason: collision with root package name */
    private final b f40792e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private final c f40793f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final d f40794g = new d(this);

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.i1 f40796i = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(CycleManualLoggingViewModel.class), new f(this), new e(this), new g(this));

    /* compiled from: CycleOnBoardingManualLoggingActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -954909316, new b3(CycleOnBoardingManualLoggingActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f40802a = nm0.h.b(new c3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f40803b;

        public b(Activity activity) {
            this.f40803b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f40802a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f40804a = nm0.h.b(new d3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f40805b;

        public c(Activity activity) {
            this.f40805b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f40804a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f40806a = nm0.h.b(new e3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f40807b;

        public d(Activity activity) {
            this.f40807b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f40806a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40808a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f40808a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f40808a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f40809a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f40809a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40810a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f40810a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f40810a.getDefaultViewModelCreationExtras();
        }
    }

    public CycleOnBoardingManualLoggingActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new androidx.activity.result.a() { // from class: com.withings.manualLogging.ui.feature.addNote.cycle.e2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                CycleOnBoardingManualLoggingActivity.z3(CycleOnBoardingManualLoggingActivity.this, (ActivityResult) obj);
            }
        });
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f40798k = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new un.c(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f40799l = registerForActivityResult2;
        androidx.activity.result.b<Intent> registerForActivityResult3 = registerForActivityResult(new g.a(), new Object());
        kotlin.jvm.internal.u.i(registerForActivityResult3, "registerForActivityResult(...)");
        this.f40800m = registerForActivityResult3;
    }

    public static void A3(CycleOnBoardingManualLoggingActivity this$0, ActivityResult activityResult) {
        Long l5;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            Intent a11 = activityResult.a();
            Long l6 = null;
            if (a11 != null) {
                l5 = Long.valueOf(a11.getLongExtra("due", -1L));
            } else {
                l5 = null;
            }
            if (l5 == null || l5.longValue() != -1) {
                l6 = l5;
            }
            if (l6 != null) {
                ((CycleManualLoggingViewModel) this$0.f40796i.getValue()).a1(this$0.getUserId(), new DateTime(l6.longValue()));
            }
        }
    }

    public static final String C3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity) {
        return (String) cycleOnBoardingManualLoggingActivity.f40794g.getValue(cycleOnBoardingManualLoggingActivity, f40790n[2]);
    }

    public static final CycleManualLoggingViewModel F3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity) {
        return (CycleManualLoggingViewModel) cycleOnBoardingManualLoggingActivity.f40796i.getValue();
    }

    public static final void G3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, Throwable th2) {
        int i11;
        cycleOnBoardingManualLoggingActivity.getClass();
        x70.b.n(th2);
        if ((th2 instanceof WsAuthFailedException.Runtime) || (th2 instanceof RetrofitError)) {
            i11 = C1987R.string._NETWORK_ERROR_;
        } else if (th2 instanceof IllegalArgumentException) {
            i11 = C1987R.string._INCORRECT_MEASURE_;
        } else {
            i11 = C1987R.string._WTA_GENERIC_ERROR_TITLE_;
        }
        qc.b bVar = new qc.b(cycleOnBoardingManualLoggingActivity);
        bVar.v(cycleOnBoardingManualLoggingActivity.getString(i11));
        bVar.x(C1987R.string._OK_, new com.withings.ecg.heartsound.c(cycleOnBoardingManualLoggingActivity, 1));
        cycleOnBoardingManualLoggingActivity.f40797j = bVar.s();
    }

    public static final void H3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, r8.n nVar) {
        cycleOnBoardingManualLoggingActivity.getClass();
        int i11 = t0.f41220b;
        kotlin.jvm.internal.u.j(nVar, "<this>");
        androidx.navigation.e.L(nVar, "loading", null, 6);
        CycleManualLoggingViewModel.c1((CycleManualLoggingViewModel) cycleOnBoardingManualLoggingActivity.f40796i.getValue(), cycleOnBoardingManualLoggingActivity.getUserId(), cycleOnBoardingManualLoggingActivity.M3(), false, 4);
    }

    public static final void I3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, long j5) {
        ch.d dVar = cycleOnBoardingManualLoggingActivity.f40795h;
        if (dVar != null) {
            dVar.A().getClass();
            cycleOnBoardingManualLoggingActivity.f40798k.a(ah.f.c(cycleOnBoardingManualLoggingActivity, j5));
            cycleOnBoardingManualLoggingActivity.finish();
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final void J3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity) {
        ch.d dVar = cycleOnBoardingManualLoggingActivity.f40795h;
        if (dVar != null) {
            cycleOnBoardingManualLoggingActivity.f40799l.a(((ah.u) dVar.getMode()).G(cycleOnBoardingManualLoggingActivity, cycleOnBoardingManualLoggingActivity.getUserId(), 0L, true));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final /* synthetic */ void K3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity) {
        cycleOnBoardingManualLoggingActivity.getClass();
        N3("start");
    }

    public static final void L3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, long j5, boolean z5) {
        String str;
        cycleOnBoardingManualLoggingActivity.getClass();
        if (z5) {
            str = "end";
        } else {
            str = "not_interested";
        }
        N3(str);
        ((CycleManualLoggingViewModel) cycleOnBoardingManualLoggingActivity.f40796i.getValue()).d1(cycleOnBoardingManualLoggingActivity.getUserId(), j5, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M3() {
        return ((Boolean) this.f40793f.getValue(this, f40790n[1])).booleanValue();
    }

    private static void N3(String str) {
        int i11 = v70.a.f103433b;
        v70.a.d("cycle_logs", "tutorial", kotlin.collections.s0.j(new nm0.j("tutorial_name", "cycle_tracking"), new nm0.j("tutorial_step", str)), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getUserId() {
        return ((Number) this.f40792e.getValue(this, f40790n[0])).longValue();
    }

    public static void z3(CycleOnBoardingManualLoggingActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == 0) {
            CycleManualLoggingViewModel cycleManualLoggingViewModel = (CycleManualLoggingViewModel) this$0.f40796i.getValue();
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(cycleManualLoggingViewModel), null, null, new y1(cycleManualLoggingViewModel, this$0.M3(), null), 3, null);
        }
    }

    @Override // com.withings.manualLogging.ui.feature.addNote.cycle.Hilt_CycleOnBoardingManualLoggingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1438960482, new a()));
    }

    @Override // com.withings.manualLogging.ui.feature.addNote.cycle.Hilt_CycleOnBoardingManualLoggingActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        androidx.appcompat.app.c cVar = this.f40797j;
        if (cVar != null) {
            cVar.dismiss();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        androidx.appcompat.app.c cVar = this.f40797j;
        if (cVar != null) {
            cVar.dismiss();
        }
        super.onPause();
    }
}

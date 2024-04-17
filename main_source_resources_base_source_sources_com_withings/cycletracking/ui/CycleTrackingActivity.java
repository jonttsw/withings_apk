package com.withings.cycletracking.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.withings.cycletracking.ui.f2;
import com.withings.features.FeatureFlag;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.C1987R;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.LocalDate;
/* compiled from: CycleTrackingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/cycletracking/ui/CycleTrackingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleTrackingActivity extends Hilt_CycleTrackingActivity {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f35469l = {androidx.camera.core.v.c(CycleTrackingActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(CycleTrackingActivity.class, "period", "getPeriod()I", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ch.d f35470e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public r70.c f35471f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public gn.b f35472g;

    /* renamed from: h  reason: collision with root package name */
    private final b f35473h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final c f35474i = new c(this);

    /* renamed from: j  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f35475j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f35476k;

    /* compiled from: CycleTrackingActivity.kt */
    /* loaded from: classes3.dex */
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
                yk.o.b(false, s1.b.b(aVar2, -2003486859, new q0(CycleTrackingActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35478a = nm0.h.b(new s0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35479b;

        public b(Activity activity) {
            this.f35479b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f35478a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35480a = nm0.h.b(new t0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35481b;

        public c(Activity activity) {
            this.f35481b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f35480a.getValue();
        }
    }

    public CycleTrackingActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new d(this, 0));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f35475j = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new Object());
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f35476k = registerForActivityResult2;
    }

    public static final void B3(CycleTrackingActivity cycleTrackingActivity, r8.n nVar, long j5) {
        cycleTrackingActivity.getClass();
        f2.a.f35555b.getClass();
        androidx.navigation.e.L(nVar, "FactorEditionBottomSheet/" + j5, null, 6);
    }

    public static final void C3(CycleTrackingActivity cycleTrackingActivity, r8.n nVar, Map map) {
        cycleTrackingActivity.getClass();
        if (wr.b.c(FeatureFlag.f39108e)) {
            v70.a.c("period_calendar", map, 2);
            androidx.navigation.e.L(nVar, "VerticalCalendarPeriodLog", null, 6);
            return;
        }
        J3(cycleTrackingActivity, "period", false, 6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:9)(2:34|35))(2:36|(2:38|(1:40))(2:41|42))|10|11|12|(2:14|(2:27|28)(5:20|21|(1:23)|24|25))(2:29|30)))|43|6|(0)(0)|10|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        r8 = nm0.l.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:20:0x0051, B:22:0x0055, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:31:0x007e, B:32:0x0085, B:33:0x0086, B:34:0x008b), top: B:44:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:20:0x0051, B:22:0x0055, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:31:0x007e, B:32:0x0085, B:33:0x0086, B:34:0x008b), top: B:44:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E3(com.withings.cycletracking.ui.CycleTrackingActivity r7, qm0.d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.withings.cycletracking.ui.r0
            if (r0 == 0) goto L16
            r0 = r8
            com.withings.cycletracking.ui.r0 r0 = (com.withings.cycletracking.ui.r0) r0
            int r1 = r0.f35741d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f35741d = r1
            goto L1b
        L16:
            com.withings.cycletracking.ui.r0 r0 = new com.withings.cycletracking.ui.r0
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f35739b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f35741d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.withings.cycletracking.ui.CycleTrackingActivity r7 = r0.f35738a
            nm0.l.b(r8)
            goto L4f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            nm0.l.b(r8)
            r70.c r8 = r7.f35471f
            if (r8 == 0) goto L9d
            long r5 = r7.getUserId()
            r0.f35738a = r7
            r0.f35741d = r4
            kotlinx.coroutines.flow.Flow r8 = r8.g(r5)
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r8, r0)
            if (r8 != r1) goto L4f
            goto L9c
        L4f:
            com.withings.user.core.models.User r8 = (com.withings.user.core.models.User) r8
            ch.d r0 = r7.f35470e     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L86
            ah.d r0 = r0.s()     // Catch: java.lang.Throwable -> L7c
            if (r8 == 0) goto L7e
            com.withings.user.core.models.User$Names r1 = r8.getNames()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L7e
            java.lang.String r1 = r1.getFirst()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L7e
            com.withings.user.core.models.User$Names r8 = r8.getNames()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = r8.getLast()     // Catch: java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.lang.Throwable -> L7c
            android.content.Intent r8 = ah.d.f(r7, r1, r8)     // Catch: java.lang.Throwable -> L7c
            r7.startActivity(r8)     // Catch: java.lang.Throwable -> L7c
            nm0.y r8 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L7c
            goto L90
        L7c:
            r8 = move-exception
            goto L8c
        L7e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "null first name"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L7c
        L86:
            java.lang.String r8 = "intentBuilder"
            kotlin.jvm.internal.u.s(r8)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L8c:
            nm0.k$a r8 = nm0.l.a(r8)
        L90:
            java.lang.Throwable r8 = nm0.k.b(r8)
            if (r8 != 0) goto L97
            goto L9a
        L97:
            r7.G3()
        L9a:
            nm0.y r1 = nm0.y.f85009a
        L9c:
            return r1
        L9d:
            java.lang.String r7 = "userRepository"
            kotlin.jvm.internal.u.s(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.CycleTrackingActivity.E3(com.withings.cycletracking.ui.CycleTrackingActivity, qm0.d):java.lang.Object");
    }

    public static final void F3(CycleTrackingActivity cycleTrackingActivity, LocalDate localDate) {
        ch.d dVar = cycleTrackingActivity.f35470e;
        if (dVar != null) {
            ah.g e11 = dVar.e();
            long userId = cycleTrackingActivity.getUserId();
            long millis = localDate.toDateTimeAtStartOfDay().getMillis();
            e11.getClass();
            cycleTrackingActivity.f35475j.a(ah.g.m(cycleTrackingActivity, userId, millis, "symptoms"));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3() {
        nm0.j jVar = new nm0.j(getString(C1987R.string.authentication_error_generic), "");
        String str = (String) jVar.a();
        String str2 = (String) jVar.b();
        kotlin.jvm.internal.u.g(str);
        kotlin.jvm.internal.u.g(str2);
        H3(str, str2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(String str, String str2, final boolean z5) {
        String str3;
        qc.b bVar = new qc.b(this);
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = " : ";
        }
        bVar.v(str + str3 + str2);
        bVar.x(C1987R.string._OK_, new DialogInterface.OnClickListener() { // from class: com.withings.cycletracking.ui.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                fn0.k<Object>[] kVarArr = CycleTrackingActivity.f35469l;
                CycleTrackingActivity this$0 = this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (z5) {
                    this$0.finish();
                }
            }
        });
        bVar.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void J3(CycleTrackingActivity cycleTrackingActivity, String str, boolean z5, int i11) {
        if ((i11 & 1) != 0) {
            str = "loading";
        }
        String str2 = str;
        if ((i11 & 2) != 0) {
            z5 = false;
        }
        boolean z11 = z5;
        ch.d dVar = cycleTrackingActivity.f35470e;
        if (dVar != null) {
            cycleTrackingActivity.f35476k.a(ch.a.a(dVar.B(), cycleTrackingActivity, 0, cycleTrackingActivity.getUserId(), 0L, z11, str2, 10));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K3(CycleTrackingActivity cycleTrackingActivity, LocalDate localDate) {
        ch.d dVar = cycleTrackingActivity.f35470e;
        if (dVar != null) {
            ah.g e11 = dVar.e();
            long userId = cycleTrackingActivity.getUserId();
            long millis = localDate.toDateTimeAtStartOfDay().getMillis();
            e11.getClass();
            cycleTrackingActivity.f35475j.a(ah.g.m(cycleTrackingActivity, userId, millis, "daily"));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getUserId() {
        return ((Number) this.f35473h.getValue(this, f35469l[0])).longValue();
    }

    public static final int z3(CycleTrackingActivity cycleTrackingActivity) {
        return ((Number) cycleTrackingActivity.f35474i.getValue(cycleTrackingActivity, f35469l[1])).intValue();
    }

    @Override // com.withings.cycletracking.ui.Hilt_CycleTrackingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -575976357, new a()));
    }
}

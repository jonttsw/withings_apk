package com.withings.wiscale2.sleep.ui.edition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.core.view.l1;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.search.j;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import ei0.q;
import fn0.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import m0.t;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: NightEditionActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/edition/NightEditionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NightEditionActivity extends Hilt_NightEditionActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public q f60437e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f60438f = nm0.h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f60439g = nm0.h.b(new c());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60440h = nm0.h.b(new d());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60441i = nm0.h.b(new f());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60442j = nm0.h.b(new h());

    /* renamed from: k  reason: collision with root package name */
    private final g f60443k = new g(this);

    /* renamed from: l  reason: collision with root package name */
    private final MutableSharedFlow<Track> f60444l = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);

    /* renamed from: m  reason: collision with root package name */
    private boolean f60445m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f60446n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f60447o;

    /* renamed from: p  reason: collision with root package name */
    private DateTime f60448p;

    /* renamed from: q  reason: collision with root package name */
    private DateTime f60449q;

    /* renamed from: r  reason: collision with root package name */
    private DateTime f60450r;

    /* renamed from: s  reason: collision with root package name */
    private DateTime f60451s;

    /* renamed from: t  reason: collision with root package name */
    private DateTime f60452t;

    /* renamed from: v  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f60436v = {v.c(NightEditionActivity.class, "sleepTrackId", "getSleepTrackId()J", 0)};

    /* renamed from: u  reason: collision with root package name */
    public static final a f60435u = new Object();

    /* compiled from: NightEditionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: NightEditionActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) NightEditionActivity.this.findViewById(C1987R.id.asleep_value);
        }
    }

    /* compiled from: NightEditionActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) NightEditionActivity.this.findViewById(C1987R.id.awake_value);
        }
    }

    /* compiled from: NightEditionActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<CheckBox> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final CheckBox invoke() {
            return (CheckBox) NightEditionActivity.this.findViewById(C1987R.id.fill_gap);
        }
    }

    /* compiled from: NightEditionActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$onCreate$1", f = "NightEditionActivity.kt", l = {94, 95}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Track f60456a;

        /* renamed from: b  reason: collision with root package name */
        int f60457b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NightEditionActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$onCreate$1$sleepTrack$1", f = "NightEditionActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends i implements p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ NightEditionActivity f60459a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NightEditionActivity nightEditionActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60459a = nightEditionActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60459a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                NightEditionActivity nightEditionActivity = this.f60459a;
                q qVar = nightEditionActivity.f60437e;
                if (qVar != null) {
                    return qVar.o(NightEditionActivity.I3(nightEditionActivity));
                }
                u.s("sleepTrackManager");
                throw null;
            }
        }

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f60457b
                r2 = 0
                r3 = 2
                r4 = 1
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity r5 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.this
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                com.withings.wiscale2.track.data.Track r0 = r8.f60456a
                nm0.l.b(r9)
                goto L48
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                nm0.l.b(r9)
                goto L36
            L21:
                nm0.l.b(r9)
                kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$e$a r1 = new com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$e$a
                r1.<init>(r5, r2)
                r8.f60457b = r4
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)
                if (r9 != r0) goto L36
                return r0
            L36:
                com.withings.wiscale2.track.data.Track r9 = (com.withings.wiscale2.track.data.Track) r9
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.J3(r5)
                r8.f60456a = r9
                r8.f60457b = r3
                java.lang.Object r1 = r1.emit(r9, r8)
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r9
            L48:
                org.joda.time.DateTime r9 = r0.getStartDate()
                android.os.Parcelable r1 = r0.getData()
                java.lang.String r3 = "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData"
                kotlin.jvm.internal.u.h(r1, r3)
                com.withings.wiscale2.track.data.SleepTrackData r1 = (com.withings.wiscale2.track.data.SleepTrackData) r1
                org.joda.time.Duration r1 = r1.getDurationToSleep()
                org.joda.time.DateTime r9 = r9.plus(r1)
                java.lang.String r1 = "plus(...)"
                kotlin.jvm.internal.u.i(r9, r1)
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.V3(r5, r9)
                org.joda.time.DateTime r9 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.G3(r5)
                java.lang.String r1 = "awakeTime"
                if (r9 == 0) goto Lce
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.X3(r5, r9)
                org.joda.time.DateTime r9 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.E3(r5)
                java.lang.String r3 = "asleepTime"
                if (r9 == 0) goto Lca
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.W3(r5, r9)
                org.joda.time.DateTime r9 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.E3(r5)
                if (r9 == 0) goto Lc6
                org.joda.time.DateTime r3 = new org.joda.time.DateTime
                r6 = 0
                r3.<init>(r6)
                java.lang.String r4 = "You should provide a valid asleep time"
                com.withings.util.log.Fail.b(r4, r9, r3)
                org.joda.time.DateTime r9 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.G3(r5)
                if (r9 == 0) goto Lc2
                org.joda.time.DateTime r1 = new org.joda.time.DateTime
                r1.<init>(r6)
                java.lang.String r2 = "You should provide a valid awake time"
                com.withings.util.log.Fail.b(r2, r9, r1)
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.Z3(r5)
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.D3(r5, r0)
                com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.R3(r5)
                android.widget.CheckBox r9 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.H3(r5)
                boolean r1 = r0.getBlankVasistasFilled()
                r9.setChecked(r1)
                android.widget.CheckBox r9 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.H3(r5)
                com.withings.wiscale2.sleep.ui.edition.c r1 = new com.withings.wiscale2.sleep.ui.edition.c
                r1.<init>()
                r9.setOnCheckedChangeListener(r1)
                nm0.y r9 = nm0.y.f85009a
                return r9
            Lc2:
                kotlin.jvm.internal.u.s(r1)
                throw r2
            Lc6:
                kotlin.jvm.internal.u.s(r3)
                throw r2
            Lca:
                kotlin.jvm.internal.u.s(r3)
                throw r2
            Lce:
                kotlin.jvm.internal.u.s(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: NightEditionActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<Button> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) NightEditionActivity.this.findViewById(C1987R.id.save);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60461a = nm0.h.b(new com.withings.wiscale2.sleep.ui.edition.e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60462b;

        public g(Activity activity) {
            this.f60462b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f60461a.getValue();
        }
    }

    /* compiled from: NightEditionActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.a<Button> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) NightEditionActivity.this.findViewById(C1987R.id.undo_night_edition);
        }
    }

    public static void A3(View view, NightEditionActivity this$0) {
        u.j(this$0, "this$0");
        u.g(view);
        DateTime dateTime = this$0.f60449q;
        if (dateTime != null) {
            FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
            u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            uk.c.b(supportFragmentManager, dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), DateFormat.is24HourFormat(this$0), new com.withings.wiscale2.sleep.ui.edition.b(view, this$0));
            return;
        }
        u.s("awakeTime");
        throw null;
    }

    public static void B3(NightEditionActivity this$0) {
        u.j(this$0, "this$0");
        if (this$0.f60447o || this$0.f60446n || this$0.f60445m) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this$0), null, null, new com.withings.wiscale2.sleep.ui.edition.d(this$0, null), 3, null);
        } else {
            this$0.finish();
        }
    }

    public static void C3(NightEditionActivity this$0) {
        u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(t.l(this$0), null, null, new com.withings.wiscale2.sleep.ui.edition.f(this$0, null), 3, null);
    }

    public static final void D3(NightEditionActivity nightEditionActivity, Track track) {
        nightEditionActivity.getClass();
        if (track.getManualStartDate() != null || track.getManualEndDate() != null || track.getBlankVasistasFilled()) {
            ((Button) nightEditionActivity.f60442j.getValue()).setVisibility(0);
        }
    }

    public static final TextView F3(NightEditionActivity nightEditionActivity) {
        return (TextView) nightEditionActivity.f60438f.getValue();
    }

    public static final CheckBox H3(NightEditionActivity nightEditionActivity) {
        return (CheckBox) nightEditionActivity.f60440h.getValue();
    }

    public static final long I3(NightEditionActivity nightEditionActivity) {
        return ((Number) nightEditionActivity.f60443k.getValue(nightEditionActivity, f60436v[0])).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r0 > r3.getMinuteOfHour()) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.joda.time.DateTime L3(com.withings.wiscale2.sleep.ui.edition.NightEditionActivity r6) {
        /*
            org.joda.time.DateTime r0 = r6.f60450r
            r1 = 0
            java.lang.String r2 = "updatedAsleepTime"
            if (r0 == 0) goto Lbf
            int r0 = r0.getHourOfDay()
            org.joda.time.DateTime r3 = r6.f60451s
            java.lang.String r4 = "updatedAwakeTime"
            if (r3 == 0) goto Lbb
            int r3 = r3.getHourOfDay()
            java.lang.String r5 = "awakeTime"
            if (r0 > r3) goto L8a
            org.joda.time.DateTime r0 = r6.f60450r
            if (r0 == 0) goto L86
            int r0 = r0.getHourOfDay()
            org.joda.time.DateTime r3 = r6.f60451s
            if (r3 == 0) goto L82
            int r3 = r3.getHourOfDay()
            if (r0 != r3) goto L46
            org.joda.time.DateTime r0 = r6.f60450r
            if (r0 == 0) goto L42
            int r0 = r0.getMinuteOfHour()
            org.joda.time.DateTime r3 = r6.f60451s
            if (r3 == 0) goto L3e
            int r3 = r3.getMinuteOfHour()
            if (r0 <= r3) goto L46
            goto L8a
        L3e:
            kotlin.jvm.internal.u.s(r4)
            throw r1
        L42:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        L46:
            org.joda.time.DateTime r0 = r6.f60450r
            if (r0 == 0) goto L7e
            org.joda.time.DateTime r2 = r6.f60449q
            if (r2 == 0) goto L7a
            int r2 = r2.getYear()
            org.joda.time.DateTime r0 = r0.withYear(r2)
            org.joda.time.DateTime r2 = r6.f60449q
            if (r2 == 0) goto L76
            int r2 = r2.getMonthOfYear()
            org.joda.time.DateTime r0 = r0.withMonthOfYear(r2)
            org.joda.time.DateTime r6 = r6.f60449q
            if (r6 == 0) goto L72
            int r6 = r6.getDayOfMonth()
            org.joda.time.DateTime r6 = r0.withDayOfMonth(r6)
            kotlin.jvm.internal.u.g(r6)
            goto Lb2
        L72:
            kotlin.jvm.internal.u.s(r5)
            throw r1
        L76:
            kotlin.jvm.internal.u.s(r5)
            throw r1
        L7a:
            kotlin.jvm.internal.u.s(r5)
            throw r1
        L7e:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        L82:
            kotlin.jvm.internal.u.s(r4)
            throw r1
        L86:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        L8a:
            org.joda.time.DateTime r0 = r6.f60449q
            if (r0 == 0) goto Lb7
            r3 = 1
            org.joda.time.DateTime r0 = r0.minusDays(r3)
            org.joda.time.DateTime r6 = r6.f60450r
            if (r6 == 0) goto Lb3
            int r1 = r0.getYear()
            org.joda.time.DateTime r6 = r6.withYear(r1)
            int r1 = r0.getMonthOfYear()
            org.joda.time.DateTime r6 = r6.withMonthOfYear(r1)
            int r0 = r0.getDayOfMonth()
            org.joda.time.DateTime r6 = r6.withDayOfMonth(r0)
            kotlin.jvm.internal.u.g(r6)
        Lb2:
            return r6
        Lb3:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        Lb7:
            kotlin.jvm.internal.u.s(r5)
            throw r1
        Lbb:
            kotlin.jvm.internal.u.s(r4)
            throw r1
        Lbf:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.L3(com.withings.wiscale2.sleep.ui.edition.NightEditionActivity):org.joda.time.DateTime");
    }

    public static final void R3(NightEditionActivity nightEditionActivity) {
        ((TextView) nightEditionActivity.f60438f.getValue()).setOnClickListener(new com.withings.alarm.ui.f(nightEditionActivity, 14));
        ((TextView) nightEditionActivity.f60439g.getValue()).setOnClickListener(new androidx.media3.ui.h(nightEditionActivity, 20));
        ((Button) nightEditionActivity.f60441i.getValue()).setOnClickListener(new androidx.media3.ui.i(nightEditionActivity, 20));
        ((Button) nightEditionActivity.f60442j.getValue()).setOnClickListener(new j(nightEditionActivity, 17));
    }

    public static final void Y3(NightEditionActivity nightEditionActivity) {
        boolean z5;
        Button button = (Button) nightEditionActivity.f60441i.getValue();
        if (!nightEditionActivity.f60447o && !nightEditionActivity.f60445m && !nightEditionActivity.f60446n) {
            z5 = false;
        } else {
            z5 = true;
        }
        button.setEnabled(z5);
    }

    public static final void Z3(NightEditionActivity nightEditionActivity) {
        TextView textView = (TextView) nightEditionActivity.f60438f.getValue();
        DateTime dateTime = nightEditionActivity.f60450r;
        if (dateTime != null) {
            textView.setText(b50.b.t(nightEditionActivity, dateTime));
            TextView textView2 = (TextView) nightEditionActivity.f60439g.getValue();
            DateTime dateTime2 = nightEditionActivity.f60451s;
            if (dateTime2 != null) {
                textView2.setText(b50.b.t(nightEditionActivity, dateTime2));
                return;
            } else {
                u.s("updatedAwakeTime");
                throw null;
            }
        }
        u.s("updatedAsleepTime");
        throw null;
    }

    public static void z3(View view, NightEditionActivity this$0) {
        u.j(this$0, "this$0");
        u.g(view);
        DateTime dateTime = this$0.f60448p;
        if (dateTime != null) {
            FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
            u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            uk.c.b(supportFragmentManager, dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), DateFormat.is24HourFormat(this$0), new com.withings.wiscale2.sleep.ui.edition.b(view, this$0));
            return;
        }
        u.s("asleepTime");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 14 && i12 == -1) {
            setResult(11);
            finish();
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.edition.Hilt_NightEditionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        setContentView(C1987R.layout.activity_night_edition);
        View findViewById = findViewById(C1987R.id.app_bar);
        u.i(findViewById, "findViewById(...)");
        ay.b.n(findViewById, true, false, 29);
        View findViewById2 = findViewById(C1987R.id.root);
        u.i(findViewById2, "findViewById(...)");
        ay.b.n(findViewById2, false, true, 23);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        this.f60448p = new DateTime(getIntent().getLongExtra("EXTRA_ASLEEP_TIME", 0L));
        this.f60449q = new DateTime(getIntent().getLongExtra("EXTRA_AWAKE_TIME", 0L));
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new e(null), 3, null);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

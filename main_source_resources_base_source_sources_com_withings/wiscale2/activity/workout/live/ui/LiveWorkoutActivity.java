package com.withings.wiscale2.activity.workout.live.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.camera.core.y1;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.views.view.CircleProgressView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import java.io.Serializable;
import java.util.Timer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: LiveWorkoutActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/LiveWorkoutActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "CloseActivityBroadcastReceiver", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LiveWorkoutActivity extends Hilt_LiveWorkoutActivity {
    static final /* synthetic */ fn0.k<Object>[] A = {androidx.camera.core.v.c(LiveWorkoutActivity.class, "liveWorkout", "getLiveWorkout()Lcom/withings/liveworkout/model/LiveWorkout;", 0)};

    /* renamed from: z  reason: collision with root package name */
    public static final a f48791z = new Object();
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ax.c f48792e;

    /* renamed from: f  reason: collision with root package name */
    private final CloseActivityBroadcastReceiver f48793f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f48794g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f48795h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f48796i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f48797j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f48798k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f48799l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f48800m;

    /* renamed from: n  reason: collision with root package name */
    private Timer f48801n;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public d1 f48802o;

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f48803p;

    /* renamed from: q  reason: collision with root package name */
    private final Handler f48804q;

    /* renamed from: r  reason: collision with root package name */
    private final e0.z f48805r;

    /* renamed from: s  reason: collision with root package name */
    private final nm0.g f48806s;

    /* renamed from: t  reason: collision with root package name */
    private long f48807t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f48808u;

    /* renamed from: v  reason: collision with root package name */
    private final g f48809v;

    /* renamed from: w  reason: collision with root package name */
    private final Handler f48810w;

    /* renamed from: x  reason: collision with root package name */
    private final e0.a0 f48811x;

    /* renamed from: y  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f48812y;

    /* compiled from: LiveWorkoutActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/LiveWorkoutActivity$CloseActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class CloseActivityBroadcastReceiver extends BroadcastReceiver {
        public CloseActivityBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(intent, "intent");
            LiveWorkoutActivity liveWorkoutActivity = LiveWorkoutActivity.this;
            LiveWorkoutActivity.Q3(liveWorkoutActivity, false);
            if (u70.a.b().e()) {
                MainActivity.f47950r.getClass();
                liveWorkoutActivity.startActivity(MainActivity.a.a(liveWorkoutActivity));
            }
            liveWorkoutActivity.finish();
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, LiveWorkout liveWorkout) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(liveWorkout, "liveWorkout");
            Intent flags = new Intent(context, LiveWorkoutActivity.class).putExtra("extra_live_workout", liveWorkout).setFlags(805306368);
            kotlin.jvm.internal.u.i(flags, "setFlags(...)");
            return flags;
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f48814a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48815b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f48816c;

        /* renamed from: d  reason: collision with root package name */
        private final ym0.a<nm0.y> f48817d;

        public b(String str, String str2, boolean z5, ym0.a<nm0.y> aVar) {
            this.f48814a = str;
            this.f48815b = str2;
            this.f48816c = z5;
            this.f48817d = aVar;
        }

        public final String a() {
            return this.f48815b;
        }

        public final String b() {
            return this.f48814a;
        }

        public final ym0.a<nm0.y> c() {
            return this.f48817d;
        }

        public final boolean d() {
            return this.f48816c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f48814a, bVar.f48814a) && kotlin.jvm.internal.u.e(this.f48815b, bVar.f48815b) && this.f48816c == bVar.f48816c && kotlin.jvm.internal.u.e(this.f48817d, bVar.f48817d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a11 = y1.a(this.f48816c, defpackage.d.c(this.f48815b, this.f48814a.hashCode() * 31, 31), 31);
            ym0.a<nm0.y> aVar = this.f48817d;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return a11 + hashCode;
        }

        public final String toString() {
            return "ToastValue(label=" + this.f48814a + ", description=" + this.f48815b + ", isGoodStatus=" + this.f48816c + ", onClick=" + this.f48817d + ")";
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) LiveWorkoutActivity.this.findViewById(C1987R.id.camera);
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) LiveWorkoutActivity.this.findViewById(C1987R.id.help_stop_button);
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<View> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return LiveWorkoutActivity.this.findViewById(C1987R.id.status_connection_watch_background);
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<ImageButton> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final ImageButton invoke() {
            return (ImageButton) LiveWorkoutActivity.this.findViewById(C1987R.id.resume_pause_button);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class g implements bn0.d<Activity, LiveWorkout> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48822a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48823b;

        public g(Activity activity) {
            this.f48823b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.liveworkout.model.LiveWorkout, java.lang.Object] */
        @Override // bn0.d
        public final LiveWorkout getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f48822a.getValue();
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<ImageButton> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final ImageButton invoke() {
            return (ImageButton) LiveWorkoutActivity.this.findViewById(C1987R.id.stop_button);
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<CircleProgressView> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final CircleProgressView invoke() {
            return (CircleProgressView) LiveWorkoutActivity.this.findViewById(C1987R.id.stop_loading);
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes4.dex */
    public static final class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LiveWorkoutActivity.this.S3().setVisibility(4);
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            return (ComposeView) LiveWorkoutActivity.this.findViewById(C1987R.id.compose_view);
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<Vibrator> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final Vibrator invoke() {
            Object systemService = LiveWorkoutActivity.this.getSystemService("vibrator");
            kotlin.jvm.internal.u.h(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    /* compiled from: LiveWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.a<z0> {
        m() {
            super(0);
        }

        @Override // ym0.a
        public final z0 invoke() {
            a aVar = LiveWorkoutActivity.f48791z;
            LiveWorkoutActivity liveWorkoutActivity = LiveWorkoutActivity.this;
            liveWorkoutActivity.getClass();
            return (z0) new k1(liveWorkoutActivity, new com.withings.wiscale2.activity.workout.live.ui.i(liveWorkoutActivity)).a(z0.class);
        }
    }

    public LiveWorkoutActivity() {
        super(0);
        this.f48793f = new CloseActivityBroadcastReceiver();
        this.f48794g = nm0.h.b(new e());
        this.f48795h = nm0.h.b(new k());
        this.f48796i = nm0.h.b(new d());
        this.f48797j = nm0.h.b(new f());
        this.f48798k = nm0.h.b(new h());
        this.f48799l = nm0.h.b(new i());
        this.f48800m = nm0.h.b(new c());
        this.f48803p = nm0.h.b(new m());
        this.f48804q = new Handler();
        this.f48805r = new e0.z(this, 4);
        this.f48806s = nm0.h.b(new l());
        this.f48809v = new g(this);
        this.f48810w = new Handler(Looper.getMainLooper());
        this.f48811x = new e0.a0(this, 3);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.wiscale2.activity.workout.live.ui.g(this, 0));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f48812y = registerForActivityResult;
    }

    public static void A3(LiveWorkoutActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == -1 && this$0.U3().v1()) {
            this$0.V3();
        }
    }

    public static void B3(LiveWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.U3().w1();
    }

    public static void C3(LiveWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.V3();
    }

    public static void D3(LiveWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        z0 U3 = this$0.U3();
        U3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(U3), Dispatchers.getIO(), null, new a1(U3, null), 2, null);
    }

    public static boolean E3(LiveWorkoutActivity this$0, MotionEvent motionEvent) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return this$0.onTouchEvent(motionEvent);
            }
            Timer timer = this$0.f48801n;
            if (timer != null) {
                timer.cancel();
                this$0.W3();
                return true;
            }
            kotlin.jvm.internal.u.s("stopTimer");
            throw null;
        }
        this$0.X3(false);
        long integer = this$0.getResources().getInteger(17694720);
        nm0.g gVar = this$0.f48796i;
        Object value = gVar.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((TextView) value).animate().setDuration(integer).alpha(1.0f);
        Object value2 = gVar.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        ((TextView) value2).postDelayed(new t(this$0, integer), 3000L);
        CircleProgressView S3 = this$0.S3();
        S3.setVisibility(0);
        S3.setProgress(0.0f);
        S3.a(1000.0f, 1000);
        this$0.f48807t = System.currentTimeMillis();
        Timer timer2 = new Timer();
        this$0.f48801n = timer2;
        timer2.schedule(new u(this$0), 1000L);
        return true;
    }

    public static final void F3(LiveWorkoutActivity liveWorkoutActivity, Boolean bool) {
        int i11;
        Object value = liveWorkoutActivity.f48800m.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ImageView imageView = (ImageView) value;
        if (bool != null && bool.booleanValue()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        Object value2 = liveWorkoutActivity.f48800m.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        ((ImageView) value2).setOnClickListener(new com.withings.alarm.ui.f(liveWorkoutActivity, 5));
    }

    public static final TextView G3(LiveWorkoutActivity liveWorkoutActivity) {
        Object value = liveWorkoutActivity.f48796i.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (TextView) value;
    }

    public static final LiveWorkout H3(LiveWorkoutActivity liveWorkoutActivity) {
        return (LiveWorkout) liveWorkoutActivity.f48809v.getValue(liveWorkoutActivity, A[0]);
    }

    public static final ImageButton J3(LiveWorkoutActivity liveWorkoutActivity) {
        Object value = liveWorkoutActivity.f48797j.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (ImageButton) value;
    }

    public static final void M3(LiveWorkoutActivity liveWorkoutActivity, boolean z5) {
        androidx.transition.w.a(liveWorkoutActivity.T3(), null);
        ViewGroup.LayoutParams layoutParams = liveWorkoutActivity.T3().getLayoutParams();
        kotlin.jvm.internal.u.h(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f11942k = -1;
        layoutParams2.f11938i = 0;
        liveWorkoutActivity.T3().requestLayout();
        if (z5) {
            liveWorkoutActivity.f48810w.postDelayed(liveWorkoutActivity.f48811x, 3000L);
        }
    }

    public static final void N3(LiveWorkoutActivity liveWorkoutActivity, LiveWorkout liveWorkout) {
        int i11;
        liveWorkoutActivity.getClass();
        boolean isInPause = liveWorkout.isInPause();
        liveWorkoutActivity.f48808u = isInPause;
        if (isInPause) {
            i11 = C1987R.drawable.icon_medium_navigation_playerplay;
        } else {
            i11 = C1987R.drawable.icon_medium_navigation_playerpause;
        }
        Object value = liveWorkoutActivity.f48797j.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((ImageButton) value).setImageDrawable(androidx.core.content.a.getDrawable(liveWorkoutActivity, i11));
        Intent putExtra = new Intent("com.withings.wiscale2.activity.workout.live.ui.ACTION_LIVE_WORKOUT").setPackage(liveWorkoutActivity.getPackageName()).putExtra("extra_live_workout", liveWorkout);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        liveWorkoutActivity.sendBroadcast(putExtra);
    }

    public static final void O3(LiveWorkoutActivity liveWorkoutActivity, boolean z5) {
        Object value = liveWorkoutActivity.f48794g.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ViewGroup.LayoutParams layoutParams = ((View) value).getLayoutParams();
        kotlin.jvm.internal.u.h(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (z5) {
            layoutParams2.f11938i = -1;
            layoutParams2.f11944l = -1;
            layoutParams2.f11940j = 0;
        } else {
            layoutParams2.f11940j = -1;
            layoutParams2.f11938i = -1;
            layoutParams2.f11944l = 0;
        }
        Object value2 = liveWorkoutActivity.f48794g.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        ((View) value2).requestLayout();
    }

    public static final void Q3(LiveWorkoutActivity liveWorkoutActivity, boolean z5) {
        liveWorkoutActivity.getClass();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new v(liveWorkoutActivity, z5, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CircleProgressView S3() {
        Object value = this.f48799l.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (CircleProgressView) value;
    }

    private final ComposeView T3() {
        Object value = this.f48795h.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (ComposeView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0 U3() {
        return (z0) this.f48803p.getValue();
    }

    private final void V3() {
        androidx.transition.w.a(T3(), null);
        ViewGroup.LayoutParams layoutParams = T3().getLayoutParams();
        kotlin.jvm.internal.u.h(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f11938i = -1;
        layoutParams2.f11942k = 0;
        T3().requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W3() {
        CircleProgressView S3 = S3();
        S3.setProgress((float) (System.currentTimeMillis() - this.f48807t));
        S3.a(0.0f, 300);
        S3.postDelayed(new j(), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X3(boolean z5) {
        long[] jArr;
        if (z5) {
            jArr = new long[]{0, 100, 25, 100};
        } else {
            jArr = new long[]{0, 25};
        }
        ((Vibrator) this.f48806s.getValue()).vibrate(VibrationEffect.createWaveform(jArr, -1));
    }

    public static void z3(LiveWorkoutActivity this$0) {
        int i11;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.X3(false);
        boolean z5 = !this$0.f48808u;
        this$0.f48808u = z5;
        if (z5) {
            i11 = C1987R.drawable.icon_medium_navigation_playerplay;
        } else {
            i11 = C1987R.drawable.icon_medium_navigation_playerpause;
        }
        Object value = this$0.f48797j.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((ImageButton) value).setImageDrawable(androidx.core.content.a.getDrawable(this$0, i11));
        Handler handler = this$0.f48804q;
        e0.z zVar = this$0.f48805r;
        handler.removeCallbacks(zVar);
        handler.postDelayed(zVar, 500L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        U3().o1(i11, i12, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, android.view.View$OnApplyWindowInsetsListener] */
    @Override // com.withings.wiscale2.activity.workout.live.ui.Hilt_LiveWorkoutActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        T3().setContent(new s1.a(true, -903984549, new com.withings.wiscale2.activity.workout.live.ui.l(this)));
        Object value = this.f48797j.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((ImageButton) value).setOnClickListener(new androidx.media3.ui.h(this, 8));
        CircleProgressView S3 = S3();
        S3.setGoal(1000.0f);
        S3.setTextBottom("");
        S3.setTextMiddle("");
        Object value2 = this.f48798k.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        ((ImageButton) value2).setOnTouchListener(new com.google.android.material.search.i(this, 3));
        z0 U3 = U3();
        xw.d.c(this, U3.e1(), new com.withings.wiscale2.activity.workout.live.ui.m(this));
        xw.d.c(this, U3.m1(), new n(this));
        xw.d.c(this, U3.k1(), new o(this));
        xw.d.c(this, U3.i1(), new p(this));
        xw.d.c(this, U3.d1(), new q(this));
        xw.d.c(this, U3.t1(), new r(this));
        T3().setContent(new s1.a(true, -903984549, new com.withings.wiscale2.activity.workout.live.ui.l(this)));
        androidx.core.content.a.registerReceiver(this, this.f48793f, new IntentFilter("com.withings.wiscale2.activity.workout.live.ui.ACTION_CLOSE"), 4);
        findViewById(C1987R.id.root).setOnApplyWindowInsetsListener(new Object());
    }

    @Override // com.withings.wiscale2.activity.workout.live.ui.Hilt_LiveWorkoutActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        try {
            ay.b.w(this, this.f48793f);
        } catch (IllegalArgumentException unused) {
        }
        this.f48804q.removeCallbacks(this.f48805r);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Object obj;
        super.onNewIntent(intent);
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("extra_live_workout", LiveWorkout.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("extra_live_workout");
                if (!(serializableExtra instanceof LiveWorkout)) {
                    serializableExtra = null;
                }
                obj = (LiveWorkout) serializableExtra;
            }
            kotlin.jvm.internal.u.g(obj);
            LiveWorkout liveWorkout = (LiveWorkout) obj;
            U3().z1(liveWorkout);
            if (!liveWorkout.isInAppWorkout()) {
                U3().r1();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        U3().q1(i11, permissions, grantResults);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        U3().C1();
    }
}

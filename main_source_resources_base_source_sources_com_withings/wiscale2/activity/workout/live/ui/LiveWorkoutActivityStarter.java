package com.withings.wiscale2.activity.workout.live.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.h;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity;
import kotlin.Metadata;
import u70.a;
/* compiled from: LiveWorkoutActivityStarter.kt */
/* loaded from: classes4.dex */
public final class LiveWorkoutActivityStarter implements h.a, a.c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48830a;

    /* renamed from: b  reason: collision with root package name */
    private final u70.a f48831b;

    /* renamed from: c  reason: collision with root package name */
    private final bx.a f48832c;

    /* renamed from: d  reason: collision with root package name */
    private LiveWorkout f48833d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f48834e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f48835f;

    /* compiled from: LiveWorkoutActivityStarter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/LiveWorkoutActivityStarter$PermissionAskingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class PermissionAskingBroadcastReceiver extends BroadcastReceiver {
        public PermissionAskingBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(intent, "intent");
            LiveWorkoutActivityStarter liveWorkoutActivityStarter = LiveWorkoutActivityStarter.this;
            if (liveWorkoutActivityStarter.f48831b.e()) {
                if (!liveWorkoutActivityStarter.f48832c.c()) {
                    context.startActivity(com.withings.wiscale2.measure.accountmeasure.ui.add.g0.e(context, 0, 0, true, 14).addFlags(268435456));
                    return;
                }
                return;
            }
            liveWorkoutActivityStarter.i();
            MainActivity.f47950r.getClass();
            context.startActivity(MainActivity.a.a(context).addFlags(268435456));
        }
    }

    /* compiled from: LiveWorkoutActivityStarter.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<PermissionAskingBroadcastReceiver> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final PermissionAskingBroadcastReceiver invoke() {
            return new PermissionAskingBroadcastReceiver();
        }
    }

    public LiveWorkoutActivityStarter(Context context, u70.a aVar, bx.a sharedLiveWorkoutInfo) {
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(sharedLiveWorkoutInfo, "sharedLiveWorkoutInfo");
        this.f48830a = context;
        this.f48831b = aVar;
        this.f48832c = sharedLiveWorkoutInfo;
        this.f48834e = nm0.h.b(new a());
    }

    private final void g(LiveWorkout liveWorkout) {
        if (!this.f48832c.c()) {
            boolean z5 = this.f48835f;
            Context context = this.f48830a;
            if (z5) {
                this.f48835f = false;
                LiveWorkoutActivity.f48791z.getClass();
                context.startActivities(new Intent[]{LiveWorkoutActivity.a.a(context, liveWorkout), com.withings.wiscale2.measure.accountmeasure.ui.add.g0.e(context, 0, 0, true, 14)});
                return;
            }
            LiveWorkoutActivity.f48791z.getClass();
            context.startActivity(LiveWorkoutActivity.a.a(context, liveWorkout));
        }
    }

    private final void h(LiveWorkout liveWorkout) {
        Intent intent = new Intent("com.withings.wiscale2.activity.workout.live.ui.ACTION_LIVE_WORKOUT");
        Context context = this.f48830a;
        Intent putExtra = intent.setPackage(context.getPackageName()).putExtra("extra_live_workout", liveWorkout);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        context.sendBroadcast(putExtra);
    }

    @Override // u70.a.c
    public final long H() {
        return 0L;
    }

    @Override // ax.h.a
    public final void a(LiveWorkout liveWorkout) {
        this.f48833d = liveWorkout;
        if (this.f48831b.e()) {
            if (!this.f48832c.c()) {
                LiveWorkoutActivity.f48791z.getClass();
                Context context = this.f48830a;
                context.startActivity(LiveWorkoutActivity.a.a(context, liveWorkout));
                return;
            }
            return;
        }
        h(liveWorkout);
    }

    @Override // ax.h.a
    public final void c(LiveWorkout liveWorkout) {
        u70.a aVar = this.f48831b;
        aVar.a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("permission_asking_LiveWorkoutActivityStarter");
        androidx.core.content.a.registerReceiver(this.f48830a, (PermissionAskingBroadcastReceiver) this.f48834e.getValue(), intentFilter, 4);
        this.f48833d = liveWorkout;
        if (aVar.e()) {
            g(liveWorkout);
        }
    }

    @Override // ax.h.a
    public final void d(LiveWorkout liveWorkout, boolean z5) {
        Context context = this.f48830a;
        ay.b.w(context, (PermissionAskingBroadcastReceiver) this.f48834e.getValue());
        context.sendBroadcast(new Intent("com.withings.wiscale2.activity.workout.live.ui.ACTION_CLOSE").setPackage(context.getPackageName()));
        this.f48831b.h(this);
        this.f48833d = null;
    }

    @Override // ax.h.a
    public final void e(LiveWorkout liveWorkout) {
        this.f48833d = liveWorkout;
        if (this.f48831b.e()) {
            if (!this.f48832c.c()) {
                LiveWorkoutActivity.f48791z.getClass();
                Context context = this.f48830a;
                context.startActivity(LiveWorkoutActivity.a.a(context, liveWorkout));
                return;
            }
            return;
        }
        h(liveWorkout);
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        nm0.y yVar;
        LiveWorkout liveWorkout = this.f48833d;
        if (liveWorkout != null) {
            g(liveWorkout);
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            this.f48833d = null;
        }
    }

    public final void i() {
        this.f48835f = true;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}

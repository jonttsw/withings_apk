package com.withings.wiscale2.activity.workout.live.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Chronometer;
import com.withings.comm.wpp.generated.object.PauseState;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: LiveWorkoutChronometer.kt */
/* loaded from: classes4.dex */
public final class LiveWorkoutChronometer {

    /* renamed from: a  reason: collision with root package name */
    private final Chronometer f48838a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f48839b = nm0.h.b(new a());

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f48840c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveWorkoutBroadcastReceiver f48841d;

    /* compiled from: LiveWorkoutChronometer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/LiveWorkoutChronometer$LiveWorkoutBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class LiveWorkoutBroadcastReceiver extends BroadcastReceiver {
        public LiveWorkoutBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object obj;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(intent, "intent");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("extra_live_workout", LiveWorkout.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("extra_live_workout");
                if (!(serializableExtra instanceof LiveWorkout)) {
                    serializableExtra = null;
                }
                obj = (LiveWorkout) serializableExtra;
            }
            LiveWorkout liveWorkout = (LiveWorkout) obj;
            if (liveWorkout != null) {
                LiveWorkoutChronometer.this.e(liveWorkout);
            }
        }
    }

    /* compiled from: LiveWorkoutChronometer.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Animation> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Animation invoke() {
            Animation loadAnimation = AnimationUtils.loadAnimation(LiveWorkoutChronometer.this.f48838a.getContext(), C1987R.anim.fade_out_fade_in);
            loadAnimation.setRepeatCount(-1);
            return loadAnimation;
        }
    }

    public LiveWorkoutChronometer(Chronometer chronometer) {
        this.f48838a = chronometer;
        SharedPreferences sharedPreferences = chronometer.getContext().getSharedPreferences("workoutTimer", 0);
        kotlin.jvm.internal.u.i(sharedPreferences, "getSharedPreferences(...)");
        this.f48840c = sharedPreferences;
        LiveWorkoutBroadcastReceiver liveWorkoutBroadcastReceiver = new LiveWorkoutBroadcastReceiver();
        this.f48841d = liveWorkoutBroadcastReceiver;
        androidx.core.content.a.registerReceiver(chronometer.getContext(), liveWorkoutBroadcastReceiver, new IntentFilter("com.withings.wiscale2.activity.workout.live.ui.ACTION_LIVE_WORKOUT"), 4);
    }

    private static DateTime c(LiveWorkout liveWorkout) {
        PauseState pauseState = liveWorkout.getPauseState();
        if (pauseState == null) {
            return null;
        }
        int i11 = pauseState.startTime;
        Integer valueOf = Integer.valueOf(i11);
        if (i11 == 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return new DateTime(valueOf.intValue() * 1000);
    }

    private final DateTime d() {
        Long valueOf = Long.valueOf(this.f48840c.getLong("lastTimePaused", 0L));
        if (valueOf.longValue() == 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return new DateTime(valueOf.longValue());
    }

    public final void b() {
        this.f48840c.edit().putLong("lastTimePaused", 0L).apply();
        Chronometer chronometer = this.f48838a;
        Context context = chronometer.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        ay.b.w(context, this.f48841d);
        chronometer.stop();
    }

    public final void e(LiveWorkout liveWorkout) {
        boolean z5;
        long millis;
        LiveWorkout liveWorkout2;
        Long l5;
        kotlin.jvm.internal.u.j(liveWorkout, "liveWorkout");
        int i11 = 0;
        if (d() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean isInPause = liveWorkout.isInPause();
        SharedPreferences sharedPreferences = this.f48840c;
        if (isInPause && !z5) {
            DateTime c11 = c(liveWorkout);
            if (c11 != null) {
                l5 = Long.valueOf(c11.getMillis());
            } else {
                if (kotlin.jvm.internal.u.e(liveWorkout.getDeviceMacAddress(), LiveWorkout.PHONE_MAC_ADDRESS)) {
                    liveWorkout2 = liveWorkout;
                } else {
                    liveWorkout2 = null;
                }
                if (liveWorkout2 != null) {
                    l5 = Long.valueOf(DateTime.now().getMillis());
                } else {
                    l5 = null;
                }
            }
            if (l5 != null) {
                sharedPreferences.edit().putLong("lastTimePaused", l5.longValue()).apply();
            }
        } else if (!liveWorkout.isInPause() && z5) {
            sharedPreferences.edit().putLong("lastTimePaused", 0L).apply();
        }
        DateTime c12 = c(liveWorkout);
        if (c12 == null) {
            c12 = d();
        }
        DateTime dateTime = new DateTime(liveWorkout.getStartDateMillis());
        PauseState pauseState = liveWorkout.getPauseState();
        if (pauseState != null) {
            i11 = pauseState.sum;
        }
        long j5 = i11 * 1000;
        if (c12 != null) {
            millis = new Duration(dateTime, c12).getMillis();
        } else {
            millis = new Duration(dateTime, DateTime.now()).getMillis();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - (millis - j5);
        Chronometer chronometer = this.f48838a;
        chronometer.setBase(elapsedRealtime);
        boolean isInPause2 = liveWorkout.isInPause();
        if (u70.a.b().e()) {
            if (isInPause2) {
                chronometer.startAnimation((Animation) this.f48839b.getValue());
                chronometer.stop();
                return;
            }
            chronometer.clearAnimation();
            chronometer.start();
        }
    }
}

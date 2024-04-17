package com.withings.wiscale2.activity.workout.live.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ax.h;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.ui.detail.PostWorkoutActivity;
import com.withings.wiscale2.track.data.Track;
import org.joda.time.DateTime;
/* compiled from: EndOfLiveWorkoutNotifier.kt */
/* loaded from: classes4.dex */
public final class e implements h.a, WorkoutManager.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48877a;

    /* renamed from: b  reason: collision with root package name */
    private final m70.i f48878b;

    /* renamed from: c  reason: collision with root package name */
    private final u70.a f48879c;

    /* renamed from: d  reason: collision with root package name */
    private LiveWorkout f48880d;

    public e(Context context, m70.i userManager, u70.a aVar, WorkoutManager workoutManager) {
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f48877a = context;
        this.f48878b = userManager;
        this.f48879c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.core.app.u, androidx.core.app.q] */
    public static final Notification b(e eVar, long j5, User user) {
        Context context = eVar.f48877a;
        androidx.core.app.h0 m11 = androidx.core.app.h0.m(context);
        MainActivity.f47950r.getClass();
        m11.g(MainActivity.a.a(context));
        PostWorkoutActivity.f49060k.getClass();
        Intent putExtra = new Intent(context, PostWorkoutActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("workoutId", j5);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        m11.g(putExtra);
        PendingIntent p11 = m11.p(0, 67108864);
        kotlin.jvm.internal.u.g(p11);
        String string = context.getString(C1987R.string._APP_NAME_);
        String c11 = androidx.appcompat.widget.v0.c(string, "getString(...)", context, C1987R.string.workout_sessionStopNotificationTitle, "getString(...)");
        androidx.core.app.r rVar = new androidx.core.app.r(context, "workout_channel_session_finished");
        rVar.e(true);
        rVar.m(string);
        rVar.l(c11);
        rVar.y(1);
        rVar.u(true);
        rVar.B(2131231550);
        rVar.h(androidx.core.content.a.getColor(context, C1987R.color.statusInfo));
        ?? uVar = new androidx.core.app.u();
        uVar.f(c11);
        rVar.D(uVar);
        rVar.k(p11);
        Notification c12 = rVar.c();
        kotlin.jvm.internal.u.i(c12, "build(...)");
        return c12;
    }

    private final boolean h(Track track, boolean z5) {
        LiveWorkout liveWorkout;
        if (!z5 && (liveWorkout = this.f48880d) != null && track.getDeviceType() == 16 && track.getCategory() == liveWorkout.getWorkoutCategoryId() && kotlin.jvm.internal.u.e(track.getStartDate(), new DateTime(liveWorkout.getStartDateMillis()))) {
            return true;
        }
        return false;
    }

    @Override // ax.h.a
    public final void d(LiveWorkout liveWorkout, boolean z5) {
        this.f48880d = liveWorkout;
    }

    public final Context f() {
        return this.f48877a;
    }

    public final m70.i g() {
        return this.f48878b;
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackDeleted(long j5, Track track, boolean z5) {
        kotlin.jvm.internal.u.j(track, "track");
        if (track.getId() != null && h(track, z5)) {
            androidx.core.app.y.c(this.f48877a).b(ConstantsWs.WS_STATUS_WRONGMFGID, null);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackInserted(long j5, Track track, boolean z5) {
        kotlin.jvm.internal.u.j(track, "track");
        if (track.getId() != null && h(track, z5)) {
            if (this.f48879c.d(0L)) {
                int i11 = vh.h.f103738e;
                vh.h.f(new c(this, track)).s(new d(this, track));
                return;
            }
            int i12 = vh.h.f103738e;
            vh.h.f(new a(this, track)).s(new b(this, track));
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public final void onWorkoutTrackUpdated(long j5, Track oldTrack, Track newTrack, boolean z5) {
        kotlin.jvm.internal.u.j(oldTrack, "oldTrack");
        kotlin.jvm.internal.u.j(newTrack, "newTrack");
    }

    @Override // ax.h.a
    public final void a(LiveWorkout liveWorkout) {
    }

    @Override // ax.h.a
    public final void c(LiveWorkout liveWorkout) {
    }

    @Override // ax.h.a
    public final void e(LiveWorkout liveWorkout) {
    }
}

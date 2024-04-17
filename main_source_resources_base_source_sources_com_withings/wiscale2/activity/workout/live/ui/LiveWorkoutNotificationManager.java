package com.withings.wiscale2.activity.workout.live.ui;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import ax.h;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: LiveWorkoutNotificationManager.kt */
/* loaded from: classes4.dex */
public final class LiveWorkoutNotificationManager implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48844a;

    /* renamed from: b  reason: collision with root package name */
    private WorkoutStopBroadcastReceiver f48845b;

    /* compiled from: LiveWorkoutNotificationManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/LiveWorkoutNotificationManager$WorkoutStopBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class WorkoutStopBroadcastReceiver extends BroadcastReceiver {

        /* compiled from: LiveWorkoutNotificationManager.kt */
        /* loaded from: classes4.dex */
        static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LiveWorkout f48846a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LiveWorkout liveWorkout) {
                super(0);
                this.f48846a = liveWorkout;
            }

            @Override // ym0.a
            public final nm0.y invoke() {
                ax.h hVar = ax.h.f19725i;
                if (hVar != null) {
                    hVar.o(this.f48846a, false);
                    return nm0.y.f85009a;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        }

        public WorkoutStopBroadcastReceiver() {
            throw null;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object obj;
            Object serializableExtra;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(intent, "intent");
            if (kotlin.jvm.internal.u.e("action_stop_workout", intent.getAction())) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent.getSerializableExtra("extra_live_workout", LiveWorkout.class);
                    obj = serializableExtra;
                } else {
                    Object serializableExtra2 = intent.getSerializableExtra("extra_live_workout");
                    if (!(serializableExtra2 instanceof LiveWorkout)) {
                        serializableExtra2 = null;
                    }
                    obj = (LiveWorkout) serializableExtra2;
                }
                LiveWorkout liveWorkout = (LiveWorkout) obj;
                if (liveWorkout != null) {
                    vh.h.h().b(new a(LiveWorkout.copy$default(liveWorkout, 0, 0L, Long.valueOf(DateTime.now().getMillis()), false, null, 0, null, null, null, 507, null)));
                }
            }
        }
    }

    public LiveWorkoutNotificationManager(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f48844a = context;
    }

    public final void b() {
        androidx.core.app.y.c(this.f48844a).b(432, null);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutNotificationManager$WorkoutStopBroadcastReceiver, android.content.BroadcastReceiver] */
    @Override // ax.h.a
    public final void c(LiveWorkout liveWorkout) {
        ?? broadcastReceiver = new BroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_stop_workout");
        androidx.core.content.a.registerReceiver(this.f48844a, broadcastReceiver, intentFilter, 4);
        this.f48845b = broadcastReceiver;
    }

    @Override // ax.h.a
    public final void d(LiveWorkout liveWorkout, boolean z5) {
        WorkoutStopBroadcastReceiver workoutStopBroadcastReceiver = this.f48845b;
        Context context = this.f48844a;
        if (workoutStopBroadcastReceiver != null) {
            ay.b.w(context, workoutStopBroadcastReceiver);
            this.f48845b = null;
        }
        androidx.core.app.y.c(context).b(ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.core.app.u, androidx.core.app.q] */
    public final androidx.core.app.r f() {
        Intent intent = new Intent("permission_asking_LiveWorkoutActivityStarter");
        Context context = this.f48844a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        androidx.core.app.r rVar = new androidx.core.app.r(context, "permissions_channel_location");
        rVar.m(context.getString(C1987R.string.workoutLocationNotification_title));
        rVar.B(2131231550);
        rVar.w();
        ?? uVar = new androidx.core.app.u();
        uVar.f(context.getString(C1987R.string.workoutLocationNotification_content));
        rVar.D(uVar);
        rVar.k(broadcast);
        return rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0071, code lost:
        r7 = androidx.core.graphics.drawable.b.a(r7, r7.getIntrinsicWidth(), r7.getIntrinsicHeight(), null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.core.app.r g(com.withings.liveworkout.model.LiveWorkout r13, com.withings.workout.category.model.WorkoutCategory r14, java.lang.String r15) {
        /*
            r12 = this;
            java.lang.String r0 = "liveWorkout"
            kotlin.jvm.internal.u.j(r13, r0)
            java.lang.String r0 = "workoutCategory"
            kotlin.jvm.internal.u.j(r14, r0)
            com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity$a r0 = com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity.f48791z
            r0.getClass()
            android.content.Context r0 = r12.f48844a
            android.content.Intent r1 = com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity.a.a(r0, r13)
            r2 = 0
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r0, r2, r1, r3)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "action_stop_workout"
            r4.<init>(r5)
            java.lang.String r5 = "extra_live_workout"
            r4.putExtra(r5, r13)
            r13 = 1
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r13, r4, r3)
            r4 = 2132026921(0x7f142629, float:1.9692388E38)
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = "getString(...)"
            kotlin.jvm.internal.u.i(r4, r5)
            boolean r5 = r14.isNameRelevant()
            if (r5 == 0) goto L52
            java.lang.String r5 = r14.getName(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = 2132026933(0x7f142635, float:1.9692413E38)
            java.lang.String r5 = r0.getString(r6, r5)
            kotlin.jvm.internal.u.g(r5)
            goto L5c
        L52:
            r5 = 2132026934(0x7f142636, float:1.9692415E38)
            java.lang.String r5 = r0.getString(r5)
            kotlin.jvm.internal.u.g(r5)
        L5c:
            int r14 = r14.getGlyphRes()
            r6 = 2131100762(0x7f06045a, float:1.7813915E38)
            int r6 = androidx.core.content.a.getColor(r0, r6)
            r7 = 2131231579(0x7f08035b, float:1.8079243E38)
            android.graphics.drawable.Drawable r7 = androidx.core.content.a.getDrawable(r0, r7)
            r8 = 0
            if (r7 == 0) goto La7
            android.graphics.Bitmap r7 = androidx.core.graphics.drawable.b.b(r7)
            if (r7 != 0) goto L78
            goto La7
        L78:
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r7)
            r10 = 0
            r9.drawBitmap(r7, r10, r10, r8)
            android.graphics.drawable.Drawable r14 = androidx.core.content.a.getDrawable(r0, r14)
            if (r14 == 0) goto La6
            androidx.core.graphics.drawable.a.l(r14, r6)
            int r6 = r14.getIntrinsicWidth()
            int r8 = r14.getIntrinsicHeight()
            int r10 = r14.getIntrinsicWidth()
            int r10 = r10 / 4
            int r11 = r14.getIntrinsicHeight()
            int r11 = r11 / 4
            int r6 = r6 + r10
            int r8 = r8 + r11
            r14.setBounds(r10, r11, r6, r8)
            r14.draw(r9)
        La6:
            r8 = r7
        La7:
            androidx.core.app.r r14 = new androidx.core.app.r
            java.lang.String r6 = "workout_channel_live"
            r14.<init>(r0, r6)
            r14.m(r5)
            r14.l(r15)
            r14.y(r13)
            r14.i()
            r15 = 255(0xff, float:3.57E-43)
            int r15 = android.graphics.Color.argb(r15, r2, r2, r2)
            r14.h(r15)
            r14.s(r8)
            r14.u(r13)
            r13 = 2131231550(0x7f08033e, float:1.8079184E38)
            r14.B(r13)
            r13 = 2131232150(0x7f080596, float:1.8080401E38)
            r14.a(r13, r4, r3)
            r14.k(r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutNotificationManager.g(com.withings.liveworkout.model.LiveWorkout, com.withings.workout.category.model.WorkoutCategory, java.lang.String):androidx.core.app.r");
    }

    @Override // ax.h.a
    public final void a(LiveWorkout liveWorkout) {
    }

    @Override // ax.h.a
    public final void e(LiveWorkout liveWorkout) {
    }
}

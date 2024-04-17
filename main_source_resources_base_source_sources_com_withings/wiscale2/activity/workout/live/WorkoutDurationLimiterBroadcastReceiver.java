package com.withings.wiscale2.activity.workout.live;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ax.h;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WorkoutDurationLimiter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/WorkoutDurationLimiterBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutDurationLimiterBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f48785a = 0;

    /* compiled from: WorkoutDurationLimiter.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f48786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f48786a = str;
        }

        @Override // ym0.a
        public final y invoke() {
            h hVar = h.f19725i;
            if (hVar != null) {
                hVar.n(this.f48786a);
                return y.f85009a;
            }
            u.s("instance");
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u.j(context, "context");
        u.j(intent, "intent");
        String stringExtra = intent.getStringExtra("macAddress");
        if (stringExtra != null) {
            vh.h.h().b(new a(stringExtra));
        }
    }
}

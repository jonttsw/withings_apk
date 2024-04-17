package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.user.User;
import com.withings.wiscale2.activity.workout.ui.detail.s4;
import com.withings.wiscale2.track.data.Track;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class q4 {

    /* renamed from: a  reason: collision with root package name */
    private final User f49565a;

    /* renamed from: b  reason: collision with root package name */
    private final s4.a f49566b;

    /* renamed from: c  reason: collision with root package name */
    private final Track f49567c;

    public q4(User user, s4.a aVar, Track workout) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(workout, "workout");
        this.f49565a = user;
        this.f49566b = aVar;
        this.f49567c = workout;
    }

    public final s4.a a() {
        return this.f49566b;
    }

    public final User b() {
        return this.f49565a;
    }

    public final Track c() {
        return this.f49567c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        if (kotlin.jvm.internal.u.e(this.f49565a, q4Var.f49565a) && kotlin.jvm.internal.u.e(this.f49566b, q4Var.f49566b) && kotlin.jvm.internal.u.e(this.f49567c, q4Var.f49567c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49566b.hashCode();
        return this.f49567c.hashCode() + ((hashCode + (this.f49565a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WorkoutHeartRateGraphData(user=" + this.f49565a + ", dataHolder=" + this.f49566b + ", workout=" + this.f49567c + ")";
    }
}

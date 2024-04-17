package com.withings.wiscale2.activity.workout.live.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.a<LiveWorkout> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity.g f48924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(LiveWorkoutActivity.g gVar) {
        super(0);
        this.f48924a = gVar;
    }

    @Override // ym0.a
    public final LiveWorkout invoke() {
        LiveWorkoutActivity.g gVar = this.f48924a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(LiveWorkout.class);
        Activity activity = gVar.f48823b;
        if (isAssignableFrom) {
            return (LiveWorkout) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_live_workout");
        }
        if (Serializable.class.isAssignableFrom(LiveWorkout.class)) {
            return (LiveWorkout) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_live_workout");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_live_workout of class ", kotlin.jvm.internal.q0.b(LiveWorkout.class), " is not supported"));
    }
}

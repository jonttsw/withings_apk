package com.withings.wiscale2.activity.workout.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WorkoutComputationDispatcher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/DummyWorkoutComputationDispatcher;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutComputationDispatcher;", "Ljava/lang/Runnable;", "runnable", "Lnm0/y;", "post", "(Ljava/lang/Runnable;)V", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DummyWorkoutComputationDispatcher implements WorkoutComputationDispatcher {
    public static final int $stable = 0;

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutComputationDispatcher
    public void post(Runnable runnable) {
        u.j(runnable, "runnable");
        runnable.run();
    }
}

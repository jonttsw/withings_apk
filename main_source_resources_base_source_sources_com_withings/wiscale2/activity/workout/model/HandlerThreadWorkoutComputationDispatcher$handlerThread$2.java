package com.withings.wiscale2.activity.workout.model;

import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WorkoutComputationDispatcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/HandlerThread;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HandlerThreadWorkoutComputationDispatcher$handlerThread$2 extends w implements ym0.a<HandlerThread> {
    public static final HandlerThreadWorkoutComputationDispatcher$handlerThread$2 INSTANCE = new HandlerThreadWorkoutComputationDispatcher$handlerThread$2();

    HandlerThreadWorkoutComputationDispatcher$handlerThread$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final HandlerThread invoke() {
        return new HandlerThread("Workout insertion computation");
    }
}

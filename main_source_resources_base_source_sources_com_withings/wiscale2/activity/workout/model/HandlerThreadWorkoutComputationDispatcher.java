package com.withings.wiscale2.activity.workout.model;

import android.os.Handler;
import android.os.HandlerThread;
import e0.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: WorkoutComputationDispatcher.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/HandlerThreadWorkoutComputationDispatcher;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutComputationDispatcher;", "Ljava/lang/Runnable;", "runnable", "Lnm0/y;", "post", "(Ljava/lang/Runnable;)V", "Landroid/os/HandlerThread;", "handlerThread$delegate", "Lnm0/g;", "getHandlerThread", "()Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/Handler;", "handler$delegate", "getHandler", "()Landroid/os/Handler;", "handler", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HandlerThreadWorkoutComputationDispatcher implements WorkoutComputationDispatcher {
    public static final int $stable = 8;
    private final g handlerThread$delegate = h.b(HandlerThreadWorkoutComputationDispatcher$handlerThread$2.INSTANCE);
    private final g handler$delegate = h.b(new HandlerThreadWorkoutComputationDispatcher$handler$2(this));

    public HandlerThreadWorkoutComputationDispatcher() {
        getHandlerThread().start();
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    public final HandlerThread getHandlerThread() {
        return (HandlerThread) this.handlerThread$delegate.getValue();
    }

    public static final void post$lambda$0(Runnable runnable) {
        u.j(runnable, "$runnable");
        try {
            runnable.run();
        } catch (Exception e11) {
            x70.b.p(e11);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutComputationDispatcher
    public void post(Runnable runnable) {
        u.j(runnable, "runnable");
        getHandler().post(new l0(runnable, 5));
    }
}

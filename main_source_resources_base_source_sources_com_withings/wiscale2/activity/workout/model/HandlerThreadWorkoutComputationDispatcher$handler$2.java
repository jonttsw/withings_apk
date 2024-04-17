package com.withings.wiscale2.activity.workout.model;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutComputationDispatcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HandlerThreadWorkoutComputationDispatcher$handler$2 extends w implements ym0.a<Handler> {
    final /* synthetic */ HandlerThreadWorkoutComputationDispatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadWorkoutComputationDispatcher$handler$2(HandlerThreadWorkoutComputationDispatcher handlerThreadWorkoutComputationDispatcher) {
        super(0);
        this.this$0 = handlerThreadWorkoutComputationDispatcher;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Handler invoke() {
        HandlerThread handlerThread;
        handlerThread = this.this$0.getHandlerThread();
        return new Handler(handlerThread.getLooper());
    }
}

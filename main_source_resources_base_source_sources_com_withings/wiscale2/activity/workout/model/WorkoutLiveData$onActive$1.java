package com.withings.wiscale2.activity.workout.model;

import com.withings.wiscale2.track.data.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WorkoutLiveData.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/track/data/Track;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WorkoutLiveData$onActive$1 extends w implements ym0.a<Track> {
    final /* synthetic */ WorkoutLiveData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutLiveData$onActive$1(WorkoutLiveData workoutLiveData) {
        super(0);
        this.this$0 = workoutLiveData;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Track invoke() {
        WorkoutManager workoutManager;
        long j5;
        workoutManager = this.this$0.workoutManager;
        j5 = this.this$0.workoutId;
        return workoutManager.getWorkoutById(j5);
    }
}

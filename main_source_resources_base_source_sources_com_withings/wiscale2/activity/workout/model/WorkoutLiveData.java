package com.withings.wiscale2.activity.workout.model;

import androidx.lifecycle.LiveData;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vh.h;
import vh.o;
/* compiled from: WorkoutLiveData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/withings/wiscale2/track/data/Track;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager$Listener;", "Lnm0/y;", "onActive", "()V", "onInactive", "", NavigationArguments.USER_ID, MessageType.TRACK, "", "isFromWS", "onWorkoutTrackInserted", "(JLcom/withings/wiscale2/track/data/Track;Z)V", "oldTrack", "newTrack", "onWorkoutTrackUpdated", "(JLcom/withings/wiscale2/track/data/Track;Lcom/withings/wiscale2/track/data/Track;Z)V", "onWorkoutTrackDeleted", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutId", "J", "<init>", "(Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;J)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutLiveData extends LiveData<Track> implements WorkoutManager.Listener {
    public static final int $stable = 8;
    private final long workoutId;
    private final WorkoutManager workoutManager;

    public WorkoutLiveData(WorkoutManager workoutManager, long j5) {
        u.j(workoutManager, "workoutManager");
        this.workoutManager = workoutManager;
        this.workoutId = j5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.workoutManager.registerListener(this);
        o d11 = h.h().d(new WorkoutLiveData$onActive$1(this));
        d11.s(new WorkoutLiveData$onActive$2(this));
        d11.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.workoutManager.unregisterListener(this);
        h.b(this);
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public void onWorkoutTrackDeleted(long j5, Track track, boolean z5) {
        u.j(track, "track");
        Long id2 = track.getId();
        long j11 = this.workoutId;
        if (id2 != null && id2.longValue() == j11) {
            postValue(null);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public void onWorkoutTrackInserted(long j5, Track track, boolean z5) {
        u.j(track, "track");
        Long id2 = track.getId();
        long j11 = this.workoutId;
        if (id2 != null && id2.longValue() == j11) {
            postValue(track);
        }
    }

    @Override // com.withings.wiscale2.activity.workout.model.WorkoutManager.Listener
    public void onWorkoutTrackUpdated(long j5, Track oldTrack, Track newTrack, boolean z5) {
        u.j(oldTrack, "oldTrack");
        u.j(newTrack, "newTrack");
        Long id2 = newTrack.getId();
        long j11 = this.workoutId;
        if (id2 != null && id2.longValue() == j11) {
            postValue(newTrack);
        }
    }
}

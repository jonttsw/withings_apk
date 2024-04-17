package com.withings.wiscale2.activity.workout.model;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.SwimVasistas;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WorkoutSwimVasistasLiveData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutAndPausesAndLaps;", "", "workout", "Lcom/withings/wiscale2/track/data/Track;", "pauses", "", "Lcom/withings/vasistas/model/Vasistas;", ConstantsWs.SUBCATEGORY_FEATURE_LAPS, "Lcom/withings/vasistas/model/SwimVasistas;", "(Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;Ljava/util/List;)V", "getLaps", "()Ljava/util/List;", "getPauses", "getWorkout", "()Lcom/withings/wiscale2/track/data/Track;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WorkoutAndPausesAndLaps {
    public static final int $stable = 8;
    private final List<SwimVasistas> laps;
    private final List<Vasistas> pauses;
    private final Track workout;

    public WorkoutAndPausesAndLaps(Track workout, List<Vasistas> pauses, List<SwimVasistas> laps) {
        u.j(workout, "workout");
        u.j(pauses, "pauses");
        u.j(laps, "laps");
        this.workout = workout;
        this.pauses = pauses;
        this.laps = laps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutAndPausesAndLaps copy$default(WorkoutAndPausesAndLaps workoutAndPausesAndLaps, Track track, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            track = workoutAndPausesAndLaps.workout;
        }
        if ((i11 & 2) != 0) {
            list = workoutAndPausesAndLaps.pauses;
        }
        if ((i11 & 4) != 0) {
            list2 = workoutAndPausesAndLaps.laps;
        }
        return workoutAndPausesAndLaps.copy(track, list, list2);
    }

    public final Track component1() {
        return this.workout;
    }

    public final List<Vasistas> component2() {
        return this.pauses;
    }

    public final List<SwimVasistas> component3() {
        return this.laps;
    }

    public final WorkoutAndPausesAndLaps copy(Track workout, List<Vasistas> pauses, List<SwimVasistas> laps) {
        u.j(workout, "workout");
        u.j(pauses, "pauses");
        u.j(laps, "laps");
        return new WorkoutAndPausesAndLaps(workout, pauses, laps);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkoutAndPausesAndLaps)) {
            return false;
        }
        WorkoutAndPausesAndLaps workoutAndPausesAndLaps = (WorkoutAndPausesAndLaps) obj;
        if (u.e(this.workout, workoutAndPausesAndLaps.workout) && u.e(this.pauses, workoutAndPausesAndLaps.pauses) && u.e(this.laps, workoutAndPausesAndLaps.laps)) {
            return true;
        }
        return false;
    }

    public final List<SwimVasistas> getLaps() {
        return this.laps;
    }

    public final List<Vasistas> getPauses() {
        return this.pauses;
    }

    public final Track getWorkout() {
        return this.workout;
    }

    public int hashCode() {
        return this.laps.hashCode() + defpackage.e.b(this.pauses, this.workout.hashCode() * 31, 31);
    }

    public String toString() {
        Track track = this.workout;
        List<Vasistas> list = this.pauses;
        List<SwimVasistas> list2 = this.laps;
        StringBuilder sb2 = new StringBuilder("WorkoutAndPausesAndLaps(workout=");
        sb2.append(track);
        sb2.append(", pauses=");
        sb2.append(list);
        sb2.append(", laps=");
        return defpackage.d.i(sb2, list2, ")");
    }
}

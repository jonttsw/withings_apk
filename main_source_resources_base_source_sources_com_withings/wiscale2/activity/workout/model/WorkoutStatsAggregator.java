package com.withings.wiscale2.activity.workout.model;

import android.os.Parcelable;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: WorkoutStatsAggregator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutStatsAggregator;", "", "()V", "getAggregatedWorkout", "Lcom/withings/wiscale2/track/data/Track;", "tracks", "", "getDurationToAdd", "", "trackData", "Lcom/withings/workout/workoutdata/WorkoutData;", MessageType.TRACK, "groupTracks", "", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WorkoutStatsAggregator {
    public static final int $stable = 0;

    private final long getDurationToAdd(WorkoutData workoutData, Track track) {
        if (workoutData.getDeviceStartDate() != null && workoutData.getDeviceEndDate() != null) {
            return workoutData.getDeviceEndDate().getMillis() - workoutData.getDeviceStartDate().getMillis();
        }
        return track.getDuration();
    }

    public final Track getAggregatedWorkout(List<Track> tracks) {
        u.j(tracks, "tracks");
        Track track = new Track(null, null, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, false, 0, null, null, null, false, 0, null, null, false, null, null, null, null, null, null, 0, -1, null);
        WorkoutData workoutData = new WorkoutData();
        track.setCategory(tracks.get(0).getCategory());
        ArrayList<Track> arrayList = new ArrayList();
        for (Object obj : tracks) {
            if (((Track) obj).getData() instanceof WorkoutData) {
                arrayList.add(obj);
            }
        }
        long j5 = 0;
        for (Track track2 : arrayList) {
            Parcelable data = track2.getData();
            u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            WorkoutData workoutData2 = (WorkoutData) data;
            workoutData.setCalories(workoutData2.getCalories() + workoutData.getCalories());
            j5 += getDurationToAdd(workoutData2, track2);
        }
        DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        track.setStartDate(withTimeAtStartOfDay);
        DateTime plus = DateTime.now().withTimeAtStartOfDay().plus(j5);
        u.i(plus, "plus(...)");
        track.setEndDate(plus);
        track.setData(workoutData);
        return track;
    }

    public final Map<Integer, List<Track>> groupTracks(List<Track> tracks) {
        u.j(tracks, "tracks");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tracks) {
            Integer valueOf = Integer.valueOf(((Track) obj).getCategory());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = com.google.android.gms.internal.mlkit_common.a.d(linkedHashMap, valueOf);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }
}

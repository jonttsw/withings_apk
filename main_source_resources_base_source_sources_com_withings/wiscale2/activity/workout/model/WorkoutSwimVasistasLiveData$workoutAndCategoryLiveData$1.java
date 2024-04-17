package com.withings.wiscale2.activity.workout.model;

import com.withings.wiscale2.track.data.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.p;
/* compiled from: WorkoutSwimVasistasLiveData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "oldValue", "Lcom/withings/wiscale2/track/data/Track;", "newValue", "invoke", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/wiscale2/track/data/Track;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WorkoutSwimVasistasLiveData$workoutAndCategoryLiveData$1 extends w implements p<Track, Track, Boolean> {
    public static final WorkoutSwimVasistasLiveData$workoutAndCategoryLiveData$1 INSTANCE = new WorkoutSwimVasistasLiveData$workoutAndCategoryLiveData$1();

    WorkoutSwimVasistasLiveData$workoutAndCategoryLiveData$1() {
        super(2);
    }

    @Override // ym0.p
    public final Boolean invoke(Track track, Track track2) {
        boolean z5;
        if (u.e(track != null ? track.getStartDate() : null, track2 != null ? track2.getStartDate() : null)) {
            if (u.e(track != null ? track.getEndDate() : null, track2 != null ? track2.getEndDate() : null)) {
                if (u.e(track != null ? Integer.valueOf(track.getCategory()) : null, track2 != null ? Integer.valueOf(track2.getCategory()) : null)) {
                    z5 = false;
                    return Boolean.valueOf(z5);
                }
            }
        }
        z5 = true;
        return Boolean.valueOf(z5);
    }
}

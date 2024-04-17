package com.withings.wiscale2.activity.workout.model;

import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPauseLiveData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "oldValue", "Lcom/withings/wiscale2/track/data/Track;", "newValue", "invoke", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/wiscale2/track/data/Track;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WorkoutPauseLiveData$ifChangedWorkout$1 extends w implements p<Track, Track, Boolean> {
    public static final WorkoutPauseLiveData$ifChangedWorkout$1 INSTANCE = new WorkoutPauseLiveData$ifChangedWorkout$1();

    WorkoutPauseLiveData$ifChangedWorkout$1() {
        super(2);
    }

    @Override // ym0.p
    public final Boolean invoke(Track track, Track track2) {
        boolean z5;
        if (u.e(track != null ? TrackKt.getEffectiveStartDate(track) : null, track2 != null ? TrackKt.getEffectiveStartDate(track2) : null)) {
            if (u.e(track != null ? TrackKt.getEffectiveEndDate(track) : null, track2 != null ? TrackKt.getEffectiveEndDate(track2) : null)) {
                z5 = false;
                return Boolean.valueOf(z5);
            }
        }
        z5 = true;
        return Boolean.valueOf(z5);
    }
}

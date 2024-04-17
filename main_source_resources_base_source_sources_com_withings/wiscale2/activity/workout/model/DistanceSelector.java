package com.withings.wiscale2.activity.workout.model;

import android.os.Parcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.SwimWorkoutData;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DistanceSelector.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/DistanceSelector;", "", "()V", "select", "", MessageType.TRACK, "Lcom/withings/wiscale2/track/data/Track;", "category", "Lcom/withings/workout/category/model/WorkoutCategory;", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/workout/category/model/WorkoutCategory;)Ljava/lang/Double;", "selectEdited", "shouldUseStepsDistance", "", "gpsSummary", "Lcom/withings/wiscale2/track/data/GpsSummary;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DistanceSelector {
    public static final int $stable = 0;

    private final boolean shouldUseStepsDistance(WorkoutCategory workoutCategory, GpsSummary gpsSummary) {
        double d11;
        if (gpsSummary != null) {
            d11 = gpsSummary.getDistance();
        } else {
            d11 = 0.0d;
        }
        if (d11 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && workoutCategory != null && workoutCategory.isDistanceRelevant() && workoutCategory.isAccelerometerReliable()) {
            return true;
        }
        return false;
    }

    public final Double select(Track track, WorkoutCategory workoutCategory) {
        StepWorkoutData stepWorkoutData;
        int i11;
        double d11;
        SwimWorkoutData swimWorkoutData;
        SwimWorkoutData swimWorkoutData2;
        StepWorkoutData stepWorkoutData2;
        StepWorkoutData stepWorkoutData3;
        StepWorkoutData stepWorkoutData4;
        u.j(track, "track");
        Parcelable data = track.getData();
        if (data instanceof StepWorkoutData) {
            stepWorkoutData = (StepWorkoutData) data;
        } else {
            stepWorkoutData = null;
        }
        if (stepWorkoutData != null) {
            i11 = stepWorkoutData.getManualDistance();
        } else {
            i11 = 0;
        }
        if (i11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            Parcelable data2 = track.getData();
            if (data2 instanceof StepWorkoutData) {
                stepWorkoutData4 = (StepWorkoutData) data2;
            } else {
                stepWorkoutData4 = null;
            }
            if (stepWorkoutData4 == null) {
                return null;
            }
            return Double.valueOf(stepWorkoutData4.getManualDistance());
        }
        GpsSummary gpsSummary = track.getGpsSummary();
        if (gpsSummary != null) {
            d11 = gpsSummary.getDistance();
        } else {
            d11 = 0.0d;
        }
        if (d11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && workoutCategory != null && workoutCategory.isDistanceRelevant()) {
            GpsSummary gpsSummary2 = track.getGpsSummary();
            if (gpsSummary2 == null) {
                return null;
            }
            return Double.valueOf(gpsSummary2.getDistance());
        }
        if (shouldUseStepsDistance(workoutCategory, track.getGpsSummary())) {
            Parcelable data3 = track.getData();
            if (data3 instanceof StepWorkoutData) {
                stepWorkoutData2 = (StepWorkoutData) data3;
            } else {
                stepWorkoutData2 = null;
            }
            if (stepWorkoutData2 != null && stepWorkoutData2.getDistance() > 0) {
                Parcelable data4 = track.getData();
                if (data4 instanceof StepWorkoutData) {
                    stepWorkoutData3 = (StepWorkoutData) data4;
                } else {
                    stepWorkoutData3 = null;
                }
                if (stepWorkoutData3 == null) {
                    return null;
                }
                return Double.valueOf(stepWorkoutData3.getDistance());
            }
        }
        Parcelable data5 = track.getData();
        if (data5 instanceof SwimWorkoutData) {
            swimWorkoutData = (SwimWorkoutData) data5;
        } else {
            swimWorkoutData = null;
        }
        if (swimWorkoutData == null || swimWorkoutData.getLaps() <= 0) {
            return null;
        }
        Parcelable data6 = track.getData();
        if (data6 instanceof SwimWorkoutData) {
            swimWorkoutData2 = (SwimWorkoutData) data6;
        } else {
            swimWorkoutData2 = null;
        }
        if (swimWorkoutData2 == null) {
            return null;
        }
        return Double.valueOf(swimWorkoutData2.getPoolLengthOrDefault() * swimWorkoutData2.getLaps());
    }

    public final Double selectEdited(Track track, WorkoutCategory workoutCategory) {
        SwimWorkoutData swimWorkoutData;
        Integer num;
        SwimWorkoutData swimWorkoutData2;
        u.j(track, "track");
        Parcelable data = track.getData();
        if (data instanceof SwimWorkoutData) {
            swimWorkoutData = (SwimWorkoutData) data;
        } else {
            swimWorkoutData = null;
        }
        if (swimWorkoutData != null) {
            num = swimWorkoutData.getManualLapsOrLaps();
        } else {
            num = null;
        }
        if (num != null && num.intValue() > 0) {
            Parcelable data2 = track.getData();
            if (data2 instanceof SwimWorkoutData) {
                swimWorkoutData2 = (SwimWorkoutData) data2;
            } else {
                swimWorkoutData2 = null;
            }
            if (swimWorkoutData2 == null) {
                return null;
            }
            return Double.valueOf(swimWorkoutData2.getPoolLengthOrDefault() * swimWorkoutData2.getManualLapsOrLaps().intValue());
        }
        return select(track, workoutCategory);
    }
}

package com.withings.workout.workoutdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
/* loaded from: classes5.dex */
public class StepWorkoutData extends WorkoutData implements Parcelable {
    public static final Parcelable.Creator<StepWorkoutData> CREATOR = new Parcelable.Creator<StepWorkoutData>() { // from class: com.withings.workout.workoutdata.StepWorkoutData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StepWorkoutData createFromParcel(Parcel parcel) {
            return new StepWorkoutData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StepWorkoutData[] newArray(int i11) {
            return new StepWorkoutData[i11];
        }
    };
    @SerializedName("elevation")
    private int ascent;
    @SerializedName("metcumul")
    private int cumulMet;
    private int distance;
    @SerializedName("manual_distance")
    private int manualDistance;
    private int steps;

    public StepWorkoutData() {
    }

    @Override // com.withings.workout.workoutdata.WorkoutData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.withings.workout.workoutdata.WorkoutData
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        StepWorkoutData stepWorkoutData = (StepWorkoutData) obj;
        if (stepWorkoutData.steps != this.steps || stepWorkoutData.ascent != this.ascent || stepWorkoutData.distance != this.distance || stepWorkoutData.cumulMet != this.cumulMet || stepWorkoutData.manualDistance != this.manualDistance) {
            return false;
        }
        return true;
    }

    public int getAscent() {
        return this.ascent;
    }

    public int getCumulMet() {
        return this.cumulMet;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getManualDistance() {
        return this.manualDistance;
    }

    public int getSteps() {
        return this.steps;
    }

    @Override // com.withings.workout.workoutdata.WorkoutData
    public int hashCode() {
        return (((((((((super.hashCode() * 31) + this.steps) * 31) + this.ascent) * 31) + this.distance) * 31) + this.cumulMet) * 31) + this.manualDistance;
    }

    public void setAscent(int i11) {
        this.ascent = i11;
    }

    public void setCumulMet(int i11) {
        this.cumulMet = i11;
    }

    public void setDistance(int i11) {
        this.distance = i11;
    }

    public void setManualDistance(int i11) {
        this.manualDistance = i11;
    }

    public void setSteps(int i11) {
        this.steps = i11;
    }

    @Override // com.withings.workout.workoutdata.WorkoutData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.steps);
        parcel.writeInt(this.ascent);
        parcel.writeInt(this.distance);
        parcel.writeInt(this.cumulMet);
        parcel.writeInt(this.manualDistance);
    }

    public StepWorkoutData(WorkoutData workoutData) {
        super(workoutData);
    }

    @Override // com.withings.workout.workoutdata.WorkoutData
    public StepWorkoutData copy() {
        return new StepWorkoutData(this);
    }

    public StepWorkoutData(StepWorkoutData stepWorkoutData) {
        super(stepWorkoutData);
        this.steps = stepWorkoutData.steps;
        this.ascent = stepWorkoutData.ascent;
        this.distance = stepWorkoutData.distance;
        this.cumulMet = stepWorkoutData.cumulMet;
        this.manualDistance = stepWorkoutData.manualDistance;
    }

    protected StepWorkoutData(Parcel parcel) {
        super(parcel);
        this.steps = parcel.readInt();
        this.ascent = parcel.readInt();
        this.distance = parcel.readInt();
        this.cumulMet = parcel.readInt();
        this.manualDistance = parcel.readInt();
    }
}

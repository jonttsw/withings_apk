package com.withings.workout.workoutdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
/* loaded from: classes5.dex */
public class SwimWorkoutData extends WorkoutData implements Parcelable {
    public static final Parcelable.Creator<SwimWorkoutData> CREATOR = new Parcelable.Creator<SwimWorkoutData>() { // from class: com.withings.workout.workoutdata.SwimWorkoutData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SwimWorkoutData createFromParcel(Parcel parcel) {
            return new SwimWorkoutData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SwimWorkoutData[] newArray(int i11) {
            return new SwimWorkoutData[i11];
        }
    };
    public static final int DEFAULT_POOL_LENGTH = 25;
    public static final int MIN_NB_OF_LAPS = 2;
    @SerializedName("version")
    private Integer algoVersion;
    private int laps;
    @SerializedName("manual_laps")
    private Integer manualLaps;
    @SerializedName("mvts")
    private int movements;
    @SerializedName("pool_length")
    private Integer poolLength;
    @SerializedName("type")
    private int swimType;

    public SwimWorkoutData() {
        this.poolLength = null;
        this.swimType = 9;
        this.manualLaps = null;
        this.algoVersion = null;
    }

    public boolean areLapsEdited() {
        Integer num = this.manualLaps;
        if (num != null && num.intValue() != this.laps) {
            return true;
        }
        return false;
    }

    @Override // com.withings.workout.workoutdata.WorkoutData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getAlgoVersion() {
        return this.algoVersion;
    }

    public int getLaps() {
        return this.laps;
    }

    public Integer getManualLaps() {
        return this.manualLaps;
    }

    public Integer getManualLapsOrLaps() {
        if (areLapsEdited() && this.manualLaps.intValue() >= 2) {
            return this.manualLaps;
        }
        int i11 = this.laps;
        if (i11 >= 2) {
            return Integer.valueOf(i11);
        }
        return null;
    }

    public int getMovements() {
        return this.movements;
    }

    public Integer getPoolLength() {
        return this.poolLength;
    }

    public int getPoolLengthOrDefault() {
        Integer num = this.poolLength;
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public int getSwimType() {
        if (this.swimType <= 0) {
            this.swimType = 9;
        }
        return this.swimType;
    }

    public void setAlgoVersion(Integer num) {
        this.algoVersion = num;
    }

    public void setLaps(int i11) {
        this.laps = i11;
    }

    public void setManualLaps(Integer num) {
        this.manualLaps = num;
    }

    public void setMovements(int i11) {
        this.movements = i11;
    }

    public void setPoolLength(Integer num) {
        this.poolLength = num;
    }

    public void setSwimType(int i11) {
        this.swimType = i11;
    }

    @Override // com.withings.workout.workoutdata.WorkoutData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        int i13;
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.laps);
        parcel.writeInt(this.movements);
        int i14 = 0;
        if (this.poolLength != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        parcel.writeInt(i12);
        Integer num = this.poolLength;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.swimType);
        if (this.manualLaps != null) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        parcel.writeInt(i13);
        Integer num2 = this.manualLaps;
        if (num2 != null) {
            parcel.writeInt(num2.intValue());
        }
        if (this.algoVersion != null) {
            i14 = 1;
        }
        parcel.writeInt(i14);
        Integer num3 = this.algoVersion;
        if (num3 != null) {
            parcel.writeInt(num3.intValue());
        }
    }

    @Override // com.withings.workout.workoutdata.WorkoutData
    public SwimWorkoutData copy() {
        return new SwimWorkoutData(this);
    }

    protected SwimWorkoutData(Parcel parcel) {
        super(parcel);
        this.poolLength = null;
        this.swimType = 9;
        this.manualLaps = null;
        this.algoVersion = null;
        this.laps = parcel.readInt();
        this.movements = parcel.readInt();
        if (parcel.readInt() == 1) {
            this.poolLength = Integer.valueOf(parcel.readInt());
        }
        this.swimType = parcel.readInt();
        if (parcel.readInt() == 1) {
            this.manualLaps = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 1) {
            this.algoVersion = Integer.valueOf(parcel.readInt());
        }
    }

    public SwimWorkoutData(WorkoutData workoutData) {
        super(workoutData);
        this.poolLength = null;
        this.swimType = 9;
        this.manualLaps = null;
        this.algoVersion = null;
    }

    public SwimWorkoutData(SwimWorkoutData swimWorkoutData) {
        super(swimWorkoutData);
        this.poolLength = null;
        this.swimType = 9;
        this.manualLaps = null;
        this.algoVersion = null;
        this.laps = swimWorkoutData.laps;
        this.movements = swimWorkoutData.movements;
        this.poolLength = swimWorkoutData.poolLength;
        this.swimType = swimWorkoutData.swimType;
        this.manualLaps = swimWorkoutData.manualLaps;
        this.algoVersion = swimWorkoutData.algoVersion;
    }
}

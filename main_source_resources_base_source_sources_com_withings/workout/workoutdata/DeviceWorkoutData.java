package com.withings.workout.workoutdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.withings.wiscale2.track.data.DeviceWorkoutDataSerializer;
/* loaded from: classes5.dex */
public class DeviceWorkoutData implements Parcelable {
    public static final Parcelable.Creator<DeviceWorkoutData> CREATOR = new Parcelable.Creator<DeviceWorkoutData>() { // from class: com.withings.workout.workoutdata.DeviceWorkoutData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceWorkoutData createFromParcel(Parcel parcel) {
            return new DeviceWorkoutData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceWorkoutData[] newArray(int i11) {
            return new DeviceWorkoutData[i11];
        }
    };
    @SerializedName(DeviceWorkoutDataSerializer.KEY_END_DATE_AUTO)
    private boolean endDateAuto;
    @SerializedName(DeviceWorkoutDataSerializer.KEY_START_DATE_AUTO)
    private boolean startDateAuto;

    public DeviceWorkoutData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getEndDateAuto() {
        return this.endDateAuto;
    }

    public boolean getStartDateAuto() {
        return this.startDateAuto;
    }

    public void setEndDateAuto(boolean z5) {
        this.endDateAuto = z5;
    }

    public void setStartDateAuto(boolean z5) {
        this.startDateAuto = z5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.startDateAuto ? 1 : 0);
        parcel.writeInt(this.endDateAuto ? 1 : 0);
    }

    protected DeviceWorkoutData(Parcel parcel) {
        this.startDateAuto = parcel.readInt() == 1;
        this.endDateAuto = parcel.readInt() == 1;
    }
}

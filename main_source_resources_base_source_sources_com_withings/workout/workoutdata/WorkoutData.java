package com.withings.workout.workoutdata;

import ah.u;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.b;
import androidx.core.content.a;
import com.google.gson.annotations.SerializedName;
import com.withings.wiscale2.C1987R;
import org.joda.time.DateTime;
/* loaded from: classes5.dex */
public class WorkoutData implements Parcelable {
    public static final Parcelable.Creator<WorkoutData> CREATOR = new Parcelable.Creator<WorkoutData>() { // from class: com.withings.workout.workoutdata.WorkoutData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkoutData createFromParcel(Parcel parcel) {
            return new WorkoutData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkoutData[] newArray(int i11) {
            return new WorkoutData[i11];
        }
    };
    public static final int DEFAULT_SPORT_INTENSITY = 30;
    private static final int THRESHOLD_ACTIVITY = 30;
    private static final int THRESHOLD_WARNING = 80;
    @SerializedName("algo_pause_duration")
    private int algoPauseDuration;
    @SerializedName("calories")
    private int calories;
    @SerializedName("device_enddate")
    private DateTime deviceEndDate;
    @SerializedName("device_startdate")
    private DateTime deviceStartDate;
    @SerializedName("hr_average")
    private float hrAverage;
    @SerializedName("hr_max")
    private int hrMax;
    @SerializedName("hr_min")
    private int hrMin;
    @SerializedName("hr_zone_2")
    private int hrZoneIntense;
    @SerializedName("hr_zone_0")
    private int hrZoneLight;
    @SerializedName("hr_zone_1")
    private int hrZoneModerate;
    @SerializedName("hr_zone_3")
    private int hrZonePeak;
    @SerializedName("intensity")
    private Integer intensity;
    @SerializedName("manual_calories")
    private int manualCalories;
    @SerializedName("pause_duration")
    private int pauseDuration;
    @SerializedName("core_body_temperature_avg")
    private float temperatureAverage;
    @SerializedName("core_body_temperature_max")
    private float temperatureMax;
    @SerializedName("core_body_temperature_min")
    private float temperatureMin;

    public WorkoutData() {
        this.intensity = 30;
        this.pauseDuration = 0;
        this.algoPauseDuration = 0;
    }

    public static int getIntensityColor(Context context, int i11) {
        if (i11 < 0 || i11 >= 30) {
            if (i11 >= 30 && i11 < 80) {
                return interpolateColor(context, C1987R.color.datavizMonochromaticNeutral3, C1987R.color.datavizMonochromaticNeutral4, i11, 30, 80);
            }
            return a.getColor(context, C1987R.color.datavizMonochromaticNeutral5);
        }
        return interpolateColor(context, C1987R.color.datavizMonochromaticNeutral2, C1987R.color.datavizMonochromaticNeutral3, i11, 0, 30);
    }

    private static int interpolateColor(Context context, int i11, int i12, float f11, int i13, int i14) {
        return u.B(f11, i13, i14, a.getColor(context, i11), a.getColor(context, i12));
    }

    public WorkoutData copy() {
        return new WorkoutData(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkoutData workoutData = (WorkoutData) obj;
        if (workoutData.calories != this.calories || workoutData.hrAverage != this.hrAverage || workoutData.hrMin != this.hrMin || workoutData.hrMax != this.hrMax || workoutData.hrZoneLight != this.hrZoneLight || workoutData.hrZoneModerate != this.hrZoneModerate || workoutData.hrZoneIntense != this.hrZoneIntense || workoutData.hrZonePeak != this.hrZonePeak || workoutData.temperatureMin != this.temperatureMin || workoutData.temperatureMax != this.temperatureMax || workoutData.temperatureAverage != this.temperatureAverage || workoutData.manualCalories != this.manualCalories || workoutData.pauseDuration != this.pauseDuration || workoutData.algoPauseDuration != this.algoPauseDuration) {
            return false;
        }
        Integer num = this.intensity;
        Integer num2 = workoutData.intensity;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 == null) {
            return true;
        }
        return false;
    }

    public int getAlgoPauseDuration() {
        return this.algoPauseDuration;
    }

    public int getCalories() {
        return this.calories;
    }

    public DateTime getDeviceEndDate() {
        return this.deviceEndDate;
    }

    public DateTime getDeviceStartDate() {
        return this.deviceStartDate;
    }

    public float getHrAverage() {
        return this.hrAverage;
    }

    public int getHrMax() {
        return this.hrMax;
    }

    public int getHrMin() {
        return this.hrMin;
    }

    public int getHrZoneIntense() {
        return this.hrZoneIntense;
    }

    public int getHrZoneLight() {
        return this.hrZoneLight;
    }

    public int getHrZoneModerate() {
        return this.hrZoneModerate;
    }

    public int getHrZonePeak() {
        return this.hrZonePeak;
    }

    public int getIntensity() {
        return this.intensity.intValue();
    }

    public int getManualCalories() {
        return this.manualCalories;
    }

    public int getPauseDuration() {
        return this.pauseDuration;
    }

    public float getTemperatureAverage() {
        return this.temperatureAverage;
    }

    public float getTemperatureMax() {
        return this.temperatureMax;
    }

    public float getTemperatureMin() {
        return this.temperatureMin;
    }

    public int hashCode() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = this.calories * 31;
        float f11 = this.hrAverage;
        int i26 = 0;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        } else {
            i11 = 0;
        }
        int i27 = (i25 + i11) * 31;
        int i28 = this.hrMin;
        if (i28 != 0.0f) {
            i12 = Float.floatToIntBits(i28);
        } else {
            i12 = 0;
        }
        int i29 = (i27 + i12) * 31;
        int i31 = this.hrMax;
        if (i31 != 0.0f) {
            i13 = Float.floatToIntBits(i31);
        } else {
            i13 = 0;
        }
        int i32 = (i29 + i13) * 31;
        int i33 = this.hrZoneLight;
        if (i33 != 0.0f) {
            i14 = Float.floatToIntBits(i33);
        } else {
            i14 = 0;
        }
        int i34 = (i32 + i14) * 31;
        int i35 = this.hrZoneModerate;
        if (i35 != 0.0f) {
            i15 = Float.floatToIntBits(i35);
        } else {
            i15 = 0;
        }
        int i36 = (i34 + i15) * 31;
        int i37 = this.hrZoneIntense;
        if (i37 != 0.0f) {
            i16 = Float.floatToIntBits(i37);
        } else {
            i16 = 0;
        }
        int i38 = (i36 + i16) * 31;
        int i39 = this.hrZonePeak;
        if (i39 != 0.0f) {
            i17 = Float.floatToIntBits(i39);
        } else {
            i17 = 0;
        }
        int i41 = (i38 + i17) * 31;
        float f12 = this.temperatureMin;
        if (f12 != 0.0f) {
            i18 = Float.floatToIntBits(f12);
        } else {
            i18 = 0;
        }
        int i42 = (i41 + i18) * 31;
        float f13 = this.temperatureMax;
        if (f13 != 0.0f) {
            i19 = Float.floatToIntBits(f13);
        } else {
            i19 = 0;
        }
        int i43 = (i42 + i19) * 31;
        float f14 = this.temperatureAverage;
        if (f14 != 0.0f) {
            i21 = Float.floatToIntBits(f14);
        } else {
            i21 = 0;
        }
        int i44 = (i43 + i21) * 31;
        if (this.intensity.intValue() != 0.0f) {
            i22 = Float.floatToIntBits(this.intensity.intValue());
        } else {
            i22 = 0;
        }
        int i45 = (i44 + i22) * 31;
        int i46 = this.manualCalories;
        if (i46 != 0.0f) {
            i23 = Float.floatToIntBits(i46);
        } else {
            i23 = 0;
        }
        int i47 = (i45 + i23) * 31;
        int i48 = this.pauseDuration;
        if (i48 != 0.0f) {
            i24 = Float.floatToIntBits(i48);
        } else {
            i24 = 0;
        }
        int i49 = (i47 + i24) * 31;
        int i51 = this.algoPauseDuration;
        if (i51 != 0.0f) {
            i26 = Float.floatToIntBits(i51);
        }
        return i49 + i26;
    }

    public void setAlgoPauseDuration(int i11) {
        this.algoPauseDuration = i11;
    }

    public void setCalories(int i11) {
        this.calories = i11;
    }

    public void setDeviceEndDate(DateTime dateTime) {
        this.deviceEndDate = dateTime;
    }

    public void setDeviceStartDate(DateTime dateTime) {
        this.deviceStartDate = dateTime;
    }

    public void setHrAverage(float f11) {
        this.hrAverage = f11;
    }

    public void setHrMax(int i11) {
        this.hrMax = i11;
    }

    public void setHrMin(int i11) {
        this.hrMin = i11;
    }

    public void setHrZoneIntense(int i11) {
        this.hrZoneIntense = i11;
    }

    public void setHrZoneLight(int i11) {
        this.hrZoneLight = i11;
    }

    public void setHrZoneModerate(int i11) {
        this.hrZoneModerate = i11;
    }

    public void setHrZonePeak(int i11) {
        this.hrZonePeak = i11;
    }

    public void setIntensity(int i11) {
        this.intensity = Integer.valueOf(i11);
    }

    public void setManualCalories(int i11) {
        this.manualCalories = i11;
    }

    public void setPauseDuration(int i11) {
        this.pauseDuration = i11;
    }

    public void setTemperatureAverage(float f11) {
        this.temperatureAverage = f11;
    }

    public void setTemperatureMax(float f11) {
        this.temperatureMax = f11;
    }

    public void setTemperatureMin(float f11) {
        this.temperatureMin = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WorkoutData{calories=");
        sb2.append(this.calories);
        sb2.append(", manualCalories=");
        sb2.append(this.manualCalories);
        sb2.append(", hrAverage=");
        sb2.append(this.hrAverage);
        sb2.append(", hrMin=");
        sb2.append(this.hrMin);
        sb2.append(", hrMax=");
        sb2.append(this.hrMax);
        sb2.append(", hrZoneLight=");
        sb2.append(this.hrZoneLight);
        sb2.append(", hrZoneModerate=");
        sb2.append(this.hrZoneModerate);
        sb2.append(", hrZoneIntense=");
        sb2.append(this.hrZoneIntense);
        sb2.append(", hrZonePeak=");
        sb2.append(this.hrZonePeak);
        sb2.append(", temperatureMin=");
        sb2.append(this.temperatureMin);
        sb2.append(", temperatureMax=");
        sb2.append(this.temperatureMax);
        sb2.append(", temperatureAverage=");
        sb2.append(this.temperatureAverage);
        sb2.append(", deviceStartDate=");
        sb2.append(this.deviceStartDate);
        sb2.append(", deviceEndDate=");
        sb2.append(this.deviceEndDate);
        sb2.append(", intensity=");
        sb2.append(this.intensity);
        sb2.append(", manualCalories=");
        sb2.append(this.manualCalories);
        sb2.append(", pauseDuration=");
        sb2.append(this.pauseDuration);
        sb2.append(", algoPauseDuration=");
        return b.c(sb2, this.algoPauseDuration, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.calories);
        parcel.writeFloat(this.hrAverage);
        parcel.writeInt(this.hrMin);
        parcel.writeInt(this.hrMax);
        parcel.writeInt(this.hrZoneLight);
        parcel.writeInt(this.hrZoneModerate);
        parcel.writeInt(this.hrZoneIntense);
        parcel.writeInt(this.hrZonePeak);
        parcel.writeFloat(this.temperatureMin);
        parcel.writeFloat(this.temperatureMax);
        parcel.writeFloat(this.temperatureAverage);
        DateTime dateTime = this.deviceStartDate;
        if (dateTime == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(dateTime.getMillis());
        }
        DateTime dateTime2 = this.deviceEndDate;
        if (dateTime2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(dateTime2.getMillis());
        }
        parcel.writeInt(this.intensity.intValue());
        parcel.writeInt(this.manualCalories);
        parcel.writeInt(this.pauseDuration);
        parcel.writeInt(this.algoPauseDuration);
    }

    public int getIntensityColor(Context context) {
        return getIntensityColor(context, getIntensity());
    }

    public WorkoutData(WorkoutData workoutData) {
        this.intensity = 30;
        this.pauseDuration = 0;
        this.algoPauseDuration = 0;
        this.calories = workoutData.calories;
        this.hrAverage = workoutData.hrAverage;
        this.hrMin = workoutData.hrMin;
        this.hrMax = workoutData.hrMax;
        this.hrZoneLight = workoutData.hrZoneLight;
        this.hrZoneModerate = workoutData.hrZoneModerate;
        this.hrZoneIntense = workoutData.hrZoneIntense;
        this.hrZonePeak = workoutData.hrZonePeak;
        this.temperatureAverage = workoutData.temperatureAverage;
        this.temperatureMin = workoutData.temperatureMin;
        this.temperatureMax = workoutData.temperatureMax;
        this.deviceStartDate = workoutData.deviceStartDate;
        this.deviceEndDate = workoutData.deviceEndDate;
        this.intensity = workoutData.intensity;
        this.manualCalories = workoutData.manualCalories;
        this.pauseDuration = workoutData.pauseDuration;
        this.algoPauseDuration = workoutData.algoPauseDuration;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorkoutData(Parcel parcel) {
        this.intensity = 30;
        this.pauseDuration = 0;
        this.algoPauseDuration = 0;
        this.calories = parcel.readInt();
        this.hrAverage = parcel.readFloat();
        this.hrMin = parcel.readInt();
        this.hrMax = parcel.readInt();
        this.hrZoneLight = parcel.readInt();
        this.hrZoneModerate = parcel.readInt();
        this.hrZoneIntense = parcel.readInt();
        this.hrZonePeak = parcel.readInt();
        this.temperatureAverage = parcel.readFloat();
        this.temperatureMin = parcel.readFloat();
        this.temperatureMax = parcel.readFloat();
        this.deviceStartDate = parcel.readByte() == 0 ? null : new DateTime(parcel.readLong());
        this.deviceEndDate = parcel.readByte() != 0 ? new DateTime(parcel.readLong()) : null;
        this.intensity = Integer.valueOf(parcel.readInt());
        this.manualCalories = parcel.readInt();
        this.pauseDuration = parcel.readInt();
        this.algoPauseDuration = parcel.readInt();
    }
}

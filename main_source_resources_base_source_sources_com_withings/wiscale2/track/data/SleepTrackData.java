package com.withings.wiscale2.track.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import org.joda.time.Duration;
/* loaded from: classes5.dex */
public class SleepTrackData implements Parcelable {
    public static final Parcelable.Creator<SleepTrackData> CREATOR = new Parcelable.Creator<SleepTrackData>() { // from class: com.withings.wiscale2.track.data.SleepTrackData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepTrackData createFromParcel(Parcel parcel) {
            return new SleepTrackData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepTrackData[] newArray(int i11) {
            return new SleepTrackData[i11];
        }
    };
    @SerializedName("apnea_hypopnea_index")
    private Integer apneaHypopneaIndex;
    @SerializedName("spo2_average")
    private Float averageSpo2;
    @SerializedName("spo2_us_average")
    private Float averageSpo2US;
    @SerializedName("breathing_event_probability")
    private Integer breathingEventProbability;
    @SerializedName("deepsleepduration")
    private Duration deepSleepDuration;
    @SerializedName("durationtowakeup")
    private Duration durationToGetUp;
    @SerializedName("durationtosleep")
    private Duration durationToSleep;
    @SerializedName("hr_average")
    private float hrAverage;
    @SerializedName("hr_max")
    private int hrMax;
    @SerializedName("hr_min")
    private int hrMin;
    @SerializedName("apnea_activated")
    private Boolean isSleepApneaActivated;
    @SerializedName("lightsleepduration")
    private Duration lightSleepDuration;
    @SerializedName("manual_awake_duration")
    private Duration manualAwakeDuration;
    @SerializedName("manual_sleep_duration")
    private Duration manualSleepDuration;
    @SerializedName("remsleepduration")
    private Duration remSleepDuration;
    @SerializedName("snoring")
    private Duration snoringDuration;
    @SerializedName("core_body_temperature_avg")
    private float temperatureAverage;
    @SerializedName("core_body_temperature_max")
    private float temperatureMax;
    @SerializedName("core_body_temperature_min")
    private float temperatureMin;
    @SerializedName("asleepduration")
    private Duration unspecifiedSleepDuration;
    @SerializedName("wakeupcount")
    private Integer wakeUpCount;
    @SerializedName("wakeupduration")
    private Duration wakeUpDuration;
    @SerializedName("wsdid")
    private Long wsdId;

    public SleepTrackData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SleepTrackData)) {
            return false;
        }
        SleepTrackData sleepTrackData = (SleepTrackData) obj;
        if (this.wakeUpDuration != sleepTrackData.wakeUpDuration || this.wakeUpCount != sleepTrackData.wakeUpCount || this.durationToSleep != sleepTrackData.durationToSleep || this.durationToGetUp != sleepTrackData.durationToGetUp || this.lightSleepDuration != sleepTrackData.lightSleepDuration || this.deepSleepDuration != sleepTrackData.deepSleepDuration || this.remSleepDuration != sleepTrackData.remSleepDuration || this.unspecifiedSleepDuration != sleepTrackData.unspecifiedSleepDuration || this.snoringDuration != sleepTrackData.snoringDuration) {
            return false;
        }
        Long l5 = this.wsdId;
        if (((l5 == null || !l5.equals(sleepTrackData.wsdId)) && (this.wsdId != null || sleepTrackData.wsdId != null)) || this.hrAverage != sleepTrackData.hrAverage || this.hrMin != sleepTrackData.hrMin || this.hrMax != sleepTrackData.hrMax || this.manualSleepDuration != sleepTrackData.manualSleepDuration || this.manualAwakeDuration != sleepTrackData.manualAwakeDuration) {
            return false;
        }
        Integer num = this.apneaHypopneaIndex;
        if ((num == null || !num.equals(sleepTrackData.apneaHypopneaIndex)) && (this.apneaHypopneaIndex != null || sleepTrackData.apneaHypopneaIndex != null)) {
            return false;
        }
        Integer num2 = this.breathingEventProbability;
        if (((num2 == null || !num2.equals(sleepTrackData.breathingEventProbability)) && (this.breathingEventProbability != null || sleepTrackData.breathingEventProbability != null)) || this.isSleepApneaActivated != sleepTrackData.isSleepApneaActivated) {
            return false;
        }
        Float f11 = this.averageSpo2;
        if ((f11 == null || !f11.equals(sleepTrackData.averageSpo2)) && (this.averageSpo2 != null || sleepTrackData.averageSpo2 != null)) {
            return false;
        }
        return true;
    }

    public Integer getApneaHypopneaIndex() {
        return this.apneaHypopneaIndex;
    }

    public Float getAverageSpo2() {
        return this.averageSpo2;
    }

    public Integer getBreathingEventProbability() {
        return this.breathingEventProbability;
    }

    public Duration getDeepSleepDuration() {
        return this.deepSleepDuration;
    }

    public Duration getDurationOrZero(Duration duration) {
        if (duration == null) {
            return new Duration(0L);
        }
        return duration;
    }

    public Duration getDurationToGetUp() {
        return this.durationToGetUp;
    }

    public Duration getDurationToSleep() {
        return this.durationToSleep;
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

    public Duration getLightSleepDuration() {
        return this.lightSleepDuration;
    }

    public Duration getManualAwakeDuration() {
        return this.manualAwakeDuration;
    }

    public Duration getManualSleepDuration() {
        return this.manualSleepDuration;
    }

    public Duration getRemSleepDuration() {
        return this.remSleepDuration;
    }

    public Duration getSnoringDuration() {
        return this.snoringDuration;
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

    public Duration getTotalInBed() {
        return getTotalSleep().plus(getWakeUpDuration());
    }

    public Duration getTotalSleep() {
        return getDurationOrZero(getDeepSleepDuration()).plus(getDurationOrZero(getLightSleepDuration())).plus(getDurationOrZero(getRemSleepDuration())).plus(getDurationOrZero(getManualSleepDuration())).plus(getDurationOrZero(getUnspecifiedSleepDuration()));
    }

    public Float getUSAverageSpo2() {
        return this.averageSpo2US;
    }

    public Duration getUnspecifiedSleepDuration() {
        return this.unspecifiedSleepDuration;
    }

    public Integer getWakeUpCount() {
        return this.wakeUpCount;
    }

    public Duration getWakeUpDuration() {
        return this.wakeUpDuration;
    }

    public Long getWsdId() {
        return this.wsdId;
    }

    public int hashCode() {
        return 0;
    }

    public Boolean isSleepApneaActivated() {
        return this.isSleepApneaActivated;
    }

    public void setApneaHypopneaIndex(Integer num) {
        this.apneaHypopneaIndex = num;
    }

    public void setAverageSpo2(Float f11) {
        this.averageSpo2 = f11;
    }

    public void setBreathingEventProbability(Integer num) {
        this.breathingEventProbability = num;
    }

    public void setDeepSleepDuration(Duration duration) {
        this.deepSleepDuration = duration;
    }

    public void setDurationToGetUp(Duration duration) {
        this.durationToGetUp = duration;
    }

    public void setDurationToSleep(Duration duration) {
        this.durationToSleep = duration;
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

    public void setLightSleepDuration(Duration duration) {
        this.lightSleepDuration = duration;
    }

    public void setManualAwakeDuration(Duration duration) {
        this.manualAwakeDuration = duration;
    }

    public void setManualSleepDuration(Duration duration) {
        this.manualSleepDuration = duration;
    }

    public void setRemSleepDuration(Duration duration) {
        this.remSleepDuration = duration;
    }

    public void setSleepApneaActivated(Boolean bool) {
        this.isSleepApneaActivated = bool;
    }

    public void setSnoringDuration(Duration duration) {
        this.snoringDuration = duration;
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

    public void setUSAverageSpo2(Float f11) {
        this.averageSpo2US = f11;
    }

    public void setUnspecifiedSleepDuration(Duration duration) {
        this.unspecifiedSleepDuration = duration;
    }

    public void setWakeUpCount(Integer num) {
        this.wakeUpCount = num;
    }

    public void setWakeUpDuration(Duration duration) {
        this.wakeUpDuration = duration;
    }

    public void setWsdId(Long l5) {
        this.wsdId = l5;
    }

    public String toString() {
        return "SleepTrackData{wakeUpDuration=" + this.wakeUpDuration + ", wakeUpCount=" + this.wakeUpCount + ", durationToSleep=" + this.durationToSleep + ", durationToGetUp=" + this.durationToGetUp + ", lightSleepDuration=" + this.lightSleepDuration + ", deepSleepDuration=" + this.deepSleepDuration + ", remSleepDuration=" + this.remSleepDuration + ", unspecifiedSleepDuration=" + this.unspecifiedSleepDuration + ", snoringDuration=" + this.snoringDuration + ", wsdId=" + this.wsdId + ", hrAverage=" + this.hrAverage + ", hrMin=" + this.hrMin + ", hrMax=" + this.hrMax + ", manualSleepDuration=" + this.manualSleepDuration + ", manualAwakeDuration=" + this.manualAwakeDuration + ", apneaHypopneaIndex=" + this.apneaHypopneaIndex + ", breathingEventProbability=" + this.breathingEventProbability + ", isSleepApneaAcivated=" + this.isSleepApneaActivated + ", averageSpo2=" + this.averageSpo2 + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        if (this.wakeUpDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.wakeUpDuration.getMillis());
        }
        parcel.writeInt(this.wakeUpCount.intValue());
        if (this.durationToSleep == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.durationToSleep.getMillis());
        }
        if (this.lightSleepDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.lightSleepDuration.getMillis());
        }
        if (this.deepSleepDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.deepSleepDuration.getMillis());
        }
        if (this.remSleepDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.remSleepDuration.getMillis());
        }
        if (this.wsdId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.wsdId.longValue());
        }
        parcel.writeFloat(this.hrAverage);
        parcel.writeInt(this.hrMin);
        parcel.writeInt(this.hrMax);
        parcel.writeFloat(this.temperatureAverage);
        parcel.writeFloat(this.temperatureMin);
        parcel.writeFloat(this.temperatureMax);
        if (this.durationToGetUp == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.durationToGetUp.getMillis());
        }
        if (this.snoringDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.snoringDuration.getMillis());
        }
        if (this.manualSleepDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.manualSleepDuration.getMillis());
        }
        if (this.manualAwakeDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.manualAwakeDuration.getMillis());
        }
        if (this.apneaHypopneaIndex == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.apneaHypopneaIndex.intValue());
        }
        if (this.breathingEventProbability == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.breathingEventProbability.intValue());
        }
        Boolean bool = this.isSleepApneaActivated;
        if (bool == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte(bool.booleanValue() ? (byte) 1 : (byte) 0);
        }
        if (this.averageSpo2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(this.averageSpo2.floatValue());
        }
        if (this.unspecifiedSleepDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.unspecifiedSleepDuration.getMillis());
        }
        if (this.averageSpo2US == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeFloat(this.averageSpo2US.floatValue());
    }

    protected SleepTrackData(Parcel parcel) {
        this.wakeUpDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.wakeUpCount = Integer.valueOf(parcel.readInt());
        this.durationToSleep = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.lightSleepDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.deepSleepDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.remSleepDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.wsdId = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.hrAverage = parcel.readFloat();
        this.hrMin = parcel.readInt();
        this.hrMax = parcel.readInt();
        this.temperatureAverage = parcel.readFloat();
        this.temperatureMin = parcel.readFloat();
        this.temperatureMax = parcel.readFloat();
        this.durationToGetUp = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.snoringDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.manualSleepDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.manualAwakeDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.apneaHypopneaIndex = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.breathingEventProbability = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.isSleepApneaActivated = Boolean.valueOf(parcel.readByte() == 1);
        this.averageSpo2 = parcel.readByte() == 0 ? null : Float.valueOf(parcel.readFloat());
        this.unspecifiedSleepDuration = parcel.readByte() == 0 ? null : new Duration(parcel.readLong());
        this.averageSpo2US = parcel.readByte() != 0 ? Float.valueOf(parcel.readFloat()) : null;
    }

    public SleepTrackData(SleepTrackData sleepTrackData) {
        this.wakeUpDuration = sleepTrackData.wakeUpDuration;
        this.wakeUpCount = sleepTrackData.wakeUpCount;
        this.durationToSleep = sleepTrackData.durationToSleep;
        this.durationToGetUp = sleepTrackData.durationToGetUp;
        this.lightSleepDuration = sleepTrackData.lightSleepDuration;
        this.deepSleepDuration = sleepTrackData.deepSleepDuration;
        this.remSleepDuration = sleepTrackData.remSleepDuration;
        this.unspecifiedSleepDuration = sleepTrackData.unspecifiedSleepDuration;
        this.wsdId = sleepTrackData.wsdId;
        this.hrAverage = sleepTrackData.hrAverage;
        this.hrMin = sleepTrackData.hrMin;
        this.hrMax = sleepTrackData.hrMax;
        this.temperatureAverage = sleepTrackData.temperatureAverage;
        this.temperatureMin = sleepTrackData.temperatureMin;
        this.temperatureMax = sleepTrackData.temperatureMax;
        this.snoringDuration = sleepTrackData.snoringDuration;
        this.manualSleepDuration = sleepTrackData.manualSleepDuration;
        this.manualAwakeDuration = sleepTrackData.manualAwakeDuration;
        this.apneaHypopneaIndex = sleepTrackData.apneaHypopneaIndex;
        this.breathingEventProbability = sleepTrackData.breathingEventProbability;
        this.isSleepApneaActivated = sleepTrackData.isSleepApneaActivated;
        this.averageSpo2 = sleepTrackData.averageSpo2;
        this.averageSpo2US = sleepTrackData.averageSpo2US;
    }
}

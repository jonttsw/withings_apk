package com.withings.core.data.aggregate;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.k0;
import com.withings.core.data.aggregate.ws.WsAggregate;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
/* loaded from: classes3.dex */
public class ActivityAggregate implements Parcelable, Cloneable {
    public static final Parcelable.Creator<ActivityAggregate> CREATOR = new Parcelable.Creator<ActivityAggregate>() { // from class: com.withings.core.data.aggregate.ActivityAggregate.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityAggregate createFromParcel(Parcel parcel) {
            return new ActivityAggregate(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityAggregate[] newArray(int i11) {
            return new ActivityAggregate[i11];
        }
    };
    public static final String DAY_FORMAT = "yyyy-MM-dd";
    private float ascent;
    private float averageSpO2;
    private float averageSpO2US;
    private int brand;
    private float calories;
    private String day;
    private float descent;
    private int deviceModel;
    private float distance;
    private float earnedCalories;
    private float hrAverage;
    private int hrMax;
    private int hrMin;
    private int hrResting;
    private int hrZoneIntense;
    private int hrZoneLight;
    private int hrZoneModerate;
    private int hrZonePeak;
    private long inactiveDuration;
    private long intenseMETDuration;
    private boolean isCompleted;
    private float manualAdditionCalories;
    private float manualAdditionDistance;
    private DateTime midnight;
    private long moderateMETDuration;
    private long modified;
    private int nbMeasureAuto;
    private int nbMeasureManual;
    private float passiveCalories;
    private long softMETDuration;
    private int steps;
    private boolean syncedToWs;
    private DateTime synchroTime;
    private float temperatureAverage;
    private float temperatureMax;
    private float temperatureMin;
    private String timezone;

    public ActivityAggregate() {
        this.synchroTime = new DateTime(0L);
        this.modified = 0L;
        this.midnight = new DateTime(0L);
        this.timezone = DateTimeZone.getDefault().toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getAscent() {
        return this.ascent;
    }

    public float getAverageSpO2() {
        return this.averageSpO2;
    }

    public float getAverageSpO2US() {
        return this.averageSpO2US;
    }

    public int getBrand() {
        return this.brand;
    }

    public float getCalories() {
        return this.calories;
    }

    public DateTimeZone getDateTimeZone() {
        try {
            return DateTimeZone.forID(this.timezone);
        } catch (IllegalArgumentException unused) {
            return DateTimeZone.getDefault();
        }
    }

    public String getDay() {
        return this.day;
    }

    public float getDescent() {
        return this.descent;
    }

    public int getDeviceModel() {
        return this.deviceModel;
    }

    public float getDistance() {
        return this.distance;
    }

    public float getEarnedCalories() {
        return this.earnedCalories;
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

    public int getHrResting() {
        return this.hrResting;
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

    public long getInactiveDuration() {
        return this.inactiveDuration;
    }

    public long getIntenseMETDuration() {
        return this.intenseMETDuration;
    }

    public float getManualAdditionCalories() {
        return this.manualAdditionCalories;
    }

    public float getManualAdditionDistance() {
        return this.manualAdditionDistance;
    }

    public DateTime getMidnight() {
        return this.midnight;
    }

    public long getModerateMETDuration() {
        return this.moderateMETDuration;
    }

    public long getModified() {
        return this.modified;
    }

    public int getNbMeasureAuto() {
        return this.nbMeasureAuto;
    }

    public int getNbMeasureManual() {
        return this.nbMeasureManual;
    }

    public float getPassiveCalories() {
        return this.passiveCalories;
    }

    public long getSoftMETDuration() {
        return this.softMETDuration;
    }

    public int getSteps() {
        return this.steps;
    }

    public DateTime getSynchroTime() {
        return this.synchroTime;
    }

    public Float getTemperatureAverage() {
        return Float.valueOf(this.temperatureAverage);
    }

    public Float getTemperatureMax() {
        return Float.valueOf(this.temperatureMax);
    }

    public Float getTemperatureMin() {
        return Float.valueOf(this.temperatureMin);
    }

    public long getTimeWithActiveMet() {
        return getModerateMETDuration() + getIntenseMETDuration();
    }

    public long getTimeWithMet() {
        return getSoftMETDuration() + getModerateMETDuration() + getIntenseMETDuration();
    }

    public String getTimezone() {
        return this.timezone;
    }

    public float getTotalDistance() {
        return this.distance + this.manualAdditionDistance;
    }

    public float getTotalEarnedCalories() {
        return this.earnedCalories + this.manualAdditionCalories;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public boolean isFull() {
        if (this.syncedToWs && !this.synchroTime.isBefore(this.midnight.plusDays(1).withTimeAtStartOfDay())) {
            return true;
        }
        return false;
    }

    public boolean isSyncedToWs() {
        return this.syncedToWs;
    }

    public void setAscent(float f11) {
        this.ascent = f11;
    }

    public void setAverageSpO2(float f11) {
        this.averageSpO2 = f11;
    }

    public void setAverageSpO2US(float f11) {
        this.averageSpO2US = f11;
    }

    public void setBrand(int i11) {
        this.brand = i11;
    }

    public void setCalories(float f11) {
        this.calories = f11;
    }

    public void setCompleted(boolean z5) {
        this.isCompleted = z5;
    }

    public void setDay(String str) {
        this.day = str;
    }

    public void setDescent(float f11) {
        this.descent = f11;
    }

    public void setDeviceModel(int i11) {
        this.deviceModel = i11;
    }

    public void setDistance(float f11) {
        this.distance = f11;
    }

    public void setEarnedCalories(float f11) {
        this.earnedCalories = f11;
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

    public void setHrResting(int i11) {
        this.hrResting = i11;
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

    public void setInactiveDuration(long j5) {
        this.inactiveDuration = j5;
    }

    public void setIntenseMETDuration(long j5) {
        this.intenseMETDuration = j5;
    }

    public void setManualAdditionCalories(float f11) {
        this.manualAdditionCalories = f11;
    }

    public void setManualAdditionDistance(float f11) {
        this.manualAdditionDistance = f11;
    }

    public void setMidnight(DateTime dateTime) {
        this.midnight = dateTime;
    }

    public void setModerateMETDuration(long j5) {
        this.moderateMETDuration = j5;
    }

    public void setModified(long j5) {
        this.modified = j5;
    }

    public void setNbMeasureAuto(int i11) {
        this.nbMeasureAuto = i11;
    }

    public void setNbMeasureManual(int i11) {
        this.nbMeasureManual = i11;
    }

    public void setPassiveCalories(float f11) {
        this.passiveCalories = f11;
    }

    public void setSoftMETDuration(long j5) {
        this.softMETDuration = j5;
    }

    public void setSteps(int i11) {
        this.steps = i11;
    }

    public void setSyncedToWs(boolean z5) {
        this.syncedToWs = z5;
    }

    public void setSynchroTime(DateTime dateTime) {
        this.synchroTime = dateTime;
    }

    public void setTemperatureAverage(Float f11) {
        float f12;
        if (f11 != null) {
            f12 = f11.floatValue();
        } else {
            f12 = 0.0f;
        }
        this.temperatureAverage = f12;
    }

    public void setTemperatureMax(Float f11) {
        float f12;
        if (f11 != null) {
            f12 = f11.floatValue();
        } else {
            f12 = 0.0f;
        }
        this.temperatureMax = f12;
    }

    public void setTemperatureMin(Float f11) {
        float f12;
        if (f11 != null) {
            f12 = f11.floatValue();
        } else {
            f12 = 0.0f;
        }
        this.temperatureMin = f12;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityAggregate{day='");
        sb2.append(this.day);
        sb2.append("', synchroTime=");
        sb2.append(this.synchroTime);
        sb2.append(", modified=");
        sb2.append(this.modified);
        sb2.append(", midnight=");
        sb2.append(this.midnight);
        sb2.append(", timezone='");
        sb2.append(this.timezone);
        sb2.append("', brand=");
        sb2.append(this.brand);
        sb2.append(", steps=");
        sb2.append(this.steps);
        sb2.append(", calories=");
        sb2.append(this.calories);
        sb2.append(", earnedCalories=");
        sb2.append(this.earnedCalories);
        sb2.append(", passiveCalories=");
        sb2.append(this.passiveCalories);
        sb2.append(", distance=");
        sb2.append(this.distance);
        sb2.append(", ascent=");
        sb2.append(this.ascent);
        sb2.append(", descent=");
        sb2.append(this.descent);
        sb2.append(", inactiveDuration=");
        sb2.append(this.inactiveDuration);
        sb2.append(", softMETDuration=");
        sb2.append(this.softMETDuration);
        sb2.append(", moderateMETDuration=");
        sb2.append(this.moderateMETDuration);
        sb2.append(", intenseMETDuration=");
        sb2.append(this.intenseMETDuration);
        sb2.append(", syncedToWs=");
        sb2.append(this.syncedToWs);
        sb2.append(", deviceModel=");
        sb2.append(this.deviceModel);
        sb2.append(", manualAdditionCalories=");
        sb2.append(this.manualAdditionCalories);
        sb2.append(", manualAdditionDistance=");
        sb2.append(this.manualAdditionDistance);
        sb2.append(", hrAverage=");
        sb2.append(this.hrAverage);
        sb2.append(", hrResting=");
        sb2.append(this.hrResting);
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
        sb2.append(", isCompleted=");
        sb2.append(this.isCompleted);
        sb2.append(", averageSpo2=");
        sb2.append(this.averageSpO2);
        sb2.append(", averageSpo2US=");
        sb2.append(this.averageSpO2US);
        sb2.append(", nbMeasureAuto=");
        sb2.append(this.nbMeasureAuto);
        sb2.append(", nbMeasureManual=");
        sb2.append(this.nbMeasureManual);
        sb2.append(", temperatureAverage=");
        sb2.append(this.temperatureAverage);
        sb2.append(", temperatureMin=");
        sb2.append(this.temperatureMin);
        sb2.append(", temperatureMax=");
        return k0.j(sb2, this.temperatureMax, '}');
    }

    public WsAggregate toWsAggregate() {
        WsAggregate wsAggregate = new WsAggregate();
        wsAggregate.date = this.day;
        wsAggregate.synchroTime = this.synchroTime;
        wsAggregate.modified = new DateTime(this.modified);
        wsAggregate.midnight = this.midnight;
        wsAggregate.timezone = this.timezone;
        wsAggregate.brand = this.brand;
        wsAggregate.steps = this.steps;
        wsAggregate.calories = this.calories;
        wsAggregate.earnedCalories = this.earnedCalories;
        wsAggregate.passiveCalories = this.passiveCalories;
        wsAggregate.distance = this.distance;
        wsAggregate.ascent = this.ascent;
        wsAggregate.inactiveDurationSecond = (int) (this.inactiveDuration / 1000);
        wsAggregate.softMETDurationSecond = (int) (this.softMETDuration / 1000);
        wsAggregate.moderateMETDurationSecond = (int) (this.moderateMETDuration / 1000);
        wsAggregate.intenseMETDurationSecond = (int) (this.intenseMETDuration / 1000);
        wsAggregate.manualAdditionCalories = this.manualAdditionCalories;
        wsAggregate.manualAdditionDistance = this.manualAdditionDistance;
        WsAggregate.HRValues hRValues = new WsAggregate.HRValues();
        wsAggregate.hrvalues = hRValues;
        hRValues.hrAverage = this.hrAverage;
        hRValues.hrResting = this.hrResting;
        hRValues.hrMin = this.hrMin;
        hRValues.hrMax = this.hrMax;
        hRValues.hrZoneLight = this.hrZoneLight;
        hRValues.hrZoneModerate = this.hrZoneModerate;
        hRValues.hrZoneIntense = this.hrZoneIntense;
        hRValues.hrZonePeak = this.hrZonePeak;
        wsAggregate.isCompleted = this.isCompleted;
        if (this.averageSpO2 >= 0.0f) {
            WsAggregate.SpO2Values spO2Values = new WsAggregate.SpO2Values();
            wsAggregate.spO2Values = spO2Values;
            spO2Values.averageSpO2 = this.averageSpO2;
            spO2Values.averageSpO2US = this.averageSpO2US;
            spO2Values.nbMeasureAuto = this.nbMeasureAuto;
            spO2Values.nbMeasureManual = this.nbMeasureManual;
        }
        WsAggregate.TemperatureValues temperatureValues = new WsAggregate.TemperatureValues();
        wsAggregate.temperatureValues = temperatureValues;
        temperatureValues.temperatureAverage = this.temperatureAverage;
        temperatureValues.temperatureMin = this.temperatureMin;
        temperatureValues.temperatureMax = this.temperatureMax;
        return wsAggregate;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        long j5;
        parcel.writeString(this.day);
        DateTime dateTime = this.synchroTime;
        long j11 = 0;
        if (dateTime != null) {
            j5 = dateTime.getMillis();
        } else {
            j5 = 0;
        }
        parcel.writeLong(j5);
        parcel.writeLong(this.modified);
        DateTime dateTime2 = this.midnight;
        if (dateTime2 != null) {
            j11 = dateTime2.getMillis();
        }
        parcel.writeLong(j11);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.brand);
        parcel.writeInt(this.steps);
        parcel.writeFloat(this.calories);
        parcel.writeFloat(this.earnedCalories);
        parcel.writeFloat(this.passiveCalories);
        parcel.writeFloat(this.distance);
        parcel.writeFloat(this.ascent);
        parcel.writeFloat(this.descent);
        parcel.writeLong(this.inactiveDuration);
        parcel.writeLong(this.softMETDuration);
        parcel.writeLong(this.moderateMETDuration);
        parcel.writeLong(this.intenseMETDuration);
        parcel.writeByte(this.syncedToWs ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.deviceModel);
        parcel.writeFloat(this.manualAdditionCalories);
        parcel.writeFloat(this.manualAdditionDistance);
        parcel.writeFloat(this.hrAverage);
        parcel.writeInt(this.hrResting);
        parcel.writeInt(this.hrMin);
        parcel.writeInt(this.hrMax);
        parcel.writeInt(this.hrZoneLight);
        parcel.writeInt(this.hrZoneModerate);
        parcel.writeInt(this.hrZoneIntense);
        parcel.writeInt(this.hrZonePeak);
        parcel.writeByte(this.isCompleted ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.averageSpO2);
        parcel.writeInt(this.nbMeasureAuto);
        parcel.writeInt(this.nbMeasureManual);
        parcel.writeFloat(this.temperatureMin);
        parcel.writeFloat(this.temperatureMax);
        parcel.writeFloat(this.temperatureAverage);
        parcel.writeFloat(this.averageSpO2US);
    }

    protected ActivityAggregate(Parcel parcel) {
        this.synchroTime = new DateTime(0L);
        this.modified = 0L;
        this.midnight = new DateTime(0L);
        this.timezone = DateTimeZone.getDefault().toString();
        this.day = parcel.readString();
        this.synchroTime = new DateTime(parcel.readLong());
        this.modified = parcel.readLong();
        this.midnight = new DateTime(parcel.readLong());
        this.timezone = parcel.readString();
        this.brand = parcel.readInt();
        this.steps = parcel.readInt();
        this.calories = parcel.readFloat();
        this.earnedCalories = parcel.readFloat();
        this.passiveCalories = parcel.readFloat();
        this.distance = parcel.readFloat();
        this.ascent = parcel.readFloat();
        this.descent = parcel.readFloat();
        this.inactiveDuration = parcel.readLong();
        this.softMETDuration = parcel.readLong();
        this.moderateMETDuration = parcel.readLong();
        this.intenseMETDuration = parcel.readLong();
        this.syncedToWs = parcel.readByte() != 0;
        this.deviceModel = parcel.readInt();
        this.manualAdditionCalories = parcel.readFloat();
        this.manualAdditionDistance = parcel.readFloat();
        this.hrAverage = parcel.readFloat();
        this.hrResting = parcel.readInt();
        this.hrMin = parcel.readInt();
        this.hrMax = parcel.readInt();
        this.hrZoneLight = parcel.readInt();
        this.hrZoneModerate = parcel.readInt();
        this.hrZoneIntense = parcel.readInt();
        this.hrZonePeak = parcel.readInt();
        this.isCompleted = parcel.readByte() != 0;
        this.averageSpO2 = parcel.readFloat();
        this.nbMeasureAuto = parcel.readInt();
        this.nbMeasureManual = parcel.readInt();
        this.temperatureMin = parcel.readFloat();
        this.temperatureMax = parcel.readFloat();
        this.temperatureAverage = parcel.readFloat();
        this.averageSpO2US = parcel.readFloat();
    }

    public ActivityAggregate(WsAggregate wsAggregate) {
        this.synchroTime = new DateTime(0L);
        this.modified = 0L;
        this.midnight = new DateTime(0L);
        this.timezone = DateTimeZone.getDefault().toString();
        this.day = wsAggregate.date;
        this.synchroTime = wsAggregate.synchroTime;
        this.modified = wsAggregate.modified.getMillis();
        this.midnight = wsAggregate.midnight;
        this.timezone = wsAggregate.timezone;
        this.brand = wsAggregate.brand;
        this.steps = wsAggregate.steps;
        this.calories = wsAggregate.calories;
        this.earnedCalories = wsAggregate.earnedCalories;
        this.passiveCalories = wsAggregate.passiveCalories;
        this.distance = wsAggregate.distance;
        this.ascent = wsAggregate.ascent;
        this.inactiveDuration = wsAggregate.inactiveDurationSecond * 1000;
        this.softMETDuration = wsAggregate.softMETDurationSecond * 1000;
        this.moderateMETDuration = wsAggregate.moderateMETDurationSecond * 1000;
        this.intenseMETDuration = wsAggregate.intenseMETDurationSecond * 1000;
        this.manualAdditionCalories = wsAggregate.manualAdditionCalories;
        this.manualAdditionDistance = wsAggregate.manualAdditionDistance;
        WsAggregate.HRValues hRValues = wsAggregate.hrvalues;
        if (hRValues != null) {
            this.hrAverage = hRValues.hrAverage;
            this.hrResting = hRValues.hrResting;
            this.hrMin = hRValues.hrMin;
            this.hrMax = hRValues.hrMax;
            this.hrZoneLight = hRValues.hrZoneLight;
            this.hrZoneModerate = hRValues.hrZoneModerate;
            this.hrZoneIntense = hRValues.hrZoneIntense;
            this.hrZonePeak = hRValues.hrZonePeak;
        }
        this.isCompleted = wsAggregate.isCompleted;
        WsAggregate.SpO2Values spO2Values = wsAggregate.spO2Values;
        if (spO2Values != null) {
            this.averageSpO2 = spO2Values.averageSpO2;
            this.averageSpO2US = spO2Values.averageSpO2US;
            this.nbMeasureAuto = spO2Values.nbMeasureAuto;
            this.nbMeasureManual = spO2Values.nbMeasureManual;
        }
        this.syncedToWs = true;
        WsAggregate.TemperatureValues temperatureValues = wsAggregate.temperatureValues;
        if (temperatureValues != null) {
            this.temperatureAverage = temperatureValues.temperatureAverage;
            this.temperatureMin = temperatureValues.temperatureMin;
            this.temperatureMax = temperatureValues.temperatureMax;
        }
    }
}

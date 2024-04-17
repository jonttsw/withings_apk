package com.withings.wiscale2.track.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.withings.library.sleep.SleepScoreAlgoComponent;
import com.withings.library.sleep.SleepScoreStruct;
import java.util.Objects;
/* loaded from: classes5.dex */
public class SleepScore implements Parcelable {
    public static final Parcelable.Creator<SleepScore> CREATOR = new Parcelable.Creator<SleepScore>() { // from class: com.withings.wiscale2.track.data.SleepScore.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepScore createFromParcel(Parcel parcel) {
            return new SleepScore(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepScore[] newArray(int i11) {
            return new SleepScore[i11];
        }
    };
    @SerializedName("night_heartrate")
    private Info nightHeartRate;
    @SerializedName("recovery")
    private Info recovery;
    @SerializedName("regularity")
    private Info regularity;
    @SerializedName("sleep_duration")
    private Info sleepDuration;
    @SerializedName("sleep_interruptions")
    private Info sleepInterruptions;
    @SerializedName("version")
    private int sleepScoreAlgoVersion;
    @SerializedName("status")
    private int sleepScoreStatus;
    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private int sleepScoreValue;
    @SerializedName("snoring")
    private Info snoring;
    @SerializedName("time_to_fall_asleep")
    private Info timeToFallAsleep;
    @SerializedName("time_to_wake_up")
    private Info timeToGetUp;

    public SleepScore(int i11, int i12, int i13, Info info, Info info2, Info info3, Info info4, Info info5, Info info6, Info info7, Info info8) {
        this.sleepScoreValue = i11;
        this.sleepScoreStatus = i12;
        this.sleepScoreAlgoVersion = i13;
        this.sleepDuration = info;
        this.recovery = info2;
        this.sleepInterruptions = info3;
        this.timeToFallAsleep = info4;
        this.timeToGetUp = info5;
        this.regularity = info6;
        this.snoring = info7;
        this.nightHeartRate = info8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SleepScore)) {
            return false;
        }
        SleepScore sleepScore = (SleepScore) obj;
        if (this.sleepScoreValue != sleepScore.sleepScoreValue || this.sleepScoreStatus != sleepScore.sleepScoreStatus || this.sleepDuration.score != sleepScore.getSleepDuration().score || this.sleepDuration.status != sleepScore.getSleepDuration().status || this.recovery.score != sleepScore.getRecovery().score || this.recovery.status != sleepScore.getRecovery().status || this.sleepInterruptions.score != sleepScore.getSleepInterruptions().score || this.sleepInterruptions.status != sleepScore.getSleepInterruptions().status || this.timeToFallAsleep.score != sleepScore.getTimeToFallAsleep().score || this.timeToFallAsleep.status != sleepScore.getTimeToFallAsleep().status || this.timeToGetUp.score != sleepScore.getTimeToGetUp().score || this.timeToGetUp.status != sleepScore.getTimeToGetUp().status || this.regularity.score != sleepScore.getRegularity().score || this.regularity.status != sleepScore.getRegularity().status || this.snoring.score != sleepScore.getSnoring().score || this.snoring.status != sleepScore.getSnoring().status || this.nightHeartRate.score != sleepScore.getNightHeartRate().score || this.nightHeartRate.status != sleepScore.getNightHeartRate().status) {
            return false;
        }
        return true;
    }

    public Info getNightHeartRate() {
        return this.nightHeartRate;
    }

    public Info getRecovery() {
        return this.recovery;
    }

    public Info getRegularity() {
        return this.regularity;
    }

    public Info getSleepDuration() {
        return this.sleepDuration;
    }

    public Info getSleepInterruptions() {
        return this.sleepInterruptions;
    }

    public int getSleepScoreAlgoVersion() {
        return this.sleepScoreAlgoVersion;
    }

    public int getSleepScoreStatus() {
        return this.sleepScoreStatus;
    }

    public int getSleepScoreValue() {
        return this.sleepScoreValue;
    }

    public Info getSnoring() {
        return this.snoring;
    }

    public Info getTimeToFallAsleep() {
        return this.timeToFallAsleep;
    }

    public Info getTimeToGetUp() {
        return this.timeToGetUp;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.sleepScoreValue), Integer.valueOf(this.sleepScoreStatus), Integer.valueOf(this.sleepScoreAlgoVersion), this.sleepDuration, this.recovery, this.sleepInterruptions, this.timeToFallAsleep, this.timeToGetUp, this.regularity, this.snoring, this.nightHeartRate);
    }

    public boolean isSleepScoreConsistent() {
        if (this.sleepScoreValue > 0 && this.sleepScoreStatus > 0) {
            return true;
        }
        return false;
    }

    public void setNightHeartRate(Info info) {
        this.nightHeartRate = info;
    }

    public void setRecovery(Info info) {
        this.recovery = info;
    }

    public void setRegularity(Info info) {
        this.regularity = info;
    }

    public void setSleepDuration(Info info) {
        this.sleepDuration = info;
    }

    public void setSleepInterruptions(Info info) {
        this.sleepInterruptions = info;
    }

    public void setSleepScoreAlgoVersion(int i11) {
        this.sleepScoreAlgoVersion = i11;
    }

    public void setSleepScoreStatus(int i11) {
        this.sleepScoreStatus = i11;
    }

    public void setSleepScoreValue(int i11) {
        this.sleepScoreValue = i11;
    }

    public void setSnoring(Info info) {
        this.snoring = info;
    }

    public void setTimeToFallAsleep(Info info) {
        this.timeToFallAsleep = info;
    }

    public void setTimeToGetUp(Info info) {
        this.timeToGetUp = info;
    }

    public String toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(FirebaseAnalytics.Param.SCORE, Integer.valueOf(this.sleepScoreValue));
        jsonObject.addProperty("status", Integer.valueOf(this.sleepScoreStatus));
        jsonObject.addProperty("version", Integer.valueOf(this.sleepScoreAlgoVersion));
        jsonObject.add("sleep_duration", this.sleepDuration.toJsonObject());
        jsonObject.add("recovery", this.recovery.toJsonObject());
        jsonObject.add("sleep_interruptions", this.sleepInterruptions.toJsonObject());
        jsonObject.add("time_to_fall_asleep", this.timeToFallAsleep.toJsonObject());
        jsonObject.add("time_to_wake_up", this.timeToGetUp.toJsonObject());
        jsonObject.add("regularity", this.regularity.toJsonObject());
        jsonObject.add("snoring", this.snoring.toJsonObject());
        jsonObject.add("night_heartrate", this.nightHeartRate.toJsonObject());
        return jsonObject.toString();
    }

    public String toString() {
        return "SleepScore : {sleepScoreValue : " + this.sleepScoreValue + ", sleepScoreStatus : " + this.sleepScoreStatus + ", sleepDuration : (" + this.sleepDuration + "), recovery : (" + this.recovery + "), sleepInterruptions : (" + this.sleepInterruptions + "), timeToFallAsleep : (" + this.timeToFallAsleep + "), timeToGetUp : (" + this.timeToGetUp + "), regularity : (" + this.regularity + "), snoring : (" + this.snoring + "), nightHeartRate : (" + this.nightHeartRate + ")}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.sleepScoreValue);
        parcel.writeInt(this.sleepScoreStatus);
        parcel.writeInt(this.sleepScoreAlgoVersion);
        parcel.writeParcelable(this.sleepDuration, i11);
        parcel.writeParcelable(this.recovery, i11);
        parcel.writeParcelable(this.sleepInterruptions, i11);
        parcel.writeParcelable(this.timeToFallAsleep, i11);
        parcel.writeParcelable(this.timeToGetUp, i11);
        parcel.writeParcelable(this.regularity, i11);
        parcel.writeParcelable(this.snoring, i11);
        parcel.writeParcelable(this.nightHeartRate, i11);
    }

    /* loaded from: classes5.dex */
    public static class Info implements Parcelable {
        public static final Parcelable.Creator<Info> CREATOR = new Parcelable.Creator<Info>() { // from class: com.withings.wiscale2.track.data.SleepScore.Info.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Info createFromParcel(Parcel parcel) {
                return new Info(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Info[] newArray(int i11) {
                return new Info[i11];
            }
        };
        private int score;
        private int status;

        public Info(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
            this.score = (int) sleepScoreAlgoComponent.getScore();
            this.status = sleepScoreAlgoComponent.getStatus();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getScore() {
            return this.score;
        }

        public int getStatus() {
            return this.status;
        }

        public JsonObject toJsonObject() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(FirebaseAnalytics.Param.SCORE, Integer.valueOf(this.score));
            jsonObject.addProperty("status", Integer.valueOf(this.status));
            return jsonObject;
        }

        public String toString() {
            return String.format("Score : %d, Status : %s", Integer.valueOf(this.score), Integer.valueOf(this.status));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.score);
            parcel.writeInt(this.status);
        }

        public Info(int i11, int i12) {
            this.score = i11;
            this.status = i12;
        }

        protected Info(Parcel parcel) {
            this.score = parcel.readInt();
            this.status = parcel.readInt();
        }
    }

    public SleepScore(SleepScoreStruct sleepScoreStruct) {
        this.sleepScoreValue = (int) sleepScoreStruct.getScore();
        this.sleepScoreStatus = sleepScoreStruct.getStatus();
        this.sleepDuration = new Info(sleepScoreStruct.getSleepDuration());
        this.recovery = new Info(sleepScoreStruct.getRecovery());
        this.sleepInterruptions = new Info(sleepScoreStruct.getSleepInterruptions());
        this.timeToFallAsleep = new Info(sleepScoreStruct.getTimeToFallAsleep());
        this.timeToGetUp = new Info(sleepScoreStruct.getTimeToWakeUp());
        this.regularity = new Info(sleepScoreStruct.getRegularity());
        this.snoring = new Info(sleepScoreStruct.getSnoring());
        this.nightHeartRate = new Info(sleepScoreStruct.getNightHeartRate());
    }

    protected SleepScore(Parcel parcel) {
        this.sleepScoreValue = parcel.readInt();
        this.sleepScoreStatus = parcel.readInt();
        this.sleepScoreAlgoVersion = parcel.readInt();
        this.sleepDuration = (Info) parcel.readParcelable(Info.class.getClassLoader());
        this.recovery = (Info) parcel.readParcelable(Info.class.getClassLoader());
        this.sleepInterruptions = (Info) parcel.readParcelable(Info.class.getClassLoader());
        this.timeToFallAsleep = (Info) parcel.readParcelable(Info.class.getClassLoader());
        this.timeToGetUp = (Info) parcel.readParcelable(Info.class.getClassLoader());
        this.regularity = (Info) parcel.readParcelable(Info.class.getClassLoader());
        this.snoring = (Info) parcel.readParcelable(Info.class.getClassLoader());
        this.nightHeartRate = (Info) parcel.readParcelable(Info.class.getClassLoader());
    }
}

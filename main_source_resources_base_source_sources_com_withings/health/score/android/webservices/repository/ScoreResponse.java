package com.withings.health.score.android.webservices.repository;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.google.protobuf.t;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Message;
/* compiled from: GetScoreResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\bC\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020!HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020#HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003Jµ\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#HÆ\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010i\u001a\u00020!HÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0016\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010&R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&R\u0016\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010&¨\u0006k"}, d2 = {"Lcom/withings/health/score/android/webservices/repository/ScoreResponse;", "", "date", "", "healthImprovement", "", "activity", Message.BODY, "heart", "sleep", "bodyComposition", "ecgEngagement", "bloodPressure", "sleepApneaBurden", "activeMinutes", "vascularAge", "bloodPressureBurden", "ecgAfib", "bpmEngagement", "bmi", "timeToFallAsleep", "nightHr", "depth", "duration", "regularity", "timeToWakeUp", "steps", "interruptions", "sleepMonitoring", "afibBurden", "sleepQuality", "weightEngagement", WsVasistasSerie.KEY_ALGO, "", "modified", "", "(Ljava/lang/String;DDDDDDDDDDDDDDDDDDDDDDDDDDDIJ)V", "getActiveMinutes", "()D", "getActivity", "getAfibBurden", "getAlgo", "()I", "getBloodPressure", "getBloodPressureBurden", "getBmi", "getBody", "getBodyComposition", "getBpmEngagement", "getDate", "()Ljava/lang/String;", "getDepth", "getDuration", "getEcgAfib", "getEcgEngagement", "getHealthImprovement", "getHeart", "getInterruptions", "getModified", "()J", "getNightHr", "getRegularity", "getSleep", "getSleepApneaBurden", "getSleepMonitoring", "getSleepQuality", "getSteps", "getTimeToFallAsleep", "getTimeToWakeUp", "getVascularAge", "getWeightEngagement", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScoreResponse {
    @SerializedName("active_minutes")
    private final double activeMinutes;
    @SerializedName("activity")
    private final double activity;
    @SerializedName("afib_burden")
    private final double afibBurden;
    @SerializedName(WsVasistasSerie.KEY_ALGO)
    private final int algo;
    @SerializedName("blood_pressure")
    private final double bloodPressure;
    @SerializedName("blood_pressure_burden")
    private final double bloodPressureBurden;
    @SerializedName("bmi")
    private final double bmi;
    @SerializedName(Message.BODY)
    private final double body;
    @SerializedName("body_composition")
    private final double bodyComposition;
    @SerializedName("bmp_engagement")
    private final double bpmEngagement;
    @SerializedName("date")
    private final String date;
    @SerializedName("depth")
    private final double depth;
    @SerializedName("duration")
    private final double duration;
    @SerializedName("ecg_afib")
    private final double ecgAfib;
    @SerializedName("ecg_engagement")
    private final double ecgEngagement;
    @SerializedName("health_improvement")
    private final double healthImprovement;
    @SerializedName("heart")
    private final double heart;
    @SerializedName("interruptions")
    private final double interruptions;
    @SerializedName("modified")
    private final long modified;
    @SerializedName("night_hr")
    private final double nightHr;
    @SerializedName("regularity")
    private final double regularity;
    @SerializedName("sleep")
    private final double sleep;
    @SerializedName("sleep_apnea_burden")
    private final double sleepApneaBurden;
    @SerializedName("sleep_monitoring")
    private final double sleepMonitoring;
    @SerializedName("sleep_quality")
    private final double sleepQuality;
    @SerializedName("steps")
    private final double steps;
    @SerializedName("time_to_fall_asleep")
    private final double timeToFallAsleep;
    @SerializedName("time_to_wake_up")
    private final double timeToWakeUp;
    @SerializedName("vascular_age")
    private final double vascularAge;
    @SerializedName("weight_engagement")
    private final double weightEngagement;

    public ScoreResponse(String date, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, double d22, double d23, double d24, double d25, double d26, double d27, double d28, double d29, double d31, double d32, double d33, double d34, double d35, double d36, double d37, double d38, double d39, int i11, long j5) {
        u.j(date, "date");
        this.date = date;
        this.healthImprovement = d11;
        this.activity = d12;
        this.body = d13;
        this.heart = d14;
        this.sleep = d15;
        this.bodyComposition = d16;
        this.ecgEngagement = d17;
        this.bloodPressure = d18;
        this.sleepApneaBurden = d19;
        this.activeMinutes = d21;
        this.vascularAge = d22;
        this.bloodPressureBurden = d23;
        this.ecgAfib = d24;
        this.bpmEngagement = d25;
        this.bmi = d26;
        this.timeToFallAsleep = d27;
        this.nightHr = d28;
        this.depth = d29;
        this.duration = d31;
        this.regularity = d32;
        this.timeToWakeUp = d33;
        this.steps = d34;
        this.interruptions = d35;
        this.sleepMonitoring = d36;
        this.afibBurden = d37;
        this.sleepQuality = d38;
        this.weightEngagement = d39;
        this.algo = i11;
        this.modified = j5;
    }

    public final String component1() {
        return this.date;
    }

    public final double component10() {
        return this.sleepApneaBurden;
    }

    public final double component11() {
        return this.activeMinutes;
    }

    public final double component12() {
        return this.vascularAge;
    }

    public final double component13() {
        return this.bloodPressureBurden;
    }

    public final double component14() {
        return this.ecgAfib;
    }

    public final double component15() {
        return this.bpmEngagement;
    }

    public final double component16() {
        return this.bmi;
    }

    public final double component17() {
        return this.timeToFallAsleep;
    }

    public final double component18() {
        return this.nightHr;
    }

    public final double component19() {
        return this.depth;
    }

    public final double component2() {
        return this.healthImprovement;
    }

    public final double component20() {
        return this.duration;
    }

    public final double component21() {
        return this.regularity;
    }

    public final double component22() {
        return this.timeToWakeUp;
    }

    public final double component23() {
        return this.steps;
    }

    public final double component24() {
        return this.interruptions;
    }

    public final double component25() {
        return this.sleepMonitoring;
    }

    public final double component26() {
        return this.afibBurden;
    }

    public final double component27() {
        return this.sleepQuality;
    }

    public final double component28() {
        return this.weightEngagement;
    }

    public final int component29() {
        return this.algo;
    }

    public final double component3() {
        return this.activity;
    }

    public final long component30() {
        return this.modified;
    }

    public final double component4() {
        return this.body;
    }

    public final double component5() {
        return this.heart;
    }

    public final double component6() {
        return this.sleep;
    }

    public final double component7() {
        return this.bodyComposition;
    }

    public final double component8() {
        return this.ecgEngagement;
    }

    public final double component9() {
        return this.bloodPressure;
    }

    public final ScoreResponse copy(String date, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, double d22, double d23, double d24, double d25, double d26, double d27, double d28, double d29, double d31, double d32, double d33, double d34, double d35, double d36, double d37, double d38, double d39, int i11, long j5) {
        u.j(date, "date");
        return new ScoreResponse(date, d11, d12, d13, d14, d15, d16, d17, d18, d19, d21, d22, d23, d24, d25, d26, d27, d28, d29, d31, d32, d33, d34, d35, d36, d37, d38, d39, i11, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoreResponse)) {
            return false;
        }
        ScoreResponse scoreResponse = (ScoreResponse) obj;
        if (u.e(this.date, scoreResponse.date) && Double.compare(this.healthImprovement, scoreResponse.healthImprovement) == 0 && Double.compare(this.activity, scoreResponse.activity) == 0 && Double.compare(this.body, scoreResponse.body) == 0 && Double.compare(this.heart, scoreResponse.heart) == 0 && Double.compare(this.sleep, scoreResponse.sleep) == 0 && Double.compare(this.bodyComposition, scoreResponse.bodyComposition) == 0 && Double.compare(this.ecgEngagement, scoreResponse.ecgEngagement) == 0 && Double.compare(this.bloodPressure, scoreResponse.bloodPressure) == 0 && Double.compare(this.sleepApneaBurden, scoreResponse.sleepApneaBurden) == 0 && Double.compare(this.activeMinutes, scoreResponse.activeMinutes) == 0 && Double.compare(this.vascularAge, scoreResponse.vascularAge) == 0 && Double.compare(this.bloodPressureBurden, scoreResponse.bloodPressureBurden) == 0 && Double.compare(this.ecgAfib, scoreResponse.ecgAfib) == 0 && Double.compare(this.bpmEngagement, scoreResponse.bpmEngagement) == 0 && Double.compare(this.bmi, scoreResponse.bmi) == 0 && Double.compare(this.timeToFallAsleep, scoreResponse.timeToFallAsleep) == 0 && Double.compare(this.nightHr, scoreResponse.nightHr) == 0 && Double.compare(this.depth, scoreResponse.depth) == 0 && Double.compare(this.duration, scoreResponse.duration) == 0 && Double.compare(this.regularity, scoreResponse.regularity) == 0 && Double.compare(this.timeToWakeUp, scoreResponse.timeToWakeUp) == 0 && Double.compare(this.steps, scoreResponse.steps) == 0 && Double.compare(this.interruptions, scoreResponse.interruptions) == 0 && Double.compare(this.sleepMonitoring, scoreResponse.sleepMonitoring) == 0 && Double.compare(this.afibBurden, scoreResponse.afibBurden) == 0 && Double.compare(this.sleepQuality, scoreResponse.sleepQuality) == 0 && Double.compare(this.weightEngagement, scoreResponse.weightEngagement) == 0 && this.algo == scoreResponse.algo && this.modified == scoreResponse.modified) {
            return true;
        }
        return false;
    }

    public final double getActiveMinutes() {
        return this.activeMinutes;
    }

    public final double getActivity() {
        return this.activity;
    }

    public final double getAfibBurden() {
        return this.afibBurden;
    }

    public final int getAlgo() {
        return this.algo;
    }

    public final double getBloodPressure() {
        return this.bloodPressure;
    }

    public final double getBloodPressureBurden() {
        return this.bloodPressureBurden;
    }

    public final double getBmi() {
        return this.bmi;
    }

    public final double getBody() {
        return this.body;
    }

    public final double getBodyComposition() {
        return this.bodyComposition;
    }

    public final double getBpmEngagement() {
        return this.bpmEngagement;
    }

    public final String getDate() {
        return this.date;
    }

    public final double getDepth() {
        return this.depth;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final double getEcgAfib() {
        return this.ecgAfib;
    }

    public final double getEcgEngagement() {
        return this.ecgEngagement;
    }

    public final double getHealthImprovement() {
        return this.healthImprovement;
    }

    public final double getHeart() {
        return this.heart;
    }

    public final double getInterruptions() {
        return this.interruptions;
    }

    public final long getModified() {
        return this.modified;
    }

    public final double getNightHr() {
        return this.nightHr;
    }

    public final double getRegularity() {
        return this.regularity;
    }

    public final double getSleep() {
        return this.sleep;
    }

    public final double getSleepApneaBurden() {
        return this.sleepApneaBurden;
    }

    public final double getSleepMonitoring() {
        return this.sleepMonitoring;
    }

    public final double getSleepQuality() {
        return this.sleepQuality;
    }

    public final double getSteps() {
        return this.steps;
    }

    public final double getTimeToFallAsleep() {
        return this.timeToFallAsleep;
    }

    public final double getTimeToWakeUp() {
        return this.timeToWakeUp;
    }

    public final double getVascularAge() {
        return this.vascularAge;
    }

    public final double getWeightEngagement() {
        return this.weightEngagement;
    }

    public int hashCode() {
        return Long.hashCode(this.modified) + h.a(this.algo, l0.a(this.weightEngagement, l0.a(this.sleepQuality, l0.a(this.afibBurden, l0.a(this.sleepMonitoring, l0.a(this.interruptions, l0.a(this.steps, l0.a(this.timeToWakeUp, l0.a(this.regularity, l0.a(this.duration, l0.a(this.depth, l0.a(this.nightHr, l0.a(this.timeToFallAsleep, l0.a(this.bmi, l0.a(this.bpmEngagement, l0.a(this.ecgAfib, l0.a(this.bloodPressureBurden, l0.a(this.vascularAge, l0.a(this.activeMinutes, l0.a(this.sleepApneaBurden, l0.a(this.bloodPressure, l0.a(this.ecgEngagement, l0.a(this.bodyComposition, l0.a(this.sleep, l0.a(this.heart, l0.a(this.body, l0.a(this.activity, l0.a(this.healthImprovement, this.date.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.date;
        double d11 = this.healthImprovement;
        double d12 = this.activity;
        double d13 = this.body;
        double d14 = this.heart;
        double d15 = this.sleep;
        double d16 = this.bodyComposition;
        double d17 = this.ecgEngagement;
        double d18 = this.bloodPressure;
        double d19 = this.sleepApneaBurden;
        double d21 = this.activeMinutes;
        double d22 = this.vascularAge;
        double d23 = this.bloodPressureBurden;
        double d24 = this.ecgAfib;
        double d25 = this.bpmEngagement;
        double d26 = this.bmi;
        double d27 = this.timeToFallAsleep;
        double d28 = this.nightHr;
        double d29 = this.depth;
        double d31 = this.duration;
        double d32 = this.regularity;
        double d33 = this.timeToWakeUp;
        double d34 = this.steps;
        double d35 = this.interruptions;
        double d36 = this.sleepMonitoring;
        double d37 = this.afibBurden;
        double d38 = this.sleepQuality;
        double d39 = this.weightEngagement;
        int i11 = this.algo;
        long j5 = this.modified;
        StringBuilder sb2 = new StringBuilder("ScoreResponse(date=");
        sb2.append(str);
        sb2.append(", healthImprovement=");
        sb2.append(d11);
        t.d(sb2, ", activity=", d12, ", body=");
        sb2.append(d13);
        t.d(sb2, ", heart=", d14, ", sleep=");
        sb2.append(d15);
        t.d(sb2, ", bodyComposition=", d16, ", ecgEngagement=");
        sb2.append(d17);
        t.d(sb2, ", bloodPressure=", d18, ", sleepApneaBurden=");
        sb2.append(d19);
        t.d(sb2, ", activeMinutes=", d21, ", vascularAge=");
        sb2.append(d22);
        t.d(sb2, ", bloodPressureBurden=", d23, ", ecgAfib=");
        sb2.append(d24);
        t.d(sb2, ", bpmEngagement=", d25, ", bmi=");
        sb2.append(d26);
        t.d(sb2, ", timeToFallAsleep=", d27, ", nightHr=");
        sb2.append(d28);
        t.d(sb2, ", depth=", d29, ", duration=");
        sb2.append(d31);
        t.d(sb2, ", regularity=", d32, ", timeToWakeUp=");
        sb2.append(d33);
        t.d(sb2, ", steps=", d34, ", interruptions=");
        sb2.append(d35);
        t.d(sb2, ", sleepMonitoring=", d36, ", afibBurden=");
        sb2.append(d37);
        t.d(sb2, ", sleepQuality=", d38, ", weightEngagement=");
        sb2.append(d39);
        sb2.append(", algo=");
        sb2.append(i11);
        sb2.append(", modified=");
        sb2.append(j5);
        sb2.append(")");
        return sb2.toString();
    }
}

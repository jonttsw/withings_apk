package com.withings.health.score.android.webservices.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Message;
/* compiled from: ScoresWs.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0088\u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0003HÖ\u0001J\t\u0010L\u001a\u00020MHÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b#\u0010\u001aR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u001aR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b-\u0010\u001aR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b.\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b/\u0010\u001aR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b0\u0010\u001a¨\u0006N"}, d2 = {"Lcom/withings/health/score/android/webservices/model/ScoresWs;", "", "global", "", "activity", "steps", "activeMinutes", Message.BODY, "bodyComposition", "weightEngagement", "bmi", "heart", "ecgEngagement", "vascularAge", "nightHr", "bloodPressure", "bloodPressureBurden", "bpmEngagement", "ecgAfib", "afibBurden", "sleep", "sleepApneaBurden", "sleepScore", "sleepMonitoring", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getActiveMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActivity", "getAfibBurden", "getBloodPressure", "getBloodPressureBurden", "getBmi", "getBody", "getBodyComposition", "getBpmEngagement", "getEcgAfib", "getEcgEngagement", "getGlobal", "()I", "getHeart", "getNightHr", "getSleep", "getSleepApneaBurden", "getSleepMonitoring", "getSleepScore", "getSteps", "getVascularAge", "getWeightEngagement", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/health/score/android/webservices/model/ScoresWs;", "equals", "", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScoresWs {
    @SerializedName("active_minutes")
    private final Integer activeMinutes;
    @SerializedName("activity")
    private final Integer activity;
    @SerializedName("afib_burden")
    private final Integer afibBurden;
    @SerializedName("blood_pressure")
    private final Integer bloodPressure;
    @SerializedName("blood_pressure_burden")
    private final Integer bloodPressureBurden;
    @SerializedName("bmi")
    private final Integer bmi;
    @SerializedName(Message.BODY)
    private final Integer body;
    @SerializedName("body_composition")
    private final Integer bodyComposition;
    @SerializedName("bpm_engagement")
    private final Integer bpmEngagement;
    @SerializedName("ecg_afib")
    private final Integer ecgAfib;
    @SerializedName("ecg_engagement")
    private final Integer ecgEngagement;
    @SerializedName("health_improvement")
    private final int global;
    @SerializedName("heart")
    private final Integer heart;
    @SerializedName("night_hr")
    private final Integer nightHr;
    @SerializedName("sleep")
    private final Integer sleep;
    @SerializedName("sleep_apnea_burden")
    private final Integer sleepApneaBurden;
    @SerializedName("sleep_monitoring")
    private final Integer sleepMonitoring;
    @SerializedName("sleep_quality")
    private final Integer sleepScore;
    @SerializedName("steps")
    private final Integer steps;
    @SerializedName("vascular_age")
    private final Integer vascularAge;
    @SerializedName("weight_engagement")
    private final Integer weightEngagement;

    public ScoresWs(int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20) {
        this.global = i11;
        this.activity = num;
        this.steps = num2;
        this.activeMinutes = num3;
        this.body = num4;
        this.bodyComposition = num5;
        this.weightEngagement = num6;
        this.bmi = num7;
        this.heart = num8;
        this.ecgEngagement = num9;
        this.vascularAge = num10;
        this.nightHr = num11;
        this.bloodPressure = num12;
        this.bloodPressureBurden = num13;
        this.bpmEngagement = num14;
        this.ecgAfib = num15;
        this.afibBurden = num16;
        this.sleep = num17;
        this.sleepApneaBurden = num18;
        this.sleepScore = num19;
        this.sleepMonitoring = num20;
    }

    public final int component1() {
        return this.global;
    }

    public final Integer component10() {
        return this.ecgEngagement;
    }

    public final Integer component11() {
        return this.vascularAge;
    }

    public final Integer component12() {
        return this.nightHr;
    }

    public final Integer component13() {
        return this.bloodPressure;
    }

    public final Integer component14() {
        return this.bloodPressureBurden;
    }

    public final Integer component15() {
        return this.bpmEngagement;
    }

    public final Integer component16() {
        return this.ecgAfib;
    }

    public final Integer component17() {
        return this.afibBurden;
    }

    public final Integer component18() {
        return this.sleep;
    }

    public final Integer component19() {
        return this.sleepApneaBurden;
    }

    public final Integer component2() {
        return this.activity;
    }

    public final Integer component20() {
        return this.sleepScore;
    }

    public final Integer component21() {
        return this.sleepMonitoring;
    }

    public final Integer component3() {
        return this.steps;
    }

    public final Integer component4() {
        return this.activeMinutes;
    }

    public final Integer component5() {
        return this.body;
    }

    public final Integer component6() {
        return this.bodyComposition;
    }

    public final Integer component7() {
        return this.weightEngagement;
    }

    public final Integer component8() {
        return this.bmi;
    }

    public final Integer component9() {
        return this.heart;
    }

    public final ScoresWs copy(int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20) {
        return new ScoresWs(i11, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoresWs)) {
            return false;
        }
        ScoresWs scoresWs = (ScoresWs) obj;
        if (this.global == scoresWs.global && u.e(this.activity, scoresWs.activity) && u.e(this.steps, scoresWs.steps) && u.e(this.activeMinutes, scoresWs.activeMinutes) && u.e(this.body, scoresWs.body) && u.e(this.bodyComposition, scoresWs.bodyComposition) && u.e(this.weightEngagement, scoresWs.weightEngagement) && u.e(this.bmi, scoresWs.bmi) && u.e(this.heart, scoresWs.heart) && u.e(this.ecgEngagement, scoresWs.ecgEngagement) && u.e(this.vascularAge, scoresWs.vascularAge) && u.e(this.nightHr, scoresWs.nightHr) && u.e(this.bloodPressure, scoresWs.bloodPressure) && u.e(this.bloodPressureBurden, scoresWs.bloodPressureBurden) && u.e(this.bpmEngagement, scoresWs.bpmEngagement) && u.e(this.ecgAfib, scoresWs.ecgAfib) && u.e(this.afibBurden, scoresWs.afibBurden) && u.e(this.sleep, scoresWs.sleep) && u.e(this.sleepApneaBurden, scoresWs.sleepApneaBurden) && u.e(this.sleepScore, scoresWs.sleepScore) && u.e(this.sleepMonitoring, scoresWs.sleepMonitoring)) {
            return true;
        }
        return false;
    }

    public final Integer getActiveMinutes() {
        return this.activeMinutes;
    }

    public final Integer getActivity() {
        return this.activity;
    }

    public final Integer getAfibBurden() {
        return this.afibBurden;
    }

    public final Integer getBloodPressure() {
        return this.bloodPressure;
    }

    public final Integer getBloodPressureBurden() {
        return this.bloodPressureBurden;
    }

    public final Integer getBmi() {
        return this.bmi;
    }

    public final Integer getBody() {
        return this.body;
    }

    public final Integer getBodyComposition() {
        return this.bodyComposition;
    }

    public final Integer getBpmEngagement() {
        return this.bpmEngagement;
    }

    public final Integer getEcgAfib() {
        return this.ecgAfib;
    }

    public final Integer getEcgEngagement() {
        return this.ecgEngagement;
    }

    public final int getGlobal() {
        return this.global;
    }

    public final Integer getHeart() {
        return this.heart;
    }

    public final Integer getNightHr() {
        return this.nightHr;
    }

    public final Integer getSleep() {
        return this.sleep;
    }

    public final Integer getSleepApneaBurden() {
        return this.sleepApneaBurden;
    }

    public final Integer getSleepMonitoring() {
        return this.sleepMonitoring;
    }

    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    public final Integer getSteps() {
        return this.steps;
    }

    public final Integer getVascularAge() {
        return this.vascularAge;
    }

    public final Integer getWeightEngagement() {
        return this.weightEngagement;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20 = Integer.hashCode(this.global) * 31;
        Integer num = this.activity;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode20 + hashCode) * 31;
        Integer num2 = this.steps;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num3 = this.activeMinutes;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num4 = this.body;
        if (num4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num4.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Integer num5 = this.bodyComposition;
        if (num5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num5.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Integer num6 = this.weightEngagement;
        if (num6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num6.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        Integer num7 = this.bmi;
        if (num7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num7.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        Integer num8 = this.heart;
        if (num8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num8.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        Integer num9 = this.ecgEngagement;
        if (num9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num9.hashCode();
        }
        int i21 = (i19 + hashCode9) * 31;
        Integer num10 = this.vascularAge;
        if (num10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num10.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        Integer num11 = this.nightHr;
        if (num11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num11.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        Integer num12 = this.bloodPressure;
        if (num12 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num12.hashCode();
        }
        int i24 = (i23 + hashCode12) * 31;
        Integer num13 = this.bloodPressureBurden;
        if (num13 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num13.hashCode();
        }
        int i25 = (i24 + hashCode13) * 31;
        Integer num14 = this.bpmEngagement;
        if (num14 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num14.hashCode();
        }
        int i26 = (i25 + hashCode14) * 31;
        Integer num15 = this.ecgAfib;
        if (num15 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num15.hashCode();
        }
        int i27 = (i26 + hashCode15) * 31;
        Integer num16 = this.afibBurden;
        if (num16 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num16.hashCode();
        }
        int i28 = (i27 + hashCode16) * 31;
        Integer num17 = this.sleep;
        if (num17 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = num17.hashCode();
        }
        int i29 = (i28 + hashCode17) * 31;
        Integer num18 = this.sleepApneaBurden;
        if (num18 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num18.hashCode();
        }
        int i31 = (i29 + hashCode18) * 31;
        Integer num19 = this.sleepScore;
        if (num19 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = num19.hashCode();
        }
        int i32 = (i31 + hashCode19) * 31;
        Integer num20 = this.sleepMonitoring;
        if (num20 != null) {
            i11 = num20.hashCode();
        }
        return i32 + i11;
    }

    public String toString() {
        int i11 = this.global;
        Integer num = this.activity;
        Integer num2 = this.steps;
        Integer num3 = this.activeMinutes;
        Integer num4 = this.body;
        Integer num5 = this.bodyComposition;
        Integer num6 = this.weightEngagement;
        Integer num7 = this.bmi;
        Integer num8 = this.heart;
        Integer num9 = this.ecgEngagement;
        Integer num10 = this.vascularAge;
        Integer num11 = this.nightHr;
        Integer num12 = this.bloodPressure;
        Integer num13 = this.bloodPressureBurden;
        Integer num14 = this.bpmEngagement;
        Integer num15 = this.ecgAfib;
        Integer num16 = this.afibBurden;
        Integer num17 = this.sleep;
        Integer num18 = this.sleepApneaBurden;
        Integer num19 = this.sleepScore;
        Integer num20 = this.sleepMonitoring;
        return "ScoresWs(global=" + i11 + ", activity=" + num + ", steps=" + num2 + ", activeMinutes=" + num3 + ", body=" + num4 + ", bodyComposition=" + num5 + ", weightEngagement=" + num6 + ", bmi=" + num7 + ", heart=" + num8 + ", ecgEngagement=" + num9 + ", vascularAge=" + num10 + ", nightHr=" + num11 + ", bloodPressure=" + num12 + ", bloodPressureBurden=" + num13 + ", bpmEngagement=" + num14 + ", ecgAfib=" + num15 + ", afibBurden=" + num16 + ", sleep=" + num17 + ", sleepApneaBurden=" + num18 + ", sleepScore=" + num19 + ", sleepMonitoring=" + num20 + ")";
    }
}

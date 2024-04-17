package com.withings.learnmore.adapter;

import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.webservice.a;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LearnMore.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u001aJ\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003Jé\u0002\u0010H\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020OHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u0006P"}, d2 = {"Lcom/withings/learnmore/adapter/LearnMoreCategories;", "", "activity", "", "Lcom/withings/learnmore/adapter/LearnMoreEntryTranslations;", "bloodPressure", "bloodPressureDetail", "cycleTracking", "heartRate", "heartRateDetail", "pulseWaveVelocity", "pulseWaveVelocityDetail", "sleep", "weight", "weightDetail", "bodyComp", "workout", "food", ConstantsWs.JSON_SESSION_KEY_ECG, "heartSound", "sleepApnea", "spo2", "vascularAge", "nerveHealthScore", "electrodermalActivityScore", "electrochemicalSkinConductanceScore", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getActivity", "()Ljava/util/List;", "getBloodPressure", "getBloodPressureDetail", "getBodyComp", "getCycleTracking", "getEcg", "getElectrochemicalSkinConductanceScore", "getElectrodermalActivityScore", "getFood", "getHeartRate", "getHeartRateDetail", "getHeartSound", "getNerveHealthScore", "getPulseWaveVelocity", "getPulseWaveVelocityDetail", "getSleep", "getSleepApnea", "getSpo2", "getVascularAge", "getWeight", "getWeightDetail", "getWorkout", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "learnmore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LearnMoreCategories {
    public static final int $stable = 8;
    private final List<LearnMoreEntryTranslations> activity;
    @SerializedName("blood_pressure")
    private final List<LearnMoreEntryTranslations> bloodPressure;
    @SerializedName("blood_pressure_detail")
    private final List<LearnMoreEntryTranslations> bloodPressureDetail;
    @SerializedName("body_comp")
    private final List<LearnMoreEntryTranslations> bodyComp;
    @SerializedName("cycle_tracking")
    private final List<LearnMoreEntryTranslations> cycleTracking;
    @SerializedName("ecg_detail")
    private final List<LearnMoreEntryTranslations> ecg;
    @SerializedName("electrochemical_skin_conductance_score")
    private final List<LearnMoreEntryTranslations> electrochemicalSkinConductanceScore;
    @SerializedName("electrodermal_activity_score")
    private final List<LearnMoreEntryTranslations> electrodermalActivityScore;
    private final List<LearnMoreEntryTranslations> food;
    @SerializedName("heart_rate")
    private final List<LearnMoreEntryTranslations> heartRate;
    @SerializedName("heart_rate_detail")
    private final List<LearnMoreEntryTranslations> heartRateDetail;
    @SerializedName("heart_sound_detail")
    private final List<LearnMoreEntryTranslations> heartSound;
    @SerializedName("nerve_health_score")
    private final List<LearnMoreEntryTranslations> nerveHealthScore;
    @SerializedName("pulse_wave_velocity")
    private final List<LearnMoreEntryTranslations> pulseWaveVelocity;
    @SerializedName("pulse_wave_velocity_detail")
    private final List<LearnMoreEntryTranslations> pulseWaveVelocityDetail;
    private final List<LearnMoreEntryTranslations> sleep;
    @SerializedName("sleep_apnea")
    private final List<LearnMoreEntryTranslations> sleepApnea;
    @SerializedName("spo2")
    private final List<LearnMoreEntryTranslations> spo2;
    @SerializedName("vascular_age")
    private final List<LearnMoreEntryTranslations> vascularAge;
    private final List<LearnMoreEntryTranslations> weight;
    @SerializedName("weight_detail")
    private final List<LearnMoreEntryTranslations> weightDetail;
    private final List<LearnMoreEntryTranslations> workout;

    public LearnMoreCategories(List<LearnMoreEntryTranslations> activity, List<LearnMoreEntryTranslations> bloodPressure, List<LearnMoreEntryTranslations> bloodPressureDetail, List<LearnMoreEntryTranslations> cycleTracking, List<LearnMoreEntryTranslations> heartRate, List<LearnMoreEntryTranslations> heartRateDetail, List<LearnMoreEntryTranslations> pulseWaveVelocity, List<LearnMoreEntryTranslations> pulseWaveVelocityDetail, List<LearnMoreEntryTranslations> sleep, List<LearnMoreEntryTranslations> weight, List<LearnMoreEntryTranslations> weightDetail, List<LearnMoreEntryTranslations> bodyComp, List<LearnMoreEntryTranslations> workout, List<LearnMoreEntryTranslations> food, List<LearnMoreEntryTranslations> ecg, List<LearnMoreEntryTranslations> heartSound, List<LearnMoreEntryTranslations> sleepApnea, List<LearnMoreEntryTranslations> spo2, List<LearnMoreEntryTranslations> vascularAge, List<LearnMoreEntryTranslations> nerveHealthScore, List<LearnMoreEntryTranslations> electrodermalActivityScore, List<LearnMoreEntryTranslations> electrochemicalSkinConductanceScore) {
        u.j(activity, "activity");
        u.j(bloodPressure, "bloodPressure");
        u.j(bloodPressureDetail, "bloodPressureDetail");
        u.j(cycleTracking, "cycleTracking");
        u.j(heartRate, "heartRate");
        u.j(heartRateDetail, "heartRateDetail");
        u.j(pulseWaveVelocity, "pulseWaveVelocity");
        u.j(pulseWaveVelocityDetail, "pulseWaveVelocityDetail");
        u.j(sleep, "sleep");
        u.j(weight, "weight");
        u.j(weightDetail, "weightDetail");
        u.j(bodyComp, "bodyComp");
        u.j(workout, "workout");
        u.j(food, "food");
        u.j(ecg, "ecg");
        u.j(heartSound, "heartSound");
        u.j(sleepApnea, "sleepApnea");
        u.j(spo2, "spo2");
        u.j(vascularAge, "vascularAge");
        u.j(nerveHealthScore, "nerveHealthScore");
        u.j(electrodermalActivityScore, "electrodermalActivityScore");
        u.j(electrochemicalSkinConductanceScore, "electrochemicalSkinConductanceScore");
        this.activity = activity;
        this.bloodPressure = bloodPressure;
        this.bloodPressureDetail = bloodPressureDetail;
        this.cycleTracking = cycleTracking;
        this.heartRate = heartRate;
        this.heartRateDetail = heartRateDetail;
        this.pulseWaveVelocity = pulseWaveVelocity;
        this.pulseWaveVelocityDetail = pulseWaveVelocityDetail;
        this.sleep = sleep;
        this.weight = weight;
        this.weightDetail = weightDetail;
        this.bodyComp = bodyComp;
        this.workout = workout;
        this.food = food;
        this.ecg = ecg;
        this.heartSound = heartSound;
        this.sleepApnea = sleepApnea;
        this.spo2 = spo2;
        this.vascularAge = vascularAge;
        this.nerveHealthScore = nerveHealthScore;
        this.electrodermalActivityScore = electrodermalActivityScore;
        this.electrochemicalSkinConductanceScore = electrochemicalSkinConductanceScore;
    }

    public final List<LearnMoreEntryTranslations> component1() {
        return this.activity;
    }

    public final List<LearnMoreEntryTranslations> component10() {
        return this.weight;
    }

    public final List<LearnMoreEntryTranslations> component11() {
        return this.weightDetail;
    }

    public final List<LearnMoreEntryTranslations> component12() {
        return this.bodyComp;
    }

    public final List<LearnMoreEntryTranslations> component13() {
        return this.workout;
    }

    public final List<LearnMoreEntryTranslations> component14() {
        return this.food;
    }

    public final List<LearnMoreEntryTranslations> component15() {
        return this.ecg;
    }

    public final List<LearnMoreEntryTranslations> component16() {
        return this.heartSound;
    }

    public final List<LearnMoreEntryTranslations> component17() {
        return this.sleepApnea;
    }

    public final List<LearnMoreEntryTranslations> component18() {
        return this.spo2;
    }

    public final List<LearnMoreEntryTranslations> component19() {
        return this.vascularAge;
    }

    public final List<LearnMoreEntryTranslations> component2() {
        return this.bloodPressure;
    }

    public final List<LearnMoreEntryTranslations> component20() {
        return this.nerveHealthScore;
    }

    public final List<LearnMoreEntryTranslations> component21() {
        return this.electrodermalActivityScore;
    }

    public final List<LearnMoreEntryTranslations> component22() {
        return this.electrochemicalSkinConductanceScore;
    }

    public final List<LearnMoreEntryTranslations> component3() {
        return this.bloodPressureDetail;
    }

    public final List<LearnMoreEntryTranslations> component4() {
        return this.cycleTracking;
    }

    public final List<LearnMoreEntryTranslations> component5() {
        return this.heartRate;
    }

    public final List<LearnMoreEntryTranslations> component6() {
        return this.heartRateDetail;
    }

    public final List<LearnMoreEntryTranslations> component7() {
        return this.pulseWaveVelocity;
    }

    public final List<LearnMoreEntryTranslations> component8() {
        return this.pulseWaveVelocityDetail;
    }

    public final List<LearnMoreEntryTranslations> component9() {
        return this.sleep;
    }

    public final LearnMoreCategories copy(List<LearnMoreEntryTranslations> activity, List<LearnMoreEntryTranslations> bloodPressure, List<LearnMoreEntryTranslations> bloodPressureDetail, List<LearnMoreEntryTranslations> cycleTracking, List<LearnMoreEntryTranslations> heartRate, List<LearnMoreEntryTranslations> heartRateDetail, List<LearnMoreEntryTranslations> pulseWaveVelocity, List<LearnMoreEntryTranslations> pulseWaveVelocityDetail, List<LearnMoreEntryTranslations> sleep, List<LearnMoreEntryTranslations> weight, List<LearnMoreEntryTranslations> weightDetail, List<LearnMoreEntryTranslations> bodyComp, List<LearnMoreEntryTranslations> workout, List<LearnMoreEntryTranslations> food, List<LearnMoreEntryTranslations> ecg, List<LearnMoreEntryTranslations> heartSound, List<LearnMoreEntryTranslations> sleepApnea, List<LearnMoreEntryTranslations> spo2, List<LearnMoreEntryTranslations> vascularAge, List<LearnMoreEntryTranslations> nerveHealthScore, List<LearnMoreEntryTranslations> electrodermalActivityScore, List<LearnMoreEntryTranslations> electrochemicalSkinConductanceScore) {
        u.j(activity, "activity");
        u.j(bloodPressure, "bloodPressure");
        u.j(bloodPressureDetail, "bloodPressureDetail");
        u.j(cycleTracking, "cycleTracking");
        u.j(heartRate, "heartRate");
        u.j(heartRateDetail, "heartRateDetail");
        u.j(pulseWaveVelocity, "pulseWaveVelocity");
        u.j(pulseWaveVelocityDetail, "pulseWaveVelocityDetail");
        u.j(sleep, "sleep");
        u.j(weight, "weight");
        u.j(weightDetail, "weightDetail");
        u.j(bodyComp, "bodyComp");
        u.j(workout, "workout");
        u.j(food, "food");
        u.j(ecg, "ecg");
        u.j(heartSound, "heartSound");
        u.j(sleepApnea, "sleepApnea");
        u.j(spo2, "spo2");
        u.j(vascularAge, "vascularAge");
        u.j(nerveHealthScore, "nerveHealthScore");
        u.j(electrodermalActivityScore, "electrodermalActivityScore");
        u.j(electrochemicalSkinConductanceScore, "electrochemicalSkinConductanceScore");
        return new LearnMoreCategories(activity, bloodPressure, bloodPressureDetail, cycleTracking, heartRate, heartRateDetail, pulseWaveVelocity, pulseWaveVelocityDetail, sleep, weight, weightDetail, bodyComp, workout, food, ecg, heartSound, sleepApnea, spo2, vascularAge, nerveHealthScore, electrodermalActivityScore, electrochemicalSkinConductanceScore);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnMoreCategories)) {
            return false;
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (u.e(this.activity, learnMoreCategories.activity) && u.e(this.bloodPressure, learnMoreCategories.bloodPressure) && u.e(this.bloodPressureDetail, learnMoreCategories.bloodPressureDetail) && u.e(this.cycleTracking, learnMoreCategories.cycleTracking) && u.e(this.heartRate, learnMoreCategories.heartRate) && u.e(this.heartRateDetail, learnMoreCategories.heartRateDetail) && u.e(this.pulseWaveVelocity, learnMoreCategories.pulseWaveVelocity) && u.e(this.pulseWaveVelocityDetail, learnMoreCategories.pulseWaveVelocityDetail) && u.e(this.sleep, learnMoreCategories.sleep) && u.e(this.weight, learnMoreCategories.weight) && u.e(this.weightDetail, learnMoreCategories.weightDetail) && u.e(this.bodyComp, learnMoreCategories.bodyComp) && u.e(this.workout, learnMoreCategories.workout) && u.e(this.food, learnMoreCategories.food) && u.e(this.ecg, learnMoreCategories.ecg) && u.e(this.heartSound, learnMoreCategories.heartSound) && u.e(this.sleepApnea, learnMoreCategories.sleepApnea) && u.e(this.spo2, learnMoreCategories.spo2) && u.e(this.vascularAge, learnMoreCategories.vascularAge) && u.e(this.nerveHealthScore, learnMoreCategories.nerveHealthScore) && u.e(this.electrodermalActivityScore, learnMoreCategories.electrodermalActivityScore) && u.e(this.electrochemicalSkinConductanceScore, learnMoreCategories.electrochemicalSkinConductanceScore)) {
            return true;
        }
        return false;
    }

    public final List<LearnMoreEntryTranslations> getActivity() {
        return this.activity;
    }

    public final List<LearnMoreEntryTranslations> getBloodPressure() {
        return this.bloodPressure;
    }

    public final List<LearnMoreEntryTranslations> getBloodPressureDetail() {
        return this.bloodPressureDetail;
    }

    public final List<LearnMoreEntryTranslations> getBodyComp() {
        return this.bodyComp;
    }

    public final List<LearnMoreEntryTranslations> getCycleTracking() {
        return this.cycleTracking;
    }

    public final List<LearnMoreEntryTranslations> getEcg() {
        return this.ecg;
    }

    public final List<LearnMoreEntryTranslations> getElectrochemicalSkinConductanceScore() {
        return this.electrochemicalSkinConductanceScore;
    }

    public final List<LearnMoreEntryTranslations> getElectrodermalActivityScore() {
        return this.electrodermalActivityScore;
    }

    public final List<LearnMoreEntryTranslations> getFood() {
        return this.food;
    }

    public final List<LearnMoreEntryTranslations> getHeartRate() {
        return this.heartRate;
    }

    public final List<LearnMoreEntryTranslations> getHeartRateDetail() {
        return this.heartRateDetail;
    }

    public final List<LearnMoreEntryTranslations> getHeartSound() {
        return this.heartSound;
    }

    public final List<LearnMoreEntryTranslations> getNerveHealthScore() {
        return this.nerveHealthScore;
    }

    public final List<LearnMoreEntryTranslations> getPulseWaveVelocity() {
        return this.pulseWaveVelocity;
    }

    public final List<LearnMoreEntryTranslations> getPulseWaveVelocityDetail() {
        return this.pulseWaveVelocityDetail;
    }

    public final List<LearnMoreEntryTranslations> getSleep() {
        return this.sleep;
    }

    public final List<LearnMoreEntryTranslations> getSleepApnea() {
        return this.sleepApnea;
    }

    public final List<LearnMoreEntryTranslations> getSpo2() {
        return this.spo2;
    }

    public final List<LearnMoreEntryTranslations> getVascularAge() {
        return this.vascularAge;
    }

    public final List<LearnMoreEntryTranslations> getWeight() {
        return this.weight;
    }

    public final List<LearnMoreEntryTranslations> getWeightDetail() {
        return this.weightDetail;
    }

    public final List<LearnMoreEntryTranslations> getWorkout() {
        return this.workout;
    }

    public int hashCode() {
        return this.electrochemicalSkinConductanceScore.hashCode() + e.b(this.electrodermalActivityScore, e.b(this.nerveHealthScore, e.b(this.vascularAge, e.b(this.spo2, e.b(this.sleepApnea, e.b(this.heartSound, e.b(this.ecg, e.b(this.food, e.b(this.workout, e.b(this.bodyComp, e.b(this.weightDetail, e.b(this.weight, e.b(this.sleep, e.b(this.pulseWaveVelocityDetail, e.b(this.pulseWaveVelocity, e.b(this.heartRateDetail, e.b(this.heartRate, e.b(this.cycleTracking, e.b(this.bloodPressureDetail, e.b(this.bloodPressure, this.activity.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        List<LearnMoreEntryTranslations> list = this.activity;
        List<LearnMoreEntryTranslations> list2 = this.bloodPressure;
        List<LearnMoreEntryTranslations> list3 = this.bloodPressureDetail;
        List<LearnMoreEntryTranslations> list4 = this.cycleTracking;
        List<LearnMoreEntryTranslations> list5 = this.heartRate;
        List<LearnMoreEntryTranslations> list6 = this.heartRateDetail;
        List<LearnMoreEntryTranslations> list7 = this.pulseWaveVelocity;
        List<LearnMoreEntryTranslations> list8 = this.pulseWaveVelocityDetail;
        List<LearnMoreEntryTranslations> list9 = this.sleep;
        List<LearnMoreEntryTranslations> list10 = this.weight;
        List<LearnMoreEntryTranslations> list11 = this.weightDetail;
        List<LearnMoreEntryTranslations> list12 = this.bodyComp;
        List<LearnMoreEntryTranslations> list13 = this.workout;
        List<LearnMoreEntryTranslations> list14 = this.food;
        List<LearnMoreEntryTranslations> list15 = this.ecg;
        List<LearnMoreEntryTranslations> list16 = this.heartSound;
        List<LearnMoreEntryTranslations> list17 = this.sleepApnea;
        List<LearnMoreEntryTranslations> list18 = this.spo2;
        List<LearnMoreEntryTranslations> list19 = this.vascularAge;
        List<LearnMoreEntryTranslations> list20 = this.nerveHealthScore;
        List<LearnMoreEntryTranslations> list21 = this.electrodermalActivityScore;
        List<LearnMoreEntryTranslations> list22 = this.electrochemicalSkinConductanceScore;
        StringBuilder sb2 = new StringBuilder("LearnMoreCategories(activity=");
        sb2.append(list);
        sb2.append(", bloodPressure=");
        sb2.append(list2);
        sb2.append(", bloodPressureDetail=");
        a.a(sb2, list3, ", cycleTracking=", list4, ", heartRate=");
        a.a(sb2, list5, ", heartRateDetail=", list6, ", pulseWaveVelocity=");
        a.a(sb2, list7, ", pulseWaveVelocityDetail=", list8, ", sleep=");
        a.a(sb2, list9, ", weight=", list10, ", weightDetail=");
        a.a(sb2, list11, ", bodyComp=", list12, ", workout=");
        a.a(sb2, list13, ", food=", list14, ", ecg=");
        a.a(sb2, list15, ", heartSound=", list16, ", sleepApnea=");
        a.a(sb2, list17, ", spo2=", list18, ", vascularAge=");
        a.a(sb2, list19, ", nerveHealthScore=", list20, ", electrodermalActivityScore=");
        sb2.append(list21);
        sb2.append(", electrochemicalSkinConductanceScore=");
        sb2.append(list22);
        sb2.append(")");
        return sb2.toString();
    }
}

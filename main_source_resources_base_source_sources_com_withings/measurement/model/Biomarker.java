package com.withings.measurement.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Biomarker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurement/model/Biomarker;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Biomarker {

    /* renamed from: b  reason: collision with root package name */
    public static final Biomarker f41852b;

    /* renamed from: c  reason: collision with root package name */
    public static final Biomarker f41853c;

    /* renamed from: d  reason: collision with root package name */
    public static final Biomarker f41854d;

    /* renamed from: e  reason: collision with root package name */
    public static final Biomarker f41855e;

    /* renamed from: f  reason: collision with root package name */
    public static final Biomarker f41856f;

    /* renamed from: g  reason: collision with root package name */
    public static final Biomarker f41857g;

    /* renamed from: h  reason: collision with root package name */
    public static final Biomarker f41858h;

    /* renamed from: i  reason: collision with root package name */
    public static final Biomarker f41859i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ Biomarker[] f41860j;

    /* renamed from: a  reason: collision with root package name */
    private final Biomarker f41861a;

    static {
        Biomarker biomarker = new Biomarker("AFib", 0, null);
        Biomarker biomarker2 = new Biomarker("BioAcidity", 1, null);
        Biomarker biomarker3 = new Biomarker("BloodPressure", 2, null);
        Biomarker biomarker4 = new Biomarker("BreathingDisturbances", 3, null);
        Biomarker biomarker5 = new Biomarker("CycleTracking", 4, null);
        Biomarker biomarker6 = new Biomarker("Ecg", 5, null);
        f41852b = biomarker6;
        Biomarker biomarker7 = new Biomarker("EnergyStatus", 6, null);
        Biomarker biomarker8 = new Biomarker("HeartRate", 7, null);
        f41853c = biomarker8;
        Biomarker biomarker9 = new Biomarker("HighLowHeartRate", 8, biomarker8);
        f41854d = biomarker9;
        Biomarker biomarker10 = new Biomarker("HeartSounds", 9, null);
        Biomarker biomarker11 = new Biomarker("Height", 10, null);
        Biomarker biomarker12 = new Biomarker("HydroBalance", 11, null);
        Biomarker biomarker13 = new Biomarker("NerveHealth", 12, null);
        Biomarker biomarker14 = new Biomarker("Sleep", 13, null);
        Biomarker biomarker15 = new Biomarker("SpO2", 14, null);
        f41855e = biomarker15;
        Biomarker biomarker16 = new Biomarker("Steps", 15, null);
        f41856f = biomarker16;
        Biomarker biomarker17 = new Biomarker("Temperature", 16, null);
        Biomarker biomarker18 = new Biomarker("VascularAge", 17, null);
        Biomarker biomarker19 = new Biomarker("VitaminC", 18, null);
        f41857g = biomarker19;
        Biomarker biomarker20 = new Biomarker("Vo2Max", 19, null);
        Biomarker biomarker21 = new Biomarker("Weight", 20, null);
        f41858h = biomarker21;
        Biomarker biomarker22 = new Biomarker("BodyComposition", 21, biomarker21);
        Biomarker biomarker23 = new Biomarker("Workouts", 22, null);
        f41859i = biomarker23;
        Biomarker[] biomarkerArr = {biomarker, biomarker2, biomarker3, biomarker4, biomarker5, biomarker6, biomarker7, biomarker8, biomarker9, biomarker10, biomarker11, biomarker12, biomarker13, biomarker14, biomarker15, biomarker16, biomarker17, biomarker18, biomarker19, biomarker20, biomarker21, biomarker22, biomarker23};
        f41860j = biomarkerArr;
        b.a(biomarkerArr);
    }

    private Biomarker(String str, int i11, Biomarker biomarker) {
        this.f41861a = biomarker;
    }

    public static Biomarker valueOf(String str) {
        return (Biomarker) Enum.valueOf(Biomarker.class, str);
    }

    public static Biomarker[] values() {
        return (Biomarker[]) f41860j.clone();
    }

    public final Biomarker a() {
        return this.f41861a;
    }
}

package com.withings.measure.android.data;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FitnessLevel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/measure/android/data/FitnessLevel;", "", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FitnessLevel {

    /* renamed from: e  reason: collision with root package name */
    public static final a f41671e;

    /* renamed from: f  reason: collision with root package name */
    public static final FitnessLevel f41672f;

    /* renamed from: g  reason: collision with root package name */
    public static final FitnessLevel f41673g;

    /* renamed from: h  reason: collision with root package name */
    public static final FitnessLevel f41674h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ FitnessLevel[] f41675i;

    /* renamed from: a  reason: collision with root package name */
    private final int f41676a;

    /* renamed from: b  reason: collision with root package name */
    private final double f41677b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41678c;

    /* renamed from: d  reason: collision with root package name */
    private final int f41679d;

    /* compiled from: FitnessLevel.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static FitnessLevel a(int i11) {
            if (i11 != 30) {
                if (i11 != 50) {
                    return FitnessLevel.f41674h;
                }
                return FitnessLevel.f41673g;
            }
            return FitnessLevel.f41672f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.withings.measure.android.data.FitnessLevel$a, java.lang.Object] */
    static {
        FitnessLevel fitnessLevel = new FitnessLevel("Beginner", 0, 30, 1.2d, C1987R.string.activityGoals_beginner, C1987R.string.activityGoals_beginnerDescription);
        f41672f = fitnessLevel;
        FitnessLevel fitnessLevel2 = new FitnessLevel("Intermediate", 1, 50, 1.1d, C1987R.string.activityGoals_intermediate, C1987R.string.activityGoals_intermediateDescription);
        f41673g = fitnessLevel2;
        FitnessLevel fitnessLevel3 = new FitnessLevel("Athlete", 2, 70, 1.05d, C1987R.string.activityGoals_athlete, C1987R.string.activityGoals_athleteDescription);
        f41674h = fitnessLevel3;
        FitnessLevel[] fitnessLevelArr = {fitnessLevel, fitnessLevel2, fitnessLevel3};
        f41675i = fitnessLevelArr;
        b.a(fitnessLevelArr);
        f41671e = new Object();
    }

    private FitnessLevel(String str, int i11, int i12, double d11, int i13, int i14) {
        this.f41676a = i12;
        this.f41677b = d11;
        this.f41678c = i13;
        this.f41679d = i14;
    }

    public static FitnessLevel valueOf(String str) {
        return (FitnessLevel) Enum.valueOf(FitnessLevel.class, str);
    }

    public static FitnessLevel[] values() {
        return (FitnessLevel[]) f41675i.clone();
    }

    public final int a() {
        return this.f41679d;
    }

    public final double b() {
        return this.f41677b;
    }

    public final int d() {
        return this.f41678c;
    }

    public final int e() {
        return this.f41676a;
    }
}

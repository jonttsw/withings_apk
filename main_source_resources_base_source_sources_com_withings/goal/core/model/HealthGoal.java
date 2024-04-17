package com.withings.goal.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthGoal.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/goal/core/model/HealthGoal;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HealthGoal {

    /* renamed from: c  reason: collision with root package name */
    public static final HealthGoal f39489c;

    /* renamed from: d  reason: collision with root package name */
    public static final HealthGoal f39490d;

    /* renamed from: e  reason: collision with root package name */
    public static final HealthGoal f39491e;

    /* renamed from: f  reason: collision with root package name */
    public static final HealthGoal f39492f;

    /* renamed from: g  reason: collision with root package name */
    public static final HealthGoal f39493g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ HealthGoal[] f39494h;

    /* renamed from: a  reason: collision with root package name */
    private final int f39495a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39496b;

    static {
        HealthGoal healthGoal = new HealthGoal("LoseWeight", 0, 1, "goal_lose_weight");
        f39489c = healthGoal;
        HealthGoal healthGoal2 = new HealthGoal("GainWeight", 1, 4, "goal_gain_weight");
        f39490d = healthGoal2;
        HealthGoal healthGoal3 = new HealthGoal("MaintainWeight", 2, 5, "goal_stabilize_weight");
        f39491e = healthGoal3;
        HealthGoal healthGoal4 = new HealthGoal("LoseFatMass", 3, 2, "goal_lose_fat_mass");
        f39492f = healthGoal4;
        HealthGoal healthGoal5 = new HealthGoal("GainMuscleMass", 4, 3, "goal_gain_muscle_mass");
        f39493g = healthGoal5;
        HealthGoal[] healthGoalArr = {healthGoal, healthGoal2, healthGoal3, healthGoal4, healthGoal5};
        f39494h = healthGoalArr;
        b.a(healthGoalArr);
    }

    private HealthGoal(String str, int i11, int i12, String str2) {
        this.f39495a = i12;
        this.f39496b = str2;
    }

    public static HealthGoal valueOf(String str) {
        return (HealthGoal) Enum.valueOf(HealthGoal.class, str);
    }

    public static HealthGoal[] values() {
        return (HealthGoal[]) f39494h.clone();
    }

    public final String a() {
        return this.f39496b;
    }

    public final int b() {
        return this.f39495a;
    }
}

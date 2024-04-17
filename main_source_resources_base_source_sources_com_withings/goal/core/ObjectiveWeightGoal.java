package com.withings.goal.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ObjectiveWeightGoal.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/goal/core/ObjectiveWeightGoal;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ObjectiveWeightGoal {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ ObjectiveWeightGoal[] f39486a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.goal.core.ObjectiveWeightGoal] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Enum, com.withings.goal.core.ObjectiveWeightGoal] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.goal.core.ObjectiveWeightGoal] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.goal.core.ObjectiveWeightGoal] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.goal.core.ObjectiveWeightGoal] */
    static {
        int i11 = ObjectiveWeightGoal$Companion$ObjectiveTrend.f39488b;
        ObjectiveWeightGoal[] objectiveWeightGoalArr = {new Enum("GAIN_MUSCLE_MASS", 0), new Enum("GAIN_WEIGHT", 1), new Enum("LOSE_FAT_MASS", 2), new Enum("LOSE_WEIGHT", 3), new Enum("STABILIZE_WEIGHT", 4)};
        f39486a = objectiveWeightGoalArr;
        b.a(objectiveWeightGoalArr);
    }

    private ObjectiveWeightGoal() {
        throw null;
    }

    public static ObjectiveWeightGoal valueOf(String str) {
        return (ObjectiveWeightGoal) Enum.valueOf(ObjectiveWeightGoal.class, str);
    }

    public static ObjectiveWeightGoal[] values() {
        return (ObjectiveWeightGoal[]) f39486a.clone();
    }
}

package com.withings.goal.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ObjectiveWeightGoal.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/withings/goal/core/ObjectiveWeightGoal$Companion$ObjectiveTrend", "", "Lcom/withings/goal/core/ObjectiveWeightGoal$Companion$ObjectiveTrend;", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ObjectiveWeightGoal$Companion$ObjectiveTrend {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ ObjectiveWeightGoal$Companion$ObjectiveTrend[] f39487a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f39488b = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.goal.core.ObjectiveWeightGoal$Companion$ObjectiveTrend, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.goal.core.ObjectiveWeightGoal$Companion$ObjectiveTrend, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.goal.core.ObjectiveWeightGoal$Companion$ObjectiveTrend, java.lang.Enum] */
    static {
        ObjectiveWeightGoal$Companion$ObjectiveTrend[] objectiveWeightGoal$Companion$ObjectiveTrendArr = {new Enum("DOWN", 0), new Enum("UP", 1), new Enum("STABLE", 2)};
        f39487a = objectiveWeightGoal$Companion$ObjectiveTrendArr;
        b.a(objectiveWeightGoal$Companion$ObjectiveTrendArr);
    }

    private ObjectiveWeightGoal$Companion$ObjectiveTrend() {
        throw null;
    }

    public static ObjectiveWeightGoal$Companion$ObjectiveTrend valueOf(String str) {
        return (ObjectiveWeightGoal$Companion$ObjectiveTrend) Enum.valueOf(ObjectiveWeightGoal$Companion$ObjectiveTrend.class, str);
    }

    public static ObjectiveWeightGoal$Companion$ObjectiveTrend[] values() {
        return (ObjectiveWeightGoal$Companion$ObjectiveTrend[]) f39487a.clone();
    }
}

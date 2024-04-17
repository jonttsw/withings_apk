package com.withings.goal.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthGoal.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/goal/core/model/HealthGoalTrend;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HealthGoalTrend {

    /* renamed from: a  reason: collision with root package name */
    public static final HealthGoalTrend f39497a;

    /* renamed from: b  reason: collision with root package name */
    public static final HealthGoalTrend f39498b;

    /* renamed from: c  reason: collision with root package name */
    public static final HealthGoalTrend f39499c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ HealthGoalTrend[] f39500d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.goal.core.model.HealthGoalTrend] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.goal.core.model.HealthGoalTrend] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.goal.core.model.HealthGoalTrend] */
    static {
        ?? r02 = new Enum("DOWN", 0);
        f39497a = r02;
        ?? r12 = new Enum("UP", 1);
        f39498b = r12;
        ?? r22 = new Enum("STABLE", 2);
        f39499c = r22;
        HealthGoalTrend[] healthGoalTrendArr = {r02, r12, r22};
        f39500d = healthGoalTrendArr;
        b.a(healthGoalTrendArr);
    }

    private HealthGoalTrend() {
        throw null;
    }

    public static HealthGoalTrend valueOf(String str) {
        return (HealthGoalTrend) Enum.valueOf(HealthGoalTrend.class, str);
    }

    public static HealthGoalTrend[] values() {
        return (HealthGoalTrend[]) f39500d.clone();
    }
}

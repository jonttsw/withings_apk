package com.withings.manualLogging.core.entity.cycle;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleManualLoggingFactor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/core/entity/cycle/CycleManualLoggingImpactOnPredictions;", "", "manual-logging-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleManualLoggingImpactOnPredictions {

    /* renamed from: a  reason: collision with root package name */
    public static final CycleManualLoggingImpactOnPredictions f40677a;

    /* renamed from: b  reason: collision with root package name */
    public static final CycleManualLoggingImpactOnPredictions f40678b;

    /* renamed from: c  reason: collision with root package name */
    public static final CycleManualLoggingImpactOnPredictions f40679c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ CycleManualLoggingImpactOnPredictions[] f40680d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingImpactOnPredictions] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingImpactOnPredictions] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingImpactOnPredictions] */
    static {
        ?? r02 = new Enum("None", 0);
        f40677a = r02;
        ?? r12 = new Enum("OvulationPaused", 1);
        f40678b = r12;
        ?? r22 = new Enum("AllPaused", 2);
        f40679c = r22;
        CycleManualLoggingImpactOnPredictions[] cycleManualLoggingImpactOnPredictionsArr = {r02, r12, r22};
        f40680d = cycleManualLoggingImpactOnPredictionsArr;
        b.a(cycleManualLoggingImpactOnPredictionsArr);
    }

    private CycleManualLoggingImpactOnPredictions() {
        throw null;
    }

    public static CycleManualLoggingImpactOnPredictions valueOf(String str) {
        return (CycleManualLoggingImpactOnPredictions) Enum.valueOf(CycleManualLoggingImpactOnPredictions.class, str);
    }

    public static CycleManualLoggingImpactOnPredictions[] values() {
        return (CycleManualLoggingImpactOnPredictions[]) f40680d.clone();
    }
}

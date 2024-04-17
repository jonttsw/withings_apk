package com.withings.manualLogging.core.entity.cycle;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleManualLoggingFactor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/core/entity/cycle/CycleManualLoggingFactor;", "", "manual-logging-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleManualLoggingFactor {

    /* renamed from: a  reason: collision with root package name */
    public static final CycleManualLoggingFactor f40671a;

    /* renamed from: b  reason: collision with root package name */
    public static final CycleManualLoggingFactor f40672b;

    /* renamed from: c  reason: collision with root package name */
    public static final CycleManualLoggingFactor f40673c;

    /* renamed from: d  reason: collision with root package name */
    public static final CycleManualLoggingFactor f40674d;

    /* renamed from: e  reason: collision with root package name */
    public static final CycleManualLoggingFactor f40675e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ CycleManualLoggingFactor[] f40676f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor] */
    static {
        ?? r02 = new Enum("None", 0);
        f40671a = r02;
        ?? r12 = new Enum("Contraceptive", 1);
        f40672b = r12;
        ?? r22 = new Enum("Menopause", 2);
        f40673c = r22;
        ?? r32 = new Enum("PostPartum", 3);
        f40674d = r32;
        ?? r42 = new Enum("Pregnancy", 4);
        f40675e = r42;
        CycleManualLoggingFactor[] cycleManualLoggingFactorArr = {r02, r12, r22, r32, r42};
        f40676f = cycleManualLoggingFactorArr;
        b.a(cycleManualLoggingFactorArr);
    }

    private CycleManualLoggingFactor() {
        throw null;
    }

    public static CycleManualLoggingFactor valueOf(String str) {
        return (CycleManualLoggingFactor) Enum.valueOf(CycleManualLoggingFactor.class, str);
    }

    public static CycleManualLoggingFactor[] values() {
        return (CycleManualLoggingFactor[]) f40676f.clone();
    }
}

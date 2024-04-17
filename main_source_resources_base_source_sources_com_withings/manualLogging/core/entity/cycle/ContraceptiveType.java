package com.withings.manualLogging.core.entity.cycle;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContraceptiveType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/core/entity/cycle/ContraceptiveType;", "", "manual-logging-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ContraceptiveType {

    /* renamed from: a  reason: collision with root package name */
    public static final ContraceptiveType f40667a;

    /* renamed from: b  reason: collision with root package name */
    public static final ContraceptiveType f40668b;

    /* renamed from: c  reason: collision with root package name */
    public static final ContraceptiveType f40669c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ ContraceptiveType[] f40670d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.ContraceptiveType] */
    static {
        ?? r02 = new Enum("Implants", 0);
        ?? r12 = new Enum("Patch", 1);
        f40667a = r12;
        ?? r22 = new Enum("CopperIUD", 2);
        ?? r32 = new Enum("HormonalInjection", 3);
        ?? r42 = new Enum("HormonalIUD", 4);
        ?? r52 = new Enum("OestroProgestativePill", 5);
        f40668b = r52;
        ?? r62 = new Enum("ExtendedOestroProgestativePill", 6);
        ?? r7 = new Enum("MicrodosedProgestativePill", 7);
        ?? r82 = new Enum("VaginalRing", 8);
        f40669c = r82;
        ContraceptiveType[] contraceptiveTypeArr = {r02, r12, r22, r32, r42, r52, r62, r7, r82};
        f40670d = contraceptiveTypeArr;
        b.a(contraceptiveTypeArr);
    }

    private ContraceptiveType() {
        throw null;
    }

    public static ContraceptiveType valueOf(String str) {
        return (ContraceptiveType) Enum.valueOf(ContraceptiveType.class, str);
    }

    public static ContraceptiveType[] values() {
        return (ContraceptiveType[]) f40670d.clone();
    }
}

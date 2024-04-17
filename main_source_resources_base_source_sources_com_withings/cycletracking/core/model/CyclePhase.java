package com.withings.cycletracking.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CyclePhase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/core/model/CyclePhase;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CyclePhase {

    /* renamed from: a  reason: collision with root package name */
    public static final CyclePhase f35455a;

    /* renamed from: b  reason: collision with root package name */
    public static final CyclePhase f35456b;

    /* renamed from: c  reason: collision with root package name */
    public static final CyclePhase f35457c;

    /* renamed from: d  reason: collision with root package name */
    public static final CyclePhase f35458d;

    /* renamed from: e  reason: collision with root package name */
    public static final CyclePhase f35459e;

    /* renamed from: f  reason: collision with root package name */
    public static final CyclePhase f35460f;

    /* renamed from: g  reason: collision with root package name */
    public static final CyclePhase f35461g;

    /* renamed from: h  reason: collision with root package name */
    public static final CyclePhase f35462h;

    /* renamed from: i  reason: collision with root package name */
    public static final CyclePhase f35463i;

    /* renamed from: j  reason: collision with root package name */
    public static final CyclePhase f35464j;

    /* renamed from: k  reason: collision with root package name */
    public static final CyclePhase f35465k;

    /* renamed from: l  reason: collision with root package name */
    public static final CyclePhase f35466l;

    /* renamed from: m  reason: collision with root package name */
    public static final CyclePhase f35467m;

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ CyclePhase[] f35468n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CyclePhase] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f35455a = r02;
        ?? r12 = new Enum("UNKNOWN", 1);
        f35456b = r12;
        ?? r22 = new Enum("END_OVULATION_TODAY", 2);
        f35457c = r22;
        ?? r32 = new Enum("END_PERIOD_TODAY", 3);
        f35458d = r32;
        ?? r42 = new Enum("FOLLICULAR", 4);
        f35459e = r42;
        ?? r52 = new Enum("INNER_OVULATION", 5);
        f35460f = r52;
        ?? r62 = new Enum("INNER_PERIOD", 6);
        f35461g = r62;
        ?? r7 = new Enum("INNER_PREDICTED_PERIOD", 7);
        f35462h = r7;
        ?? r82 = new Enum("LUTEAL", 8);
        f35463i = r82;
        ?? r92 = new Enum("START_OVULATION_TODAY", 9);
        f35464j = r92;
        ?? r102 = new Enum("START_PERIOD", 10);
        f35465k = r102;
        ?? r11 = new Enum("START_PERIOD_TOMORROW", 11);
        f35466l = r11;
        ?? r122 = new Enum("START_PREDICTED_PERIOD", 12);
        f35467m = r122;
        CyclePhase[] cyclePhaseArr = {r02, r12, r22, r32, r42, r52, r62, r7, r82, r92, r102, r11, r122};
        f35468n = cyclePhaseArr;
        b.a(cyclePhaseArr);
    }

    private CyclePhase() {
        throw null;
    }

    public static CyclePhase valueOf(String str) {
        return (CyclePhase) Enum.valueOf(CyclePhase.class, str);
    }

    public static CyclePhase[] values() {
        return (CyclePhase[]) f35468n.clone();
    }
}

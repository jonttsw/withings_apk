package com.withings.library.measure.common;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MeasureGroupOrigin {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasureGroupOrigin f40636a;

    /* renamed from: b  reason: collision with root package name */
    public static final MeasureGroupOrigin f40637b;

    /* renamed from: c  reason: collision with root package name */
    public static final MeasureGroupOrigin f40638c;

    /* renamed from: d  reason: collision with root package name */
    public static final MeasureGroupOrigin f40639d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ MeasureGroupOrigin[] f40640e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.library.measure.common.MeasureGroupOrigin] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.library.measure.common.MeasureGroupOrigin] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.library.measure.common.MeasureGroupOrigin] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.library.measure.common.MeasureGroupOrigin] */
    static {
        ?? r02 = new Enum("Withings", 0);
        f40636a = r02;
        ?? r12 = new Enum("Runkeeper", 1);
        f40637b = r12;
        ?? r22 = new Enum("Bodymedia", 2);
        f40638c = r22;
        ?? r32 = new Enum("GoogleFit", 3);
        f40639d = r32;
        f40640e = new MeasureGroupOrigin[]{r02, r12, r22, r32};
    }

    private MeasureGroupOrigin() {
        throw null;
    }

    public static MeasureGroupOrigin valueOf(String str) {
        return (MeasureGroupOrigin) Enum.valueOf(MeasureGroupOrigin.class, str);
    }

    public static MeasureGroupOrigin[] values() {
        return (MeasureGroupOrigin[]) f40640e.clone();
    }
}

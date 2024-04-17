package com.withings.measure.core.models;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeasureGroupOrigin.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measure/core/models/MeasureGroupOrigin;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MeasureGroupOrigin {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasureGroupOrigin f41680a;

    /* renamed from: b  reason: collision with root package name */
    public static final MeasureGroupOrigin f41681b;

    /* renamed from: c  reason: collision with root package name */
    public static final MeasureGroupOrigin f41682c;

    /* renamed from: d  reason: collision with root package name */
    public static final MeasureGroupOrigin f41683d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ MeasureGroupOrigin[] f41684e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.measure.core.models.MeasureGroupOrigin] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.measure.core.models.MeasureGroupOrigin] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.measure.core.models.MeasureGroupOrigin] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.measure.core.models.MeasureGroupOrigin] */
    static {
        ?? r02 = new Enum("Withings", 0);
        f41680a = r02;
        ?? r12 = new Enum("Runkeeper", 1);
        f41681b = r12;
        ?? r22 = new Enum("Bodymedia", 2);
        f41682c = r22;
        ?? r32 = new Enum("GoogleFit", 3);
        f41683d = r32;
        MeasureGroupOrigin[] measureGroupOriginArr = {r02, r12, r22, r32};
        f41684e = measureGroupOriginArr;
        b.a(measureGroupOriginArr);
    }

    private MeasureGroupOrigin() {
        throw null;
    }

    public static MeasureGroupOrigin valueOf(String str) {
        return (MeasureGroupOrigin) Enum.valueOf(MeasureGroupOrigin.class, str);
    }

    public static MeasureGroupOrigin[] values() {
        return (MeasureGroupOrigin[]) f41684e.clone();
    }
}

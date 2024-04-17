package com.withings.measurement.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Verticals.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurement/model/MeasurementsVertical;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MeasurementsVertical {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasurementsVertical f41862a;

    /* renamed from: b  reason: collision with root package name */
    public static final MeasurementsVertical f41863b;

    /* renamed from: c  reason: collision with root package name */
    public static final MeasurementsVertical f41864c;

    /* renamed from: d  reason: collision with root package name */
    public static final MeasurementsVertical f41865d;

    /* renamed from: e  reason: collision with root package name */
    public static final MeasurementsVertical f41866e;

    /* renamed from: f  reason: collision with root package name */
    public static final MeasurementsVertical f41867f;

    /* renamed from: g  reason: collision with root package name */
    public static final MeasurementsVertical f41868g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ MeasurementsVertical[] f41869h;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.measurement.model.MeasurementsVertical, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.measurement.model.MeasurementsVertical, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.measurement.model.MeasurementsVertical, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.measurement.model.MeasurementsVertical, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.withings.measurement.model.MeasurementsVertical, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.withings.measurement.model.MeasurementsVertical, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.withings.measurement.model.MeasurementsVertical, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ACTIVITY", 0);
        f41862a = r02;
        ?? r12 = new Enum("BODY", 1);
        f41863b = r12;
        ?? r22 = new Enum("HEART", 2);
        f41864c = r22;
        ?? r32 = new Enum("NUTRITION", 3);
        f41865d = r32;
        ?? r42 = new Enum("RESPIRATORY", 4);
        f41866e = r42;
        ?? r52 = new Enum("SLEEP", 5);
        f41867f = r52;
        ?? r62 = new Enum("SEXUAL", 6);
        f41868g = r62;
        MeasurementsVertical[] measurementsVerticalArr = {r02, r12, r22, r32, r42, r52, r62};
        f41869h = measurementsVerticalArr;
        b.a(measurementsVerticalArr);
    }

    private MeasurementsVertical() {
        throw null;
    }

    public static MeasurementsVertical valueOf(String str) {
        return (MeasurementsVertical) Enum.valueOf(MeasurementsVertical.class, str);
    }

    public static MeasurementsVertical[] values() {
        return (MeasurementsVertical[]) f41869h.clone();
    }
}

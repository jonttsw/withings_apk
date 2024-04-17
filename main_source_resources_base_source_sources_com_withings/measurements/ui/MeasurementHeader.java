package com.withings.measurements.ui;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeasurementUiItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/MeasurementHeader;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MeasurementHeader {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasurementHeader f41939a;

    /* renamed from: b  reason: collision with root package name */
    public static final MeasurementHeader f41940b;

    /* renamed from: c  reason: collision with root package name */
    public static final MeasurementHeader f41941c;

    /* renamed from: d  reason: collision with root package name */
    public static final MeasurementHeader f41942d;

    /* renamed from: e  reason: collision with root package name */
    public static final MeasurementHeader f41943e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ MeasurementHeader[] f41944f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.measurements.ui.MeasurementHeader] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.measurements.ui.MeasurementHeader] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.measurements.ui.MeasurementHeader] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.measurements.ui.MeasurementHeader] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.measurements.ui.MeasurementHeader] */
    static {
        ?? r02 = new Enum("PAST_7_DAYS", 0);
        f41939a = r02;
        ?? r12 = new Enum("PAST_30_DAYS", 1);
        f41940b = r12;
        ?? r22 = new Enum("PAST_12_MONTHS", 2);
        f41941c = r22;
        ?? r32 = new Enum("OLDER", 3);
        f41942d = r32;
        ?? r42 = new Enum("LOADING", 4);
        f41943e = r42;
        MeasurementHeader[] measurementHeaderArr = {r02, r12, r22, r32, r42};
        f41944f = measurementHeaderArr;
        sm0.b.a(measurementHeaderArr);
    }

    private MeasurementHeader() {
        throw null;
    }

    public static MeasurementHeader valueOf(String str) {
        return (MeasurementHeader) Enum.valueOf(MeasurementHeader.class, str);
    }

    public static MeasurementHeader[] values() {
        return (MeasurementHeader[]) f41944f.clone();
    }
}

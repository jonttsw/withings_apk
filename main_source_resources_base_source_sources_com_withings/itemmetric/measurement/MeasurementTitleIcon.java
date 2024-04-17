package com.withings.itemmetric.measurement;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeasurementTitle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/itemmetric/measurement/MeasurementTitleIcon;", "", "item-metric-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MeasurementTitleIcon {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasurementTitleIcon f40597a;

    /* renamed from: b  reason: collision with root package name */
    public static final MeasurementTitleIcon f40598b;

    /* renamed from: c  reason: collision with root package name */
    public static final MeasurementTitleIcon f40599c;

    /* renamed from: d  reason: collision with root package name */
    public static final MeasurementTitleIcon f40600d;

    /* renamed from: e  reason: collision with root package name */
    public static final MeasurementTitleIcon f40601e;

    /* renamed from: f  reason: collision with root package name */
    public static final MeasurementTitleIcon f40602f;

    /* renamed from: g  reason: collision with root package name */
    public static final MeasurementTitleIcon f40603g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ MeasurementTitleIcon[] f40604h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.itemmetric.measurement.MeasurementTitleIcon] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.itemmetric.measurement.MeasurementTitleIcon] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.itemmetric.measurement.MeasurementTitleIcon] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.itemmetric.measurement.MeasurementTitleIcon] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.itemmetric.measurement.MeasurementTitleIcon] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.itemmetric.measurement.MeasurementTitleIcon] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.itemmetric.measurement.MeasurementTitleIcon] */
    static {
        ?? r02 = new Enum("Activity", 0);
        f40597a = r02;
        ?? r12 = new Enum("Body", 1);
        f40598b = r12;
        ?? r22 = new Enum("Heart", 2);
        f40599c = r22;
        ?? r32 = new Enum("Nutrition", 3);
        f40600d = r32;
        ?? r42 = new Enum("Respiratory", 4);
        f40601e = r42;
        ?? r52 = new Enum("SexualHealth", 5);
        f40602f = r52;
        ?? r62 = new Enum("Sleep", 6);
        f40603g = r62;
        MeasurementTitleIcon[] measurementTitleIconArr = {r02, r12, r22, r32, r42, r52, r62};
        f40604h = measurementTitleIconArr;
        b.a(measurementTitleIconArr);
    }

    private MeasurementTitleIcon() {
        throw null;
    }

    public static MeasurementTitleIcon valueOf(String str) {
        return (MeasurementTitleIcon) Enum.valueOf(MeasurementTitleIcon.class, str);
    }

    public static MeasurementTitleIcon[] values() {
        return (MeasurementTitleIcon[]) f40604h.clone();
    }
}

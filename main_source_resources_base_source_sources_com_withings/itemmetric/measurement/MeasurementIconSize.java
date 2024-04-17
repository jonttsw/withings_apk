package com.withings.itemmetric.measurement;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeasurementTitle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/itemmetric/measurement/MeasurementIconSize;", "", "item-metric-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MeasurementIconSize {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasurementIconSize f40594a;

    /* renamed from: b  reason: collision with root package name */
    public static final MeasurementIconSize f40595b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ MeasurementIconSize[] f40596c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.itemmetric.measurement.MeasurementIconSize, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.itemmetric.measurement.MeasurementIconSize, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Small", 0);
        f40594a = r02;
        ?? r12 = new Enum("Medium", 1);
        f40595b = r12;
        MeasurementIconSize[] measurementIconSizeArr = {r02, r12};
        f40596c = measurementIconSizeArr;
        b.a(measurementIconSizeArr);
    }

    private MeasurementIconSize() {
        throw null;
    }

    public static MeasurementIconSize valueOf(String str) {
        return (MeasurementIconSize) Enum.valueOf(MeasurementIconSize.class, str);
    }

    public static MeasurementIconSize[] values() {
        return (MeasurementIconSize[]) f40596c.clone();
    }
}

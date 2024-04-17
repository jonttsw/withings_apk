package com.withings.measurements.core.model.items;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NutriSyncMeasurementItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/core/model/items/KetonesItemStatus;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class KetonesItemStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final KetonesItemStatus f41895a;

    /* renamed from: b  reason: collision with root package name */
    public static final KetonesItemStatus f41896b;

    /* renamed from: c  reason: collision with root package name */
    public static final KetonesItemStatus f41897c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ KetonesItemStatus[] f41898d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.measurements.core.model.items.KetonesItemStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.measurements.core.model.items.KetonesItemStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.measurements.core.model.items.KetonesItemStatus] */
    static {
        ?? r02 = new Enum("Optimal", 0);
        f41895a = r02;
        ?? r12 = new Enum("Medium", 1);
        f41896b = r12;
        ?? r22 = new Enum("High", 2);
        f41897c = r22;
        KetonesItemStatus[] ketonesItemStatusArr = {r02, r12, r22};
        f41898d = ketonesItemStatusArr;
        b.a(ketonesItemStatusArr);
    }

    private KetonesItemStatus() {
        throw null;
    }

    public static KetonesItemStatus valueOf(String str) {
        return (KetonesItemStatus) Enum.valueOf(KetonesItemStatus.class, str);
    }

    public static KetonesItemStatus[] values() {
        return (KetonesItemStatus[]) f41898d.clone();
    }
}

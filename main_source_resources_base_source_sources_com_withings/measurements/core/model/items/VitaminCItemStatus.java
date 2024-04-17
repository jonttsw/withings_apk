package com.withings.measurements.core.model.items;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NutriSyncMeasurementItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/core/model/items/VitaminCItemStatus;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VitaminCItemStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final VitaminCItemStatus f41907a;

    /* renamed from: b  reason: collision with root package name */
    public static final VitaminCItemStatus f41908b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ VitaminCItemStatus[] f41909c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.measurements.core.model.items.VitaminCItemStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.measurements.core.model.items.VitaminCItemStatus] */
    static {
        ?? r02 = new Enum("Low", 0);
        f41907a = r02;
        ?? r12 = new Enum("Optimal", 1);
        f41908b = r12;
        VitaminCItemStatus[] vitaminCItemStatusArr = {r02, r12};
        f41909c = vitaminCItemStatusArr;
        b.a(vitaminCItemStatusArr);
    }

    private VitaminCItemStatus() {
        throw null;
    }

    public static VitaminCItemStatus valueOf(String str) {
        return (VitaminCItemStatus) Enum.valueOf(VitaminCItemStatus.class, str);
    }

    public static VitaminCItemStatus[] values() {
        return (VitaminCItemStatus[]) f41909c.clone();
    }
}

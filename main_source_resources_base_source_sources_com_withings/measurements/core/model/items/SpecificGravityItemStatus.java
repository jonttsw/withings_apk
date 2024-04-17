package com.withings.measurements.core.model.items;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NutriSyncMeasurementItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/core/model/items/SpecificGravityItemStatus;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SpecificGravityItemStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final SpecificGravityItemStatus f41903a;

    /* renamed from: b  reason: collision with root package name */
    public static final SpecificGravityItemStatus f41904b;

    /* renamed from: c  reason: collision with root package name */
    public static final SpecificGravityItemStatus f41905c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ SpecificGravityItemStatus[] f41906d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.measurements.core.model.items.SpecificGravityItemStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.measurements.core.model.items.SpecificGravityItemStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.measurements.core.model.items.SpecificGravityItemStatus] */
    static {
        ?? r02 = new Enum("High", 0);
        f41903a = r02;
        ?? r12 = new Enum("Optimal", 1);
        f41904b = r12;
        ?? r22 = new Enum("Low", 2);
        f41905c = r22;
        SpecificGravityItemStatus[] specificGravityItemStatusArr = {r02, r12, r22};
        f41906d = specificGravityItemStatusArr;
        b.a(specificGravityItemStatusArr);
    }

    private SpecificGravityItemStatus() {
        throw null;
    }

    public static SpecificGravityItemStatus valueOf(String str) {
        return (SpecificGravityItemStatus) Enum.valueOf(SpecificGravityItemStatus.class, str);
    }

    public static SpecificGravityItemStatus[] values() {
        return (SpecificGravityItemStatus[]) f41906d.clone();
    }
}

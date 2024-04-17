package com.withings.measurements.core.model.items;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NutriSyncMeasurementItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/core/model/items/PotentialOfHydrogenItemStatus;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PotentialOfHydrogenItemStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final PotentialOfHydrogenItemStatus f41899a;

    /* renamed from: b  reason: collision with root package name */
    public static final PotentialOfHydrogenItemStatus f41900b;

    /* renamed from: c  reason: collision with root package name */
    public static final PotentialOfHydrogenItemStatus f41901c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ PotentialOfHydrogenItemStatus[] f41902d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.measurements.core.model.items.PotentialOfHydrogenItemStatus, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.measurements.core.model.items.PotentialOfHydrogenItemStatus, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.measurements.core.model.items.PotentialOfHydrogenItemStatus, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Low", 0);
        f41899a = r02;
        ?? r12 = new Enum("Optimal", 1);
        f41900b = r12;
        ?? r22 = new Enum("High", 2);
        f41901c = r22;
        PotentialOfHydrogenItemStatus[] potentialOfHydrogenItemStatusArr = {r02, r12, r22};
        f41902d = potentialOfHydrogenItemStatusArr;
        b.a(potentialOfHydrogenItemStatusArr);
    }

    private PotentialOfHydrogenItemStatus() {
        throw null;
    }

    public static PotentialOfHydrogenItemStatus valueOf(String str) {
        return (PotentialOfHydrogenItemStatus) Enum.valueOf(PotentialOfHydrogenItemStatus.class, str);
    }

    public static PotentialOfHydrogenItemStatus[] values() {
        return (PotentialOfHydrogenItemStatus[]) f41902d.clone();
    }
}

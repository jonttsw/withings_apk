package com.withings.weight.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BasalMetabolicRateStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/core/model/BasalMetabolicRateStatus;", "", "weight-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BasalMetabolicRateStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final BasalMetabolicRateStatus f46957a;

    /* renamed from: b  reason: collision with root package name */
    public static final BasalMetabolicRateStatus f46958b;

    /* renamed from: c  reason: collision with root package name */
    public static final BasalMetabolicRateStatus f46959c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ BasalMetabolicRateStatus[] f46960d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.weight.core.model.BasalMetabolicRateStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.weight.core.model.BasalMetabolicRateStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.weight.core.model.BasalMetabolicRateStatus] */
    static {
        ?? r02 = new Enum("LOWER_THAN_AVG", 0);
        f46957a = r02;
        ?? r12 = new Enum("NORMAL", 1);
        f46958b = r12;
        ?? r22 = new Enum("HIGHER_THAN_AVG", 2);
        f46959c = r22;
        BasalMetabolicRateStatus[] basalMetabolicRateStatusArr = {r02, r12, r22};
        f46960d = basalMetabolicRateStatusArr;
        b.a(basalMetabolicRateStatusArr);
    }

    private BasalMetabolicRateStatus() {
        throw null;
    }

    public static BasalMetabolicRateStatus valueOf(String str) {
        return (BasalMetabolicRateStatus) Enum.valueOf(BasalMetabolicRateStatus.class, str);
    }

    public static BasalMetabolicRateStatus[] values() {
        return (BasalMetabolicRateStatus[]) f46960d.clone();
    }
}

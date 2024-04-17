package com.withings.factor.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FactorImpactOnPredictions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/factor/model/FactorImpactOnPredictions;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FactorImpactOnPredictions {

    /* renamed from: a  reason: collision with root package name */
    public static final FactorImpactOnPredictions f39102a;

    /* renamed from: b  reason: collision with root package name */
    public static final FactorImpactOnPredictions f39103b;

    /* renamed from: c  reason: collision with root package name */
    public static final FactorImpactOnPredictions f39104c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ FactorImpactOnPredictions[] f39105d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.factor.model.FactorImpactOnPredictions] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.factor.model.FactorImpactOnPredictions] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.factor.model.FactorImpactOnPredictions] */
    static {
        ?? r02 = new Enum("None", 0);
        f39102a = r02;
        ?? r12 = new Enum("OvulationPaused", 1);
        f39103b = r12;
        ?? r22 = new Enum("AllPaused", 2);
        f39104c = r22;
        FactorImpactOnPredictions[] factorImpactOnPredictionsArr = {r02, r12, r22};
        f39105d = factorImpactOnPredictionsArr;
        b.a(factorImpactOnPredictionsArr);
    }

    private FactorImpactOnPredictions() {
        throw null;
    }

    public static FactorImpactOnPredictions valueOf(String str) {
        return (FactorImpactOnPredictions) Enum.valueOf(FactorImpactOnPredictions.class, str);
    }

    public static FactorImpactOnPredictions[] values() {
        return (FactorImpactOnPredictions[]) f39105d.clone();
    }
}

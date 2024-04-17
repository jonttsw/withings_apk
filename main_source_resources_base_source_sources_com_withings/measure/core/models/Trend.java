package com.withings.measure.core.models;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Trend.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measure/core/models/Trend;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Trend {

    /* renamed from: a  reason: collision with root package name */
    public static final Trend f41685a;

    /* renamed from: b  reason: collision with root package name */
    public static final Trend f41686b;

    /* renamed from: c  reason: collision with root package name */
    public static final Trend f41687c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ Trend[] f41688d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.measure.core.models.Trend, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.measure.core.models.Trend, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.measure.core.models.Trend, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UP", 0);
        f41685a = r02;
        ?? r12 = new Enum("STABLE", 1);
        f41686b = r12;
        ?? r22 = new Enum("DOWN", 2);
        f41687c = r22;
        Trend[] trendArr = {r02, r12, r22};
        f41688d = trendArr;
        b.a(trendArr);
    }

    private Trend() {
        throw null;
    }

    public static Trend valueOf(String str) {
        return (Trend) Enum.valueOf(Trend.class, str);
    }

    public static Trend[] values() {
        return (Trend[]) f41688d.clone();
    }
}

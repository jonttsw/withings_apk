package com.withings.wiscale2.profile;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AllTimeStats.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/profile/Stat;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Stat {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ Stat[] f59279a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f59280b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.profile.Stat] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.profile.Stat] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.profile.Stat] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.wiscale2.profile.Stat] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.wiscale2.profile.Stat] */
    static {
        Stat[] statArr = {new Enum("WeightMeasureCount", 0), new Enum("StepCount", 1), new Enum("CumulatedDistance", 2), new Enum("BestDay", 3), new Enum("DaysAboveObjective", 4)};
        f59279a = statArr;
        f59280b = sm0.b.a(statArr);
    }

    private Stat() {
        throw null;
    }

    public static sm0.a<Stat> a() {
        return f59280b;
    }

    public static Stat valueOf(String str) {
        return (Stat) Enum.valueOf(Stat.class, str);
    }

    public static Stat[] values() {
        return (Stat[]) f59279a.clone();
    }
}

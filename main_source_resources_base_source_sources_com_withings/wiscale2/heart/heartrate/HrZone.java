package com.withings.wiscale2.heart.heartrate;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeartRateAwakeAverageActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/HrZone;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class HrZone {

    /* renamed from: a  reason: collision with root package name */
    public static final HrZone f57524a;

    /* renamed from: b  reason: collision with root package name */
    public static final HrZone f57525b;

    /* renamed from: c  reason: collision with root package name */
    public static final HrZone f57526c;

    /* renamed from: d  reason: collision with root package name */
    public static final HrZone f57527d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ HrZone[] f57528e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.heart.heartrate.HrZone] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.heart.heartrate.HrZone] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.heart.heartrate.HrZone] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.wiscale2.heart.heartrate.HrZone] */
    static {
        ?? r02 = new Enum("Peak", 0);
        f57524a = r02;
        ?? r12 = new Enum("Intense", 1);
        f57525b = r12;
        ?? r22 = new Enum("Moderate", 2);
        f57526c = r22;
        ?? r32 = new Enum("Light", 3);
        f57527d = r32;
        HrZone[] hrZoneArr = {r02, r12, r22, r32};
        f57528e = hrZoneArr;
        sm0.b.a(hrZoneArr);
    }

    private HrZone() {
        throw null;
    }

    public static HrZone valueOf(String str) {
        return (HrZone) Enum.valueOf(HrZone.class, str);
    }

    public static HrZone[] values() {
        return (HrZone[]) f57528e.clone();
    }
}

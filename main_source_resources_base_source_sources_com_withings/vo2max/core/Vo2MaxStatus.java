package com.withings.vo2max.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Vo2MaxStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/vo2max/core/Vo2MaxStatus;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Vo2MaxStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final Vo2MaxStatus f46832a;

    /* renamed from: b  reason: collision with root package name */
    public static final Vo2MaxStatus f46833b;

    /* renamed from: c  reason: collision with root package name */
    public static final Vo2MaxStatus f46834c;

    /* renamed from: d  reason: collision with root package name */
    public static final Vo2MaxStatus f46835d;

    /* renamed from: e  reason: collision with root package name */
    public static final Vo2MaxStatus f46836e;

    /* renamed from: f  reason: collision with root package name */
    public static final Vo2MaxStatus f46837f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ Vo2MaxStatus[] f46838g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.vo2max.core.Vo2MaxStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.vo2max.core.Vo2MaxStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.vo2max.core.Vo2MaxStatus] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.vo2max.core.Vo2MaxStatus] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.vo2max.core.Vo2MaxStatus] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.vo2max.core.Vo2MaxStatus] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        f46832a = r02;
        ?? r12 = new Enum("VERY_POOR", 1);
        f46833b = r12;
        ?? r22 = new Enum("POOR", 2);
        f46834c = r22;
        ?? r32 = new Enum("FAIR", 3);
        f46835d = r32;
        ?? r42 = new Enum("GOOD", 4);
        f46836e = r42;
        ?? r52 = new Enum("EXCELLENT", 5);
        f46837f = r52;
        Vo2MaxStatus[] vo2MaxStatusArr = {r02, r12, r22, r32, r42, r52};
        f46838g = vo2MaxStatusArr;
        b.a(vo2MaxStatusArr);
    }

    private Vo2MaxStatus() {
        throw null;
    }

    public static Vo2MaxStatus valueOf(String str) {
        return (Vo2MaxStatus) Enum.valueOf(Vo2MaxStatus.class, str);
    }

    public static Vo2MaxStatus[] values() {
        return (Vo2MaxStatus[]) f46838g.clone();
    }
}

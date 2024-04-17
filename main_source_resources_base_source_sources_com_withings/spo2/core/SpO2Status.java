package com.withings.spo2.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpO2Status.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/spo2/core/SpO2Status;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SpO2Status {

    /* renamed from: a  reason: collision with root package name */
    public static final SpO2Status f44278a;

    /* renamed from: b  reason: collision with root package name */
    public static final SpO2Status f44279b;

    /* renamed from: c  reason: collision with root package name */
    public static final SpO2Status f44280c;

    /* renamed from: d  reason: collision with root package name */
    public static final SpO2Status f44281d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ SpO2Status[] f44282e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.spo2.core.SpO2Status] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.spo2.core.SpO2Status] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.spo2.core.SpO2Status] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.spo2.core.SpO2Status] */
    static {
        ?? r02 = new Enum("NORMAL", 0);
        f44278a = r02;
        ?? r12 = new Enum("BELOW_AVERAGE", 1);
        f44279b = r12;
        ?? r22 = new Enum("LOW", 2);
        f44280c = r22;
        ?? r32 = new Enum("INCONCLUSIVE", 3);
        f44281d = r32;
        SpO2Status[] spO2StatusArr = {r02, r12, r22, r32};
        f44282e = spO2StatusArr;
        b.a(spO2StatusArr);
    }

    private SpO2Status() {
        throw null;
    }

    public static SpO2Status valueOf(String str) {
        return (SpO2Status) Enum.valueOf(SpO2Status.class, str);
    }

    public static SpO2Status[] values() {
        return (SpO2Status[]) f44282e.clone();
    }
}

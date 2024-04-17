package com.withings.sleepapnea.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AhiStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/sleepapnea/core/AhiStatus;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AhiStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final AhiStatus f44268a;

    /* renamed from: b  reason: collision with root package name */
    public static final AhiStatus f44269b;

    /* renamed from: c  reason: collision with root package name */
    public static final AhiStatus f44270c;

    /* renamed from: d  reason: collision with root package name */
    public static final AhiStatus f44271d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AhiStatus[] f44272e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.sleepapnea.core.AhiStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.sleepapnea.core.AhiStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.sleepapnea.core.AhiStatus] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.sleepapnea.core.AhiStatus] */
    static {
        ?? r02 = new Enum("HIGH", 0);
        f44268a = r02;
        ?? r12 = new Enum("MODERATE", 1);
        f44269b = r12;
        ?? r22 = new Enum("LOW_TO_MID", 2);
        f44270c = r22;
        ?? r32 = new Enum("ERROR", 3);
        f44271d = r32;
        AhiStatus[] ahiStatusArr = {r02, r12, r22, r32};
        f44272e = ahiStatusArr;
        b.a(ahiStatusArr);
    }

    private AhiStatus() {
        throw null;
    }

    public static AhiStatus valueOf(String str) {
        return (AhiStatus) Enum.valueOf(AhiStatus.class, str);
    }

    public static AhiStatus[] values() {
        return (AhiStatus[]) f44272e.clone();
    }
}

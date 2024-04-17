package com.withings.sleepapnea.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BreathingDisturbanceStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/sleepapnea/core/BreathingDisturbanceStatus;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BreathingDisturbanceStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final BreathingDisturbanceStatus f44273a;

    /* renamed from: b  reason: collision with root package name */
    public static final BreathingDisturbanceStatus f44274b;

    /* renamed from: c  reason: collision with root package name */
    public static final BreathingDisturbanceStatus f44275c;

    /* renamed from: d  reason: collision with root package name */
    public static final BreathingDisturbanceStatus f44276d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ BreathingDisturbanceStatus[] f44277e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.sleepapnea.core.BreathingDisturbanceStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.sleepapnea.core.BreathingDisturbanceStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.sleepapnea.core.BreathingDisturbanceStatus] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.sleepapnea.core.BreathingDisturbanceStatus] */
    static {
        ?? r02 = new Enum("HIGH", 0);
        f44273a = r02;
        ?? r12 = new Enum("MODERATE", 1);
        f44274b = r12;
        ?? r22 = new Enum("LOW", 2);
        f44275c = r22;
        ?? r32 = new Enum("ERROR", 3);
        f44276d = r32;
        BreathingDisturbanceStatus[] breathingDisturbanceStatusArr = {r02, r12, r22, r32};
        f44277e = breathingDisturbanceStatusArr;
        b.a(breathingDisturbanceStatusArr);
    }

    private BreathingDisturbanceStatus() {
        throw null;
    }

    public static BreathingDisturbanceStatus valueOf(String str) {
        return (BreathingDisturbanceStatus) Enum.valueOf(BreathingDisturbanceStatus.class, str);
    }

    public static BreathingDisturbanceStatus[] values() {
        return (BreathingDisturbanceStatus[]) f44277e.clone();
    }
}

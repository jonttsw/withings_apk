package com.withings.heartrate.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeartRateDiagnostic.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/heartrate/core/HeartRateDiagnostic;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeartRateDiagnostic {

    /* renamed from: a  reason: collision with root package name */
    public static final HeartRateDiagnostic f40582a;

    /* renamed from: b  reason: collision with root package name */
    public static final HeartRateDiagnostic f40583b;

    /* renamed from: c  reason: collision with root package name */
    public static final HeartRateDiagnostic f40584c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ HeartRateDiagnostic[] f40585d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.heartrate.core.HeartRateDiagnostic] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.heartrate.core.HeartRateDiagnostic] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.heartrate.core.HeartRateDiagnostic] */
    static {
        ?? r02 = new Enum("LOW", 0);
        f40582a = r02;
        ?? r12 = new Enum("NORMAL", 1);
        f40583b = r12;
        ?? r22 = new Enum("HIGH", 2);
        f40584c = r22;
        HeartRateDiagnostic[] heartRateDiagnosticArr = {r02, r12, r22};
        f40585d = heartRateDiagnosticArr;
        b.a(heartRateDiagnosticArr);
    }

    private HeartRateDiagnostic() {
        throw null;
    }

    public static HeartRateDiagnostic valueOf(String str) {
        return (HeartRateDiagnostic) Enum.valueOf(HeartRateDiagnostic.class, str);
    }

    public static HeartRateDiagnostic[] values() {
        return (HeartRateDiagnostic[]) f40585d.clone();
    }
}

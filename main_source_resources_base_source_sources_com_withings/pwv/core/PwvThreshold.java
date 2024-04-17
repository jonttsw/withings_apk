package com.withings.pwv.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PwvThreshold.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/pwv/core/PwvThreshold;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PwvThreshold {

    /* renamed from: b  reason: collision with root package name */
    public static final PwvThreshold f43844b;

    /* renamed from: c  reason: collision with root package name */
    public static final PwvThreshold f43845c;

    /* renamed from: d  reason: collision with root package name */
    public static final PwvThreshold f43846d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ PwvThreshold[] f43847e;

    /* renamed from: a  reason: collision with root package name */
    private final int f43848a;

    static {
        PwvThreshold pwvThreshold = new PwvThreshold("OPTIMAL", 0, 10);
        f43844b = pwvThreshold;
        PwvThreshold pwvThreshold2 = new PwvThreshold("NORMAL", 1, 75);
        f43845c = pwvThreshold2;
        PwvThreshold pwvThreshold3 = new PwvThreshold("NON_OPTIMAL", 2, 95);
        f43846d = pwvThreshold3;
        PwvThreshold[] pwvThresholdArr = {pwvThreshold, pwvThreshold2, pwvThreshold3};
        f43847e = pwvThresholdArr;
        b.a(pwvThresholdArr);
    }

    private PwvThreshold(String str, int i11, int i12) {
        this.f43848a = i12;
    }

    public static PwvThreshold valueOf(String str) {
        return (PwvThreshold) Enum.valueOf(PwvThreshold.class, str);
    }

    public static PwvThreshold[] values() {
        return (PwvThreshold[]) f43847e.clone();
    }

    public final int a() {
        return this.f43848a;
    }
}

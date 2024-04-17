package com.withings.comm.trace;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Traces$Scale$SetupType {

    /* renamed from: a  reason: collision with root package name */
    public static final Traces$Scale$SetupType f33181a;

    /* renamed from: b  reason: collision with root package name */
    public static final Traces$Scale$SetupType f33182b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ Traces$Scale$SetupType[] f33183c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.comm.trace.Traces$Scale$SetupType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.comm.trace.Traces$Scale$SetupType, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Bluetooth", 0);
        f33181a = r02;
        ?? r12 = new Enum("Wifi", 1);
        f33182b = r12;
        f33183c = new Traces$Scale$SetupType[]{r02, r12};
    }

    private Traces$Scale$SetupType() {
        throw null;
    }

    public static Traces$Scale$SetupType valueOf(String str) {
        return (Traces$Scale$SetupType) Enum.valueOf(Traces$Scale$SetupType.class, str);
    }

    public static Traces$Scale$SetupType[] values() {
        return (Traces$Scale$SetupType[]) f33183c.clone();
    }
}

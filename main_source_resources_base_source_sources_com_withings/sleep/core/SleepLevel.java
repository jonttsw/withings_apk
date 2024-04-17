package com.withings.sleep.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SleepLevel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/sleep/core/SleepLevel;", "", "a", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SleepLevel {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44259a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<SleepLevel> f44260b;

    /* renamed from: c  reason: collision with root package name */
    public static final SleepLevel f44261c;

    /* renamed from: d  reason: collision with root package name */
    public static final SleepLevel f44262d;

    /* renamed from: e  reason: collision with root package name */
    public static final SleepLevel f44263e;

    /* renamed from: f  reason: collision with root package name */
    public static final SleepLevel f44264f;

    /* renamed from: g  reason: collision with root package name */
    public static final SleepLevel f44265g;

    /* renamed from: h  reason: collision with root package name */
    public static final SleepLevel f44266h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ SleepLevel[] f44267i;

    /* compiled from: SleepLevel.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.sleep.core.SleepLevel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.sleep.core.SleepLevel$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, com.withings.sleep.core.SleepLevel] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, com.withings.sleep.core.SleepLevel] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, com.withings.sleep.core.SleepLevel] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Enum, com.withings.sleep.core.SleepLevel] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, com.withings.sleep.core.SleepLevel] */
    static {
        ?? r02 = new Enum("AWAKE", 0);
        f44261c = r02;
        ?? r62 = new Enum("REM", 1);
        f44262d = r62;
        ?? r7 = new Enum("LIGHT", 2);
        f44263e = r7;
        ?? r82 = new Enum("DEEP", 3);
        f44264f = r82;
        ?? r92 = new Enum("MANUAL", 4);
        f44265g = r92;
        ?? r52 = new Enum("UNSPECIFIED", 5);
        f44266h = r52;
        SleepLevel[] sleepLevelArr = {r02, r62, r7, r82, r92, r52};
        f44267i = sleepLevelArr;
        b.a(sleepLevelArr);
        f44259a = new Object();
        f44260b = x.W(r62, r7, r82, r92);
    }

    private SleepLevel() {
        throw null;
    }

    public static SleepLevel valueOf(String str) {
        return (SleepLevel) Enum.valueOf(SleepLevel.class, str);
    }

    public static SleepLevel[] values() {
        return (SleepLevel[]) f44267i.clone();
    }
}

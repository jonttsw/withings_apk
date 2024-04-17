package com.withings.fever.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeverLevel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/fever/core/model/FeverLevel;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FeverLevel {

    /* renamed from: a  reason: collision with root package name */
    public static final FeverLevel f39196a;

    /* renamed from: b  reason: collision with root package name */
    public static final FeverLevel f39197b;

    /* renamed from: c  reason: collision with root package name */
    public static final FeverLevel f39198c;

    /* renamed from: d  reason: collision with root package name */
    public static final FeverLevel f39199d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ FeverLevel[] f39200e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.fever.core.model.FeverLevel] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.fever.core.model.FeverLevel] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.fever.core.model.FeverLevel] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.fever.core.model.FeverLevel] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f39196a = r02;
        ?? r12 = new Enum("MILD", 1);
        f39197b = r12;
        ?? r22 = new Enum("HIGH", 2);
        f39198c = r22;
        ?? r32 = new Enum("UNKNOWN", 3);
        f39199d = r32;
        FeverLevel[] feverLevelArr = {r02, r12, r22, r32};
        f39200e = feverLevelArr;
        b.a(feverLevelArr);
    }

    private FeverLevel() {
        throw null;
    }

    public static FeverLevel valueOf(String str) {
        return (FeverLevel) Enum.valueOf(FeverLevel.class, str);
    }

    public static FeverLevel[] values() {
        return (FeverLevel[]) f39200e.clone();
    }
}

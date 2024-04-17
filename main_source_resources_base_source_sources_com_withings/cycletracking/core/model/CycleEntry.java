package com.withings.cycletracking.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleChipEntry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/cycletracking/core/model/CycleEntry;", "", "a", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleEntry {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35447a;

    /* renamed from: b  reason: collision with root package name */
    public static final CycleEntry f35448b;

    /* renamed from: c  reason: collision with root package name */
    public static final CycleEntry f35449c;

    /* renamed from: d  reason: collision with root package name */
    public static final CycleEntry f35450d;

    /* renamed from: e  reason: collision with root package name */
    public static final CycleEntry f35451e;

    /* renamed from: f  reason: collision with root package name */
    public static final CycleEntry f35452f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ CycleEntry[] f35453g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f35454h;

    /* compiled from: CycleChipEntry.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.cycletracking.core.model.CycleEntry] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.withings.cycletracking.core.model.CycleEntry$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.cycletracking.core.model.CycleEntry] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CycleEntry] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CycleEntry] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.cycletracking.core.model.CycleEntry] */
    static {
        ?? r02 = new Enum("Period", 0);
        f35448b = r02;
        ?? r12 = new Enum("CervicalMucus", 1);
        f35449c = r12;
        ?? r22 = new Enum("Mood", 2);
        f35450d = r22;
        ?? r32 = new Enum("SexualActivity", 3);
        f35451e = r32;
        ?? r42 = new Enum("Symptoms", 4);
        f35452f = r42;
        CycleEntry[] cycleEntryArr = {r02, r12, r22, r32, r42};
        f35453g = cycleEntryArr;
        f35454h = b.a(cycleEntryArr);
        f35447a = new Object();
    }

    private CycleEntry() {
        throw null;
    }

    public static sm0.a<CycleEntry> a() {
        return f35454h;
    }

    public static CycleEntry valueOf(String str) {
        return (CycleEntry) Enum.valueOf(CycleEntry.class, str);
    }

    public static CycleEntry[] values() {
        return (CycleEntry[]) f35453g.clone();
    }
}

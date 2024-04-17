package com.withings.weight.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BodyCompositionTrend.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/core/model/BodyCompositionTrend;", "", "weight-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyCompositionTrend {

    /* renamed from: a  reason: collision with root package name */
    public static final BodyCompositionTrend f46971a;

    /* renamed from: b  reason: collision with root package name */
    public static final BodyCompositionTrend f46972b;

    /* renamed from: c  reason: collision with root package name */
    public static final BodyCompositionTrend f46973c;

    /* renamed from: d  reason: collision with root package name */
    public static final BodyCompositionTrend f46974d;

    /* renamed from: e  reason: collision with root package name */
    public static final BodyCompositionTrend f46975e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ BodyCompositionTrend[] f46976f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.weight.core.model.BodyCompositionTrend] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.weight.core.model.BodyCompositionTrend] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.weight.core.model.BodyCompositionTrend] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.weight.core.model.BodyCompositionTrend] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.weight.core.model.BodyCompositionTrend] */
    static {
        ?? r02 = new Enum("GAINING_MUSCLE", 0);
        f46971a = r02;
        ?? r12 = new Enum("GAINING_FAT", 1);
        f46972b = r12;
        ?? r22 = new Enum("STABLE", 2);
        f46973c = r22;
        ?? r32 = new Enum("LOSING_MUSCLE", 3);
        f46974d = r32;
        ?? r42 = new Enum("LOSING_FAT", 4);
        f46975e = r42;
        BodyCompositionTrend[] bodyCompositionTrendArr = {r02, r12, r22, r32, r42};
        f46976f = bodyCompositionTrendArr;
        b.a(bodyCompositionTrendArr);
    }

    private BodyCompositionTrend() {
        throw null;
    }

    public static BodyCompositionTrend valueOf(String str) {
        return (BodyCompositionTrend) Enum.valueOf(BodyCompositionTrend.class, str);
    }

    public static BodyCompositionTrend[] values() {
        return (BodyCompositionTrend[]) f46976f.clone();
    }
}

package com.withings.home.trend;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WeightTrendItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/home/trend/BodyMassTrendEnum;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BodyMassTrendEnum {

    /* renamed from: a  reason: collision with root package name */
    public static final BodyMassTrendEnum f40586a;

    /* renamed from: b  reason: collision with root package name */
    public static final BodyMassTrendEnum f40587b;

    /* renamed from: c  reason: collision with root package name */
    public static final BodyMassTrendEnum f40588c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ BodyMassTrendEnum[] f40589d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.home.trend.BodyMassTrendEnum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.home.trend.BodyMassTrendEnum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.home.trend.BodyMassTrendEnum] */
    static {
        ?? r02 = new Enum("GAIN", 0);
        f40586a = r02;
        ?? r12 = new Enum("LOSS", 1);
        f40587b = r12;
        ?? r22 = new Enum("STABLE", 2);
        f40588c = r22;
        BodyMassTrendEnum[] bodyMassTrendEnumArr = {r02, r12, r22};
        f40589d = bodyMassTrendEnumArr;
        b.a(bodyMassTrendEnumArr);
    }

    private BodyMassTrendEnum() {
        throw null;
    }

    public static BodyMassTrendEnum valueOf(String str) {
        return (BodyMassTrendEnum) Enum.valueOf(BodyMassTrendEnum.class, str);
    }

    public static BodyMassTrendEnum[] values() {
        return (BodyMassTrendEnum[]) f40589d.clone();
    }
}

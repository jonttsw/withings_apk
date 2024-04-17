package com.withings.nervehealth.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeasureCategory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/nervehealth/core/model/MeasureCategory;", "", "a", "nervehealth-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MeasureCategory {

    /* renamed from: b  reason: collision with root package name */
    public static final a f42340b;

    /* renamed from: c  reason: collision with root package name */
    public static final MeasureCategory f42341c;

    /* renamed from: d  reason: collision with root package name */
    public static final MeasureCategory f42342d;

    /* renamed from: e  reason: collision with root package name */
    public static final MeasureCategory f42343e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ MeasureCategory[] f42344f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f42345g;

    /* renamed from: a  reason: collision with root package name */
    private final int f42346a;

    /* compiled from: MeasureCategory.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.withings.nervehealth.core.model.MeasureCategory$a] */
    static {
        MeasureCategory measureCategory = new MeasureCategory("MEDICAL", 0, 1);
        f42341c = measureCategory;
        MeasureCategory measureCategory2 = new MeasureCategory("NON_MEDICAL", 1, 2);
        f42342d = measureCategory2;
        MeasureCategory measureCategory3 = new MeasureCategory("B2B", 2, 3);
        f42343e = measureCategory3;
        MeasureCategory[] measureCategoryArr = {measureCategory, measureCategory2, measureCategory3};
        f42344f = measureCategoryArr;
        f42345g = b.a(measureCategoryArr);
        f42340b = new Object();
    }

    private MeasureCategory(String str, int i11, int i12) {
        this.f42346a = i12;
    }

    public static sm0.a<MeasureCategory> a() {
        return f42345g;
    }

    public static MeasureCategory valueOf(String str) {
        return (MeasureCategory) Enum.valueOf(MeasureCategory.class, str);
    }

    public static MeasureCategory[] values() {
        return (MeasureCategory[]) f42344f.clone();
    }

    public final int b() {
        return this.f42346a;
    }
}

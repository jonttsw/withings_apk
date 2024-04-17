package com.withings.features.model;

import com.huawei.hms.hihealth.data.DeviceInfo;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureFlagProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/features/model/FeatureFlagCategory;", "", "flags"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FeatureFlagCategory {

    /* renamed from: b  reason: collision with root package name */
    public static final FeatureFlagCategory f39185b;

    /* renamed from: c  reason: collision with root package name */
    public static final FeatureFlagCategory f39186c;

    /* renamed from: d  reason: collision with root package name */
    public static final FeatureFlagCategory f39187d;

    /* renamed from: e  reason: collision with root package name */
    public static final FeatureFlagCategory f39188e;

    /* renamed from: f  reason: collision with root package name */
    public static final FeatureFlagCategory f39189f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ FeatureFlagCategory[] f39190g;

    /* renamed from: a  reason: collision with root package name */
    private final String f39191a;

    static {
        FeatureFlagCategory featureFlagCategory = new FeatureFlagCategory("ToBeRelease", 0, "To be released soon");
        f39185b = featureFlagCategory;
        FeatureFlagCategory featureFlagCategory2 = new FeatureFlagCategory("Internal", 1, "Internal");
        f39186c = featureFlagCategory2;
        FeatureFlagCategory featureFlagCategory3 = new FeatureFlagCategory("Debug", 2, "Debug");
        f39187d = featureFlagCategory3;
        FeatureFlagCategory featureFlagCategory4 = new FeatureFlagCategory(DeviceInfo.STR_TYPE_UNKNOWN, 3, "Unknown status");
        f39188e = featureFlagCategory4;
        FeatureFlagCategory featureFlagCategory5 = new FeatureFlagCategory("Deprecated", 4, "Deprecated");
        f39189f = featureFlagCategory5;
        FeatureFlagCategory[] featureFlagCategoryArr = {featureFlagCategory, featureFlagCategory2, featureFlagCategory3, featureFlagCategory4, featureFlagCategory5};
        f39190g = featureFlagCategoryArr;
        b.a(featureFlagCategoryArr);
    }

    private FeatureFlagCategory(String str, int i11, String str2) {
        this.f39191a = str2;
    }

    public static FeatureFlagCategory valueOf(String str) {
        return (FeatureFlagCategory) Enum.valueOf(FeatureFlagCategory.class, str);
    }

    public static FeatureFlagCategory[] values() {
        return (FeatureFlagCategory[]) f39190g.clone();
    }

    public final String a() {
        return this.f39191a;
    }
}

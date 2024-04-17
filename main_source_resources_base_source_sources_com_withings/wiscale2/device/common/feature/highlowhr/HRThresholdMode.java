package com.withings.wiscale2.device.common.feature.highlowhr;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HighLowHRSettingsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/highlowhr/HRThresholdMode;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HRThresholdMode {

    /* renamed from: a  reason: collision with root package name */
    public static final HRThresholdMode f52173a;

    /* renamed from: b  reason: collision with root package name */
    public static final HRThresholdMode f52174b;

    /* renamed from: c  reason: collision with root package name */
    public static final HRThresholdMode f52175c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ HRThresholdMode[] f52176d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.highlowhr.HRThresholdMode] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.highlowhr.HRThresholdMode] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.device.common.feature.highlowhr.HRThresholdMode] */
    static {
        ?? r02 = new Enum("OFF", 0);
        f52173a = r02;
        ?? r12 = new Enum("AUTO", 1);
        f52174b = r12;
        ?? r22 = new Enum("CUSTOM", 2);
        f52175c = r22;
        HRThresholdMode[] hRThresholdModeArr = {r02, r12, r22};
        f52176d = hRThresholdModeArr;
        sm0.b.a(hRThresholdModeArr);
    }

    private HRThresholdMode() {
        throw null;
    }

    public static HRThresholdMode valueOf(String str) {
        return (HRThresholdMode) Enum.valueOf(HRThresholdMode.class, str);
    }

    public static HRThresholdMode[] values() {
        return (HRThresholdMode[]) f52176d.clone();
    }
}

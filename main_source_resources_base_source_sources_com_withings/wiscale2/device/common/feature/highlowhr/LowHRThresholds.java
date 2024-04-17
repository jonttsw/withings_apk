package com.withings.wiscale2.device.common.feature.highlowhr;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HighLowHRSettingsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/highlowhr/LowHRThresholds;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LowHRThresholds {

    /* renamed from: b  reason: collision with root package name */
    public static final LowHRThresholds f52224b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ LowHRThresholds[] f52225c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f52226d;

    /* renamed from: a  reason: collision with root package name */
    private final int f52227a;

    static {
        LowHRThresholds lowHRThresholds = new LowHRThresholds("BPM_55", 0, 55);
        LowHRThresholds lowHRThresholds2 = new LowHRThresholds("BPM_50", 1, 50);
        f52224b = lowHRThresholds2;
        LowHRThresholds[] lowHRThresholdsArr = {lowHRThresholds, lowHRThresholds2, new LowHRThresholds("BPM_45", 2, 45), new LowHRThresholds("BPM_40", 3, 40), new LowHRThresholds("BPM_35", 4, 35)};
        f52225c = lowHRThresholdsArr;
        f52226d = sm0.b.a(lowHRThresholdsArr);
    }

    private LowHRThresholds(String str, int i11, int i12) {
        this.f52227a = i12;
    }

    public static sm0.a<LowHRThresholds> a() {
        return f52226d;
    }

    public static LowHRThresholds valueOf(String str) {
        return (LowHRThresholds) Enum.valueOf(LowHRThresholds.class, str);
    }

    public static LowHRThresholds[] values() {
        return (LowHRThresholds[]) f52225c.clone();
    }

    public final int b() {
        return this.f52227a;
    }
}

package com.withings.wiscale2.device.common.feature.highlowhr;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HighLowHRSettingsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/highlowhr/HighHRThresholds;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HighHRThresholds {

    /* renamed from: b  reason: collision with root package name */
    public static final HighHRThresholds f52177b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ HighHRThresholds[] f52178c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f52179d;

    /* renamed from: a  reason: collision with root package name */
    private final int f52180a;

    static {
        HighHRThresholds highHRThresholds = new HighHRThresholds("BPM_100", 0, 100);
        f52177b = highHRThresholds;
        HighHRThresholds[] highHRThresholdsArr = {highHRThresholds, new HighHRThresholds("BPM_110", 1, 110), new HighHRThresholds("BPM_120", 2, 120), new HighHRThresholds("BPM_130", 3, 130), new HighHRThresholds("BPM_140", 4, 140), new HighHRThresholds("BPM_150", 5, 150)};
        f52178c = highHRThresholdsArr;
        f52179d = sm0.b.a(highHRThresholdsArr);
    }

    private HighHRThresholds(String str, int i11, int i12) {
        this.f52180a = i12;
    }

    public static sm0.a<HighHRThresholds> a() {
        return f52179d;
    }

    public static HighHRThresholds valueOf(String str) {
        return (HighHRThresholds) Enum.valueOf(HighHRThresholds.class, str);
    }

    public static HighHRThresholds[] values() {
        return (HighHRThresholds[]) f52178c.clone();
    }

    public final int b() {
        return this.f52180a;
    }
}

package com.withings.wiscale2.device.wpa.wpa02.model;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Hydration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/HydrationStatus;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HydrationStatus {

    /* renamed from: d  reason: collision with root package name */
    public static final HydrationStatus f55068d;

    /* renamed from: e  reason: collision with root package name */
    public static final HydrationStatus f55069e;

    /* renamed from: f  reason: collision with root package name */
    public static final HydrationStatus f55070f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ HydrationStatus[] f55071g;

    /* renamed from: a  reason: collision with root package name */
    private final int f55072a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55073b = C1987R.string.specificgravity_description_body;

    /* renamed from: c  reason: collision with root package name */
    private final int f55074c;

    static {
        HydrationStatus hydrationStatus = new HydrationStatus("DEHYDRATION", 0, C1987R.string._LOW_feminine, C1987R.color.blue200);
        f55068d = hydrationStatus;
        HydrationStatus hydrationStatus2 = new HydrationStatus("NORMAL", 1, C1987R.string._MEDIUM_, C1987R.color.blue400);
        f55069e = hydrationStatus2;
        HydrationStatus hydrationStatus3 = new HydrationStatus("OVERHYDRATION", 2, C1987R.string._MORE_OPTIMAL_, C1987R.color.blue600);
        f55070f = hydrationStatus3;
        HydrationStatus[] hydrationStatusArr = {hydrationStatus, hydrationStatus2, hydrationStatus3};
        f55071g = hydrationStatusArr;
        b.a(hydrationStatusArr);
    }

    private HydrationStatus(String str, int i11, int i12, int i13) {
        this.f55072a = i12;
        this.f55074c = i13;
    }

    public static HydrationStatus valueOf(String str) {
        return (HydrationStatus) Enum.valueOf(HydrationStatus.class, str);
    }

    public static HydrationStatus[] values() {
        return (HydrationStatus[]) f55071g.clone();
    }

    public final int a() {
        return this.f55074c;
    }

    public final int b() {
        return this.f55073b;
    }

    public final int d() {
        return this.f55072a;
    }
}

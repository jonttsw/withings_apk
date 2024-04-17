package com.withings.wiscale2.activity.ui;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VasistasInfoOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/activity/ui/VasistasCategoryId;", "", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VasistasCategoryId {

    /* renamed from: c  reason: collision with root package name */
    public static final a f48535c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ VasistasCategoryId[] f48536d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f48537e;

    /* renamed from: a  reason: collision with root package name */
    private final int f48538a;

    /* renamed from: b  reason: collision with root package name */
    private final Vasistas.Category f48539b;

    /* compiled from: VasistasInfoOptionSheetFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.withings.wiscale2.activity.ui.VasistasCategoryId$a, java.lang.Object] */
    static {
        VasistasCategoryId[] vasistasCategoryIdArr = {new VasistasCategoryId("ALL", 0, C1987R.id.all_vasistas, null), new VasistasCategoryId("MOTION", 1, C1987R.id.motion_vasistas, Vasistas.Category.MOTION), new VasistasCategoryId("BED", 2, C1987R.id.bed_vasistas, Vasistas.Category.BED), new VasistasCategoryId("BODY", 3, C1987R.id.body_vasistas, Vasistas.Category.BODY), new VasistasCategoryId("PAUSE", 4, C1987R.id.pause_vasistas, Vasistas.Category.PAUSE), new VasistasCategoryId("SPO2", 5, C1987R.id.spo2_vasistas, Vasistas.Category.SPO2), new VasistasCategoryId("SWIM", 6, C1987R.id.swim_vasistas, Vasistas.Category.SWIM), new VasistasCategoryId("AHI", 7, C1987R.id.ahi_vasistas, Vasistas.Category.AHI), new VasistasCategoryId("CORE_TEMPERATURE", 8, C1987R.id.core_temperature_vasistas, Vasistas.Category.CORE_TEMPERATURE)};
        f48536d = vasistasCategoryIdArr;
        f48537e = sm0.b.a(vasistasCategoryIdArr);
        f48535c = new Object();
    }

    private VasistasCategoryId(String str, int i11, int i12, Vasistas.Category category) {
        this.f48538a = i12;
        this.f48539b = category;
    }

    public static sm0.a<VasistasCategoryId> d() {
        return f48537e;
    }

    public static VasistasCategoryId valueOf(String str) {
        return (VasistasCategoryId) Enum.valueOf(VasistasCategoryId.class, str);
    }

    public static VasistasCategoryId[] values() {
        return (VasistasCategoryId[]) f48536d.clone();
    }

    public final Vasistas.Category b() {
        return this.f48539b;
    }
}

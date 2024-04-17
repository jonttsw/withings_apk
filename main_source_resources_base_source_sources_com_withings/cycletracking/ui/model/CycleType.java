package com.withings.cycletracking.ui.model;

import com.withings.favorite.model.FavoriteCategoryKt;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SymptomUi.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/ui/model/CycleType;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleType {

    /* renamed from: b  reason: collision with root package name */
    public static final CycleType f35690b;

    /* renamed from: c  reason: collision with root package name */
    public static final CycleType f35691c;

    /* renamed from: d  reason: collision with root package name */
    public static final CycleType f35692d;

    /* renamed from: e  reason: collision with root package name */
    public static final CycleType f35693e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ CycleType[] f35694f;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f35695a;

    static {
        CycleType cycleType = new CycleType(0, Integer.valueOf((int) C1987R.string.cycleTracking_mostFrequentLogs_periodSection_title), "Period");
        f35690b = cycleType;
        CycleType cycleType2 = new CycleType(1, Integer.valueOf((int) C1987R.string.cycleTracking_mostFrequentLogs_predictedOvulationSection_title), "Ovulation");
        f35691c = cycleType2;
        CycleType cycleType3 = new CycleType(2, Integer.valueOf((int) C1987R.string.cycleTracking_mostFrequentLogs_outsideOfPeriod_title), "Other");
        f35692d = cycleType3;
        CycleType cycleType4 = new CycleType(3, null, FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY);
        f35693e = cycleType4;
        CycleType[] cycleTypeArr = {cycleType, cycleType2, cycleType3, cycleType4};
        f35694f = cycleTypeArr;
        b.a(cycleTypeArr);
    }

    private CycleType(int i11, Integer num, String str) {
        this.f35695a = num;
    }

    public static CycleType valueOf(String str) {
        return (CycleType) Enum.valueOf(CycleType.class, str);
    }

    public static CycleType[] values() {
        return (CycleType[]) f35694f.clone();
    }

    public final Integer a() {
        return this.f35695a;
    }
}

package com.withings.wiscale2.dashboard;

import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DashboardCategories.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/dashboard/DashboardCategories;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DashboardCategories {

    /* renamed from: c  reason: collision with root package name */
    public static final DashboardCategories f50492c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ DashboardCategories[] f50493d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f50494e;

    /* renamed from: a  reason: collision with root package name */
    private final int f50495a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f50496b;

    static {
        DashboardCategories dashboardCategories = new DashboardCategories("FOOD", 0, C1987R.string.metricsDetailView_nutritionSectionTitle, kotlin.collections.x.V("Food"));
        DashboardCategories dashboardCategories2 = new DashboardCategories("ENVIRONMENT", 1, C1987R.string.metricsDetailView_environmentSectionTitle, kotlin.collections.x.W("RoomTemperature", "CO2"));
        f50492c = dashboardCategories2;
        DashboardCategories[] dashboardCategoriesArr = {dashboardCategories, dashboardCategories2};
        f50493d = dashboardCategoriesArr;
        f50494e = sm0.b.a(dashboardCategoriesArr);
    }

    private DashboardCategories(String str, int i11, int i12, List list) {
        this.f50495a = i12;
        this.f50496b = list;
    }

    public static sm0.a<DashboardCategories> a() {
        return f50494e;
    }

    public static DashboardCategories valueOf(String str) {
        return (DashboardCategories) Enum.valueOf(DashboardCategories.class, str);
    }

    public static DashboardCategories[] values() {
        return (DashboardCategories[]) f50493d.clone();
    }

    public final List<String> b() {
        return this.f50496b;
    }

    public final int d() {
        return this.f50495a;
    }
}

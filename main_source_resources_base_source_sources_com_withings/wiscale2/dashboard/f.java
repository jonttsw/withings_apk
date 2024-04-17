package com.withings.wiscale2.dashboard;

import android.content.Context;
/* compiled from: DashboardCategories.kt */
/* loaded from: classes4.dex */
final class f extends kotlin.jvm.internal.w implements ym0.p<DashboardCategories, DashboardCategories, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f50519a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(2);
        this.f50519a = context;
    }

    @Override // ym0.p
    public final Integer invoke(DashboardCategories dashboardCategories, DashboardCategories dashboardCategories2) {
        int d11 = dashboardCategories.d();
        Context context = this.f50519a;
        String string = context.getString(d11);
        String string2 = context.getString(dashboardCategories2.d());
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        return Integer.valueOf(string.compareTo(string2));
    }
}

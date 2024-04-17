package com.withings.wiscale2.dashboard;

import java.util.List;
/* compiled from: DashboardCategories.kt */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final DashboardCategories f50523a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50524b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50525c = null;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.withings.wiscale2.dashboard.item.model.c> f50526d;

    public h(DashboardCategories dashboardCategories, int i11, List list) {
        this.f50523a = dashboardCategories;
        this.f50524b = i11;
        this.f50526d = list;
    }

    public final List<com.withings.wiscale2.dashboard.item.model.c> a() {
        return this.f50526d;
    }

    public final int b() {
        return this.f50524b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f50523a == hVar.f50523a && this.f50524b == hVar.f50524b && kotlin.jvm.internal.u.e(this.f50525c, hVar.f50525c) && kotlin.jvm.internal.u.e(this.f50526d, hVar.f50526d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a11 = androidx.appcompat.app.h.a(this.f50524b, this.f50523a.hashCode() * 31, 31);
        String str = this.f50525c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f50526d.hashCode() + ((a11 + hashCode) * 31);
    }

    public final String toString() {
        return "DashboardCategoryData(category=" + this.f50523a + ", titleRes=" + this.f50524b + ", healthScore=" + this.f50525c + ", summaryItemList=" + this.f50526d + ")";
    }
}

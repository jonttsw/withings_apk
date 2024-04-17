package com.withings.wiscale2.dashboard;

import com.withings.user.User;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class p<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DashboardViewModel f50599a;

    public p(DashboardViewModel dashboardViewModel) {
        this.f50599a = dashboardViewModel;
    }

    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        m70.i iVar;
        int i11;
        m70.i iVar2;
        User user = (User) t11;
        DashboardViewModel dashboardViewModel = this.f50599a;
        iVar = dashboardViewModel.f50497a;
        int i12 = 1;
        if (iVar.k(user)) {
            i11 = 0;
        } else if (user.D()) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        Integer valueOf = Integer.valueOf(i11);
        User user2 = (User) t12;
        iVar2 = dashboardViewModel.f50497a;
        if (iVar2.k(user2)) {
            i12 = 0;
        } else if (user2.D()) {
            i12 = 2;
        }
        return pm0.a.b(valueOf, Integer.valueOf(i12));
    }
}

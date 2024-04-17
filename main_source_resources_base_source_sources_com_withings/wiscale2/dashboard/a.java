package com.withings.wiscale2.dashboard;

import androidx.recyclerview.widget.m;
/* compiled from: DashboardAdapters.kt */
/* loaded from: classes4.dex */
public final class a extends m.f<com.withings.wiscale2.dashboard.item.model.c> {
    @Override // androidx.recyclerview.widget.m.f
    public final boolean areContentsTheSame(com.withings.wiscale2.dashboard.item.model.c cVar, com.withings.wiscale2.dashboard.item.model.c cVar2) {
        com.withings.wiscale2.dashboard.item.model.c oldItem = cVar;
        com.withings.wiscale2.dashboard.item.model.c newItem = cVar2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        return kotlin.jvm.internal.u.e(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.m.f
    public final boolean areItemsTheSame(com.withings.wiscale2.dashboard.item.model.c cVar, com.withings.wiscale2.dashboard.item.model.c cVar2) {
        com.withings.wiscale2.dashboard.item.model.c oldItem = cVar;
        com.withings.wiscale2.dashboard.item.model.c newItem = cVar2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        if (oldItem.d() == newItem.d()) {
            return true;
        }
        return false;
    }
}

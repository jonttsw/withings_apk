package com.withings.wiscale2.dashboard;

import androidx.recyclerview.widget.m;
/* compiled from: DashboardAdapters.kt */
/* loaded from: classes4.dex */
public final class v extends m.f<h> {
    @Override // androidx.recyclerview.widget.m.f
    public final boolean areContentsTheSame(h hVar, h hVar2) {
        h oldItem = hVar;
        h newItem = hVar2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        return kotlin.jvm.internal.u.e(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.m.f
    public final boolean areItemsTheSame(h hVar, h hVar2) {
        h oldItem = hVar;
        h newItem = hVar2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        if (oldItem.b() == newItem.b()) {
            return true;
        }
        return false;
    }
}

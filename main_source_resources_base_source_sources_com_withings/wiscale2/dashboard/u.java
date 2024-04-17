package com.withings.wiscale2.dashboard;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.wiscale2.C1987R;
/* compiled from: DashboardAdapters.kt */
/* loaded from: classes4.dex */
public final class u extends androidx.recyclerview.widget.u<h, w> {
    public u() {
        super(new m.f());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        w holder = (w) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        h item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new w(androidx.collection.c.n(parent, C1987R.layout.view_dashboard_section));
    }
}

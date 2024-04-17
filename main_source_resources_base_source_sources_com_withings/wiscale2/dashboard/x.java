package com.withings.wiscale2.dashboard;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.dashboard.item.CO2SummaryView;
import com.withings.wiscale2.dashboard.item.FoodSummaryView;
import com.withings.wiscale2.dashboard.item.RoomTemperatureSummaryView;
import com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView;
/* compiled from: DashboardAdapters.kt */
/* loaded from: classes4.dex */
public final class x extends androidx.recyclerview.widget.u<com.withings.wiscale2.dashboard.item.model.c, t<com.withings.wiscale2.dashboard.item.model.d>> {
    public x() {
        super(new m.f());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        return getItem(i11).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        t holder = (t) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        com.withings.wiscale2.dashboard.item.model.c item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        BaseSummaryItemView roomTemperatureSummaryView;
        kotlin.jvm.internal.u.j(parent, "parent");
        int i12 = CO2SummaryView.P;
        if (i11 == C1987R.id.dashboard_env_room_co2) {
            Context context = parent.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            roomTemperatureSummaryView = new CO2SummaryView(context, null, 6, 0);
        } else {
            int i13 = FoodSummaryView.P;
            if (i11 == C1987R.id.dashboard_nutrition_remaining_calories) {
                Context context2 = parent.getContext();
                kotlin.jvm.internal.u.i(context2, "getContext(...)");
                roomTemperatureSummaryView = new FoodSummaryView(context2, null, 6, 0);
            } else {
                int i14 = RoomTemperatureSummaryView.P;
                if (i11 == C1987R.id.dashboard_env_room_temperature) {
                    Context context3 = parent.getContext();
                    kotlin.jvm.internal.u.i(context3, "getContext(...)");
                    roomTemperatureSummaryView = new RoomTemperatureSummaryView(context3, null, 6, 0);
                } else {
                    throw new IllegalStateException(android.support.v4.media.a.a("You need to return ItemSummaryViewHolder for id ", i11));
                }
            }
        }
        return new t(roomTemperatureSummaryView);
    }
}

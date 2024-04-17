package com.withings.wiscale2.sleep.ui.sleepscore;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.views.measure.detail.ui.views.StatCellCardView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepStat;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class w3 extends RecyclerView.Adapter<v3> {

    /* renamed from: a  reason: collision with root package name */
    private final List<SleepStat> f61550a;

    public w3(ArrayList arrayList) {
        this.f61550a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f61550a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(v3 v3Var, int i11) {
        v3 holder = v3Var;
        kotlin.jvm.internal.u.j(holder, "holder");
        holder.b(this.f61550a.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final v3 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new v3((StatCellCardView) androidx.collection.c.n(parent, C1987R.layout.sleep_card_stat));
    }
}

package com.withings.measure.detail.ui.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
/* compiled from: AddDetailsView.kt */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter<d> {

    /* renamed from: a  reason: collision with root package name */
    private List<j> f41828a = i0.f76187a;

    public final void d(List<j> value) {
        u.j(value, "value");
        this.f41828a = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f41828a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(d dVar, int i11) {
        d holder = dVar;
        u.j(holder, "holder");
        holder.a(this.f41828a.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final d onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(C1987R.layout.view_item_details, parent, false);
        u.g(inflate);
        return new d(inflate);
    }
}

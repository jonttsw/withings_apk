package com.withings.wiscale2.profile;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.C1987R;
/* compiled from: ProfilePartnerAdapter.kt */
/* loaded from: classes5.dex */
public final class v0 extends androidx.recyclerview.widget.u<Partner, l> {

    /* renamed from: a  reason: collision with root package name */
    private final a f59469a;

    /* renamed from: b  reason: collision with root package name */
    private final kg0.c f59470b;

    /* compiled from: ProfilePartnerAdapter.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void V(Partner partner);
    }

    public v0(a aVar, kg0.c cVar) {
        super(new m.f());
        this.f59469a = aVar;
        this.f59470b = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        l holder = (l) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        Partner item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.b(item, this.f59469a, this.f59470b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new l(androidx.collection.c.n(parent, C1987R.layout.cell_item_partner_holder));
    }
}

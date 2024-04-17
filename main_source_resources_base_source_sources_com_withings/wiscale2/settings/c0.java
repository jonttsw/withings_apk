package com.withings.wiscale2.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.wiscale2.C1987R;
/* compiled from: DebugDeeplinkActivity.kt */
/* loaded from: classes5.dex */
public final class c0 extends androidx.recyclerview.widget.u<b0, d0> {

    /* renamed from: c  reason: collision with root package name */
    private static final a f59892c = new m.f();

    /* renamed from: a  reason: collision with root package name */
    private final ym0.l<e0, nm0.y> f59893a;

    /* renamed from: b  reason: collision with root package name */
    private final ym0.l<b0, nm0.y> f59894b;

    /* compiled from: DebugDeeplinkActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends m.f<b0> {
        @Override // androidx.recyclerview.widget.m.f
        public final boolean areContentsTheSame(b0 b0Var, b0 b0Var2) {
            b0 oldItem = b0Var;
            b0 newItem = b0Var2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem.a(), newItem.a());
        }

        @Override // androidx.recyclerview.widget.m.f
        public final boolean areItemsTheSame(b0 b0Var, b0 b0Var2) {
            b0 oldItem = b0Var;
            b0 newItem = b0Var2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(ym0.l<? super e0, nm0.y> lVar, ym0.l<? super b0, nm0.y> lVar2) {
        super(f59892c);
        this.f59893a = lVar;
        this.f59894b = lVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        d0 holder = (d0) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        b0 item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        b0 b0Var = item;
        holder.b().setText(b0Var.a());
        holder.b().setOnClickListener(new com.withings.wiscale2.device.common.feature.afib.j(5, b0Var, holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(C1987R.layout.list_deeplink_item, parent, false);
        kotlin.jvm.internal.u.g(inflate);
        return new d0(inflate, this.f59893a, this.f59894b);
    }
}

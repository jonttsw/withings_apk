package com.withings.wiscale2.device.common.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.wiscale2.device.common.ui.s1;
import tb0.m3;
/* compiled from: MedicalFeatureListAdapter.kt */
/* loaded from: classes5.dex */
public final class v1 extends androidx.recyclerview.widget.u<com.withings.wiscale2.device.common.ui.a, s1> {

    /* renamed from: b  reason: collision with root package name */
    private static final a f54110b = new m.f();

    /* renamed from: a  reason: collision with root package name */
    private final s1.a f54111a;

    /* compiled from: MedicalFeatureListAdapter.kt */
    /* loaded from: classes5.dex */
    public static final class a extends m.f<com.withings.wiscale2.device.common.ui.a> {
        @Override // androidx.recyclerview.widget.m.f
        public final boolean areContentsTheSame(com.withings.wiscale2.device.common.ui.a aVar, com.withings.wiscale2.device.common.ui.a aVar2) {
            com.withings.wiscale2.device.common.ui.a oldItem = aVar;
            com.withings.wiscale2.device.common.ui.a newItem = aVar2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.m.f
        public final boolean areItemsTheSame(com.withings.wiscale2.device.common.ui.a aVar, com.withings.wiscale2.device.common.ui.a aVar2) {
            com.withings.wiscale2.device.common.ui.a oldItem = aVar;
            com.withings.wiscale2.device.common.ui.a newItem = aVar2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            if (oldItem.c() == newItem.c()) {
                return true;
            }
            return false;
        }
    }

    public v1(s1.a aVar) {
        super(f54110b);
        this.f54111a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        s1 holder = (s1) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        com.withings.wiscale2.device.common.ui.a item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.b(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        Context context = parent.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        return new s1(context, this.f54111a, m3.a(LayoutInflater.from(parent.getContext()), parent));
    }
}

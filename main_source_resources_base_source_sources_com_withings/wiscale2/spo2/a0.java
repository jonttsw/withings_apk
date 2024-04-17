package com.withings.wiscale2.spo2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.wiscale2.C1987R;
import java.util.List;
import ji0.c0;
/* compiled from: Spo2Measurements.kt */
/* loaded from: classes5.dex */
public final class a0 extends androidx.recyclerview.widget.u<c0, v> {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.a<nm0.y> f61648a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Boolean> f61649b;

    /* compiled from: Spo2Measurements.kt */
    /* loaded from: classes5.dex */
    public static final class a extends m.f<c0> {
        @Override // androidx.recyclerview.widget.m.f
        public final boolean areContentsTheSame(c0 c0Var, c0 c0Var2) {
            c0 oldItem = c0Var;
            c0 newItem = c0Var2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.m.f
        public final boolean areItemsTheSame(c0 c0Var, c0 c0Var2) {
            c0 oldItem = c0Var;
            c0 newItem = c0Var2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }
    }

    public a0(ym0.a<nm0.y> aVar) {
        super(new m.f());
        this.f61648a = aVar;
        this.f61649b = new SparseArray<>();
    }

    public static void d(a0 this$0, int i11, v holder) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(holder, "$holder");
        SparseArray<Boolean> sparseArray = this$0.f61649b;
        boolean z5 = !sparseArray.get(i11, Boolean.FALSE).booleanValue();
        sparseArray.put(i11, Boolean.valueOf(z5));
        holder.d(z5);
    }

    public static void e(a0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ym0.a<nm0.y> aVar = this$0.f61648a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final SparseArray<Boolean> f() {
        return this.f61649b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        v holder = (v) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        c0 item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new v(androidx.collection.c.n(parent, C1987R.layout.item_measurement));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, final int i11, List payloads) {
        final v holder = (v) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        kotlin.jvm.internal.u.j(payloads, "payloads");
        super.onBindViewHolder(holder, i11, payloads);
        boolean e11 = kotlin.jvm.internal.u.e(kotlin.collections.x.K(payloads), Boolean.TRUE);
        holder.c(e11);
        if (e11) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.spo2.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a0.d(a0.this, i11, holder);
                }
            });
            return;
        }
        holder.d(false);
        holder.itemView.setOnClickListener(new androidx.media3.ui.i(this, 21));
    }
}

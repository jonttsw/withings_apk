package com.withings.wiscale2.heart.heartrate;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: HRMeasurements.kt */
/* loaded from: classes5.dex */
public final class k1 extends androidx.recyclerview.widget.u<MeasuresGroup, d> {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Boolean> f57685a;

    /* compiled from: HRMeasurements.kt */
    /* loaded from: classes5.dex */
    public static final class a extends m.f<MeasuresGroup> {
        @Override // androidx.recyclerview.widget.m.f
        public final boolean areContentsTheSame(MeasuresGroup measuresGroup, MeasuresGroup measuresGroup2) {
            MeasuresGroup oldItem = measuresGroup;
            MeasuresGroup newItem = measuresGroup2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.m.f
        public final boolean areItemsTheSame(MeasuresGroup measuresGroup, MeasuresGroup measuresGroup2) {
            MeasuresGroup oldItem = measuresGroup;
            MeasuresGroup newItem = measuresGroup2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }
    }

    public k1() {
        super(new m.f());
        this.f57685a = new SparseArray<>();
    }

    public static void d(k1 this$0, int i11, d holder) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(holder, "$holder");
        SparseArray<Boolean> sparseArray = this$0.f57685a;
        boolean z5 = !sparseArray.get(i11, Boolean.FALSE).booleanValue();
        sparseArray.put(i11, Boolean.valueOf(z5));
        holder.c(z5);
    }

    public final SparseArray<Boolean> e() {
        return this.f57685a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        d holder = (d) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        MeasuresGroup item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new d(androidx.collection.c.n(parent, C1987R.layout.item_measurement));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, final int i11, List payloads) {
        final d holder = (d) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        kotlin.jvm.internal.u.j(payloads, "payloads");
        super.onBindViewHolder(holder, i11, payloads);
        boolean e11 = kotlin.jvm.internal.u.e(kotlin.collections.x.K(payloads), Boolean.TRUE);
        holder.b(e11);
        if (e11) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.heart.heartrate.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k1.d(k1.this, i11, holder);
                }
            });
        } else {
            holder.c(false);
        }
    }
}

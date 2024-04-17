package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: WorkoutPhoto.kt */
/* loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter<y0> {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.p<w0, Integer, nm0.y> f49139a;

    /* renamed from: b  reason: collision with root package name */
    private final ym0.p<w0, Integer, nm0.y> f49140b;

    /* renamed from: c  reason: collision with root package name */
    private final ym0.a<nm0.y> f49141c;

    /* renamed from: d  reason: collision with root package name */
    private List<? extends x0> f49142d = kotlin.collections.i0.f76187a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(ym0.p<? super w0, ? super Integer, nm0.y> pVar, ym0.p<? super w0, ? super Integer, nm0.y> pVar2, ym0.a<nm0.y> aVar) {
        this.f49139a = pVar;
        this.f49140b = pVar2;
        this.f49141c = aVar;
    }

    public static void d(c this$0, x0 item, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(item, "$item");
        this$0.f49139a.invoke(item, Integer.valueOf(i11));
    }

    public static void e(c this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.f49141c.invoke();
    }

    public static void f(c this$0, x0 item, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(item, "$item");
        this$0.f49140b.invoke(item, Integer.valueOf(i11));
    }

    public final void g(List<? extends x0> value) {
        kotlin.jvm.internal.u.j(value, "value");
        this.f49142d = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f49142d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(y0 y0Var, final int i11) {
        y0 holder = y0Var;
        kotlin.jvm.internal.u.j(holder, "holder");
        final x0 x0Var = this.f49142d.get(i11);
        if (x0Var instanceof w0) {
            holder.a((w0) x0Var);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.d(c.this, x0Var, i11);
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.b
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    c.f(c.this, x0Var, i11);
                    return true;
                }
            });
            return;
        }
        holder.b();
        holder.itemView.setOnClickListener(new io.j(this, 4));
        holder.itemView.setOnLongClickListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final y0 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new y0(androidx.collection.c.n(parent, C1987R.layout.viewholder_workout_photo));
    }
}

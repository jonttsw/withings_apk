package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class z5 extends RecyclerView.Adapter<RecyclerView.z> {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.l<x5, nm0.y> f49837a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends x5> f49838b = kotlin.collections.i0.f76187a;

    /* JADX WARN: Multi-variable type inference failed */
    public z5(ym0.l<? super x5, nm0.y> lVar) {
        this.f49837a = lVar;
    }

    public static void d(z5 this$0, x5 notification) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(notification, "$notification");
        this$0.f49837a.invoke(notification);
    }

    public final void e(List<? extends x5> value) {
        kotlin.jvm.internal.u.j(value, "value");
        this.f49838b = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f49838b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        x5 x5Var = this.f49838b.get(i11);
        if (x5Var instanceof n1) {
            return 1;
        }
        if (x5Var instanceof p1) {
            return 2;
        }
        if (x5Var instanceof s1) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z holder, int i11) {
        kotlin.jvm.internal.u.j(holder, "holder");
        final x5 x5Var = this.f49838b.get(i11);
        if (x5Var instanceof n1) {
            ((s6) holder).a((n1) x5Var);
        } else if (x5Var instanceof s1) {
            ((r1) holder).a((s1) x5Var);
        } else if (x5Var instanceof p1) {
            ((q1) holder).a((p1) x5Var);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.y5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z5.d(z5.this, x5Var);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    int i12 = r1.f49576d;
                    return new r1(androidx.collection.c.n(parent, C1987R.layout.list_item_timeline_text_glyph));
                }
                throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown view type: ", i11));
            }
            int i13 = q1.f49551d;
            return new q1(androidx.collection.c.n(parent, C1987R.layout.list_item_timeline_text_glyph));
        }
        int i14 = s6.f49624f;
        return new s6(androidx.collection.c.n(parent, C1987R.layout.list_item_timeline_text_glyph));
    }
}

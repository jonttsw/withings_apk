package com.withings.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.withings.wiscale2.C1987R;
import gi.b;
import gi.d;
import java.util.Iterator;
import java.util.List;
import nm0.y;
import ym0.p;
/* compiled from: Sheet.kt */
/* loaded from: classes3.dex */
public final class a extends u<b, gi.a> {

    /* renamed from: a  reason: collision with root package name */
    private Integer f32910a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<Integer, b, y> f32911b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<b> list, d dVar, p<? super Integer, ? super b, y> pVar) {
        super(dVar);
        this.f32911b = pVar;
        Iterator<b> it = list.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().b()) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        this.f32910a = i11 == -1 ? null : Integer.valueOf(i11);
    }

    public static void d(a this$0, int i11, gi.a holder, p pVar, b bVar) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(holder, "$holder");
        Integer num = this$0.f32910a;
        this$0.f32910a = Integer.valueOf(i11);
        holder.b(true);
        if (num != null) {
            this$0.notifyItemChanged(num.intValue());
        }
        if (pVar != null) {
            Integer valueOf = Integer.valueOf(i11);
            kotlin.jvm.internal.u.g(bVar);
            pVar.invoke(valueOf, bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, final int i11) {
        boolean z5;
        final gi.a holder = (gi.a) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        final b item = getItem(i11);
        holder.e(item.c());
        holder.c(item.a());
        holder.a().setOnCheckedChangeListener(null);
        Integer num = this.f32910a;
        if (num != null && num.intValue() == i11) {
            z5 = true;
        } else {
            z5 = false;
        }
        holder.b(z5);
        holder.d(item.d());
        if (item.d()) {
            View view = holder.getView();
            final p<Integer, b, y> pVar = this.f32911b;
            view.setOnClickListener(new View.OnClickListener() { // from class: gi.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.withings.bottomsheet.a.d(com.withings.bottomsheet.a.this, i11, holder, pVar, item);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new gi.a(c.n(parent, C1987R.layout.sheet_radio_button));
    }
}

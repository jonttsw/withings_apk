package com.withings.wiscale2.measure.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.list.d;
import h80.a;
import java.util.List;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureListActivity.kt */
/* loaded from: classes5.dex */
public final class x extends androidx.recyclerview.widget.u<d, RecyclerView.z> implements a.InterfaceC1022a {

    /* renamed from: a  reason: collision with root package name */
    private final User f58587a;

    /* renamed from: b  reason: collision with root package name */
    private final ym0.q<k, User, MeasuresGroup, nm0.y> f58588b;

    /* renamed from: c  reason: collision with root package name */
    private final ym0.q<k, User, List<? extends MeasuresGroup>, nm0.y> f58589c;

    /* renamed from: d  reason: collision with root package name */
    private final ym0.q<Context, User, MeasuresGroup, nm0.y> f58590d;

    /* compiled from: MeasureListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends m.f<d> {
        @Override // androidx.recyclerview.widget.m.f
        public final boolean areContentsTheSame(d dVar, d dVar2) {
            d oldItem = dVar;
            d newItem = dVar2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            if ((oldItem instanceof d.b) && (newItem instanceof d.b)) {
                return kotlin.jvm.internal.u.e(((d.b) oldItem).a(), ((d.b) newItem).a());
            }
            if (!(oldItem instanceof d.c) || !(newItem instanceof d.c) || ((d.c) oldItem).a().getId() != ((d.c) newItem).a().getId()) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.m.f
        public final boolean areItemsTheSame(d dVar, d dVar2) {
            d oldItem = dVar;
            d newItem = dVar2;
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            if ((oldItem instanceof d.b) && (newItem instanceof d.b)) {
                return kotlin.jvm.internal.u.e(oldItem, newItem);
            }
            if ((oldItem instanceof d.c) && (newItem instanceof d.c)) {
                return kotlin.jvm.internal.u.e(oldItem, newItem);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(User user, ym0.q<? super k, ? super User, ? super MeasuresGroup, nm0.y> measureListDisplayer, ym0.q<? super k, ? super User, ? super List<? extends MeasuresGroup>, nm0.y> debugListDisplayer, ym0.q<? super Context, ? super User, ? super MeasuresGroup, nm0.y> onMeasureClickListener) {
        super(new m.f());
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(measureListDisplayer, "measureListDisplayer");
        kotlin.jvm.internal.u.j(debugListDisplayer, "debugListDisplayer");
        kotlin.jvm.internal.u.j(onMeasureClickListener, "onMeasureClickListener");
        this.f58587a = user;
        this.f58588b = measureListDisplayer;
        this.f58589c = debugListDisplayer;
        this.f58590d = onMeasureClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(x this$0, k itemViewHolder, d dVar) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(itemViewHolder, "$itemViewHolder");
        Context context = itemViewHolder.getView().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this$0.f58590d.invoke(context, this$0.f58587a, kotlin.collections.x.I(((d.a) dVar).a()));
    }

    public static void e(x this$0, k itemViewHolder, d dVar) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(itemViewHolder, "$itemViewHolder");
        Context context = itemViewHolder.getView().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this$0.f58590d.invoke(context, this$0.f58587a, ((d.c) dVar).a());
    }

    @Override // h80.a.InterfaceC1022a
    public final boolean a(int i11) {
        if (getItemViewType(i11) == 0) {
            return true;
        }
        return false;
    }

    @Override // h80.a.InterfaceC1022a
    public final void b(View view, int i11) {
        SectionView sectionView = (SectionView) view.findViewById(C1987R.id.section);
        if (sectionView != null) {
            d item = getItem(i11);
            kotlin.jvm.internal.u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.measure.list.ListItem.HeaderItem");
            sectionView.setTitle(((d.b) item).a());
        }
        View findViewById = view.findViewById(C1987R.id.fake_elevation);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @Override // h80.a.InterfaceC1022a
    public final int c(int i11) {
        while (i11 >= 0) {
            if (getItemViewType(i11) == 0) {
                return i11;
            }
            i11--;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        return !(getItem(i11) instanceof d.b) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z holder, int i11) {
        int i12;
        kotlin.jvm.internal.u.j(holder, "holder");
        final d item = getItem(i11);
        boolean z5 = false;
        if (item instanceof d.b) {
            j jVar = (j) holder;
            if (i11 != 0 && (getItem(i11 - 1) instanceof d.c)) {
                z5 = true;
            }
            jVar.b(z5);
            jVar.a(((d.b) item).a());
            return;
        }
        final k kVar = (k) holder;
        View c11 = kVar.c();
        if (i11 != 0 && !(getItem(i11 - 1) instanceof d.b)) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        c11.setVisibility(i12);
        boolean z11 = item instanceof d.c;
        User user = this.f58587a;
        if (z11) {
            TextView d11 = kVar.d();
            d.c cVar = (d.c) item;
            DateTime dateTime = new DateTime(cVar.a().getDate().getTime());
            Context context = kVar.d().getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            d11.setText(b50.b.m(dateTime, context, false, 6));
            this.f58588b.invoke(kVar, user, cVar.a());
            kVar.getView().setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.measure.list.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x.e(x.this, kVar, item);
                }
            });
        } else if (item instanceof d.a) {
            TextView d12 = kVar.d();
            d.a aVar = (d.a) item;
            DateTime dateTime2 = new DateTime(((MeasuresGroup) kotlin.collections.x.I(aVar.a())).getDate().getTime());
            Context context2 = kVar.d().getContext();
            kotlin.jvm.internal.u.i(context2, "getContext(...)");
            d12.setText(b50.b.m(dateTime2, context2, false, 6));
            this.f58589c.invoke(kVar, user, aVar.a());
            kVar.getView().setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.measure.list.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x.d(x.this, kVar, item);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        if (i11 == 0) {
            return new j(androidx.collection.c.n(parent, C1987R.layout.list_item_measure_header));
        }
        return new k(androidx.collection.c.n(parent, C1987R.layout.list_item_measure));
    }
}

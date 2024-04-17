package com.withings.wiscale2.dashboard;

import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView;
import com.withings.wiscale2.dashboard.item.model.d;
/* compiled from: DashboardAdapters.kt */
/* loaded from: classes4.dex */
public final class t<Data extends com.withings.wiscale2.dashboard.item.model.d> extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final BaseSummaryItemView<Data> f50608a;

    public t(BaseSummaryItemView<Data> baseSummaryItemView) {
        super(baseSummaryItemView);
        this.f50608a = baseSummaryItemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.withings.wiscale2.dashboard.item.model.c cVar) {
        BaseSummaryItemView<Data> baseSummaryItemView = this.f50608a;
        baseSummaryItemView.u();
        baseSummaryItemView.setId(cVar.a());
        baseSummaryItemView.t(cVar);
        com.withings.wiscale2.dashboard.item.model.d b10 = cVar.b();
        if (!(b10 instanceof com.withings.wiscale2.dashboard.item.model.d)) {
            b10 = null;
        }
        if (b10 != null) {
            String string = baseSummaryItemView.getContext().getString(cVar.d());
            kotlin.jvm.internal.u.i(string, "getString(...)");
            baseSummaryItemView.setCategory(string);
            baseSummaryItemView.setValueTextAppearance(C1987R.style.data4);
            baseSummaryItemView.z(cVar.f(), b10);
        } else if (!cVar.e().isEmpty()) {
            baseSummaryItemView.D(cVar);
        } else {
            baseSummaryItemView.C(cVar);
        }
    }
}

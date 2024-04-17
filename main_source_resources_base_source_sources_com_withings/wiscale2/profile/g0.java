package com.withings.wiscale2.profile;

import androidx.recyclerview.widget.RecyclerView;
import com.withings.partner.model.Partner;
import java.util.List;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.l<List<? extends Partner>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59343a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(q qVar) {
        super(1);
        this.f59343a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends Partner> list) {
        RecyclerView recyclerView;
        List<? extends Partner> it = list;
        kotlin.jvm.internal.u.j(it, "it");
        recyclerView = this.f59343a.f59438v;
        if (recyclerView != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            kotlin.jvm.internal.u.h(adapter, "null cannot be cast to non-null type com.withings.wiscale2.profile.ProfilePartnerAdapter");
            ((v0) adapter).submitList(it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("partnersRecycler");
        throw null;
    }
}

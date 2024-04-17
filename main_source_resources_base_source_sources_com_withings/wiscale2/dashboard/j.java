package com.withings.wiscale2.dashboard;

import com.withings.views.view.WithingsSwipeToRefresh;
import nm0.y;
/* compiled from: DashboardFragment.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f50587a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar) {
        super(1);
        this.f50587a = iVar;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        boolean booleanValue;
        Boolean bool2 = bool;
        WithingsSwipeToRefresh withingsSwipeToRefresh = i.t1(this.f50587a).f99530b;
        if (bool2 == null) {
            booleanValue = false;
        } else {
            booleanValue = bool2.booleanValue();
        }
        withingsSwipeToRefresh.setRefreshing(booleanValue);
        return y.f85009a;
    }
}

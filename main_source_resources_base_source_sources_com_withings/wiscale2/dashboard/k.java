package com.withings.wiscale2.dashboard;

import java.util.List;
import nm0.y;
/* compiled from: DashboardFragment.kt */
/* loaded from: classes4.dex */
final class k extends kotlin.jvm.internal.w implements ym0.l<List<? extends h>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f50588a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar) {
        super(1);
        this.f50588a = iVar;
    }

    @Override // ym0.l
    public final y invoke(List<? extends h> list) {
        i.u1(this.f50588a).submitList(list);
        return y.f85009a;
    }
}

package com.withings.weight.bodycomposition.ui;

import com.withings.views.view.HorizontalSausageWithLegendsView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyCompositionZonesDetailView.kt */
/* loaded from: classes4.dex */
public final class b extends w implements p<ky.a, ky.a, ym0.a<? extends y>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyCompositionZonesDetailView f46955a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<HorizontalSausageWithLegendsView.b> f46956b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BodyCompositionZonesDetailView bodyCompositionZonesDetailView, ArrayList arrayList) {
        super(2);
        this.f46955a = bodyCompositionZonesDetailView;
        this.f46956b = arrayList;
    }

    @Override // ym0.p
    public final ym0.a<? extends y> invoke(ky.a aVar, ky.a aVar2) {
        ky.a weight = aVar;
        ky.a mgm = aVar2;
        u.j(weight, "weight");
        u.j(mgm, "mgm");
        return new a(this.f46955a, this.f46956b, weight, mgm);
    }
}

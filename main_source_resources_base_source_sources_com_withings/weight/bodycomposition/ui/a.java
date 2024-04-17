package com.withings.weight.bodycomposition.ui;

import com.withings.views.view.HorizontalSausageWithLegendsView;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: BodyCompositionZonesDetailView.kt */
/* loaded from: classes4.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyCompositionZonesDetailView f46951a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<HorizontalSausageWithLegendsView.b> f46952b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ky.a f46953c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ky.a f46954d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BodyCompositionZonesDetailView bodyCompositionZonesDetailView, List<HorizontalSausageWithLegendsView.b> list, ky.a aVar, ky.a aVar2) {
        super(0);
        this.f46951a = bodyCompositionZonesDetailView;
        this.f46952b = list;
        this.f46953c = aVar;
        this.f46954d = aVar2;
    }

    @Override // ym0.a
    public final y invoke() {
        BodyCompositionZonesDetailView.a(this.f46951a, this.f46952b, this.f46953c.f(), this.f46954d.f());
        return y.f85009a;
    }
}

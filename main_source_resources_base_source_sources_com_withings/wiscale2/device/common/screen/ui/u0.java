package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<sc0.c> f53440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53441b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53442c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53443d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53444e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53445f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53446g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f53447h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(List<sc0.c> list, ym0.l<? super sc0.b, nm0.y> lVar, ym0.l<? super sc0.b, nm0.y> lVar2, ym0.l<? super Integer, nm0.y> lVar3, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
        super(2);
        this.f53440a = list;
        this.f53441b = lVar;
        this.f53442c = lVar2;
        this.f53443d = lVar3;
        this.f53444e = aVar;
        this.f53445f = aVar2;
        this.f53446g = aVar3;
        this.f53447h = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53447h | 1);
        ym0.a<nm0.y> aVar2 = this.f53445f;
        ym0.a<nm0.y> aVar3 = this.f53446g;
        w1.c(this.f53440a, this.f53441b, this.f53442c, this.f53443d, this.f53444e, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}

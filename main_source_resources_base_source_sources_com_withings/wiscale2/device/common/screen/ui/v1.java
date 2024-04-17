package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class v1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<sc0.c> f53456a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53457b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53458c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53459d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53460e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f53461f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v1(List<sc0.c> list, ym0.l<? super sc0.b, nm0.y> lVar, ym0.l<? super Integer, nm0.y> lVar2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f53456a = list;
        this.f53457b = lVar;
        this.f53458c = lVar2;
        this.f53459d = aVar;
        this.f53460e = aVar2;
        this.f53461f = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53461f | 1);
        ym0.a<nm0.y> aVar2 = this.f53459d;
        ym0.a<nm0.y> aVar3 = this.f53460e;
        w1.h(this.f53456a, this.f53457b, this.f53458c, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<sc0.c> f53303a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53304b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53305c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53306d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53307e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53308f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53309g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f53310h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f53311i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(List<sc0.c> list, ym0.l<? super sc0.b, nm0.y> lVar, ym0.l<? super sc0.b, nm0.y> lVar2, ym0.l<? super Integer, nm0.y> lVar3, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11, int i12) {
        super(2);
        this.f53303a = list;
        this.f53304b = lVar;
        this.f53305c = lVar2;
        this.f53306d = lVar3;
        this.f53307e = aVar;
        this.f53308f = aVar2;
        this.f53309g = aVar3;
        this.f53310h = i11;
        this.f53311i = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53310h | 1);
        ym0.a<nm0.y> aVar2 = this.f53308f;
        ym0.a<nm0.y> aVar3 = this.f53309g;
        w1.b(this.f53303a, this.f53304b, this.f53305c, this.f53306d, this.f53307e, aVar2, aVar3, aVar, g11, this.f53311i);
        return nm0.y.f85009a;
    }
}

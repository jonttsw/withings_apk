package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<sc0.b> f53358a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.p<Integer, Integer, nm0.y> f53359b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53360c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53361d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f53362e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1(List<sc0.b> list, ym0.p<? super Integer, ? super Integer, nm0.y> pVar, ym0.l<? super sc0.b, nm0.y> lVar, ym0.l<? super Integer, nm0.y> lVar2, int i11) {
        super(2);
        this.f53358a = list;
        this.f53359b = pVar;
        this.f53360c = lVar;
        this.f53361d = lVar2;
        this.f53362e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53362e | 1);
        ym0.l<sc0.b, nm0.y> lVar = this.f53360c;
        ym0.l<Integer, nm0.y> lVar2 = this.f53361d;
        w1.e(this.f53358a, this.f53359b, lVar, lVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}

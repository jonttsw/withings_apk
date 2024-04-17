package com.withings.fever.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f39406b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f39407c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.compose.ui.e eVar, int i11, int i12) {
        super(2);
        this.f39405a = eVar;
        this.f39406b = i11;
        this.f39407c = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f39406b | 1);
        int i11 = this.f39407c;
        m.h(this.f39405a, aVar, g11, i11);
        return nm0.y.f85009a;
    }
}

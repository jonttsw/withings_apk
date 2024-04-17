package com.withings.fever.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f39399a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<bs.b> f39400b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f39401c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f39402d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ym0.a<nm0.y> aVar, List<bs.b> list, int i11, int i12) {
        super(2);
        this.f39399a = aVar;
        this.f39400b = list;
        this.f39401c = i11;
        this.f39402d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f39401c | 1);
        m.g(this.f39399a, this.f39400b, aVar, g11, this.f39402d);
        return nm0.y.f85009a;
    }
}

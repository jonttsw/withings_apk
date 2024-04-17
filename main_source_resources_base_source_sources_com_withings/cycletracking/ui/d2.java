package com.withings.cycletracking.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingHistoryScreen.kt */
/* loaded from: classes3.dex */
public final class d2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35524a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<wm.f> f35525b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f35526c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(int i11, List list, ym0.a aVar) {
        super(2);
        this.f35524a = aVar;
        this.f35525b = list;
        this.f35526c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        w1.c(ah.o.g(this.f35526c | 1), aVar, this.f35525b, this.f35524a);
        return nm0.y.f85009a;
    }
}

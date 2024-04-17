package com.withings.common.compose.component;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
public final class d2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33640a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<u1> f33641b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f33642c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f33643d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(int i11, int i12, androidx.compose.ui.e eVar, List list) {
        super(2);
        this.f33640a = eVar;
        this.f33641b = list;
        this.f33642c = i11;
        this.f33643d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33642c | 1);
        androidx.compose.ui.e eVar = this.f33640a;
        List<u1> list = this.f33641b;
        w1.e(g11, this.f33643d, aVar, eVar, list);
        return nm0.y.f85009a;
    }
}

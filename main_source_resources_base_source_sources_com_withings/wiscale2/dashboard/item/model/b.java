package com.withings.wiscale2.dashboard.item.model;

import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseSummaryItemView.kt */
/* loaded from: classes4.dex */
public final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f50563a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f50564b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f50565c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, float f11, float f12) {
        super(2);
        this.f50563a = i11;
        this.f50564b = f11;
        this.f50565c = f12;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            o.b(false, s1.b.b(aVar2, -1039314515, new a(this.f50563a, this.f50564b, this.f50565c)), aVar2, 48, 1);
        }
        return y.f85009a;
    }
}

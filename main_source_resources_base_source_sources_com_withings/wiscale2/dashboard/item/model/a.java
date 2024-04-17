package com.withings.wiscale2.dashboard.item.model;

import com.withings.common.compose.component.k3;
import d2.h0;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: BaseSummaryItemView.kt */
/* loaded from: classes4.dex */
final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f50560a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f50561b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f50562c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11, float f11, float f12) {
        super(2);
        this.f50560a = i11;
        this.f50561b = f11;
        this.f50562c = f12;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            k3.a(null, h0.b(this.f50560a), this.f50561b / this.f50562c, null, null, false, false, aVar2, 0, 121);
        }
        return y.f85009a;
    }
}

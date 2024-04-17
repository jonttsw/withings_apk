package com.withings.cycletracking.ui;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class b2 extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f35512a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(List list) {
        super(4);
        this.f35512a = list;
    }

    @Override // ym0.r
    public final nm0.y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i11;
        int i12;
        int i13;
        s0.b bVar2 = bVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 14) == 0) {
            if (aVar2.K(bVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (aVar2.c(intValue)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-2136567017);
            bn.b.b((wm.f) this.f35512a.get(intValue), androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.c(), 0.0f, 0.0f, 13), yk.h.d(), 0.0f, 2), aVar2, 8, 0);
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}

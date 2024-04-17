package com.withings.wiscale2.settings;

import androidx.compose.material3.ga;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class p5 extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f60253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(List list) {
        super(4);
        this.f60253a = list;
    }

    @Override // ym0.r
    public final nm0.y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i11;
        long c11;
        long j5;
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
            String str = (String) this.f60253a.get(intValue);
            aVar2.s(1793348797);
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.foundation.layout.x0.f(androidx.compose.ui.e.f8927a, yk.h.b()), 1.0f);
            aVar2.s(1793348969);
            if (dp0.j.r(str, "Total sync", false)) {
                c11 = d2.h0.c(4286096076L);
            } else {
                aVar2.J();
                c11 = ((yk.w) androidx.camera.camera2.internal.p2.b(aVar2, 615317871)).i().c();
            }
            long j11 = c11;
            aVar2.J();
            ga.b(str, e11, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 131064);
            j5 = d2.f0.f63259c;
            androidx.compose.material3.p4.a(null, 1, j5, aVar2, 432, 1);
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}

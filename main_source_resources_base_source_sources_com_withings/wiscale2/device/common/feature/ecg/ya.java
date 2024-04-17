package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class ya extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f52134a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52135b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f52136c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.o1 f52137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(List list, WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, k1.o1 o1Var) {
        super(4);
        this.f52134a = list;
        this.f52135b = wBS08EcgActivationActivity;
        this.f52136c = nVar;
        this.f52137d = o1Var;
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
            t5 t5Var = (t5) this.f52134a.get(intValue);
            aVar2.s(-1408112896);
            com.withings.common.compose.component.o.d(androidx.compose.foundation.h.b(androidx.compose.foundation.layout.x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.a()), false, new wa(this.f52135b, t5Var, this.f52136c), 7), null, null, a3.g.u(t5Var, (Context) aVar2.D(androidx.compose.ui.platform.u0.d())), null, false, false, false, null, aVar2, 0, 502);
            if (intValue != kotlin.collections.x.M((List) this.f52137d.getValue())) {
                androidx.compose.material.b2.a(0.0f, 0.0f, 0, 15, 0L, aVar2, null);
            }
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}

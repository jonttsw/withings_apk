package com.withings.wiscale2.device.common.screen.ui;

import androidx.compose.runtime.a;
import com.withings.common.compose.component.c5;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53464a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ym0.a<nm0.y> aVar) {
        super(2);
        this.f53464a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string._DEVICE_SCREENS_, aVar2);
            long a11 = ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).a();
            aVar2.s(1466551066);
            ym0.a<nm0.y> aVar3 = this.f53464a;
            boolean K = aVar2.K(aVar3);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new v0(aVar3);
                aVar2.n(t11);
            }
            aVar2.J();
            c5.a(a11, 0L, u11, true, null, null, null, null, false, (ym0.a) t11, aVar2, 3072, 498);
        }
        return nm0.y.f85009a;
    }
}

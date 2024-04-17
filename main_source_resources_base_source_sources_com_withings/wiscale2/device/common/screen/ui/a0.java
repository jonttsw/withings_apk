package com.withings.wiscale2.device.common.screen.ui;

import androidx.compose.runtime.a;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53259a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ym0.a<nm0.y> aVar) {
        super(3);
        this.f53259a = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(cVar, "$this$null");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(343799779);
            ym0.a<nm0.y> aVar3 = this.f53259a;
            boolean K = aVar2.K(aVar3);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new z(aVar3);
                aVar2.n(t11);
            }
            aVar2.J();
            wp.d.d(0, 0, aVar2, (ym0.a) t11);
        }
        return nm0.y.f85009a;
    }
}

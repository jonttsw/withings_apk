package com.withings.cycletracking.ui;

import androidx.compose.material3.ka;
/* compiled from: CycleTrackingHistoryScreen.kt */
/* loaded from: classes3.dex */
final class y1 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36091a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ym0.a<nm0.y> aVar) {
        super(3);
        this.f36091a = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b stickyHeader = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(stickyHeader, "$this$stickyHeader");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.material3.c0.b(b.f35498a, null, s1.b.b(aVar2, 1821101832, new x1(this.f36091a)), null, null, ka.d(((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).a(), ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).w(), aVar2), null, aVar2, 390, 90);
            com.withings.common.compose.component.v0.b(0.0f, aVar2, 0, 1);
        }
        return nm0.y.f85009a;
    }
}

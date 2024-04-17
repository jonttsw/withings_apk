package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class u7 extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f51768a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(rq.e eVar) {
        super(3);
        this.f51768a = eVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        r0.a0 LabelCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            float f11 = 12;
            androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, f11), s2.b.a(this.f51768a.a(), aVar2), x0.h.b(f11)), aVar2, 0);
        }
        return nm0.y.f85009a;
    }
}

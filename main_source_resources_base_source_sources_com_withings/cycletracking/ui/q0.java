package com.withings.cycletracking.ui;

import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.runtime.a;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35731a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(CycleTrackingActivity cycleTrackingActivity) {
        super(2);
        this.f35731a = cycleTrackingActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, true, aVar2, 6);
            aVar2.s(-1180311131);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = new xb.b(f11);
                aVar2.n(t11);
            }
            xb.b bVar = (xb.b) t11;
            aVar2.J();
            c11.D().b(bVar);
            CycleTrackingActivity cycleTrackingActivity = this.f35731a;
            xb.a.a(bVar, androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), wk.h.d(), 0.0f, 0L, 0L, 0L, s1.b.b(aVar2, -833619302, new o0(c11, cycleTrackingActivity, new p0(c11, cycleTrackingActivity))), aVar2, 12582968, 120);
        }
        return nm0.y.f85009a;
    }
}

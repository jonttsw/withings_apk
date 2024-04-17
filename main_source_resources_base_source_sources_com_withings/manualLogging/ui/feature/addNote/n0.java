package com.withings.manualLogging.ui.feature.addNote;

import androidx.compose.runtime.a;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f41532a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k1 k1Var, AddManualLogActivity addManualLogActivity) {
        super(2);
        this.f41532a = k1Var;
        this.f41533b = addManualLogActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            k1 k1Var = this.f41532a;
            if (((String) t1.d.a(k1Var.G0(), aVar2).getValue()) != null) {
                aVar2.s(-1544406227);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                    aVar2.n(t11);
                }
                k1.r0 r0Var = (k1.r0) t11;
                aVar2.J();
                androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                s1.a aVar3 = t1.f41589a;
                aVar2.s(-1544405418);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = new m0(r0Var);
                    aVar2.n(t12);
                }
                aVar2.J();
                com.withings.common.compose.component.o.o(h11, aVar3, "Patient id", null, null, false, false, true, null, null, null, (ym0.a) t12, t1.f41590b, aVar2, 12583344, 432, 1912);
                AddManualLogActivity.z3(this.f41533b, r0Var, k1Var, aVar2, 582);
            }
        }
        return nm0.y.f85009a;
    }
}

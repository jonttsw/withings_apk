package com.withings.nervehealth.ui;

import android.content.Context;
import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.u0;
import com.withings.nervehealth.core.model.MeasureCategory;
import java.util.List;
import k1.o1;
import k1.r0;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42813a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(NerveHealthActivity nerveHealthActivity) {
        super(2);
        this.f42813a = nerveHealthActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        StateFlow stateFlow;
        NerveHealthViewModel K3;
        NerveHealthViewModel K32;
        NerveHealthViewModel K33;
        NerveHealthViewModel K34;
        NerveHealthViewModel K35;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Context context = (Context) aVar2.D(u0.d());
            aVar2.s(1681683014);
            Object t11 = aVar2.t();
            a.C0060a.C0061a a11 = a.C0060a.a();
            NerveHealthActivity nerveHealthActivity = this.f42813a;
            if (t11 == a11) {
                K35 = nerveHealthActivity.K3();
                t11 = K35.Y0();
                aVar2.n(t11);
            }
            String str = (String) t11;
            aVar2.J();
            stateFlow = nerveHealthActivity.f42367p;
            if (stateFlow != null) {
                r0 c11 = h6.b.c(stateFlow, aVar2);
                K3 = nerveHealthActivity.K3();
                r0 a12 = h6.b.a(K3.G0(), kotlin.collections.i0.f76187a, aVar2, 56);
                aVar2.s(1681683273);
                boolean K = aVar2.K((List) a12.getValue());
                Object t12 = aVar2.t();
                if (K || t12 == a.C0060a.a()) {
                    t12 = androidx.compose.runtime.l0.e(new u(a12));
                    aVar2.n(t12);
                }
                aVar2.J();
                K32 = nerveHealthActivity.K3();
                String u11 = ay.b.u(K32.Z0(), aVar2);
                MeasureCategory A3 = NerveHealthActivity.A3(nerveHealthActivity);
                androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
                p00.c cVar = (p00.c) c11.getValue();
                ys.d B3 = NerveHealthActivity.B3(nerveHealthActivity);
                K33 = nerveHealthActivity.K3();
                m mVar = new m(K33);
                K34 = nerveHealthActivity.K3();
                m00.p.b(A3, u11, B3, cVar, d11, new o(nerveHealthActivity), new p(nerveHealthActivity, context), new q(nerveHealthActivity, (o1) t12), new r(str, nerveHealthActivity, context), new s(nerveHealthActivity, context), new t(nerveHealthActivity, context), mVar, new n(K34), aVar2, 25088, 0, 0);
            } else {
                kotlin.jvm.internal.u.s("uiStateFlow");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
import androidx.compose.ui.e;
import com.withings.wiscale2.C1987R;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class p8 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t5 f51644a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(t5 t5Var, ym0.a<nm0.y> aVar) {
        super(3);
        this.f51644a = t5Var;
        this.f51645b = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        s5 s5Var;
        String u11;
        r0.h GuidedPresentation = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.a.d(null, ay.b.u(C1987R.string.wbs08Rx_usOnboarding_stateSelection_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.q()), aVar2);
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
            String u12 = ay.b.u(C1987R.string.state, aVar2);
            t5 t5Var = this.f51644a;
            String str = null;
            if (t5Var instanceof s5) {
                s5Var = (s5) t5Var;
            } else {
                s5Var = null;
            }
            aVar2.s(-1365496220);
            if (s5Var == null) {
                u11 = null;
            } else {
                u11 = ay.b.u(C1987R.string.hwa09_usOnboarding_stateSelection_error, aVar2);
            }
            aVar2.J();
            aVar2.s(-1365496097);
            if (t5Var != null) {
                str = a3.g.u(t5Var, (Context) aVar2.D(androidx.compose.ui.platform.u0.d()));
            }
            aVar2.J();
            aVar2.s(-1365496112);
            if (str == null) {
                str = ay.b.u(C1987R.string.hwa09_usOnboarding_stateChoice_placeholder, aVar2);
            }
            aVar2.J();
            fk.o.a(e11, u12, str, null, u11, false, this.f51645b, 0, null, aVar2, 6, HttpStatus.SC_FAILED_DEPENDENCY);
        }
        return nm0.y.f85009a;
    }
}

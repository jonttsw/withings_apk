package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.ui.node.g;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class ab extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51185a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51186b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51185a = wBS08EcgActivationActivity;
        this.f51186b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        r0.h bottomSheet = hVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(it, "it");
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51185a;
        R3 = wBS08EcgActivationActivity.R3();
        k1.r0 b10 = t1.d.b(R3.e1(), kotlin.collections.i0.f76187a, aVar2);
        if (!((List) b10.getValue()).isEmpty()) {
            aVar2.s(433076914);
            s0.a.a(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), null, null, false, null, null, null, false, new za(b10, wBS08EcgActivationActivity, this.f51186b), aVar2, 6, ConstantsWs.WS_STATUS_NOREPOUSER);
            aVar2.J();
        } else {
            aVar2.s(433077786);
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
            androidx.compose.ui.layout.l0 b11 = androidx.compose.material.n3.b(aVar2, 733328855, false, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a11);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, b11, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                androidx.compose.material.f5.b(0.0f, 0, 0, 31, 0L, 0L, aVar2, null);
                aVar2.J();
                aVar2.o();
                aVar2.J();
                aVar2.J();
                aVar2.J();
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

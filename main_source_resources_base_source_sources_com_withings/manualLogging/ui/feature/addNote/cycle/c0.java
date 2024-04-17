package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.ui.node.g;
import com.withings.common.compose.component.text.HeaderStyle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f40945a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40946b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(String str, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
        super(2);
        this.f40945a = str;
        this.f40946b = pVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
            int i11 = androidx.compose.foundation.layout.e.f4229i;
            androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
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
                ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                String upperCase = ay.b.u(C1987R.string.tutorials_section_tutorials_required, aVar2).toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                nk.a0.d(null, upperCase, HeaderStyle.f34761e, null, s2.b.a(C1987R.color.statusInfo, aVar2), 0, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 41);
                nk.o0.a(ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1, aVar2, null, this.f40945a, null);
                androidx.compose.material.l3.b(this.f40946b, aVar2, 0);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

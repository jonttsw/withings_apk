package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.p4;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import java.util.List;
import k1.j1;
import k1.v0;
/* compiled from: CartridgeMetadataScreen.kt */
/* loaded from: classes5.dex */
final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<nm0.j<String, String>> f55172a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<nm0.j<String, String>> list) {
        super(2);
        this.f55172a = list;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int i11 = 2;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-483455358);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a12);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                aVar2.s(-484701313);
                List<nm0.j<String, String>> list = this.f55172a;
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        nm0.j jVar = (nm0.j) obj;
                        int i14 = i12;
                        List<nm0.j<String, String>> list2 = list;
                        int i15 = i11;
                        androidx.compose.runtime.a aVar4 = aVar2;
                        com.withings.common.compose.component.o.o(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, i11), null, (String) jVar.c(), null, (String) jVar.d(), false, false, false, null, null, null, null, null, aVar2, 0, 0, 8170);
                        aVar4.s(-2077216653);
                        if (i14 != kotlin.collections.x.M(list2)) {
                            p4.a(null, 0.0f, 0L, aVar4, 0, 7);
                        }
                        aVar4.J();
                        aVar2 = aVar4;
                        i12 = i13;
                        list = list2;
                        i11 = i15;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
                androidx.compose.material.v.b(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

package com.withings.device.details;

import android.content.Context;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.c5;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.u0;
import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.o1;
import k1.r0;
import k1.v0;
import kotlinx.coroutines.CoroutineScope;
import n0.y0;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f37049a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<Boolean> f37050b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f37051c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f37052d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c5 f37053e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h hVar, r0 r0Var, r0 r0Var2, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f37049a = hVar;
        this.f37050b = r0Var;
        this.f37051c = r0Var2;
        this.f37052d = coroutineScope;
        this.f37053e = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e p11 = ah.k.p(y0.c(aVar3, y0.b(aVar2), false, 14));
            aVar2.s(-483455358);
            l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(p11);
            gl.a0 a0Var = null;
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
                r0.i iVar = r0.i.f94242a;
                h hVar = this.f37049a;
                hVar.s1(iVar, aVar2, 70);
                aVar2.s(316618514);
                fl.o B1 = hVar.B1();
                if (B1 instanceof gl.a0) {
                    a0Var = (gl.a0) B1;
                }
                if ((a0Var == null || a0Var.i()) && !this.f37050b.getValue().booleanValue()) {
                    com.withings.common.compose.component.l.a(x0.j(x0.h(aVar3, yk.h.o(), 0.0f, 2), 0.0f, 0.0f, 0.0f, yk.h.q(), 7), ay.b.u(C1987R.string.device_dissociation_title, aVar2), null, false, ColorStyle.f33323b, null, this.f37051c.getValue().booleanValue(), new u(this.f37053e, this.f37052d), aVar2, 24576, 44);
                }
                aVar2.J();
                aVar2.s(116071114);
                if (hVar.C1()) {
                    nn.j.a(hVar.A1(), new v(hVar, (Context) aVar2.D(u0.d())), aVar2, 8);
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

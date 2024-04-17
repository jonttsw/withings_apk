package com.withings.common.compose.component;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.l2;
import x1.b;
import x1.d;
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
final class m extends kotlin.jvm.internal.w implements ym0.q<Boolean, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0.a0 f34054a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.o1<d2.f0> f34055b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f34056c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r0.a0 a0Var, k1.o1<d2.f0> o1Var, String str) {
        super(3);
        this.f34054a = a0Var;
        this.f34055b = o1Var;
        this.f34056c = str;
    }

    @Override // ym0.q
    public final nm0.y invoke(Boolean bool, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        boolean booleanValue = bool.booleanValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 14) == 0) {
            if (aVar2.a(booleanValue)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            k1.o1<d2.f0> o1Var = this.f34055b;
            if (booleanValue) {
                aVar2.s(1930389348);
                int i12 = l.f33989d;
                y2.a(this.f34054a, o1Var.getValue().t(), aVar2, 0);
                aVar2.J();
            } else {
                aVar2.s(1930389544);
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
                d.b i13 = b.a.i();
                e.f e12 = androidx.compose.foundation.layout.e.e();
                aVar2.s(693286680);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.c1.a(e12, i13, aVar2);
                aVar2.s(-1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    int i14 = l.f33989d;
                    l.f(this.f34056c, o1Var.getValue().t(), null, 5, ButtonSize.f33302d.a(), aVar2, 24576, 4);
                    l.k(new l2.a(f1.h.a()), o1Var.getValue().t(), aVar2, 0);
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
        }
        return nm0.y.f85009a;
    }
}

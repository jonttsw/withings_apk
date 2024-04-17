package com.withings.common.compose.component;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.library.authentication.api.ConstantsWs;
import x1.b;
import x1.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.q<Boolean, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0.a0 f33907a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f33908b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l2 f33909c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f33910d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f33911e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ButtonSize f33912f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r0.a0 a0Var, long j5, l2 l2Var, String str, int i11, ButtonSize buttonSize) {
        super(3);
        this.f33907a = a0Var;
        this.f33908b = j5;
        this.f33909c = l2Var;
        this.f33910d = str;
        this.f33911e = i11;
        this.f33912f = buttonSize;
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
            r0.a0 a0Var = this.f33907a;
            if (booleanValue) {
                aVar2.s(-2030131416);
                y2.a(a0Var, this.f33908b, aVar2, 0);
                aVar2.J();
            } else {
                aVar2.s(-2030131339);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e b10 = a0Var.b(aVar3, 1.0f, true);
                d.b i12 = b.a.i();
                int i13 = androidx.compose.foundation.layout.e.f4229i;
                e.h p11 = androidx.compose.foundation.layout.e.p(yk.h.d(), b.a.g());
                aVar2.s(693286680);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.c1.a(p11, i12, aVar2);
                aVar2.s(-1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(b10);
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
                    aVar2.s(-1279980940);
                    l2 l2Var = this.f33909c;
                    long j5 = this.f33908b;
                    if (l2Var != null) {
                        l.k(l2Var, j5, aVar2, 0);
                    }
                    aVar2.J();
                    l.f(this.f33910d, j5, androidx.compose.foundation.layout.e1.u(aVar3, null, 3), this.f33911e, this.f33912f.a(), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0);
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

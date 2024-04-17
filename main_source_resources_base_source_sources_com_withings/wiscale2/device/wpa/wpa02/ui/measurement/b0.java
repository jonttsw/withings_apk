package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.b2;
import androidx.compose.material.c5;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<ne0.c> f55524a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f55525b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f55526c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c5 c5Var, r0 r0Var, CoroutineScope coroutineScope) {
        super(2);
        this.f55524a = r0Var;
        this.f55525b = coroutineScope;
        this.f55526c = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        String str;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-483455358);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
            String str2 = null;
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
                c11.invoke(j1.a(aVar2), aVar2, 0);
                aVar2.s(2058660585);
                androidx.compose.ui.e g11 = x0.g(aVar3, yk.h.o(), yk.h.q());
                Wpa02LaunchMeasurementActivity.b bVar = Wpa02LaunchMeasurementActivity.f55468g;
                ne0.c value = this.f55524a.getValue();
                aVar2.s(-264280385);
                if (value != null) {
                    str2 = ay.b.u(value.b(), aVar2);
                }
                aVar2.J();
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                nk.a.g(0, 0, 0, 60, 0L, aVar2, g11, null, str);
                r0.d0.a(e1.f(aVar3, yk.h.c()), aVar2);
                b2.a(0.0f, 0.0f, 0, 15, 0L, aVar2, null);
                r0.d0.a(e1.f(aVar3, yk.h.c()), aVar2);
                com.withings.common.compose.component.l.a(x0.g(aVar3, yk.h.o(), yk.h.c()), "Done*", null, false, null, null, false, new a0(this.f55526c, this.f55525b), aVar2, 48, 124);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.device.common.notifications.ui;

import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.v4;
import com.withings.wiscale2.C1987R;
import x1.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f52933a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(ym0.l<? super Boolean, nm0.y> lVar) {
        super(2);
        this.f52933a = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-483455358);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
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
                c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                aVar2.s(2058660585);
                v4.d(androidx.compose.foundation.layout.x0.h(aVar3, 0.0f, yk.h.q(), 1), ay.b.u(C1987R.string.hwa03Notification_applications, aVar2), ay.b.u(C1987R.string.notifications_applications_description, aVar2), 0.0f, 0.0f, 0, 0, aVar2, 0, 120);
                androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), yk.h.o(), 0.0f, 2), 0.0f, 0.0f, 0.0f, yk.h.b(), 7);
                e.h p11 = androidx.compose.foundation.layout.e.p(yk.h.c(), b.a.g());
                aVar2.s(693286680);
                androidx.compose.ui.layout.l0 a13 = androidx.compose.foundation.layout.c1.a(p11, b.a.l(), aVar2);
                aVar2.s(-1323940314);
                int G2 = aVar2.G();
                k1.v0 l6 = aVar2.l();
                ym0.a a14 = g.a.a();
                s1.a c13 = androidx.compose.ui.layout.y.c(j5);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a14);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c14 = com.google.protobuf.t.c(aVar2, a13, aVar2, l6);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                        l0.q.a(G2, aVar2, G2, c14);
                    }
                    l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                    String u11 = ay.b.u(C1987R.string.disable_all, aVar2);
                    ButtonSize buttonSize = ButtonSize.f33304f;
                    aVar2.s(453763053);
                    ym0.l<Boolean, nm0.y> lVar = this.f52933a;
                    boolean K = aVar2.K(lVar);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new i(lVar);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    com.withings.common.compose.component.l.c(null, u11, null, false, null, buttonSize, false, (ym0.a) t11, aVar2, 196608, 93);
                    String u12 = ay.b.u(C1987R.string.enable_all, aVar2);
                    aVar2.s(453763310);
                    boolean K2 = aVar2.K(lVar);
                    Object t12 = aVar2.t();
                    if (K2 || t12 == a.C0060a.a()) {
                        t12 = new j(lVar);
                        aVar2.n(t12);
                    }
                    aVar2.J();
                    com.withings.common.compose.component.l.c(null, u12, null, false, null, buttonSize, false, (ym0.a) t12, aVar2, 196608, 93);
                    androidx.compose.material3.d.b(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

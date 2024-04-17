package com.withings.notifications.ui;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e1;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.o1;
import x1.b;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Float> f42857a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42858b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(o1<Float> o1Var, ym0.a<nm0.y> aVar) {
        super(3);
        this.f42857a = o1Var;
        this.f42858b = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 14) == 0) {
            if (aVar2.K(item)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e b10 = s0.b.b(item, bj0.d.c(androidx.compose.foundation.layout.x0.j(e1.e(androidx.compose.ui.e.f8927a, 1.0f), 0.0f, yk.h.B(), 0.0f, 0.0f, 13), this.f42857a.getValue().floatValue()));
            androidx.compose.ui.layout.l0 a11 = androidx.activity.a0.a(aVar2, 693286680, b.a.i(), aVar2, -1323940314);
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
                l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                String u11 = ay.b.u(C1987R.string.notificationStack_unread, aVar2);
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    nk.a0.f(0, 0, 28, 0L, aVar2, new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), null, u11);
                    z.b(this.f42858b, aVar2, 0);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                } else {
                    throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

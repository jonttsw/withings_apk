package com.withings.wiscale2.device.common.notifications.ui;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.f5;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.wiscale2.device.common.notifications.ui.l1;
import java.util.List;
import k1.o1;
import x1.b;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52997a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f52998b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<l1> f52999c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o1<List<Short>> f53000d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o1<List<String>> f53001e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0(m mVar, f1 f1Var, o1<? extends l1> o1Var, o1<? extends List<Short>> o1Var2, o1<? extends List<String>> o1Var3) {
        super(2);
        this.f52997a = mVar;
        this.f52998b = f1Var;
        this.f52999c = o1Var;
        this.f53000d = o1Var2;
        this.f53001e = o1Var3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a);
            int i11 = r0.h0.f94240a;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.x0.e(d11, r0.l0.d(r0.t0.a(aVar2), aVar2));
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
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
                o1<l1> o1Var = this.f52999c;
                l1 value = o1Var.getValue();
                boolean e12 = kotlin.jvm.internal.u.e(value, l1.b.f52946a);
                m mVar = this.f52997a;
                if (e12) {
                    aVar2.s(1779705712);
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        f5.b(0.0f, 0, 0, 30, 0L, 0L, aVar2, new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), false).n(new HorizontalAlignElement(b.a.g())));
                        aVar2.J();
                    } else {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                } else if (value instanceof l1.a) {
                    aVar2.s(1779706017);
                    l1 value2 = o1Var.getValue();
                    kotlin.jvm.internal.u.h(value2, "null cannot be cast to non-null type com.withings.wiscale2.device.common.notifications.ui.ScreenState.DisplayState");
                    m.A1(mVar, this.f52998b, (l1.a) value2, this.f53000d.getValue(), this.f53001e.getValue(), aVar2, 37448);
                    aVar2.J();
                } else {
                    aVar2.s(1779706407);
                    aVar2.J();
                }
                m.x1(mVar, aVar2, 8);
                aVar2.J();
                aVar2.o();
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

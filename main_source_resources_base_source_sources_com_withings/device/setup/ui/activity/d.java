package com.withings.device.setup.ui.activity;

import ah.o;
import androidx.compose.material3.g9;
import androidx.compose.material3.ga;
import androidx.compose.material3.r0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.library.authentication.api.ConstantsWs;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: InitScreen.kt */
/* loaded from: classes3.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, y> f37512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37513b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, ym0.l lVar) {
            super(0);
            this.f37512a = lVar;
            this.f37513b = i11;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f37512a.invoke(Integer.valueOf(this.f37513b));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f37514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, y> f37515b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, int i12, ym0.l lVar) {
            super(2);
            this.f37514a = i11;
            this.f37515b = lVar;
            this.f37516c = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f37516c | 1);
            d.a(this.f37514a, this.f37515b, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(int i11, ym0.l<? super Integer, y> onNext, androidx.compose.runtime.a aVar, int i12) {
        int i13;
        boolean z5;
        int i14;
        int i15;
        u.j(onNext, "onNext");
        androidx.compose.runtime.b g11 = aVar.g(-1486697168);
        if ((i12 & 14) == 0) {
            if (g11.c(i11)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (g11.w(onNext)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        int i16 = i13;
        if ((i16 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            g11.s(-483455358);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                boolean z11 = false;
                c11.invoke(j1.a(g11), g11, 0);
                g11.s(2058660585);
                ga.b(android.support.v4.media.a.a("Searching device type ", i11), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, g11, 0, 0, 131070);
                g11.s(-135328410);
                if ((i16 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i16 & 14) == 4) {
                    z11 = true;
                }
                boolean z12 = z5 | z11;
                Object t11 = g11.t();
                if (z12 || t11 == a.C0060a.a()) {
                    t11 = new a(i11, onNext);
                    g11.n(t11);
                }
                g11.J();
                r0.a((ym0.a) t11, null, false, null, null, null, null, null, null, com.withings.device.setup.ui.activity.b.f37509a, g11, 805306368, ConstantsWs.WS_STATUS_ERROR_ARRAY_WAM);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11, i12, onNext));
        }
    }
}

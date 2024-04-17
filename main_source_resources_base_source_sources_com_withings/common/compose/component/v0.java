package com.withings.common.compose.component;

import androidx.compose.material3.g9;
import androidx.compose.ui.node.g;
/* compiled from: Divider.kt */
/* loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Divider.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34824a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f34824a = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            v0.a(aVar, ah.o.g(this.f34824a | 1));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Divider.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f34825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34827c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f11, int i11, int i12) {
            super(2);
            this.f34825a = f11;
            this.f34826b = i11;
            this.f34827c = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34826b | 1);
            int i11 = this.f34827c;
            v0.b(this.f34825a, aVar, g11, i11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-618557308);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                androidx.compose.material3.p4.a(null, 0.0f, l1.a.a(g11, (yk.w) androidx.appcompat.app.h.b(g11, 615317871)), g11, 0, 3);
                androidx.compose.material3.p4.a(null, 11, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), g11, 48, 1);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(i11));
        }
    }

    public static final void b(float f11, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(238489736);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.b(f11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            if (i15 != 0) {
                f11 = 0;
            }
            androidx.compose.material3.p4.a(androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), f11, 0.0f, 2), 0.0f, l1.a.a(g11, (yk.w) androidx.appcompat.app.h.b(g11, 615317871)), g11, 0, 2);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(f11, i11, i12));
        }
    }
}

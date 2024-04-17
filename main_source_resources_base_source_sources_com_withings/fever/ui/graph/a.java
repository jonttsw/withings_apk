package com.withings.fever.ui.graph;

import ah.o;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.r3;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.n1;
import as.h;
import com.withings.fever.ui.graph.TemperatureDotItemStyle;
import com.withings.fever.ui.r0;
import com.withings.library.authentication.api.ConstantsWs;
import d2.h1;
import dq.x;
import h1.q;
import k1.j1;
import k1.v0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import m0.k;
import m0.k0;
import m0.m;
import nm0.y;
import q0.n;
import x1.b;
import ym0.l;
import ym0.p;
/* compiled from: BodyTemperatureGraphDot.kt */
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureGraphDot.kt */
    /* renamed from: com.withings.fever.ui.graph.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0510a extends w implements l<f2.f, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f39255a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0510a(long j5) {
            super(1);
            this.f39255a = j5;
        }

        @Override // ym0.l
        public final y invoke(f2.f fVar) {
            f2.f Canvas = fVar;
            u.j(Canvas, "$this$Canvas");
            f2.f.e1(Canvas, this.f39255a, 0.0f, 0L, null, 126);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureGraphDot.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f39256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f39257b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f39258c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f39259d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r0.c cVar, float f11, float f12, int i11) {
            super(2);
            this.f39256a = cVar;
            this.f39257b = f11;
            this.f39258c = f12;
            this.f39259d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f39259d | 1);
            float f11 = this.f39257b;
            float f12 = this.f39258c;
            a.a(this.f39256a, f11, f12, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureGraphDot.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f39260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f39261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f39262c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TemperatureDotItemStyle f39263d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f39264e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f39265f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f39266g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f39267h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, h hVar, boolean z5, TemperatureDotItemStyle temperatureDotItemStyle, float f11, ym0.a<y> aVar, int i11, int i12) {
            super(2);
            this.f39260a = eVar;
            this.f39261b = hVar;
            this.f39262c = z5;
            this.f39263d = temperatureDotItemStyle;
            this.f39264e = f11;
            this.f39265f = aVar;
            this.f39266g = i11;
            this.f39267h = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f39266g | 1);
            float f11 = this.f39264e;
            ym0.a<y> aVar2 = this.f39265f;
            a.b(this.f39260a, this.f39261b, this.f39262c, this.f39263d, f11, aVar2, aVar, g11, this.f39267h);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureGraphDot.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.graph.BodyTemperatureGraphDotKt$LoadingDotItem$1", f = "BodyTemperatureGraphDot.kt", l = {104, 105}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0.b<Float, m> f39270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, m0.b<Float, m> bVar, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f39269b = i11;
            this.f39270c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f39269b, this.f39270c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f39268a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                this.f39268a = 1;
                if (DelayKt.delay(this.f39269b, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Float f11 = new Float(0.2f);
            k0 a11 = k.a(k.d(600, 0, null, 6), RepeatMode.f3711b, 4);
            this.f39268a = 2;
            if (m0.b.f(this.f39270c, f11, a11, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureGraphDot.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f39271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f39272b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39273c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f39274d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h hVar, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f39271a = hVar;
            this.f39272b = eVar;
            this.f39273c = i11;
            this.f39274d = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f39274d | 1);
            androidx.compose.ui.e eVar = this.f39272b;
            int i11 = this.f39273c;
            a.c(this.f39271a, eVar, i11, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyTemperatureGraphDot.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f39275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f39276b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f39277c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f39278d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f39279e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TemperatureDotItemStyle f39280f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f39281g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f39282h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f39283i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.e eVar, h hVar, boolean z5, ym0.a<y> aVar, float f11, TemperatureDotItemStyle temperatureDotItemStyle, boolean z11, int i11, int i12) {
            super(2);
            this.f39275a = eVar;
            this.f39276b = hVar;
            this.f39277c = z5;
            this.f39278d = aVar;
            this.f39279e = f11;
            this.f39280f = temperatureDotItemStyle;
            this.f39281g = z11;
            this.f39282h = i11;
            this.f39283i = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f39282h | 1);
            TemperatureDotItemStyle temperatureDotItemStyle = this.f39280f;
            boolean z5 = this.f39281g;
            a.d(this.f39275a, this.f39276b, this.f39277c, this.f39278d, this.f39279e, temperatureDotItemStyle, z5, aVar, g11, this.f39283i);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(r0.c cVar, float f11, float f12, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar.g(-1616676102);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.b(f11)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.b(f12)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            long b10 = com.google.android.gms.internal.mlkit_vision_common.a.b(g11, (yk.w) androidx.appcompat.app.h.b(g11, 615317871));
            androidx.compose.ui.e g12 = cVar.g(ah.k.r(e1.n(x0.j(androidx.compose.ui.e.f8927a, 0.0f, 0.0f, 0.0f, yk.h.a(), 7), f12), f11), b.a.b());
            g11.s(-1161384143);
            boolean d11 = g11.d(b10);
            Object t11 = g11.t();
            if (d11 || t11 == a.C0060a.a()) {
                t11 = new C0510a(b10);
                g11.n(t11);
            }
            g11.J();
            n0.p.a(g12, (l) t11, g11, 0);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(cVar, f11, f12, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, h item, boolean z5, TemperatureDotItemStyle temperatureDotItemStyle, float f11, ym0.a<y> onClickDetected, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        TemperatureDotItemStyle temperatureDotItemStyle2;
        androidx.compose.ui.e b10;
        u.j(item, "item");
        u.j(onClickDetected, "onClickDetected");
        androidx.compose.runtime.b g11 = aVar.g(-1362936943);
        if ((i12 & 1) != 0) {
            eVar2 = androidx.compose.ui.e.f8927a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 8) != 0) {
            temperatureDotItemStyle2 = TemperatureDotItemStyle.f39243c;
        } else {
            temperatureDotItemStyle2 = temperatureDotItemStyle;
        }
        b10 = androidx.compose.foundation.c.b(e1.n(w0.a(androidx.collection.c.g(eVar2, x0.h.e()), 1.0f), yk.h.u()), s2.b.a(r0.a(item.b()), g11), h1.a());
        h1.e c11 = q.c(false, 0.0f, s2.b.a(r0.a(item.b()), g11), g11, 0, 3);
        g11.s(-1881997931);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = n.a();
            g11.n(t11);
        }
        g11.J();
        androidx.compose.ui.e a11 = androidx.compose.foundation.h.a(b10, (q0.o) t11, c11, false, null, onClickDetected, 28);
        l0 a12 = r3.a(g11, 733328855, false, g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(a11);
        Object obj = null;
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            p b11 = com.withings.authentication.e.b(g11, a12, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            x.b(0, c12, j1.a(g11), g11, 2058660585);
            androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
            g11.s(234706390);
            if (z5) {
                ((j2.a) g11.D(n1.i())).a(0);
            }
            g11.J();
            TemperatureDotItemStyle.a aVar2 = TemperatureDotItemStyle.f39242b;
            Double d11 = (Double) kotlin.collections.x.U(item.e());
            g11.s(234706611);
            if (d11 != null) {
                obj = jm.a.c((jm.a) g11.D(com.withings.core.ui.b.b()), 71, d11.doubleValue(), 0, 0, 60);
            }
            g11.J();
            if (obj == null) {
                obj = "-";
            }
            aVar2.a(String.valueOf(obj), z5, true, temperatureDotItemStyle2, r0.e(item.b(), g11), g11, ((i11 >> 3) & 112) | 196992 | (i11 & 7168), 0);
            g11.s(-1881997205);
            if (item.c() || item.d()) {
                a(mVar, f11, temperatureDotItemStyle2.a(), g11, ((i11 >> 9) & 112) | 6);
            }
            v a14 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a14 != null) {
                a14.G(new c(eVar2, item, z5, temperatureDotItemStyle2, f11, onClickDetected, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void c(h item, androidx.compose.ui.e modifier, int i11, androidx.compose.runtime.a aVar, int i12) {
        androidx.compose.ui.e b10;
        u.j(item, "item");
        u.j(modifier, "modifier");
        androidx.compose.runtime.b g11 = aVar.g(935332306);
        g11.s(-534619674);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = m0.c.a(1.0f);
            g11.n(t11);
        }
        m0.b bVar = (m0.b) t11;
        g11.J();
        k1.y.f(item.a(), new d(i11, bVar, null), g11);
        long a11 = s2.b.a(r0.c(item.b()), g11);
        b10 = androidx.compose.foundation.c.b(n0.i.c(bj0.d.c(androidx.collection.c.g(modifier, x0.h.e()), ((Number) bVar.l()).floatValue()), yk.h.a(), a11, x0.h.e()), a11, h1.a());
        androidx.compose.foundation.layout.k.a(b10, g11, 0);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(item, modifier, i11, i12));
        }
    }

    public static final void d(androidx.compose.ui.e eVar, h item, boolean z5, ym0.a<y> onClick, float f11, TemperatureDotItemStyle temperatureDotItemStyle, boolean z11, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        boolean z12;
        float f12;
        TemperatureDotItemStyle temperatureDotItemStyle2;
        boolean z13;
        int i13;
        androidx.compose.ui.e b10;
        u.j(item, "item");
        u.j(onClick, "onClick");
        androidx.compose.runtime.b g11 = aVar.g(-1406078423);
        if ((i12 & 1) != 0) {
            eVar2 = androidx.compose.ui.e.f8927a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        } else {
            z12 = z5;
        }
        if ((i12 & 16) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        if ((i12 & 32) != 0) {
            temperatureDotItemStyle2 = TemperatureDotItemStyle.f39244d;
        } else {
            temperatureDotItemStyle2 = temperatureDotItemStyle;
        }
        if ((i12 & 64) != 0) {
            z13 = !item.e().isEmpty();
            i13 = i11 & (-3670017);
        } else {
            z13 = z11;
            i13 = i11;
        }
        androidx.compose.ui.e a11 = w0.a(androidx.collection.c.g(eVar2, x0.h.e()), 1.0f);
        h1.e c11 = q.c(false, 0.0f, s2.b.a(r0.c(item.b()), g11), g11, 0, 3);
        g11.s(-1055415494);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = n.a();
            g11.n(t11);
        }
        g11.J();
        b10 = androidx.compose.foundation.c.b(androidx.compose.foundation.h.a(a11, (q0.o) t11, c11, false, null, onClick, 28), s2.b.a(r0.c(item.b()), g11), h1.a());
        l0 a12 = r3.a(g11, 733328855, false, g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(b10);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            p b11 = com.withings.authentication.e.b(g11, a12, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            x.b(0, c12, j1.a(g11), g11, 2058660585);
            androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
            float f13 = f12;
            TemperatureDotItemStyle.f39242b.a(String.valueOf(item.a().getDayOfMonth()), z12, z13, temperatureDotItemStyle2, r0.e(item.b(), g11), g11, ((i13 >> 3) & 112) | 196608 | ((i13 >> 12) & ConstantsWs.HWFAILURE_ZERO) | ((i13 >> 6) & 7168), 0);
            g11.s(-1055415010);
            if (item.c() || item.d()) {
                a(mVar, f13, TemperatureDotItemStyle.f39244d.a(), g11, ((i13 >> 9) & 112) | 390);
            }
            v a14 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a14 != null) {
                a14.G(new f(eVar2, item, z12, onClick, f13, temperatureDotItemStyle2, z13, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}

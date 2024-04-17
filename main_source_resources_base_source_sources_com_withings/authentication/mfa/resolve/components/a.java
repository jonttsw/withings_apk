package com.withings.authentication.mfa.resolve.components;

import ah.o;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.c1;
import androidx.compose.material.d1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.k4;
import androidx.compose.ui.platform.n1;
import com.google.protobuf.t;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.q;
import l0.r;
import n0.z;
import nk.g0;
import nm0.y;
import wk.c0;
import ym0.p;
/* compiled from: MfaInputCode.kt */
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaInputCode.kt */
    /* renamed from: com.withings.authentication.mfa.resolve.components.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0425a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31980a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0425a(ym0.a<y> aVar) {
            super(0);
            this.f31980a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            ym0.a<y> aVar = this.f31980a;
            if (aVar != null) {
                aVar.invoke();
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaInputCode.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g2.c f31981a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g2.c cVar) {
            super(2);
            this.f31981a = cVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e a11 = w0.a(e1.d(aVar3), 1.0f);
                aVar2.s(733328855);
                l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(a11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c13 = t.c(aVar2, c11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c13);
                    }
                    r.c(0, c12, j1.a(aVar2), aVar2, 2058660585);
                    z.a(this.f31981a, "", e1.d(aVar3), null, null, 0.0f, null, aVar2, 440, 120);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaInputCode.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31982a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2) {
            super(2);
            this.f31982a = str;
            this.f31983b = str2;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, this.f31982a, this.f31983b, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaInputCode.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k4 f31986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f31987d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0<String> f31988e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z5, boolean z11, k4 k4Var, ym0.l<? super String, y> lVar, r0<String> r0Var) {
            super(2);
            this.f31984a = z5;
            this.f31985b = z11;
            this.f31986c = k4Var;
            this.f31987d = lVar;
            this.f31988e = r0Var;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._NEXT_, aVar2);
                boolean z5 = !this.f31984a;
                aVar2.s(1668608746);
                k4 k4Var = this.f31986c;
                boolean K = aVar2.K(k4Var);
                ym0.l<String, y> lVar = this.f31987d;
                boolean K2 = K | aVar2.K(lVar);
                Object t11 = aVar2.t();
                if (K2 || t11 == a.C0060a.a()) {
                    t11 = new com.withings.authentication.mfa.resolve.components.b(k4Var, lVar, this.f31988e);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.l.a(null, u11, null, z5, null, null, this.f31985b, (ym0.a) t11, aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaInputCode.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k4 f31990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31991c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<String> f31992d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z5, k4 k4Var, ym0.a<y> aVar, r0<String> r0Var) {
            super(2);
            this.f31989a = z5;
            this.f31990b = k4Var;
            this.f31991c = aVar;
            this.f31992d = r0Var;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.mfa_login_useAnotherMethodCTA, aVar2);
                boolean z5 = !this.f31989a;
                aVar2.s(1668609074);
                k4 k4Var = this.f31990b;
                boolean K = aVar2.K(k4Var);
                ym0.a<y> aVar3 = this.f31991c;
                boolean K2 = K | aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K2 || t11 == a.C0060a.a()) {
                    t11 = new com.withings.authentication.mfa.resolve.components.c(k4Var, aVar3, this.f31992d);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.l.c(null, u11, null, z5, null, null, false, (ym0.a) t11, aVar2, 0, 117);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaInputCode.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k4 f31995c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f31996d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31997e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31998f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f31999g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ r0<String> f32000h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z5, ym0.a<y> aVar, k4 k4Var, ym0.l<? super String, y> lVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11, r0<String> r0Var) {
            super(3);
            this.f31993a = z5;
            this.f31994b = aVar;
            this.f31995c = k4Var;
            this.f31996d = lVar;
            this.f31997e = aVar2;
            this.f31998f = aVar3;
            this.f31999g = i11;
            this.f32000h = r0Var;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e f11 = x0.f(aVar3, yk.h.d());
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(f11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    InputFieldType inputFieldType = InputFieldType.f33879g;
                    String u11 = ay.b.u(C1987R.string.mfa_confirmationCode_input, aVar2);
                    r0<String> r0Var = this.f32000h;
                    String value = r0Var.getValue();
                    aVar2.s(1962049053);
                    ym0.a<y> aVar4 = this.f31994b;
                    boolean K = aVar2.K(aVar4);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new com.withings.authentication.mfa.resolve.components.d(aVar4);
                        aVar2.n(t11);
                    }
                    ym0.l lVar = (ym0.l) t11;
                    aVar2.J();
                    aVar2.s(1962048766);
                    k4 k4Var = this.f31995c;
                    boolean K2 = aVar2.K(k4Var);
                    ym0.l<String, y> lVar2 = this.f31996d;
                    boolean K3 = K2 | aVar2.K(lVar2);
                    Object t12 = aVar2.t();
                    if (K3 || t12 == a.C0060a.a()) {
                        t12 = new com.withings.authentication.mfa.resolve.components.e(k4Var, lVar2, r0Var);
                        aVar2.n(t12);
                    }
                    ym0.a aVar5 = (ym0.a) t12;
                    aVar2.J();
                    aVar2.s(1962048918);
                    ym0.a<y> aVar6 = this.f31997e;
                    boolean K4 = aVar2.K(aVar6);
                    Object t13 = aVar2.t();
                    if (K4 || t13 == a.C0060a.a()) {
                        t13 = new com.withings.authentication.mfa.resolve.components.f(r0Var, aVar6);
                        aVar2.n(t13);
                    }
                    aVar2.J();
                    fk.q.b(null, inputFieldType, null, u11, value, null, null, null, null, null, null, this.f31993a, null, lVar, 0, null, false, aVar5, (ym0.l) t13, aVar2, 48, 0, 120805);
                    aVar2.s(1962049167);
                    ym0.a<y> aVar7 = this.f31998f;
                    boolean K5 = aVar2.K(aVar7);
                    Object t14 = aVar2.t();
                    if (K5 || t14 == a.C0060a.a()) {
                        t14 = new com.withings.authentication.mfa.resolve.components.g(aVar7);
                        aVar2.n(t14);
                    }
                    aVar2.J();
                    nk.u.c(0, 0, 0, 60, 0L, aVar2, androidx.compose.foundation.h.b(aVar3, false, (ym0.a) t14, 7), g0.a(((c1) aVar2.D(d1.c())).f(), ay.b.u(this.f31999g, aVar2)), null);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaInputCode.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z4 f32001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32002b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32003c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32004d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f32005e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g2.c f32006f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f32007g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f32008h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f32009i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32010j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32011k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32012l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32013m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f32014n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f32015o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f32016p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(z4 z4Var, ym0.a<y> aVar, String str, String str2, int i11, g2.c cVar, boolean z5, boolean z11, boolean z12, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, ym0.a<y> aVar5, ym0.l<? super String, y> lVar, int i12, int i13) {
            super(2);
            this.f32001a = z4Var;
            this.f32002b = aVar;
            this.f32003c = str;
            this.f32004d = str2;
            this.f32005e = i11;
            this.f32006f = cVar;
            this.f32007g = z5;
            this.f32008h = z11;
            this.f32009i = z12;
            this.f32010j = aVar2;
            this.f32011k = aVar3;
            this.f32012l = aVar4;
            this.f32013m = aVar5;
            this.f32014n = lVar;
            this.f32015o = i12;
            this.f32016p = i13;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32015o | 1);
            int g12 = o.g(this.f32016p);
            ym0.a<y> aVar2 = this.f32013m;
            ym0.l<String, y> lVar = this.f32014n;
            a.a(this.f32001a, this.f32002b, this.f32003c, this.f32004d, this.f32005e, this.f32006f, this.f32007g, this.f32008h, this.f32009i, this.f32010j, this.f32011k, this.f32012l, aVar2, lVar, aVar, g11, g12);
            return y.f85009a;
        }
    }

    public static final void a(z4 toastHostState, ym0.a<y> aVar, String title, String subTitle, int i11, g2.c painter, boolean z5, boolean z11, boolean z12, ym0.a<y> onValueChange, ym0.a<y> onFocusChange, ym0.a<y> onLinkClick, ym0.a<y> onSecondaryClick, ym0.l<? super String, y> onConfirmClick, androidx.compose.runtime.a aVar2, int i12, int i13) {
        u.j(toastHostState, "toastHostState");
        u.j(title, "title");
        u.j(subTitle, "subTitle");
        u.j(painter, "painter");
        u.j(onValueChange, "onValueChange");
        u.j(onFocusChange, "onFocusChange");
        u.j(onLinkClick, "onLinkClick");
        u.j(onSecondaryClick, "onSecondaryClick");
        u.j(onConfirmClick, "onConfirmClick");
        androidx.compose.runtime.b g11 = aVar2.g(1355036653);
        k4 k4Var = (k4) g11.D(n1.m());
        g11.s(-1931643649);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        h2.d a11 = f1.b.a();
        if (aVar == null) {
            a11 = null;
        }
        h2.d dVar = a11;
        g11.s(-1931643568);
        boolean z13 = (((i12 & 112) ^ 48) > 32 && g11.K(aVar)) || (i12 & 48) == 32;
        Object t12 = g11.t();
        if (z13 || t12 == a.C0060a.a()) {
            t12 = new C0425a(aVar);
            g11.n(t12);
        }
        g11.J();
        c0.b(null, toastHostState, dVar, (ym0.a) t12, s1.b.b(g11, -523964198, new b(painter)), s1.b.b(g11, 1273486265, new c(title, subTitle)), s1.b.b(g11, -1224030568, new d(z11, z12, k4Var, onConfirmClick, r0Var)), s1.b.b(g11, 573419895, new e(z11, k4Var, onSecondaryClick, r0Var)), 0L, false, null, null, 0.0f, false, s1.b.b(g11, -317935053, new f(z5, onFocusChange, k4Var, onConfirmClick, onValueChange, onLinkClick, i11, r0Var)), g11, ((i12 << 3) & 112) | 14376960, 24576, 16129);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(toastHostState, aVar, title, subTitle, i11, painter, z5, z11, z12, onValueChange, onFocusChange, onLinkClick, onSecondaryClick, onConfirmClick, i12, i13));
        }
    }
}

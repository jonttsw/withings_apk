package com.withings.authentication.mfa.resolve.components;

import ah.o;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.g6;
import androidx.compose.material3.d1;
import androidx.compose.material3.i1;
import androidx.compose.material3.z0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.authentication.mfa.resolve.c;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.v0;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
import k1.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.d0;
import ym0.p;
import ym0.q;
/* compiled from: SelectFactorBottomSheet.kt */
/* loaded from: classes3.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectFactorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32034a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<y> aVar) {
            super(0);
            this.f32034a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f32034a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectFactorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<com.withings.authentication.mfa.resolve.c> f32035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32036b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<com.withings.authentication.mfa.resolve.c, y> f32037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends com.withings.authentication.mfa.resolve.c> list, ym0.a<y> aVar, ym0.l<? super com.withings.authentication.mfa.resolve.c, y> lVar) {
            super(3);
            this.f32035a = list;
            this.f32036b = aVar;
            this.f32037c = lVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            AuthFactorContent authFactorContent;
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(1610781497);
                for (com.withings.authentication.mfa.resolve.c cVar : this.f32035a) {
                    if (u.e(cVar, c.C0424c.f31965a)) {
                        authFactorContent = AuthFactorContent.f31970e;
                    } else if (cVar instanceof c.d) {
                        authFactorContent = AuthFactorContent.f31971f;
                    } else if (cVar instanceof c.b) {
                        authFactorContent = AuthFactorContent.f31972g;
                    } else if (cVar instanceof c.a) {
                        authFactorContent = AuthFactorContent.f31973h;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    k.b(authFactorContent, new l(this.f32037c, cVar), aVar2, 0);
                    v0.b(0.0f, aVar2, 0, 1);
                }
                aVar2.J();
                k.b(AuthFactorContent.f31974i, this.f32036b, aVar2, 6);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectFactorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<com.withings.authentication.mfa.resolve.c> f32038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<com.withings.authentication.mfa.resolve.c, y> f32040c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32041d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32042e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32043f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f32044g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends com.withings.authentication.mfa.resolve.c> list, boolean z5, ym0.l<? super com.withings.authentication.mfa.resolve.c, y> lVar, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f32038a = list;
            this.f32039b = z5;
            this.f32040c = lVar;
            this.f32041d = aVar;
            this.f32042e = aVar2;
            this.f32043f = aVar3;
            this.f32044g = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32044g | 1);
            ym0.a<y> aVar2 = this.f32042e;
            ym0.a<y> aVar3 = this.f32043f;
            k.a(this.f32038a, this.f32039b, this.f32040c, this.f32041d, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(List<? extends com.withings.authentication.mfa.resolve.c> factors, boolean z5, ym0.l<? super com.withings.authentication.mfa.resolve.c, y> onFactorClicked, ym0.a<y> onRecoveryClicked, ym0.a<y> aVar, ym0.a<y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        boolean z11;
        u.j(factors, "factors");
        u.j(onFactorClicked, "onFactorClicked");
        u.j(onRecoveryClicked, "onRecoveryClicked");
        androidx.compose.runtime.b c11 = g6.c(aVar2, "onCancel", aVar3, -1758722731, -483455358);
        e.a aVar4 = androidx.compose.ui.e.f8927a;
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), c11, -1323940314);
        int G = c11.G();
        k1.v0 l5 = c11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(aVar4);
        if (c11.i() instanceof k1.d) {
            c11.A();
            if (c11.e()) {
                c11.F(a11);
            } else {
                c11.m();
            }
            p b11 = com.withings.authentication.e.b(c11, b10, c11, l5);
            if (c11.e() || !u.e(c11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, c11, G, b11);
            }
            androidx.compose.ui.e j5 = x0.j(x0.h(aVar4, og.y.a(0, c12, j1.a(c11), c11, 2058660585), 0.0f, 2), 0.0f, yk.h.b(), 0.0f, yk.h.d(), 5);
            c11.s(-1826330361);
            if ((((i11 & 458752) ^ 196608) > 131072 && c11.K(aVar2)) || (i11 & 196608) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object t11 = c11.t();
            if (z11 || t11 == a.C0060a.a()) {
                t11 = new a(aVar2);
                c11.n(t11);
            }
            c11.J();
            nk.f.c(0, 0, 0, 60, 0L, c11, androidx.compose.foundation.h.b(j5, false, (ym0.a) t11, 7), null, ay.b.u(C1987R.string._CANCEL_, c11));
            v0.b(0.0f, c11, 0, 1);
            d0.a(e1.n(aVar4, yk.h.r()), c11);
            v4.d(null, ay.b.u(C1987R.string.mfa_chooseMethod_title, c11), ay.b.u(C1987R.string.mfa_chooseMethod_description, c11), 0.0f, 0.0f, 0, 0, c11, 0, 121);
            d1.a(x0.f(aVar4, yk.h.d()), null, z0.b(((i1) c11.D(androidx.compose.material3.j1.e())).a(), c11, 0), null, null, s1.b.b(c11, 476103789, new b(factors, onRecoveryClicked, onFactorClicked)), c11, 196608, 26);
            c11.s(-1856251153);
            if (aVar != null) {
                com.withings.common.compose.component.l.a(x0.j(x0.h(aVar4, yk.h.o(), 0.0f, 2), 0.0f, 0.0f, 0.0f, yk.h.d(), 7), ay.b.u(C1987R.string._DECONNECTER_, c11), null, false, ColorStyle.f33323b, null, z5, aVar, c11, ((i11 << 15) & 3670016) | 24576 | ((i11 << 9) & 29360128), 44);
            }
            v a12 = h.a(c11);
            if (a12 != null) {
                a12.G(new c(factors, z5, onFactorClicked, onRecoveryClicked, aVar, aVar2, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void b(AuthFactorContent authFactorContent, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(-824314505);
        if ((i11 & 14) == 0) {
            if (g11.K(authFactorContent)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i15 = i12;
        if ((i15 & 91) == 18 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            bVar = g11;
            com.withings.common.compose.component.o.o(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), s1.b.b(g11, 1766031948, new i(authFactorContent)), ay.b.u(authFactorContent.e(), g11), ay.b.u(authFactorContent.b(), g11), null, false, false, true, null, null, null, aVar, null, bVar, 12582960, i15 & 112, ConstantsWs.WS_STATUS_ERRORAPI);
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new j(authFactorContent, aVar, i11));
        }
    }
}

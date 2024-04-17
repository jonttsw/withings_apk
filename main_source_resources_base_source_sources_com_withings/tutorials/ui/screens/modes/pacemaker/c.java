package com.withings.tutorials.ui.screens.modes.pacemaker;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.g6;
import androidx.compose.material.t5;
import androidx.compose.material.v;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import b70.t0;
import com.google.protobuf.t;
import com.withings.common.compose.component.ColorStyle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import l0.r;
import nk.a0;
import nm0.y;
import r0.d0;
import ym0.p;
import ym0.q;
/* compiled from: PacemakerMode.kt */
@SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f45714a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f45715a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r0<Boolean> r0Var) {
            super(0);
            this.f45715a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f45715a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f45716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PacemakerModeViewModel f45717b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45718c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f45719d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CoroutineScope coroutineScope, PacemakerModeViewModel pacemakerModeViewModel, ym0.a<y> aVar, r0<Boolean> r0Var) {
            super(0);
            this.f45716a = coroutineScope;
            this.f45717b = pacemakerModeViewModel;
            this.f45718c = aVar;
            this.f45719d = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f45716a, null, null, new com.withings.tutorials.ui.screens.modes.pacemaker.d(this.f45717b, this.f45718c, this.f45719d, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* renamed from: com.withings.tutorials.ui.screens.modes.pacemaker.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0630c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PacemakerModeViewModel f45721b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45722c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45723d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45724e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0630c(PacemakerModeViewModel pacemakerModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45721b = pacemakerModeViewModel;
            this.f45722c = aVar;
            this.f45723d = aVar2;
            this.f45724e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45724e | 1);
            ym0.a<y> aVar2 = this.f45722c;
            ym0.a<y> aVar3 = this.f45723d;
            c.this.a(this.f45721b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45725a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a<y> aVar) {
            super(2);
            this.f45725a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.pacemaker_mode_button_enable, aVar2), null, false, ColorStyle.f33322a, null, false, this.f45725a, aVar2, 24576, 109);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45727b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45728c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45729d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45727b = aVar;
            this.f45728c = aVar2;
            this.f45729d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45729d | 1);
            ym0.a<y> aVar2 = this.f45727b;
            ym0.a<y> aVar3 = this.f45728c;
            c.this.b(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45730a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<y> aVar) {
            super(2);
            this.f45730a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.pacemaker_mode_button_disable, aVar2), null, false, ColorStyle.f33323b, null, false, this.f45730a, aVar2, 24576, 109);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45733c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45734d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45732b = aVar;
            this.f45733c = aVar2;
            this.f45734d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45734d | 1);
            ym0.a<y> aVar2 = this.f45732b;
            ym0.a<y> aVar3 = this.f45733c;
            c.this.c(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(3);
            this.f45735a = aVar;
            this.f45736b = aVar2;
        }

        @Override // ym0.q
        public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.w it = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(it, "it");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e g11 = x0.g(aVar3, yk.h.o(), yk.h.B());
                aVar2.s(-483455358);
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(g11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    a0.g(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string.pacemaker_mode_button_disable_confirm, aVar2));
                    d0.a(e1.f(aVar3, yk.h.s()), aVar2);
                    com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_button_yes, aVar2), null, false, ColorStyle.f33323b, null, false, this.f45735a, aVar2, 24576, 109);
                    d0.a(e1.f(aVar3, yk.h.b()), aVar2);
                    com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_button_no, aVar2), null, false, ColorStyle.f33322a, null, false, this.f45736b, aVar2, 24576, 109);
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
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45738b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45739c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45740d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45738b = aVar;
            this.f45739c = aVar2;
            this.f45740d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45740d | 1);
            ym0.a<y> aVar2 = this.f45738b;
            ym0.a<y> aVar3 = this.f45739c;
            c.this.d(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45742b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.a, Integer, y> f45743c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45744d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ym0.a<y> aVar, p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, int i11) {
            super(2);
            this.f45742b = aVar;
            this.f45743c = pVar;
            this.f45744d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45744d | 1);
            ym0.a<y> aVar2 = this.f45742b;
            p<androidx.compose.runtime.a, Integer, y> pVar = this.f45743c;
            c.this.e(aVar2, pVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements p<r8.m, r8.n, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PacemakerModeViewModel f45745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45746b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45747c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r8.n f45748d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(PacemakerModeViewModel pacemakerModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, r8.n nVar) {
            super(2);
            this.f45745a = pacemakerModeViewModel;
            this.f45746b = aVar;
            this.f45747c = aVar2;
            this.f45748d = nVar;
        }

        @Override // ym0.p
        public final y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            u.j(it, "it");
            PacemakerModeViewModel pacemakerModeViewModel = this.f45745a;
            ym0.a<y> aVar = this.f45746b;
            ym0.a<y> aVar2 = this.f45747c;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "activation", null, null, null, null, null, null, new s1.a(true, 1800286322, new com.withings.tutorials.ui.screens.modes.pacemaker.e(pacemakerModeViewModel, aVar, aVar2)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "deactivation", null, null, null, null, null, null, new s1.a(true, -1603658085, new com.withings.tutorials.ui.screens.modes.pacemaker.g(this.f45748d, aVar)), 126);
            xb.i.a(GuidedPresentationTutorialNavHost, "turnOffConfirmationBottomSheet", null, new s1.a(true, -1489332075, new com.withings.tutorials.ui.screens.modes.pacemaker.h(aVar2, aVar)), 6);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PacemakerMode.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PacemakerModeViewModel f45750b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f45751c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45752d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45753e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f45754f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f45755g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(PacemakerModeViewModel pacemakerModeViewModel, r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2, boolean z5, int i11) {
            super(2);
            this.f45750b = pacemakerModeViewModel;
            this.f45751c = nVar;
            this.f45752d = aVar;
            this.f45753e = aVar2;
            this.f45754f = z5;
            this.f45755g = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45755g | 1);
            ym0.a<y> aVar2 = this.f45753e;
            boolean z5 = this.f45754f;
            c.this.f(this.f45750b, this.f45751c, this.f45752d, aVar2, z5, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ym0.a<y> aVar, p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(-1828359382);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            int i15 = i12 << 6;
            t0.c(ay.b.u(C1987R.string.pacemaker_mode_page_title, g11), s2.d.a(2131232243, g11), aVar, pVar, null, 0.0f, null, com.withings.tutorials.ui.screens.modes.pacemaker.a.f45711a, g11, (i15 & ConstantsWs.HWFAILURE_ZERO) | 12582976 | (i15 & 7168), 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(aVar, pVar, i11));
        }
    }

    public final void a(PacemakerModeViewModel viewModel, ym0.a<y> onBackClicked, ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        u.j(viewModel, "viewModel");
        u.j(onBackClicked, "onBackClicked");
        androidx.compose.runtime.b c11 = g6.c(aVar, "onEnabled", aVar2, 1383925747, -1645767661);
        Object t11 = c11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            c11.n(t11);
        }
        r0 r0Var = (r0) t11;
        c11.J();
        boolean booleanValue = ((Boolean) r0Var.getValue()).booleanValue();
        c11.s(-1645767532);
        Object t12 = c11.t();
        if (t12 == a.C0060a.a()) {
            t12 = new a(r0Var);
            c11.n(t12);
        }
        c11.J();
        e70.a.a(booleanValue, onBackClicked, (ym0.a) t12, c11, (i11 & 112) | ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        Object c12 = androidx.compose.material.o.c(c11, 773894976, -492369756);
        if (c12 == a.C0060a.a()) {
            c12 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(c11), c11);
        }
        c11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) c12).a();
        c11.J();
        ym0.a<y> bVar = new b(a11, viewModel, aVar, r0Var);
        int i12 = i11 >> 3;
        b(onBackClicked, bVar, c11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14));
        androidx.compose.runtime.v o02 = c11.o0();
        if (o02 != null) {
            o02.G(new C0630c(viewModel, onBackClicked, aVar, i11));
        }
    }

    public final void b(ym0.a<y> onBackClicked, ym0.a<y> onEnableClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onBackClicked, "onBackClicked");
        u.j(onEnableClicked, "onEnableClicked");
        androidx.compose.runtime.b g11 = aVar.g(2109656399);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onEnableClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            e(onBackClicked, s1.b.b(g11, 2096385548, new d(onEnableClicked)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(onBackClicked, onEnableClicked, i11));
        }
    }

    public final void c(ym0.a<y> onBackClicked, ym0.a<y> onDisableClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onBackClicked, "onBackClicked");
        u.j(onDisableClicked, "onDisableClicked");
        androidx.compose.runtime.b g11 = aVar.g(1926673488);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onDisableClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            e(onBackClicked, s1.b.b(g11, 2058287565, new f(onDisableClicked)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(onBackClicked, onDisableClicked, i11));
        }
    }

    public final void d(ym0.a<y> onConfirm, ym0.a<y> onCancel, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        u.j(onConfirm, "onConfirm");
        u.j(onCancel, "onCancel");
        androidx.compose.runtime.b g11 = aVar.g(1940817573);
        if ((i11 & 14) == 0) {
            if (g11.w(onConfirm)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onCancel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            t5.b(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, -1877505565, new h(onConfirm, onCancel)), g11, 0, 12582912, 131071);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(onConfirm, onCancel, i11));
        }
    }

    public final void f(PacemakerModeViewModel viewModel, r8.n navController, ym0.a<y> onBack, ym0.a<y> onDone, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        String str;
        u.j(viewModel, "viewModel");
        u.j(navController, "navController");
        u.j(onBack, "onBack");
        u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-1994326534);
        if (z5) {
            str = "deactivation";
        } else {
            str = "activation";
        }
        t0.b(navController, str, new k(viewModel, onBack, onDone, navController), g11, 8);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(viewModel, navController, onBack, onDone, z5, i11));
        }
    }
}

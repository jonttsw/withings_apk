package com.withings.tutorials.ui.screens.modes.eyesclosed;

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
/* compiled from: EyesClosedMode.kt */
@SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f45630a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f45631a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r0<Boolean> r0Var) {
            super(0);
            this.f45631a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f45631a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* renamed from: com.withings.tutorials.ui.screens.modes.eyesclosed.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0628b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f45632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EyesClosedModeViewModel f45633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f45635d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0628b(CoroutineScope coroutineScope, EyesClosedModeViewModel eyesClosedModeViewModel, ym0.a<y> aVar, r0<Boolean> r0Var) {
            super(0);
            this.f45632a = coroutineScope;
            this.f45633b = eyesClosedModeViewModel;
            this.f45634c = aVar;
            this.f45635d = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f45632a, null, null, new com.withings.tutorials.ui.screens.modes.eyesclosed.c(this.f45633b, this.f45634c, this.f45635d, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EyesClosedModeViewModel f45637b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45638c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45639d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45640e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EyesClosedModeViewModel eyesClosedModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45637b = eyesClosedModeViewModel;
            this.f45638c = aVar;
            this.f45639d = aVar2;
            this.f45640e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45640e | 1);
            ym0.a<y> aVar2 = this.f45638c;
            ym0.a<y> aVar3 = this.f45639d;
            b.this.a(this.f45637b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45641a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a<y> aVar) {
            super(2);
            this.f45641a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.eyesClosed_mode_page_activation_button, aVar2), null, false, ColorStyle.f33322a, null, false, this.f45641a, aVar2, 24576, 109);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45645d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45643b = aVar;
            this.f45644c = aVar2;
            this.f45645d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45645d | 1);
            ym0.a<y> aVar2 = this.f45643b;
            ym0.a<y> aVar3 = this.f45644c;
            b.this.b(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(3);
            this.f45646a = aVar;
            this.f45647b = aVar2;
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
                    a0.g(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_title, aVar2));
                    d0.a(e1.f(aVar3, yk.h.b()), aVar2);
                    nk.a.d(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                    d0.a(e1.f(aVar3, yk.h.s()), aVar2);
                    com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_button_yes, aVar2), null, false, ColorStyle.f33323b, null, false, this.f45646a, aVar2, 24576, 109);
                    d0.a(e1.f(aVar3, yk.h.b()), aVar2);
                    com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_button_no, aVar2), null, false, ColorStyle.f33322a, null, false, this.f45647b, aVar2, 24576, 109);
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
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45651d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45649b = aVar;
            this.f45650c = aVar2;
            this.f45651d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45651d | 1);
            ym0.a<y> aVar2 = this.f45649b;
            ym0.a<y> aVar3 = this.f45650c;
            b.this.c(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<y> aVar) {
            super(2);
            this.f45652a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_button, aVar2), null, false, ColorStyle.f33323b, null, false, this.f45652a, aVar2, 24576, 109);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45654b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45655c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45656d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45654b = aVar;
            this.f45655c = aVar2;
            this.f45656d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45656d | 1);
            ym0.a<y> aVar2 = this.f45654b;
            ym0.a<y> aVar3 = this.f45655c;
            b.this.d(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45658b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.a, Integer, y> f45659c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45660d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ym0.a<y> aVar, p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, int i11) {
            super(2);
            this.f45658b = aVar;
            this.f45659c = pVar;
            this.f45660d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45660d | 1);
            ym0.a<y> aVar2 = this.f45658b;
            p<androidx.compose.runtime.a, Integer, y> pVar = this.f45659c;
            b.this.e(aVar2, pVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements p<r8.m, r8.n, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EyesClosedModeViewModel f45661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r8.n f45664d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(EyesClosedModeViewModel eyesClosedModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, r8.n nVar) {
            super(2);
            this.f45661a = eyesClosedModeViewModel;
            this.f45662b = aVar;
            this.f45663c = aVar2;
            this.f45664d = nVar;
        }

        @Override // ym0.p
        public final y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            u.j(it, "it");
            EyesClosedModeViewModel eyesClosedModeViewModel = this.f45661a;
            ym0.a<y> aVar = this.f45662b;
            ym0.a<y> aVar2 = this.f45663c;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "activation", null, null, null, null, null, null, new s1.a(true, 2058949918, new com.withings.tutorials.ui.screens.modes.eyesclosed.d(eyesClosedModeViewModel, aVar, aVar2)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "deactivation", null, null, null, null, null, null, new s1.a(true, -965753145, new com.withings.tutorials.ui.screens.modes.eyesclosed.f(this.f45664d, aVar)), 126);
            xb.i.a(GuidedPresentationTutorialNavHost, "turnOffConfirmationBottomSheet", null, new s1.a(true, -1675709503, new com.withings.tutorials.ui.screens.modes.eyesclosed.g(aVar2, aVar)), 6);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EyesClosedMode.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EyesClosedModeViewModel f45666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f45667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45668d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45669e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f45670f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f45671g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(EyesClosedModeViewModel eyesClosedModeViewModel, r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2, boolean z5, int i11) {
            super(2);
            this.f45666b = eyesClosedModeViewModel;
            this.f45667c = nVar;
            this.f45668d = aVar;
            this.f45669e = aVar2;
            this.f45670f = z5;
            this.f45671g = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45671g | 1);
            ym0.a<y> aVar2 = this.f45669e;
            boolean z5 = this.f45670f;
            b.this.f(this.f45666b, this.f45667c, this.f45668d, aVar2, z5, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ym0.a<y> aVar, p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(2117934351);
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
            t0.c(ay.b.u(C1987R.string.eyesClosed_mode_page_title, g11), s2.d.a(2131232242, g11), aVar, pVar, null, 0.0f, null, com.withings.tutorials.ui.screens.modes.eyesclosed.a.f45628a, g11, (i15 & ConstantsWs.HWFAILURE_ZERO) | 12582976 | (i15 & 7168), 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(aVar, pVar, i11));
        }
    }

    public final void a(EyesClosedModeViewModel viewModel, ym0.a<y> onBackClicked, ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        u.j(viewModel, "viewModel");
        u.j(onBackClicked, "onBackClicked");
        androidx.compose.runtime.b c11 = g6.c(aVar, "onEnabled", aVar2, 323756453, -1876798411);
        Object t11 = c11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            c11.n(t11);
        }
        r0 r0Var = (r0) t11;
        c11.J();
        boolean booleanValue = ((Boolean) r0Var.getValue()).booleanValue();
        c11.s(-1876798282);
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
        ym0.a<y> c0628b = new C0628b(a11, viewModel, aVar, r0Var);
        int i12 = i11 >> 3;
        b(onBackClicked, c0628b, c11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14));
        androidx.compose.runtime.v o02 = c11.o0();
        if (o02 != null) {
            o02.G(new c(viewModel, onBackClicked, aVar, i11));
        }
    }

    public final void b(ym0.a<y> onBackClicked, ym0.a<y> onEnabledClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onBackClicked, "onBackClicked");
        u.j(onEnabledClicked, "onEnabledClicked");
        androidx.compose.runtime.b g11 = aVar.g(859747486);
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
            if (g11.w(onEnabledClicked)) {
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
            e(onBackClicked, s1.b.b(g11, 2116295643, new d(onEnabledClicked)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(onBackClicked, onEnabledClicked, i11));
        }
    }

    public final void c(ym0.a<y> onConfirm, ym0.a<y> onCancel, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        u.j(onConfirm, "onConfirm");
        u.j(onCancel, "onCancel");
        androidx.compose.runtime.b g11 = aVar.g(2043614132);
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
            t5.b(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, -1707122762, new f(onConfirm, onCancel)), g11, 0, 12582912, 131071);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(onConfirm, onCancel, i11));
        }
    }

    public final void d(ym0.a<y> onBackClicked, ym0.a<y> onDeactivationClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onBackClicked, "onBackClicked");
        u.j(onDeactivationClicked, "onDeactivationClicked");
        androidx.compose.runtime.b g11 = aVar.g(949765151);
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
            if (g11.w(onDeactivationClicked)) {
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
            e(onBackClicked, s1.b.b(g11, 1606733852, new h(onDeactivationClicked)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(onBackClicked, onDeactivationClicked, i11));
        }
    }

    public final void f(EyesClosedModeViewModel viewModel, r8.n navController, ym0.a<y> onBack, ym0.a<y> onDone, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        String str;
        u.j(viewModel, "viewModel");
        u.j(navController, "navController");
        u.j(onBack, "onBack");
        u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-1344676186);
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

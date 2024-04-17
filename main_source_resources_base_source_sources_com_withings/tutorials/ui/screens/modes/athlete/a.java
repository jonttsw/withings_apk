package com.withings.tutorials.ui.screens.modes.athlete;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.g6;
import androidx.compose.material.t5;
import androidx.compose.material.v;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import b70.t0;
import com.google.protobuf.t;
import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.common.compose.component.ColorStyle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dq.x;
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
import ym0.q;
/* compiled from: AthleteMode.kt */
@SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45543a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* renamed from: com.withings.tutorials.ui.screens.modes.athlete.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0626a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f45544a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0626a(r0<Boolean> r0Var) {
            super(0);
            this.f45544a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f45544a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f45545a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AthleteModeViewModel f45546b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45547c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f45548d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CoroutineScope coroutineScope, AthleteModeViewModel athleteModeViewModel, ym0.a<y> aVar, r0<Boolean> r0Var) {
            super(0);
            this.f45545a = coroutineScope;
            this.f45546b = athleteModeViewModel;
            this.f45547c = aVar;
            this.f45548d = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f45545a, null, null, new com.withings.tutorials.ui.screens.modes.athlete.b(this.f45546b, this.f45547c, this.f45548d, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AthleteModeViewModel f45550b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45551c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45552d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45553e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AthleteModeViewModel athleteModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45550b = athleteModeViewModel;
            this.f45551c = aVar;
            this.f45552d = aVar2;
            this.f45553e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45553e | 1);
            ym0.a<y> aVar2 = this.f45551c;
            ym0.a<y> aVar3 = this.f45552d;
            a.this.a(this.f45550b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45554a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a<y> aVar) {
            super(2);
            this.f45554a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.athlete_mode_page_activation_button, aVar2), null, false, ColorStyle.f33322a, null, false, this.f45554a, aVar2, 24576, 109);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45557c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45558d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45556b = aVar;
            this.f45557c = aVar2;
            this.f45558d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45558d | 1);
            ym0.a<y> aVar2 = this.f45556b;
            ym0.a<y> aVar3 = this.f45557c;
            a.this.b(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(3);
            this.f45559a = aVar;
            this.f45560b = aVar2;
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
                    ym0.p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    a0.g(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string.athlete_mode_page_deactivation_confirm_title, aVar2));
                    d0.a(e1.f(aVar3, yk.h.s()), aVar2);
                    com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_button_yes, aVar2), null, false, ColorStyle.f33323b, null, false, this.f45559a, aVar2, 24576, 109);
                    d0.a(e1.f(aVar3, yk.h.b()), aVar2);
                    com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.eyesClosed_mode_page_deactivation_confirm_button_no, aVar2), null, false, ColorStyle.f33322a, null, false, this.f45560b, aVar2, 24576, 109);
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
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45563c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45564d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45562b = aVar;
            this.f45563c = aVar2;
            this.f45564d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45564d | 1);
            ym0.a<y> aVar2 = this.f45562b;
            ym0.a<y> aVar3 = this.f45563c;
            a.this.c(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45565a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<y> aVar) {
            super(2);
            this.f45565a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.athlete_mode_page_deactivation_button, aVar2), null, false, ColorStyle.f33323b, null, false, this.f45565a, aVar2, 24576, 109);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45567b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45568c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45569d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45567b = aVar;
            this.f45568c = aVar2;
            this.f45569d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45569d | 1);
            ym0.a<y> aVar2 = this.f45567b;
            ym0.a<y> aVar3 = this.f45568c;
            a.this.d(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45571b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, y> f45572c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45573d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ym0.a<y> aVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, int i11) {
            super(2);
            this.f45571b = aVar;
            this.f45572c = pVar;
            this.f45573d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45573d | 1);
            ym0.a<y> aVar2 = this.f45571b;
            ym0.p<androidx.compose.runtime.a, Integer, y> pVar = this.f45572c;
            a.this.e(aVar2, pVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements ym0.p<r8.m, r8.n, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AthleteModeViewModel f45574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45575b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45576c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r8.n f45577d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(AthleteModeViewModel athleteModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, r8.n nVar) {
            super(2);
            this.f45574a = athleteModeViewModel;
            this.f45575b = aVar;
            this.f45576c = aVar2;
            this.f45577d = nVar;
        }

        @Override // ym0.p
        public final y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            u.j(it, "it");
            AthleteModeViewModel athleteModeViewModel = this.f45574a;
            ym0.a<y> aVar = this.f45575b;
            ym0.a<y> aVar2 = this.f45576c;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "activation", null, null, null, null, null, null, new s1.a(true, -561704754, new com.withings.tutorials.ui.screens.modes.athlete.d(athleteModeViewModel, aVar, aVar2)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "deactivation", null, null, null, null, null, null, new s1.a(true, 1958885367, new com.withings.tutorials.ui.screens.modes.athlete.f(this.f45577d, aVar)), 126);
            xb.i.a(GuidedPresentationTutorialNavHost, "turnOffConfirmationBottomSheet", null, new s1.a(true, -880718863, new com.withings.tutorials.ui.screens.modes.athlete.g(aVar2, aVar)), 6);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AthleteModeViewModel f45579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f45580c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45581d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45582e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f45583f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f45584g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(AthleteModeViewModel athleteModeViewModel, r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2, boolean z5, int i11) {
            super(2);
            this.f45579b = athleteModeViewModel;
            this.f45580c = nVar;
            this.f45581d = aVar;
            this.f45582e = aVar2;
            this.f45583f = z5;
            this.f45584g = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45584g | 1);
            ym0.a<y> aVar2 = this.f45582e;
            boolean z5 = this.f45583f;
            a.this.f(this.f45579b, this.f45580c, this.f45581d, aVar2, z5, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ym0.a<y> aVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(-880627496);
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
            t0.c(ay.b.u(C1987R.string.athlete_mode_page_title, g11), s2.d.a(2131232241, g11), aVar, pVar, null, 0.0f, null, o.f45606a, g11, (i15 & ConstantsWs.HWFAILURE_ZERO) | 12582976 | (i15 & 7168), 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(aVar, pVar, i11));
        }
    }

    public static final void g(a aVar, androidx.compose.runtime.a aVar2, int i11) {
        aVar.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(952171509);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e e11 = e1.e(aVar3, 1.0f);
            g11.s(-483455358);
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
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
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                nk.a.d(null, ay.b.u(C1987R.string.res_0x7f14138c_eyesclosed_mode_page_description_22, g11), 0L, null, 0, 0, null, g11, 0, 125);
                d0.a(e1.f(aVar3, yk.h.b()), g11);
                g2.c a12 = s2.d.a(C1987R.drawable.illustration_small_icon_speed, g11);
                String u11 = ay.b.u(C1987R.string.eyesClosed_mode_page_item1, g11);
                CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
                com.withings.common.compose.component.o.q(null, a12, u11, null, false, false, false, null, cellVerticalMargin, g11, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                d0.a(e1.f(aVar3, yk.h.b()), g11);
                com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.illustration_small_icon_heartdown, g11), ay.b.u(C1987R.string.eyesClosed_mode_page_item2, g11), null, false, false, false, null, cellVerticalMargin, g11, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                d0.a(e1.f(aVar3, yk.h.b()), g11);
                nk.a.g(0, 0, 0, 61, 0L, g11, null, null, ay.b.u(C1987R.string.scale_mode_page_note, g11));
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.tutorials.ui.screens.modes.athlete.c(aVar, i11));
        }
    }

    public final void a(AthleteModeViewModel viewModel, ym0.a<y> onBackClicked, ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        u.j(viewModel, "viewModel");
        u.j(onBackClicked, "onBackClicked");
        androidx.compose.runtime.b c11 = g6.c(aVar, "onEnabled", aVar2, -1444565277, 919891426);
        Object t11 = c11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            c11.n(t11);
        }
        r0 r0Var = (r0) t11;
        c11.J();
        boolean booleanValue = ((Boolean) r0Var.getValue()).booleanValue();
        c11.s(919891555);
        Object t12 = c11.t();
        if (t12 == a.C0060a.a()) {
            t12 = new C0626a(r0Var);
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
        androidx.compose.runtime.b g11 = aVar.g(343968873);
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
            e(onBackClicked, s1.b.b(g11, 1888984204, new d(onEnabledClicked)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
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
        androidx.compose.runtime.b g11 = aVar.g(-680346477);
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
            t5.b(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, -1430878639, new f(onConfirm, onCancel)), g11, 0, 12582912, 131071);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(onConfirm, onCancel, i11));
        }
    }

    public final void d(ym0.a<y> onBackClicked, ym0.a<y> onDisableClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onBackClicked, "onBackClicked");
        u.j(onDisableClicked, "onDisableClicked");
        androidx.compose.runtime.b g11 = aVar.g(150493128);
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
            e(onBackClicked, s1.b.b(g11, -1148458197, new h(onDisableClicked)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(onBackClicked, onDisableClicked, i11));
        }
    }

    public final void f(AthleteModeViewModel viewModel, r8.n navController, ym0.a<y> onBack, ym0.a<y> onDone, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        String str;
        u.j(viewModel, "viewModel");
        u.j(navController, "navController");
        u.j(onBack, "onBack");
        u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(597812822);
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

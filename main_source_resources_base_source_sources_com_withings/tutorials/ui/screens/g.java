package com.withings.tutorials.ui.screens;

import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.g6;
import androidx.compose.material3.g9;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.g;
import b70.k0;
import b70.t0;
import com.withings.common.compose.component.p2;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import dq.x;
import k1.j1;
import k1.r0;
import kotlin.NoWhenBranchMatchedException;
import nk.a0;
import nm0.y;
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f45305a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<User.BodyModel, y> f45306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User.BodyModel f45307b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.l<? super User.BodyModel, y> lVar, User.BodyModel bodyModel) {
            super(0);
            this.f45306a = lVar;
            this.f45307b = bodyModel;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f45306a.invoke(this.f45307b);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User.BodyModel f45309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<User.BodyModel, y> f45310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(User.BodyModel bodyModel, ym0.l<? super User.BodyModel, y> lVar, int i11) {
            super(2);
            this.f45309b = bodyModel;
            this.f45310c = lVar;
            this.f45311d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45311d | 1);
            User.BodyModel bodyModel = this.f45309b;
            ym0.l<User.BodyModel, y> lVar = this.f45310c;
            g.this.a(bodyModel, lVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<y> aVar) {
            super(2);
            this.f45312a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, false, null, null, false, this.f45312a, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45314b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45315c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45316d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45314b = aVar;
            this.f45315c = aVar2;
            this.f45316d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45316d | 1);
            ym0.a<y> aVar2 = this.f45314b;
            ym0.a<y> aVar3 = this.f45315c;
            g.this.b(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<User.BodyModel> f45317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<User.BodyModel, y> f45318b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(r0<User.BodyModel> r0Var, ym0.l<? super User.BodyModel, y> lVar) {
            super(2);
            this.f45317a = r0Var;
            this.f45318b = lVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._DONE_, aVar2);
                r0<User.BodyModel> r0Var = this.f45317a;
                if (r0Var.getValue() != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z11 = z5;
                aVar2.s(683226367);
                boolean K = aVar2.K(r0Var);
                ym0.l<User.BodyModel, y> lVar = this.f45318b;
                boolean K2 = K | aVar2.K(lVar);
                Object t11 = aVar2.t();
                if (K2 || t11 == a.C0060a.a()) {
                    t11 = new com.withings.tutorials.ui.screens.h(r0Var, lVar);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.l.a(null, u11, null, z11, null, null, false, (ym0.a) t11, aVar2, 0, 117);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<User.BodyModel> f45319a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(r0<User.BodyModel> r0Var) {
            super(3);
            this.f45319a = r0Var;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(x0.j(androidx.compose.ui.e.f8927a, 0.0f, 0.0f, 0.0f, yk.h.B(), 7), ay.b.u(C1987R.string.segmentalBodyComp_tutorial_chooseModel_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 124);
                g gVar = g.f45305a;
                r0<User.BodyModel> r0Var = this.f45319a;
                User.BodyModel value = r0Var.getValue();
                aVar2.s(683226802);
                boolean K = aVar2.K(r0Var);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new com.withings.tutorials.ui.screens.i(r0Var);
                    aVar2.n(t11);
                }
                aVar2.J();
                gVar.a(value, (ym0.l) t11, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* renamed from: com.withings.tutorials.ui.screens.g$g  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0624g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User.BodyModel f45321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<User.BodyModel, y> f45323d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45324e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0624g(User.BodyModel bodyModel, ym0.a<y> aVar, ym0.l<? super User.BodyModel, y> lVar, int i11) {
            super(2);
            this.f45321b = bodyModel;
            this.f45322c = aVar;
            this.f45323d = lVar;
            this.f45324e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45324e | 1);
            ym0.a<y> aVar2 = this.f45322c;
            ym0.l<User.BodyModel, y> lVar = this.f45323d;
            g.this.c(this.f45321b, aVar2, lVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<r0<User.BodyModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ User.BodyModel f45325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(User.BodyModel bodyModel) {
            super(0);
            this.f45325a = bodyModel;
        }

        @Override // ym0.a
        public final r0<User.BodyModel> invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = l0.f(this.f45325a, v0.f8878a);
            return f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45327b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f45328c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Long f45329d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45330e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<y> aVar, r8.n nVar, String str, Long l5, ym0.a<y> aVar2) {
            super(2);
            this.f45326a = aVar;
            this.f45327b = nVar;
            this.f45328c = str;
            this.f45329d = l5;
            this.f45330e = aVar2;
        }

        @Override // ym0.p
        public final y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            r8.n nVar2 = this.f45327b;
            ym0.a<y> aVar = this.f45326a;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "DiscoverSegmentalBodyComposition", null, null, null, null, null, null, new s1.a(true, 121918994, new m(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "MeasurementTips", null, null, null, null, null, null, new s1.a(true, -655124151, new o(nVar2, this.f45328c, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SkinToSkinTips", null, null, null, null, null, null, new s1.a(true, -2111537206, new q(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "HowToActivateFeature", null, null, null, null, null, null, new s1.a(true, 727017035, new s(this.f45329d, aVar, this.f45330e)), 126);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Long f45332b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f45333c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45334d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45335e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f45336f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f45337g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f45338h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Long l5, r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2, String str, int i11, int i12) {
            super(2);
            this.f45332b = l5;
            this.f45333c = nVar;
            this.f45334d = aVar;
            this.f45335e = aVar2;
            this.f45336f = str;
            this.f45337g = i11;
            this.f45338h = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45337g | 1);
            ym0.a<y> aVar2 = this.f45335e;
            String str = this.f45336f;
            g.this.e(this.f45332b, this.f45333c, this.f45334d, aVar2, str, aVar, g11, this.f45338h);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45339a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ym0.a<y> aVar) {
            super(2);
            this.f45339a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, false, null, null, false, this.f45339a, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentalBodyComposition.kt */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f45342c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f45341b = aVar;
            this.f45342c = aVar2;
            this.f45343d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45343d | 1);
            ym0.a<y> aVar2 = this.f45341b;
            ym0.a<y> aVar3 = this.f45342c;
            g.this.f(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    public final void a(User.BodyModel bodyModel, ym0.l<? super User.BodyModel, y> onBodyModelSelection, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        boolean z11;
        int i16;
        int i17;
        kotlin.jvm.internal.u.j(onBodyModelSelection, "onBodyModelSelection");
        androidx.compose.runtime.b g11 = aVar.g(98990593);
        int i18 = 2;
        if ((i11 & 14) == 0) {
            if (g11.K(bodyModel)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBodyModelSelection)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        int i19 = i12;
        if ((i19 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            int i21 = androidx.compose.foundation.layout.e.f4229i;
            int i22 = -483455358;
            e.h b10 = g6.b(g11, -483455358);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            int i23 = -1323940314;
            androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(b10, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                ?? r11 = 0;
                int i24 = 2058660585;
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                g11.s(-1602297224);
                for (User.BodyModel bodyModel2 : kotlin.collections.x.W(User.BodyModel.FEMALE, User.BodyModel.MALE, User.BodyModel.NEUTRAL)) {
                    int i25 = androidx.compose.foundation.layout.e.f4229i;
                    e.h b12 = com.withings.authentication.d.b(g11, i22);
                    e.a aVar3 = androidx.compose.ui.e.f8927a;
                    androidx.compose.ui.layout.l0 a13 = com.withings.authentication.e.a(b12, g11, i23);
                    int G2 = g11.G();
                    k1.v0 l6 = g11.l();
                    androidx.compose.ui.node.g.D.getClass();
                    ym0.a a14 = g.a.a();
                    s1.a c12 = androidx.compose.ui.layout.y.c(aVar3);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a14);
                        } else {
                            g11.m();
                        }
                        ym0.p b13 = com.withings.authentication.e.b(g11, a13, g11, l6);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                            androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                        }
                        x.b(r11, c12, j1.a(g11), g11, i24);
                        int[] iArr = k0.f20596a;
                        int i26 = iArr[bodyModel2.ordinal()];
                        if (i26 != 1) {
                            if (i26 != i18) {
                                if (i26 == 3) {
                                    i13 = C1987R.string.neutral_gender;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i13 = C1987R.string._HOMME_;
                            }
                        } else {
                            i13 = C1987R.string._FEMME_;
                        }
                        int i27 = i24;
                        boolean z12 = r11;
                        a0.b(0, 0, 27, 0L, g11, null, null, ay.b.u(i13, g11));
                        androidx.compose.ui.e f11 = e1.f(aVar3, yk.h.p());
                        f.a.d d11 = f.a.d();
                        int i28 = iArr[bodyModel2.ordinal()];
                        if (i28 != 1) {
                            i14 = 2;
                            if (i28 != 2) {
                                if (i28 == 3) {
                                    i15 = 2131232260;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i15 = 2131232259;
                            }
                        } else {
                            i14 = 2;
                            i15 = 2131232258;
                        }
                        g2.c a15 = s2.d.a(i15, g11);
                        if (bodyModel2 == bodyModel) {
                            z5 = true;
                        } else {
                            z5 = z12;
                        }
                        g11.s(-1206780639);
                        if ((i19 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = z12;
                        }
                        boolean K = g11.K(bodyModel2) | z11;
                        Object t11 = g11.t();
                        if (K || t11 == a.C0060a.a()) {
                            t11 = new a(onBodyModelSelection, bodyModel2);
                            g11.n(t11);
                        }
                        g11.J();
                        p2.a(f11, a15, z5, (ym0.a) t11, d11, null, null, g11, 24640, 96);
                        g9.a(g11);
                        i18 = i14;
                        i22 = -483455358;
                        r11 = z12;
                        i23 = -1323940314;
                        i24 = i27;
                    } else {
                        a3.g.s();
                        throw null;
                    }
                }
                androidx.compose.material3.d.c(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(bodyModel, onBodyModelSelection, i11));
        }
    }

    public final void b(ym0.a<y> onBackClicked, ym0.a<y> onNextClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(513313473);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextClicked)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            t0.c(ay.b.u(C1987R.string.segmentalBodyComp_tutorial_whatIsSegmental_title, g11), s2.d.a(2131232257, g11), onBackClicked, s1.b.b(g11, -1497869864, new c(onNextClicked)), null, yk.h.a(), null, b70.e.f20519a, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 12586048, 80);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(onBackClicked, onNextClicked, i11));
        }
    }

    public final void c(User.BodyModel bodyModel, ym0.a<y> onBackClicked, ym0.l<? super User.BodyModel, y> onNextClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(559385484);
        if ((i11 & 14) == 0) {
            if (g11.K(bodyModel)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onNextClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        if ((i16 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            Object[] objArr = {bodyModel};
            g11.s(-967136284);
            if ((i16 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new h(bodyModel);
                g11.n(t11);
            }
            g11.J();
            r0 r0Var = (r0) u1.f.a(objArr, null, null, (ym0.a) t11, g11, 6);
            t0.c(ay.b.u(C1987R.string.segmentalBodyComp_tutorial_chooseModel_title, g11), null, onBackClicked, s1.b.b(g11, 518771605, new e(r0Var, onNextClicked)), null, yk.h.a(), null, s1.b.b(g11, 1920669225, new f(r0Var)), g11, ((i16 << 3) & ConstantsWs.HWFAILURE_ZERO) | 12586032, 80);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new C0624g(bodyModel, onBackClicked, onNextClicked, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r18, int r19, androidx.compose.runtime.a r20, java.lang.String r21, ym0.a r22, ym0.a r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.g.d(int, int, androidx.compose.runtime.a, java.lang.String, ym0.a, ym0.a):void");
    }

    public final void e(Long l5, r8.n navController, ym0.a<y> onBack, ym0.a<y> onDone, String str, androidx.compose.runtime.a aVar, int i11, int i12) {
        String str2;
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(575286154);
        if ((i12 & 16) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        t0.b(navController, "DiscoverSegmentalBodyComposition", new i(onBack, navController, str2, l5, onDone), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(l5, navController, onBack, onDone, str2, i11, i12));
        }
    }

    public final void f(ym0.a<y> onBackClicked, ym0.a<y> onNextClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(-571809433);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextClicked)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            String u11 = ay.b.u(C1987R.string.segmentalBodyComp_tutorial_avoidSkinToSkin_title, g11);
            t0.h(s1.b.b(g11, -100531967, new k(onNextClicked)), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_skin2skin_video_url, g11), onBackClicked, s2.d.a(2131232412, g11), u11, null, 0.0f, b70.e.f20521c, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 12587014, 96);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(onBackClicked, onNextClicked, i11));
        }
    }
}

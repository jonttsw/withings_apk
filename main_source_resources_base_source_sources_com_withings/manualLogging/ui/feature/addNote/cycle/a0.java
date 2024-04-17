package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.f5;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.z4;
import com.withings.wiscale2.C1987R;
import fk.m;
import org.joda.time.LocalDate;
import x1.b;
import x1.d;
/* compiled from: CycleManualLogging.kt */
@SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f40840a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f40843c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40844d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40845e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40846f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f40847g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f40848h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i11, z4 z4Var, ym0.a<nm0.y> aVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, int i12, int i13) {
            super(2);
            this.f40842b = i11;
            this.f40843c = z4Var;
            this.f40844d = aVar;
            this.f40845e = pVar;
            this.f40846f = pVar2;
            this.f40847g = i12;
            this.f40848h = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f40847g | 1);
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f40845e;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar2 = this.f40846f;
            a0.this.c(this.f40842b, this.f40843c, this.f40844d, pVar, pVar2, aVar, g11, this.f40848h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.k4 f40850b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40851c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40852d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40853e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, androidx.compose.ui.platform.k4 k4Var, ym0.a<nm0.y> aVar, String str, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2) {
            super(3);
            this.f40849a = pVar;
            this.f40850b = k4Var;
            this.f40851c = aVar;
            this.f40852d = str;
            this.f40853e = pVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.e b10;
            long j5;
            int i11;
            r0.w padding = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(padding, "padding");
            if ((intValue & 14) == 0) {
                if (aVar2.K(padding)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.x0.e(androidx.compose.foundation.layout.e1.d(aVar3), padding);
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
                    androidx.compose.ui.e e12 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        androidx.compose.ui.e n11 = e12.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                        androidx.compose.ui.layout.l0 b11 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                        int G2 = aVar2.G();
                        k1.v0 l6 = aVar2.l();
                        ym0.a a13 = g.a.a();
                        s1.a c13 = androidx.compose.ui.layout.y.c(n11);
                        if (aVar2.i() instanceof k1.d) {
                            aVar2.A();
                            if (aVar2.e()) {
                                aVar2.F(a13);
                            } else {
                                aVar2.m();
                            }
                            ym0.p c14 = com.google.protobuf.t.c(aVar2, b11, aVar2, l6);
                            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                                l0.q.a(G2, aVar2, G2, c14);
                            }
                            c13.invoke(k1.j1.a(aVar2), aVar2, 0);
                            aVar2.s(2058660585);
                            b10 = androidx.compose.foundation.c.b(aVar3, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).a(), d2.h1.a());
                            aVar2.s(-483455358);
                            androidx.compose.ui.layout.l0 a14 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                            int G3 = aVar2.G();
                            k1.v0 l11 = aVar2.l();
                            ym0.a a15 = g.a.a();
                            s1.a c15 = androidx.compose.ui.layout.y.c(b10);
                            if (aVar2.i() instanceof k1.d) {
                                aVar2.A();
                                if (aVar2.e()) {
                                    aVar2.F(a15);
                                } else {
                                    aVar2.m();
                                }
                                ym0.p c16 = com.google.protobuf.t.c(aVar2, a14, aVar2, l11);
                                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G3))) {
                                    l0.q.a(G3, aVar2, G3, c16);
                                }
                                l0.r.c(0, c15, k1.j1.a(aVar2), aVar2, 2058660585);
                                String u11 = ay.b.u(C1987R.string.Cycle_Tracking_feature_title, aVar2);
                                h2.d a16 = d1.e.a();
                                j5 = d2.f0.f63265i;
                                aVar2.s(-114591691);
                                androidx.compose.ui.platform.k4 k4Var = this.f40850b;
                                boolean K = aVar2.K(k4Var);
                                ym0.a<nm0.y> aVar4 = this.f40851c;
                                boolean K2 = K | aVar2.K(aVar4);
                                Object t11 = aVar2.t();
                                if (K2 || t11 == a.C0060a.a()) {
                                    t11 = new b0(k4Var, aVar4);
                                    aVar2.n(t11);
                                }
                                aVar2.J();
                                c5.a(j5, 0L, u11, true, a16, null, null, null, false, (ym0.a) t11, aVar2, 3078, 482);
                                xk.c.a(androidx.compose.foundation.layout.e1.d(androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2)), null, "", s1.b.b(aVar2, 1043970012, new c0(this.f40852d, this.f40853e)), aVar2, 3504, 0);
                                aVar2.J();
                                aVar2.o();
                                aVar2.J();
                                aVar2.J();
                                aVar2.J();
                                aVar2.o();
                                aVar2.J();
                                aVar2.J();
                                androidx.compose.material.l3.b(this.f40849a, aVar2, 0);
                            } else {
                                a3.g.s();
                                throw null;
                            }
                        } else {
                            a3.g.s();
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f40856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40859f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f40860g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f40861h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, z4 z4Var, ym0.a<nm0.y> aVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, int i11, int i12) {
            super(2);
            this.f40855b = str;
            this.f40856c = z4Var;
            this.f40857d = aVar;
            this.f40858e = pVar;
            this.f40859f = pVar2;
            this.f40860g = i11;
            this.f40861h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f40860g | 1);
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f40858e;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar2 = this.f40859f;
            a0.this.d(this.f40855b, this.f40856c, this.f40857d, pVar, pVar2, aVar, g11, this.f40861h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f40862a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f40863a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<LocalDate, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f40864a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(LocalDate localDate) {
            LocalDate it = localDate;
            kotlin.jvm.internal.u.j(it, "it");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f40865a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f40866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f40867b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f40868c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40869d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40870e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k1.r0<Boolean> r0Var, boolean z5, boolean z11, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(2);
            this.f40866a = r0Var;
            this.f40867b = z5;
            this.f40868c = z11;
            this.f40869d = aVar;
            this.f40870e = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                a0.f40840a.h(this.f40867b, this.f40868c, this.f40866a.getValue().booleanValue(), false, this.f40869d, this.f40870e, aVar2, 1572864, 8);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g3 f40871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f40872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f40873c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k1.r0 r0Var, g3 g3Var, ym0.l lVar) {
            super(2);
            this.f40871a = g3Var;
            this.f40872b = r0Var;
            this.f40873c = lVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                r0.d0.a(androidx.compose.foundation.layout.e1.f(androidx.compose.ui.e.f8927a, yk.h.B()), aVar2);
                String u11 = ay.b.u(C1987R.string.pregnancy_mode_survey_lastPeriodStart_datePicker_title, aVar2);
                ym0.l<LocalDate, nm0.y> lVar = this.f40873c;
                k1.r0<Boolean> r0Var = this.f40872b;
                g3 g3Var = this.f40871a;
                fk.l.a(u11, new m.a(new d0(r0Var, g3Var, lVar)), null, null, null, null, false, g3Var.e(), aVar2, 0, 124);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f40875b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g3 f40876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40877d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40878e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f40879f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f40880g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40881h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f40882i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f40883j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(boolean z5, g3 g3Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, boolean z11, ym0.l<? super LocalDate, nm0.y> lVar, ym0.a<nm0.y> aVar3, int i11, int i12) {
            super(2);
            this.f40875b = z5;
            this.f40876c = g3Var;
            this.f40877d = aVar;
            this.f40878e = aVar2;
            this.f40879f = z11;
            this.f40880g = lVar;
            this.f40881h = aVar3;
            this.f40882i = i11;
            this.f40883j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f40882i | 1);
            ym0.l<LocalDate, nm0.y> lVar = this.f40880g;
            ym0.a<nm0.y> aVar2 = this.f40881h;
            a0.this.e(this.f40875b, this.f40876c, this.f40877d, this.f40878e, this.f40879f, lVar, aVar2, aVar, g11, this.f40883j);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i11) {
            super(2);
            this.f40885b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f40885b | 1);
            a0.this.f(aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f40886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f40887b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40888c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f40889d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f40890e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40891f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z5, boolean z11, ym0.a<nm0.y> aVar, boolean z12, boolean z13, ym0.a<nm0.y> aVar2) {
            super(3);
            this.f40886a = z5;
            this.f40887b = z11;
            this.f40888c = aVar;
            this.f40889d = z12;
            this.f40890e = z13;
            this.f40891f = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            boolean z5 = this.f40887b;
            ym0.a<nm0.y> aVar3 = this.f40888c;
            boolean z11 = this.f40886a;
            wk.i.a(null, true, s1.b.b(aVar2, -385901251, new n0(z11, z5, aVar3)), s1.b.b(aVar2, -1044967332, new p0(z11, this.f40889d, this.f40890e, this.f40891f)), aVar2, 3504, 1);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLogging.kt */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f40893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f40894c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f40895d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f40896e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40897f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40898g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f40899h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f40900i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z5, boolean z11, boolean z12, boolean z13, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11, int i12) {
            super(2);
            this.f40893b = z5;
            this.f40894c = z11;
            this.f40895d = z12;
            this.f40896e = z13;
            this.f40897f = aVar;
            this.f40898g = aVar2;
            this.f40899h = i11;
            this.f40900i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f40899h | 1);
            ym0.a<nm0.y> aVar2 = this.f40897f;
            ym0.a<nm0.y> aVar3 = this.f40898g;
            a0.this.h(this.f40893b, this.f40894c, this.f40895d, this.f40896e, aVar2, aVar3, aVar, g11, this.f40900i);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r25, int r26, androidx.compose.runtime.a r27, com.withings.manualLogging.ui.feature.addNote.cycle.g3 r28, ym0.a r29, ym0.a r30, ym0.a r31, ym0.l r32) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.a0.a(int, int, androidx.compose.runtime.a, com.withings.manualLogging.ui.feature.addNote.cycle.g3, ym0.a, ym0.a, ym0.a, ym0.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r19, int r20, androidx.compose.runtime.a r21, com.withings.manualLogging.ui.feature.addNote.cycle.g3 r22, ym0.a r23, ym0.a r24, ym0.a r25, ym0.l r26) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.a0.b(int, int, androidx.compose.runtime.a, com.withings.manualLogging.ui.feature.addNote.cycle.g3, ym0.a, ym0.a, ym0.a, ym0.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r19, com.withings.common.compose.component.z4 r20, ym0.a<nm0.y> r21, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r22, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.a0.c(int, com.withings.common.compose.component.z4, ym0.a, ym0.p, ym0.p, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r42, com.withings.common.compose.component.z4 r43, ym0.a<nm0.y> r44, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r45, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r46, androidx.compose.runtime.a r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.a0.d(java.lang.String, com.withings.common.compose.component.z4, ym0.a, ym0.p, ym0.p, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r21, com.withings.manualLogging.ui.feature.addNote.cycle.g3 r22, ym0.a<nm0.y> r23, ym0.a<nm0.y> r24, boolean r25, ym0.l<? super org.joda.time.LocalDate, nm0.y> r26, ym0.a<nm0.y> r27, androidx.compose.runtime.a r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.a0.e(boolean, com.withings.manualLogging.ui.feature.addNote.cycle.g3, ym0.a, ym0.a, boolean, ym0.l, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    public final void f(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1576810366);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a);
            e.b b10 = androidx.compose.foundation.layout.e.b();
            d.a g12 = b.a.g();
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(b10, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
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
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                f5.b(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new k(i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r25, int r26, androidx.compose.runtime.a r27, com.withings.manualLogging.ui.feature.addNote.cycle.g3 r28, ym0.a r29, ym0.a r30, ym0.a r31, ym0.l r32) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.a0.g(int, int, androidx.compose.runtime.a, com.withings.manualLogging.ui.feature.addNote.cycle.g3, ym0.a, ym0.a, ym0.a, ym0.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(boolean r24, boolean r25, boolean r26, boolean r27, ym0.a<nm0.y> r28, ym0.a<nm0.y> r29, androidx.compose.runtime.a r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.a0.h(boolean, boolean, boolean, boolean, ym0.a, ym0.a, androidx.compose.runtime.a, int, int):void");
    }
}

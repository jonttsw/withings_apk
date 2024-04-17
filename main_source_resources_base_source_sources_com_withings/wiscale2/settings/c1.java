package com.withings.wiscale2.settings;

import androidx.compose.material3.o7;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.ToastStyle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.settings.e;
import com.withings.wiscale2.settings.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import x1.b;
/* compiled from: PrivacyAndLegals.kt */
/* loaded from: classes5.dex */
public final class c1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qk.a f59895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(qk.a aVar) {
            super(3);
            this.f59895a = aVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            r0.a0 LabelCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.n1.b(this.f59895a, null, 0L, 0, aVar2, 8, 14);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f59896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ qk.a f59897b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59898c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59899d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, qk.a aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f59896a = str;
            this.f59897b = aVar;
            this.f59898c = aVar2;
            this.f59899d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59899d | 1);
            qk.a aVar2 = this.f59897b;
            ym0.a<nm0.y> aVar3 = this.f59898c;
            c1.a(this.f59896a, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<nm0.y> aVar) {
            super(2);
            this.f59900a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.c5.a(0L, 0L, ay.b.u(C1987R.string.settings_privacy_legal, aVar2), true, null, null, null, null, false, this.f59900a, aVar2, 3072, 499);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f59901a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ym0.p<? super String, ? super String, nm0.y> pVar, ym0.a<nm0.y> aVar) {
            super(3);
            this.f59901a = pVar;
            this.f59902b = aVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.w it = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(it, "it");
            if ((intValue & 14) == 0) {
                if (aVar2.K(it)) {
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
                androidx.compose.ui.e c11 = n0.y0.c(androidx.compose.foundation.layout.x0.j(aVar3, 0.0f, it.d(), 0.0f, 0.0f, 13), n0.y0.b(aVar2), false, 14);
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(c11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c13 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c13);
                    }
                    c12.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    com.withings.common.compose.component.y3.d(androidx.compose.foundation.layout.x0.h(aVar3, 0.0f, yk.h.B(), 1), null, null, 0.0f, 0.0f, 0L, s1.b.b(aVar2, -109645432, new d1(this.f59901a, this.f59902b)), aVar2, 1572864, 62);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f59904b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59905c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ym0.a<nm0.y> aVar, ym0.p<? super String, ? super String, nm0.y> pVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f59903a = aVar;
            this.f59904b = pVar;
            this.f59905c = aVar2;
            this.f59906d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59906d | 1);
            ym0.p<String, String, nm0.y> pVar = this.f59904b;
            ym0.a<nm0.y> aVar2 = this.f59905c;
            c1.b(this.f59903a, pVar, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f59907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, ym0.a<nm0.y> aVar) {
            super(2);
            this.f59907a = str;
            this.f59908b = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.c5.a(0L, 0L, this.f59907a, true, null, null, null, null, false, this.f59908b, aVar2, 3072, 499);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.common.compose.component.z4 f59909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Boolean f59910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f59912d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f59913e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59914f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59915g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(com.withings.common.compose.component.z4 z4Var, Boolean bool, boolean z5, ym0.l<? super Boolean, nm0.y> lVar, ym0.p<? super String, ? super String, nm0.y> pVar, String str, String str2) {
            super(3);
            this.f59909a = z4Var;
            this.f59910b = bool;
            this.f59911c = z5;
            this.f59912d = lVar;
            this.f59913e = pVar;
            this.f59914f = str;
            this.f59915g = str2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
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
                androidx.compose.ui.e g11 = androidx.compose.foundation.layout.x0.g(androidx.compose.foundation.layout.x0.j(aVar3, 0.0f, padding.d(), 0.0f, 0.0f, 13), yk.h.o(), yk.h.B());
                aVar2.s(733328855);
                androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(g11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c13 = com.google.protobuf.t.c(aVar2, c11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c13);
                    }
                    l0.r.c(0, c12, k1.j1.a(aVar2), aVar2, 2058660585);
                    com.withings.common.compose.component.x4.a(this.f59909a, androidx.compose.foundation.layout.m.f4307a.g(aVar3, b.a.m()), aVar2, 0, 0);
                    androidx.compose.ui.e c14 = n0.y0.c(aVar3, n0.y0.b(aVar2), false, 14);
                    aVar2.s(-483455358);
                    androidx.compose.ui.layout.l0 a12 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                    int G2 = aVar2.G();
                    k1.v0 l6 = aVar2.l();
                    ym0.a a13 = g.a.a();
                    s1.a c15 = androidx.compose.ui.layout.y.c(c14);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a13);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c16 = com.google.protobuf.t.c(aVar2, a12, aVar2, l6);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c16);
                        }
                        l0.r.c(0, c15, k1.j1.a(aVar2), aVar2, 2058660585);
                        r0.i iVar = r0.i.f94242a;
                        nk.a0.g(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising, aVar2));
                        r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar3, yk.h.a()), aVar2);
                        nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising_description, aVar2));
                        r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar3, yk.h.c()), aVar2);
                        boolean z5 = this.f59911c;
                        Boolean bool = this.f59910b;
                        androidx.compose.material3.d1.a(null, null, null, null, null, s1.b.b(aVar2, 402221677, new g1(z5, bool, this.f59912d)), aVar2, 196608, 31);
                        l0.g.c(iVar, kotlin.jvm.internal.u.e(bool, Boolean.TRUE), null, null, null, null, s1.b.b(aVar2, 1919502151, new j1(this.f59914f, this.f59915g, this.f59913e)), aVar2, 1572870, 30);
                        aVar2.s(587287286);
                        if (z5) {
                            o7.a(0.0f, 0, 0, 30, 0L, 0L, aVar2, androidx.compose.foundation.layout.x0.g(iVar.b(aVar3, b.a.g()), yk.h.o(), yk.h.B()));
                        }
                        aVar2.J();
                        aVar2.J();
                        aVar2.o();
                        aVar2.J();
                        aVar2.J();
                        aVar2.J();
                        aVar2.o();
                        aVar2.J();
                        aVar2.J();
                    } else {
                        a3.g.s();
                        throw null;
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
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f59916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f59917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Boolean f59918c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59919d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f59920e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f59921f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.withings.common.compose.component.z4 f59922g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f59923h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f59924i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(String str, boolean z5, Boolean bool, ym0.a<nm0.y> aVar, ym0.l<? super Boolean, nm0.y> lVar, ym0.p<? super String, ? super String, nm0.y> pVar, com.withings.common.compose.component.z4 z4Var, int i11, int i12) {
            super(2);
            this.f59916a = str;
            this.f59917b = z5;
            this.f59918c = bool;
            this.f59919d = aVar;
            this.f59920e = lVar;
            this.f59921f = pVar;
            this.f59922g = z4Var;
            this.f59923h = i11;
            this.f59924i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59923h | 1);
            ym0.p<String, String, nm0.y> pVar = this.f59921f;
            com.withings.common.compose.component.z4 z4Var = this.f59922g;
            c1.c(this.f59916a, this.f59917b, this.f59918c, this.f59919d, this.f59920e, pVar, z4Var, aVar, g11, this.f59924i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.PrivacyAndLegalsKt$WithingsAdvertisingScreen$1", f = "PrivacyAndLegals.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WithingsAdvertisingViewModel f59925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(WithingsAdvertisingViewModel withingsAdvertisingViewModel, qm0.d<? super i> dVar) {
            super(2, dVar);
            this.f59925a = withingsAdvertisingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new i(this.f59925a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((i) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f59925a.p0(e.a.f59971a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.PrivacyAndLegalsKt$WithingsAdvertisingScreen$2", f = "PrivacyAndLegals.kt", l = {122}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WithingsAdvertisingViewModel f59927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.withings.common.compose.component.z4 f59928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59929d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PrivacyAndLegals.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.PrivacyAndLegalsKt$WithingsAdvertisingScreen$2$1", f = "PrivacyAndLegals.kt", l = {124}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<com.withings.wiscale2.settings.f, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59930a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f59931b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.withings.common.compose.component.z4 f59932c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f59933d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.withings.common.compose.component.z4 z4Var, String str, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f59932c = z4Var;
                this.f59933d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f59932c, this.f59933d, dVar);
                aVar.f59931b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(com.withings.wiscale2.settings.f fVar, qm0.d<? super nm0.y> dVar) {
                return ((a) create(fVar, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59930a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    if (((com.withings.wiscale2.settings.f) this.f59931b) instanceof f.a) {
                        ToastStyle toastStyle = ToastStyle.f33350c;
                        this.f59930a = 1;
                        if (com.withings.common.compose.component.z4.c(this.f59932c, toastStyle, this.f59933d, null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(WithingsAdvertisingViewModel withingsAdvertisingViewModel, com.withings.common.compose.component.z4 z4Var, String str, qm0.d<? super j> dVar) {
            super(2, dVar);
            this.f59927b = withingsAdvertisingViewModel;
            this.f59928c = z4Var;
            this.f59929d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new j(this.f59927b, this.f59928c, this.f59929d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59926a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<com.withings.wiscale2.settings.f> k02 = this.f59927b.k0();
                a aVar = new a(this.f59928c, this.f59929d, null);
                this.f59926a = 1;
                if (FlowKt.collectLatest(k02, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WithingsAdvertisingViewModel f59934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(WithingsAdvertisingViewModel withingsAdvertisingViewModel) {
            super(1);
            this.f59934a = withingsAdvertisingViewModel;
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            this.f59934a.p0(new e.b(bool.booleanValue()));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivacyAndLegals.kt */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WithingsAdvertisingViewModel f59935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f59937c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59938d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f59939e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(WithingsAdvertisingViewModel withingsAdvertisingViewModel, ym0.a<nm0.y> aVar, ym0.p<? super String, ? super String, nm0.y> pVar, int i11, int i12) {
            super(2);
            this.f59935a = withingsAdvertisingViewModel;
            this.f59936b = aVar;
            this.f59937c = pVar;
            this.f59938d = i11;
            this.f59939e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59938d | 1);
            ym0.a<nm0.y> aVar2 = this.f59936b;
            ym0.p<String, String, nm0.y> pVar = this.f59937c;
            c1.d(this.f59935a, aVar2, pVar, aVar, g11, this.f59939e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str, qk.a aVar, ym0.a<nm0.y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        androidx.compose.runtime.b g11 = aVar3.g(1319342173);
        com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), s1.b.b(g11, 1480542687, new a(aVar)), null, str, null, false, false, true, null, null, aVar2, g11, ((i11 << 9) & 7168) | 12582960, (i11 >> 6) & 14, 884);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(str, aVar, aVar2, i11));
        }
    }

    public static final void b(ym0.a<nm0.y> onBack, ym0.p<? super String, ? super String, nm0.y> openWebLink, ym0.a<nm0.y> goToAdvertising, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(openWebLink, "openWebLink");
        kotlin.jvm.internal.u.j(goToAdvertising, "goToAdvertising");
        androidx.compose.runtime.b g11 = aVar.g(1401284089);
        if ((i11 & 14) == 0) {
            if (g11.w(onBack)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(openWebLink)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(goToAdvertising)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            y7.b(null, s1.b.b(g11, -1687511107, new c(onBack)), null, null, null, 0, 0L, 0L, null, s1.b.b(g11, 1003253832, new d(openWebLink, goToAdvertising)), g11, 805306416, ConstantsWs.WS_STATUS_NO_FILTER);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(onBack, openWebLink, goToAdvertising, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r24, boolean r25, java.lang.Boolean r26, ym0.a<nm0.y> r27, ym0.l<? super java.lang.Boolean, nm0.y> r28, ym0.p<? super java.lang.String, ? super java.lang.String, nm0.y> r29, com.withings.common.compose.component.z4 r30, androidx.compose.runtime.a r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.c1.c(java.lang.String, boolean, java.lang.Boolean, ym0.a, ym0.l, ym0.p, com.withings.common.compose.component.z4, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.withings.wiscale2.settings.WithingsAdvertisingViewModel r15, ym0.a<nm0.y> r16, ym0.p<? super java.lang.String, ? super java.lang.String, nm0.y> r17, androidx.compose.runtime.a r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.c1.d(com.withings.wiscale2.settings.WithingsAdvertisingViewModel, ym0.a, ym0.p, androidx.compose.runtime.a, int, int):void");
    }

    public static final void f(String str, qk.a aVar, String str2, ym0.p pVar, androidx.compose.runtime.a aVar2, int i11) {
        boolean z5;
        boolean z11;
        androidx.compose.runtime.b g11 = aVar2.g(994671830);
        g11.s(-864586266);
        boolean z12 = false;
        if ((((i11 & 7168) ^ 3072) > 2048 && g11.K(pVar)) || (i11 & 3072) == 2048) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(str2)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z5 | z11;
        int i12 = i11 & 14;
        if (((i12 ^ 6) > 4 && g11.K(str)) || (i11 & 6) == 4) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        Object t11 = g11.t();
        if (z14 || t11 == a.C0060a.a()) {
            t11 = new e1(str2, str, pVar);
            g11.n(t11);
        }
        g11.J();
        a(str, aVar, (ym0.a) t11, g11, i12 | 64);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f1(str, aVar, str2, pVar, i11));
        }
    }
}

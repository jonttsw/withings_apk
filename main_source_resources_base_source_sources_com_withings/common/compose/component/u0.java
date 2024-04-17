package com.withings.common.compose.component;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material3.a9;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
import okhttp3.internal.http2.Http2;
import x1.b;
/* compiled from: CriteriaCellView.kt */
/* loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CriteriaCellView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34766c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34767d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34768e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar3, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar4, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar5) {
            super(2);
            this.f34764a = pVar;
            this.f34765b = pVar2;
            this.f34766c = pVar3;
            this.f34767d = pVar4;
            this.f34768e = pVar5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.layout.l0 a11 = androidx.activity.a0.a(aVar2, 693286680, b.a.i(), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
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
                    aVar2.s(-1132484172);
                    ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f34764a;
                    if (pVar != null) {
                        pVar.invoke(aVar2, 0);
                    }
                    aVar2.J();
                    androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar3, yk.h.d(), 0.0f, yk.h.c(), 0.0f, 10);
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        androidx.compose.ui.e n11 = j5.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                        aVar2.s(-483455358);
                        androidx.compose.ui.layout.l0 a13 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                        int G2 = aVar2.G();
                        k1.v0 l6 = aVar2.l();
                        ym0.a a14 = g.a.a();
                        s1.a c13 = androidx.compose.ui.layout.y.c(n11);
                        if (aVar2.i() instanceof k1.d) {
                            aVar2.A();
                            if (aVar2.e()) {
                                aVar2.F(a14);
                            } else {
                                aVar2.m();
                            }
                            ym0.p c14 = com.google.protobuf.t.c(aVar2, a13, aVar2, l6);
                            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                                l0.q.a(G2, aVar2, G2, c14);
                            }
                            l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                            this.f34767d.invoke(aVar2, 0);
                            this.f34768e.invoke(aVar2, 0);
                            aVar2.J();
                            aVar2.o();
                            aVar2.J();
                            aVar2.J();
                            aVar2.s(-1132483879);
                            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar2 = this.f34765b;
                            if (pVar2 != null) {
                                pVar2.invoke(aVar2, 0);
                            }
                            aVar2.J();
                            aVar2.s(-826998663);
                            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar3 = this.f34766c;
                            if (pVar3 != null) {
                                pVar3.invoke(aVar2, 0);
                            }
                            androidx.compose.material.v.b(aVar2);
                        } else {
                            a3.g.s();
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
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
    /* compiled from: CriteriaCellView.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34770b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34771c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34772d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34773e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34774f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34775g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f34776h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar3, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar4, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar5, int i11, int i12) {
            super(2);
            this.f34769a = eVar;
            this.f34770b = pVar;
            this.f34771c = pVar2;
            this.f34772d = pVar3;
            this.f34773e = pVar4;
            this.f34774f = pVar5;
            this.f34775g = i11;
            this.f34776h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34775g | 1);
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f34773e;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar2 = this.f34774f;
            u0.b(this.f34769a, this.f34770b, this.f34771c, this.f34772d, pVar, pVar2, aVar, g11, this.f34776h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CriteriaCellView.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(2);
            this.f34777a = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n0.z.a(s2.d.a(this.f34777a, aVar2), null, androidx.collection.c.g(androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, yk.h.u()), x0.h.b(yk.h.d())), null, null, 0.0f, null, aVar2, 56, 120);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CriteriaCellView.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34778a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(2);
            this.f34778a = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, this.f34778a, 0L, null, 0, 0, null, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CriteriaCellView.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(2);
            this.f34779a = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.J();
                nk.j.i(0, 0, 25, ((yk.w) androidx.camera.camera2.internal.p2.b(aVar2, 615317871)).i().c(), aVar2, null, null, this.f34779a);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CriteriaCellView.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34780a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(2);
            this.f34780a = pVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f34780a.invoke(aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CriteriaCellView.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34781a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34782b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34783c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f34784d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34785e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34786f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34787g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.e eVar, int i11, String str, String str2, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, int i12, int i13) {
            super(2);
            this.f34781a = eVar;
            this.f34782b = i11;
            this.f34783c = str;
            this.f34784d = str2;
            this.f34785e = pVar;
            this.f34786f = i12;
            this.f34787g = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34786f | 1);
            String str = this.f34784d;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f34785e;
            u0.a(this.f34781a, this.f34782b, this.f34783c, str, pVar, aVar, g11, this.f34787g);
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, int i11, String title, String description, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> endIcon, androidx.compose.runtime.a aVar, int i12, int i13) {
        Object obj;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Object obj2;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(description, "description");
        kotlin.jvm.internal.u.j(endIcon, "endIcon");
        androidx.compose.runtime.b g11 = aVar.g(-2117939644);
        int i21 = i13 & 1;
        if (i21 != 0) {
            i14 = i12 | 6;
            obj = eVar;
        } else if ((i12 & 14) == 0) {
            obj = eVar;
            if (g11.K(obj)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i12;
        } else {
            obj = eVar;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (g11.c(i11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i13 & 4) != 0) {
            i14 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(title)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 7168) == 0) {
            if (g11.K(description)) {
                i18 = ModuleCopy.f28574b;
            } else {
                i18 = 1024;
            }
            i14 |= i18;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((57344 & i12) == 0) {
            if (g11.w(endIcon)) {
                i19 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i14 |= i19;
        }
        if ((46811 & i14) == 9362 && g11.h()) {
            g11.C();
            obj2 = obj;
        } else {
            if (i21 != 0) {
                obj2 = androidx.compose.ui.e.f8927a;
            } else {
                obj2 = obj;
            }
            b(obj2, s1.b.b(g11, -242965064, new c(i11)), s1.b.b(g11, -945560903, new d(title)), s1.b.b(g11, -1648156742, new e(description)), s1.b.b(g11, 1944214715, new f(endIcon)), null, g11, (i14 & 14) | 224688, 0);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(obj2, i11, title, description, endIcon, i12, i13));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> title, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> description, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar3, androidx.compose.runtime.a aVar, int i11, int i12) {
        Object obj;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        e.a aVar2;
        androidx.compose.runtime.b bVar;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(description, "description");
        androidx.compose.runtime.b g11 = aVar.g(-1965965647);
        int i21 = i12 & 1;
        if (i21 != 0) {
            i13 = i11 | 6;
            obj = eVar;
        } else if ((i11 & 14) == 0) {
            obj = eVar;
            if (g11.K(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            obj = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(title)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (g11.w(description)) {
                i17 = ModuleCopy.f28574b;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (g11.w(pVar2)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i18;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((458752 & i11) == 0) {
            if (g11.w(pVar3)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        }
        int i22 = i13;
        if ((374491 & i22) == 74898 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            if (i21 != 0) {
                aVar2 = androidx.compose.ui.e.f8927a;
            } else {
                aVar2 = obj;
            }
            bVar = g11;
            a9.a(aVar2, null, 0L, 0L, 0.0f, 0.0f, null, s1.b.b(g11, 1185069708, new a(pVar, pVar2, pVar3, title, description)), bVar, (i22 & 14) | 12582912, 126);
            obj = aVar2;
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new b(obj, pVar, title, description, pVar2, pVar3, i11, i12));
        }
    }
}

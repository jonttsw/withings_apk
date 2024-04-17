package com.withings.common.compose.component;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import java.util.Locale;
import x1.b;
import x9.c;
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33486b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AvatarSize f33487c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f33488d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, AvatarSize avatarSize, long j5) {
            super(2);
            this.f33485a = str;
            this.f33486b = str2;
            this.f33487c = avatarSize;
            this.f33488d = j5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            Character valueOf;
            Comparable valueOf2;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String str = this.f33485a;
                kotlin.jvm.internal.u.j(str, "<this>");
                if (str.length() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Character.valueOf(str.charAt(0));
                }
                Comparable comparable = "?";
                if (valueOf == null) {
                    valueOf = "?";
                }
                String str2 = this.f33486b;
                kotlin.jvm.internal.u.j(str2, "<this>");
                if (str2.length() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Character.valueOf(str2.charAt(0));
                }
                if (valueOf2 != null) {
                    comparable = valueOf2;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(valueOf);
                sb2.append(comparable);
                String upperCase = sb2.toString().toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar3);
                androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(d11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.ui.e g11 = androidx.compose.foundation.layout.m.f4307a.g(aVar3, b.a.e());
                    int ordinal = this.f33487c.ordinal();
                    long j5 = this.f33488d;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        aVar2.s(599904951);
                                        aVar2.J();
                                    } else {
                                        aVar2.s(599904869);
                                        nk.u.f(0, 0, 0, 56, j5, aVar2, g11, null, upperCase);
                                        aVar2.J();
                                    }
                                } else {
                                    aVar2.s(599904761);
                                    nk.j.h(0, 0, 24, j5, aVar2, g11, null, upperCase);
                                    aVar2.J();
                                }
                            } else {
                                aVar2.s(599904658);
                                nk.j.f(0, 0, 24, j5, aVar2, g11, null, upperCase);
                                aVar2.J();
                            }
                        } else {
                            aVar2.s(599904552);
                            nk.j.e(0, 0, 24, j5, aVar2, g11, null, upperCase);
                            aVar2.J();
                        }
                    } else {
                        aVar2.s(599904448);
                        nk.j.d(0, 0, 24, j5, aVar2, g11, null, upperCase);
                        aVar2.J();
                    }
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
    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33491c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f33492d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvatarSize f33493e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f33494f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f33495g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f33496h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33497i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f33498j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f33499k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, String str, String str2, String str3, AvatarSize avatarSize, long j5, long j11, boolean z5, ym0.a<nm0.y> aVar, int i11, int i12) {
            super(2);
            this.f33489a = eVar;
            this.f33490b = str;
            this.f33491c = str2;
            this.f33492d = str3;
            this.f33493e = avatarSize;
            this.f33494f = j5;
            this.f33495g = j11;
            this.f33496h = z5;
            this.f33497i = aVar;
            this.f33498j = i11;
            this.f33499k = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33498j | 1);
            boolean z5 = this.f33496h;
            ym0.a<nm0.y> aVar2 = this.f33497i;
            c.b(this.f33489a, this.f33490b, this.f33491c, this.f33492d, this.f33493e, this.f33494f, this.f33495g, z5, aVar2, aVar, g11, this.f33499k);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Avatar.kt */
    /* renamed from: com.withings.common.compose.component.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0451c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33500a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0451c(ym0.a<nm0.y> aVar) {
            super(0);
            this.f33500a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            ym0.a<nm0.y> aVar = this.f33500a;
            if (aVar != null) {
                aVar.invoke();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.r<x9.r, c.b.C1856b, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33501a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(4);
            this.f33501a = pVar;
        }

        @Override // ym0.r
        public final nm0.y invoke(x9.r rVar, c.b.C1856b c1856b, androidx.compose.runtime.a aVar, Integer num) {
            x9.r SubcomposeAsyncImage = rVar;
            c.b.C1856b it = c1856b;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            kotlin.jvm.internal.u.j(it, "it");
            if ((intValue & 641) == 128 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f33501a.invoke(aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33502a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33503b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33504c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f33505d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33506e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f33507f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33508g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f33509h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f33510i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.e eVar, String str, String str2, long j5, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, boolean z5, ym0.a<nm0.y> aVar, int i11, int i12) {
            super(2);
            this.f33502a = eVar;
            this.f33503b = str;
            this.f33504c = str2;
            this.f33505d = j5;
            this.f33506e = pVar;
            this.f33507f = z5;
            this.f33508g = aVar;
            this.f33509h = i11;
            this.f33510i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33509h | 1);
            boolean z5 = this.f33507f;
            ym0.a<nm0.y> aVar2 = this.f33508g;
            c.c(this.f33502a, this.f33503b, this.f33504c, this.f33505d, this.f33506e, z5, aVar2, aVar, g11, this.f33510i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33512b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AvatarSize f33513c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f33514d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f33515e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33516f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f33517g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33518h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f33519i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f33520j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.e eVar, String str, AvatarSize avatarSize, String str2, long j5, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, boolean z5, ym0.a<nm0.y> aVar, int i11, int i12) {
            super(2);
            this.f33511a = eVar;
            this.f33512b = str;
            this.f33513c = avatarSize;
            this.f33514d = str2;
            this.f33515e = j5;
            this.f33516f = pVar;
            this.f33517g = z5;
            this.f33518h = aVar;
            this.f33519i = i11;
            this.f33520j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33519i | 1);
            boolean z5 = this.f33517g;
            ym0.a<nm0.y> aVar2 = this.f33518h;
            c.a(this.f33511a, this.f33512b, this.f33513c, this.f33514d, this.f33515e, this.f33516f, z5, aVar2, aVar, g11, this.f33520j);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a<nm0.y> aVar) {
            super(0);
            this.f33521a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            ym0.a<nm0.y> aVar = this.f33521a;
            if (aVar != null) {
                aVar.invoke();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f33522a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AvatarSize f33523b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f33524c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33525d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33526e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f33527f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11, AvatarSize avatarSize, long j5, ym0.a<nm0.y> aVar, int i12, int i13) {
            super(2);
            this.f33522a = i11;
            this.f33523b = avatarSize;
            this.f33524c = j5;
            this.f33525d = aVar;
            this.f33526e = i12;
            this.f33527f = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33526e | 1);
            long j5 = this.f33524c;
            ym0.a<nm0.y> aVar2 = this.f33525d;
            c.d(this.f33522a, this.f33523b, j5, aVar2, aVar, g11, this.f33527f);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r24, java.lang.String r25, com.withings.common.compose.component.AvatarSize r26, java.lang.String r27, long r28, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r30, boolean r31, ym0.a<nm0.y> r32, androidx.compose.runtime.a r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c.a(androidx.compose.ui.e, java.lang.String, com.withings.common.compose.component.AvatarSize, java.lang.String, long, ym0.p, boolean, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.e r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.withings.common.compose.component.AvatarSize r34, long r35, long r37, boolean r39, ym0.a<nm0.y> r40, androidx.compose.runtime.a r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c.b(androidx.compose.ui.e, java.lang.String, java.lang.String, java.lang.String, com.withings.common.compose.component.AvatarSize, long, long, boolean, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.e r27, java.lang.String r28, java.lang.String r29, long r30, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r32, boolean r33, ym0.a<nm0.y> r34, androidx.compose.runtime.a r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c.c(androidx.compose.ui.e, java.lang.String, java.lang.String, long, ym0.p, boolean, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(int r19, com.withings.common.compose.component.AvatarSize r20, long r21, ym0.a<nm0.y> r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c.d(int, com.withings.common.compose.component.AvatarSize, long, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    public static void e(ComposeView composeView) {
        composeView.setContent(new s1.a(true, 1039985665, new com.withings.common.compose.component.f(null, AvatarSize.f33298c, new com.withings.common.compose.component.d(composeView))));
    }

    public static void f(ComposeView composeView, String firstname, String lastname, String str, AvatarSize size, Integer num, Integer num2, boolean z5, ym0.a aVar, int i11) {
        Integer num3;
        Integer num4;
        boolean z11;
        com.withings.common.compose.component.g gVar;
        if ((i11 & 16) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i11 & 32) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i11 & 64) != 0) {
            z11 = false;
        } else {
            z11 = z5;
        }
        if ((i11 & 128) != 0) {
            gVar = new com.withings.common.compose.component.g(composeView);
        } else {
            gVar = aVar;
        }
        kotlin.jvm.internal.u.j(composeView, "<this>");
        kotlin.jvm.internal.u.j(firstname, "firstname");
        kotlin.jvm.internal.u.j(lastname, "lastname");
        kotlin.jvm.internal.u.j(size, "size");
        composeView.setContent(new s1.a(true, -1481900779, new i(str, num3, num4, firstname, lastname, size, z11, gVar)));
    }
}

package com.withings.notifications.ui;

import androidx.camera.camera2.internal.p2;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c1;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.g6;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.n1;
import androidx.constraintlayout.compose.f;
import androidx.constraintlayout.compose.j;
import androidx.constraintlayout.compose.s;
import c10.d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.AvatarSize;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import d2.g0;
import d2.h1;
import java.util.List;
import java.util.Map;
import k1.j1;
import qk.yc;
import x1.b;
import x1.d;
/* compiled from: LeaderboardIllustration.kt */
/* loaded from: classes4.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f42861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f42861a = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            e.a(aVar, ah.o.g(this.f42861a | 1));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.C0292d f42862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42864c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d.C0292d c0292d, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f42862a = c0292d;
            this.f42863b = eVar;
            this.f42864c = i11;
            this.f42865d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42864c | 1);
            e.b(this.f42862a, this.f42863b, aVar, g11, this.f42865d);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f42866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.C0292d.a f42867b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f42868c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f42869d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f42870e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42871f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f42872g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f42873h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, d.C0292d.a aVar, boolean z5, long j5, long j11, androidx.compose.ui.e eVar, int i12, int i13) {
            super(2);
            this.f42866a = i11;
            this.f42867b = aVar;
            this.f42868c = z5;
            this.f42869d = j5;
            this.f42870e = j11;
            this.f42871f = eVar;
            this.f42872g = i12;
            this.f42873h = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42872g | 1);
            long j5 = this.f42870e;
            androidx.compose.ui.e eVar = this.f42871f;
            e.c(this.f42866a, this.f42867b, this.f42868c, this.f42869d, j5, eVar, aVar, g11, this.f42873h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.C0292d f42874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f42875b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42877d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f42878e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(d.C0292d c0292d, boolean z5, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f42874a = c0292d;
            this.f42875b = z5;
            this.f42876c = eVar;
            this.f42877d = i11;
            this.f42878e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42877d | 1);
            boolean z5 = this.f42875b;
            androidx.compose.ui.e eVar = this.f42876c;
            e.d(this.f42874a, z5, eVar, aVar, g11, this.f42878e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardIllustration.kt */
    /* renamed from: com.withings.notifications.ui.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0576e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.C0292d.a f42879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0576e(d.C0292d.a aVar, int i11) {
            super(2);
            this.f42879a = aVar;
            this.f42880b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42880b | 1);
            e.e(this.f42879a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes4.dex */
    public static final class f implements androidx.compose.ui.layout.l0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f42881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f42882b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.m f42883c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0 f42884d;

        /* compiled from: ConstraintLayout.kt */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<g1.a, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.constraintlayout.compose.c0 f42885a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f42886b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.constraintlayout.compose.c0 c0Var, List list) {
                super(1);
                this.f42885a = c0Var;
                this.f42886b = list;
            }

            @Override // ym0.l
            public final nm0.y invoke(g1.a aVar) {
                this.f42885a.m(aVar, this.f42886b);
                return nm0.y.f85009a;
            }
        }

        public f(k1.r0 r0Var, androidx.constraintlayout.compose.c0 c0Var, androidx.constraintlayout.compose.m mVar, k1.r0 r0Var2) {
            this.f42881a = r0Var;
            this.f42882b = c0Var;
            this.f42883c = mVar;
            this.f42884d = r0Var2;
        }

        @Override // androidx.compose.ui.layout.l0
        public final androidx.compose.ui.layout.m0 d(androidx.compose.ui.layout.n0 n0Var, List<? extends androidx.compose.ui.layout.k0> list, long j5) {
            Map<androidx.compose.ui.layout.a, Integer> map;
            this.f42881a.getValue();
            long n11 = this.f42882b.n(j5, n0Var.getLayoutDirection(), this.f42883c, list);
            this.f42884d.getValue();
            a aVar = new a(this.f42882b, list);
            map = kotlin.collections.j0.f76190a;
            return n0Var.g1((int) (n11 >> 32), (int) (n11 & 4294967295L), map, aVar);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f42887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.m f42888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k1.r0 r0Var, androidx.constraintlayout.compose.m mVar) {
            super(0);
            this.f42887a = r0Var;
            this.f42888b = mVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k1.r0 r0Var = this.f42887a;
            r0Var.setValue(Boolean.valueOf(!((Boolean) r0Var.getValue()).booleanValue()));
            this.f42888b.k();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.l<t2.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f42889a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.constraintlayout.compose.c0 c0Var) {
            super(1);
            this.f42889a = c0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(t2.b0 b0Var) {
            androidx.constraintlayout.compose.f0.a(b0Var, this.f42889a);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f42890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.j f42891b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a f42892c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d.C0292d f42893d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(k1.r0 r0Var, androidx.constraintlayout.compose.j jVar, g gVar, d.C0292d c0292d) {
            super(2);
            this.f42890a = r0Var;
            this.f42891b = jVar;
            this.f42892c = gVar;
            this.f42893d = c0292d;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            long j5;
            boolean z5;
            long j11;
            long j12;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f42890a.setValue(nm0.y.f85009a);
                androidx.constraintlayout.compose.j jVar = this.f42891b;
                int e11 = jVar.e();
                jVar.f();
                aVar2.s(-1952902348);
                j.b i11 = jVar.i();
                androidx.constraintlayout.compose.d a11 = i11.a();
                androidx.constraintlayout.compose.d b10 = i11.b();
                androidx.constraintlayout.compose.d c11 = i11.c();
                androidx.constraintlayout.compose.d a12 = jVar.i().a();
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                r0.d0.a(androidx.constraintlayout.compose.j.g(aVar3, a12, j.f42894a), aVar2);
                d.C0292d c0292d = this.f42893d;
                d.C0292d.a a13 = c0292d.a();
                long c12 = d2.h0.c(4287426725L);
                j5 = d2.f0.f63258b;
                if (c0292d.d() != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z11 = z5;
                aVar2.s(-1952901631);
                boolean K = aVar2.K(a12) | aVar2.K(b10);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new k(a12, b10);
                    aVar2.n(t11);
                }
                aVar2.J();
                e.g(1, a13, c12, j5, androidx.constraintlayout.compose.j.g(aVar3, a11, (ym0.l) t11), z11, false, aVar2, 3526, 64);
                d.C0292d.a c13 = c0292d.c();
                long a14 = yk.b.o().a();
                j11 = d2.f0.f63261e;
                e.g(2, c13, a14, j11, androidx.constraintlayout.compose.j.g(aVar3, b10, new l(a12, a11, c0292d, c11)), false, false, aVar2, 3142, 96);
                d.C0292d.a d11 = c0292d.d();
                aVar2.s(-157145417);
                if (d11 != null) {
                    long a15 = yk.b.o().a();
                    j12 = d2.f0.f63261e;
                    aVar2.s(-1088248386);
                    boolean K2 = aVar2.K(a12) | aVar2.K(b10);
                    Object t12 = aVar2.t();
                    if (K2 || t12 == a.C0060a.a()) {
                        t12 = new m(a12, b10);
                        aVar2.n(t12);
                    }
                    aVar2.J();
                    e.g(3, d11, a15, j12, androidx.constraintlayout.compose.j.g(aVar3, c11, (ym0.l) t12), false, true, aVar2, 1576006, 32);
                }
                aVar2.J();
                aVar2.J();
                if (jVar.e() != e11) {
                    int i12 = k1.y.f75241b;
                    aVar2.B(this.f42892c);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f42894a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            kotlin.jvm.internal.u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.x.a(constrainAs.c(), constrainAs.f().b(), 0.0f, 6);
            androidx.constraintlayout.compose.g0.a(constrainAs.g(), constrainAs.f().d(), 0.0f, 6);
            androidx.constraintlayout.compose.g0.a(constrainAs.e(), constrainAs.f().c(), 0.0f, 6);
            constrainAs.k(s.a.b(0.07f));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f42895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f42896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.constraintlayout.compose.d dVar, androidx.constraintlayout.compose.d dVar2) {
            super(1);
            this.f42895a = dVar;
            this.f42896b = dVar2;
        }

        @Override // ym0.l
        public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            kotlin.jvm.internal.u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.x.a(constrainAs.c(), this.f42895a.e(), 0.0f, 6);
            androidx.constraintlayout.compose.g0.a(constrainAs.g(), constrainAs.f().d(), 0.0f, 6);
            androidx.constraintlayout.compose.g0.a(constrainAs.e(), this.f42896b.d(), 0.0f, 6);
            constrainAs.k(s.a.b(0.86f));
            constrainAs.l(s.a.b(0.24f));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f42897a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f42898b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d.C0292d f42899c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f42900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.constraintlayout.compose.d dVar, androidx.constraintlayout.compose.d dVar2, d.C0292d c0292d, androidx.constraintlayout.compose.d dVar3) {
            super(1);
            this.f42897a = dVar;
            this.f42898b = dVar2;
            this.f42899c = c0292d;
            this.f42900d = dVar3;
        }

        @Override // ym0.l
        public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
            f.b d11;
            androidx.constraintlayout.compose.c constrainAs = cVar;
            kotlin.jvm.internal.u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.x.a(constrainAs.c(), this.f42897a.e(), 0.0f, 6);
            androidx.constraintlayout.compose.g0.a(constrainAs.g(), this.f42898b.c(), 0.0f, 6);
            androidx.constraintlayout.compose.g0 e11 = constrainAs.e();
            if (this.f42899c.d() == null) {
                d11 = constrainAs.f().c();
            } else {
                d11 = this.f42900d.d();
            }
            androidx.constraintlayout.compose.g0.a(e11, d11, 0.0f, 6);
            constrainAs.k(s.a.b(0.774f));
            constrainAs.l(s.a.b(0.24f));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f42901a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f42902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.constraintlayout.compose.d dVar, androidx.constraintlayout.compose.d dVar2) {
            super(1);
            this.f42901a = dVar;
            this.f42902b = dVar2;
        }

        @Override // ym0.l
        public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            kotlin.jvm.internal.u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.x.a(constrainAs.c(), this.f42901a.e(), 0.0f, 6);
            androidx.constraintlayout.compose.g0.a(constrainAs.g(), this.f42902b.c(), 0.0f, 6);
            androidx.constraintlayout.compose.g0.a(constrainAs.e(), constrainAs.f().c(), 0.0f, 6);
            constrainAs.k(s.a.b(0.7224f));
            constrainAs.l(s.a.b(0.24f));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.C0292d f42903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42904b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42905c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(d.C0292d c0292d, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f42903a = c0292d;
            this.f42904b = eVar;
            this.f42905c = i11;
            this.f42906d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42905c | 1);
            e.f(this.f42903a, this.f42904b, aVar, g11, this.f42906d);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardIllustration.kt */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f42907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.C0292d.a f42908b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f42909c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f42910d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42911e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f42912f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f42913g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f42914h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f42915i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i11, d.C0292d.a aVar, long j5, long j11, androidx.compose.ui.e eVar, boolean z5, boolean z11, int i12, int i13) {
            super(2);
            this.f42907a = i11;
            this.f42908b = aVar;
            this.f42909c = j5;
            this.f42910d = j11;
            this.f42911e = eVar;
            this.f42912f = z5;
            this.f42913g = z11;
            this.f42914h = i12;
            this.f42915i = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42914h | 1);
            boolean z5 = this.f42912f;
            boolean z11 = this.f42913g;
            e.g(this.f42907a, this.f42908b, this.f42909c, this.f42910d, this.f42911e, z5, z11, aVar, g11, this.f42915i);
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.runtime.a aVar, int i11) {
        long j5;
        androidx.compose.runtime.b g11 = aVar.g(-1608723055);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e b10 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.x0.f(androidx.compose.foundation.c.b(androidx.compose.foundation.layout.w0.a(e1.e(aVar2, 1.0f), 1.0f), yk.b.J1().a(), x0.h.e()), 1), yk.b.n().a(), x0.h.e());
            g11.s(733328855);
            androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(b10);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, d11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                androidx.compose.ui.e g12 = androidx.compose.foundation.layout.m.f4307a.g(androidx.compose.foundation.layout.w0.a(e1.e(aVar2, 0.6f), 1.0f), b.a.e());
                g2.c a12 = s2.d.a(com.withings.wiscale2.device.hwa08.postinstall.b0.G(yc.f93218a), g11);
                j5 = d2.f0.f63261e;
                n0.z.a(a12, "default avatar", g12, null, null, 0.0f, g0.a.a(5, j5), g11, 1572920, 56);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(i11));
        }
    }

    public static final void b(d.C0292d podiumData, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        long j5;
        androidx.compose.ui.e b10;
        boolean z5;
        long j11;
        boolean z11;
        long j12;
        boolean z12;
        long j13;
        kotlin.jvm.internal.u.j(podiumData, "podiumData");
        androidx.compose.runtime.b g11 = aVar.g(-702886110);
        if ((i12 & 2) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        androidx.compose.ui.e e11 = e1.e(aVar2, 1.0f);
        j5 = d2.f0.f63258b;
        b10 = androidx.compose.foundation.c.b(e11, j5, h1.a());
        androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(b10, yk.h.d());
        int i13 = androidx.compose.foundation.layout.e.f4229i;
        e.h p11 = androidx.compose.foundation.layout.e.p(yk.h.d(), b.a.g());
        d.b a11 = b.a.a();
        g11.s(693286680);
        androidx.compose.ui.layout.l0 a12 = c1.a(p11, a11, g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(f11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, a12, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            androidx.compose.ui.e s11 = e1.s(androidx.compose.ui.e.f8927a, 0.0f, AvatarSize.f33298c.a(), 1);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                androidx.compose.ui.e n11 = s11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), false));
                d.C0292d.a a14 = podiumData.a();
                if (podiumData.b() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                long c12 = d2.h0.c(4287426725L);
                j11 = d2.f0.f63258b;
                c(1, a14, z5, c12, j11, e1.c(n11, 1.0f), g11, 27718, 0);
                d.C0292d.a c13 = podiumData.c();
                if (podiumData.b() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long a15 = yk.b.o().a();
                j12 = d2.f0.f63261e;
                c(2, c13, z11, a15, j12, e1.c(n11, 0.9f), g11, 24646, 0);
                d.C0292d.a d11 = podiumData.d();
                g11.s(1746283718);
                if (d11 != null) {
                    if (podiumData.b() == 3) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long a16 = yk.b.o().a();
                    j13 = d2.f0.f63261e;
                    c(3, d11, z12, a16, j13, e1.c(n11, 0.84f), g11, 24646, 0);
                }
                androidx.compose.runtime.v a17 = com.withings.authentication.mfa.resolve.components.h.a(g11);
                if (a17 != null) {
                    a17.G(new b(podiumData, aVar2, i11, i12));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        a3.g.s();
        throw null;
    }

    public static final void c(int i11, d.C0292d.a entry, boolean z5, long j5, long j11, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i12, int i13) {
        e.a aVar2;
        String b10;
        kotlin.jvm.internal.u.j(entry, "entry");
        androidx.compose.runtime.b g11 = aVar.g(1056502182);
        if ((i13 & 32) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        androidx.compose.ui.e e11 = e1.e(aVar2, 1.0f);
        d.a g12 = b.a.g();
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g12, g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            e(entry, g11, 8);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            r0.d0.a(e1.f(aVar3, yk.h.b()), g11);
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.c.b(e1.e(aVar3, 1.0f), j5, x0.h.b(16)), 0.0f, yk.h.c(), 1), yk.h.a() / 2, 0.0f, 2);
            d.a g13 = b.a.g();
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a13 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g13, g11);
            g11.s(-1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a14 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(h11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a14);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, a13, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                c12.invoke(j1.a(g11), g11, 0);
                g11.s(2058660585);
                r0.d0.a(e1.f(aVar3, yk.h.b() * (3 - en0.r.j(i11, 1, 3))), g11);
                String valueOf = String.valueOf(i11);
                int i14 = (i12 >> 6) & ConstantsWs.HWFAILURE_ZERO;
                nk.j.c(0, 0, i14, 57, j11, g11, null, null, valueOf);
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    r0.d0.a(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), g11);
                    g11.s(-986369306);
                    if (z5) {
                        b10 = ay.b.u(C1987R.string.weeklyPodium_you, g11);
                    } else {
                        b10 = entry.b();
                    }
                    String str = b10;
                    g11.J();
                    nk.u.f(1, 2, i14 | 199680, 17, j11, g11, null, null, str);
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    androidx.compose.runtime.v o02 = g11.o0();
                    if (o02 != null) {
                        o02.G(new c(i11, entry, z5, j5, j11, aVar2, i12, i13));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    public static final void d(d.C0292d podiumData, boolean z5, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        kotlin.jvm.internal.u.j(podiumData, "podiumData");
        androidx.compose.runtime.b g11 = aVar.g(1994652086);
        if ((i12 & 4) != 0) {
            eVar = androidx.compose.ui.e.f8927a;
        }
        androidx.compose.ui.e eVar2 = eVar;
        if (z5) {
            g11.s(967460271);
            b(podiumData, eVar2, g11, ((i11 >> 3) & 112) | 8, 0);
            g11.J();
        } else if (!z5) {
            g11.s(967460343);
            f(podiumData, eVar2, g11, ((i11 >> 3) & 112) | 8, 0);
            g11.J();
        } else {
            g11.s(967460400);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(podiumData, z5, eVar2, i11, i12));
        }
    }

    public static final void e(d.C0292d.a entry, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(entry, "entry");
        androidx.compose.runtime.b g11 = aVar.g(-1575969376);
        String d11 = entry.d();
        if (d11 == null) {
            g11.s(-142441325);
            a(g11, 0);
            g11.J();
        } else {
            g11.s(-142441288);
            androidx.compose.ui.e a11 = androidx.compose.foundation.layout.w0.a(e1.e(androidx.compose.ui.e.f8927a, 1.0f), 1.0f);
            String c11 = p2.c(entry.b(), " ", entry.e(), " avatar");
            long millis = entry.f().getMillis();
            com.withings.common.compose.component.c.c(a11, d11 + "?modified=" + millis, c11, yk.b.n().a(), com.withings.notifications.ui.a.f42847a, false, null, g11, 24582, 96);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new C0576e(entry, i11));
        }
    }

    public static final void f(d.C0292d podiumData, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        long j5;
        androidx.compose.ui.e b10;
        kotlin.jvm.internal.u.j(podiumData, "podiumData");
        androidx.compose.runtime.b g11 = aVar.g(294347848);
        if ((i12 & 2) != 0) {
            eVar = androidx.compose.ui.e.f8927a;
        }
        androidx.compose.ui.e d11 = e1.d(eVar);
        j5 = d2.f0.f63258b;
        b10 = androidx.compose.foundation.c.b(d11, j5, h1.a());
        g11.s(-2033384074);
        m0.k.d(0, 0, null, 7);
        g11.s(-270254335);
        g11.J();
        k3.d dVar = (k3.d) g11.D(n1.e());
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = new androidx.constraintlayout.compose.c0(dVar);
            g11.n(t11);
        }
        g11.J();
        androidx.constraintlayout.compose.c0 c0Var = (androidx.constraintlayout.compose.c0) t11;
        g11.s(-492369756);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = new androidx.constraintlayout.compose.j();
            g11.n(t12);
        }
        g11.J();
        androidx.constraintlayout.compose.j jVar = (androidx.constraintlayout.compose.j) t12;
        g11.s(-492369756);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            t13 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t13);
        }
        g11.J();
        k1.r0 r0Var = (k1.r0) t13;
        g11.s(-492369756);
        Object t14 = g11.t();
        if (t14 == a.C0060a.a()) {
            t14 = new androidx.constraintlayout.compose.m(jVar);
            g11.n(t14);
        }
        g11.J();
        androidx.constraintlayout.compose.m mVar = (androidx.constraintlayout.compose.m) t14;
        g11.s(-492369756);
        Object t15 = g11.t();
        if (t15 == a.C0060a.a()) {
            t15 = androidx.compose.runtime.l0.f(nm0.y.f85009a, androidx.compose.runtime.l0.h());
            g11.n(t15);
        }
        g11.J();
        k1.r0 r0Var2 = (k1.r0) t15;
        androidx.compose.ui.layout.y.a(t2.o.c(b10, false, new h(c0Var)), s1.b.b(g11, -1908965773, new i(r0Var2, jVar, new g(r0Var, mVar), podiumData)), new f(r0Var2, c0Var, mVar, r0Var), g11, 48, 0);
        g11.J();
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(podiumData, eVar, i11, i12));
        }
    }

    public static final void g(int i11, d.C0292d.a entry, long j5, long j11, androidx.compose.ui.e eVar, boolean z5, boolean z11, androidx.compose.runtime.a aVar, int i12, int i13) {
        e.a aVar2;
        boolean z12;
        boolean z13;
        float a11;
        float a12;
        kotlin.jvm.internal.u.j(entry, "entry");
        androidx.compose.runtime.b g11 = aVar.g(-2017318728);
        if ((i13 & 16) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i13 & 32) != 0) {
            z12 = false;
        } else {
            z12 = z5;
        }
        if ((i13 & 64) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        d.a g12 = b.a.g();
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 a13 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g12, g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a14 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a14);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a13, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            e(entry, g11, 8);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            r0.d0.a(e1.f(aVar3, yk.h.a()), g11);
            androidx.compose.ui.e e11 = e1.e(aVar3, 1.0f);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                androidx.compose.ui.e n11 = e11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                float a15 = yk.h.a();
                float a16 = yk.h.a();
                if (z12) {
                    a11 = yk.h.c();
                } else {
                    a11 = yk.h.a();
                }
                if (z13) {
                    a12 = yk.h.c();
                } else {
                    a12 = yk.h.a();
                }
                androidx.compose.ui.e b11 = androidx.compose.foundation.c.b(n11, j5, x0.h.c(a15, a16, a12, a11));
                d.a g13 = b.a.g();
                g11.s(-483455358);
                androidx.compose.ui.layout.l0 a17 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g13, g11);
                g11.s(-1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a18 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(b11);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a18);
                    } else {
                        g11.m();
                    }
                    ym0.p b12 = com.withings.authentication.e.b(g11, a17, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                    }
                    c12.invoke(j1.a(g11), g11, 0);
                    g11.s(2058660585);
                    r0.d0.a(e1.n(aVar3, yk.h.b()), g11);
                    nk.j.i(0, (i12 >> 3) & ConstantsWs.HWFAILURE_ZERO, 25, j11, g11, null, null, String.valueOf(i11));
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    androidx.compose.runtime.v o02 = g11.o0();
                    if (o02 != null) {
                        o02.G(new o(i11, entry, j5, j11, aVar2, z12, z13, i12, i13));
                        return;
                    }
                    return;
                }
                a3.g.s();
                throw null;
            }
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        a3.g.s();
        throw null;
    }
}

package com.withings.badge.detail;

import android.content.Context;
import androidx.camera.camera2.internal.v0;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.g4;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.concurrent.TimeUnit;
import k1.j1;
import kotlin.KotlinNothingValueException;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import lp0.e;
import n0.y0;
import n0.z;
import nk.a0;
import nm0.y;
import np0.a;
import r0.d0;
import ym0.p;
import ym0.q;
/* compiled from: BadgeDetailScreen.kt */
/* loaded from: classes3.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.badge.detail.BadgeDetailScreenKt$BadgeDetailScreen$1", f = "BadgeDetailScreen.kt", l = {74}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BadgeDetailViewModel f32750b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32751c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BadgeDetailScreen.kt */
        /* renamed from: com.withings.badge.detail.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0440a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f32752a;

            C0440a(ym0.a<y> aVar) {
                this.f32752a = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                y yVar = (y) obj;
                this.f32752a.invoke();
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BadgeDetailViewModel badgeDetailViewModel, ym0.a<y> aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f32750b = badgeDetailViewModel;
            this.f32751c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f32750b, this.f32751c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32749a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                SharedFlow<y> j02 = this.f32750b.j0();
                C0440a c0440a = new C0440a(this.f32751c);
                this.f32749a = 1;
                if (j02.collect(c0440a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BadgeDetailViewModel f32753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f32754b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BadgeDetailViewModel badgeDetailViewModel, Context context) {
            super(0);
            this.f32753a = badgeDetailViewModel;
            this.f32754b = context;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f32753a.k0(this.f32754b);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BadgeDetailViewModel f32755a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f32756b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f32757c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32758d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32759e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f32760f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f32761g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(BadgeDetailViewModel badgeDetailViewModel, ym0.l<? super String, y> lVar, ym0.l<? super String, y> lVar2, ym0.a<y> aVar, ym0.a<y> aVar2, int i11, int i12) {
            super(2);
            this.f32755a = badgeDetailViewModel;
            this.f32756b = lVar;
            this.f32757c = lVar2;
            this.f32758d = aVar;
            this.f32759e = aVar2;
            this.f32760f = i11;
            this.f32761g = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f32760f | 1);
            ym0.a<y> aVar2 = this.f32758d;
            ym0.a<y> aVar3 = this.f32759e;
            h.a(this.f32755a, this.f32756b, this.f32757c, aVar2, aVar3, aVar, g11, this.f32761g);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai.a f32762a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ai.a aVar) {
            super(2);
            this.f32762a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ai.a aVar3 = this.f32762a;
                z.a(x9.n.a(bi.a.a(aVar3.d()), aVar2, 0), aVar3.n(), w0.a(e1.e(androidx.compose.ui.e.f8927a, 1.0f), 1.0f), null, null, 0.0f, null, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 120);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32763a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<y> aVar) {
            super(0);
            this.f32763a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f32763a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai.a f32764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f32765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f32766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ai.a aVar, ym0.l<? super String, y> lVar, ym0.l<? super String, y> lVar2) {
            super(3);
            this.f32764a = aVar;
            this.f32765b = lVar;
            this.f32766c = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v3 */
        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar3 = aVar;
            int intValue = num.intValue();
            u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar3.h()) {
                aVar3.C();
            } else {
                ai.a aVar4 = this.f32764a;
                String f11 = aVar4.f();
                if (f11 == null || f11.length() == 0) {
                    f11 = null;
                }
                aVar3.s(-512333110);
                if (f11 == null) {
                    aVar2 = aVar3;
                } else {
                    androidx.compose.ui.e h11 = x0.h(e1.e(androidx.compose.ui.e.f8927a, 1.0f), yk.h.o(), 0.0f, 2);
                    String u11 = ay.b.u(C1987R.string._BADGE_MORE_WIKIPEDIA_, aVar3);
                    s1.a aVar5 = n.f32787b;
                    aVar3.s(-1699080495);
                    ym0.l<String, y> lVar = this.f32765b;
                    boolean K = aVar3.K(lVar) | aVar3.K(f11);
                    Object t11 = aVar3.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new i(f11, lVar);
                        aVar3.n(t11);
                    }
                    aVar3.J();
                    aVar2 = aVar3;
                    com.withings.common.compose.component.o.g(h11, aVar5, null, u11, null, false, false, true, null, null, t11, aVar3, 12582960, 0, 884);
                    y yVar = y.f85009a;
                }
                aVar2.J();
                String e11 = aVar4.e();
                if (e11 == null || e11.length() == 0 || aVar4.b() == 40) {
                    e11 = null;
                }
                if (e11 != null) {
                    androidx.compose.ui.e h12 = x0.h(e1.e(androidx.compose.ui.e.f8927a, 1.0f), yk.h.o(), 0.0f, 2);
                    androidx.compose.runtime.a aVar6 = aVar2;
                    String u12 = ay.b.u(C1987R.string._BADGE_SEE_IN_PICTURES_, aVar6);
                    s1.a aVar7 = n.f32788c;
                    aVar6.s(-1699079414);
                    ym0.l<String, y> lVar2 = this.f32766c;
                    boolean K2 = aVar6.K(lVar2) | aVar6.K(e11);
                    Object t12 = aVar6.t();
                    if (K2 || t12 == a.C0060a.a()) {
                        t12 = new j(e11, lVar2);
                        aVar6.n(t12);
                    }
                    aVar6.J();
                    com.withings.common.compose.component.o.g(h12, aVar7, null, u12, null, false, false, true, null, null, (ym0.a) t12, aVar6, 12582960, 0, 884);
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai.a f32767a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f32768b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f32769c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32770d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f32771e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ai.a aVar, ym0.l<? super String, y> lVar, ym0.l<? super String, y> lVar2, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f32767a = aVar;
            this.f32768b = lVar;
            this.f32769c = lVar2;
            this.f32770d = aVar2;
            this.f32771e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f32771e | 1);
            ym0.l<String, y> lVar = this.f32769c;
            ym0.a<y> aVar2 = this.f32770d;
            h.b(this.f32767a, this.f32768b, lVar, aVar2, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.withings.badge.detail.BadgeDetailViewModel r22, ym0.l<? super java.lang.String, nm0.y> r23, ym0.l<? super java.lang.String, nm0.y> r24, ym0.a<nm0.y> r25, ym0.a<nm0.y> r26, androidx.compose.runtime.a r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.badge.detail.h.a(com.withings.badge.detail.BadgeDetailViewModel, ym0.l, ym0.l, ym0.a, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ai.a aVar, ym0.l<? super String, y> lVar, ym0.l<? super String, y> lVar2, ym0.a<y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        float f11;
        e.a aVar4;
        boolean z5;
        String e11;
        np0.b bVar;
        np0.b bVar2;
        np0.b bVar3;
        androidx.compose.runtime.b g11 = aVar3.g(-1927369953);
        e.a aVar5 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = e1.d(aVar5);
        l0 e12 = v0.e(g11, 733328855, false, g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(d11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            p b10 = com.withings.authentication.e.b(g11, e12, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            c11.invoke(j1.a(g11), g11, 0);
            g11.s(2058660585);
            androidx.compose.ui.e p11 = ah.k.p(y0.c(x0.h(aVar5, yk.h.d(), 0.0f, 2), y0.b(g11), false, 14));
            g11.s(-483455358);
            l0 b11 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a12 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(p11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                p b12 = com.withings.authentication.e.b(g11, b11, g11, l6);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                c12.invoke(j1.a(g11), g11, 0);
                g11.s(2058660585);
                g4.a(0L, 0.0f, s1.b.b(g11, -665335649, new d(aVar)), g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 3);
                String m11 = aVar.m();
                g11.s(-1553230834);
                if (m11 == null) {
                    f11 = 1.0f;
                    aVar4 = aVar5;
                } else {
                    f11 = 1.0f;
                    aVar4 = aVar5;
                    a0.e(0, 6, 24, 0L, g11, e1.e(aVar5, 1.0f), d3.g.a(3), m11);
                    d0.a(e1.f(aVar4, yk.h.c()), g11);
                    y yVar = y.f85009a;
                }
                g11.J();
                String h11 = aVar.h();
                g11.s(-1553230558);
                if (h11 != null) {
                    nk.a.d(e1.e(aVar4, f11), h11, 0L, d3.g.a(3), 0, 0, null, g11, 6, 116);
                    d0.a(e1.f(aVar4, yk.h.t()), g11);
                    y yVar2 = y.f85009a;
                }
                g11.J();
                String u11 = ay.b.u(C1987R.string._SHARE_, g11);
                g11.s(-1553230209);
                if ((((i11 & 7168) ^ 3072) > 2048 && g11.K(aVar2)) || (i11 & 3072) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object t11 = g11.t();
                if (z5 || t11 == a.C0060a.a()) {
                    t11 = new e(aVar2);
                    g11.n(t11);
                }
                g11.J();
                com.withings.common.compose.component.l.a(null, u11, null, false, null, null, false, (ym0.a) t11, g11, 0, 125);
                d0.a(e1.f(aVar4, yk.h.s()), g11);
                g11.s(38230862);
                String f12 = aVar.f();
                if ((f12 != null && f12.length() != 0) || ((e11 = aVar.e()) != null && e11.length() != 0)) {
                    a0.f(0, 0, 29, 0L, g11, null, null, ay.b.u(C1987R.string._BADGE_LEARN_MORE_, g11));
                    d0.a(e1.f(aVar4, yk.h.c()), g11);
                    y3.d(null, null, null, 0.0f, 0, 0L, s1.b.b(g11, 1938197342, new f(aVar, lVar, lVar2)), g11, 1597440, 47);
                }
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                androidx.compose.ui.e d12 = e1.d(aVar4);
                mp0.c cVar = new mp0.c(new mp0.b(TimeUnit.SECONDS));
                cVar.c();
                e.b bVar4 = new e.b(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0.05d);
                bVar = np0.b.f85400d;
                bVar2 = np0.b.f85401e;
                bVar3 = np0.b.f85402f;
                lp0.b bVar5 = new lp0.b(-70, 360, 10.0f, 50.0f, 0.9f, x.W(bVar, bVar2, bVar3), x.W(16572810, 16740973, 16003181, 11832815), x.W(a.d.f85399a, a.C1387a.f85394a), 1500L, true, bVar4, 0, new lp0.f(0), cVar);
                kp0.e.a(d12, x.W(bVar5, lp0.b.a(bVar5, new e.b(1.0d, 0.05d))), g11, 70, 4);
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                v o02 = g11.o0();
                if (o02 != null) {
                    o02.G(new g(aVar, lVar, lVar2, aVar2, i11));
                    return;
                }
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }
}

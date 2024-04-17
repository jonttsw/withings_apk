package com.withings.cycletracking.ui;

import androidx.compose.foundation.layout.e;
import androidx.compose.material.f5;
import androidx.compose.ui.node.g;
import com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel;
import com.withings.cycletracking.ui.viewmodel.h;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import x1.b;
import x1.d;
/* compiled from: CycleTrackingHistoryScreen.kt */
/* loaded from: classes3.dex */
public final class w1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingHistoryScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleTrackingHistoryViewModel f35978b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35979c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f35980d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar, CycleTrackingHistoryViewModel cycleTrackingHistoryViewModel, int i11, int i12) {
            super(2);
            this.f35977a = aVar;
            this.f35978b = cycleTrackingHistoryViewModel;
            this.f35979c = i11;
            this.f35980d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f35979c | 1);
            w1.b(this.f35977a, this.f35978b, aVar, g11, this.f35980d);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingHistoryScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.cycletracking.ui.viewmodel.h f35981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35982b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.withings.cycletracking.ui.viewmodel.h hVar, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f35981a = hVar;
            this.f35982b = aVar;
            this.f35983c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f35983c | 1);
            w1.a(this.f35981a, this.f35982b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.withings.cycletracking.ui.viewmodel.h hVar, ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(-2122291563);
        if ((i11 & 14) == 0) {
            if (g11.K(hVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else if (hVar instanceof h.b) {
            g11.s(115980899);
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
                androidx.camera.camera2.internal.l0.e(g11);
            } else {
                a3.g.s();
                throw null;
            }
        } else if (hVar instanceof h.a) {
            g11.s(115981251);
            c(((i12 >> 3) & 14) | 64, g11, ((h.a) hVar).a(), aVar);
            g11.J();
        } else {
            g11.s(115981391);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(hVar, aVar, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r2 != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ym0.a<nm0.y> r7, com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel r8, androidx.compose.runtime.a r9, int r10, int r11) {
        /*
            java.lang.String r0 = "onBackClick"
            kotlin.jvm.internal.u.j(r7, r0)
            r0 = 1741017416(0x67c5d148, float:1.8683335E24)
            androidx.compose.runtime.b r9 = r9.g(r0)
            r0 = r11 & 1
            r1 = 2
            if (r0 == 0) goto L14
            r0 = r10 | 6
            goto L24
        L14:
            r0 = r10 & 14
            if (r0 != 0) goto L23
            boolean r0 = r9.w(r7)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = r1
        L21:
            r0 = r0 | r10
            goto L24
        L23:
            r0 = r10
        L24:
            r2 = r11 & 2
            if (r2 == 0) goto L2a
            r0 = r0 | 16
        L2a:
            if (r2 != r1) goto L3e
            r1 = r0 & 91
            r3 = 18
            if (r1 != r3) goto L3e
            boolean r1 = r9.h()
            if (r1 != 0) goto L39
            goto L3e
        L39:
            r9.C()
            goto Lb1
        L3e:
            r9.M0()
            r1 = r10 & 1
            if (r1 == 0) goto L54
            boolean r1 = r9.v0()
            if (r1 == 0) goto L4c
            goto L54
        L4c:
            r9.C()
            if (r2 == 0) goto L99
        L51:
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            goto L99
        L54:
            if (r2 == 0) goto L99
            r8 = 1890788296(0x70b323c8, float:4.435286E29)
            r9.s(r8)
            androidx.lifecycle.n1 r2 = j6.a.a(r9)
            if (r2 == 0) goto L8d
            fk0.c r4 = e6.a.a(r2, r9)
            r8 = 1729797275(0x671a9c9b, float:7.301333E23)
            r9.s(r8)
            boolean r8 = r2 instanceof androidx.lifecycle.u
            if (r8 == 0) goto L79
            r8 = r2
            androidx.lifecycle.u r8 = (androidx.lifecycle.u) r8
            i6.a r8 = r8.getDefaultViewModelCreationExtras()
        L77:
            r5 = r8
            goto L7c
        L79:
            i6.a$a r8 = i6.a.C1058a.f71431b
            goto L77
        L7c:
            java.lang.Class<com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel> r1 = com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel.class
            r3 = 0
            r6 = r9
            androidx.lifecycle.g1 r8 = j6.b.a(r1, r2, r3, r4, r5, r6)
            r9.J()
            r9.J()
            com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel r8 = (com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel) r8
            goto L51
        L8d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L99:
            r9.l0()
            kotlinx.coroutines.flow.StateFlow r1 = r8.f0()
            k1.r0 r1 = h6.b.c(r1, r9)
            java.lang.Object r1 = r1.getValue()
            com.withings.cycletracking.ui.viewmodel.h r1 = (com.withings.cycletracking.ui.viewmodel.h) r1
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            a(r1, r7, r9, r0)
        Lb1:
            androidx.compose.runtime.v r9 = r9.o0()
            if (r9 == 0) goto Lbf
            com.withings.cycletracking.ui.w1$a r0 = new com.withings.cycletracking.ui.w1$a
            r0.<init>(r7, r8, r10, r11)
            r9.G(r0)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.w1.b(ym0.a, com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(int i11, androidx.compose.runtime.a aVar, List list, ym0.a aVar2) {
        androidx.compose.ui.e b10;
        androidx.compose.runtime.b g11 = aVar.g(2752026);
        b10 = androidx.compose.foundation.c.b(ah.k.p(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a)), ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), d2.h1.a());
        s0.a.a(b10, null, null, false, null, null, null, false, new c2(list, aVar2), g11, 0, ConstantsWs.WS_STATUS_NOREPOUSER);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d2(i11, list, aVar2));
        }
    }
}

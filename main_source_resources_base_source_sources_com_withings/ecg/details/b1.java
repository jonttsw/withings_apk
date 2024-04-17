package com.withings.ecg.details;

import android.content.Context;
import androidx.compose.material.r3;
import androidx.compose.material3.ga;
import androidx.compose.material3.na;
import androidx.compose.material3.oa;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.withings.common.compose.component.ColorStyle;
import com.withings.device.Device;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.wiscale2.C1987R;
import i6.a;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgInReviewFragment.kt */
/* loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgInReviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<Context, EcgLineChart> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38133a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final EcgLineChart invoke(Context context) {
            Context ctx = context;
            kotlin.jvm.internal.u.j(ctx, "ctx");
            EcgLineChart ecgLineChart = new EcgLineChart(ctx, null, 6, 0);
            ecgLineChart.setTouchEnabled(false);
            ecgLineChart.setPinchZoom(false);
            ecgLineChart.setGridEnabled(true);
            ecgLineChart.setBigGridEnabled(true);
            ecgLineChart.setSmallGridEnabled(true);
            ecgLineChart.d0(0.0f, 30.0f);
            return ecgLineChart;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgInReviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ rq.e f38134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rq.e eVar) {
            super(3);
            this.f38134a = eVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                rq.c.a(this.f38134a, null, aVar2, 0, 2);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgInReviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ rq.b f38135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f38136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(rq.b bVar, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f38135a = bVar;
            this.f38136b = aVar;
            this.f38137c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f38137c | 1);
            b1.a(this.f38135a, this.f38136b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgInReviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f38138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EcgInReviewViewModel f38139b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<Long, Device, nm0.y> f38140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(CoroutineScope coroutineScope, EcgInReviewViewModel ecgInReviewViewModel, ym0.p<? super Long, ? super Device, nm0.y> pVar) {
            super(0);
            this.f38138a = coroutineScope;
            this.f38139b = ecgInReviewViewModel;
            this.f38140c = pVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f38138a, null, null, new c1(this.f38139b, this.f38140c, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgInReviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EcgInReviewViewModel f38141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.p<Long, Device, nm0.y> f38142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f38144d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(EcgInReviewViewModel ecgInReviewViewModel, ym0.p<? super Long, ? super Device, nm0.y> pVar, int i11, int i12) {
            super(2);
            this.f38141a = ecgInReviewViewModel;
            this.f38142b = pVar;
            this.f38143c = i11;
            this.f38144d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f38143c | 1);
            b1.b(this.f38141a, this.f38142b, aVar, g11, this.f38144d);
            return nm0.y.f85009a;
        }
    }

    public static final void a(rq.b bVar, ym0.a<nm0.y> onLearnMoreClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        androidx.compose.runtime.b bVar2;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onLearnMoreClicked, "onLearnMoreClicked");
        androidx.compose.runtime.b g11 = aVar.g(-306203343);
        if ((i11 & 14) == 0) {
            if (g11.K(bVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onLearnMoreClicked)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
            bVar2 = g11;
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e c11 = n0.y0.c(androidx.compose.foundation.layout.e1.d(aVar2), n0.y0.b(g11), false, 14);
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b11 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(c11);
            rq.e eVar = null;
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, b11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
                }
                c12.invoke(k1.j1.a(g11), g11, 0);
                g11.s(2058660585);
                b10 = androidx.compose.foundation.c.b(aVar2, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O(), d2.h1.a());
                g11.s(-483455358);
                androidx.compose.ui.layout.l0 b13 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a12 = g.a.a();
                s1.a c13 = androidx.compose.ui.layout.y.c(b10);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a12);
                    } else {
                        g11.m();
                    }
                    ym0.p b14 = com.withings.authentication.e.b(g11, b13, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b14);
                    }
                    dq.x.b(0, c13, k1.j1.a(g11), g11, 2058660585);
                    androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar2, 1.0f);
                    androidx.compose.ui.layout.l0 a13 = r3.a(g11, 733328855, false, g11, -1323940314);
                    int G3 = g11.G();
                    k1.v0 l11 = g11.l();
                    ym0.a a14 = g.a.a();
                    s1.a c14 = androidx.compose.ui.layout.y.c(e11);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a14);
                        } else {
                            g11.m();
                        }
                        ym0.p b15 = com.withings.authentication.e.b(g11, a13, g11, l11);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G3))) {
                            androidx.camera.camera2.internal.l0.d(G3, g11, G3, b15);
                        }
                        dq.x.b(0, c14, k1.j1.a(g11), g11, 2058660585);
                        androidx.compose.ui.viewinterop.d.a(a.f38133a, androidx.collection.c.h(androidx.compose.foundation.layout.w0.a(aVar2, 1.3333334f)), null, g11, 54, 4);
                        g11.J();
                        ga.b(ay.b.u(C1987R.string.wbs08Rx_ecgWaitingForApproval_graphStatus, g11), null, ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).i().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((na) g11.D(oa.b())).j(), g11, 0, 0, 65530);
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                        bVar2 = g11;
                        com.withings.common.compose.component.l.a(androidx.compose.foundation.layout.x0.g(aVar2, yk.h.o(), yk.h.B()), ay.b.u(C1987R.string.wbs08Rx_ecgWaitingForApproval_learnMore, g11), null, false, ColorStyle.f33324c, null, false, onLearnMoreClicked, g11, ((i12 << 18) & 29360128) | 24576, 108);
                        bVar2.J();
                        bVar2.o();
                        bVar2.J();
                        bVar2.J();
                        com.withings.common.compose.component.v0.b(0.0f, bVar2, 0, 1);
                        if (bVar != null) {
                            eVar = ba0.e.d(bVar, DeviceInfo.STR_TYPE_UNKNOWN);
                        }
                        rq.e eVar2 = eVar;
                        bVar2.s(630517399);
                        if (eVar2 != null) {
                            androidx.compose.material3.d1.a(androidx.compose.foundation.layout.e1.e(androidx.compose.foundation.layout.x0.g(aVar2, yk.h.o(), yk.h.B()), 1.0f), null, null, null, null, s1.b.b(bVar2, 1440308302, new b(eVar2)), bVar2, 196608, 30);
                        }
                        androidx.compose.material3.d.c(bVar2);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = bVar2.o0();
        if (o02 != null) {
            o02.G(new c(bVar, onLearnMoreClicked, i11));
        }
    }

    public static final void b(EcgInReviewViewModel ecgInReviewViewModel, ym0.p<? super Long, ? super Device, nm0.y> openEcgActivation, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        i6.a aVar2;
        kotlin.jvm.internal.u.j(openEcgActivation, "openEcgActivation");
        androidx.compose.runtime.b g11 = aVar.g(-354908951);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 2;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(openEcgActivation)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if (i15 == 1 && (i13 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            g11.M0();
            if ((i11 & 1) != 0 && !g11.v0()) {
                g11.C();
            } else if (i15 != 0) {
                g11.s(1890788296);
                androidx.lifecycle.n1 a11 = j6.a.a(g11);
                if (a11 != null) {
                    fk0.c a12 = e6.a.a(a11, g11);
                    g11.s(1729797275);
                    if (a11 instanceof androidx.lifecycle.u) {
                        aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                    } else {
                        aVar2 = a.C1058a.f71431b;
                    }
                    androidx.lifecycle.g1 a13 = j6.b.a(EcgInReviewViewModel.class, a11, null, a12, aVar2, g11);
                    g11.J();
                    g11.J();
                    ecgInReviewViewModel = (EcgInReviewViewModel) a13;
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            }
            g11.l0();
            g11.s(773894976);
            g11.s(-492369756);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
            }
            g11.J();
            CoroutineScope a14 = ((androidx.compose.runtime.k) t11).a();
            g11.J();
            a((rq.b) androidx.compose.runtime.l0.a(ecgInReviewViewModel.p0(), null, null, g11, 2).getValue(), new d(a14, ecgInReviewViewModel, openEcgActivation), g11, 0);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(ecgInReviewViewModel, openEcgActivation, i11, i12));
        }
    }
}

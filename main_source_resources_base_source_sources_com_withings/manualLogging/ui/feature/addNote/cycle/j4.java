package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.runtime.a;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleTutorialLogScreen.kt */
/* loaded from: classes4.dex */
public final class j4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTutorialLogScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41067a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(0);
            this.f41067a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f41067a.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTutorialLogScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41068a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar) {
            super(2);
            this.f41068a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._DONE_, aVar2), null, false, null, null, false, this.f41068a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTutorialLogScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41069a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41070b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41071c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f41069a = aVar;
            this.f41070b = aVar2;
            this.f41071c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f41071c | 1);
            j4.a(this.f41069a, this.f41070b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onFinish, ym0.a<nm0.y> onNextClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onFinish, "onFinish");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(303123146);
        if ((i11 & 14) == 0) {
            if (g11.w(onFinish)) {
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
            bVar = g11;
        } else {
            g11.s(-1375502216);
            if ((i12 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new a(onFinish);
                g11.n(t11);
            }
            g11.J();
            e.j.a(0, 1, g11, (ym0.a) t11, false);
            h2.d a11 = f1.d.a();
            long O = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O();
            r0.x xVar = new r0.x(yk.h.o(), yk.h.o(), yk.h.o(), yk.h.s());
            int i15 = androidx.compose.foundation.layout.e.f4229i;
            bVar = g11;
            wk.c0.b(null, null, a11, onFinish, g.f40996a, g.f40997b, s1.b.b(g11, 405435637, new b(onNextClicked)), null, O, false, xVar, androidx.compose.foundation.layout.e.o(yk.h.B()), 0.0f, true, g.f40998c, bVar, ((i12 << 9) & 7168) | 1794048, 27648, 4739);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new c(onFinish, onNextClicked, i11));
        }
    }
}

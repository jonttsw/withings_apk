package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.ui.layout.f;
import com.withings.common.compose.component.p2;
import com.withings.wiscale2.C1987R;
/* compiled from: ToiletSelectionScreen.kt */
/* loaded from: classes5.dex */
public final class k0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletSelectionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55424a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletSelectionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f55425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f55426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.r0 r0Var, ym0.l lVar) {
            super(2);
            this.f55425a = lVar;
            this.f55426b = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._NEXT_, aVar2);
                aVar2.s(-1394880108);
                ym0.l<Boolean, nm0.y> lVar = this.f55425a;
                boolean K = aVar2.K(lVar);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new l0(this.f55426b, lVar);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.l.a(null, u11, null, false, null, null, false, (ym0.a) t11, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletSelectionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f55427a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.r0<Boolean> r0Var) {
            super(3);
            this.f55427a = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                g2.c a11 = s2.d.a(2131232946, aVar2);
                k1.r0<Boolean> r0Var = this.f55427a;
                boolean booleanValue = r0Var.getValue().booleanValue();
                aVar2.s(-1394879849);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = new m0(r0Var);
                    aVar2.n(t11);
                }
                aVar2.J();
                p2.a(null, a11, booleanValue, (ym0.a) t11, f.a.a(), ay.b.u(C1987R.string.wpa02_installToilet_rimmed_title, aVar2), ay.b.u(C1987R.string.wpa02_installToilet_rimmed_description, aVar2), aVar2, 27712, 1);
                g2.c a12 = s2.d.a(2131232947, aVar2);
                boolean z5 = !r0Var.getValue().booleanValue();
                aVar2.s(-1394879357);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = new n0(r0Var);
                    aVar2.n(t12);
                }
                aVar2.J();
                p2.a(null, a12, z5, (ym0.a) t12, f.a.a(), ay.b.u(C1987R.string.wpa02_installToilet_rimless_title, aVar2), ay.b.u(C1987R.string.wpa02_installToilet_rimless_description, aVar2), aVar2, 27712, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletSelectionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f55428a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f55429b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, ym0.l lVar) {
            super(2);
            this.f55428a = lVar;
            this.f55429b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55429b | 1);
            k0.a(this.f55428a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.l<? super Boolean, nm0.y> onNextButtonClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        kotlin.jvm.internal.u.j(onNextButtonClick, "onNextButtonClick");
        androidx.compose.runtime.b g11 = aVar.g(-496988039);
        if ((i11 & 14) == 0) {
            if (g11.w(onNextButtonClick)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            g11.s(1058295508);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(Boolean.TRUE, androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            g11.J();
            long O = ((i1) g11.D(j1.e())).O();
            r0.x xVar = new r0.x(yk.h.o(), yk.h.o(), yk.h.o(), yk.h.s());
            int i14 = androidx.compose.foundation.layout.e.f4229i;
            wk.c0.b(null, null, null, a.f55424a, null, f.f55365a, s1.b.b(g11, -1803323676, new b(r0Var, onNextButtonClick)), null, O, false, xVar, androidx.compose.foundation.layout.e.o(yk.h.B()), 0.0f, false, s1.b.b(g11, -1285323201, new c(r0Var)), g11, 1772928, 24576, 12947);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(i11, onNextButtonClick));
        }
    }
}

package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import d2.x;
import java.util.List;
/* compiled from: ItemGoal.kt */
/* loaded from: classes3.dex */
public final class u2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemGoal.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34795a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.r0<Boolean> r0Var) {
            super(0);
            this.f34795a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f34795a.setValue(Boolean.TRUE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemGoal.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<f2.f, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CircleCanvaSize f34796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k3.d f34797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f34798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f34799d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f34800e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<d2.f0> f34801f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k1.o1<Float> f34802g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CircleCanvaSize circleCanvaSize, k3.d dVar, long j5, float f11, long j11, List<d2.f0> list, k1.o1<Float> o1Var) {
            super(1);
            this.f34796a = circleCanvaSize;
            this.f34797b = dVar;
            this.f34798c = j5;
            this.f34799d = f11;
            this.f34800e = j11;
            this.f34801f = list;
            this.f34802g = o1Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(f2.f fVar) {
            f2.f Canvas = fVar;
            kotlin.jvm.internal.u.j(Canvas, "$this$Canvas");
            CircleCanvaSize circleCanvaSize = this.f34796a;
            float f11 = circleCanvaSize.f();
            float e11 = circleCanvaSize.e();
            f2.j jVar = new f2.j(Canvas.b1(circleCanvaSize.d()), 0.0f, 1, 0, null, 26);
            float b10 = circleCanvaSize.b();
            k3.d dVar = this.f34797b;
            float f12 = 2;
            f2.f.U0(Canvas, this.f34798c, f11, e11, c2.d.a(dVar.b1(circleCanvaSize.d() / f12), dVar.b1(circleCanvaSize.d() / f12)), c2.h.a(dVar.b1(b10), dVar.b1(circleCanvaSize.b())), 0.0f, jVar, 832);
            float f13 = circleCanvaSize.f();
            float e12 = circleCanvaSize.e();
            f2.j jVar2 = new f2.j(Canvas.b1(this.f34799d), 0.0f, 1, 0, null, 26);
            f2.f.U0(Canvas, this.f34800e, f13, e12, c2.d.a(dVar.b1(circleCanvaSize.d() / f12), dVar.b1(circleCanvaSize.d() / f12)), c2.h.a(dVar.b1(circleCanvaSize.b()), dVar.b1(circleCanvaSize.b())), 0.0f, jVar2, 832);
            Canvas.W0(x.a.a(this.f34801f, 0.0f, 0.0f, 14), circleCanvaSize.f(), this.f34802g.getValue().floatValue() * circleCanvaSize.e(), c2.d.a(dVar.b1(circleCanvaSize.d() / f12), dVar.b1(circleCanvaSize.d() / f12)), c2.h.a(dVar.b1(circleCanvaSize.b()), dVar.b1(circleCanvaSize.b())), 1.0f, new f2.j(Canvas.b1(circleCanvaSize.d()), 0.0f, 1, 0, null, 26), null, 3);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemGoal.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CircleCanvaSize f34804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34805c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<d2.f0> f34806d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f34807e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34808f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34809g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, CircleCanvaSize circleCanvaSize, boolean z5, List<d2.f0> list, float f11, int i11, int i12) {
            super(2);
            this.f34803a = eVar;
            this.f34804b = circleCanvaSize;
            this.f34805c = z5;
            this.f34806d = list;
            this.f34807e = f11;
            this.f34808f = i11;
            this.f34809g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34808f | 1);
            List<d2.f0> list = this.f34806d;
            float f11 = this.f34807e;
            u2.a(this.f34803a, this.f34804b, this.f34805c, list, f11, aVar, g11, this.f34809g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemGoal.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h4 f34811b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<d2.f0> f34813d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34814e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34815f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, h4 h4Var, boolean z5, List<d2.f0> list, int i11, int i12) {
            super(2);
            this.f34810a = eVar;
            this.f34811b = h4Var;
            this.f34812c = z5;
            this.f34813d = list;
            this.f34814e = i11;
            this.f34815f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34814e | 1);
            boolean z5 = this.f34812c;
            List<d2.f0> list = this.f34813d;
            u2.b(this.f34810a, this.f34811b, z5, list, aVar, g11, this.f34815f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(androidx.compose.ui.e eVar, CircleCanvaSize circleCanvaSize, boolean z5, List<d2.f0> list, float f11, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        boolean z11;
        float f12;
        m0.d0 u0Var;
        List<d2.f0> list2;
        androidx.compose.runtime.b g11 = aVar.g(-905524828);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        } else {
            z11 = z5;
        }
        long a11 = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a();
        long a12 = l1.a.a(g11, (yk.w) androidx.appcompat.app.h.b(g11, 615317871));
        float d11 = circleCanvaSize.d() - circleCanvaSize.a();
        g11.s(-326489803);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        g11.J();
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            f12 = f11;
        } else {
            f12 = 0.0f;
        }
        if (z11) {
            u0Var = new m0.p1(300, 50, m0.c0.d());
        } else {
            u0Var = new m0.u0(0);
        }
        k1.o1 b10 = m0.f.b(f12, u0Var, null, g11, 64, 28);
        if (list.size() > 1) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = kotlin.collections.x.W(kotlin.collections.x.I(list), kotlin.collections.x.I(list));
        }
        List<d2.f0> list3 = list2;
        g11.s(-326489323);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = new a(r0Var);
            g11.n(t12);
        }
        g11.J();
        g11.B((ym0.a) t12);
        k3.d dVar = (k3.d) g11.D(androidx.compose.ui.platform.n1.e());
        g11.s(-326489225);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            float max = Math.max(en0.r.b(Math.abs(circleCanvaSize.f()) - 180, 0.0f), en0.r.b(Math.abs(circleCanvaSize.e()) - Math.abs(circleCanvaSize.f()), 0.0f));
            double b11 = circleCanvaSize.b() / 2.0f;
            t13 = k3.h.a(circleCanvaSize.d() + ((int) (Math.abs(Math.sin(max * 0.017453292519943295d) * b11) + b11)) + 1);
            g11.n(t13);
        }
        float e11 = ((k3.h) t13).e();
        g11.J();
        g11.s(-326489148);
        Object t14 = g11.t();
        if (t14 == a.C0060a.a()) {
            t14 = k3.h.a(circleCanvaSize.d() + circleCanvaSize.b());
            g11.n(t14);
        }
        float e12 = ((k3.h) t14).e();
        g11.J();
        n0.p.a(androidx.compose.foundation.layout.e1.r(androidx.compose.foundation.layout.e1.f(aVar2, e11), e12), new b(circleCanvaSize, dVar, a12, d11, a11, list3, b10), g11, 0);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(aVar2, circleCanvaSize, z11, list, f11, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.e r23, com.withings.common.compose.component.h4 r24, boolean r25, java.util.List<d2.f0> r26, androidx.compose.runtime.a r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.u2.b(androidx.compose.ui.e, com.withings.common.compose.component.h4, boolean, java.util.List, androidx.compose.runtime.a, int, int):void");
    }
}

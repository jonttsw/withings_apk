package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
public final class q3 {

    /* renamed from: a  reason: collision with root package name */
    private static final m0.p1 f34589a = m0.k.d(250, 0, m0.c0.b(), 2);

    /* renamed from: b  reason: collision with root package name */
    private static final float f34590b = 52;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollableTabRow.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0.z0 f34591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x1.b f34592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34593c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f34594d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34595e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34596f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34597g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.q<List<s4>, androidx.compose.runtime.a, Integer, nm0.y> f34598h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(n0.z0 z0Var, x1.b bVar, float f11, float f12, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, int i11, ym0.q<? super List<s4>, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar) {
            super(2);
            this.f34591a = z0Var;
            this.f34592b = bVar;
            this.f34593c = f11;
            this.f34594d = f12;
            this.f34595e = pVar;
            this.f34596f = pVar2;
            this.f34597g = i11;
            this.f34598h = qVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                Object a11 = androidx.camera.camera2.internal.q2.a(aVar2, 773894976, -492369756);
                if (a11 == a.C0060a.a()) {
                    a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
                }
                aVar2.J();
                CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
                aVar2.J();
                aVar2.s(2097127628);
                n0.z0 z0Var = this.f34591a;
                boolean K = aVar2.K(z0Var) | aVar2.K(a12);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new m3(z0Var, a12);
                    aVar2.n(t11);
                }
                aVar2.J();
                androidx.compose.ui.e h11 = androidx.collection.c.h(w0.a.a(n0.y0.a(androidx.compose.foundation.layout.e1.u(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), this.f34592b, 2), z0Var)));
                int i11 = this.f34597g;
                ym0.q<List<s4>, androidx.compose.runtime.a, Integer, nm0.y> qVar = this.f34598h;
                androidx.compose.ui.layout.n1.a(h11, new p3(this.f34593c, this.f34594d, this.f34595e, this.f34596f, (m3) t11, i11, qVar), aVar2, 0, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollableTabRow.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f34601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34602d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f34603e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.q<List<s4>, androidx.compose.runtime.a, Integer, nm0.y> f34604f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34605g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f34606h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ x1.b f34607i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ n0.z0 f34608j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34609k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f34610l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f34611m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f34612n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i11, androidx.compose.ui.e eVar, long j5, long j11, float f11, ym0.q<? super List<s4>, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, float f12, x1.b bVar, n0.z0 z0Var, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, int i12, int i13, int i14) {
            super(2);
            this.f34599a = i11;
            this.f34600b = eVar;
            this.f34601c = j5;
            this.f34602d = j11;
            this.f34603e = f11;
            this.f34604f = qVar;
            this.f34605g = pVar;
            this.f34606h = f12;
            this.f34607i = bVar;
            this.f34608j = z0Var;
            this.f34609k = pVar2;
            this.f34610l = i12;
            this.f34611m = i13;
            this.f34612n = i14;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34610l | 1);
            int g12 = ah.o.g(this.f34611m);
            n0.z0 z0Var = this.f34608j;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f34609k;
            q3.a(this.f34599a, this.f34600b, this.f34601c, this.f34602d, this.f34603e, this.f34604f, this.f34605g, this.f34606h, this.f34607i, z0Var, pVar, aVar, g11, g12, this.f34612n);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r34, androidx.compose.ui.e r35, long r36, long r38, float r40, ym0.q<? super java.util.List<com.withings.common.compose.component.s4>, ? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r41, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r42, float r43, x1.b r44, n0.z0 r45, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r46, androidx.compose.runtime.a r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.q3.a(int, androidx.compose.ui.e, long, long, float, ym0.q, ym0.p, float, x1.b, n0.z0, ym0.p, androidx.compose.runtime.a, int, int, int):void");
    }

    public static final m0.p1 b() {
        return f34589a;
    }
}

package com.withings.notifications.ui;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import androidx.compose.ui.ZIndexElement;
import com.withings.common.compose.component.card.stack.CardTextSize;
import java.util.ArrayList;
import java.util.List;
import k1.o1;
import m0.p1;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f42960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f42961b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l f42962c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l f42963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ArrayList arrayList, boolean z5, ym0.l lVar, ym0.l lVar2) {
        super(4);
        this.f42960a = arrayList;
        this.f42961b = z5;
        this.f42962c = lVar;
        this.f42963d = lVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i11;
        long j5;
        int i12;
        int i13;
        s0.b bVar2 = bVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 14) == 0) {
            if (aVar2.K(bVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (aVar2.c(intValue)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && aVar2.h()) {
            aVar2.C();
        } else {
            nm0.j jVar = (nm0.j) this.f42960a.get(intValue);
            aVar2.s(-186792915);
            int intValue3 = ((Number) jVar.a()).intValue();
            c10.c cVar = (c10.c) jVar.b();
            aVar2.s(-186792898);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                aVar2.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            Object j11 = w7.j(aVar2, -186792843);
            if (j11 == a.C0060a.a()) {
                j11 = ah.l.t(0.0f);
                aVar2.n(j11);
            }
            k1.o0 o0Var = (k1.o0) j11;
            aVar2.J();
            o1 b10 = m0.f.b(o0Var.a(), m0.k.d(300, 0, m0.c0.b(), 2), "animatedRotationZ", aVar2, 3072, 20);
            aVar2.s(-186792477);
            boolean z5 = this.f42961b;
            boolean a11 = aVar2.a(z5);
            Object t12 = aVar2.t();
            if (a11 || t12 == a.C0060a.a()) {
                t12 = new l0(z5, r0Var, o0Var, null);
                aVar2.n(t12);
            }
            aVar2.J();
            k1.y.f("animation", (ym0.p) t12, aVar2);
            aVar2.s(-186792187);
            Object t13 = aVar2.t();
            if (t13 == a.C0060a.a()) {
                j5 = k3.n.f75301b;
                t13 = androidx.compose.runtime.l0.f(k3.n.b(j5), androidx.compose.runtime.v0.f8878a);
                aVar2.n(t13);
            }
            k1.r0 r0Var2 = (k1.r0) t13;
            aVar2.J();
            if (z5) {
                aVar2.s(-186792093);
                boolean booleanValue = ((Boolean) r0Var.getValue()).booleanValue();
                p1 d11 = m0.k.d(600, 0, null, 6);
                aVar2.s(-186791956);
                Object t14 = aVar2.t();
                if (t14 == a.C0060a.a()) {
                    t14 = new m0(r0Var2);
                    aVar2.n(t14);
                }
                aVar2.J();
                androidx.compose.animation.l0 p11 = androidx.compose.animation.p.p(d11, (ym0.l) t14);
                androidx.compose.ui.e n11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f).n(new ZIndexElement(intValue3));
                aVar2.s(-186791643);
                Object t15 = aVar2.t();
                if (t15 == a.C0060a.a()) {
                    t15 = new n0(r0Var2);
                    aVar2.n(t15);
                }
                aVar2.J();
                androidx.compose.ui.e a12 = androidx.compose.ui.layout.x0.a(n11, (ym0.l) t15);
                aVar2.s(-186791410);
                boolean K = aVar2.K(b10);
                Object t16 = aVar2.t();
                if (K || t16 == a.C0060a.a()) {
                    t16 = new o0(b10);
                    aVar2.n(t16);
                }
                aVar2.J();
                l0.g.e(booleanValue, s0.b.b(bVar2, androidx.compose.ui.graphics.b.a(a12, (ym0.l) t16)), p11, null, null, s1.b.b(aVar2, -8967844, new p0(cVar, this.f42962c, this.f42963d)), aVar2, 196608, 24);
                aVar2.J();
            } else {
                aVar2.s(-186790980);
                h.c(cVar, this.f42962c, this.f42963d, s0.b.b(bVar2, androidx.compose.ui.e.f8927a), CardTextSize.f33628a, aVar2, 24584, 0);
                aVar2.J();
            }
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}

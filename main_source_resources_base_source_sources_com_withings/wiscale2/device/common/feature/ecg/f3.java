package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class f3 extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51333a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51334b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51333a = ecgActivationActivity;
        this.f51334b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h bottomSheet = hVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(it, "it");
        Object a11 = androidx.camera.camera2.internal.q2.a(aVar2, 773894976, -492369756);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
        }
        aVar2.J();
        CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
        aVar2.J();
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
        aVar2.s(-483455358);
        androidx.compose.ui.layout.l0 a13 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
        int G = aVar2.G();
        k1.v0 l5 = aVar2.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a14 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (aVar2.i() instanceof k1.d) {
            aVar2.A();
            if (aVar2.e()) {
                aVar2.F(a14);
            } else {
                aVar2.m();
            }
            ym0.p c12 = com.google.protobuf.t.c(aVar2, a13, aVar2, l5);
            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                l0.q.a(G, aVar2, G, c12);
            }
            c11.invoke(k1.j1.a(aVar2), aVar2, 0);
            aVar2.s(2058660585);
            com.withings.common.compose.component.v4.a(androidx.compose.foundation.layout.x0.g(aVar3, yk.h.o(), yk.h.q()), ay.b.u(C1987R.string.hwa09_usOnboarding_videoCall_smsBottomSheet_title, aVar2), ay.b.u(C1987R.string.hwa09_usOnboarding_videoCall_paragraph, aVar2), null, null, 0.0f, 0.0f, 0, 0, 0, aVar2, 0, 1016);
            EcgActivationActivity ecgActivationActivity = this.f51333a;
            r8.n nVar = this.f51334b;
            wk.i.a(null, true, s1.b.b(aVar2, 2137053342, new b3(a12, ecgActivationActivity, nVar)), s1.b.b(aVar2, 736161853, new e3(a12, nVar)), aVar2, 3504, 1);
            defpackage.d.j(aVar2);
            return nm0.y.f85009a;
        }
        a3.g.s();
        throw null;
    }
}

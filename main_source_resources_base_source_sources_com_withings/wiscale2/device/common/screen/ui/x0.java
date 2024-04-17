package com.withings.wiscale2.device.common.screen.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.devicescreens.model.CustomScreenMode;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.screen.ui.y1;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y1 f53467a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<CustomScreenMode, nm0.y> f53468b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(y1 y1Var, ym0.l<? super CustomScreenMode, nm0.y> lVar) {
        super(3);
        this.f53467a = y1Var;
        this.f53468b = lVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        CustomScreenMode customScreenMode;
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        aVar2.s(-483455358);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
        int G = aVar2.G();
        k1.v0 l5 = aVar2.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
        if (aVar2.i() instanceof k1.d) {
            aVar2.A();
            if (aVar2.e()) {
                aVar2.F(a12);
            } else {
                aVar2.m();
            }
            ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                l0.q.a(G, aVar2, G, c12);
            }
            l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
            y1 y1Var = this.f53467a;
            if (y1Var instanceof y1.d) {
                customScreenMode = CustomScreenMode.RECOMMENDED;
            } else if (y1Var instanceof y1.a) {
                customScreenMode = CustomScreenMode.CUSTOM;
            } else {
                customScreenMode = CustomScreenMode.CUSTOM;
            }
            wp.r.a(customScreenMode, this.f53468b, aVar2, 0, 0);
            nk.a.g(0, 0, 0, 60, 0L, aVar2, androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.customizeScreens_note_notImpactOtherUthers, aVar2));
            r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.s()), aVar2);
            aVar2.J();
            aVar2.o();
            aVar2.J();
            aVar2.J();
            return nm0.y.f85009a;
        }
        a3.g.s();
        throw null;
    }
}

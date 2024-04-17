package com.withings.wiscale2.user.ui.profile;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material.f5;
import androidx.compose.material.n3;
import androidx.compose.ui.node.g;
import k1.j1;
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f61943a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(EditProfileActivity editProfileActivity) {
        super(2);
        this.f61943a = editProfileActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        nm0.y yVar;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            EditProfileActivity editProfileActivity = this.f61943a;
            m70.m mVar = (m70.m) androidx.compose.runtime.l0.a(editProfileActivity.L3().Y0(), null, null, aVar2, 2).getValue();
            aVar2.s(169159860);
            if (mVar == null) {
                yVar = null;
            } else {
                editProfileActivity.E3(mVar, aVar2, 72);
                yVar = nm0.y.f85009a;
            }
            aVar2.J();
            if (yVar == null) {
                androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
                androidx.compose.ui.layout.l0 b10 = n3.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(d11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    f5.b(0.0f, 0, 0, 31, 0L, 0L, aVar2, null);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
        }
        return nm0.y.f85009a;
    }
}

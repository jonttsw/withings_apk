package com.withings.tutorials.ui.screens.modes.pacemaker;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.protobuf.t;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.r;
import nm0.y;
import r0.d0;
import ym0.p;
import ym0.q;
/* compiled from: PacemakerMode.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f45711a = new s1.a(false, 783654599, C0629a.f45712a);

    /* compiled from: PacemakerMode.kt */
    /* renamed from: com.withings.tutorials.ui.screens.modes.pacemaker.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0629a extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0629a f45712a = new w(3);

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = e1.e(aVar3, 1.0f);
                aVar2.s(-483455358);
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    nk.a.d(null, ay.b.u(C1987R.string.pacemaker_mode_page_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                    d0.a(e1.f(aVar3, yk.h.q()), aVar2);
                    nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.scale_mode_page_note, aVar2));
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }
}

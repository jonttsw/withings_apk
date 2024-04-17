package com.withings.authentication.deactivation;

import ah.k;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.protobuf.t;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.q;
import l0.r;
import n0.z;
import nm0.y;
import wk.c0;
import yk.h;
import ym0.p;
/* compiled from: AccountReactivationScreen.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f31498a = new s1.a(false, -1534860475, a.f31501a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f31499b = new s1.a(false, -1771478300, b.f31502a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f31500c = new s1.a(false, -2031958562, c.f31503a);

    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31501a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e a11 = w0.a(x0.j(k.s(e1.e(aVar3, 1.0f)), 0.0f, c0.f(), 0.0f, h.t(), 5), 1.7777778f);
                l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(a11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    z.a(s2.d.a(2131231697, aVar2), null, e1.d(aVar3), null, null, 0.0f, null, aVar2, 440, 120);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31502a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string.account_reactivation_title, aVar2), ay.b.u(C1987R.string.account_reactivation_description, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return y.f85009a;
        }
    }

    /* compiled from: AccountReactivationScreen.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f31503a = new w(3);

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            }
            return y.f85009a;
        }
    }
}

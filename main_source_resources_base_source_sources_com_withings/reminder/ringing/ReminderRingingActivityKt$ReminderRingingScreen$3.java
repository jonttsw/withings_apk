package com.withings.reminder.ringing;

import androidx.collection.c;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.protobuf.t;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.d;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.r;
import n0.y0;
import n0.z;
import nk.a0;
import nm0.y;
import x1.b;
import yk.h;
import ym0.p;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/w;", "it", "Lnm0/y;", "invoke", "(Lr0/w;Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderRingingActivityKt$ReminderRingingScreen$3 extends w implements q<r0.w, a, Integer, y> {
    final /* synthetic */ int $imageRes;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderRingingActivityKt$ReminderRingingScreen$3(String str, int i11) {
        super(3);
        this.$title = str;
        this.$imageRes = i11;
    }

    public final void invoke(r0.w it, a aVar, int i11) {
        int i12;
        u.j(it, "it");
        if ((i11 & 14) == 0) {
            i12 = i11 | (aVar.K(it) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 91) == 18 && aVar.h()) {
            aVar.C();
            return;
        }
        e.a aVar2 = e.f8927a;
        e e11 = x0.e(e1.d(x0.f(y0.c(aVar2, y0.b(aVar), false, 14), h.q())), it);
        int i13 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(h.d());
        String str = this.$title;
        int i14 = this.$imageRes;
        aVar.s(-483455358);
        l0 a11 = n.a(o11, b.a.k(), aVar);
        aVar.s(-1323940314);
        int G = aVar.G();
        v0 l5 = aVar.l();
        g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (aVar.i() instanceof d) {
            aVar.A();
            if (aVar.e()) {
                aVar.F(a12);
            } else {
                aVar.m();
            }
            p c12 = t.c(aVar, a11, aVar, l5);
            if (aVar.e() || !u.e(aVar.t(), Integer.valueOf(G))) {
                l0.q.a(G, aVar, G, c12);
            }
            r.c(0, c11, j1.a(aVar), aVar, 2058660585);
            androidx.compose.ui.e a13 = w0.a(aVar2, 1.0f);
            l0 b10 = c.b(aVar, 733328855, false, aVar, -1323940314);
            int G2 = aVar.G();
            v0 l6 = aVar.l();
            ym0.a a14 = g.a.a();
            s1.a c13 = androidx.compose.ui.layout.y.c(a13);
            if (aVar.i() instanceof d) {
                aVar.A();
                if (aVar.e()) {
                    aVar.F(a14);
                } else {
                    aVar.m();
                }
                p c14 = t.c(aVar, b10, aVar, l6);
                if (aVar.e() || !u.e(aVar.t(), Integer.valueOf(G2))) {
                    l0.q.a(G2, aVar, G2, c14);
                }
                r.c(0, c13, j1.a(aVar), aVar, 2058660585);
                z.a(s2.d.a(i14, aVar), null, c.g(m.f4307a.g(e1.n(aVar2, (float) ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE), b.a.e()), x0.h.e()), null, f.a.a(), 0.0f, null, aVar, 24632, 104);
                aVar.J();
                aVar.o();
                aVar.J();
                aVar.J();
                nk.u.d(0, 0, 0, 60, 0L, aVar, new HorizontalAlignElement(b.a.g()), null, ay.b.u(C1987R.string._REMINDER_, aVar));
                a0.f(0, 0, 28, 0L, aVar, new HorizontalAlignElement(b.a.g()), null, str);
                d.j(aVar);
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    @Override // ym0.q
    public /* bridge */ /* synthetic */ y invoke(r0.w wVar, a aVar, Integer num) {
        invoke(wVar, aVar, num.intValue());
        return y.f85009a;
    }
}

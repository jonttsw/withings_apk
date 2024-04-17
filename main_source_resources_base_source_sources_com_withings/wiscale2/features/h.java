package com.withings.wiscale2.features;

import androidx.compose.material.v;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.protobuf.t;
import com.withings.common.compose.component.c5;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.List;
import k1.j1;
import k1.o1;
import k1.r0;
import k1.v0;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.Flow;
import l0.q;
import l0.r;
import nm0.y;
import r0.h0;
import r0.t0;
import ym0.l;
import ym0.p;
/* compiled from: FeatureFlagsActivity.kt */
/* loaded from: classes5.dex */
final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FeatureFlagsActivity f56115a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FeatureFlagsActivity featureFlagsActivity) {
        super(2);
        this.f56115a = featureFlagsActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-483455358);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
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
                p c12 = t.c(aVar2, a11, aVar2, l5);
                if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                    q.a(G, aVar2, G, c12);
                }
                r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                FeatureFlagsActivity featureFlagsActivity = this.f56115a;
                c5.a(0L, 0L, FeatureFlagsActivity.z3(featureFlagsActivity), false, null, null, null, null, false, new a(featureFlagsActivity), aVar2, 0, 507);
                aVar2.s(-922499467);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
                    aVar2.n(t11);
                }
                r0 r0Var = (r0) t11;
                Object j5 = w7.j(aVar2, -922499394);
                if (j5 == a.C0060a.a()) {
                    j5 = androidx.compose.runtime.l0.e(new g(featureFlagsActivity, r0Var));
                    aVar2.n(j5);
                }
                aVar2.J();
                List<xr.a> list = (List) ((o1) j5).getValue();
                ArrayList arrayList = new ArrayList(x.y(list, 10));
                for (xr.a aVar4 : list) {
                    arrayList.add(new pf0.f(wr.b.d(aVar4), aVar4));
                }
                r0 a13 = androidx.compose.runtime.l0.a(new pf0.c((Flow[]) x.Q0(arrayList).toArray(new Flow[0])), i0.f76187a, null, aVar2, 2);
                String str = (String) r0Var.getValue();
                aVar2.s(-922498284);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = new b(r0Var);
                    aVar2.n(t12);
                }
                aVar2.J();
                pf0.g.a(str, (l) t12, aVar2, 48, 0);
                int i11 = h0.f94240a;
                r0.w d11 = r0.l0.d(t0.a(aVar2), aVar2);
                aVar2.s(-922498102);
                boolean K = aVar2.K(a13);
                Object t13 = aVar2.t();
                if (K || t13 == a.C0060a.a()) {
                    t13 = new f(a13);
                    aVar2.n(t13);
                }
                aVar2.J();
                s0.a.a(null, null, d11, false, null, null, null, false, (l) t13, aVar2, 0, ConstantsWs.WS_STATUS_NODATAFOUND);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return y.f85009a;
    }
}

package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
import java.util.List;
/* compiled from: ListGpsPointActivity.kt */
/* loaded from: classes4.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49575a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ListGpsPointActivity listGpsPointActivity) {
        super(3);
        this.f49575a = listGpsPointActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        int i12;
        List<GpsLocation> a11;
        List<GpsLocation> b10;
        int i13;
        r0.w innerPaddingValues = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(innerPaddingValues, "innerPaddingValues");
        if ((intValue & 14) == 0) {
            if (aVar2.K(innerPaddingValues)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            intValue |= i13;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.x0.e(androidx.compose.foundation.layout.e1.d(aVar3), innerPaddingValues);
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 a12 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a13 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
            Integer num2 = null;
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a13);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, a12, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                ListGpsPointActivity listGpsPointActivity = this.f49575a;
                k1.r0 a14 = t1.d.a(ListGpsPointActivity.C3(listGpsPointActivity).m0(), aVar2);
                k1.r0 a15 = t1.d.a(ListGpsPointActivity.C3(listGpsPointActivity).p0(), aVar2);
                ListGpsPointActivity.b bVar = (ListGpsPointActivity.b) a14.getValue();
                if (bVar != null && (b10 = bVar.b()) != null) {
                    i11 = b10.size();
                } else {
                    i11 = 0;
                }
                ListGpsPointActivity.b bVar2 = (ListGpsPointActivity.b) a14.getValue();
                if (bVar2 != null && (a11 = bVar2.a()) != null) {
                    i12 = a11.size();
                } else {
                    i12 = 0;
                }
                int i14 = i12;
                int i15 = i11;
                androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar3, yk.h.o(), yk.h.q(), yk.h.o(), 0.0f, 8);
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a16 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G2 = aVar2.G();
                k1.v0 l6 = aVar2.l();
                ym0.a a17 = g.a.a();
                s1.a c13 = androidx.compose.ui.layout.y.c(j5);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a17);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c14 = com.google.protobuf.t.c(aVar2, a16, aVar2, l6);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                        l0.q.a(G2, aVar2, G2, c14);
                    }
                    l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                    List list = (List) a15.getValue();
                    if (list != null) {
                        num2 = Integer.valueOf(list.size());
                    }
                    nk.u.d(0, 0, 0, 61, 0L, aVar2, null, null, "Nb. of pause vasistas: " + num2);
                    nk.u.d(0, 0, 0, 61, 0L, aVar2, null, null, android.support.v4.media.a.a("Nb. of locations: ", i15));
                    nk.u.d(0, 0, 0, 61, 0L, aVar2, null, null, android.support.v4.media.a.a("Nb. of filtered locations: ", i14));
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    ListGpsPointActivity.A3(listGpsPointActivity, (ListGpsPointActivity.b) a14.getValue(), aVar2, 72);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

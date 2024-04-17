package com.withings.healthplus.explore.ui.activity;

import androidx.compose.foundation.layout.e1;
import k1.r0;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40323a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ExploreTabActivity exploreTabActivity) {
        super(2);
        this.f40323a = exploreTabActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            ExploreTabActivity exploreTabActivity = this.f40323a;
            exploreTabActivity.f40243f = c11;
            r8.n nVar = exploreTabActivity.f40243f;
            if (nVar != null) {
                r0 b10 = androidx.navigation.compose.r.b(nVar, aVar2);
                xb.b v11 = androidx.activity.b0.v(aVar2);
                r0 b11 = androidx.compose.runtime.l0.b(ExploreTabActivity.E3(exploreTabActivity).k0(), aVar2);
                r8.n nVar2 = exploreTabActivity.f40243f;
                if (nVar2 != null) {
                    nl.a.a(nVar2, aVar2, 8);
                    r8.n nVar3 = exploreTabActivity.f40243f;
                    if (nVar3 != null) {
                        pu.a.a(nVar3, aVar2, 8);
                        k1.y.f((androidx.navigation.d) b10.getValue(), new l(exploreTabActivity, b10, null), aVar2);
                        r8.n nVar4 = exploreTabActivity.f40243f;
                        if (nVar4 != null) {
                            nVar4.D().b(v11);
                            k1.y.f((vk.a) b11.getValue(), new m(exploreTabActivity, null), aVar2);
                            xb.a.a(v11, e1.d(androidx.compose.ui.e.f8927a), wk.h.d(), 0.0f, 0L, 0L, 0L, s1.b.b(aVar2, 401866021, new j0(exploreTabActivity)), aVar2, 12582968, 120);
                        } else {
                            kotlin.jvm.internal.u.s("navController");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.u.s("navController");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

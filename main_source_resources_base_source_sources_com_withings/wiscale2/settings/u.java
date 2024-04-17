package com.withings.wiscale2.settings;

import androidx.compose.ui.node.g;
import com.withings.wiscale2.settings.DatabaseInfoActivity;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: DatabaseInfoActivity.kt */
/* loaded from: classes5.dex */
final class u extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity.b f60316a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity f60317b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DatabaseInfoActivity.b bVar, DatabaseInfoActivity databaseInfoActivity) {
        super(3);
        this.f60316a = bVar;
        this.f60317b = databaseInfoActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 14) == 0) {
            if (aVar2.K(it)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            MutableStateFlow<DatabaseInfoActivity.c> K0 = this.f60316a.K0();
            DatabaseInfoActivity.c.a aVar3 = DatabaseInfoActivity.c.a.f59720a;
            k1.r0 a11 = androidx.compose.runtime.l0.a(K0, aVar3, null, aVar2, 2);
            DatabaseInfoActivity.c cVar = (DatabaseInfoActivity.c) a11.getValue();
            if (kotlin.jvm.internal.u.e(cVar, aVar3)) {
                aVar2.s(-1084461055);
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.x0.e(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), it);
                androidx.compose.ui.layout.l0 b10 = androidx.compose.material.n3.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
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
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.material.f5.b(0.0f, 0, 0, 31, 0L, 0L, aVar2, null);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    aVar2.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else if (cVar instanceof DatabaseInfoActivity.c.b) {
                aVar2.s(-1084460675);
                DatabaseInfoActivity.c cVar2 = (DatabaseInfoActivity.c) a11.getValue();
                kotlin.jvm.internal.u.h(cVar2, "null cannot be cast to non-null type com.withings.wiscale2.settings.DatabaseInfoActivity.ScreenState.Success");
                DatabaseInfoActivity.A3(this.f60317b, ((DatabaseInfoActivity.c.b) cVar2).a(), aVar2, 64);
                aVar2.J();
            } else {
                aVar2.s(-1084460579);
                aVar2.J();
            }
        }
        return nm0.y.f85009a;
    }
}

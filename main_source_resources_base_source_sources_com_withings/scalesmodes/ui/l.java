package com.withings.scalesmodes.ui;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import com.withings.common.compose.component.v0;
import com.withings.scalesmodes.core.ScalesModes;
import d2.h1;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
import ym0.q;
/* compiled from: ScalesModeComposable.kt */
/* loaded from: classes4.dex */
final class l extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<c> f43958a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<ScalesModes, Boolean, y> f43959b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, List list) {
        super(3);
        this.f43958a = list;
        this.f43959b = pVar;
    }

    @Override // ym0.q
    public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        r0.h Card = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(Card, "$this$Card");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            List<c> list = this.f43958a;
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    c cVar = (c) obj;
                    b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, ((i1) aVar2.D(j1.e())).O(), h1.a());
                    androidx.compose.ui.e h11 = x0.h(b10, yk.h.o(), 0.0f, 2);
                    aVar2.s(1023050278);
                    p<ScalesModes, Boolean, y> pVar = this.f43959b;
                    boolean K = aVar2.K(pVar) | aVar2.K(cVar);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new k(pVar, cVar);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    j.d(cVar, h11, (ym0.a) t11, aVar2, 0, 0);
                    aVar2.s(50619262);
                    if (i11 != list.size() - 1) {
                        v0.b(0.0f, aVar2, 0, 1);
                    }
                    aVar2.J();
                    i11 = i12;
                } else {
                    x.K0();
                    throw null;
                }
            }
        }
        return y.f85009a;
    }
}

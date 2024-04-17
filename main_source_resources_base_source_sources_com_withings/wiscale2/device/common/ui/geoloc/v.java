package com.withings.wiscale2.device.common.ui.geoloc;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import com.withings.common.compose.component.d3;
import d2.h1;
import java.util.List;
/* compiled from: WeatherAirQualityScreen.kt */
/* loaded from: classes5.dex */
final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<com.withings.common.compose.component.e0> f53927a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f53928b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53929c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(List list, ym0.l lVar, int i11) {
        super(2);
        this.f53927a = list;
        this.f53928b = i11;
        this.f53929c = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) != 2 || !aVar2.h()) {
            b10 = androidx.compose.foundation.c.b(x0.f(androidx.compose.ui.e.f8927a, yk.h.b()), ((i1) aVar2.D(j1.e())).Z(), h1.a());
            Integer valueOf = Integer.valueOf(this.f53928b);
            aVar2.s(985657060);
            ym0.l<Integer, nm0.y> lVar = this.f53929c;
            boolean K = aVar2.K(lVar);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new u(lVar);
                aVar2.n(t11);
            }
            aVar2.J();
            d3.a(b10, this.f53927a, valueOf, false, 0L, null, (ym0.l) t11, aVar2, 64, 56);
        } else {
            aVar2.C();
        }
        return nm0.y.f85009a;
    }
}

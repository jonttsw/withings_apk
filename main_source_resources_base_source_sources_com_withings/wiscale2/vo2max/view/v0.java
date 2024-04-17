package com.withings.wiscale2.vo2max.view;

import androidx.compose.material.p8;
import java.util.List;
/* compiled from: Vo2MaxTextSelector.kt */
/* loaded from: classes5.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.r<u0.d0, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<String> f62843a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(List<String> list) {
        super(4);
        this.f62843a = list;
    }

    @Override // ym0.r
    public final nm0.y invoke(u0.d0 d0Var, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        k1.p1 p1Var;
        u0.d0 HorizontalPager = d0Var;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        num2.intValue();
        kotlin.jvm.internal.u.j(HorizontalPager, "$this$HorizontalPager");
        String str = this.f62843a.get(intValue);
        long B = ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).B();
        aVar2.s(-892373489);
        p1Var = yk.o.f109338j;
        aVar2.J();
        p8.b(str, androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), B, 0L, null, null, null, 0L, null, d3.g.a(3), 0L, 0, false, 0, 0, null, ((yk.x) aVar2.D(p1Var)).c(), aVar2, 48, 0, 65016);
        return nm0.y.f85009a;
    }
}

package com.withings.common.compose.component;

import java.util.ArrayList;
import java.util.List;
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
final class b2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<u1> f33428a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f33429b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.layout.p1 f33430c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f33431d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<androidx.compose.ui.layout.g1> f33432e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(List list, float f11, androidx.compose.ui.layout.p1 p1Var, int i11, ArrayList arrayList) {
        super(2);
        this.f33428a = list;
        this.f33429b = f11;
        this.f33430c = p1Var;
        this.f33431d = i11;
        this.f33432e = arrayList;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            List<u1> list = this.f33428a;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    u1 u1Var = (u1) obj;
                    float e11 = u1Var.e() * this.f33429b;
                    aVar2.s(1488251647);
                    if (u1Var.g().length() > 0 && u1Var.e() != 0.0f) {
                        androidx.compose.ui.e e12 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
                        androidx.compose.ui.layout.p1 p1Var = this.f33430c;
                        w1.i(e12, u1Var, k3.i.b(p1Var.v(e11), ((k3.h) pm0.a.c(k3.h.a(w1.j(u1Var)), k3.h.a(p1Var.u(this.f33432e.get(i11).l0())))).e()), p1Var.u(this.f33431d), aVar2, 6, 0);
                    }
                    aVar2.J();
                    arrayList.add(nm0.y.f85009a);
                    i11 = i12;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
        }
        return nm0.y.f85009a;
    }
}

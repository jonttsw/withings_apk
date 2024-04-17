package com.withings.common.compose.component;

import androidx.compose.ui.layout.g1;
import java.util.ArrayList;
import java.util.List;
import k3.b;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
final class o3 extends kotlin.jvm.internal.w implements ym0.l<g1.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f34489a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<androidx.compose.ui.layout.g1> f34490b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.layout.p1 f34491c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34492d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m3 f34493e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f34494f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f34495g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.n0 f34496h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.n0 f34497i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ ym0.q<List<s4>, androidx.compose.runtime.a, Integer, nm0.y> f34498j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(int i11, ArrayList arrayList, androidx.compose.ui.layout.p1 p1Var, ym0.p pVar, m3 m3Var, int i12, long j5, kotlin.jvm.internal.n0 n0Var, kotlin.jvm.internal.n0 n0Var2, ym0.q qVar) {
        super(1);
        this.f34489a = i11;
        this.f34490b = arrayList;
        this.f34491c = p1Var;
        this.f34492d = pVar;
        this.f34493e = m3Var;
        this.f34494f = i12;
        this.f34495g = j5;
        this.f34496h = n0Var;
        this.f34497i = n0Var2;
        this.f34498j = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(g1.a aVar) {
        androidx.compose.ui.layout.p1 p1Var;
        kotlin.jvm.internal.n0 n0Var;
        kotlin.jvm.internal.n0 n0Var2;
        g1.a layout = aVar;
        kotlin.jvm.internal.u.j(layout, "$this$layout");
        ArrayList arrayList = new ArrayList();
        List<androidx.compose.ui.layout.g1> list = this.f34490b;
        int size = list.size();
        int i11 = this.f34489a;
        int i12 = 0;
        int i13 = i11;
        while (true) {
            p1Var = this.f34491c;
            if (i12 >= size) {
                break;
            }
            androidx.compose.ui.layout.g1 g1Var = list.get(i12);
            g1.a.g(layout, g1Var, i13, 0);
            arrayList.add(new s4(p1Var.u(i13), p1Var.u(g1Var.z0())));
            i13 += g1Var.z0();
            i12++;
        }
        List<androidx.compose.ui.layout.k0> K0 = p1Var.K0(TabSlots.f33341b, this.f34492d);
        int size2 = K0.size();
        int i14 = 0;
        while (true) {
            n0Var = this.f34497i;
            n0Var2 = this.f34496h;
            if (i14 >= size2) {
                break;
            }
            int i15 = n0Var2.f76254a;
            androidx.compose.ui.layout.g1 P = K0.get(i14).P(k3.b.c(this.f34495g, i15, i15, 0, 0, 8));
            g1.a.g(layout, P, 0, n0Var.f76254a - P.l0());
            i14++;
        }
        List<androidx.compose.ui.layout.k0> K02 = p1Var.K0(TabSlots.f33342c, new s1.a(true, -2062334156, new n3(arrayList, this.f34498j)));
        int size3 = K02.size();
        for (int i16 = 0; i16 < size3; i16++) {
            g1.a.g(layout, K02.get(i16).P(b.a.c(n0Var2.f76254a, n0Var.f76254a)), 0, 0);
        }
        this.f34493e.b(p1Var, i11, arrayList, this.f34494f);
        return nm0.y.f85009a;
    }
}

package com.withings.common.compose.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
final class p3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.ui.layout.p1, k3.b, androidx.compose.ui.layout.m0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f34530a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f34531b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34532c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34533d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m3 f34534e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f34535f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.q<List<s4>, androidx.compose.runtime.a, Integer, nm0.y> f34536g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p3(float f11, float f12, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, m3 m3Var, int i11, ym0.q<? super List<s4>, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar) {
        super(2);
        this.f34530a = f11;
        this.f34531b = f12;
        this.f34532c = pVar;
        this.f34533d = pVar2;
        this.f34534e = m3Var;
        this.f34535f = i11;
        this.f34536g = qVar;
    }

    @Override // ym0.p
    public final androidx.compose.ui.layout.m0 invoke(androidx.compose.ui.layout.p1 p1Var, k3.b bVar) {
        Map<androidx.compose.ui.layout.a, Integer> map;
        androidx.compose.ui.layout.p1 SubcomposeLayout = p1Var;
        long n11 = bVar.n();
        kotlin.jvm.internal.u.j(SubcomposeLayout, "$this$SubcomposeLayout");
        int m02 = SubcomposeLayout.m0(this.f34530a);
        int m03 = SubcomposeLayout.m0(this.f34531b);
        long c11 = k3.b.c(n11, m02, 0, 0, 0, 14);
        List<androidx.compose.ui.layout.k0> K0 = SubcomposeLayout.K0(TabSlots.f33340a, this.f34532c);
        ArrayList arrayList = new ArrayList(K0.size());
        int size = K0.size();
        for (int i11 = 0; i11 < size; i11 = com.withings.authentication.d.a(K0.get(i11), c11, arrayList, i11, 1)) {
        }
        kotlin.jvm.internal.n0 n0Var = new kotlin.jvm.internal.n0();
        n0Var.f76254a = m03 * 2;
        kotlin.jvm.internal.n0 n0Var2 = new kotlin.jvm.internal.n0();
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            androidx.compose.ui.layout.g1 g1Var = (androidx.compose.ui.layout.g1) arrayList.get(i12);
            n0Var.f76254a = g1Var.z0() + n0Var.f76254a;
            n0Var2.f76254a = Math.max(n0Var2.f76254a, g1Var.l0());
        }
        int i13 = n0Var.f76254a;
        int i14 = n0Var2.f76254a;
        o3 o3Var = new o3(m03, arrayList, SubcomposeLayout, this.f34533d, this.f34534e, this.f34535f, n11, n0Var, n0Var2, this.f34536g);
        map = kotlin.collections.j0.f76190a;
        return SubcomposeLayout.g1(i13, i14, map, o3Var);
    }
}

package com.withings.common.compose.component;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
public final class c2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.ui.layout.p1, k3.b, androidx.compose.ui.layout.m0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<u1> f33547a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(List<u1> list) {
        super(2);
        this.f33547a = list;
    }

    @Override // ym0.p
    public final androidx.compose.ui.layout.m0 invoke(androidx.compose.ui.layout.p1 p1Var, k3.b bVar) {
        int i11;
        Map<androidx.compose.ui.layout.a, Integer> map;
        androidx.compose.ui.layout.p1 SubcomposeLayout = p1Var;
        long n11 = bVar.n();
        kotlin.jvm.internal.u.j(SubcomposeLayout, "$this$SubcomposeLayout");
        List<androidx.compose.ui.layout.k0> K0 = SubcomposeLayout.K0(ConstantsWs.WELLNESS_TASK_TYPE_MEASUREMENT, new s1.a(true, -1837924952, new a2(this.f33547a)));
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(K0, 10));
        for (androidx.compose.ui.layout.k0 k0Var : K0) {
            arrayList.add(k0Var.P(k3.b.c(n11, 0, 0, 0, 0, 14)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            int z02 = ((androidx.compose.ui.layout.g1) it.next()).z0();
            loop1: while (true) {
                i11 = z02;
                while (it.hasNext()) {
                    z02 = ((androidx.compose.ui.layout.g1) it.next()).z0();
                    if (i11 < z02) {
                        break;
                    }
                }
            }
            List<androidx.compose.ui.layout.k0> K02 = SubcomposeLayout.K0("main", new s1.a(true, -1444713039, new b2(this.f33547a, (k3.b.j(n11) - i11) - SubcomposeLayout.b1(yk.h.b()), SubcomposeLayout, i11, arrayList)));
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(K02, 10));
            for (androidx.compose.ui.layout.k0 k0Var2 : K02) {
                arrayList2.add(k0Var2.P(n11));
            }
            Iterator it2 = arrayList2.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                i12 += ((androidx.compose.ui.layout.g1) it2.next()).l0();
            }
            int b12 = i12 + ((int) (SubcomposeLayout.b1(v1.d()) * (arrayList2.size() - 1)));
            int j5 = k3.b.j(n11);
            z1 z1Var = new z1(arrayList2, SubcomposeLayout);
            map = kotlin.collections.j0.f76190a;
            return SubcomposeLayout.g1(j5, b12, map, z1Var);
        }
        throw new NoSuchElementException();
    }
}

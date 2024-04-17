package com.withings.wiscale2.partner.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerActivity.kt */
/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.w implements ym0.p<List<? extends d0>, List<? extends d0>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f58998a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(2);
        this.f58998a = gVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(List<? extends d0> list, List<? extends d0> list2) {
        List<? extends d0> imports = list;
        List<? extends d0> exports = list2;
        kotlin.jvm.internal.u.j(imports, "imports");
        kotlin.jvm.internal.u.j(exports, "exports");
        ArrayList L = kotlin.collections.x.L(kotlin.collections.x.W(imports, exports));
        ArrayList arrayList = new ArrayList();
        Iterator it = L.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            d0 d0Var = (d0) next;
            if (d0Var.c() && !d0Var.a()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((d0) it2.next()).b());
        }
        this.f58998a.postValue(arrayList2);
        return nm0.y.f85009a;
    }
}

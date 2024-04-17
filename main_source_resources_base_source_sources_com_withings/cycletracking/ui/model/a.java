package com.withings.cycletracking.ui.model;

import android.content.Context;
import en.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import wm.d;
import wm.i;
/* compiled from: SymptomUi.kt */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: Comparisons.kt */
    /* renamed from: com.withings.cycletracking.ui.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0473a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(Long.valueOf(((i) t11).c()), Long.valueOf(((i) t12).c()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final en.p a(android.content.Context r9, java.util.List<wm.i> r10, int r11, com.withings.cycletracking.ui.model.CycleType r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.model.a.a(android.content.Context, java.util.List, int, com.withings.cycletracking.ui.model.CycleType, boolean):en.p");
    }

    public static final ArrayList b(Context context, List list, boolean z5) {
        u.j(list, "<this>");
        u.j(context, "context");
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof d.C1823d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof d.c) {
                arrayList2.add(obj2);
            }
        }
        List<d> h02 = x.h0(list2, x.U0(x.l0(arrayList2, arrayList)));
        p[] pVarArr = new p[3];
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x.n(((d.C1823d) it.next()).d(), arrayList3);
        }
        pVarArr[0] = a(context, arrayList3, 3, CycleType.f35690b, z5);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            x.n(((d.c) it2.next()).d(), arrayList4);
        }
        pVarArr[1] = a(context, arrayList4, 3, CycleType.f35691c, z5);
        ArrayList arrayList5 = new ArrayList();
        for (d dVar : h02) {
            x.n(dVar.d(), arrayList5);
        }
        pVarArr[2] = a(context, arrayList5, 2, CycleType.f35692d, z5);
        return l.z(pVarArr);
    }

    public static final List c(Context context, List list) {
        u.j(list, "<this>");
        u.j(context, "context");
        return x.X(a(context, list, 3, CycleType.f35693e, true));
    }
}

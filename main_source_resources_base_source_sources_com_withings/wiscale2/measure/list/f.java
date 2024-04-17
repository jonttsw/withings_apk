package com.withings.wiscale2.measure.list;

import androidx.lifecycle.h0;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.measure.list.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: MeasureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.list.ListViewModel$listItems$1$1", f = "MeasureListActivity.kt", l = {224, 223}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<List<? extends d>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58537a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f58538b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f58539c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f58540d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, User user, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f58539c = gVar;
        this.f58540d = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f fVar = new f(this.f58539c, this.f58540d, dVar);
        fVar.f58538b = obj;
        return fVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<List<? extends d>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((f) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        i iVar;
        i iVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58537a;
        g gVar = this.f58539c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (h0) this.f58538b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (h0) this.f58538b;
            fy.n j02 = gVar.j0();
            long q11 = this.f58540d.q();
            int[] m02 = gVar.m0();
            int[] copyOf = Arrays.copyOf(m02, m02.length);
            this.f58538b = h0Var;
            this.f58537a = 1;
            obj = j02.a(q11, null, false, null, copyOf, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ArrayList f11 = hy.g.f((List) obj);
        ArrayList arrayList = new ArrayList();
        Iterator it = f11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            iVar2 = gVar.f58549i;
            if (iVar2.f((MeasuresGroup) next)) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            String i02 = g.i0(gVar, (MeasuresGroup) next2);
            Object obj2 = linkedHashMap.get(i02);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(i02, obj2);
            }
            ((List) obj2).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(0, new d.b((String) entry.getKey()));
            iVar = gVar.f58549i;
            arrayList3.addAll(iVar.a((List) entry.getValue()));
            kotlin.collections.x.n(arrayList3, arrayList2);
        }
        this.f58538b = null;
        this.f58537a = 2;
        if (h0Var.emit(arrayList2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}

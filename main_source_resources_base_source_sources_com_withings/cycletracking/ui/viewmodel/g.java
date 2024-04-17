package com.withings.cycletracking.ui.viewmodel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingFactorsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$sections$1", f = "CycleTrackingFactorsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends fr.a>, fr.a, qm0.d<? super List<? extends hk.k<fr.a>>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f35895a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ fr.a f35896b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleTrackingFactorsViewModel f35897c;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((fr.a) t11).e(), ((fr.a) t12).e());
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((fr.a) t12).e(), ((fr.a) t11).e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel, qm0.d<? super g> dVar) {
        super(3, dVar);
        this.f35897c = cycleTrackingFactorsViewModel;
    }

    @Override // ym0.q
    public final Object invoke(List<? extends fr.a> list, fr.a aVar, qm0.d<? super List<? extends hk.k<fr.a>>> dVar) {
        g gVar = new g(this.f35897c, dVar);
        gVar.f35895a = list;
        gVar.f35896b = aVar;
        return gVar.invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Comparator] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fn.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        fr.a aVar2 = this.f35896b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f35895a) {
            fr.a aVar3 = (fr.a) obj2;
            if (!aVar3.b() && aVar3.f() != 10) {
                arrayList.add(obj2);
            }
        }
        Iterable D0 = kotlin.collections.x.D0(arrayList, new Object());
        if (aVar2 != null) {
            D0 = kotlin.collections.x.g0(D0, aVar2);
        }
        List D02 = kotlin.collections.x.D0(D0, new Object());
        aVar = this.f35897c.f35765c;
        return aVar.b(aVar2, D02);
    }
}

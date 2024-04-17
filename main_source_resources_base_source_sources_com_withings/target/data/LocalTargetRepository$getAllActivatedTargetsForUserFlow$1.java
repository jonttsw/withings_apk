package com.withings.target.data;

import com.withings.target.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.o;
import nm0.y;
import pm0.a;
import qm0.d;
import ym0.p;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/target/Target;", "targets"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.data.LocalTargetRepository$getAllActivatedTargetsForUserFlow$1", f = "LocalTargetRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$getAllActivatedTargetsForUserFlow$1 extends i implements p<List<? extends Target>, d<? super List<? extends Target>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalTargetRepository$getAllActivatedTargetsForUserFlow$1(d<? super LocalTargetRepository$getAllActivatedTargetsForUserFlow$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        LocalTargetRepository$getAllActivatedTargetsForUserFlow$1 localTargetRepository$getAllActivatedTargetsForUserFlow$1 = new LocalTargetRepository$getAllActivatedTargetsForUserFlow$1(dVar);
        localTargetRepository$getAllActivatedTargetsForUserFlow$1.L$0 = obj;
        return localTargetRepository$getAllActivatedTargetsForUserFlow$1;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Target> list, d<? super List<? extends Target>> dVar) {
        return invoke2((List<Target>) list, (d<? super List<Target>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : x.D0((List) this.L$0, new Comparator() { // from class: com.withings.target.data.LocalTargetRepository$getAllActivatedTargetsForUserFlow$1$invokeSuspend$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return a.b(((Target) t12).getModified(), ((Target) t11).getModified());
                }
            })) {
                Target target = (Target) obj2;
                if (hashSet.add(new o(new Integer(target.getType()), new Integer(target.getMeasureType()), new Integer(target.getRange())))) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Target> list, d<? super List<Target>> dVar) {
        return ((LocalTargetRepository$getAllActivatedTargetsForUserFlow$1) create(list, dVar)).invokeSuspend(y.f85009a);
    }
}

package com.withings.wiscale2.activity.workout.ui.detail;

import bj0.f;
import com.withings.wiscale2.activity.workout.ui.detail.o7;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPreviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$workoutCountByCategory$1", f = "WorkoutPreviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class t7 extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<WorkoutCategory>, List<? extends f.b>, qm0.d<? super List<? extends o7.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f49659a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f49660b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.activity.workout.ui.detail.t7, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.q
    public final Object invoke(List<WorkoutCategory> list, List<? extends f.b> list2, qm0.d<? super List<? extends o7.a>> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f49659a = list;
        iVar.f49660b = list2;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        o7.a aVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List list = this.f49659a;
        ArrayList arrayList = new ArrayList();
        for (f.b bVar : this.f49660b) {
            kotlin.jvm.internal.u.g(list);
            Iterator it = list.iterator();
            while (true) {
                aVar = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((WorkoutCategory) obj2).getId() == bVar.a()) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            WorkoutCategory workoutCategory = (WorkoutCategory) obj2;
            if (workoutCategory != null) {
                aVar = new o7.a(workoutCategory, bVar.b());
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}

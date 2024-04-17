package com.withings.wiscale2.activity.workout.category.ui;

import android.content.Context;
import androidx.lifecycle.h0;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.workout.category.model.WorkoutCategory;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.category.ui.ChooseCategoryViewModel$workoutCategoriesSections$1$1", f = "ChooseWorkoutCategoryActivity.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<List<? extends wk.k<WorkoutCategory>>>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48695a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f48696b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<WorkoutCategory> f48697c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f48698d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChooseWorkoutCategoryActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.p<WorkoutCategory, WorkoutCategory, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f48699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(2);
            this.f48699a = bVar;
        }

        @Override // ym0.p
        public final Integer invoke(WorkoutCategory workoutCategory, WorkoutCategory workoutCategory2) {
            Context context;
            Context context2;
            Collator collator = Collator.getInstance();
            b bVar = this.f48699a;
            context = bVar.f48674b;
            String name = workoutCategory.getName(context);
            context2 = bVar.f48674b;
            return Integer.valueOf(collator.compare(name, workoutCategory2.getName(context2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List<WorkoutCategory> list, b bVar, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f48697c = list;
        this.f48698d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        f fVar = new f(this.f48697c, this.f48698d, dVar);
        fVar.f48696b = obj;
        return fVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<List<? extends wk.k<WorkoutCategory>>> h0Var, qm0.d<? super y> dVar) {
        return ((f) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j5;
        WorkoutManager workoutManager;
        List<WorkoutCategory> list;
        i0 i0Var;
        i0 i0Var2;
        Context context;
        List list2;
        Context context2;
        i0 i0Var3;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48695a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            h0 h0Var = (h0) this.f48696b;
            List<WorkoutCategory> allCategories = this.f48697c;
            u.i(allCategories, "$allCategories");
            b bVar = this.f48698d;
            j5 = bVar.f48673a;
            workoutManager = bVar.f48676d;
            u.j(workoutManager, "workoutManager");
            if (!allCategories.isEmpty()) {
                list = allCategories;
            } else {
                list = null;
            }
            i0 i0Var4 = i0.f76187a;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Number number : workoutManager.getLastConfirmedTracksCategoriesIdsFor(j5, 3)) {
                    int intValue = number.intValue();
                    Iterator<T> it = allCategories.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            i0Var3 = i0Var4;
                            if (((WorkoutCategory) obj2).getId() == intValue) {
                                break;
                            }
                            i0Var4 = i0Var3;
                        } else {
                            i0Var3 = i0Var4;
                            obj2 = null;
                            break;
                        }
                    }
                    WorkoutCategory workoutCategory = (WorkoutCategory) obj2;
                    if (workoutCategory != null) {
                        arrayList.add(workoutCategory);
                    }
                    i0Var4 = i0Var3;
                }
                i0Var = i0Var4;
                i0Var2 = arrayList;
            } else {
                i0Var = i0Var4;
                i0Var2 = i0Var;
            }
            context = bVar.f48674b;
            wk.k<WorkoutCategory> a11 = o.a(i0Var2, context, null);
            if (allCategories.isEmpty()) {
                allCategories = null;
            }
            if (allCategories != null) {
                final a aVar = new a(bVar);
                list2 = x.D0(allCategories, new Comparator() { // from class: com.withings.wiscale2.activity.workout.category.ui.e
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ((Number) ym0.p.this.invoke(obj3, obj4)).intValue();
                    }
                });
            } else {
                list2 = i0Var;
            }
            context2 = bVar.f48674b;
            List W = x.W(a11, o.a(list2, context2, new Integer((int) C1987R.string.homescreen_allWorkouts_title)));
            this.f48695a = 1;
            if (h0Var.emit(W, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}

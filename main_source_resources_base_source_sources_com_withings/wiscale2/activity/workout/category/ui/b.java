package com.withings.wiscale2.activity.workout.category.ui;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.workout.category.model.WorkoutCategoryMigrationHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import ri0.l0;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
/* loaded from: classes4.dex */
public final class b extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f48673a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f48674b;

    /* renamed from: c  reason: collision with root package name */
    private final ax.h f48675c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkoutManager f48676d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f48677e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f48678f;

    /* compiled from: ChooseWorkoutCategoryActivity.kt */
    /* loaded from: classes4.dex */
    public final class a extends j0<List<? extends WorkoutCategory>> implements CoroutineScope, WorkoutCategoryManager.Listener {

        /* renamed from: a  reason: collision with root package name */
        private final qm0.f f48679a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f48680b;

        /* renamed from: c  reason: collision with root package name */
        private final long f48681c;

        /* renamed from: d  reason: collision with root package name */
        private final WorkoutCategoryManager f48682d;

        /* renamed from: e  reason: collision with root package name */
        private final WorkoutCategoryMigrationHelper f48683e;

        /* renamed from: f  reason: collision with root package name */
        private final t00.d f48684f;

        /* renamed from: g  reason: collision with root package name */
        private final l0 f48685g;

        /* compiled from: ChooseWorkoutCategoryActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.category.ui.ChooseCategoryViewModel$WorkoutCategoriesLiveData$onCategoriesChanged$1", f = "ChooseWorkoutCategoryActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.activity.workout.category.ui.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0669a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {
            C0669a(qm0.d<? super C0669a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new C0669a(dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((C0669a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                a.A(a.this);
                return y.f85009a;
            }
        }

        public a(qm0.f coroutineContext, Context context, long j5, WorkoutCategoryManager workoutCategoryManager, WorkoutCategoryMigrationHelper workoutCategoryMigrationHelper, t00.d networkSyncManager, l0 l0Var) {
            u.j(coroutineContext, "coroutineContext");
            u.j(workoutCategoryManager, "workoutCategoryManager");
            u.j(networkSyncManager, "networkSyncManager");
            this.f48679a = coroutineContext;
            this.f48680b = context;
            this.f48681c = j5;
            this.f48682d = workoutCategoryManager;
            this.f48683e = workoutCategoryMigrationHelper;
            this.f48684f = networkSyncManager;
            this.f48685g = l0Var;
            BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new com.withings.wiscale2.activity.workout.category.ui.a(this, null), 2, null);
        }

        public static final void A(a aVar) {
            List<WorkoutCategory> workoutCategories = aVar.f48682d.getWorkoutCategories();
            u.i(workoutCategories, "getWorkoutCategories(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : workoutCategories) {
                WorkoutCategory workoutCategory = (WorkoutCategory) obj;
                if (workoutCategory.shouldBeDisplayed() && workoutCategory.getName(aVar.f48680b) != null) {
                    arrayList.add(obj);
                }
            }
            aVar.postValue(arrayList);
        }

        @Override // kotlinx.coroutines.CoroutineScope
        public final qm0.f getCoroutineContext() {
            return this.f48679a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
        public final void onActive() {
            super.onActive();
            this.f48682d.registerListener(this);
        }

        @Override // com.withings.workout.category.model.WorkoutCategoryManager.Listener
        public final void onCategoriesChanged(List<WorkoutCategory> list) {
            BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new C0669a(null), 2, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
        public final void onInactive() {
            this.f48682d.unregisterListener(this);
            super.onInactive();
        }
    }

    /* compiled from: ChooseWorkoutCategoryActivity.kt */
    /* renamed from: com.withings.wiscale2.activity.workout.category.ui.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0670b extends w implements ym0.l<List<WorkoutCategory>, LiveData<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0670b f48687a = new w(1);

        @Override // ym0.l
        public final LiveData<Boolean> invoke(List<WorkoutCategory> list) {
            return androidx.lifecycle.h.a(null, new com.withings.wiscale2.activity.workout.category.ui.c(list, null), 3);
        }
    }

    /* compiled from: ChooseWorkoutCategoryActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.l<List<WorkoutCategory>, LiveData<List<wk.k<WorkoutCategory>>>> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<wk.k<WorkoutCategory>>> invoke(List<WorkoutCategory> list) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new f(list, b.this, null), 2);
        }
    }

    public b(long j5, Context context, ax.h liveWorkoutManager, WorkoutManager workoutManager, l0 l0Var, t00.d networkSyncManager, WorkoutCategoryManager workoutCategoryManager) {
        u.j(liveWorkoutManager, "liveWorkoutManager");
        u.j(workoutManager, "workoutManager");
        u.j(networkSyncManager, "networkSyncManager");
        u.j(workoutCategoryManager, "workoutCategoryManager");
        this.f48673a = j5;
        this.f48674b = context;
        this.f48675c = liveWorkoutManager;
        this.f48676d = workoutManager;
        WorkoutCategoryMigrationHelper workoutCategoryMigrationHelper = WorkoutCategoryMigrationHelper.get(context);
        qm0.f coroutineContext = h1.a(this).getCoroutineContext();
        u.g(workoutCategoryMigrationHelper);
        a aVar = new a(coroutineContext, context, j5, workoutCategoryManager, workoutCategoryMigrationHelper, networkSyncManager, l0Var);
        this.f48677e = e1.c(aVar, C0670b.f48687a);
        this.f48678f = e1.c(aVar, new c());
    }

    public final j0 k0() {
        return this.f48677e;
    }

    public final j0 m0() {
        return this.f48678f;
    }
}

package com.withings.wiscale2.activity.workout.category.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import com.withings.wiscale2.activity.workout.category.ui.b;
import com.withings.workout.category.model.WorkoutCategoryMigrationHelper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ri0.l0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChooseWorkoutCategoryActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.category.ui.ChooseCategoryViewModel$WorkoutCategoriesLiveData$1", f = "ChooseWorkoutCategoryActivity.kt", l = {ConstantsWs.WS_STATUS_MISSING}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48671a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b.a f48672b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b.a aVar, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f48672b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f48672b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WorkoutCategoryMigrationHelper workoutCategoryMigrationHelper;
        t00.d dVar;
        l0 l0Var;
        long j5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48671a;
        b.a aVar = this.f48672b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            workoutCategoryMigrationHelper = aVar.f48683e;
            if (workoutCategoryMigrationHelper.shouldRedownloadCategories()) {
                dVar = aVar.f48684f;
                l0Var = aVar.f48685g;
                j5 = aVar.f48681c;
                ActionSyncJob a11 = l0Var.a(j5);
                this.f48671a = 1;
                if (t00.g.a(dVar, a11, "choose_workout_category_view", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        b.a.A(aVar);
        return y.f85009a;
    }
}

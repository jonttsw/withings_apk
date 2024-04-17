package com.withings.workout.category.webservices;

import com.withings.workout.category.model.WorkoutCategory;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitWorkoutCategoryRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/workout/category/model/WorkoutCategory$Response;", "Lcom/withings/workout/category/webservices/WorkoutCategoryRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.workout.category.webservices.RetrofitWorkoutCategoryRemoteRepository$getCategories$3", f = "RetrofitWorkoutCategoryRemoteRepository.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetrofitWorkoutCategoryRemoteRepository$getCategories$3 extends i implements p<WorkoutCategoryRetrofit2Api, d<? super WorkoutCategory.Response>, Object> {
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitWorkoutCategoryRemoteRepository$getCategories$3(long j5, long j11, d<? super RetrofitWorkoutCategoryRemoteRepository$getCategories$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$lastUpdate = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitWorkoutCategoryRemoteRepository$getCategories$3 retrofitWorkoutCategoryRemoteRepository$getCategories$3 = new RetrofitWorkoutCategoryRemoteRepository$getCategories$3(this.$userId, this.$lastUpdate, dVar);
        retrofitWorkoutCategoryRemoteRepository$getCategories$3.L$0 = obj;
        return retrofitWorkoutCategoryRemoteRepository$getCategories$3;
    }

    @Override // ym0.p
    public final Object invoke(WorkoutCategoryRetrofit2Api workoutCategoryRetrofit2Api, d<? super WorkoutCategory.Response> dVar) {
        return ((RetrofitWorkoutCategoryRemoteRepository$getCategories$3) create(workoutCategoryRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            long j5 = this.$userId;
            long j11 = this.$lastUpdate;
            this.label = 1;
            obj = ((WorkoutCategoryRetrofit2Api) this.L$0).getCategories(j5, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}

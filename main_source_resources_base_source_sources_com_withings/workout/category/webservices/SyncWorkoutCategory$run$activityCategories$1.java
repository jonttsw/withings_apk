package com.withings.workout.category.webservices;

import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SyncWorkoutCategory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/workout/category/model/WorkoutCategory;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.workout.category.webservices.SyncWorkoutCategory$run$activityCategories$1", f = "SyncWorkoutCategory.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SyncWorkoutCategory$run$activityCategories$1 extends i implements p<CoroutineScope, d<? super List<WorkoutCategory>>, Object> {
    final /* synthetic */ long $lastUpdateSeconds;
    final /* synthetic */ WorkoutCategoryRemoteRepository $workoutCategoryApi;
    int label;
    final /* synthetic */ SyncWorkoutCategory this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncWorkoutCategory$run$activityCategories$1(WorkoutCategoryRemoteRepository workoutCategoryRemoteRepository, SyncWorkoutCategory syncWorkoutCategory, long j5, d<? super SyncWorkoutCategory$run$activityCategories$1> dVar) {
        super(2, dVar);
        this.$workoutCategoryApi = workoutCategoryRemoteRepository;
        this.this$0 = syncWorkoutCategory;
        this.$lastUpdateSeconds = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SyncWorkoutCategory$run$activityCategories$1(this.$workoutCategoryApi, this.this$0, this.$lastUpdateSeconds, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j5;
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
            WorkoutCategoryRemoteRepository workoutCategoryRemoteRepository = this.$workoutCategoryApi;
            j5 = this.this$0.userId;
            long j11 = this.$lastUpdateSeconds;
            this.label = 1;
            obj = workoutCategoryRemoteRepository.getCategories(j5, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return ((WorkoutCategory.Response) obj).categories;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super List<WorkoutCategory>> dVar) {
        return ((SyncWorkoutCategory$run$activityCategories$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}

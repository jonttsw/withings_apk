package com.withings.workout.category.webservices;

import com.withings.workout.category.model.WorkoutCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitWorkoutCategoryRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/workout/category/model/WorkoutCategory$Response;", "Lcom/withings/workout/category/webservices/WorkoutCategoryRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RetrofitWorkoutCategoryRemoteRepository$getCategories$2 extends w implements l<WorkoutCategoryRetrofit1Api, WorkoutCategory.Response> {
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitWorkoutCategoryRemoteRepository$getCategories$2(long j5, long j11) {
        super(1);
        this.$userId = j5;
        this.$lastUpdate = j11;
    }

    @Override // ym0.l
    public final WorkoutCategory.Response invoke(WorkoutCategoryRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getCategories(this.$userId, this.$lastUpdate);
    }
}

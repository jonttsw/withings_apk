package com.withings.workout.category.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.Metadata;
import qm0.d;
/* compiled from: WorkoutCategoryRemoteRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withings/workout/category/webservices/WorkoutCategoryRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/workout/category/webservices/WorkoutCategoryRemoteRepository;", "", NavigationArguments.USER_ID, "lastUpdate", "Lcom/withings/workout/category/model/WorkoutCategory$Response;", "getCategories", "(JJLqm0/d;)Ljava/lang/Object;", "core-data-workout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface WorkoutCategoryRemoteRepository {
    Object getCategories(long j5, long j11, d<? super WorkoutCategory.Response> dVar);

    WorkoutCategoryRemoteRepository withSyncContext(String str);
}

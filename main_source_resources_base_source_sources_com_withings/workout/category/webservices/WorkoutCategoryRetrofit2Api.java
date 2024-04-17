package com.withings.workout.category.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.workout.category.model.WorkoutCategory;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import qm0.d;
/* compiled from: WorkoutCategoryRetrofit2Api.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withings/workout/category/webservices/WorkoutCategoryRetrofit2Api;", "", "", NavigationArguments.USER_ID, "lastUpdate", "Lcom/withings/workout/category/model/WorkoutCategory$Response;", "getCategories", "(JJLqm0/d;)Ljava/lang/Object;", "core-data-workout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface WorkoutCategoryRetrofit2Api {
    @e
    @o("v2/subcategory?action=list")
    Object getCategories(@c("userid") long j5, @c("lastupdate") long j11, d<? super WorkoutCategory.Response> dVar);
}

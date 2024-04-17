package com.withings.workout.category.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: WorkoutCategoryRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/workout/category/webservices/WorkoutCategoryRetrofit1Api;", "", "getCategories", "Lcom/withings/workout/category/model/WorkoutCategory$Response;", NavigationArguments.USER_ID, "", "lastUpdate", "core-data-workout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WorkoutCategoryRetrofit1Api {
    @POST("/v2/subcategory?action=list")
    @FormUrlEncoded
    WorkoutCategory.Response getCategories(@Field("userid") long j5, @Field("lastupdate") long j11);
}

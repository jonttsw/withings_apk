package com.withings.wiscale2.food.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.food.model.MealNameResponse;
import com.withings.wiscale2.food.model.MealResponse;
import kotlin.Metadata;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: FoodRetrofit1Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J0\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH'¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/ws/FoodRetrofit1Api;", "", "getMealNames", "Lcom/withings/wiscale2/food/model/MealNameResponse;", NavigationArguments.USER_ID, "", "getMeals", "Lcom/withings/wiscale2/food/model/MealResponse;", "startDate", "", "endDate", ValidateElement.RangeValidateElement.METHOD, "", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FoodRetrofit1Api {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int RANGE_DAYS = 1;

    /* compiled from: FoodRetrofit1Api.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/food/ws/FoodRetrofit1Api$Companion;", "", "()V", "RANGE_DAYS", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int RANGE_DAYS = 1;

        private Companion() {
        }
    }

    @POST("/v2/meal?action=getmealname")
    @FormUrlEncoded
    MealNameResponse getMealNames(@Field("userid") long j5);

    @POST("/v2/meal?action=getaggregate")
    @FormUrlEncoded
    MealResponse getMeals(@Field("userid") long j5, @Field("startdateymd") String str, @Field("enddateymd") String str2, @Field("range") int i11);
}

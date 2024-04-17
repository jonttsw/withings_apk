package com.withings.wiscale2.food.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.food.model.MealNameResponse;
import com.withings.wiscale2.food.model.MealResponse;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import qm0.d;
/* compiled from: FoodRetrofit2Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/ws/FoodRetrofit2Api;", "", "", NavigationArguments.USER_ID, "Lcom/withings/wiscale2/food/model/MealNameResponse;", "getMealNames", "(JLqm0/d;)Ljava/lang/Object;", "", "startDate", "endDate", "", ValidateElement.RangeValidateElement.METHOD, "Lcom/withings/wiscale2/food/model/MealResponse;", "getMeals", "(JLjava/lang/String;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface FoodRetrofit2Api {
    @e
    @o("v2/meal?action=getmealname")
    Object getMealNames(@c("userid") long j5, d<? super MealNameResponse> dVar);

    @e
    @o("v2/meal?action=getaggregate")
    Object getMeals(@c("userid") long j5, @c("startdateymd") String str, @c("enddateymd") String str2, @c("range") int i11, d<? super MealResponse> dVar);
}

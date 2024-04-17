package com.withings.wiscale2.food.ui.display;

import com.withings.wiscale2.food.model.FoodDayData;
import com.withings.wiscale2.food.model.FoodWeekData;
import com.withings.wiscale2.food.model.MealAggregate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Days;
import rs.e;
/* compiled from: FoodWeekViewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodWeekViewModel;", "", "Lcom/withings/wiscale2/food/model/FoodDayData;", "foodDayData", "Lnm0/y;", "addFoodDatum", "(Lcom/withings/wiscale2/food/model/FoodDayData;)V", "", "Lrs/e;", "foodDatumList", "Ljava/util/List;", "getFoodDatumList", "()Ljava/util/List;", "setFoodDatumList", "(Ljava/util/List;)V", "Lcom/withings/wiscale2/food/model/FoodWeekData;", "foodWeekData", "<init>", "(Lcom/withings/wiscale2/food/model/FoodWeekData;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodWeekViewModel {
    public static final int $stable = 8;
    private List<e> foodDatumList;

    public FoodWeekViewModel(FoodWeekData foodWeekData) {
        u.j(foodWeekData, "foodWeekData");
        this.foodDatumList = new ArrayList();
        for (FoodDayData foodDayData : foodWeekData.getFoodDayDatas()) {
            addFoodDatum(foodDayData);
        }
    }

    private final void addFoodDatum(FoodDayData foodDayData) {
        DateTime dateTime;
        float f11;
        DateTime withTimeAtStartOfDay;
        MealAggregate dailyMealAggregate = foodDayData.getDailyMealAggregate();
        if (dailyMealAggregate.getLastMealDate() != null) {
            DateTime date = dailyMealAggregate.getDate();
            if (date != null && (withTimeAtStartOfDay = date.withTimeAtStartOfDay()) != null) {
                dateTime = withTimeAtStartOfDay.withDayOfWeek(1);
            } else {
                dateTime = null;
            }
            float days = Days.daysBetween(dateTime, dailyMealAggregate.getLastMealDate()).getDays();
            Float calories = dailyMealAggregate.getCalories();
            if (calories != null) {
                f11 = calories.floatValue();
            } else {
                f11 = 1.0f;
            }
            e eVar = new e(new e.a(days, f11));
            eVar.f95625j = foodDayData;
            this.foodDatumList.add(eVar);
        }
    }

    public final List<e> getFoodDatumList() {
        return this.foodDatumList;
    }

    public final void setFoodDatumList(List<e> list) {
        u.j(list, "<set-?>");
        this.foodDatumList = list;
    }
}

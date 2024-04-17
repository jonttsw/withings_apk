package com.withings.wiscale2.food.ui.display;

import com.withings.wiscale2.food.model.FoodWeekData;
import com.withings.wiscale2.food.model.MealName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FoodWeekFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodWeekDataHolder;", "", "foodWeekData", "Lcom/withings/wiscale2/food/model/FoodWeekData;", "mealNames", "", "Lcom/withings/wiscale2/food/model/MealName;", "(Lcom/withings/wiscale2/food/model/FoodWeekData;Ljava/util/List;)V", "getFoodWeekData", "()Lcom/withings/wiscale2/food/model/FoodWeekData;", "setFoodWeekData", "(Lcom/withings/wiscale2/food/model/FoodWeekData;)V", "getMealNames", "()Ljava/util/List;", "setMealNames", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FoodWeekDataHolder {
    public static final int $stable = 8;
    private FoodWeekData foodWeekData;
    private List<MealName> mealNames;

    public FoodWeekDataHolder(FoodWeekData foodWeekData, List<MealName> mealNames) {
        u.j(foodWeekData, "foodWeekData");
        u.j(mealNames, "mealNames");
        this.foodWeekData = foodWeekData;
        this.mealNames = mealNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FoodWeekDataHolder copy$default(FoodWeekDataHolder foodWeekDataHolder, FoodWeekData foodWeekData, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            foodWeekData = foodWeekDataHolder.foodWeekData;
        }
        if ((i11 & 2) != 0) {
            list = foodWeekDataHolder.mealNames;
        }
        return foodWeekDataHolder.copy(foodWeekData, list);
    }

    public final FoodWeekData component1() {
        return this.foodWeekData;
    }

    public final List<MealName> component2() {
        return this.mealNames;
    }

    public final FoodWeekDataHolder copy(FoodWeekData foodWeekData, List<MealName> mealNames) {
        u.j(foodWeekData, "foodWeekData");
        u.j(mealNames, "mealNames");
        return new FoodWeekDataHolder(foodWeekData, mealNames);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodWeekDataHolder)) {
            return false;
        }
        FoodWeekDataHolder foodWeekDataHolder = (FoodWeekDataHolder) obj;
        if (u.e(this.foodWeekData, foodWeekDataHolder.foodWeekData) && u.e(this.mealNames, foodWeekDataHolder.mealNames)) {
            return true;
        }
        return false;
    }

    public final FoodWeekData getFoodWeekData() {
        return this.foodWeekData;
    }

    public final List<MealName> getMealNames() {
        return this.mealNames;
    }

    public int hashCode() {
        return this.mealNames.hashCode() + (this.foodWeekData.hashCode() * 31);
    }

    public final void setFoodWeekData(FoodWeekData foodWeekData) {
        u.j(foodWeekData, "<set-?>");
        this.foodWeekData = foodWeekData;
    }

    public final void setMealNames(List<MealName> list) {
        u.j(list, "<set-?>");
        this.mealNames = list;
    }

    public String toString() {
        FoodWeekData foodWeekData = this.foodWeekData;
        List<MealName> list = this.mealNames;
        return "FoodWeekDataHolder(foodWeekData=" + foodWeekData + ", mealNames=" + list + ")";
    }
}

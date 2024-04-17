package com.withings.wiscale2.food.model;

import androidx.appcompat.app.h;
import com.withings.wiscale2.food.model.MealAggregate;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: FoodWeekData.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001,B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\rJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\rJ\b\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020\rH\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000f¨\u0006-"}, d2 = {"Lcom/withings/wiscale2/food/model/FoodWeekData;", "", "foodDayDatas", "", "Lcom/withings/wiscale2/food/model/FoodDayData;", "allWeekMeals", "Lcom/withings/wiscale2/food/model/Meal;", "(Ljava/util/List;Ljava/util/List;)V", "averageAggregate", "Lcom/withings/wiscale2/food/model/MealAggregate;", "getAverageAggregate", "()Lcom/withings/wiscale2/food/model/MealAggregate;", "averageEaten", "", "getAverageEaten", "()I", "getFoodDayDatas", "()Ljava/util/List;", "maxBudget", "getMaxBudget", "numberOfDayWithData", "getNumberOfDayWithData", "sumAggregate", "getSumAggregate", "timesOverBudget", "getTimesOverBudget", "timesUnderBudget", "getTimesUnderBudget", "totalEaten", "getTotalEaten", "getAverageForValue", "value", "", "getAverageTotal", "getFoodDayData", FoodDayFragment.ARG_DAY, "getFoodWeekDaysData", "Lcom/withings/wiscale2/food/model/FoodWeekData$FoodWeekDaysData;", "getMealAvgForMealName", "mealName", "Lcom/withings/wiscale2/food/model/MealName;", "getMealSumForMealName", "getMealsForMealName", "getTotal", "FoodWeekDaysData", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FoodWeekData {
    public static final int $stable = 8;
    private final MealAggregate averageAggregate;
    private final List<FoodDayData> foodDayDatas;
    private final MealAggregate sumAggregate;

    /* compiled from: FoodWeekData.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/withings/wiscale2/food/model/FoodWeekData$FoodWeekDaysData;", "", "totalWithEmptyDays", "", "totalWithoutEmptyDays", "(II)V", "getTotalWithEmptyDays", "()I", "setTotalWithEmptyDays", "(I)V", "getTotalWithoutEmptyDays", "setTotalWithoutEmptyDays", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FoodWeekDaysData {
        public static final int $stable = 8;
        private int totalWithEmptyDays;
        private int totalWithoutEmptyDays;

        public FoodWeekDaysData(int i11, int i12) {
            this.totalWithEmptyDays = i11;
            this.totalWithoutEmptyDays = i12;
        }

        public static /* synthetic */ FoodWeekDaysData copy$default(FoodWeekDaysData foodWeekDaysData, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = foodWeekDaysData.totalWithEmptyDays;
            }
            if ((i13 & 2) != 0) {
                i12 = foodWeekDaysData.totalWithoutEmptyDays;
            }
            return foodWeekDaysData.copy(i11, i12);
        }

        public final int component1() {
            return this.totalWithEmptyDays;
        }

        public final int component2() {
            return this.totalWithoutEmptyDays;
        }

        public final FoodWeekDaysData copy(int i11, int i12) {
            return new FoodWeekDaysData(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FoodWeekDaysData)) {
                return false;
            }
            FoodWeekDaysData foodWeekDaysData = (FoodWeekDaysData) obj;
            if (this.totalWithEmptyDays == foodWeekDaysData.totalWithEmptyDays && this.totalWithoutEmptyDays == foodWeekDaysData.totalWithoutEmptyDays) {
                return true;
            }
            return false;
        }

        public final int getTotalWithEmptyDays() {
            return this.totalWithEmptyDays;
        }

        public final int getTotalWithoutEmptyDays() {
            return this.totalWithoutEmptyDays;
        }

        public int hashCode() {
            return Integer.hashCode(this.totalWithoutEmptyDays) + (Integer.hashCode(this.totalWithEmptyDays) * 31);
        }

        public final void setTotalWithEmptyDays(int i11) {
            this.totalWithEmptyDays = i11;
        }

        public final void setTotalWithoutEmptyDays(int i11) {
            this.totalWithoutEmptyDays = i11;
        }

        public String toString() {
            return h.c("FoodWeekDaysData(totalWithEmptyDays=", this.totalWithEmptyDays, ", totalWithoutEmptyDays=", this.totalWithoutEmptyDays, ")");
        }
    }

    public FoodWeekData(List<FoodDayData> foodDayDatas, List<? extends Meal> allWeekMeals) {
        u.j(foodDayDatas, "foodDayDatas");
        u.j(allWeekMeals, "allWeekMeals");
        this.foodDayDatas = foodDayDatas;
        MealAggregate.Companion companion = MealAggregate.Companion;
        this.averageAggregate = companion.createAverage(allWeekMeals);
        this.sumAggregate = companion.createSum(allWeekMeals);
    }

    private final int getAverageForValue(float f11) {
        if (getNumberOfDayWithData() == 0) {
            return 0;
        }
        return Math.round(f11 / getNumberOfDayWithData());
    }

    private final FoodWeekDaysData getFoodWeekDaysData() {
        int i11 = 0;
        int i12 = 0;
        for (FoodDayData foodDayData : this.foodDayDatas) {
            i11 += foodDayData.getTotalBudget();
            if (foodDayData.getEatenCalories() > 0) {
                i12 = foodDayData.getTotalBudget() + i12;
            }
        }
        return new FoodWeekDaysData(i11, i12);
    }

    private final List<Meal> getMealsForMealName(MealName mealName) {
        List<FoodDayData> list = this.foodDayDatas;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (FoodDayData foodDayData : list) {
            arrayList.add(foodDayData.getMealForMealName(mealName));
        }
        return x.G(arrayList);
    }

    private final int getTotal() {
        FoodWeekDaysData foodWeekDaysData = getFoodWeekDaysData();
        if (foodWeekDaysData.getTotalWithoutEmptyDays() > 0) {
            return foodWeekDaysData.getTotalWithoutEmptyDays();
        }
        return foodWeekDaysData.getTotalWithEmptyDays();
    }

    public final MealAggregate getAverageAggregate() {
        return this.averageAggregate;
    }

    public final int getAverageEaten() {
        return getAverageForValue(getTotalEaten());
    }

    public final int getAverageTotal() {
        FoodWeekDaysData foodWeekDaysData = getFoodWeekDaysData();
        if (foodWeekDaysData.getTotalWithoutEmptyDays() == 0) {
            return foodWeekDaysData.getTotalWithEmptyDays() / this.foodDayDatas.size();
        }
        return getAverageForValue(foodWeekDaysData.getTotalWithoutEmptyDays());
    }

    public final FoodDayData getFoodDayData(int i11) {
        Object obj;
        Iterator<T> it = this.foodDayDatas.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                DateTime date = ((FoodDayData) obj).getDailyMealAggregate().getDate();
                if (date != null && date.getDayOfWeek() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (FoodDayData) obj;
    }

    public final List<FoodDayData> getFoodDayDatas() {
        return this.foodDayDatas;
    }

    public final int getMaxBudget() {
        Object obj;
        Iterator<T> it = this.foodDayDatas.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                int totalBudget = ((FoodDayData) next).getTotalBudget();
                do {
                    Object next2 = it.next();
                    int totalBudget2 = ((FoodDayData) next2).getTotalBudget();
                    if (totalBudget < totalBudget2) {
                        next = next2;
                        totalBudget = totalBudget2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        FoodDayData foodDayData = (FoodDayData) obj;
        if (foodDayData != null) {
            return foodDayData.getTotalBudget();
        }
        return 0;
    }

    public final MealAggregate getMealAvgForMealName(MealName mealName) {
        u.j(mealName, "mealName");
        return MealAggregate.Companion.createAverage(getMealsForMealName(mealName));
    }

    public final MealAggregate getMealSumForMealName(MealName mealName) {
        u.j(mealName, "mealName");
        return MealAggregate.Companion.createSum(getMealsForMealName(mealName));
    }

    public final int getNumberOfDayWithData() {
        List<FoodDayData> list = this.foodDayDatas;
        int i11 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (FoodDayData foodDayData : list) {
                if (foodDayData.getEatenCalories() > 0 && (i11 = i11 + 1) < 0) {
                    x.J0();
                    throw null;
                }
            }
        }
        return i11;
    }

    public final MealAggregate getSumAggregate() {
        return this.sumAggregate;
    }

    public final int getTimesOverBudget() {
        List<FoodDayData> list = this.foodDayDatas;
        int i11 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (FoodDayData foodDayData : list) {
                if (foodDayData.getEatenCalories() > foodDayData.getTotalBudget() && (i11 = i11 + 1) < 0) {
                    x.J0();
                    throw null;
                }
            }
        }
        return i11;
    }

    public final int getTimesUnderBudget() {
        List<FoodDayData> list = this.foodDayDatas;
        int i11 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (FoodDayData foodDayData : list) {
                if (foodDayData.getEatenCalories() > 0 && foodDayData.getEatenCalories() < foodDayData.getInitialBudget() && (i11 = i11 + 1) < 0) {
                    x.J0();
                    throw null;
                }
            }
        }
        return i11;
    }

    public final int getTotalEaten() {
        int i11 = 0;
        for (FoodDayData foodDayData : this.foodDayDatas) {
            i11 += foodDayData.getEatenCalories();
        }
        return i11;
    }
}

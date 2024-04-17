package com.withings.wiscale2.food.model;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTimeConstants;
/* compiled from: FoodDayData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/withings/wiscale2/food/model/FoodDayData;", "", "bmr", "", "deficit", "", "totalCalories", "earnedCalories", "gender", "dailyMealAggregate", "Lcom/withings/wiscale2/food/model/MealAggregate;", "(DIIIILcom/withings/wiscale2/food/model/MealAggregate;)V", "bmrDay", "getBmrDay", "()I", "bmrDayWithDeficit", "getBmrDayWithDeficit", "getDailyMealAggregate", "()Lcom/withings/wiscale2/food/model/MealAggregate;", "setDailyMealAggregate", "(Lcom/withings/wiscale2/food/model/MealAggregate;)V", "getEarnedCalories", "eatenCalories", "getEatenCalories", "initialBudget", "getInitialBudget", "minBudget", "totalBudget", "getTotalBudget", "getMealForMealName", "Lcom/withings/wiscale2/food/model/Meal;", "mealName", "Lcom/withings/wiscale2/food/model/MealName;", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FoodDayData {
    private static final int MIN_BUDGET_MAN = 1500;
    private static final int MIN_BUDGET_WOMAN = 1200;
    private final double bmr;
    private MealAggregate dailyMealAggregate;
    private final int deficit;
    private final int earnedCalories;
    private final int minBudget;
    private final int totalCalories;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FoodDayData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/food/model/FoodDayData$Companion;", "", "()V", "MIN_BUDGET_MAN", "", "MIN_BUDGET_WOMAN", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public FoodDayData(double d11, int i11, int i12, int i13, int i14, MealAggregate dailyMealAggregate) {
        int i15;
        u.j(dailyMealAggregate, "dailyMealAggregate");
        this.bmr = d11;
        this.deficit = i11;
        this.totalCalories = i12;
        this.earnedCalories = i13;
        this.dailyMealAggregate = dailyMealAggregate;
        if (i14 == 0) {
            i15 = 1500;
        } else {
            i15 = MIN_BUDGET_WOMAN;
        }
        this.minBudget = i15;
    }

    public final int getBmrDay() {
        return (int) Math.round(this.bmr * ((double) DateTimeConstants.MINUTES_PER_DAY));
    }

    public final int getBmrDayWithDeficit() {
        return (int) (this.bmr + this.deficit);
    }

    public final MealAggregate getDailyMealAggregate() {
        return this.dailyMealAggregate;
    }

    public final int getEarnedCalories() {
        return this.earnedCalories;
    }

    public final int getEatenCalories() {
        Float calories = this.dailyMealAggregate.getCalories();
        if (calories != null) {
            return Math.round(calories.floatValue());
        }
        return 0;
    }

    public final int getInitialBudget() {
        return (int) Math.max(Math.max(this.bmr, this.totalCalories) + this.deficit, this.minBudget);
    }

    public final Meal getMealForMealName(MealName mealName) {
        u.j(mealName, "mealName");
        return this.dailyMealAggregate.getMealForMealName(mealName);
    }

    public final int getTotalBudget() {
        return getInitialBudget() + this.earnedCalories;
    }

    public final void setDailyMealAggregate(MealAggregate mealAggregate) {
        u.j(mealAggregate, "<set-?>");
        this.dailyMealAggregate = mealAggregate;
    }
}

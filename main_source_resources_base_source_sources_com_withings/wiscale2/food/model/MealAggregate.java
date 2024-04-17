package com.withings.wiscale2.food.model;

import com.withings.wiscale2.food.model.MealsUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: MealAggregate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/food/model/MealAggregate;", "Lcom/withings/wiscale2/food/model/Meal;", "()V", "meals", "", "getMeals", "()Ljava/util/List;", "setMeals", "(Ljava/util/List;)V", "getLastMealDate", "Lorg/joda/time/DateTime;", "getMealForMealName", "mealName", "Lcom/withings/wiscale2/food/model/MealName;", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MealAggregate extends Meal {
    private List<? extends Meal> meals = new ArrayList();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MealAggregate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/food/model/MealAggregate$Companion;", "", "()V", "createAverage", "Lcom/withings/wiscale2/food/model/MealAggregate;", "meals", "", "Lcom/withings/wiscale2/food/model/Meal;", "createSum", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final MealAggregate createAverage(List<? extends Meal> meals) {
            u.j(meals, "meals");
            MealAggregate createSum = createSum(meals);
            int size = meals.size();
            if (size < 2) {
                return createSum;
            }
            MealsUtils.Companion companion = MealsUtils.Companion;
            createSum.setCalories(companion.divideFloat(createSum.getCalories(), size));
            createSum.setCarbs(companion.divideFloat(createSum.getCarbs(), size));
            createSum.setProtein(companion.divideFloat(createSum.getProtein(), size));
            createSum.setFat(companion.divideFloat(createSum.getFat(), size));
            createSum.setFiber(companion.divideFloat(createSum.getFiber(), size));
            createSum.setSugars(companion.divideFloat(createSum.getSugars(), size));
            createSum.setSaturatedFat(companion.divideFloat(createSum.getSaturatedFat(), size));
            createSum.setPolyunsaturedFat(companion.divideFloat(createSum.getPolyunsaturedFat(), size));
            createSum.setMonounsaturatedFat(companion.divideFloat(createSum.getMonounsaturatedFat(), size));
            createSum.setCholesterol(companion.divideFloat(createSum.getCholesterol(), size));
            createSum.setSodium(companion.divideFloat(createSum.getSodium(), size));
            createSum.setPotassium(companion.divideFloat(createSum.getPotassium(), size));
            return createSum;
        }

        public final MealAggregate createSum(List<? extends Meal> meals) {
            u.j(meals, "meals");
            MealAggregate mealAggregate = new MealAggregate();
            mealAggregate.setMeals(meals);
            if (meals.isEmpty()) {
                return mealAggregate;
            }
            mealAggregate.setDay(meals.get(0).getDay());
            for (Meal meal : meals) {
                MealsUtils.Companion companion = MealsUtils.Companion;
                mealAggregate.setCalories(companion.addFloats(mealAggregate.getCalories(), meal.getCalories()));
                mealAggregate.setCarbs(companion.addFloats(mealAggregate.getCarbs(), meal.getCarbs()));
                mealAggregate.setProtein(companion.addFloats(mealAggregate.getProtein(), meal.getProtein()));
                mealAggregate.setFat(companion.addFloats(mealAggregate.getFat(), meal.getFat()));
                mealAggregate.setFiber(companion.addFloats(mealAggregate.getFiber(), meal.getFiber()));
                mealAggregate.setSugars(companion.addFloats(mealAggregate.getSugars(), meal.getSugars()));
                mealAggregate.setSaturatedFat(companion.addFloats(mealAggregate.getSaturatedFat(), meal.getSaturatedFat()));
                mealAggregate.setPolyunsaturedFat(companion.addFloats(mealAggregate.getPolyunsaturedFat(), meal.getPolyunsaturedFat()));
                mealAggregate.setMonounsaturatedFat(companion.addFloats(mealAggregate.getMonounsaturatedFat(), meal.getMonounsaturatedFat()));
                mealAggregate.setCholesterol(companion.addFloats(mealAggregate.getCholesterol(), meal.getCholesterol()));
                mealAggregate.setSodium(companion.addFloats(mealAggregate.getSodium(), meal.getSodium()));
                mealAggregate.setPotassium(companion.addFloats(mealAggregate.getPotassium(), meal.getPotassium()));
            }
            return mealAggregate;
        }

        private Companion() {
        }
    }

    public final DateTime getLastMealDate() {
        ArrayList arrayList = new ArrayList();
        for (Meal meal : this.meals) {
            DateTime date = meal.getDate();
            if (date != null) {
                arrayList.add(date);
            }
        }
        return (DateTime) x.d0(arrayList);
    }

    public final Meal getMealForMealName(MealName mealName) {
        Object obj;
        u.j(mealName, "mealName");
        Iterator<T> it = this.meals.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Meal) obj).getMealNameRank() == mealName.getRank()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Meal) obj;
    }

    public final List<Meal> getMeals() {
        return this.meals;
    }

    public final void setMeals(List<? extends Meal> list) {
        u.j(list, "<set-?>");
        this.meals = list;
    }
}

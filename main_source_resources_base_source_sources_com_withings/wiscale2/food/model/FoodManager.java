package com.withings.wiscale2.food.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.WeightGoal;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import em.a;
import en0.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: FoodManager.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B'\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b8\u00109J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/withings/wiscale2/food/model/FoodManager;", "", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/wiscale2/food/model/MealName;", "mealName", "Lnm0/y;", "deleteMealName", "(Lcom/withings/user/User;Lcom/withings/wiscale2/food/model/MealName;)V", "Lorg/joda/time/DateTime;", FoodDayFragment.ARG_DAY, "", "Lcom/withings/wiscale2/food/model/Meal;", "getMealsForDays", "(Lcom/withings/user/User;Lorg/joda/time/DateTime;)Ljava/util/List;", "date", "", "getDeficit", "(Lcom/withings/user/User;Lorg/joda/time/DateTime;)I", "getMealNamesForUser", "(Lcom/withings/user/User;)Ljava/util/List;", "insertMealNameForUser", "(Lcom/withings/wiscale2/food/model/MealName;)V", "updateMealNameForUser", "mealNames", "deleteMealNames", "(Lcom/withings/user/User;Ljava/util/List;)V", ConstantsWs.SYNC_PROCESS_MEAL, "insertOrUpdateMeal", "(Lcom/withings/wiscale2/food/model/Meal;)V", "getLastMealOfUser", "(Lcom/withings/user/User;)Lcom/withings/wiscale2/food/model/Meal;", "deleteMealsOfUser", "(Lcom/withings/user/User;)V", "", "hasFoodDataForDay", "(Lcom/withings/user/User;Lorg/joda/time/DateTime;)Z", "Lcom/withings/wiscale2/food/model/FoodDayData;", "getFoodDayData", "(Lcom/withings/user/User;Lorg/joda/time/DateTime;)Lcom/withings/wiscale2/food/model/FoodDayData;", "firstDayOfWeek", "Lcom/withings/wiscale2/food/model/FoodWeekData;", "getFoodWeekData", "(Lcom/withings/user/User;Lorg/joda/time/DateTime;)Lcom/withings/wiscale2/food/model/FoodWeekData;", "Lcom/withings/wiscale2/food/model/MealDao;", "mealDao", "Lcom/withings/wiscale2/food/model/MealDao;", "Lcom/withings/wiscale2/food/model/MealNameDao;", "mealNameDao", "Lcom/withings/wiscale2/food/model/MealNameDao;", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "activityAggregateManager", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "Lcom/withings/target/data/TargetRepository;", "targetRepository", "Lcom/withings/target/data/TargetRepository;", "<init>", "(Lcom/withings/wiscale2/food/model/MealDao;Lcom/withings/wiscale2/food/model/MealNameDao;Lcom/withings/core/data/aggregate/ActivityAggregateManager;Lcom/withings/target/data/TargetRepository;)V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodManager {
    private static final double DEFICIT_BOUNDS = 1300.0d;
    private static final int DEFICIT_FACTOR = 1000;
    private static final double FEMALE_DEFICIT_THRESHOLD = 300.0d;
    private static final double MALE_DEFICIT_THRESHOLD = 350.0d;
    public static FoodManager instance;
    private final ActivityAggregateManager activityAggregateManager;
    private final MealDao mealDao;
    private final MealNameDao mealNameDao;
    private final TargetRepository targetRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FoodManager.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/withings/wiscale2/food/model/FoodManager$Companion;", "", "Lcom/withings/wiscale2/food/model/MealDao;", "mealDao", "Lcom/withings/wiscale2/food/model/MealNameDao;", "mealNameDao", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "activityAggregateManager", "Lcom/withings/target/data/TargetRepository;", "targetRepository", "Lnm0/y;", "init", "(Lcom/withings/wiscale2/food/model/MealDao;Lcom/withings/wiscale2/food/model/MealNameDao;Lcom/withings/core/data/aggregate/ActivityAggregateManager;Lcom/withings/target/data/TargetRepository;)V", "Lcom/withings/wiscale2/food/model/FoodManager;", "get", "()Lcom/withings/wiscale2/food/model/FoodManager;", "instance", "Lcom/withings/wiscale2/food/model/FoodManager;", "getInstance", "setInstance", "(Lcom/withings/wiscale2/food/model/FoodManager;)V", "", "DEFICIT_BOUNDS", "D", "", "DEFICIT_FACTOR", "I", "FEMALE_DEFICIT_THRESHOLD", "MALE_DEFICIT_THRESHOLD", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FoodManager get() {
            return getInstance();
        }

        public final FoodManager getInstance() {
            FoodManager foodManager = FoodManager.instance;
            if (foodManager != null) {
                return foodManager;
            }
            u.s("instance");
            throw null;
        }

        public final void init(MealDao mealDao, MealNameDao mealNameDao, ActivityAggregateManager activityAggregateManager, TargetRepository targetRepository) {
            u.j(mealDao, "mealDao");
            u.j(mealNameDao, "mealNameDao");
            u.j(activityAggregateManager, "activityAggregateManager");
            u.j(targetRepository, "targetRepository");
            setInstance(new FoodManager(mealDao, mealNameDao, activityAggregateManager, targetRepository));
        }

        public final void setInstance(FoodManager foodManager) {
            u.j(foodManager, "<set-?>");
            FoodManager.instance = foodManager;
        }

        private Companion() {
        }
    }

    public FoodManager(MealDao mealDao, MealNameDao mealNameDao, ActivityAggregateManager activityAggregateManager, TargetRepository targetRepository) {
        u.j(mealDao, "mealDao");
        u.j(mealNameDao, "mealNameDao");
        u.j(activityAggregateManager, "activityAggregateManager");
        u.j(targetRepository, "targetRepository");
        this.mealDao = mealDao;
        this.mealNameDao = mealNameDao;
        this.activityAggregateManager = activityAggregateManager;
        this.targetRepository = targetRepository;
    }

    private final void deleteMealName(User user, MealName mealName) {
        this.mealNameDao.delete(mealName);
        this.mealDao.deleteByMealNameId(user.q(), mealName.getId());
    }

    public static final FoodManager get() {
        return Companion.get();
    }

    private final int getDeficit(User user, DateTime dateTime) {
        double d11;
        double d12;
        TargetRepository targetRepository = this.targetRepository;
        long q11 = user.q();
        DateTime minus = dateTime.withTimeAtStartOfDay().plusDays(1).minus(1L);
        u.i(minus, "minus(...)");
        WeightGoal weightGoalAtDate = targetRepository.getWeightGoalAtDate(q11, minus);
        if (weightGoalAtDate != null) {
            d11 = weightGoalAtDate.getSpeed();
        } else {
            d11 = 0.0d;
        }
        if (user.p() == 0) {
            d12 = MALE_DEFICIT_THRESHOLD;
        } else {
            d12 = FEMALE_DEFICIT_THRESHOLD;
        }
        double d13 = (1000 * d11) + d12;
        if (d11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return (int) r.e(d13, DEFICIT_BOUNDS);
        }
        if (d13 < -1300.0d) {
            d13 = -1300.0d;
        }
        return (int) d13;
    }

    private final List<Meal> getMealsForDays(User user, DateTime dateTime) {
        MealDao mealDao = this.mealDao;
        long q11 = user.q();
        String abstractDateTime = dateTime.toString(Meal.Companion.getDAY_FORMAT());
        u.i(abstractDateTime, "toString(...)");
        return mealDao.queryForUserIdAndDay(q11, abstractDateTime);
    }

    public static final void init(MealDao mealDao, MealNameDao mealNameDao, ActivityAggregateManager activityAggregateManager, TargetRepository targetRepository) {
        Companion.init(mealDao, mealNameDao, activityAggregateManager, targetRepository);
    }

    public final void deleteMealNames(User user, List<MealName> mealNames) {
        u.j(user, "user");
        u.j(mealNames, "mealNames");
        for (MealName mealName : mealNames) {
            deleteMealName(user, mealName);
        }
    }

    public final void deleteMealsOfUser(User user) {
        u.j(user, "user");
        this.mealDao.deleteByUserId(user.q());
    }

    public final FoodDayData getFoodDayData(User user, DateTime date) {
        int i11;
        int i12;
        u.j(user, "user");
        u.j(date, "date");
        double a11 = new a.C0888a(sw.a.z()).a(user, date);
        int deficit = getDeficit(user, date);
        ActivityAggregate aggregateForDay = this.activityAggregateManager.getAggregateForDay(user.q(), date);
        if (aggregateForDay != null) {
            i11 = (int) aggregateForDay.getCalories();
        } else {
            i11 = 0;
        }
        if (aggregateForDay != null) {
            i12 = (int) Math.ceil(aggregateForDay.getTotalEarnedCalories());
        } else {
            i12 = 0;
        }
        return new FoodDayData(a11, deficit, i11, i12, user.p(), MealAggregate.Companion.createSum(getMealsForDays(user, date)));
    }

    public final FoodWeekData getFoodWeekData(User user, DateTime firstDayOfWeek) {
        u.j(user, "user");
        u.j(firstDayOfWeek, "firstDayOfWeek");
        DateTime withDayOfWeek = firstDayOfWeek.withTimeAtStartOfDay().withDayOfWeek(1);
        DateTime plusWeeks = withDayOfWeek.plusWeeks(1);
        if (plusWeeks.isAfter(DateTime.now().plusDays(1).withTimeAtStartOfDay())) {
            plusWeeks = DateTime.now().plusDays(1).withTimeAtStartOfDay();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        DateTime dateTime = new DateTime(withDayOfWeek);
        while (dateTime.isBefore(plusWeeks)) {
            FoodDayData foodDayData = getFoodDayData(user, dateTime);
            arrayList.add(foodDayData);
            arrayList2.addAll(foodDayData.getDailyMealAggregate().getMeals());
            dateTime = dateTime.plusDays(1);
            u.i(dateTime, "plusDays(...)");
        }
        return new FoodWeekData(arrayList, arrayList2);
    }

    public final Meal getLastMealOfUser(User user) {
        u.j(user, "user");
        return this.mealDao.queryLastByUserId(user.q());
    }

    public final List<MealName> getMealNamesForUser(User user) {
        u.j(user, "user");
        return this.mealNameDao.queryByUserId(user.q());
    }

    public final boolean hasFoodDataForDay(User user, DateTime day) {
        u.j(user, "user");
        u.j(day, "day");
        return !getMealsForDays(user, day).isEmpty();
    }

    public final void insertMealNameForUser(MealName mealName) {
        u.j(mealName, "mealName");
        this.mealNameDao.create(mealName);
    }

    public final void insertOrUpdateMeal(Meal meal) {
        u.j(meal, "meal");
        this.mealDao.createOrUpdate(meal);
    }

    public final void updateMealNameForUser(MealName mealName) {
        u.j(mealName, "mealName");
        this.mealNameDao.update(mealName);
    }
}

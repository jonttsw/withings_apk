package com.withings.wiscale2.food.model;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MealDao.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/model/MealDao;", "", "", NavigationArguments.USER_ID, "Lcom/withings/wiscale2/food/model/Meal;", "queryLastByUserId", "(J)Lcom/withings/wiscale2/food/model/Meal;", "queryFirstByUserId", "data", "Lnm0/y;", "createOrUpdate", "(Lcom/withings/wiscale2/food/model/Meal;)V", "deleteByUserId", "(J)V", "mealNameId", "deleteByMealNameId", "(JJ)V", "", "date", "", "queryForUserIdAndDay", "(JLjava/lang/String;)Ljava/util/List;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface MealDao {
    void createOrUpdate(Meal meal);

    void deleteByMealNameId(long j5, long j11);

    void deleteByUserId(long j5);

    Meal queryFirstByUserId(long j5);

    List<Meal> queryForUserIdAndDay(long j5, String str);

    Meal queryLastByUserId(long j5);
}

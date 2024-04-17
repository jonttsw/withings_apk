package com.withings.wiscale2.food.model;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
/* compiled from: MealNameDao.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/model/MealNameDao;", "", "Lcom/withings/wiscale2/food/model/MealName;", "data", "Lnm0/y;", "create", "(Lcom/withings/wiscale2/food/model/MealName;)V", DiscoverItems.Item.UPDATE_ACTION, "delete", "", NavigationArguments.USER_ID, "", "queryByUserId", "(J)Ljava/util/List;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface MealNameDao {
    void create(MealName mealName);

    void delete(MealName mealName);

    List<MealName> queryByUserId(long j5);

    void update(MealName mealName);
}

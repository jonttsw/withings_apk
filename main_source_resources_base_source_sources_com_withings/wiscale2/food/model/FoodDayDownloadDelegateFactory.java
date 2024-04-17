package com.withings.wiscale2.food.model;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.Metadata;
import qw.a;
/* compiled from: FoodDayDownloadDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegateFactory;", "", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lqw/a$c;", "positionToDateConverter", "Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegate;", "create", "(Lcom/withings/user/User;Lqw/a$c;)Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegate;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface FoodDayDownloadDelegateFactory {
    FoodDayDownloadDelegate create(User user, a.c cVar);
}

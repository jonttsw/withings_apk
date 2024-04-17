package com.withings.wiscale2.food.model;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.WsFailer;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.food.ws.FoodRemoteRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import qw.a;
import vh.h;
/* compiled from: FoodDayDownloadDelegate.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegate;", "Lqw/a$a;", "Lorg/joda/time/DateTime;", FoodDayFragment.ARG_DAY, "", "hasDataForDay", "(Lorg/joda/time/DateTime;)Z", "Lqw/a;", "manager", "start", "end", "Lnm0/y;", "downloadData", "(Lqw/a;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "", "position", "getDate", "(I)Lorg/joda/time/DateTime;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "Lqw/a$c;", "positionToDateConverter", "Lqw/a$c;", "Lcom/withings/wiscale2/food/model/FoodManager;", "foodManager", "Lcom/withings/wiscale2/food/model/FoodManager;", "Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "foodRemoteRepository", "Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "<init>", "(Lcom/withings/user/User;Lqw/a$c;Lcom/withings/wiscale2/food/model/FoodManager;Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodDayDownloadDelegate implements a.InterfaceC1563a {
    public static final int $stable = 8;
    private final FoodManager foodManager;
    private final FoodRemoteRepository foodRemoteRepository;
    private final a.c positionToDateConverter;
    private final User user;

    public FoodDayDownloadDelegate(User user, a.c positionToDateConverter, FoodManager foodManager, FoodRemoteRepository foodRemoteRepository) {
        u.j(user, "user");
        u.j(positionToDateConverter, "positionToDateConverter");
        u.j(foodManager, "foodManager");
        u.j(foodRemoteRepository, "foodRemoteRepository");
        this.user = user;
        this.positionToDateConverter = positionToDateConverter;
        this.foodManager = foodManager;
        this.foodRemoteRepository = foodRemoteRepository.withSyncContext("food_day_view");
    }

    @Override // qw.a.InterfaceC1563a
    public void downloadData(final a manager, final DateTime start, final DateTime end) {
        u.j(manager, "manager");
        u.j(start, "start");
        u.j(end, "end");
        h.l().b(new FoodDayDownloadDelegate$downloadData$1(start, end, this)).q(new WsFailer.ActionCallback() { // from class: com.withings.wiscale2.food.model.FoodDayDownloadDelegate$downloadData$2
            @Override // com.withings.webservices.legacy.WsFailer.ActionCallback, vh.p
            public void onError(Exception exception) {
                u.j(exception, "exception");
                super.onError(exception);
                a.this.m(start, end, exception);
            }

            @Override // com.withings.webservices.legacy.WsFailer.ActionCallback, vh.a.b
            public void onResult() {
                a.this.n(start, end);
            }
        });
    }

    @Override // qw.a.c
    public DateTime getDate(int i11) {
        return this.positionToDateConverter.getDate(i11);
    }

    @Override // qw.a.InterfaceC1563a
    public boolean hasDataForDay(DateTime day) {
        u.j(day, "day");
        return this.foodManager.hasFoodDataForDay(this.user, day);
    }
}

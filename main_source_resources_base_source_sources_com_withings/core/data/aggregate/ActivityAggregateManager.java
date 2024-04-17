package com.withings.core.data.aggregate;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
import u70.h;
import w6.g;
/* compiled from: ActivityAggregateManager.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 I2\u00020\u0001:\u0002IJB\u000f\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bG\u0010HJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001e\u0010\u0014J-\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\u0019J#\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b$\u0010&J%\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000eH\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010\u0014J\u0019\u0010,\u001a\u00020+2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020+2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b.\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b/\u0010\u0014J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b0\u00101J-\u00104\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u000e2\b\u00103\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b4\u00105J#\u00106\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b6\u0010\u0019J'\u0010:\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b<\u0010;J'\u0010=\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b=\u0010;J#\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006K"}, d2 = {"Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "", "Lcom/withings/core/data/aggregate/ActivityAggregateManager$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "addListener", "(Lcom/withings/core/data/aggregate/ActivityAggregateManager$Listener;)V", "addMainThreadListener", "removeListener", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "", "getLastAggregateUpdate", "(Lcom/withings/user/User;)J", "Lorg/joda/time/DateTime;", "getLastAggregateDate", "(Lcom/withings/user/User;)Lorg/joda/time/DateTime;", NavigationArguments.USER_ID, "Lcom/withings/core/data/aggregate/ActivityAggregate;", "getLastAggregateWithSteps", "(J)Lcom/withings/core/data/aggregate/ActivityAggregate;", "getMostRecentSyncedAggregate", "(Lcom/withings/user/User;)Lcom/withings/core/data/aggregate/ActivityAggregate;", "dateTime", "getAggregateForTime", "(JLorg/joda/time/DateTime;)Lcom/withings/core/data/aggregate/ActivityAggregate;", "", "getUnsynchronizedAggregate", "(Lcom/withings/user/User;)Ljava/util/List;", "getLastAggregateWithAscentBefore", "getFirstAggregate", "start", "end", "getActivityAggregatesBetweenDays", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Ljava/util/List;", FoodDayFragment.ARG_DAY, "getAggregateForDay", "", "(JLjava/lang/String;)Lcom/withings/core/data/aggregate/ActivityAggregate;", "anyDateOfWeek", "getAggregatesForWeek", "(JLorg/joda/time/DateTime;)Ljava/util/List;", "getLastAggregate", "", "getMaxSteps", "(Lcom/withings/user/User;)I", "getAverageSteps", "getLastAggregateWithAverageHR", "getAggregatesWithAverageHR", "(J)Ljava/util/List;", "startDate", "endDate", "getLastAggregateWithAverageSpo2", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lcom/withings/core/data/aggregate/ActivityAggregate;", "getLastAggregateBefore", "aggregate", "", "syncedToWs", "insertOrUpdate", "(Lcom/withings/user/User;Lcom/withings/core/data/aggregate/ActivityAggregate;Z)V", "insert", DiscoverItems.Item.UPDATE_ACTION, "activityAggregates", "filterMaxOneAggregatePerDay", "(Ljava/util/List;)Ljava/util/List;", "Lcom/withings/core/data/aggregate/ActivityAggregateDAO;", "dao", "Lcom/withings/core/data/aggregate/ActivityAggregateDAO;", "Lu70/h;", "listenerManager", "Lu70/h;", "<init>", "(Lcom/withings/core/data/aggregate/ActivityAggregateDAO;)V", "Companion", "Listener", "core-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ActivityAggregateManager {
    public static final Companion Companion = new Companion(null);
    public static final int MINUTES_CONSIDERING_VASISTAS_CORRECT = 31;
    private static ActivityAggregateManager instance;
    private final ActivityAggregateDAO dao;
    private final h<Listener> listenerManager;

    /* compiled from: ActivityAggregateManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/core/data/aggregate/ActivityAggregateManager$Companion;", "", "()V", "MINUTES_CONSIDERING_VASISTAS_CORRECT", "", "instance", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "get", "init", "dao", "Lcom/withings/core/data/aggregate/ActivityAggregateDAO;", "core-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final ActivityAggregateManager get() {
            ActivityAggregateManager activityAggregateManager = ActivityAggregateManager.instance;
            if (activityAggregateManager != null) {
                return activityAggregateManager;
            }
            u.s("instance");
            throw null;
        }

        public final ActivityAggregateManager init(ActivityAggregateDAO dao) {
            u.j(dao, "dao");
            ActivityAggregateManager.instance = new ActivityAggregateManager(dao);
            ActivityAggregateManager activityAggregateManager = ActivityAggregateManager.instance;
            if (activityAggregateManager != null) {
                return activityAggregateManager;
            }
            u.s("instance");
            throw null;
        }

        private Companion() {
        }
    }

    /* compiled from: ActivityAggregateManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/core/data/aggregate/ActivityAggregateManager$Listener;", "", "", NavigationArguments.USER_ID, "Lcom/withings/core/data/aggregate/ActivityAggregate;", "aggregate", "Lnm0/y;", "onAggregateInserted", "(JLcom/withings/core/data/aggregate/ActivityAggregate;)V", "onAggregateUpdated", "core-data_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface Listener {
        void onAggregateInserted(long j5, ActivityAggregate activityAggregate);

        void onAggregateUpdated(long j5, ActivityAggregate activityAggregate);
    }

    public ActivityAggregateManager(ActivityAggregateDAO dao) {
        u.j(dao, "dao");
        this.dao = dao;
        this.listenerManager = new h<>();
    }

    private final List<ActivityAggregate> filterMaxOneAggregatePerDay(List<? extends ActivityAggregate> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((ActivityAggregate) obj).getDay())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ActivityAggregateManager get() {
        return Companion.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insert$lambda$1(User user, ActivityAggregate aggregate, Listener listener) {
        u.j(user, "$user");
        u.j(aggregate, "$aggregate");
        u.j(listener, "listener");
        listener.onAggregateInserted(user.q(), aggregate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertOrUpdate$lambda$0(boolean z5, User user, ActivityAggregate aggregate, Listener listener) {
        u.j(user, "$user");
        u.j(aggregate, "$aggregate");
        u.j(listener, "listener");
        if (z5) {
            listener.onAggregateInserted(user.q(), aggregate);
        } else {
            listener.onAggregateUpdated(user.q(), aggregate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$2(User user, ActivityAggregate aggregate, Listener listener) {
        u.j(user, "$user");
        u.j(aggregate, "$aggregate");
        u.j(listener, "listener");
        listener.onAggregateUpdated(user.q(), aggregate);
    }

    public final void addListener(Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.b(listener);
    }

    public final void addMainThreadListener(Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.h(listener);
    }

    public final List<ActivityAggregate> getActivityAggregatesBetweenDays(long j5, DateTime start, DateTime end) {
        u.j(start, "start");
        u.j(end, "end");
        List<ActivityAggregate> activityAggregatesBetweenDays = this.dao.getActivityAggregatesBetweenDays(j5, start.toString("yyyy-MM-dd"), end.toString("yyyy-MM-dd"));
        u.i(activityAggregatesBetweenDays, "getActivityAggregatesBetweenDays(...)");
        return filterMaxOneAggregatePerDay(activityAggregatesBetweenDays);
    }

    public final ActivityAggregate getAggregateForDay(long j5, DateTime day) {
        u.j(day, "day");
        return getAggregateForDay(j5, day.withTimeAtStartOfDay().toString("yyyy-MM-dd"));
    }

    public final ActivityAggregate getAggregateForTime(long j5, DateTime dateTime) {
        return this.dao.getAggregateForTime(j5, dateTime);
    }

    public final List<ActivityAggregate> getAggregatesForWeek(long j5, DateTime anyDateOfWeek) {
        u.j(anyDateOfWeek, "anyDateOfWeek");
        DateTime withTimeAtStartOfDay = anyDateOfWeek.withDayOfWeek(1).withTimeAtStartOfDay();
        List<ActivityAggregate> activityAggregatesBetweenDays = this.dao.getActivityAggregatesBetweenDays(j5, withTimeAtStartOfDay.toString("yyyy-MM-dd"), withTimeAtStartOfDay.plusDays(7).minus(1L).toString("yyyy-MM-dd"));
        u.i(activityAggregatesBetweenDays, "getActivityAggregatesBetweenDays(...)");
        return filterMaxOneAggregatePerDay(activityAggregatesBetweenDays);
    }

    public final List<ActivityAggregate> getAggregatesWithAverageHR(long j5) {
        List<ActivityAggregate> aggregatesWithAverageHR = this.dao.getAggregatesWithAverageHR(j5);
        u.i(aggregatesWithAverageHR, "getAggregatesWithAverageHR(...)");
        return aggregatesWithAverageHR;
    }

    public final int getAverageSteps(User user) {
        return this.dao.getAverageSteps(user);
    }

    public final ActivityAggregate getFirstAggregate(long j5) {
        return this.dao.getFirstAggregate(Long.valueOf(j5));
    }

    public final ActivityAggregate getLastAggregate(long j5) {
        return this.dao.getLastAggregate(j5);
    }

    public final ActivityAggregate getLastAggregateBefore(long j5, DateTime dateTime) {
        return this.dao.getLastAggregateBefore(j5, dateTime);
    }

    public final DateTime getLastAggregateDate(User user) {
        return this.dao.getLastAggregateDate(user);
    }

    public final long getLastAggregateUpdate(User user) {
        return this.dao.getLastAggregateUpdate(user);
    }

    public final ActivityAggregate getLastAggregateWithAscentBefore(long j5, DateTime dateTime) {
        return this.dao.getLastAggregateWithAscentBefore(j5, dateTime);
    }

    public final ActivityAggregate getLastAggregateWithAverageHR(long j5) {
        return this.dao.getLastAggregateWithAverageHR(j5);
    }

    public final ActivityAggregate getLastAggregateWithAverageSpo2(long j5, DateTime dateTime, DateTime dateTime2) {
        return this.dao.getLastAggregateWithAverageSpo2(j5, dateTime, dateTime2);
    }

    public final ActivityAggregate getLastAggregateWithSteps(long j5) {
        return this.dao.getLastAggregateWithSteps(j5);
    }

    public final int getMaxSteps(User user) {
        return this.dao.getMaxSteps(user);
    }

    public final ActivityAggregate getMostRecentSyncedAggregate(User user) {
        return this.dao.getMostRecentSyncedAggregate(user);
    }

    public final List<ActivityAggregate> getUnsynchronizedAggregate(User user) {
        List<ActivityAggregate> unsynchronizedAggregate = this.dao.getUnsynchronizedAggregate(user);
        u.i(unsynchronizedAggregate, "getUnsynchronizedAggregate(...)");
        return unsynchronizedAggregate;
    }

    public final void insert(User user, ActivityAggregate aggregate, boolean z5) {
        u.j(user, "user");
        u.j(aggregate, "aggregate");
        this.dao.insertAggregate(user, aggregate, z5);
        this.listenerManager.f(new g(4, user, aggregate));
    }

    public final void insertOrUpdate(final User user, final ActivityAggregate aggregate, boolean z5) {
        u.j(user, "user");
        u.j(aggregate, "aggregate");
        final boolean insertOrUpdateAggregate = this.dao.insertOrUpdateAggregate(user, aggregate, z5);
        this.listenerManager.f(new h.a() { // from class: com.withings.core.data.aggregate.a
            @Override // u70.h.a
            public final void e(Object obj) {
                ActivityAggregateManager.insertOrUpdate$lambda$0(insertOrUpdateAggregate, user, aggregate, (ActivityAggregateManager.Listener) obj);
            }
        });
    }

    public final void removeListener(Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.a(listener);
    }

    public final void update(User user, ActivityAggregate aggregate, boolean z5) {
        u.j(user, "user");
        u.j(aggregate, "aggregate");
        this.dao.updateAggregate(user, aggregate, z5);
        this.listenerManager.f(new b(user, aggregate));
    }

    public final ActivityAggregate getAggregateForDay(long j5, String str) {
        return this.dao.getAggregateForDay(j5, str);
    }
}

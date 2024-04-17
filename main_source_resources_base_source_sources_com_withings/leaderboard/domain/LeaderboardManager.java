package com.withings.leaderboard.domain;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.leaderboard.repositories.data.LeaderboardDAO;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.repositories.webservice.entries.LeaderboardWSEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.DateTime;
import qm0.d;
import u70.h;
/* compiled from: LeaderboardManager.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B!\b\u0002\u0012\u0006\u0010(\u001a\u00020'\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0*¢\u0006\u0004\b-\u0010.J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00172\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0013¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/withings/leaderboard/domain/LeaderboardManager;", "", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "week", "", "getWeekSteps", "(JLorg/joda/time/DateTime;)I", "Lcom/withings/leaderboard/domain/LeaderboardManager$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "addListener", "(Lcom/withings/leaderboard/domain/LeaderboardManager$Listener;)V", "removeListener", "localLastUpdate", "()Lorg/joda/time/DateTime;", "", "weekString", "", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "getLeaderboard", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getLeaderboardFlow", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "hasFriends", "(Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "infoForUser", "(JLqm0/d;)Ljava/lang/Object;", "deleteUser", "date", "delete", "(Ljava/lang/String;)V", "Lcom/withings/leaderboard/repositories/webservice/entries/LeaderboardWSEntry;", "list", "insertLeaderboard", "(JLorg/joda/time/DateTime;Ljava/util/List;)V", "Lcom/withings/leaderboard/repositories/data/LeaderboardDAO;", "dao", "Lcom/withings/leaderboard/repositories/data/LeaderboardDAO;", "Lu70/h;", "listenerManager", "Lu70/h;", "<init>", "(Lcom/withings/leaderboard/repositories/data/LeaderboardDAO;Lu70/h;)V", "Companion", "Listener", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardManager {
    private static LeaderboardManager instance;
    private final LeaderboardDAO dao;
    private final h<Listener> listenerManager;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LeaderboardManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/leaderboard/domain/LeaderboardManager$Companion;", "", "()V", "instance", "Lcom/withings/leaderboard/domain/LeaderboardManager;", "get", "init", "dao", "Lcom/withings/leaderboard/repositories/data/LeaderboardDAO;", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final LeaderboardManager get() {
            LeaderboardManager leaderboardManager = LeaderboardManager.instance;
            if (leaderboardManager != null) {
                return leaderboardManager;
            }
            u.s("instance");
            throw null;
        }

        public final LeaderboardManager init(LeaderboardDAO dao) {
            u.j(dao, "dao");
            LeaderboardManager.instance = new LeaderboardManager(dao, null, 2, null);
            LeaderboardManager leaderboardManager = LeaderboardManager.instance;
            if (leaderboardManager != null) {
                return leaderboardManager;
            }
            u.s("instance");
            throw null;
        }

        private Companion() {
        }
    }

    /* compiled from: LeaderboardManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/leaderboard/domain/LeaderboardManager$Listener;", "", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "dateTime", "", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "leaderboard", "Lnm0/y;", "onLeaderboardUpdated", "(JLorg/joda/time/DateTime;Ljava/util/List;)V", "onFriendDeleted", "(J)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface Listener {
        void onFriendDeleted(long j5);

        void onLeaderboardUpdated(long j5, DateTime dateTime, List<LeaderboardEntry> list);
    }

    /* synthetic */ LeaderboardManager(LeaderboardDAO leaderboardDAO, h hVar, int i11, m mVar) {
        this(leaderboardDAO, (i11 & 2) != 0 ? new h() : hVar);
    }

    public static final LeaderboardManager get() {
        return Companion.get();
    }

    private final int getWeekSteps(long j5, DateTime dateTime) {
        int i11 = 0;
        for (ActivityAggregate activityAggregate : ActivityAggregateManager.Companion.get().getAggregatesForWeek(j5, dateTime)) {
            i11 += activityAggregate.getSteps();
        }
        return i11;
    }

    public static final LeaderboardManager init(LeaderboardDAO leaderboardDAO) {
        return Companion.init(leaderboardDAO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertLeaderboard$lambda$3(long j5, DateTime week, List newEntries, Listener listener) {
        u.j(week, "$week");
        u.j(newEntries, "$newEntries");
        DateTime minusMinutes = week.withDayOfWeek(7).withTimeAtStartOfDay().plusDays(1).minusMinutes(1);
        u.i(minusMinutes, "minusMinutes(...)");
        listener.onLeaderboardUpdated(j5, minusMinutes, newEntries);
    }

    public final void addListener(Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.b(listener);
    }

    public final void delete(String date) {
        u.j(date, "date");
        this.dao.delete(date);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteUser(final long r5, qm0.d<? super nm0.y> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.withings.leaderboard.domain.LeaderboardManager$deleteUser$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.leaderboard.domain.LeaderboardManager$deleteUser$1 r0 = (com.withings.leaderboard.domain.LeaderboardManager$deleteUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.leaderboard.domain.LeaderboardManager$deleteUser$1 r0 = new com.withings.leaderboard.domain.LeaderboardManager$deleteUser$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r5 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.withings.leaderboard.domain.LeaderboardManager r0 = (com.withings.leaderboard.domain.LeaderboardManager) r0
            nm0.l.b(r7)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            nm0.l.b(r7)
            com.withings.leaderboard.repositories.data.LeaderboardDAO r7 = r4.dao
            r0.L$0 = r4
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.delete(r5, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            nm0.y r7 = nm0.y.f85009a
            u70.h<com.withings.leaderboard.domain.LeaderboardManager$Listener> r7 = r0.listenerManager
            com.withings.leaderboard.domain.b r0 = new com.withings.leaderboard.domain.b
            r0.<init>()
            r7.f(r0)
            nm0.y r5 = nm0.y.f85009a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.domain.LeaderboardManager.deleteUser(long, qm0.d):java.lang.Object");
    }

    public final Object getLeaderboard(String str, d<? super List<LeaderboardEntry>> dVar) {
        return this.dao.getLeaderboard(str, dVar);
    }

    public final Flow<List<LeaderboardEntry>> getLeaderboardFlow(String weekString) {
        u.j(weekString, "weekString");
        return FlowKt.distinctUntilChanged(this.dao.getLeaderboardFlow(weekString));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasFriends(org.joda.time.DateTime r5, qm0.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.leaderboard.domain.LeaderboardManager$hasFriends$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.leaderboard.domain.LeaderboardManager$hasFriends$1 r0 = (com.withings.leaderboard.domain.LeaderboardManager$hasFriends$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.leaderboard.domain.LeaderboardManager$hasFriends$1 r0 = new com.withings.leaderboard.domain.LeaderboardManager$hasFriends$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            nm0.l.b(r6)
            com.withings.leaderboard.repositories.data.LeaderboardDAO r6 = r4.dao
            java.lang.String r2 = "yyyy-MM-dd"
            java.lang.String r5 = r5.toString(r2)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.u.i(r5, r2)
            r0.label = r3
            java.lang.Object r6 = r6.getLeaderboard(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            if (r5 <= r3) goto L51
            goto L52
        L51:
            r3 = 0
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.domain.LeaderboardManager.hasFriends(org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    public final Object infoForUser(long j5, d<? super LeaderboardEntry> dVar) {
        return this.dao.getMostRecentEntry(j5, dVar);
    }

    public final void insertLeaderboard(final long j5, final DateTime week, List<LeaderboardWSEntry> list) {
        int value;
        u.j(week, "week");
        u.j(list, "list");
        String abstractDateTime = week.toString("yyyy-MM-dd");
        u.i(abstractDateTime, "toString(...)");
        List<LeaderboardWSEntry> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (LeaderboardWSEntry leaderboardWSEntry : list2) {
            long userid = leaderboardWSEntry.getUserid();
            String firstname = leaderboardWSEntry.getFirstname();
            String lastname = leaderboardWSEntry.getLastname();
            if (leaderboardWSEntry.getUserid() == j5) {
                value = leaderboardWSEntry.getValue();
                int weekSteps = getWeekSteps(j5, week);
                if (value < weekSteps) {
                    value = weekSteps;
                }
            } else {
                value = leaderboardWSEntry.getValue();
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new LeaderboardEntry(null, abstractDateTime, userid, value, firstname, lastname, leaderboardWSEntry.getP4().getUrlFor256(), leaderboardWSEntry.getModified(), 1, null));
            arrayList = arrayList2;
        }
        final ArrayList arrayList3 = arrayList;
        this.dao.insertLeaderboard(abstractDateTime, arrayList3);
        this.listenerManager.f(new h.a() { // from class: com.withings.leaderboard.domain.a
            @Override // u70.h.a
            public final void e(Object obj) {
                LeaderboardManager.insertLeaderboard$lambda$3(j5, week, arrayList3, (LeaderboardManager.Listener) obj);
            }
        });
    }

    public final DateTime localLastUpdate() {
        DateTime localLastUpdate = this.dao.localLastUpdate();
        if (localLastUpdate == null) {
            return new DateTime(0L);
        }
        return localLastUpdate;
    }

    public final void removeListener(Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.a(listener);
    }

    private LeaderboardManager(LeaderboardDAO leaderboardDAO, h<Listener> hVar) {
        this.dao = leaderboardDAO;
        this.listenerManager = hVar;
    }
}

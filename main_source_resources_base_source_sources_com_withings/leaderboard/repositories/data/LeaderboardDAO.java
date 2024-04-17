package com.withings.leaderboard.repositories.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: LeaderboardDAO.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0006J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00172\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/withings/leaderboard/repositories/data/LeaderboardDAO;", "", "", NavigationArguments.USER_ID, "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "getMostRecentEntry", "(JLqm0/d;)Ljava/lang/Object;", "", "list", "Lnm0/y;", "insert", "(Ljava/util/List;)V", "", "date", "insertLeaderboard", "(Ljava/lang/String;Ljava/util/List;)V", "delete", "(Ljava/lang/String;)V", "getLeaderboard", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lorg/joda/time/DateTime;", "localLastUpdate", "()Lorg/joda/time/DateTime;", "Lkotlinx/coroutines/flow/Flow;", "getLeaderboardFlow", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", CervicalMucusRecord.Appearance.CLEAR, "()V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface LeaderboardDAO {

    /* compiled from: LeaderboardDAO.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void insertLeaderboard(LeaderboardDAO leaderboardDAO, String date, List<LeaderboardEntry> list) {
            u.j(date, "date");
            u.j(list, "list");
            LeaderboardDAO.super.insertLeaderboard(date, list);
        }
    }

    void clear();

    Object delete(long j5, d<? super y> dVar);

    void delete(String str);

    Object getLeaderboard(String str, d<? super List<LeaderboardEntry>> dVar);

    Flow<List<LeaderboardEntry>> getLeaderboardFlow(String str);

    Object getMostRecentEntry(long j5, d<? super LeaderboardEntry> dVar);

    void insert(List<LeaderboardEntry> list);

    default void insertLeaderboard(String date, List<LeaderboardEntry> list) {
        u.j(date, "date");
        u.j(list, "list");
        delete(date);
        insert(list);
    }

    DateTime localLastUpdate();
}

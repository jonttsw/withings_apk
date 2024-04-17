package com.withings.leaderboard.domain;

import android.content.Context;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import com.withings.webservices.legacy.sync.ParallelSyncJob;
import com.withings.webservices.legacy.sync.SyncJob;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: LeaderboardSyncJobFactory.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "leaderboardRemoteRepository", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "(Landroid/content/Context;Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;)V", "create", "Lcom/withings/webservices/legacy/sync/SyncJob;", NavigationArguments.USER_ID, "", "from", "Lorg/joda/time/DateTime;", "to", "ignoreLastUpdate", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardSyncJobFactory {
    public static final int $stable = 8;
    private final Context context;
    private final LeaderboardRemoteRepository leaderboardRemoteRepository;

    @Inject
    public LeaderboardSyncJobFactory(Context context, LeaderboardRemoteRepository leaderboardRemoteRepository) {
        u.j(context, "context");
        u.j(leaderboardRemoteRepository, "leaderboardRemoteRepository");
        this.context = context;
        this.leaderboardRemoteRepository = leaderboardRemoteRepository;
    }

    public final SyncJob create(long j5, DateTime from, DateTime to, boolean z5) {
        u.j(from, "from");
        u.j(to, "to");
        ArrayList arrayList = new ArrayList();
        while (to.isAfter(from)) {
            arrayList.add(new ActionSyncJob(new GetLeaderboard(this.context, to, j5, this.leaderboardRemoteRepository, z5)));
            to = to.minusWeeks(1);
            u.i(to, "minusWeeks(...)");
        }
        return new ParallelSyncJob(arrayList);
    }
}

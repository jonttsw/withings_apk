package com.withings.leaderboard.domain;

import android.content.Context;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.joda.time.DateTime;
/* compiled from: GetLeaderboard.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/withings/leaderboard/domain/GetLeaderboard;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "run", "()V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lorg/joda/time/DateTime;", "week", "Lorg/joda/time/DateTime;", "", NavigationArguments.USER_ID, "J", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "leaderboardRemoteRepository", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "", "ignoreLastUpdate", "Z", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;JLcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;Z)V", "Companion", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetLeaderboard extends BaseSyncAction {
    public static final String DAY_FORMAT = "yyyy-MM-dd";
    private final Context context;
    private final boolean ignoreLastUpdate;
    private final LeaderboardRemoteRepository leaderboardRemoteRepository;
    private final long userId;
    private final DateTime week;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GetLeaderboard.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/leaderboard/domain/GetLeaderboard$Companion;", "", "()V", "DAY_FORMAT", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ GetLeaderboard(Context context, DateTime dateTime, long j5, LeaderboardRemoteRepository leaderboardRemoteRepository, boolean z5, int i11, m mVar) {
        this(context, dateTime, j5, leaderboardRemoteRepository, (i11 & 16) != 0 ? false : z5);
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        BuildersKt__BuildersKt.runBlocking$default(null, new GetLeaderboard$run$1(this, null), 1, null);
    }

    public GetLeaderboard(Context context, DateTime week, long j5, LeaderboardRemoteRepository leaderboardRemoteRepository, boolean z5) {
        u.j(context, "context");
        u.j(week, "week");
        u.j(leaderboardRemoteRepository, "leaderboardRemoteRepository");
        this.context = context;
        this.week = week;
        this.userId = j5;
        this.leaderboardRemoteRepository = leaderboardRemoteRepository;
        this.ignoreLastUpdate = z5;
    }
}

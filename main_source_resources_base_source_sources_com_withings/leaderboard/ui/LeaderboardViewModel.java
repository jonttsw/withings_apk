package com.withings.leaderboard.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.DateTime;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/withings/leaderboard/ui/LeaderboardViewModel;", "Landroidx/lifecycle/g1;", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "friend", "Lnm0/y;", "deleteUserFromLeaderboard", "(Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;)V", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "remoteRepository", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "Lkotlinx/coroutines/flow/Flow;", "Lorg/joda/time/DateTime;", "firstLeaderboardDate", "Lkotlinx/coroutines/flow/Flow;", "getFirstLeaderboardDate", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "activityAggregateManager", "<init>", "(Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;Lcom/withings/core/data/aggregate/ActivityAggregateManager;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardViewModel extends g1 {
    public static final int $stable = 8;
    private final Flow<DateTime> firstLeaderboardDate;
    private final LeaderboardRemoteRepository remoteRepository;

    @Inject
    public LeaderboardViewModel(LeaderboardRemoteRepository remoteRepository, ActivityAggregateManager activityAggregateManager) {
        u.j(remoteRepository, "remoteRepository");
        u.j(activityAggregateManager, "activityAggregateManager");
        this.remoteRepository = remoteRepository;
        this.firstLeaderboardDate = FlowKt.distinctUntilChanged(FlowKt.flowOn(FlowKt.flow(new LeaderboardViewModel$firstLeaderboardDate$1(activityAggregateManager, null)), Dispatchers.getIO()));
    }

    public final void deleteUserFromLeaderboard(LeaderboardEntry friend) {
        u.j(friend, "friend");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new LeaderboardViewModel$deleteUserFromLeaderboard$1(this, friend, null), 2, null);
    }

    public final Flow<DateTime> getFirstLeaderboardDate() {
        return this.firstLeaderboardDate;
    }
}

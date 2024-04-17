package com.withings.leaderboard.di;

import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.leaderboard.repositories.webservice.RetrofitLeaderboardRemoteRepository;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s00.b;
/* compiled from: LeaderboardModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/withings/leaderboard/di/LeaderboardModule;", "", "Ls00/b;", "compatWebservicesFactory", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "provideLeaderboardRemoteRepository", "(Ls00/b;)Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "<init>", "()V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardModule {
    public static final int $stable = 0;

    @Singleton
    public final LeaderboardRemoteRepository provideLeaderboardRemoteRepository(b compatWebservicesFactory) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        return new RetrofitLeaderboardRemoteRepository(compatWebservicesFactory, null, 2, null);
    }
}

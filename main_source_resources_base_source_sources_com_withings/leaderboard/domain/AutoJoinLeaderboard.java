package com.withings.leaderboard.domain;

import android.content.Context;
import com.withings.leaderboard.repositories.data.LeaderboardProgramPrefs;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import nm0.g;
import nm0.h;
/* compiled from: GetLeaderboard.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/withings/leaderboard/domain/AutoJoinLeaderboard;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "run", "()V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/leaderboard/repositories/data/LeaderboardProgramPrefs;", "leaderboardProgramPrefs$delegate", "Lnm0/g;", "getLeaderboardProgramPrefs", "()Lcom/withings/leaderboard/repositories/data/LeaderboardProgramPrefs;", "leaderboardProgramPrefs", "<init>", "(Landroid/content/Context;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AutoJoinLeaderboard extends BaseSyncAction {
    public static final int $stable = 8;
    private final Context context;
    private final g leaderboardProgramPrefs$delegate;

    public AutoJoinLeaderboard(Context context) {
        u.j(context, "context");
        this.context = context;
        this.leaderboardProgramPrefs$delegate = h.b(new AutoJoinLeaderboard$leaderboardProgramPrefs$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LeaderboardProgramPrefs getLeaderboardProgramPrefs() {
        return (LeaderboardProgramPrefs) this.leaderboardProgramPrefs$delegate.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AutoJoinLeaderboard$run$1(this, null), 2, null);
    }
}

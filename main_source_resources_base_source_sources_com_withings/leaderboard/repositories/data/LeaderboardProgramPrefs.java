package com.withings.leaderboard.repositories.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.library.authentication.api.ConstantsWs;
import hn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: LeaderboardProgramPrefs.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/withings/leaderboard/repositories/data/LeaderboardProgramPrefs;", "", "", "hasAlreadyJoinedLeaderboard", "()Z", "Lnm0/y;", "joinLeaderboard", "()V", "isLeaderboardActivate", "(Lqm0/d;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardProgramPrefs {
    private static final String PREFS_KEY_HAS_JOINED_LEADERBOARD = "hasJoinLeaderboard";
    private static final String PREFS_NAME = "WellnessPrograms";
    private final SharedPreferences prefs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LeaderboardProgramPrefs.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/leaderboard/repositories/data/LeaderboardProgramPrefs$Companion;", "", "()V", "PREFS_KEY_HAS_JOINED_LEADERBOARD", "", "PREFS_NAME", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public LeaderboardProgramPrefs(Context context) {
        u.j(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        u.i(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    private final boolean hasAlreadyJoinedLeaderboard() {
        return this.prefs.getBoolean(PREFS_KEY_HAS_JOINED_LEADERBOARD, false);
    }

    public final Object isLeaderboardActivate(d<? super Boolean> dVar) {
        if (!hasAlreadyJoinedLeaderboard()) {
            LeaderboardManager leaderboardManager = LeaderboardManager.Companion.get();
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            return leaderboardManager.hasFriends(a.s(now), dVar);
        }
        return Boolean.TRUE;
    }

    public final void joinLeaderboard() {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putBoolean(PREFS_KEY_HAS_JOINED_LEADERBOARD, true);
        edit.apply();
    }
}

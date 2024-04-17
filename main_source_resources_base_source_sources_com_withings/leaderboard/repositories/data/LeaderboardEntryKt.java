package com.withings.leaderboard.repositories.data;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LeaderboardEntry.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"username", "", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "getUsername", "(Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;)Ljava/lang/String;", "leaderboard_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardEntryKt {
    public static final String getUsername(LeaderboardEntry leaderboardEntry) {
        Object valueOf;
        u.j(leaderboardEntry, "<this>");
        String firstname = leaderboardEntry.getFirstname();
        if (TextUtils.isEmpty(leaderboardEntry.getLastName())) {
            valueOf = "";
        } else {
            valueOf = Character.valueOf(leaderboardEntry.getLastName().charAt(0));
        }
        return firstname + " " + valueOf + ".";
    }
}

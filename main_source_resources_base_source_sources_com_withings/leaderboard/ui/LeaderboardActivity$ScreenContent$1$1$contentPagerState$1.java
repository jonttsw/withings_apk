package com.withings.leaderboard.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardActivity$ScreenContent$1$1$contentPagerState$1 extends w implements a<Integer> {
    final /* synthetic */ DateTime $historyFirstDate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$ScreenContent$1$1$contentPagerState$1(DateTime dateTime) {
        super(0);
        this.$historyFirstDate = dateTime;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Integer invoke() {
        DateTime dateTime1 = this.$historyFirstDate;
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        u.j(dateTime1, "dateTime1");
        int abs = Math.abs(Weeks.weeksBetween(hn.a.s(dateTime1), now.withTimeAtStartOfDay()).getWeeks());
        if (abs < 1) {
            abs = 1;
        }
        return Integer.valueOf(abs);
    }
}

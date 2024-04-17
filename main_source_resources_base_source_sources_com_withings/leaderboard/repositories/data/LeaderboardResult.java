package com.withings.leaderboard.repositories.data;

import bn.d;
import com.google.gson.annotations.SerializedName;
import com.withings.leaderboard.repositories.webservice.entries.LeaderboardWSEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LeaderboardResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withings/leaderboard/repositories/data/LeaderboardResult;", "", "list", "", "Lcom/withings/leaderboard/repositories/webservice/entries/LeaderboardWSEntry;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardResult {
    public static final int $stable = 8;
    @SerializedName("leaderboard")
    private final List<LeaderboardWSEntry> list;

    public LeaderboardResult(List<LeaderboardWSEntry> list) {
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeaderboardResult copy$default(LeaderboardResult leaderboardResult, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = leaderboardResult.list;
        }
        return leaderboardResult.copy(list);
    }

    public final List<LeaderboardWSEntry> component1() {
        return this.list;
    }

    public final LeaderboardResult copy(List<LeaderboardWSEntry> list) {
        return new LeaderboardResult(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LeaderboardResult) && u.e(this.list, ((LeaderboardResult) obj).list)) {
            return true;
        }
        return false;
    }

    public final List<LeaderboardWSEntry> getList() {
        return this.list;
    }

    public int hashCode() {
        List<LeaderboardWSEntry> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return d.b("LeaderboardResult(list=", this.list, ")");
    }
}

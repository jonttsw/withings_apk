package com.withings.leaderboard.ui;

import kotlin.Metadata;
/* compiled from: ScanFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/leaderboard/ui/Loading;", "Lcom/withings/leaderboard/ui/BecomeFriendsResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Loading extends BecomeFriendsResult {
    public static final int $stable = 0;
    public static final Loading INSTANCE = new Loading();

    private Loading() {
        super(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Loading)) {
            return false;
        }
        Loading loading = (Loading) obj;
        return true;
    }

    public int hashCode() {
        return -1459363939;
    }

    public String toString() {
        return "Loading";
    }
}

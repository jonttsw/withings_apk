package com.withings.leaderboard.ui;

import androidx.fragment.app.o;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ScanFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/leaderboard/ui/BecomeFriendsSuccess;", "Lcom/withings/leaderboard/ui/BecomeFriendsResult;", "userName", "", "(Ljava/lang/String;)V", "getUserName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BecomeFriendsSuccess extends BecomeFriendsResult {
    public static final int $stable = 0;
    private final String userName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecomeFriendsSuccess(String userName) {
        super(null);
        u.j(userName, "userName");
        this.userName = userName;
    }

    public static /* synthetic */ BecomeFriendsSuccess copy$default(BecomeFriendsSuccess becomeFriendsSuccess, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = becomeFriendsSuccess.userName;
        }
        return becomeFriendsSuccess.copy(str);
    }

    public final String component1() {
        return this.userName;
    }

    public final BecomeFriendsSuccess copy(String userName) {
        u.j(userName, "userName");
        return new BecomeFriendsSuccess(userName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BecomeFriendsSuccess) && u.e(this.userName, ((BecomeFriendsSuccess) obj).userName)) {
            return true;
        }
        return false;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return this.userName.hashCode();
    }

    public String toString() {
        return o.d("BecomeFriendsSuccess(userName=", this.userName, ")");
    }
}

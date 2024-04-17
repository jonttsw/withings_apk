package com.withings.leaderboard.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ScanFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/leaderboard/ui/BecomeFriendsError;", "Lcom/withings/leaderboard/ui/BecomeFriendsResult;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BecomeFriendsError extends BecomeFriendsResult {
    public static final int $stable = 8;
    private final Exception exception;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecomeFriendsError(Exception exception) {
        super(null);
        u.j(exception, "exception");
        this.exception = exception;
    }

    public static /* synthetic */ BecomeFriendsError copy$default(BecomeFriendsError becomeFriendsError, Exception exc, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            exc = becomeFriendsError.exception;
        }
        return becomeFriendsError.copy(exc);
    }

    public final Exception component1() {
        return this.exception;
    }

    public final BecomeFriendsError copy(Exception exception) {
        u.j(exception, "exception");
        return new BecomeFriendsError(exception);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BecomeFriendsError) && u.e(this.exception, ((BecomeFriendsError) obj).exception)) {
            return true;
        }
        return false;
    }

    public final Exception getException() {
        return this.exception;
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        Exception exc = this.exception;
        return "BecomeFriendsError(exception=" + exc + ")";
    }
}

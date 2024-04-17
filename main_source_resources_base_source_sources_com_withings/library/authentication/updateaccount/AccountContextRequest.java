package com.withings.library.authentication.updateaccount;

import androidx.activity.result.c;
import com.withings.library.authentication.api.account.AccountContext;
import com.withings.library.authentication.login.Server;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AccountContextRequest.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/withings/library/authentication/updateaccount/AccountContextRequest;", "", "sessionId", "", "accountId", "", "server", "Lcom/withings/library/authentication/login/Server;", "accountContext", "Lcom/withings/library/authentication/api/account/AccountContext;", "(Ljava/lang/String;JLcom/withings/library/authentication/login/Server;Lcom/withings/library/authentication/api/account/AccountContext;)V", "getAccountContext", "()Lcom/withings/library/authentication/api/account/AccountContext;", "getAccountId", "()J", "getServer", "()Lcom/withings/library/authentication/login/Server;", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountContextRequest {
    private final AccountContext accountContext;
    private final long accountId;
    private final Server server;
    private final String sessionId;

    public AccountContextRequest(String sessionId, long j5, Server server, AccountContext accountContext) {
        u.j(sessionId, "sessionId");
        u.j(server, "server");
        u.j(accountContext, "accountContext");
        this.sessionId = sessionId;
        this.accountId = j5;
        this.server = server;
        this.accountContext = accountContext;
    }

    public static /* synthetic */ AccountContextRequest copy$default(AccountContextRequest accountContextRequest, String str, long j5, Server server, AccountContext accountContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountContextRequest.sessionId;
        }
        if ((i11 & 2) != 0) {
            j5 = accountContextRequest.accountId;
        }
        long j11 = j5;
        if ((i11 & 4) != 0) {
            server = accountContextRequest.server;
        }
        Server server2 = server;
        if ((i11 & 8) != 0) {
            accountContext = accountContextRequest.accountContext;
        }
        return accountContextRequest.copy(str, j11, server2, accountContext);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final long component2() {
        return this.accountId;
    }

    public final Server component3() {
        return this.server;
    }

    public final AccountContext component4() {
        return this.accountContext;
    }

    public final AccountContextRequest copy(String sessionId, long j5, Server server, AccountContext accountContext) {
        u.j(sessionId, "sessionId");
        u.j(server, "server");
        u.j(accountContext, "accountContext");
        return new AccountContextRequest(sessionId, j5, server, accountContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountContextRequest)) {
            return false;
        }
        AccountContextRequest accountContextRequest = (AccountContextRequest) obj;
        if (u.e(this.sessionId, accountContextRequest.sessionId) && this.accountId == accountContextRequest.accountId && u.e(this.server, accountContextRequest.server) && u.e(this.accountContext, accountContextRequest.accountContext)) {
            return true;
        }
        return false;
    }

    public final AccountContext getAccountContext() {
        return this.accountContext;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final Server getServer() {
        return this.server;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int a11 = c.a(this.accountId, this.sessionId.hashCode() * 31, 31);
        return this.accountContext.hashCode() + ((this.server.hashCode() + a11) * 31);
    }

    public String toString() {
        String str = this.sessionId;
        long j5 = this.accountId;
        Server server = this.server;
        AccountContext accountContext = this.accountContext;
        return "AccountContextRequest(sessionId=" + str + ", accountId=" + j5 + ", server=" + server + ", accountContext=" + accountContext + ")";
    }
}

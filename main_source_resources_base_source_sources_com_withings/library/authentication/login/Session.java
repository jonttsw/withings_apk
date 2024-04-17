package com.withings.library.authentication.login;

import androidx.activity.result.c;
import androidx.work.impl.g;
import com.withings.library.authentication.login.LoginMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Session.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0011HÆ\u0003J\t\u0010)\u001a\u00020\u0013HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003Jw\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lcom/withings/library/authentication/login/Session;", "", "accountId", "", "sessionId", "", "providerToken", "authToken", "isSecured", "", "requireSecure", "expirationTimestamp", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "server", "Lcom/withings/library/authentication/login/Server;", "sessionType", "Lcom/withings/library/authentication/login/SessionType;", "loginMethod", "Lcom/withings/library/authentication/login/LoginMethod;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJLcom/withings/library/authentication/login/ProviderType;Lcom/withings/library/authentication/login/Server;Lcom/withings/library/authentication/login/SessionType;Lcom/withings/library/authentication/login/LoginMethod;)V", "getAccountId", "()J", "getAuthToken", "()Ljava/lang/String;", "getExpirationTimestamp", "isReadOnly", "()Z", "getLoginMethod", "()Lcom/withings/library/authentication/login/LoginMethod;", "getProviderToken", "getProviderType", "()Lcom/withings/library/authentication/login/ProviderType;", "getRequireSecure", "getServer", "()Lcom/withings/library/authentication/login/Server;", "getSessionId", "getSessionType", "()Lcom/withings/library/authentication/login/SessionType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Session {
    private final long accountId;
    private final String authToken;
    private final long expirationTimestamp;
    private final boolean isReadOnly;
    private final boolean isSecured;
    private final LoginMethod loginMethod;
    private final String providerToken;
    private final ProviderType providerType;
    private final boolean requireSecure;
    private final Server server;
    private final String sessionId;
    private final SessionType sessionType;

    public Session(long j5, String sessionId, String providerToken, String authToken, boolean z5, boolean z11, long j11, ProviderType providerType, Server server, SessionType sessionType, LoginMethod loginMethod) {
        u.j(sessionId, "sessionId");
        u.j(providerToken, "providerToken");
        u.j(authToken, "authToken");
        u.j(providerType, "providerType");
        u.j(server, "server");
        u.j(sessionType, "sessionType");
        u.j(loginMethod, "loginMethod");
        this.accountId = j5;
        this.sessionId = sessionId;
        this.providerToken = providerToken;
        this.authToken = authToken;
        this.isSecured = z5;
        this.requireSecure = z11;
        this.expirationTimestamp = j11;
        this.providerType = providerType;
        this.server = server;
        this.sessionType = sessionType;
        this.loginMethod = loginMethod;
        this.isReadOnly = u.e(loginMethod, LoginMethod.SHORTCODE.INSTANCE);
    }

    public static /* synthetic */ Session copy$default(Session session, long j5, String str, String str2, String str3, boolean z5, boolean z11, long j11, ProviderType providerType, Server server, SessionType sessionType, LoginMethod loginMethod, int i11, Object obj) {
        long j12;
        String str4;
        String str5;
        String str6;
        boolean z12;
        boolean z13;
        long j13;
        ProviderType providerType2;
        Server server2;
        SessionType sessionType2;
        LoginMethod loginMethod2;
        if ((i11 & 1) != 0) {
            j12 = session.accountId;
        } else {
            j12 = j5;
        }
        if ((i11 & 2) != 0) {
            str4 = session.sessionId;
        } else {
            str4 = str;
        }
        if ((i11 & 4) != 0) {
            str5 = session.providerToken;
        } else {
            str5 = str2;
        }
        if ((i11 & 8) != 0) {
            str6 = session.authToken;
        } else {
            str6 = str3;
        }
        if ((i11 & 16) != 0) {
            z12 = session.isSecured;
        } else {
            z12 = z5;
        }
        if ((i11 & 32) != 0) {
            z13 = session.requireSecure;
        } else {
            z13 = z11;
        }
        if ((i11 & 64) != 0) {
            j13 = session.expirationTimestamp;
        } else {
            j13 = j11;
        }
        if ((i11 & 128) != 0) {
            providerType2 = session.providerType;
        } else {
            providerType2 = providerType;
        }
        if ((i11 & 256) != 0) {
            server2 = session.server;
        } else {
            server2 = server;
        }
        if ((i11 & 512) != 0) {
            sessionType2 = session.sessionType;
        } else {
            sessionType2 = sessionType;
        }
        if ((i11 & 1024) != 0) {
            loginMethod2 = session.loginMethod;
        } else {
            loginMethod2 = loginMethod;
        }
        return session.copy(j12, str4, str5, str6, z12, z13, j13, providerType2, server2, sessionType2, loginMethod2);
    }

    public final long component1() {
        return this.accountId;
    }

    public final SessionType component10() {
        return this.sessionType;
    }

    public final LoginMethod component11() {
        return this.loginMethod;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.providerToken;
    }

    public final String component4() {
        return this.authToken;
    }

    public final boolean component5() {
        return this.isSecured;
    }

    public final boolean component6() {
        return this.requireSecure;
    }

    public final long component7() {
        return this.expirationTimestamp;
    }

    public final ProviderType component8() {
        return this.providerType;
    }

    public final Server component9() {
        return this.server;
    }

    public final Session copy(long j5, String sessionId, String providerToken, String authToken, boolean z5, boolean z11, long j11, ProviderType providerType, Server server, SessionType sessionType, LoginMethod loginMethod) {
        u.j(sessionId, "sessionId");
        u.j(providerToken, "providerToken");
        u.j(authToken, "authToken");
        u.j(providerType, "providerType");
        u.j(server, "server");
        u.j(sessionType, "sessionType");
        u.j(loginMethod, "loginMethod");
        return new Session(j5, sessionId, providerToken, authToken, z5, z11, j11, providerType, server, sessionType, loginMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        if (this.accountId == session.accountId && u.e(this.sessionId, session.sessionId) && u.e(this.providerToken, session.providerToken) && u.e(this.authToken, session.authToken) && this.isSecured == session.isSecured && this.requireSecure == session.requireSecure && this.expirationTimestamp == session.expirationTimestamp && u.e(this.providerType, session.providerType) && u.e(this.server, session.server) && this.sessionType == session.sessionType && u.e(this.loginMethod, session.loginMethod)) {
            return true;
        }
        return false;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    public final LoginMethod getLoginMethod() {
        return this.loginMethod;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final ProviderType getProviderType() {
        return this.providerType;
    }

    public final boolean getRequireSecure() {
        return this.requireSecure;
    }

    public final Server getServer() {
        return this.server;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final SessionType getSessionType() {
        return this.sessionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c11 = d.c(this.authToken, d.c(this.providerToken, d.c(this.sessionId, Long.hashCode(this.accountId) * 31, 31), 31), 31);
        boolean z5 = this.isSecured;
        int i11 = 1;
        int i12 = z5;
        if (z5 != 0) {
            i12 = 1;
        }
        int i13 = (c11 + i12) * 31;
        boolean z11 = this.requireSecure;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        int a11 = c.a(this.expirationTimestamp, (i13 + i11) * 31, 31);
        int hashCode = this.server.hashCode();
        return this.loginMethod.hashCode() + ((this.sessionType.hashCode() + ((hashCode + ((this.providerType.hashCode() + a11) * 31)) * 31)) * 31);
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public final boolean isSecured() {
        return this.isSecured;
    }

    public String toString() {
        long j5 = this.accountId;
        String str = this.sessionId;
        String str2 = this.providerToken;
        String str3 = this.authToken;
        boolean z5 = this.isSecured;
        boolean z11 = this.requireSecure;
        long j11 = this.expirationTimestamp;
        ProviderType providerType = this.providerType;
        Server server = this.server;
        SessionType sessionType = this.sessionType;
        LoginMethod loginMethod = this.loginMethod;
        StringBuilder sb2 = new StringBuilder("Session(accountId=");
        sb2.append(j5);
        sb2.append(", sessionId=");
        sb2.append(str);
        b.d(sb2, ", providerToken=", str2, ", authToken=", str3);
        sb2.append(", isSecured=");
        sb2.append(z5);
        sb2.append(", requireSecure=");
        sb2.append(z11);
        g.d(sb2, ", expirationTimestamp=", j11, ", providerType=");
        sb2.append(providerType);
        sb2.append(", server=");
        sb2.append(server);
        sb2.append(", sessionType=");
        sb2.append(sessionType);
        sb2.append(", loginMethod=");
        sb2.append(loginMethod);
        sb2.append(")");
        return sb2.toString();
    }
}

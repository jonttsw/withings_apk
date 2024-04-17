package com.withings.library.authentication.api.account.authsession;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.l0;
import androidx.work.impl.g;
import com.withings.library.authentication.login.LoginMethod;
import com.withings.library.authentication.login.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AuthSession.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0010HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00060"}, d2 = {"Lcom/withings/library/authentication/api/account/authsession/AuthSession;", "", "providerToken", "", "sessionId", "accountId", "", "authToken", "requireSecureSession", "", "timeToLive", "creationTime", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "isSecured", "loginMethod", "Lcom/withings/library/authentication/login/LoginMethod;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZJJLcom/withings/library/authentication/login/ProviderType;ZLcom/withings/library/authentication/login/LoginMethod;)V", "getAccountId", "()J", "getAuthToken", "()Ljava/lang/String;", "getCreationTime", "()Z", "getLoginMethod", "()Lcom/withings/library/authentication/login/LoginMethod;", "getProviderToken", "getProviderType", "()Lcom/withings/library/authentication/login/ProviderType;", "getRequireSecureSession", "getSessionId", "getTimeToLive", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthSession {
    private final long accountId;
    private final String authToken;
    private final long creationTime;
    private final boolean isSecured;
    private final LoginMethod loginMethod;
    private final String providerToken;
    private final ProviderType providerType;
    private final boolean requireSecureSession;
    private final String sessionId;
    private final long timeToLive;

    public AuthSession(String providerToken, String sessionId, long j5, String authToken, boolean z5, long j11, long j12, ProviderType providerType, boolean z11, LoginMethod loginMethod) {
        u.j(providerToken, "providerToken");
        u.j(sessionId, "sessionId");
        u.j(authToken, "authToken");
        u.j(providerType, "providerType");
        u.j(loginMethod, "loginMethod");
        this.providerToken = providerToken;
        this.sessionId = sessionId;
        this.accountId = j5;
        this.authToken = authToken;
        this.requireSecureSession = z5;
        this.timeToLive = j11;
        this.creationTime = j12;
        this.providerType = providerType;
        this.isSecured = z11;
        this.loginMethod = loginMethod;
    }

    public static /* synthetic */ AuthSession copy$default(AuthSession authSession, String str, String str2, long j5, String str3, boolean z5, long j11, long j12, ProviderType providerType, boolean z11, LoginMethod loginMethod, int i11, Object obj) {
        String str4;
        String str5;
        long j13;
        String str6;
        boolean z12;
        long j14;
        long j15;
        ProviderType providerType2;
        boolean z13;
        LoginMethod loginMethod2;
        if ((i11 & 1) != 0) {
            str4 = authSession.providerToken;
        } else {
            str4 = str;
        }
        if ((i11 & 2) != 0) {
            str5 = authSession.sessionId;
        } else {
            str5 = str2;
        }
        if ((i11 & 4) != 0) {
            j13 = authSession.accountId;
        } else {
            j13 = j5;
        }
        if ((i11 & 8) != 0) {
            str6 = authSession.authToken;
        } else {
            str6 = str3;
        }
        if ((i11 & 16) != 0) {
            z12 = authSession.requireSecureSession;
        } else {
            z12 = z5;
        }
        if ((i11 & 32) != 0) {
            j14 = authSession.timeToLive;
        } else {
            j14 = j11;
        }
        if ((i11 & 64) != 0) {
            j15 = authSession.creationTime;
        } else {
            j15 = j12;
        }
        if ((i11 & 128) != 0) {
            providerType2 = authSession.providerType;
        } else {
            providerType2 = providerType;
        }
        if ((i11 & 256) != 0) {
            z13 = authSession.isSecured;
        } else {
            z13 = z11;
        }
        if ((i11 & 512) != 0) {
            loginMethod2 = authSession.loginMethod;
        } else {
            loginMethod2 = loginMethod;
        }
        return authSession.copy(str4, str5, j13, str6, z12, j14, j15, providerType2, z13, loginMethod2);
    }

    public final String component1() {
        return this.providerToken;
    }

    public final LoginMethod component10() {
        return this.loginMethod;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final long component3() {
        return this.accountId;
    }

    public final String component4() {
        return this.authToken;
    }

    public final boolean component5() {
        return this.requireSecureSession;
    }

    public final long component6() {
        return this.timeToLive;
    }

    public final long component7() {
        return this.creationTime;
    }

    public final ProviderType component8() {
        return this.providerType;
    }

    public final boolean component9() {
        return this.isSecured;
    }

    public final AuthSession copy(String providerToken, String sessionId, long j5, String authToken, boolean z5, long j11, long j12, ProviderType providerType, boolean z11, LoginMethod loginMethod) {
        u.j(providerToken, "providerToken");
        u.j(sessionId, "sessionId");
        u.j(authToken, "authToken");
        u.j(providerType, "providerType");
        u.j(loginMethod, "loginMethod");
        return new AuthSession(providerToken, sessionId, j5, authToken, z5, j11, j12, providerType, z11, loginMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSession)) {
            return false;
        }
        AuthSession authSession = (AuthSession) obj;
        if (u.e(this.providerToken, authSession.providerToken) && u.e(this.sessionId, authSession.sessionId) && this.accountId == authSession.accountId && u.e(this.authToken, authSession.authToken) && this.requireSecureSession == authSession.requireSecureSession && this.timeToLive == authSession.timeToLive && this.creationTime == authSession.creationTime && u.e(this.providerType, authSession.providerType) && this.isSecured == authSession.isSecured && u.e(this.loginMethod, authSession.loginMethod)) {
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

    public final long getCreationTime() {
        return this.creationTime;
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

    public final boolean getRequireSecureSession() {
        return this.requireSecureSession;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimeToLive() {
        return this.timeToLive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c11 = d.c(this.authToken, c.a(this.accountId, d.c(this.sessionId, this.providerToken.hashCode() * 31, 31), 31), 31);
        boolean z5 = this.requireSecureSession;
        int i11 = 1;
        int i12 = z5;
        if (z5 != 0) {
            i12 = 1;
        }
        int hashCode = (this.providerType.hashCode() + c.a(this.creationTime, c.a(this.timeToLive, (c11 + i12) * 31, 31), 31)) * 31;
        boolean z11 = this.isSecured;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return this.loginMethod.hashCode() + ((hashCode + i11) * 31);
    }

    public final boolean isSecured() {
        return this.isSecured;
    }

    public String toString() {
        String str = this.providerToken;
        String str2 = this.sessionId;
        long j5 = this.accountId;
        String str3 = this.authToken;
        boolean z5 = this.requireSecureSession;
        long j11 = this.timeToLive;
        long j12 = this.creationTime;
        ProviderType providerType = this.providerType;
        boolean z11 = this.isSecured;
        LoginMethod loginMethod = this.loginMethod;
        StringBuilder b10 = l0.b("AuthSession(providerToken=", str, ", sessionId=", str2, ", accountId=");
        b10.append(j5);
        b10.append(", authToken=");
        b10.append(str3);
        b10.append(", requireSecureSession=");
        b10.append(z5);
        b10.append(", timeToLive=");
        b10.append(j11);
        g.d(b10, ", creationTime=", j12, ", providerType=");
        b10.append(providerType);
        b10.append(", isSecured=");
        b10.append(z11);
        b10.append(", loginMethod=");
        b10.append(loginMethod);
        b10.append(")");
        return b10.toString();
    }
}

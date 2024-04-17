package com.withings.library.authentication.api.auth.accountsession;

import androidx.activity.result.c;
import androidx.work.impl.g;
import com.withings.library.authentication.login.LoginMethod;
import com.withings.library.authentication.login.SessionKt;
import com.withings.library.authentication.utils.TimeKt;
import ep0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
/* compiled from: RemoteAccountSession.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0001.B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000fHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003Jo\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006/"}, d2 = {"Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSession;", "", "sessionId", "", "timeToLive", "", "creationTime", "accountId", "accountLogin", "secureSessionRequire", "", "providerToken", "authToken", "isSecured", "loginMethod", "Lcom/withings/library/authentication/login/LoginMethod;", "(Ljava/lang/String;JJJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLcom/withings/library/authentication/login/LoginMethod;)V", "getAccountId", "()J", "getAccountLogin", "()Ljava/lang/String;", "getAuthToken", "getCreationTime", "()Z", "getLoginMethod", "()Lcom/withings/library/authentication/login/LoginMethod;", "getProviderToken", "getSecureSessionRequire", "getSessionId", "getTimeToLive", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable(with = RemoteAccountSessionDeserializer.class)
/* loaded from: classes4.dex */
public final class RemoteAccountSession {
    public static final Companion Companion = new Companion(null);
    private final long accountId;
    private final String accountLogin;
    private final String authToken;
    private final long creationTime;
    private final boolean isSecured;
    private final LoginMethod loginMethod;
    private final String providerToken;
    private final boolean secureSessionRequire;
    private final String sessionId;
    private final long timeToLive;

    /* compiled from: RemoteAccountSession.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSession$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSession;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<RemoteAccountSession> serializer() {
            return RemoteAccountSessionDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RemoteAccountSession(String sessionId, long j5, long j11, long j12, String accountLogin, boolean z5, String providerToken, String str, boolean z11, LoginMethod loginMethod) {
        u.j(sessionId, "sessionId");
        u.j(accountLogin, "accountLogin");
        u.j(providerToken, "providerToken");
        u.j(loginMethod, "loginMethod");
        this.sessionId = sessionId;
        this.timeToLive = j5;
        this.creationTime = j11;
        this.accountId = j12;
        this.accountLogin = accountLogin;
        this.secureSessionRequire = z5;
        this.providerToken = providerToken;
        this.authToken = str;
        this.isSecured = z11;
        this.loginMethod = loginMethod;
    }

    public static /* synthetic */ RemoteAccountSession copy$default(RemoteAccountSession remoteAccountSession, String str, long j5, long j11, long j12, String str2, boolean z5, String str3, String str4, boolean z11, LoginMethod loginMethod, int i11, Object obj) {
        String str5;
        long j13;
        long j14;
        long j15;
        String str6;
        boolean z12;
        String str7;
        String str8;
        boolean z13;
        LoginMethod loginMethod2;
        if ((i11 & 1) != 0) {
            str5 = remoteAccountSession.sessionId;
        } else {
            str5 = str;
        }
        if ((i11 & 2) != 0) {
            j13 = remoteAccountSession.timeToLive;
        } else {
            j13 = j5;
        }
        if ((i11 & 4) != 0) {
            j14 = remoteAccountSession.creationTime;
        } else {
            j14 = j11;
        }
        if ((i11 & 8) != 0) {
            j15 = remoteAccountSession.accountId;
        } else {
            j15 = j12;
        }
        if ((i11 & 16) != 0) {
            str6 = remoteAccountSession.accountLogin;
        } else {
            str6 = str2;
        }
        if ((i11 & 32) != 0) {
            z12 = remoteAccountSession.secureSessionRequire;
        } else {
            z12 = z5;
        }
        if ((i11 & 64) != 0) {
            str7 = remoteAccountSession.providerToken;
        } else {
            str7 = str3;
        }
        if ((i11 & 128) != 0) {
            str8 = remoteAccountSession.authToken;
        } else {
            str8 = str4;
        }
        if ((i11 & 256) != 0) {
            z13 = remoteAccountSession.isSecured;
        } else {
            z13 = z11;
        }
        if ((i11 & 512) != 0) {
            loginMethod2 = remoteAccountSession.loginMethod;
        } else {
            loginMethod2 = loginMethod;
        }
        return remoteAccountSession.copy(str5, j13, j14, j15, str6, z12, str7, str8, z13, loginMethod2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final LoginMethod component10() {
        return this.loginMethod;
    }

    public final long component2() {
        return this.timeToLive;
    }

    public final long component3() {
        return this.creationTime;
    }

    public final long component4() {
        return this.accountId;
    }

    public final String component5() {
        return this.accountLogin;
    }

    public final boolean component6() {
        return this.secureSessionRequire;
    }

    public final String component7() {
        return this.providerToken;
    }

    public final String component8() {
        return this.authToken;
    }

    public final boolean component9() {
        return this.isSecured;
    }

    public final RemoteAccountSession copy(String sessionId, long j5, long j11, long j12, String accountLogin, boolean z5, String providerToken, String str, boolean z11, LoginMethod loginMethod) {
        u.j(sessionId, "sessionId");
        u.j(accountLogin, "accountLogin");
        u.j(providerToken, "providerToken");
        u.j(loginMethod, "loginMethod");
        return new RemoteAccountSession(sessionId, j5, j11, j12, accountLogin, z5, providerToken, str, z11, loginMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteAccountSession)) {
            return false;
        }
        RemoteAccountSession remoteAccountSession = (RemoteAccountSession) obj;
        if (u.e(this.sessionId, remoteAccountSession.sessionId) && this.timeToLive == remoteAccountSession.timeToLive && this.creationTime == remoteAccountSession.creationTime && this.accountId == remoteAccountSession.accountId && u.e(this.accountLogin, remoteAccountSession.accountLogin) && this.secureSessionRequire == remoteAccountSession.secureSessionRequire && u.e(this.providerToken, remoteAccountSession.providerToken) && u.e(this.authToken, remoteAccountSession.authToken) && this.isSecured == remoteAccountSession.isSecured && u.e(this.loginMethod, remoteAccountSession.loginMethod)) {
            return true;
        }
        return false;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final String getAccountLogin() {
        return this.accountLogin;
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

    public final boolean getSecureSessionRequire() {
        return this.secureSessionRequire;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimeToLive() {
        return this.timeToLive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.accountLogin, c.a(this.accountId, c.a(this.creationTime, c.a(this.timeToLive, this.sessionId.hashCode() * 31, 31), 31), 31), 31);
        boolean z5 = this.secureSessionRequire;
        int i11 = 1;
        int i12 = z5;
        if (z5 != 0) {
            i12 = 1;
        }
        int c12 = d.c(this.providerToken, (c11 + i12) * 31, 31);
        String str = this.authToken;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (c12 + hashCode) * 31;
        boolean z11 = this.isSecured;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return this.loginMethod.hashCode() + ((i13 + i11) * 31);
    }

    public final boolean isSecured() {
        return this.isSecured;
    }

    public String toString() {
        String str = this.sessionId;
        long j5 = this.timeToLive;
        long j11 = this.creationTime;
        long j12 = this.accountId;
        String str2 = this.accountLogin;
        boolean z5 = this.secureSessionRequire;
        String str3 = this.providerToken;
        String str4 = this.authToken;
        boolean z11 = this.isSecured;
        LoginMethod loginMethod = this.loginMethod;
        StringBuilder sb2 = new StringBuilder("RemoteAccountSession(sessionId=");
        sb2.append(str);
        sb2.append(", timeToLive=");
        sb2.append(j5);
        g.d(sb2, ", creationTime=", j11, ", accountId=");
        sb2.append(j12);
        sb2.append(", accountLogin=");
        sb2.append(str2);
        sb2.append(", secureSessionRequire=");
        sb2.append(z5);
        sb2.append(", providerToken=");
        sb2.append(str3);
        sb2.append(", authToken=");
        sb2.append(str4);
        sb2.append(", isSecured=");
        sb2.append(z11);
        sb2.append(", loginMethod=");
        sb2.append(loginMethod);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ RemoteAccountSession(String str, long j5, long j11, long j12, String str2, boolean z5, String str3, String str4, boolean z11, LoginMethod loginMethod, int i11, m mVar) {
        this(str, (i11 & 2) != 0 ? a.i(SessionKt.getSESSION_TIME_TO_LIVE()) : j5, (i11 & 4) != 0 ? TimeKt.getSystemTimeInMillis() : j11, j12, (i11 & 16) != 0 ? "" : str2, z5, str3, str4, z11, loginMethod);
    }
}

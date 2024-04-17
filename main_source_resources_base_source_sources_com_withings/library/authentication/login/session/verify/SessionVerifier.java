package com.withings.library.authentication.login.session.verify;

import androidx.activity.result.c;
import com.withings.library.authentication.login.LoginMethod;
import com.withings.library.authentication.login.ProviderType;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.SessionType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: SessionVerifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "sessionVerifierRequest", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "verifySession", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "SessionVerifierRequest", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface SessionVerifier {

    /* compiled from: SessionVerifier.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0011HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "", "sessionId", "", "accountId", "", "secureSessionRequire", "", "providerToken", "authToken", "expirationTimestamp", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "isSecured", "sessionType", "Lcom/withings/library/authentication/login/SessionType;", "loginMethod", "Lcom/withings/library/authentication/login/LoginMethod;", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;JLcom/withings/library/authentication/login/ProviderType;ZLcom/withings/library/authentication/login/SessionType;Lcom/withings/library/authentication/login/LoginMethod;)V", "getAccountId", "()J", "getAuthToken", "()Ljava/lang/String;", "getExpirationTimestamp", "()Z", "getLoginMethod", "()Lcom/withings/library/authentication/login/LoginMethod;", "getProviderToken", "getProviderType", "()Lcom/withings/library/authentication/login/ProviderType;", "getSecureSessionRequire", "getSessionId", "getSessionType", "()Lcom/withings/library/authentication/login/SessionType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SessionVerifierRequest {
        private final long accountId;
        private final String authToken;
        private final long expirationTimestamp;
        private final boolean isSecured;
        private final LoginMethod loginMethod;
        private final String providerToken;
        private final ProviderType providerType;
        private final boolean secureSessionRequire;
        private final String sessionId;
        private final SessionType sessionType;

        public SessionVerifierRequest(String sessionId, long j5, boolean z5, String providerToken, String authToken, long j11, ProviderType providerType, boolean z11, SessionType sessionType, LoginMethod loginMethod) {
            u.j(sessionId, "sessionId");
            u.j(providerToken, "providerToken");
            u.j(authToken, "authToken");
            u.j(providerType, "providerType");
            u.j(sessionType, "sessionType");
            u.j(loginMethod, "loginMethod");
            this.sessionId = sessionId;
            this.accountId = j5;
            this.secureSessionRequire = z5;
            this.providerToken = providerToken;
            this.authToken = authToken;
            this.expirationTimestamp = j11;
            this.providerType = providerType;
            this.isSecured = z11;
            this.sessionType = sessionType;
            this.loginMethod = loginMethod;
        }

        public static /* synthetic */ SessionVerifierRequest copy$default(SessionVerifierRequest sessionVerifierRequest, String str, long j5, boolean z5, String str2, String str3, long j11, ProviderType providerType, boolean z11, SessionType sessionType, LoginMethod loginMethod, int i11, Object obj) {
            String str4;
            long j12;
            boolean z12;
            String str5;
            String str6;
            long j13;
            ProviderType providerType2;
            boolean z13;
            SessionType sessionType2;
            LoginMethod loginMethod2;
            if ((i11 & 1) != 0) {
                str4 = sessionVerifierRequest.sessionId;
            } else {
                str4 = str;
            }
            if ((i11 & 2) != 0) {
                j12 = sessionVerifierRequest.accountId;
            } else {
                j12 = j5;
            }
            if ((i11 & 4) != 0) {
                z12 = sessionVerifierRequest.secureSessionRequire;
            } else {
                z12 = z5;
            }
            if ((i11 & 8) != 0) {
                str5 = sessionVerifierRequest.providerToken;
            } else {
                str5 = str2;
            }
            if ((i11 & 16) != 0) {
                str6 = sessionVerifierRequest.authToken;
            } else {
                str6 = str3;
            }
            if ((i11 & 32) != 0) {
                j13 = sessionVerifierRequest.expirationTimestamp;
            } else {
                j13 = j11;
            }
            if ((i11 & 64) != 0) {
                providerType2 = sessionVerifierRequest.providerType;
            } else {
                providerType2 = providerType;
            }
            if ((i11 & 128) != 0) {
                z13 = sessionVerifierRequest.isSecured;
            } else {
                z13 = z11;
            }
            if ((i11 & 256) != 0) {
                sessionType2 = sessionVerifierRequest.sessionType;
            } else {
                sessionType2 = sessionType;
            }
            if ((i11 & 512) != 0) {
                loginMethod2 = sessionVerifierRequest.loginMethod;
            } else {
                loginMethod2 = loginMethod;
            }
            return sessionVerifierRequest.copy(str4, j12, z12, str5, str6, j13, providerType2, z13, sessionType2, loginMethod2);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final LoginMethod component10() {
            return this.loginMethod;
        }

        public final long component2() {
            return this.accountId;
        }

        public final boolean component3() {
            return this.secureSessionRequire;
        }

        public final String component4() {
            return this.providerToken;
        }

        public final String component5() {
            return this.authToken;
        }

        public final long component6() {
            return this.expirationTimestamp;
        }

        public final ProviderType component7() {
            return this.providerType;
        }

        public final boolean component8() {
            return this.isSecured;
        }

        public final SessionType component9() {
            return this.sessionType;
        }

        public final SessionVerifierRequest copy(String sessionId, long j5, boolean z5, String providerToken, String authToken, long j11, ProviderType providerType, boolean z11, SessionType sessionType, LoginMethod loginMethod) {
            u.j(sessionId, "sessionId");
            u.j(providerToken, "providerToken");
            u.j(authToken, "authToken");
            u.j(providerType, "providerType");
            u.j(sessionType, "sessionType");
            u.j(loginMethod, "loginMethod");
            return new SessionVerifierRequest(sessionId, j5, z5, providerToken, authToken, j11, providerType, z11, sessionType, loginMethod);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionVerifierRequest)) {
                return false;
            }
            SessionVerifierRequest sessionVerifierRequest = (SessionVerifierRequest) obj;
            if (u.e(this.sessionId, sessionVerifierRequest.sessionId) && this.accountId == sessionVerifierRequest.accountId && this.secureSessionRequire == sessionVerifierRequest.secureSessionRequire && u.e(this.providerToken, sessionVerifierRequest.providerToken) && u.e(this.authToken, sessionVerifierRequest.authToken) && this.expirationTimestamp == sessionVerifierRequest.expirationTimestamp && u.e(this.providerType, sessionVerifierRequest.providerType) && this.isSecured == sessionVerifierRequest.isSecured && this.sessionType == sessionVerifierRequest.sessionType && u.e(this.loginMethod, sessionVerifierRequest.loginMethod)) {
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

        public final boolean getSecureSessionRequire() {
            return this.secureSessionRequire;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final SessionType getSessionType() {
            return this.sessionType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int a11 = c.a(this.accountId, this.sessionId.hashCode() * 31, 31);
            boolean z5 = this.secureSessionRequire;
            int i11 = 1;
            int i12 = z5;
            if (z5 != 0) {
                i12 = 1;
            }
            int hashCode = (this.providerType.hashCode() + c.a(this.expirationTimestamp, d.c(this.authToken, d.c(this.providerToken, (a11 + i12) * 31, 31), 31), 31)) * 31;
            boolean z11 = this.isSecured;
            if (!z11) {
                i11 = z11 ? 1 : 0;
            }
            return this.loginMethod.hashCode() + ((this.sessionType.hashCode() + ((hashCode + i11) * 31)) * 31);
        }

        public final boolean isSecured() {
            return this.isSecured;
        }

        public String toString() {
            String str = this.sessionId;
            long j5 = this.accountId;
            boolean z5 = this.secureSessionRequire;
            String str2 = this.providerToken;
            String str3 = this.authToken;
            long j11 = this.expirationTimestamp;
            ProviderType providerType = this.providerType;
            boolean z11 = this.isSecured;
            SessionType sessionType = this.sessionType;
            LoginMethod loginMethod = this.loginMethod;
            return "SessionVerifierRequest(sessionId=" + str + ", accountId=" + j5 + ", secureSessionRequire=" + z5 + ", providerToken=" + str2 + ", authToken=" + str3 + ", expirationTimestamp=" + j11 + ", providerType=" + providerType + ", isSecured=" + z11 + ", sessionType=" + sessionType + ", loginMethod=" + loginMethod + ")";
        }
    }

    Object verifySession(SessionVerifierRequest sessionVerifierRequest, Server server, d<? super SessionVerifierResult> dVar);
}

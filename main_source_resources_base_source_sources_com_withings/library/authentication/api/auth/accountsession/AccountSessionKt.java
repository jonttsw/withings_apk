package com.withings.library.authentication.api.auth.accountsession;

import com.withings.library.authentication.login.SessionType;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AccountSession.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"toVerifyRequest", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "Lcom/withings/library/authentication/api/auth/accountsession/AccountSession;", "sessionType", "Lcom/withings/library/authentication/login/SessionType;", "overrideAuthToken", "", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountSessionKt {
    public static final SessionVerifier.SessionVerifierRequest toVerifyRequest(AccountSession accountSession, SessionType sessionType) {
        u.j(accountSession, "<this>");
        u.j(sessionType, "sessionType");
        String sessionId = accountSession.getSessionId();
        long accountId = accountSession.getAccountId();
        boolean secureSessionRequire = accountSession.getSecureSessionRequire();
        String providerToken = accountSession.getProviderToken();
        String authToken = accountSession.getAuthToken();
        u.g(authToken);
        return new SessionVerifier.SessionVerifierRequest(sessionId, accountId, secureSessionRequire, providerToken, authToken, accountSession.getCreationTime() + accountSession.getTimeToLive(), accountSession.getProviderType(), accountSession.isSecured(), sessionType, accountSession.getLoginMethod());
    }

    public static final SessionVerifier.SessionVerifierRequest toVerifyRequest(AccountSession accountSession, String overrideAuthToken, SessionType sessionType) {
        u.j(accountSession, "<this>");
        u.j(overrideAuthToken, "overrideAuthToken");
        u.j(sessionType, "sessionType");
        String sessionId = accountSession.getSessionId();
        long accountId = accountSession.getAccountId();
        boolean secureSessionRequire = accountSession.getSecureSessionRequire();
        String providerToken = accountSession.getProviderToken();
        String authToken = accountSession.getAuthToken();
        if (authToken == null) {
            authToken = overrideAuthToken;
        }
        return new SessionVerifier.SessionVerifierRequest(sessionId, accountId, secureSessionRequire, providerToken, authToken, accountSession.getCreationTime() + accountSession.getTimeToLive(), accountSession.getProviderType(), accountSession.isSecured(), sessionType, accountSession.getLoginMethod());
    }
}

package com.withings.library.authentication.api.account.authsession;

import com.withings.library.authentication.login.SessionType;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AuthSession.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVerifierRequest", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "Lcom/withings/library/authentication/api/account/authsession/AuthSession;", "sessionType", "Lcom/withings/library/authentication/login/SessionType;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthSessionKt {
    public static final SessionVerifier.SessionVerifierRequest toVerifierRequest(AuthSession authSession, SessionType sessionType) {
        u.j(authSession, "<this>");
        u.j(sessionType, "sessionType");
        return new SessionVerifier.SessionVerifierRequest(authSession.getSessionId(), authSession.getAccountId(), authSession.getRequireSecureSession(), authSession.getProviderToken(), authSession.getAuthToken(), authSession.getCreationTime() + authSession.getTimeToLive(), authSession.getProviderType(), authSession.isSecured(), sessionType, authSession.getLoginMethod());
    }
}

package com.withings.library.authentication.login.session.verify;

import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.Session;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SessionVerifier.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toSession", "Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "server", "Lcom/withings/library/authentication/login/Server;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionVerifierKt {
    public static final Session toSession(SessionVerifier.SessionVerifierRequest sessionVerifierRequest, Server server) {
        u.j(sessionVerifierRequest, "<this>");
        u.j(server, "server");
        return new Session(sessionVerifierRequest.getAccountId(), sessionVerifierRequest.getSessionId(), sessionVerifierRequest.getProviderToken(), sessionVerifierRequest.getAuthToken(), sessionVerifierRequest.isSecured(), sessionVerifierRequest.getSecureSessionRequire(), sessionVerifierRequest.getExpirationTimestamp(), sessionVerifierRequest.getProviderType(), server, sessionVerifierRequest.getSessionType(), sessionVerifierRequest.getLoginMethod());
    }
}

package com.withings.library.authentication.api.auth.accountsession;

import com.withings.library.authentication.login.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemoteAccountSession.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toAccountSession", "Lcom/withings/library/authentication/api/auth/accountsession/AccountSession;", "Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSession;", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteAccountSessionKt {
    public static final AccountSession toAccountSession(RemoteAccountSession remoteAccountSession, ProviderType providerType) {
        u.j(remoteAccountSession, "<this>");
        u.j(providerType, "providerType");
        return new AccountSession(remoteAccountSession.getSessionId(), remoteAccountSession.getTimeToLive(), remoteAccountSession.getCreationTime(), remoteAccountSession.getAccountId(), remoteAccountSession.getAccountLogin(), remoteAccountSession.getSecureSessionRequire(), remoteAccountSession.getProviderToken(), remoteAccountSession.getAuthToken(), providerType, remoteAccountSession.isSecured(), remoteAccountSession.getLoginMethod());
    }
}

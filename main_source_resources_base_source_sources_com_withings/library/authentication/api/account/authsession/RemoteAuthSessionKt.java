package com.withings.library.authentication.api.account.authsession;

import com.withings.library.authentication.login.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemoteAuthSession.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toAuthSession", "Lcom/withings/library/authentication/api/account/authsession/AuthSession;", "Lcom/withings/library/authentication/api/account/authsession/RemoteAuthSession;", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteAuthSessionKt {
    public static final AuthSession toAuthSession(RemoteAuthSession remoteAuthSession, ProviderType providerType) {
        u.j(remoteAuthSession, "<this>");
        u.j(providerType, "providerType");
        return new AuthSession(remoteAuthSession.getProviderToken(), remoteAuthSession.getSessionId(), remoteAuthSession.getAccountId(), remoteAuthSession.getAuthToken(), remoteAuthSession.getRequireSecureSession(), remoteAuthSession.getTimeToLive(), remoteAuthSession.getCreationTime(), providerType, remoteAuthSession.isSecured(), remoteAuthSession.getLoginMethod());
    }
}

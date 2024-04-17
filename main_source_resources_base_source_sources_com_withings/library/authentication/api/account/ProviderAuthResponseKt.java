package com.withings.library.authentication.api.account;

import com.withings.library.authentication.api.auth.accountsession.AccountSession;
import com.withings.library.authentication.login.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ProviderAuthResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toAccountSession", "Lcom/withings/library/authentication/api/auth/accountsession/AccountSession;", "Lcom/withings/library/authentication/api/account/ProviderAuthResponse;", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProviderAuthResponseKt {
    public static final AccountSession toAccountSession(ProviderAuthResponse providerAuthResponse, ProviderType providerType) {
        u.j(providerAuthResponse, "<this>");
        u.j(providerType, "providerType");
        return new AccountSession(providerAuthResponse.getSessionId(), 0L, 0L, providerAuthResponse.getAccountId(), null, providerAuthResponse.getRequireSecureSession(), providerAuthResponse.getToken(), providerAuthResponse.getAuthToken(), providerType, providerAuthResponse.isSecured(), providerAuthResponse.getLoginMethod(), 22, null);
    }
}

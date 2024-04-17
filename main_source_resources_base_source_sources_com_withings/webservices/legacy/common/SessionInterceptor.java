package com.withings.webservices.legacy.common;

import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import retrofit.RequestInterceptor;
import retrofit.RetrofitError;
/* loaded from: classes4.dex */
public class SessionInterceptor implements RequestInterceptor {
    private SessionIdProvider sessionIdProvider;

    public SessionInterceptor(SessionIdProvider sessionIdProvider) {
        this.sessionIdProvider = sessionIdProvider;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade requestFacade) {
        try {
            requestFacade.addHeader(com.withings.network.android.interceptors.SessionInterceptor.KEY_SESSION_ID, this.sessionIdProvider.getSessionId());
        } catch (WsAuthFailedException e11) {
            throw RetrofitError.unexpectedError("Unable to get session (wrong password)", e11);
        }
    }
}

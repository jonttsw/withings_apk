package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.common.SessionIdProvider;
import com.withings.webservices.legacy.common.WSHandlerDelegate;
import retrofit.RestAdapter;
/* loaded from: classes4.dex */
public interface ApiBuilder {
    <A> A build(Class<A> cls);

    void mockError(int i11, WSHandlerDelegate wSHandlerDelegate);

    ApiBuilder setAccountSessionProvider();

    ApiBuilder setEndpoint(String str);

    ApiBuilder setHandlerErrorDelegate(WSHandlerDelegate wSHandlerDelegate);

    ApiBuilder setLogLevel(RestAdapter.LogLevel logLevel);

    ApiBuilder setSessionIdProvider(SessionIdProvider sessionIdProvider);

    ApiBuilder setSyncContext(String str);
}

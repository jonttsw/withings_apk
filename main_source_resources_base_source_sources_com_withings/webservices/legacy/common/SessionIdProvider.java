package com.withings.webservices.legacy.common;

import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import kotlin.Metadata;
/* compiled from: SessionIdProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withings/webservices/legacy/common/SessionIdProvider;", "", "Lnm0/y;", "invalidateSession", "()V", "", "getSessionId", "()Ljava/lang/String;", "sessionId", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface SessionIdProvider {
    String getSessionId() throws WsAuthFailedException;

    void invalidateSession();
}

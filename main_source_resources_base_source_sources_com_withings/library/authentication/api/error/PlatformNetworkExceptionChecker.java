package com.withings.library.authentication.api.error;

import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformNetworkExceptionChecker.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/api/error/PlatformNetworkExceptionChecker;", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "()V", "isNetworkException", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlatformNetworkExceptionChecker implements NetworkExceptionChecker {
    @Override // com.withings.library.authentication.api.error.NetworkExceptionChecker
    public boolean isNetworkException(Exception exception) {
        u.j(exception, "exception");
        return exception instanceof UnknownHostException;
    }
}

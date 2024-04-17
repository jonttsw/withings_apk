package com.withings.library.authentication.api.error;

import kotlin.Metadata;
/* compiled from: NetworkExceptionChecker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "", "isNetworkException", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NetworkExceptionChecker {
    boolean isNetworkException(Exception exc);
}

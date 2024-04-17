package com.withings.webservices.legacy.common.exception;

import com.withings.webservices.legacy.common.exception.WrongStatusException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LoginException.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/LoginException;", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Checked;", "url", "", "conversion", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;", "(Ljava/lang/String;Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;)V", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoginException extends WrongStatusException.Checked {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginException(String url, WrongStatusException.Conversion conversion) {
        super(url, conversion);
        u.j(url, "url");
        u.j(conversion, "conversion");
    }
}

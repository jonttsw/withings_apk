package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedOutImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.LoggedOutImpl", f = "LoggedOutImpl.kt", l = {300, ConstantsWs.WS_STATUS_NOSHARINGS, ConstantsWs.WS_STATUS_WRONG_SHARINGAPPROVAL, ConstantsWs.WS_STATUS_WRONGTYPE}, m = "loginWithExternalProviderAndProviderCode")
/* loaded from: classes4.dex */
public final class LoggedOutImpl$loginWithExternalProviderAndProviderCode$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedOutImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedOutImpl$loginWithExternalProviderAndProviderCode$1(LoggedOutImpl loggedOutImpl, d<? super LoggedOutImpl$loginWithExternalProviderAndProviderCode$1> dVar) {
        super(dVar);
        this.this$0 = loggedOutImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginWithExternalProviderAndProviderCode(null, null, null, this);
    }
}

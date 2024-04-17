package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedOutWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.LoggedOutWithRepo", f = "LoggedOutWithRepo.kt", l = {ConstantsWs.WS_STATUS_DEVASSOCERROR, ConstantsWs.WS_STATUS_WRONGASSOCID, ConstantsWs.WS_STATUS_MISSING, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED, ConstantsWs.WS_STATUS_ALREADYACTIVATED, ConstantsWs.WS_STATUS_NOPRIMARYUSER, ConstantsWs.WS_STATUS_TOOBIG, ConstantsWs.WS_STATUS_USERCREATEERROR, ConstantsWs.WS_STATUS_NOPWDUPDATECODE, ConstantsWs.WS_STATUS_UNAUTHORIZED}, m = "loginWithMail")
/* loaded from: classes4.dex */
public final class LoggedOutWithRepo$loginWithMail$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedOutWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedOutWithRepo$loginWithMail$1(LoggedOutWithRepo loggedOutWithRepo, d<? super LoggedOutWithRepo$loginWithMail$1> dVar) {
        super(dVar);
        this.this$0 = loggedOutWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginWithMail(null, this);
    }
}

package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedOutWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.LoggedOutWithRepo", f = "LoggedOutWithRepo.kt", l = {187, 193, ConstantsWs.MEASURE_TYPE_EDA_LEFT_FOOT, 201, 205, 209, 213, 217, 221, 225, 229}, m = "loginWithExternalProviderAndProviderCode")
/* loaded from: classes4.dex */
public final class LoggedOutWithRepo$loginWithExternalProviderAndProviderCode$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedOutWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedOutWithRepo$loginWithExternalProviderAndProviderCode$1(LoggedOutWithRepo loggedOutWithRepo, d<? super LoggedOutWithRepo$loginWithExternalProviderAndProviderCode$1> dVar) {
        super(dVar);
        this.this$0 = loggedOutWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginWithExternalProviderAndProviderCode(null, null, null, this);
    }
}

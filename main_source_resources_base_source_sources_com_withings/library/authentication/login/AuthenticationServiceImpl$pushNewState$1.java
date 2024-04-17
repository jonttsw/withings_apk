package com.withings.library.authentication.login;

import com.withings.library.authentication.login.state.AuthenticationState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.AuthenticationServiceImpl", f = "AuthenticationServiceImpl.kt", l = {70}, m = "pushNewState")
/* loaded from: classes4.dex */
public final class AuthenticationServiceImpl$pushNewState$1<T extends AuthenticationState> extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthenticationServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationServiceImpl$pushNewState$1(AuthenticationServiceImpl authenticationServiceImpl, d<? super AuthenticationServiceImpl$pushNewState$1> dVar) {
        super(dVar);
        this.this$0 = authenticationServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pushNewState(null, this);
    }
}

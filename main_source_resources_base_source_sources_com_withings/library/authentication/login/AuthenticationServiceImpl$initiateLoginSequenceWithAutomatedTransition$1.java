package com.withings.library.authentication.login;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.AuthenticationServiceImpl", f = "AuthenticationServiceImpl.kt", l = {42, 48, 52}, m = "initiateLoginSequenceWithAutomatedTransition")
/* loaded from: classes4.dex */
public final class AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthenticationServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1(AuthenticationServiceImpl authenticationServiceImpl, d<? super AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1> dVar) {
        super(dVar);
        this.this$0 = authenticationServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initiateLoginSequenceWithAutomatedTransition(this);
    }
}

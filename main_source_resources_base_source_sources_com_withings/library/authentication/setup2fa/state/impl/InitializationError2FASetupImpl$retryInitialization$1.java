package com.withings.library.authentication.setup2fa.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializationError2FASetupImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.setup2fa.state.impl.InitializationError2FASetupImpl", f = "InitializationError2FASetupImpl.kt", l = {32, 55}, m = "retryInitialization")
/* loaded from: classes4.dex */
public final class InitializationError2FASetupImpl$retryInitialization$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializationError2FASetupImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationError2FASetupImpl$retryInitialization$1(InitializationError2FASetupImpl initializationError2FASetupImpl, d<? super InitializationError2FASetupImpl$retryInitialization$1> dVar) {
        super(dVar);
        this.this$0 = initializationError2FASetupImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retryInitialization(this);
    }
}

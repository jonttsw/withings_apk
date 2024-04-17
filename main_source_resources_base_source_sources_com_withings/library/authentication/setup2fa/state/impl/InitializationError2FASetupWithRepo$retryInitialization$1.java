package com.withings.library.authentication.setup2fa.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializationError2FASetupWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.setup2fa.state.impl.InitializationError2FASetupWithRepo", f = "InitializationError2FASetupWithRepo.kt", l = {24, 27, 31, 35}, m = "retryInitialization")
/* loaded from: classes4.dex */
public final class InitializationError2FASetupWithRepo$retryInitialization$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializationError2FASetupWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationError2FASetupWithRepo$retryInitialization$1(InitializationError2FASetupWithRepo initializationError2FASetupWithRepo, d<? super InitializationError2FASetupWithRepo$retryInitialization$1> dVar) {
        super(dVar);
        this.this$0 = initializationError2FASetupWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retryInitialization(this);
    }
}

package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializationErrorSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo", f = "InitializationErrorSensitiveActionStateWithRepo.kt", l = {26, 29, 33, 37}, m = "retryInitialization")
/* loaded from: classes4.dex */
public final class InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializationErrorSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1(InitializationErrorSensitiveActionStateWithRepo initializationErrorSensitiveActionStateWithRepo, d<? super InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1> dVar) {
        super(dVar);
        this.this$0 = initializationErrorSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retryInitialization(this);
    }
}

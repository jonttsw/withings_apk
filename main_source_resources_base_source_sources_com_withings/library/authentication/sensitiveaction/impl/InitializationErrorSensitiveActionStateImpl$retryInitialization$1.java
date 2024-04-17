package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializationErrorSensitiveActionStateImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl", f = "InitializationErrorSensitiveActionStateImpl.kt", l = {25}, m = "retryInitialization")
/* loaded from: classes4.dex */
public final class InitializationErrorSensitiveActionStateImpl$retryInitialization$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializationErrorSensitiveActionStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationErrorSensitiveActionStateImpl$retryInitialization$1(InitializationErrorSensitiveActionStateImpl initializationErrorSensitiveActionStateImpl, d<? super InitializationErrorSensitiveActionStateImpl$retryInitialization$1> dVar) {
        super(dVar);
        this.this$0 = initializationErrorSensitiveActionStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retryInitialization(this);
    }
}

package com.withings.library.authentication.recovery;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecoveryCodeServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.recovery.RecoveryCodeServiceImpl", f = "RecoveryCodeServiceImpl.kt", l = {13, 14}, m = "getRecoveryCode")
/* loaded from: classes4.dex */
public final class RecoveryCodeServiceImpl$getRecoveryCode$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecoveryCodeServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoveryCodeServiceImpl$getRecoveryCode$1(RecoveryCodeServiceImpl recoveryCodeServiceImpl, d<? super RecoveryCodeServiceImpl$getRecoveryCode$1> dVar) {
        super(dVar);
        this.this$0 = recoveryCodeServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRecoveryCode(null, this);
    }
}

package com.withings.library.authentication.updateaccount;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdateAccountServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl", f = "UpdateAccountServiceImpl.kt", l = {30}, m = "getAccountContext")
/* loaded from: classes4.dex */
public final class UpdateAccountServiceImpl$getAccountContext$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateAccountServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAccountServiceImpl$getAccountContext$1(UpdateAccountServiceImpl updateAccountServiceImpl, d<? super UpdateAccountServiceImpl$getAccountContext$1> dVar) {
        super(dVar);
        this.this$0 = updateAccountServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAccountContext(null, 0L, null, this);
    }
}

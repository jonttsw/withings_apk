package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedAccountCreationWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedAccountCreationWithRepo", f = "NeedAccountCreationWithRepo.kt", l = {32, 35, 39, 43, 48, 53, 58, 63, 68}, m = "createAccount")
/* loaded from: classes4.dex */
public final class NeedAccountCreationWithRepo$createAccount$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedAccountCreationWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedAccountCreationWithRepo$createAccount$1(NeedAccountCreationWithRepo needAccountCreationWithRepo, d<? super NeedAccountCreationWithRepo$createAccount$1> dVar) {
        super(dVar);
        this.this$0 = needAccountCreationWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createAccount(null, false, this);
    }
}

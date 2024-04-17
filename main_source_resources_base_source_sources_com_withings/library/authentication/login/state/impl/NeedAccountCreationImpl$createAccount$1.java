package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedAccountCreationImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedAccountCreationImpl", f = "NeedAccountCreationImpl.kt", l = {52, 62, 83}, m = "createAccount")
/* loaded from: classes4.dex */
public final class NeedAccountCreationImpl$createAccount$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedAccountCreationImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedAccountCreationImpl$createAccount$1(NeedAccountCreationImpl needAccountCreationImpl, d<? super NeedAccountCreationImpl$createAccount$1> dVar) {
        super(dVar);
        this.this$0 = needAccountCreationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createAccount(null, false, this);
    }
}

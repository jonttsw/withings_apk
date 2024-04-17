package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedAccountCreationMulti.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedAccountCreationMulti", f = "NeedAccountCreationMulti.kt", l = {28, 61, 64}, m = "createAccount")
/* loaded from: classes4.dex */
public final class NeedAccountCreationMulti$createAccount$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedAccountCreationMulti this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedAccountCreationMulti$createAccount$1(NeedAccountCreationMulti needAccountCreationMulti, d<? super NeedAccountCreationMulti$createAccount$1> dVar) {
        super(dVar);
        this.this$0 = needAccountCreationMulti;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createAccount(null, false, this);
    }
}

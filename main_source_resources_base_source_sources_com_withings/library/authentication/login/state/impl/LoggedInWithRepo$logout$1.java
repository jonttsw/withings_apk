package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedInWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.LoggedInWithRepo", f = "LoggedInWithRepo.kt", l = {30, 33, 37, 41, 45}, m = "logout")
/* loaded from: classes4.dex */
public final class LoggedInWithRepo$logout$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedInWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedInWithRepo$logout$1(LoggedInWithRepo loggedInWithRepo, d<? super LoggedInWithRepo$logout$1> dVar) {
        super(dVar);
        this.this$0 = loggedInWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logout(this);
    }
}

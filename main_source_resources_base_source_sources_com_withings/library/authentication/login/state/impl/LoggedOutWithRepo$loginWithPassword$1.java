package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedOutWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.LoggedOutWithRepo", f = "LoggedOutWithRepo.kt", l = {33, 36, 40, 44, 48, 52, 56, 60, 64, 67, 72}, m = "loginWithPassword")
/* loaded from: classes4.dex */
public final class LoggedOutWithRepo$loginWithPassword$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedOutWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedOutWithRepo$loginWithPassword$1(LoggedOutWithRepo loggedOutWithRepo, d<? super LoggedOutWithRepo$loginWithPassword$1> dVar) {
        super(dVar);
        this.this$0 = loggedOutWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginWithPassword(null, null, this);
    }
}

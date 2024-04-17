package com.withings.library.authentication.login.state.update;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedInUpdaterServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl", f = "LoggedInUpdaterServiceImpl.kt", l = {23, 34}, m = "updateLoggedInWithSession")
/* loaded from: classes4.dex */
public final class LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedInUpdaterServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1(LoggedInUpdaterServiceImpl loggedInUpdaterServiceImpl, d<? super LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1> dVar) {
        super(dVar);
        this.this$0 = loggedInUpdaterServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateLoggedInWithSession(null, this);
    }
}

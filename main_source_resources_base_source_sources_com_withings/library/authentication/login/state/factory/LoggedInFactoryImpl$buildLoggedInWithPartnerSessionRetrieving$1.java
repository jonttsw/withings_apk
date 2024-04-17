package com.withings.library.authentication.login.state.factory;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedInFactoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl", f = "LoggedInFactoryImpl.kt", l = {29}, m = "buildLoggedInWithPartnerSessionRetrieving")
/* loaded from: classes4.dex */
public final class LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedInFactoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1(LoggedInFactoryImpl loggedInFactoryImpl, d<? super LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1> dVar) {
        super(dVar);
        this.this$0 = loggedInFactoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buildLoggedInWithPartnerSessionRetrieving(null, this);
    }
}

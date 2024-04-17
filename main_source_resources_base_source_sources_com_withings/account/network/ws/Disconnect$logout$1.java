package com.withings.account.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Disconnect.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.Disconnect", f = "Disconnect.kt", l = {28, 33}, m = "logout")
/* loaded from: classes3.dex */
public final class Disconnect$logout$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Disconnect this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Disconnect$logout$1(Disconnect disconnect, d<? super Disconnect$logout$1> dVar) {
        super(dVar);
        this.this$0 = disconnect;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object logout;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        logout = this.this$0.logout(null, this);
        return logout;
    }
}

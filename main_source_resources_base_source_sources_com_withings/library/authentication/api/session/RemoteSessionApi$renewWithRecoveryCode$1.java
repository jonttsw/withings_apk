package com.withings.library.authentication.api.session;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteSessionApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.api.session.RemoteSessionApi", f = "RemoteSessionApi.kt", l = {103, 104}, m = "renewWithRecoveryCode")
/* loaded from: classes4.dex */
public final class RemoteSessionApi$renewWithRecoveryCode$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteSessionApi this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSessionApi$renewWithRecoveryCode$1(RemoteSessionApi remoteSessionApi, d<? super RemoteSessionApi$renewWithRecoveryCode$1> dVar) {
        super(dVar);
        this.this$0 = remoteSessionApi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.renewWithRecoveryCode(null, null, null, null, false, null, this);
    }
}

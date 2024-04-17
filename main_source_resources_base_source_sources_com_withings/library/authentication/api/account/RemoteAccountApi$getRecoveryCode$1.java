package com.withings.library.authentication.api.account;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteAccountApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.api.account.RemoteAccountApi", f = "RemoteAccountApi.kt", l = {450, ConstantsWs.HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS}, m = "getRecoveryCode")
/* loaded from: classes4.dex */
public final class RemoteAccountApi$getRecoveryCode$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteAccountApi this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteAccountApi$getRecoveryCode$1(RemoteAccountApi remoteAccountApi, d<? super RemoteAccountApi$getRecoveryCode$1> dVar) {
        super(dVar);
        this.this$0 = remoteAccountApi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRecoveryCode(null, null, this);
    }
}

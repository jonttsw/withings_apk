package com.withings.library.authentication.login.session.verify;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteSessionVerifier.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.session.verify.RemoteSessionVerifier", f = "RemoteSessionVerifier.kt", l = {24, 31}, m = "verifySession")
/* loaded from: classes4.dex */
public final class RemoteSessionVerifier$verifySession$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteSessionVerifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSessionVerifier$verifySession$1(RemoteSessionVerifier remoteSessionVerifier, d<? super RemoteSessionVerifier$verifySession$1> dVar) {
        super(dVar);
        this.this$0 = remoteSessionVerifier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.verifySession(null, null, this);
    }
}

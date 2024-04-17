package com.withings.library.authentication.login.session.multi;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteMultiSessionRetriever.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.session.multi.RemoteMultiSessionRetriever", f = "RemoteMultiSessionRetriever.kt", l = {44, 65, 71, 86}, m = "retrieve")
/* loaded from: classes4.dex */
public final class RemoteMultiSessionRetriever$retrieve$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteMultiSessionRetriever this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMultiSessionRetriever$retrieve$1(RemoteMultiSessionRetriever remoteMultiSessionRetriever, d<? super RemoteMultiSessionRetriever$retrieve$1> dVar) {
        super(dVar);
        this.this$0 = remoteMultiSessionRetriever;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieve(null, this);
    }
}

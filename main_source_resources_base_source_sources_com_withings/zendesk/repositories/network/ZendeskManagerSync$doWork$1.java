package com.withings.zendesk.repositories.network;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZendeskManagerSync.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.zendesk.repositories.network.ZendeskManagerSync", f = "ZendeskManagerSync.kt", l = {16}, m = "doWork")
/* loaded from: classes5.dex */
public final class ZendeskManagerSync$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ZendeskManagerSync this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskManagerSync$doWork$1(ZendeskManagerSync zendeskManagerSync, d<? super ZendeskManagerSync$doWork$1> dVar) {
        super(dVar);
        this.this$0 = zendeskManagerSync;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}

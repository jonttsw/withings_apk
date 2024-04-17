package com.withings.location.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendLocationVasistas.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.repository.ws.SendLocationVasistas", f = "SendLocationVasistas.kt", l = {34, 43, 46, 47, 48}, m = "invoke")
/* loaded from: classes4.dex */
public final class SendLocationVasistas$invoke$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendLocationVasistas this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendLocationVasistas$invoke$1(SendLocationVasistas sendLocationVasistas, d<? super SendLocationVasistas$invoke$1> dVar) {
        super(dVar);
        this.this$0 = sendLocationVasistas;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0L, null, this);
    }
}

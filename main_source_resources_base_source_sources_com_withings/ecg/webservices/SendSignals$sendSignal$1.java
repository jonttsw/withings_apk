package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendSignals.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.SendSignals", f = "SendSignals.kt", l = {82}, m = "sendSignal")
/* loaded from: classes3.dex */
public final class SendSignals$sendSignal$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendSignals this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSignals$sendSignal$1(SendSignals sendSignals, d<? super SendSignals$sendSignal$1> dVar) {
        super(dVar);
        this.this$0 = sendSignals;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object sendSignal;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendSignal = this.this$0.sendSignal(null, null, 0L, this);
        return sendSignal;
    }
}

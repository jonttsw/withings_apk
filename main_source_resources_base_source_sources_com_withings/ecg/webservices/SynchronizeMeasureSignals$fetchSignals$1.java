package com.withings.ecg.webservices;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SynchronizeMeasureSignals.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.SynchronizeMeasureSignals", f = "SynchronizeMeasureSignals.kt", l = {ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE}, m = "fetchSignals")
/* loaded from: classes3.dex */
public final class SynchronizeMeasureSignals$fetchSignals$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SynchronizeMeasureSignals this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeMeasureSignals$fetchSignals$1(SynchronizeMeasureSignals synchronizeMeasureSignals, d<? super SynchronizeMeasureSignals$fetchSignals$1> dVar) {
        super(dVar);
        this.this$0 = synchronizeMeasureSignals;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object fetchSignals;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchSignals = this.this$0.fetchSignals(null, this);
        return fetchSignals;
    }
}

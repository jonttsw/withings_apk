package com.withings.prediction.local.dao;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PredictionDao.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.prediction.local.dao.PredictionDao", f = "PredictionDao.kt", l = {24, 25}, m = "replaceAll$suspendImpl")
/* loaded from: classes4.dex */
public final class PredictionDao$replaceAll$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PredictionDao this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictionDao$replaceAll$1(PredictionDao predictionDao, d<? super PredictionDao$replaceAll$1> dVar) {
        super(dVar);
        this.this$0 = predictionDao;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PredictionDao.replaceAll$suspendImpl(this.this$0, null, this);
    }
}

package com.withings.prediction.remote.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetrofitRemotePredictionRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository", f = "RetrofitRemotePredictionRepository.kt", l = {24}, m = "get")
/* loaded from: classes4.dex */
public final class RetrofitRemotePredictionRepository$get$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetrofitRemotePredictionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRemotePredictionRepository$get$1(RetrofitRemotePredictionRepository retrofitRemotePredictionRepository, d<? super RetrofitRemotePredictionRepository$get$1> dVar) {
        super(dVar);
        this.this$0 = retrofitRemotePredictionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(0L, null, null, this);
    }
}

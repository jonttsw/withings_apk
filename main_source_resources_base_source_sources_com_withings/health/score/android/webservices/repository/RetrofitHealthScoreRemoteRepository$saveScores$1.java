package com.withings.health.score.android.webservices.repository;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.health.score.android.webservices.repository.RetrofitHealthScoreRemoteRepository", f = "RetrofitHealthScoreRemoteRepository.kt", l = {ConstantsWs.MEASURE_TYPE_NITRITES}, m = "saveScores")
/* loaded from: classes3.dex */
public final class RetrofitHealthScoreRemoteRepository$saveScores$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetrofitHealthScoreRemoteRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthScoreRemoteRepository$saveScores$1(RetrofitHealthScoreRemoteRepository retrofitHealthScoreRemoteRepository, d<? super RetrofitHealthScoreRemoteRepository$saveScores$1> dVar) {
        super(dVar);
        this.this$0 = retrofitHealthScoreRemoteRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saveScores(0L, null, this);
    }
}

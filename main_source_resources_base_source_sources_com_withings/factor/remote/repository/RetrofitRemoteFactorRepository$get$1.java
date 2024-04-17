package com.withings.factor.remote.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetrofitRemoteFactorRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.factor.remote.repository.RetrofitRemoteFactorRepository", f = "RetrofitRemoteFactorRepository.kt", l = {24}, m = "get")
/* loaded from: classes3.dex */
public final class RetrofitRemoteFactorRepository$get$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetrofitRemoteFactorRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRemoteFactorRepository$get$1(RetrofitRemoteFactorRepository retrofitRemoteFactorRepository, d<? super RetrofitRemoteFactorRepository$get$1> dVar) {
        super(dVar);
        this.this$0 = retrofitRemoteFactorRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(0L, null, this);
    }
}

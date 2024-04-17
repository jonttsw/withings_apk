package com.withings.factor.local.dao;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FactorDao.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.factor.local.dao.FactorDao", f = "FactorDao.kt", l = {24, 25}, m = "replaceAll$suspendImpl")
/* loaded from: classes3.dex */
public final class FactorDao$replaceAll$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FactorDao this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactorDao$replaceAll$1(FactorDao factorDao, d<? super FactorDao$replaceAll$1> dVar) {
        super(dVar);
        this.this$0 = factorDao;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FactorDao.replaceAll$suspendImpl(this.this$0, null, this);
    }
}

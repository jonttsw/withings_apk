package com.withings.library.healthscore;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthScoreServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.healthscore.HealthScoreServiceImpl", f = "HealthScoreServiceImpl.kt", l = {25}, m = "getScores")
/* loaded from: classes4.dex */
public final class HealthScoreServiceImpl$getScores$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthScoreServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthScoreServiceImpl$getScores$1(HealthScoreServiceImpl healthScoreServiceImpl, d<? super HealthScoreServiceImpl$getScores$1> dVar) {
        super(dVar);
        this.this$0 = healthScoreServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getScores(0L, 0L, this);
    }
}

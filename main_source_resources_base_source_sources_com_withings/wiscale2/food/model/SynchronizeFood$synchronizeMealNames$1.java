package com.withings.wiscale2.food.model;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SynchronizeFood.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.food.model.SynchronizeFood", f = "SynchronizeFood.kt", l = {50}, m = "synchronizeMealNames")
/* loaded from: classes5.dex */
public final class SynchronizeFood$synchronizeMealNames$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SynchronizeFood this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeFood$synchronizeMealNames$1(SynchronizeFood synchronizeFood, d<? super SynchronizeFood$synchronizeMealNames$1> dVar) {
        super(dVar);
        this.this$0 = synchronizeFood;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object synchronizeMealNames;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        synchronizeMealNames = this.this$0.synchronizeMealNames(this);
        return synchronizeMealNames;
    }
}

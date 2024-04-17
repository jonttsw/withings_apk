package com.withings.location.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SynchronizeLocationVasistas.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.repository.ws.SynchronizeLocationVasistas", f = "SynchronizeLocationVasistas.kt", l = {16, 20, 22}, m = "invoke")
/* loaded from: classes4.dex */
public final class SynchronizeLocationVasistas$invoke$1 extends c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SynchronizeLocationVasistas this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeLocationVasistas$invoke$1(SynchronizeLocationVasistas synchronizeLocationVasistas, d<? super SynchronizeLocationVasistas$invoke$1> dVar) {
        super(dVar);
        this.this$0 = synchronizeLocationVasistas;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0L, null, null, 0, this);
    }
}

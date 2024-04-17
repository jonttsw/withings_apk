package com.withings.location.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetLastLocationVasistas.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.repository.ws.GetLastLocationVasistas", f = "GetLastLocationVasistas.kt", l = {24, 29}, m = "invoke")
/* loaded from: classes4.dex */
public final class GetLastLocationVasistas$invoke$1 extends c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetLastLocationVasistas this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLastLocationVasistas$invoke$1(GetLastLocationVasistas getLastLocationVasistas, d<? super GetLastLocationVasistas$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getLastLocationVasistas;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0L, null, null, 0, this);
    }
}

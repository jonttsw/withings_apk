package com.withings.location.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetLastLocationVasistas.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.repository.ws.GetLocationVasistas", f = "GetLastLocationVasistas.kt", l = {65}, m = "insertLocationsFromWs")
/* loaded from: classes4.dex */
public final class GetLocationVasistas$insertLocationsFromWs$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetLocationVasistas this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLocationVasistas$insertLocationsFromWs$1(GetLocationVasistas getLocationVasistas, d<? super GetLocationVasistas$insertLocationsFromWs$1> dVar) {
        super(dVar);
        this.this$0 = getLocationVasistas;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object insertLocationsFromWs;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        insertLocationsFromWs = this.this$0.insertLocationsFromWs(0L, null, this);
        return insertLocationsFromWs;
    }
}

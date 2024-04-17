package com.withings.target;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SynchronizeTarget.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.SynchronizeTarget", f = "SynchronizeTarget.kt", l = {57, 58}, m = "saveUnsyncedWithApi")
/* loaded from: classes4.dex */
public final class SynchronizeTarget$saveUnsyncedWithApi$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SynchronizeTarget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeTarget$saveUnsyncedWithApi$1(SynchronizeTarget synchronizeTarget, d<? super SynchronizeTarget$saveUnsyncedWithApi$1> dVar) {
        super(dVar);
        this.this$0 = synchronizeTarget;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object saveUnsyncedWithApi;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        saveUnsyncedWithApi = this.this$0.saveUnsyncedWithApi(this);
        return saveUnsyncedWithApi;
    }
}

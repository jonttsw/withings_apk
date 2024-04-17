package com.withings.target;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SynchronizeTarget.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.SynchronizeTarget", f = "SynchronizeTarget.kt", l = {94, 103, 106}, m = "sendNewNotSyncedTargets")
/* loaded from: classes4.dex */
public final class SynchronizeTarget$sendNewNotSyncedTargets$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SynchronizeTarget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeTarget$sendNewNotSyncedTargets$1(SynchronizeTarget synchronizeTarget, d<? super SynchronizeTarget$sendNewNotSyncedTargets$1> dVar) {
        super(dVar);
        this.this$0 = synchronizeTarget;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object sendNewNotSyncedTargets;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendNewNotSyncedTargets = this.this$0.sendNewNotSyncedTargets(null, this);
        return sendNewNotSyncedTargets;
    }
}

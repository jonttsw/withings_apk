package com.withings.target.data;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalTargetRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.data.LocalTargetRepository", f = "LocalTargetRepository.kt", l = {ConstantsWs.WS_STATUS_USERCREATEERROR}, m = "updateHRTarget")
/* loaded from: classes4.dex */
public final class LocalTargetRepository$updateHRTarget$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$updateHRTarget$1(LocalTargetRepository localTargetRepository, d<? super LocalTargetRepository$updateHRTarget$1> dVar) {
        super(dVar);
        this.this$0 = localTargetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateHRTarget(null, this);
    }
}

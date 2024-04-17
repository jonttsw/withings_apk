package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedCode2FASensitiveActionWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo", f = "NeedCode2FASensitiveActionWithRepo.kt", l = {104, 107, 111, 115, 119, 124, ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY}, m = "injectRecoveryCode")
/* loaded from: classes4.dex */
public final class NeedCode2FASensitiveActionWithRepo$injectRecoveryCode$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedCode2FASensitiveActionWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedCode2FASensitiveActionWithRepo$injectRecoveryCode$1(NeedCode2FASensitiveActionWithRepo needCode2FASensitiveActionWithRepo, d<? super NeedCode2FASensitiveActionWithRepo$injectRecoveryCode$1> dVar) {
        super(dVar);
        this.this$0 = needCode2FASensitiveActionWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectRecoveryCode(null, false, this);
    }
}

package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailResultSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateWithRepo", f = "NeedMailResultSensitiveActionStateWithRepo.kt", l = {113, 116, 120, 124, 128, ConstantsWs.MEASURE_TYPE_PAUSE}, m = "resendMail")
/* loaded from: classes4.dex */
public final class NeedMailResultSensitiveActionStateWithRepo$resendMail$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailResultSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailResultSensitiveActionStateWithRepo$resendMail$1(NeedMailResultSensitiveActionStateWithRepo needMailResultSensitiveActionStateWithRepo, d<? super NeedMailResultSensitiveActionStateWithRepo$resendMail$1> dVar) {
        super(dVar);
        this.this$0 = needMailResultSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resendMail(this);
    }
}

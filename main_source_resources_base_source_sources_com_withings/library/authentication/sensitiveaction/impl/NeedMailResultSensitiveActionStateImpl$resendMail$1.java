package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailResultSensitiveActionStateImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl", f = "NeedMailResultSensitiveActionStateImpl.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT}, m = "resendMail")
/* loaded from: classes4.dex */
public final class NeedMailResultSensitiveActionStateImpl$resendMail$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailResultSensitiveActionStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailResultSensitiveActionStateImpl$resendMail$1(NeedMailResultSensitiveActionStateImpl needMailResultSensitiveActionStateImpl, d<? super NeedMailResultSensitiveActionStateImpl$resendMail$1> dVar) {
        super(dVar);
        this.this$0 = needMailResultSensitiveActionStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resendMail(this);
    }
}

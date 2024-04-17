package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedCode2FASensitiveActionImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl", f = "NeedCode2FASensitiveActionImpl.kt", l = {ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING, 187}, m = "injectRecoveryCode")
/* loaded from: classes4.dex */
public final class NeedCode2FASensitiveActionImpl$injectRecoveryCode$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedCode2FASensitiveActionImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedCode2FASensitiveActionImpl$injectRecoveryCode$1(NeedCode2FASensitiveActionImpl needCode2FASensitiveActionImpl, d<? super NeedCode2FASensitiveActionImpl$injectRecoveryCode$1> dVar) {
        super(dVar);
        this.this$0 = needCode2FASensitiveActionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectRecoveryCode(null, false, this);
    }
}

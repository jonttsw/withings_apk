package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedCode2FAImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedCode2FAImpl", f = "NeedCode2FAImpl.kt", l = {ConstantsWs.MEASURE_TYPE_VHD_RESULT, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION}, m = "resendSMS")
/* loaded from: classes4.dex */
public final class NeedCode2FAImpl$resendSMS$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedCode2FAImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedCode2FAImpl$resendSMS$1(NeedCode2FAImpl needCode2FAImpl, d<? super NeedCode2FAImpl$resendSMS$1> dVar) {
        super(dVar);
        this.this$0 = needCode2FAImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resendSMS(this);
    }
}

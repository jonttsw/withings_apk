package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailResultImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedMailResultImpl", f = "NeedMailResultImpl.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT}, m = "resendMail")
/* loaded from: classes4.dex */
public final class NeedMailResultImpl$resendMail$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailResultImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailResultImpl$resendMail$1(NeedMailResultImpl needMailResultImpl, d<? super NeedMailResultImpl$resendMail$1> dVar) {
        super(dVar);
        this.this$0 = needMailResultImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resendMail(this);
    }
}

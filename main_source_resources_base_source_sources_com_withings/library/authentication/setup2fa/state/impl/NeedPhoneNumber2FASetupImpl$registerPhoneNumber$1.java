package com.withings.library.authentication.setup2fa.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedPhoneNumber2FASetupImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl", f = "NeedPhoneNumber2FASetupImpl.kt", l = {33}, m = "registerPhoneNumber")
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedPhoneNumber2FASetupImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1(NeedPhoneNumber2FASetupImpl needPhoneNumber2FASetupImpl, d<? super NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1> dVar) {
        super(dVar);
        this.this$0 = needPhoneNumber2FASetupImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerPhoneNumber(null, this);
    }
}

package com.withings.library.authentication.setup2fa.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Registered2FASetupImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl", f = "Registered2FASetupImpl.kt", l = {27}, m = "remove2FA")
/* loaded from: classes4.dex */
public final class Registered2FASetupImpl$remove2FA$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Registered2FASetupImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Registered2FASetupImpl$remove2FA$1(Registered2FASetupImpl registered2FASetupImpl, d<? super Registered2FASetupImpl$remove2FA$1> dVar) {
        super(dVar);
        this.this$0 = registered2FASetupImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.remove2FA(this);
    }
}

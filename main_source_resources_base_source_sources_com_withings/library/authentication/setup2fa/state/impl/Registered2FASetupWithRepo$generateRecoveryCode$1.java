package com.withings.library.authentication.setup2fa.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Registered2FASetupWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo", f = "Registered2FASetupWithRepo.kt", l = {98, 102, 107, 112, 118, 124}, m = "generateRecoveryCode")
/* loaded from: classes4.dex */
public final class Registered2FASetupWithRepo$generateRecoveryCode$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Registered2FASetupWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Registered2FASetupWithRepo$generateRecoveryCode$1(Registered2FASetupWithRepo registered2FASetupWithRepo, d<? super Registered2FASetupWithRepo$generateRecoveryCode$1> dVar) {
        super(dVar);
        this.this$0 = registered2FASetupWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.generateRecoveryCode(this);
    }
}

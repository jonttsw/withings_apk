package com.withings.library.authentication.setup2fa.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedCode2FASetupWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupWithRepo", f = "NeedCode2FASetupWithRepo.kt", l = {108, 111}, m = "changePhoneNumber")
/* loaded from: classes4.dex */
public final class NeedCode2FASetupWithRepo$changePhoneNumber$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedCode2FASetupWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedCode2FASetupWithRepo$changePhoneNumber$1(NeedCode2FASetupWithRepo needCode2FASetupWithRepo, d<? super NeedCode2FASetupWithRepo$changePhoneNumber$1> dVar) {
        super(dVar);
        this.this$0 = needCode2FASetupWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.changePhoneNumber(this);
    }
}

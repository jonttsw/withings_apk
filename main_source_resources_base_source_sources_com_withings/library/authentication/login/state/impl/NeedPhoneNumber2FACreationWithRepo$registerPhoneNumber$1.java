package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedPhoneNumber2FACreationWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationWithRepo", f = "NeedPhoneNumber2FACreationWithRepo.kt", l = {25, 29, 33, 37, 42, 46}, m = "registerPhoneNumber")
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FACreationWithRepo$registerPhoneNumber$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedPhoneNumber2FACreationWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedPhoneNumber2FACreationWithRepo$registerPhoneNumber$1(NeedPhoneNumber2FACreationWithRepo needPhoneNumber2FACreationWithRepo, d<? super NeedPhoneNumber2FACreationWithRepo$registerPhoneNumber$1> dVar) {
        super(dVar);
        this.this$0 = needPhoneNumber2FACreationWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerPhoneNumber(null, this);
    }
}

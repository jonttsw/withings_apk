package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedPhoneNumberSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateWithRepo", f = "NeedPhoneNumberSensitiveActionStateWithRepo.kt", l = {19, 22, 26, 30, 34, 39}, m = "registerPhoneNumber")
/* loaded from: classes4.dex */
public final class NeedPhoneNumberSensitiveActionStateWithRepo$registerPhoneNumber$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedPhoneNumberSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedPhoneNumberSensitiveActionStateWithRepo$registerPhoneNumber$1(NeedPhoneNumberSensitiveActionStateWithRepo needPhoneNumberSensitiveActionStateWithRepo, d<? super NeedPhoneNumberSensitiveActionStateWithRepo$registerPhoneNumber$1> dVar) {
        super(dVar);
        this.this$0 = needPhoneNumberSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerPhoneNumber(null, this);
    }
}

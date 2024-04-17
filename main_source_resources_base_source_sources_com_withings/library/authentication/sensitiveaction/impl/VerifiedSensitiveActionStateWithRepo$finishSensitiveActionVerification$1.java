package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerifiedSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo", f = "VerifiedSensitiveActionStateWithRepo.kt", l = {18, 19}, m = "finishSensitiveActionVerification")
/* loaded from: classes4.dex */
public final class VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VerifiedSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1(VerifiedSensitiveActionStateWithRepo verifiedSensitiveActionStateWithRepo, d<? super VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1> dVar) {
        super(dVar);
        this.this$0 = verifiedSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.finishSensitiveActionVerification(this);
    }
}

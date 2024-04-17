package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailResultSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateWithRepo", f = "NeedMailResultSensitiveActionStateWithRepo.kt", l = {70, 73, 77, 81, 85, 89, 93, 97, 102, 107}, m = "injectJWTToken")
/* loaded from: classes4.dex */
public final class NeedMailResultSensitiveActionStateWithRepo$injectJWTToken$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailResultSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailResultSensitiveActionStateWithRepo$injectJWTToken$1(NeedMailResultSensitiveActionStateWithRepo needMailResultSensitiveActionStateWithRepo, d<? super NeedMailResultSensitiveActionStateWithRepo$injectJWTToken$1> dVar) {
        super(dVar);
        this.this$0 = needMailResultSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectJWTToken(null, this);
    }
}

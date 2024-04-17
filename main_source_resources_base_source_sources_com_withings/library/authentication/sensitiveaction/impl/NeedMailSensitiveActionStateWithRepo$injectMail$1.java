package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedMailSensitiveActionStateWithRepo", f = "NeedMailSensitiveActionStateWithRepo.kt", l = {19, 22, 26, 30, 34}, m = "injectMail")
/* loaded from: classes4.dex */
public final class NeedMailSensitiveActionStateWithRepo$injectMail$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailSensitiveActionStateWithRepo$injectMail$1(NeedMailSensitiveActionStateWithRepo needMailSensitiveActionStateWithRepo, d<? super NeedMailSensitiveActionStateWithRepo$injectMail$1> dVar) {
        super(dVar);
        this.this$0 = needMailSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectMail(null, this);
    }
}

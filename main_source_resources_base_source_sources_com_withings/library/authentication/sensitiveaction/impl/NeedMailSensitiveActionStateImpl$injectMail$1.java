package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailSensitiveActionStateImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedMailSensitiveActionStateImpl", f = "NeedMailSensitiveActionStateImpl.kt", l = {31, 44}, m = "injectMail")
/* loaded from: classes4.dex */
public final class NeedMailSensitiveActionStateImpl$injectMail$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailSensitiveActionStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailSensitiveActionStateImpl$injectMail$1(NeedMailSensitiveActionStateImpl needMailSensitiveActionStateImpl, d<? super NeedMailSensitiveActionStateImpl$injectMail$1> dVar) {
        super(dVar);
        this.this$0 = needMailSensitiveActionStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectMail(null, this);
    }
}

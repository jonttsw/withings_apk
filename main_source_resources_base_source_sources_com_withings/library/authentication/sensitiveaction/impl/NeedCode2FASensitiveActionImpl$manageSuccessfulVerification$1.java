package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedCode2FASensitiveActionImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl", f = "NeedCode2FASensitiveActionImpl.kt", l = {114}, m = "manageSuccessfulVerification")
/* loaded from: classes4.dex */
public final class NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedCode2FASensitiveActionImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1(NeedCode2FASensitiveActionImpl needCode2FASensitiveActionImpl, d<? super NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1> dVar) {
        super(dVar);
        this.this$0 = needCode2FASensitiveActionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object manageSuccessfulVerification;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        manageSuccessfulVerification = this.this$0.manageSuccessfulVerification(this);
        return manageSuccessfulVerification;
    }
}

package com.withings.library.authentication.sensitiveaction;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SensitiveActionServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.SensitiveActionServiceImpl", f = "SensitiveActionServiceImpl.kt", l = {25}, m = "initiationSensitiveActionSequence")
/* loaded from: classes4.dex */
public final class SensitiveActionServiceImpl$initiationSensitiveActionSequence$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SensitiveActionServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SensitiveActionServiceImpl$initiationSensitiveActionSequence$1(SensitiveActionServiceImpl sensitiveActionServiceImpl, d<? super SensitiveActionServiceImpl$initiationSensitiveActionSequence$1> dVar) {
        super(dVar);
        this.this$0 = sensitiveActionServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initiationSensitiveActionSequence(this);
    }
}

package com.withings.library.authentication.sensitiveaction;

import com.withings.library.authentication.sensitiveaction.state.SensitiveActionState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SensitiveActionServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.SensitiveActionServiceImpl", f = "SensitiveActionServiceImpl.kt", l = {18}, m = "pushNewState")
/* loaded from: classes4.dex */
public final class SensitiveActionServiceImpl$pushNewState$1<T extends SensitiveActionState> extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SensitiveActionServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SensitiveActionServiceImpl$pushNewState$1(SensitiveActionServiceImpl sensitiveActionServiceImpl, d<? super SensitiveActionServiceImpl$pushNewState$1> dVar) {
        super(dVar);
        this.this$0 = sensitiveActionServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pushNewState(null, this);
    }
}

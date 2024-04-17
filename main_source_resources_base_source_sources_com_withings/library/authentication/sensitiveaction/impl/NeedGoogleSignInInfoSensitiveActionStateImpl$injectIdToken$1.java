package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl", f = "NeedGoogleSignInInfoSensitiveActionStateImpl.kt", l = {50, 65, 66, 71}, m = "injectIdToken")
/* loaded from: classes4.dex */
public final class NeedGoogleSignInInfoSensitiveActionStateImpl$injectIdToken$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedGoogleSignInInfoSensitiveActionStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedGoogleSignInInfoSensitiveActionStateImpl$injectIdToken$1(NeedGoogleSignInInfoSensitiveActionStateImpl needGoogleSignInInfoSensitiveActionStateImpl, d<? super NeedGoogleSignInInfoSensitiveActionStateImpl$injectIdToken$1> dVar) {
        super(dVar);
        this.this$0 = needGoogleSignInInfoSensitiveActionStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectIdToken(null, null, this);
    }
}

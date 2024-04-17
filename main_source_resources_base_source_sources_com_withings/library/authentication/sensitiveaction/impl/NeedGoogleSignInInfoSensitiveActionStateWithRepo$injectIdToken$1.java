package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateWithRepo", f = "NeedGoogleSignInInfoSensitiveActionStateWithRepo.kt", l = {28, 31, 35, 39, 43, 47, 51, 55, 60}, m = "injectIdToken")
/* loaded from: classes4.dex */
public final class NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectIdToken$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedGoogleSignInInfoSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectIdToken$1(NeedGoogleSignInInfoSensitiveActionStateWithRepo needGoogleSignInInfoSensitiveActionStateWithRepo, d<? super NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectIdToken$1> dVar) {
        super(dVar);
        this.this$0 = needGoogleSignInInfoSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectIdToken(null, null, this);
    }
}

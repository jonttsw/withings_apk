package com.withings.library.authentication.sensitiveaction.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateWithRepo", f = "NeedGoogleSignInInfoSensitiveActionStateWithRepo.kt", l = {70, 73, 77, 81, 85, 89, 93, 97, 102}, m = "injectProviderCodeWithIdToken")
/* loaded from: classes4.dex */
public final class NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectProviderCodeWithIdToken$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedGoogleSignInInfoSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectProviderCodeWithIdToken$1(NeedGoogleSignInInfoSensitiveActionStateWithRepo needGoogleSignInInfoSensitiveActionStateWithRepo, d<? super NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectProviderCodeWithIdToken$1> dVar) {
        super(dVar);
        this.this$0 = needGoogleSignInInfoSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectProviderCodeWithIdToken(null, null, this);
    }
}

package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateWithRepo", f = "NeedGoogleSignInInfoSensitiveActionStateWithRepo.kt", l = {112, 115, 119, 123, 127, ConstantsWs.MEASURE_TYPE_VHD_RESULT, 135, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX}, m = "injectProviderCodeWithProviderCode")
/* loaded from: classes4.dex */
public final class NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectProviderCodeWithProviderCode$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedGoogleSignInInfoSensitiveActionStateWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectProviderCodeWithProviderCode$1(NeedGoogleSignInInfoSensitiveActionStateWithRepo needGoogleSignInInfoSensitiveActionStateWithRepo, d<? super NeedGoogleSignInInfoSensitiveActionStateWithRepo$injectProviderCodeWithProviderCode$1> dVar) {
        super(dVar);
        this.this$0 = needGoogleSignInInfoSensitiveActionStateWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectProviderCodeWithProviderCode(null, null, this);
    }
}

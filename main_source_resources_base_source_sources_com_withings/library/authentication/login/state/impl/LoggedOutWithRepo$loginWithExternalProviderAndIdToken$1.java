package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedOutWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.LoggedOutWithRepo", f = "LoggedOutWithRepo.kt", l = {ConstantsWs.MEASURE_TYPE_PAUSE, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN, ConstantsWs.MEASURE_TYPE_PH, ConstantsWs.MEASURE_TYPE_NITRITES, ConstantsWs.MEASURE_TYPE_VASCULAR_AGE, ConstantsWs.MEASURE_TYPE_NHS_RIGHT_FOOT, ConstantsWs.MEASURE_TYPE_HR_ECG, ConstantsWs.MEASURE_TYPE_NHS_FEET, ConstantsWs.MEASURE_TYPE_VASISTAS_WALKING_DOUBLE_SUPPORT, ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT}, m = "loginWithExternalProviderAndIdToken")
/* loaded from: classes4.dex */
public final class LoggedOutWithRepo$loginWithExternalProviderAndIdToken$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedOutWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedOutWithRepo$loginWithExternalProviderAndIdToken$1(LoggedOutWithRepo loggedOutWithRepo, d<? super LoggedOutWithRepo$loginWithExternalProviderAndIdToken$1> dVar) {
        super(dVar);
        this.this$0 = loggedOutWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginWithExternalProviderAndIdToken(null, null, null, this);
    }
}

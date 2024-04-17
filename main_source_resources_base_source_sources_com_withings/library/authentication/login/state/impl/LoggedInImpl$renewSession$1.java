package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedInImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.LoggedInImpl", f = "LoggedInImpl.kt", l = {ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY, ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT, ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT, ConstantsWs.MEASURE_TYPE_HR_BCGIPG}, m = "renewSession")
/* loaded from: classes4.dex */
public final class LoggedInImpl$renewSession$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggedInImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedInImpl$renewSession$1(LoggedInImpl loggedInImpl, d<? super LoggedInImpl$renewSession$1> dVar) {
        super(dVar);
        this.this$0 = loggedInImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.renewSession(null, this);
    }
}

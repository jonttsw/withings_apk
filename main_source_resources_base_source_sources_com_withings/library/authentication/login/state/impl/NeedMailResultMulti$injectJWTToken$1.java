package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailResultMulti.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedMailResultMulti", f = "NeedMailResultMulti.kt", l = {106, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION}, m = "injectJWTToken")
/* loaded from: classes4.dex */
public final class NeedMailResultMulti$injectJWTToken$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailResultMulti this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailResultMulti$injectJWTToken$1(NeedMailResultMulti needMailResultMulti, d<? super NeedMailResultMulti$injectJWTToken$1> dVar) {
        super(dVar);
        this.this$0 = needMailResultMulti;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectJWTToken(null, this);
    }
}

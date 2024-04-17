package com.withings.library.authentication.api.auth;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteAuthApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.api.auth.RemoteAuthApi", f = "RemoteAuthApi.kt", l = {ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2, ConstantsWs.MEASURE_TYPE_PH}, m = "loginWithClearPassword")
/* loaded from: classes4.dex */
public final class RemoteAuthApi$loginWithClearPassword$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteAuthApi this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteAuthApi$loginWithClearPassword$1(RemoteAuthApi remoteAuthApi, d<? super RemoteAuthApi$loginWithClearPassword$1> dVar) {
        super(dVar);
        this.this$0 = remoteAuthApi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginWithClearPassword(null, null, null, null, null, this);
    }
}

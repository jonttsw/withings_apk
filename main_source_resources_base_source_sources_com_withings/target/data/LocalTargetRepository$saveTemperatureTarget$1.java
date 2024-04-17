package com.withings.target.data;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalTargetRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.data.LocalTargetRepository", f = "LocalTargetRepository.kt", l = {435, ConstantsWs.HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS}, m = "saveTemperatureTarget")
/* loaded from: classes4.dex */
public final class LocalTargetRepository$saveTemperatureTarget$1 extends c {
    double D$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$saveTemperatureTarget$1(LocalTargetRepository localTargetRepository, d<? super LocalTargetRepository$saveTemperatureTarget$1> dVar) {
        super(dVar);
        this.this$0 = localTargetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saveTemperatureTarget(0L, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this);
    }
}

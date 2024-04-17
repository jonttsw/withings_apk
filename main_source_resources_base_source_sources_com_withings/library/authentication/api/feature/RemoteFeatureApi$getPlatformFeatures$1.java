package com.withings.library.authentication.api.feature;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteFeatureApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.api.feature.RemoteFeatureApi", f = "RemoteFeatureApi.kt", l = {30, 31}, m = "getPlatformFeatures")
/* loaded from: classes4.dex */
public final class RemoteFeatureApi$getPlatformFeatures$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteFeatureApi this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteFeatureApi$getPlatformFeatures$1(RemoteFeatureApi remoteFeatureApi, d<? super RemoteFeatureApi$getPlatformFeatures$1> dVar) {
        super(dVar);
        this.this$0 = remoteFeatureApi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPlatformFeatures(null, this);
    }
}

package com.withings.sdk.wilife.data.update.remote;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteUpdateService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.sdk.wilife.data.update.remote.RemoteUpdateService", f = "RemoteUpdateService.kt", l = {27}, m = "isUpdateAvailable")
/* loaded from: classes4.dex */
public final class RemoteUpdateService$isUpdateAvailable$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteUpdateService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteUpdateService$isUpdateAvailable$1(RemoteUpdateService remoteUpdateService, d<? super RemoteUpdateService$isUpdateAvailable$1> dVar) {
        super(dVar);
        this.this$0 = remoteUpdateService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isUpdateAvailable(null, this);
    }
}

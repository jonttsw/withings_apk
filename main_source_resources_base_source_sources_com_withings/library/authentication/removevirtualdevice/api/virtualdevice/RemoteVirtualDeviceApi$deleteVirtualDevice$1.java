package com.withings.library.authentication.removevirtualdevice.api.virtualdevice;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteVirtualDeviceApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi", f = "RemoteVirtualDeviceApi.kt", l = {52, 53}, m = "deleteVirtualDevice")
/* loaded from: classes4.dex */
public final class RemoteVirtualDeviceApi$deleteVirtualDevice$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteVirtualDeviceApi this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteVirtualDeviceApi$deleteVirtualDevice$1(RemoteVirtualDeviceApi remoteVirtualDeviceApi, d<? super RemoteVirtualDeviceApi$deleteVirtualDevice$1> dVar) {
        super(dVar);
        this.this$0 = remoteVirtualDeviceApi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteVirtualDevice(null, null, null, null, null, null, null, null, null, this);
    }
}

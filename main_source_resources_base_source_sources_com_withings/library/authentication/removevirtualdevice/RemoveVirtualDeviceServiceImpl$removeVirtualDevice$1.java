package com.withings.library.authentication.removevirtualdevice;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoveVirtualDeviceServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl", f = "RemoveVirtualDeviceServiceImpl.kt", l = {20}, m = "removeVirtualDevice")
/* loaded from: classes4.dex */
public final class RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoveVirtualDeviceServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1(RemoveVirtualDeviceServiceImpl removeVirtualDeviceServiceImpl, d<? super RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1> dVar) {
        super(dVar);
        this.this$0 = removeVirtualDeviceServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeVirtualDevice(null, this);
    }
}

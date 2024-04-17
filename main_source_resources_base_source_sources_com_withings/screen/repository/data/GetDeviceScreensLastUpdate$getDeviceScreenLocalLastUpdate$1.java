package com.withings.screen.repository.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetDeviceScreensLastUpdate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.repository.data.GetDeviceScreensLastUpdate", f = "GetDeviceScreensLastUpdate.kt", l = {14}, m = "getDeviceScreenLocalLastUpdate")
/* loaded from: classes4.dex */
public final class GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetDeviceScreensLastUpdate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1(GetDeviceScreensLastUpdate getDeviceScreensLastUpdate, d<? super GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1> dVar) {
        super(dVar);
        this.this$0 = getDeviceScreensLastUpdate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getDeviceScreenLocalLastUpdate(0L, this);
    }
}

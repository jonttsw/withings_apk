package com.withings.screen.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetDeviceScreens.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.repository.ws.GetDeviceScreens", f = "GetDeviceScreens.kt", l = {47, 48, 55, 56}, m = "storeDeviceScreensAndContents")
/* loaded from: classes4.dex */
public final class GetDeviceScreens$storeDeviceScreensAndContents$1 extends c {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetDeviceScreens this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceScreens$storeDeviceScreensAndContents$1(GetDeviceScreens getDeviceScreens, d<? super GetDeviceScreens$storeDeviceScreensAndContents$1> dVar) {
        super(dVar);
        this.this$0 = getDeviceScreens;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object storeDeviceScreensAndContents;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        storeDeviceScreensAndContents = this.this$0.storeDeviceScreensAndContents(0L, 0L, null, this);
        return storeDeviceScreensAndContents;
    }
}

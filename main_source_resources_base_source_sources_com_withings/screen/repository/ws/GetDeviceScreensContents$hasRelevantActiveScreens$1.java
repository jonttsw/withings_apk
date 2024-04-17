package com.withings.screen.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetDeviceScreensContents.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.repository.ws.GetDeviceScreensContents", f = "GetDeviceScreensContents.kt", l = {41}, m = "hasRelevantActiveScreens")
/* loaded from: classes4.dex */
public final class GetDeviceScreensContents$hasRelevantActiveScreens$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetDeviceScreensContents this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceScreensContents$hasRelevantActiveScreens$1(GetDeviceScreensContents getDeviceScreensContents, d<? super GetDeviceScreensContents$hasRelevantActiveScreens$1> dVar) {
        super(dVar);
        this.this$0 = getDeviceScreensContents;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object hasRelevantActiveScreens;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        hasRelevantActiveScreens = this.this$0.hasRelevantActiveScreens(0L, this);
        return hasRelevantActiveScreens;
    }
}
